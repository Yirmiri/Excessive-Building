package net.yirmiri.excessive_building.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.yirmiri.excessive_building.registry.EBBlockEntities;

public class EBTrappedChestBlockEntity extends ChestBlockEntity {
    public EBTrappedChestBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(EBBlockEntities.EB_TRAPPED_CHEST, blockPos, blockState);
    }

    @Override
    protected void signalOpenCount(Level world, BlockPos pos, BlockState state, int oldViewerCount, int newViewerCount) {
        super.signalOpenCount(world, pos, state, oldViewerCount, newViewerCount);
        if (oldViewerCount != newViewerCount) {
            Block block = state.getBlock();
            world.updateNeighborsAt(pos, block);
            world.updateNeighborsAt(pos.below(), block);
        }
    }
}
