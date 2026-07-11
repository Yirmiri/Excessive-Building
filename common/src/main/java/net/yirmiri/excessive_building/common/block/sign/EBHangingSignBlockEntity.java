package net.yirmiri.excessive_building.common.block.sign;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.state.BlockState;
import net.yirmiri.excessive_building.core.registry.EBBlockEntities;

public class EBHangingSignBlockEntity extends EBSignBlockEntity {
    public EBHangingSignBlockEntity(BlockPos pos, BlockState state) {
        super(EBBlockEntities.EB_HANGING_SIGN.get(), pos, state);
    }

    public int getTextLineHeight() {
        return 9;
    }

    public int getMaxTextLineWidth() {
        return 60;
    }

    public SoundEvent getSignInteractionFailedSoundEvent() {
        return SoundEvents.WAXED_HANGING_SIGN_INTERACT_FAIL;
    }
}