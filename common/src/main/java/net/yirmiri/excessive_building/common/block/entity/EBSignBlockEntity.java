package net.yirmiri.excessive_building.common.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.yirmiri.excessive_building.core.registry.EBBlockEntities;

public class EBSignBlockEntity extends SignBlockEntity {
    public EBSignBlockEntity(BlockPos pos, BlockState blockState) {
        super(EBBlockEntities.EB_SIGN.get(), pos, blockState);
    }

    public EBSignBlockEntity(BlockEntityType type, BlockPos pos, BlockState blockState) {
        super(type, pos, blockState);
    }
}