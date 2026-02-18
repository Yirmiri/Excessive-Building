package net.yirmiri.excessive_building.common.util;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class EBFamilyTypes {
    public static class BlockSetTypes {
        public static final BlockSetType ANCIENT = new BlockSetType("excessive_building:ancient");
        public static final BlockSetType WINTERGREEN = new BlockSetType("excessive_building:wintergreen");
    }

    public static class WoodTypes {
        public static final WoodType ANCIENT = new WoodType("excessive_building:ancient", BlockSetTypes.ANCIENT);
        public static final WoodType WINTERGREEN = new WoodType("excessive_building:wintergreen", BlockSetTypes.WINTERGREEN);
    }

    public static void load() {
    }
}
