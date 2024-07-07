package net.yirmiri.excessive_building.registry;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBSounds {
    //COBBLED BRICKS
    public static final SoundEvent COBBLED_BRICKS_BREAK = register("cobbled_bricks_break");
    public static final SoundEvent COBBLED_BRICKS_STEP = register("cobbled_bricks_step");
    public static final SoundEvent COBBLED_BRICKS_PLACE = register("cobbled_bricks_place");
    public static final SoundEvent COBBLED_BRICKS_HIT = register("cobbled_bricks_hit");
    public static final SoundEvent COBBLED_BRICKS_FALL = register("cobbled_bricks_fall");

    //GROUPS
    public static BlockSoundGroup COBBLED_BRICKS = new BlockSoundGroup(1F, 1F,
            COBBLED_BRICKS_HIT, COBBLED_BRICKS_PLACE, COBBLED_BRICKS_PLACE, COBBLED_BRICKS_HIT, COBBLED_BRICKS_HIT);

    private static SoundEvent register(String id) {
        return Registry.register(Registries.SOUND_EVENT, Identifier.of(ExcessiveBuilding.MOD_ID), SoundEvent.of(Identifier.of(ExcessiveBuilding.MOD_ID)));
    }

    public static void registerEBSounds() {
    }
}
