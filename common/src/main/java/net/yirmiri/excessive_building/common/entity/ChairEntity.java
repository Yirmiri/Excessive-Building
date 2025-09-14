package net.yirmiri.excessive_building.common.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.yirmiri.excessive_building.common.block.ChairBlock;
import net.yirmiri.excessive_building.core.init.EBTags;

public class ChairEntity extends Entity {
    public ChairEntity(EntityType<?> type, Level world) {
        super(type, world);
        setInvulnerable(true);
    }

    @Override
    protected void removePassenger(Entity passenger) {
        super.removePassenger(passenger);
        if (!passenger.level().isClientSide && getBlockStateOn().is(EBTags.BlockT.CHAIRS)) {
            level().setBlockAndUpdate(blockPosition(), getBlockStateOn().setValue(ChairBlock.OCCUPIED, false));
            discard();
        } else {
            discard();
        }
    }

    @Override
    protected boolean canAddPassenger(Entity entity) {
        return true;
    }

    @Override
    protected void defineSynchedData() {

    }

    @Override
    protected void readAdditionalSaveData(CompoundTag nbt) {

    }

    @Override
    protected void addAdditionalSaveData(CompoundTag nbt) {

    }
}
