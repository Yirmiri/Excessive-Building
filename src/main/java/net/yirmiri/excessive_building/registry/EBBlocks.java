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
import net.yirmiri.excessive_building.block.VerticalStairsBlock;
import net.yirmiri.excessive_building.util.EBProperties;

public class EBBlocks {

    //OAK
    public static final Block OAK_MOSAIC = register("oak_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block OAK_MOSAIC_STAIRS = register("oak_mosaic_stairs", new StairsBlock(OAK_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD));
    public static final Block OAK_MOSAIC_SLAB = register("oak_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block OAK_MOSAIC_VERTICAL_STAIRS = register("oak_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD));

    //SPRUCE
    public static final Block SPRUCE_MOSAIC = register("spruce_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block SPRUCE_MOSAIC_STAIRS = register("spruce_mosaic_stairs", new StairsBlock(SPRUCE_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD));
    public static final Block SPRUCE_MOSAIC_SLAB = register("spruce_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block SPRUCE_MOSAIC_VERTICAL_STAIRS = register("spruce_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD));

    //BIRCH
    public static final Block BIRCH_MOSAIC = register("birch_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block BIRCH_MOSAIC_STAIRS = register("birch_mosaic_stairs", new StairsBlock(BIRCH_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD));
    public static final Block BIRCH_MOSAIC_SLAB = register("birch_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block BIRCH_MOSAIC_VERTICAL_STAIRS = register("birch_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD));

    //JUNGLE
    public static final Block JUNGLE_MOSAIC = register("jungle_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block JUNGLE_MOSAIC_STAIRS = register("jungle_mosaic_stairs", new StairsBlock(JUNGLE_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD));
    public static final Block JUNGLE_MOSAIC_SLAB = register("jungle_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block JUNGLE_MOSAIC_VERTICAL_STAIRS = register("jungle_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD));

    //ACACIA
    public static final Block ACACIA_MOSAIC = register("acacia_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block ACACIA_MOSAIC_STAIRS = register("acacia_mosaic_stairs", new StairsBlock(ACACIA_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD));
    public static final Block ACACIA_MOSAIC_SLAB = register("acacia_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block ACACIA_MOSAIC_VERTICAL_STAIRS = register("acacia_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD));

    //DARK OAK
    public static final Block DARK_OAK_MOSAIC = register("dark_oak_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block DARK_OAK_MOSAIC_STAIRS = register("dark_oak_mosaic_stairs", new StairsBlock(DARK_OAK_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD));
    public static final Block DARK_OAK_MOSAIC_SLAB = register("dark_oak_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block DARK_OAK_MOSAIC_VERTICAL_STAIRS = register("dark_oak_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD));

    //MANGROVE
    public static final Block MANGROVE_MOSAIC = register("mangrove_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block MANGROVE_MOSAIC_STAIRS = register("mangrove_mosaic_stairs", new StairsBlock(MANGROVE_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD));
    public static final Block MANGROVE_MOSAIC_SLAB = register("mangrove_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block MANGROVE_MOSAIC_VERTICAL_STAIRS = register("mangrove_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD));

    //CHERRY
    public static final Block CHERRY_MOSAIC = register("cherry_mosaic", new Block(EBProperties.BlockP.CHERRY_WOOD));
    public static final Block CHERRY_MOSAIC_STAIRS = register("cherry_mosaic_stairs", new StairsBlock(CHERRY_MOSAIC.getDefaultState(), EBProperties.BlockP.CHERRY_WOOD));
    public static final Block CHERRY_MOSAIC_SLAB = register("cherry_mosaic_slab", new SlabBlock(EBProperties.BlockP.CHERRY_WOOD));
    public static final Block CHERRY_MOSAIC_VERTICAL_STAIRS = register("cherry_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.CHERRY_WOOD));

    //BAMBOO
    public static final Block BAMBOO_MOSAIC_VERTICAL_STAIRS = register("bamboo_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.BAMBOO_WOOD));

    //CRIMSON
    public static final Block CRIMSON_MOSAIC = register("crimson_mosaic", new Block(EBProperties.BlockP.CRIMSON_WOOD));
    public static final Block CRIMSON_MOSAIC_STAIRS = register("crimson_mosaic_stairs", new StairsBlock(CRIMSON_MOSAIC.getDefaultState(), EBProperties.BlockP.CRIMSON_WOOD));
    public static final Block CRIMSON_MOSAIC_SLAB = register("crimson_mosaic_slab", new SlabBlock(EBProperties.BlockP.CRIMSON_WOOD));
    public static final Block CRIMSON_MOSAIC_VERTICAL_STAIRS = register("crimson_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.CRIMSON_WOOD));

    //WARPED
    public static final Block WARPED_MOSAIC = register("warped_mosaic", new Block(EBProperties.BlockP.WARPED_WOOD));
    public static final Block WARPED_MOSAIC_STAIRS = register("warped_mosaic_stairs", new StairsBlock(WARPED_MOSAIC.getDefaultState(), EBProperties.BlockP.WARPED_WOOD));
    public static final Block WARPED_MOSAIC_SLAB = register("warped_mosaic_slab", new SlabBlock(EBProperties.BlockP.WARPED_WOOD));
    public static final Block WARPED_MOSAIC_VERTICAL_STAIRS = register("warped_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.WARPED_WOOD));

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
