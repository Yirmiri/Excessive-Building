package net.yirmiri.excessive_building.registry;

import net.minecraft.world.level.block.Block;
import net.yirmiri.excessive_building.platform.Services;
import net.yirmiri.excessive_building.util.EBProperties;

import java.util.function.Supplier;

public class EBBlocks {
    //MISC
    public static final Supplier<Block> LOGO_BLOCK = register("logo_block", () -> new Block(EBProperties.BlockP.INDESTRUCTIBLE), true);

    private static <T extends Block> Supplier<T> register(String id, Supplier<T> block, boolean hasItem) {
//        if (hasItem) {
//            Registry.register(BuiltInRegistries.ITEM, ExcessiveBuilding.modIDPath(id), new BlockItem(block.get(), new Item.Properties()));
//        }
        return Services.REGISTRY.registerBlock(id, block, hasItem);
    }

    public static void loadBlocks() {
    }
}
