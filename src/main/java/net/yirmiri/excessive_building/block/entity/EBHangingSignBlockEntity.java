package net.yirmiri.excessive_building.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.HangingSignBlockEntity;
import net.minecraft.util.math.BlockPos;
import net.yirmiri.excessive_building.registry.EBBlockEntities;

public class EBHangingSignBlockEntity extends HangingSignBlockEntity {
    public EBHangingSignBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return EBBlockEntities.EB_HANGING_SIGN_BLOCK_ENTITY;
    }
}
