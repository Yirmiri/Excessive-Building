package net.yirmiri.excessive_building.core.registry;

import net.minecraft.world.level.block.SoundType;

public class EBSoundTypes {
    public static final SoundType SOFT_ROCK = new SoundType(1.0F, 1.0F,
            EBSounds.SOFT_ROCK_BREAK.value(),
            EBSounds.SOFT_ROCK_STEP.value(),
            EBSounds.SOFT_ROCK_PLACE.value(),
            EBSounds.SOFT_ROCK_HIT.value(),
            EBSounds.SOFT_ROCK_FALL.value()
    );
}