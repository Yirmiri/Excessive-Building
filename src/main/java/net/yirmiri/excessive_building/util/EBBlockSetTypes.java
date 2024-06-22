package net.yirmiri.excessive_building.util;

import net.minecraft.block.BlockSetType;

public class EBBlockSetTypes {
    public static final BlockSetType ANCIENT = EBBlockSetTypes.register(new BlockSetType("ancient"));

    private static BlockSetType register(BlockSetType type) {
        return type;
    }
}
