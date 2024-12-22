package net.yirmiri.excessive_building.registry;

import net.minecraft.core.Holder;
import net.minecraft.world.level.block.Block;
import net.yirmiri.excessive_building.platform.Services;
import net.yirmiri.excessive_building.util.EBProperties;

import java.util.function.Supplier;

public class EBBlocks {
    //MISC
    public static final Holder<Block> LOGO_BLOCK = Services.REGISTRY.registerBlock("logo_block", new Block(EBProperties.BlockP.INDESTRUCTIBLE), true);

    public static void loadBlocks() {
    }
}
