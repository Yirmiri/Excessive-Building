package net.yirmiri.excessive_building.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.util.math.BlockPos;
import net.yirmiri.excessive_building.registry.EBBlockEntities;

public class EBSignBlockEntity extends SignBlockEntity {
    public EBSignBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return EBBlockEntities.EB_SIGN_BLOCK_ENTITY;
    }
}
