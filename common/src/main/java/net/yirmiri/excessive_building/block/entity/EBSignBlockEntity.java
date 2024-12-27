package net.yirmiri.excessive_building.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.yirmiri.excessive_building.registry.EBBlockEntities;

public class EBSignBlockEntity extends SignBlockEntity {
    public EBSignBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return EBBlockEntities.EB_SIGN.get();
    }
}
