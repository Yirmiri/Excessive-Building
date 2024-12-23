package net.yirmiri.excessive_building.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.HangingSignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.yirmiri.excessive_building.registry.EBBlockEntities;

public class EBHangingSignBlockEntity extends HangingSignBlockEntity {
    public EBHangingSignBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return EBBlockEntities.EB_HANGING_SIGN;
    }
}
