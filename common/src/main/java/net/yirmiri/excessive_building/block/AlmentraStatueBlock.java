package net.yirmiri.excessive_building.block;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.RotationSegment;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.yirmiri.excessive_building.EBConfig;
import org.jetbrains.annotations.Nullable;

public class AlmentraStatueBlock extends Block implements Waterloggable {
    private static final int MAX_ROTATIONS = 15;
    public static final IntProperty ROTATION = IntProperty.of("rotation", 0, MAX_ROTATIONS);
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    private static final VoxelShape SHAPE = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(2, 0, 2, 14, 2, 14),
            Block.createCuboidShape(6, 2, 6, 10, 6, 10), BooleanBiFunction.OR);

    public AlmentraStatueBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(ROTATION, 0).with(WATERLOGGED, false));
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_DECORATIVES.get();
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        return SHAPE;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(BlockPlaceContext ctx) {
        return this.defaultBlockState().hasProperty(ROTATION, Integer.valueOf(RotationSegment.convertToSegment(ctx.getPlayerYaw())))
                .with(WATERLOGGED, ctx.getLevel().getFluidState(ctx.getBlockPos()).isOf(Fluids.WATER));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED, ROTATION);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    /*
    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.hasProperty(ROTATION, Integer.valueOf(rotation.rotate(state.getValue(ROTATION), MAX_ROTATIONS)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.hasProperty(ROTATION, Integer.valueOf(mirror.mirror(state.getValue(ROTATION), MAX_ROTATIONS)));
    }

     */

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor world, BlockPos pos, BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            world.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }

        return super.updateShape(state, direction, neighborState, world, pos, neighborPos);
    }
}
