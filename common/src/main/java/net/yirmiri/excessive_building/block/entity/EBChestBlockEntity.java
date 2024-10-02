package net.yirmiri.excessive_building.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.util.math.BlockPos;
import net.yirmiri.excessive_building.registry.EBBlockEntities;

public class EBChestBlockEntity extends ChestBlockEntity {
    public EBChestBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(EBBlockEntities.EB_CHEST, blockPos, blockState);
    }
}
