package net.yirmiri.excessive_building.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.yirmiri.excessive_building.registry.EBBlockEntities;

public class EBChestBlockEntity extends ChestBlockEntity {
    public EBChestBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(EBBlockEntities.EB_CHEST, blockPos, blockState);
    }
}
