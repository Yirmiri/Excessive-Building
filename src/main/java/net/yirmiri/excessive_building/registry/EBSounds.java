package net.yirmiri.excessive_building.registry;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBSounds {
    //COBBLED BRICKS
    public static final SoundEvent COBBLED_BRICKS_BREAK = register("block.cobbled_bricks.break");
    public static final SoundEvent COBBLED_BRICKS_STEP = register("block.cobbled_bricks.step");
    public static final SoundEvent COBBLED_BRICKS_PLACE = register("block.cobbled_bricks.place");
    public static final SoundEvent COBBLED_BRICKS_HIT = register("block.cobbled_bricks.hit");
    public static final SoundEvent COBBLED_BRICKS_FALL = register("block.cobbled_bricks.fall");

    //GROUPS
    public static BlockSoundGroup COBBLED_BRICKS = new BlockSoundGroup(1.0F, 1.0F,
            COBBLED_BRICKS_BREAK, COBBLED_BRICKS_STEP, COBBLED_BRICKS_PLACE, COBBLED_BRICKS_HIT, COBBLED_BRICKS_FALL);

    private static SoundEvent register(String id) {
        return Registry.register(Registries.SOUND_EVENT, Identifier.of(ExcessiveBuilding.MOD_ID, id), SoundEvent.of(Identifier.of(ExcessiveBuilding.MOD_ID, id)));
    }

    public static void loadSounds() {
    }
}
