package net.yirmiri.excessive_building.block.entity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.yirmiri.excessive_building.registry.EBBlockEntities;

public class EBTrappedChestBlockEntity extends ChestBlockEntity {
    public EBTrappedChestBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(EBBlockEntities.EB_TRAPPED_CHEST, blockPos, blockState);
    }

    @Override
    protected void onViewerCountUpdate(World world, BlockPos pos, BlockState state, int oldViewerCount, int newViewerCount) {
        super.onViewerCountUpdate(world, pos, state, oldViewerCount, newViewerCount);
        if (oldViewerCount != newViewerCount) {
            Block block = state.getBlock();
            world.updateNeighborsAlways(pos, block);
            world.updateNeighborsAlways(pos.down(), block);
        }
    }
}
