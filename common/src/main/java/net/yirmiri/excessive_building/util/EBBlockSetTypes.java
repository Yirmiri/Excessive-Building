package net.yirmiri.excessive_building.util;

import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBBlockSetTypes {
    public static final BlockSetType ANCIENT = EBBlockSetTypes.register(new BlockSetType("ancient",
            true, //hand
            SoundType.CHERRY_WOOD,
            SoundEvents.CHERRY_WOOD_DOOR_CLOSE,
            SoundEvents.CHERRY_WOOD_DOOR_OPEN,
            SoundEvents.CHERRY_WOOD_TRAPDOOR_CLOSE,
            SoundEvents.CHERRY_WOOD_TRAPDOOR_OPEN,
            SoundEvents.CHERRY_WOOD_PRESSURE_PLATE_CLICK_OFF,
            SoundEvents.CHERRY_WOOD_PRESSURE_PLATE_CLICK_ON,
            SoundEvents.CHERRY_WOOD_BUTTON_CLICK_OFF,
            SoundEvents.CHERRY_WOOD_BUTTON_CLICK_ON));

    public static final BlockSetType GLOOM = EBBlockSetTypes.register(new BlockSetType("gloom",
            true, //hand
            SoundType.CHERRY_WOOD,
            SoundEvents.CHERRY_WOOD_DOOR_CLOSE,
            SoundEvents.CHERRY_WOOD_DOOR_OPEN,
            SoundEvents.CHERRY_WOOD_TRAPDOOR_CLOSE,
            SoundEvents.CHERRY_WOOD_TRAPDOOR_OPEN,
            SoundEvents.CHERRY_WOOD_PRESSURE_PLATE_CLICK_OFF,
            SoundEvents.CHERRY_WOOD_PRESSURE_PLATE_CLICK_ON,
            SoundEvents.CHERRY_WOOD_BUTTON_CLICK_OFF,
            SoundEvents.CHERRY_WOOD_BUTTON_CLICK_ON));

    private static BlockSetType register(BlockSetType type) {
        return type;
    }

    public static class EBWoodTypes {
        public static final WoodType ANCIENT = WoodTypeBuilder.copyOf(WoodType.CHERRY).register(ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, "ancient"), EBBlockSetTypes.ANCIENT);
        public static final WoodType GLOOM = WoodTypeBuilder.copyOf(WoodType.CHERRY).register(ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, "gloom"), EBBlockSetTypes.GLOOM);
    }
}
