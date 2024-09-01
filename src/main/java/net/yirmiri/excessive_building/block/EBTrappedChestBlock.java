package net.yirmiri.excessive_building.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.stat.Stat;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.BlockView;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.block.entity.EBTrappedChestBlockEntity;

import java.util.function.Supplier;

public class EBTrappedChestBlock extends EBChestBlock {
    public EBTrappedChestBlock(Settings settings, WoodType type, Supplier<BlockEntityType<? extends ChestBlockEntity>> supplier) {
        super(settings, type, supplier);
    }

    protected Stat<Identifier> getOpenStat() {
        return Stats.CUSTOM.getOrCreateStat(Stats.TRIGGER_TRAPPED_CHEST);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new EBTrappedChestBlockEntity(pos, state);
    }

//    @Override
//    public boolean isEnabled(FeatureSet enable) {
//        return EBConfig.ENABLE_CHEST_VARIANTS.get();
//    }

    protected boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    protected int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return MathHelper.clamp(ChestBlockEntity.getPlayersLookingInChestCount(world, pos), 0, 15);
    }

    protected int getStrongRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return direction == Direction.UP ? state.getWeakRedstonePower(world, pos, direction) : 0;
    }
}
