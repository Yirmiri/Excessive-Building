package net.yirmiri.excessive_building.util;

import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBBlockSetTypes {
    public static final BlockSetType ANCIENT = EBBlockSetTypes.register(new BlockSetType("ancient"));

    private static BlockSetType register(BlockSetType type) {
        return type;
    }

    public static class EBWoodTypes {
        public static final WoodType ANCIENT = WoodTypeBuilder.copyOf(WoodType.CHERRY).register(Identifier.of(ExcessiveBuilding.MOD_ID, "ancient"), EBBlockSetTypes.ANCIENT);
    }
}
