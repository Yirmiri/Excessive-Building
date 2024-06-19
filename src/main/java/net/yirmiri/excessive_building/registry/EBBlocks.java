package net.yirmiri.excessive_building.registry;

import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.util.EBProperties;

public class EBBlocks {

    //WOOD
    public static final Block OAK_MOSAIC = register("oak_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block OAK_MOSAIC_STAIRS = register("oak_mosaic_stairs", new StairsBlock(OAK_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD));
    public static final Block OAK_MOSAIC_SLAB = register("oak_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD));

    private static Block register(String id, Block block) {
        registerBlockItem(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ExcessiveBuilding.MOD_ID, id), block);
    }

    private static Block registerWithoutItem(String id, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(ExcessiveBuilding.MOD_ID, id), block);
    }

    private static Item registerBlockItem(String id, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(ExcessiveBuilding.MOD_ID, id), new BlockItem(block, new Item.Settings()));
    }

    public static void registerEBBlocks() {
    }
}
