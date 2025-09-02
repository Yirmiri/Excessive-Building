package net.yirmiri.excessive_building.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GrowingPlantBodyBlock;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.yirmiri.excessive_building.core.registry.EBBlocks;

public class AncientVinesPlantBlock extends GrowingPlantBodyBlock {
    public static final VoxelShape SHAPE = Block.box(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
    public static final BooleanProperty TOP = BooleanProperty.create("top");

    public AncientVinesPlantBlock(BlockBehaviour.Properties properties) {
        super(properties, Direction.DOWN, SHAPE, false);
        this.registerDefaultState(this.stateDefinition.any().setValue(TOP, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(TOP);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor level, BlockPos currentPos, BlockPos facingPos) {
        BlockState updated = super.updateShape(state, facing, facingState, level, currentPos, facingPos);

        if (updated.getBlock() == this) {
            boolean isTop = !level.getBlockState(currentPos.above()).is(this)
                    && level.getBlockState(currentPos.above()).getBlock() != getBodyBlock();
            updated = updated.setValue(TOP, isTop);
        }
        return updated;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        LevelAccessor level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        return this.defaultBlockState().setValue(TOP, !level.getBlockState(pos.above()).is(this) && level.getBlockState(pos.above()).getBlock() != getBodyBlock());
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (state.getBlock() == this) {
            boolean isTop = !level.getBlockState(pos.above()).is(this) && level.getBlockState(pos.above()).getBlock() != getBodyBlock();
            if (state.getValue(TOP) != isTop) {
                level.setBlock(pos, state.setValue(TOP, isTop), 2);
            }
        }
        super.randomTick(state, level, pos, random);
    }

    protected GrowingPlantHeadBlock getHeadBlock() {
        return (GrowingPlantHeadBlock) EBBlocks.ANCIENT_VINES.get();
    }
}
