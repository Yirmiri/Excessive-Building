package net.yirmiri.excessive_building.registry;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.SoundType;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBSounds {
    //COBBLED BRICKS
    public static final SoundEvent COBBLED_BRICKS_BREAK = register("block.cobbled_bricks.break");
    public static final SoundEvent COBBLED_BRICKS_STEP = register("block.cobbled_bricks.step");
    public static final SoundEvent COBBLED_BRICKS_PLACE = register("block.cobbled_bricks.place");
    public static final SoundEvent COBBLED_BRICKS_HIT = register("block.cobbled_bricks.hit");
    public static final SoundEvent COBBLED_BRICKS_FALL = register("block.cobbled_bricks.fall");

    //GROUPS
    public static SoundType COBBLED_BRICKS = new SoundType(1.0F, 1.0F,
            COBBLED_BRICKS_BREAK, COBBLED_BRICKS_STEP, COBBLED_BRICKS_PLACE, COBBLED_BRICKS_HIT, COBBLED_BRICKS_FALL);

    private static SoundEvent register(String id) {
        return Registry.register(BuiltInRegistries.SOUND_EVENT, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, id), SoundEvent.createVariableRangeEvent(ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, id)));
    }

    public static void loadSounds() {
    }
}
