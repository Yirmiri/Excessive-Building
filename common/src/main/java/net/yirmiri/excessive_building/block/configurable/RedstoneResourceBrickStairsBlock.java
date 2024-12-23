package net.yirmiri.excessive_building.block.configurable;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;

public class RedstoneResourceBrickStairsBlock extends ResourceBrickStairsBlock {
    public RedstoneResourceBrickStairsBlock(BlockState baseBlockState, Properties settings) {
        super(baseBlockState, settings);
    }

    @Override
    protected boolean isSignalSource(BlockState state) {
        return true;
    }

    @Override
    protected int getSignal(BlockState state, BlockGetter world, BlockPos pos, Direction direction) {
        return 15;
    }
}
