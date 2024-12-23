package net.yirmiri.excessive_building.util;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.mixin.WoodTypeMixin;

public class EBBlockSetTypes {
    public static final BlockSetType ANCIENT = EBBlockSetTypes.register(new BlockSetType("ancient",
            true, true, true,
            BlockSetType.PressurePlateSensitivity.EVERYTHING,
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
            true, true, true,
            BlockSetType.PressurePlateSensitivity.EVERYTHING,
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
        public static final WoodType ANCIENT = WoodTypeMixin.invokeRegister(new WoodType(ExcessiveBuilding.modid("ancient").toString(), EBBlockSetTypes.ANCIENT));
        public static final WoodType GLOOM = WoodTypeMixin.invokeRegister(new WoodType(ExcessiveBuilding.modid("gloom").toString(), EBBlockSetTypes.GLOOM));
    }
}
