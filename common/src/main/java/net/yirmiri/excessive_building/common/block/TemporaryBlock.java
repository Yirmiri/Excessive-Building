package net.yirmiri.excessive_building.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FrostedIceBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import org.jetbrains.annotations.Nullable;

public class TemporaryBlock extends FrostedIceBlock {
    public static final int MAX_AGE = 3;
    private static final int NEIGHBORS_TO_AGE = 4;
    private static final int NEIGHBORS_TO_MELT = 2;
    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;

    public TemporaryBlock(Properties properties) {
        super(properties);
    }

    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        this.tick(state, level, pos, random);
        if (level.getBrightness(LightLayer.BLOCK, pos) > 11 - state.getLightBlock(level, pos)) {
            this.melt(state, level, pos);
        }
    }

    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if ((random.nextInt(3) == 0 || this.fewerNeigboursThan(level, pos, 4)) && level.getMaxLocalRawBrightness(pos) > 11 - (Integer)state.getValue(AGE) - state.getLightBlock(level, pos) && this.slightlyMelt(state, level, pos)) {
            BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
            Direction[] var6 = Direction.values();
            int var7 = var6.length;

            for(int var8 = 0; var8 < var7; ++var8) {
                Direction direction = var6[var8];
                blockpos$mutableblockpos.setWithOffset(pos, direction);
                BlockState blockstate = level.getBlockState(blockpos$mutableblockpos);
                if (blockstate.is(this) && !this.slightlyMelt(blockstate, level, blockpos$mutableblockpos)) {
                    level.scheduleTick(blockpos$mutableblockpos, this, Mth.nextInt(random, 20, 40));
                }
            }
        } else {
            level.scheduleTick(pos, this, Mth.nextInt(random, 20, 40));
        }

    }

    private boolean slightlyMelt(BlockState state, Level level, BlockPos pos) {
        int i = (Integer)state.getValue(AGE);
        if (i < 3) {
            level.setBlock(pos, (BlockState)state.setValue(AGE, i + 1), 2);
            return false;
        } else {
            this.melt(state, level, pos);
            return true;
        }
    }

    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (block.defaultBlockState().is(this) && this.fewerNeigboursThan(level, pos, 2)) {
            this.melt(state, level, pos);
        }

        super.neighborChanged(state, level, pos, block, fromPos, isMoving);
    }

    private boolean fewerNeigboursThan(BlockGetter level, BlockPos pos, int neighborsRequired) {
        int i = 0;
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
        Direction[] var6 = Direction.values();
        int var7 = var6.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            Direction direction = var6[var8];
            blockpos$mutableblockpos.setWithOffset(pos, direction);
            if (level.getBlockState(blockpos$mutableblockpos).is(this)) {
                ++i;
                if (i >= neighborsRequired) {
                    return false;
                }
            }
        }

        return true;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    public ItemStack getCloneItemStack(BlockGetter level, BlockPos pos, BlockState state) {
        return ItemStack.EMPTY;
    }

    public static BlockState meltsInto() {
        return Blocks.AIR.defaultBlockState();
    }

    public void playerDestroy(Level level, Player player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack tool) {
        super.playerDestroy(level, player, pos, state, blockEntity, tool);
        if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, tool) == 0) {
            if (level.dimensionType().ultraWarm()) {
                level.removeBlock(pos, false);
                return;
            }

            BlockState blockState = level.getBlockState(pos.below());
            if (blockState.blocksMotion() || blockState.liquid()) {
                level.setBlockAndUpdate(pos, meltsInto());
            }
        }

    }

    protected void melt(BlockState state, Level level, BlockPos pos) {
        if (level.dimensionType().ultraWarm()) {
            level.removeBlock(pos, false);
        } else {
            level.setBlockAndUpdate(pos, meltsInto());
            level.neighborChanged(pos, meltsInto().getBlock(), pos);
        }
    }
}
