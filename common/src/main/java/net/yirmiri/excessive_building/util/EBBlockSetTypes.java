package net.yirmiri.excessive_building.util;

import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBBlockSetTypes {
    public static final BlockSetType ANCIENT = EBBlockSetTypes.register(new BlockSetType("ancient",
            true, //hand
            BlockSoundGroup.CHERRY_WOOD,
            SoundEvents.BLOCK_CHERRY_WOOD_DOOR_CLOSE,
            SoundEvents.BLOCK_CHERRY_WOOD_DOOR_OPEN,
            SoundEvents.BLOCK_CHERRY_WOOD_TRAPDOOR_CLOSE,
            SoundEvents.BLOCK_CHERRY_WOOD_TRAPDOOR_OPEN,
            SoundEvents.BLOCK_CHERRY_WOOD_PRESSURE_PLATE_CLICK_OFF,
            SoundEvents.BLOCK_CHERRY_WOOD_PRESSURE_PLATE_CLICK_ON,
            SoundEvents.BLOCK_CHERRY_WOOD_BUTTON_CLICK_OFF,
            SoundEvents.BLOCK_CHERRY_WOOD_BUTTON_CLICK_ON));

    public static final BlockSetType GLOOM = EBBlockSetTypes.register(new BlockSetType("gloom",
            true, //hand
            BlockSoundGroup.CHERRY_WOOD,
            SoundEvents.BLOCK_CHERRY_WOOD_DOOR_CLOSE,
            SoundEvents.BLOCK_CHERRY_WOOD_DOOR_OPEN,
            SoundEvents.BLOCK_CHERRY_WOOD_TRAPDOOR_CLOSE,
            SoundEvents.BLOCK_CHERRY_WOOD_TRAPDOOR_OPEN,
            SoundEvents.BLOCK_CHERRY_WOOD_PRESSURE_PLATE_CLICK_OFF,
            SoundEvents.BLOCK_CHERRY_WOOD_PRESSURE_PLATE_CLICK_ON,
            SoundEvents.BLOCK_CHERRY_WOOD_BUTTON_CLICK_OFF,
            SoundEvents.BLOCK_CHERRY_WOOD_BUTTON_CLICK_ON));

    private static BlockSetType register(BlockSetType type) {
        return type;
    }

    public static class EBWoodTypes {
        public static final WoodType ANCIENT = WoodTypeBuilder.copyOf(WoodType.CHERRY).register(Identifier.of(ExcessiveBuilding.MOD_ID, "ancient"), EBBlockSetTypes.ANCIENT);
        public static final WoodType GLOOM = WoodTypeBuilder.copyOf(WoodType.CHERRY).register(Identifier.of(ExcessiveBuilding.MOD_ID, "gloom"), EBBlockSetTypes.GLOOM);
    }
}
