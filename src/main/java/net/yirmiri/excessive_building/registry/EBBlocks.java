package net.yirmiri.excessive_building.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.block.KilnBlock;
import net.yirmiri.excessive_building.block.VerticalStairsBlock;
import net.yirmiri.excessive_building.util.EBProperties;

public class EBBlocks {

    //VANILLA VERTICAL STAIRS //TODO: CREATIVE TABS (flush out unused vertical stair data files), ADD 1.21 & COPPER VERTICAL SLABS
    public static final Block OAK_VERTICAL_STAIRS = register("oak_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_VERTICAL_STAIRS = register("spruce_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block BIRCH_VERTICAL_STAIRS = register("birch_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block JUNGLE_VERTICAL_STAIRS = register("jungle_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block ACACIA_VERTICAL_STAIRS = register("acacia_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block DARK_OAK_VERTICAL_STAIRS = register("dark_oak_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block MANGROVE_VERTICAL_STAIRS = register("mangrove_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block CHERRY_VERTICAL_STAIRS = register("cherry_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block BAMBOO_VERTICAL_STAIRS = register("bamboo_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.BAMBOO_PLANKS)));
    public static final Block CRIMSON_VERTICAL_STAIRS = register("crimson_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block WARPED_VERTICAL_STAIRS = register("warped_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS)));
    public static final Block STONE_VERTICAL_STAIRS = register("stone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block COBBLESTONE_VERTICAL_STAIRS = register("cobblestone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE)));
    public static final Block STONE_BRICK_VERTICAL_STAIRS = register("stone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)));
    public static final Block MOSSY_STONE_BRICK_VERTICAL_STAIRS = register("mossy_stone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.MOSSY_STONE_BRICKS)));
    public static final Block COBBLED_DEEPSLATE_VERTICAL_STAIRS = register("cobbled_deepslate_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final Block DEEPSLATE_BRICK_VERTICAL_STAIRS = register("deepslate_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_TILE_VERTICAL_STAIRS = register("deepslate_tile_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_TILES)));
    public static final Block POLISHED_DEEPSLATE_VERTICAL_STAIRS = register("polished_deepslate_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE)));
    public static final Block QUARTZ_VERTICAL_STAIRS = register("quartz_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK)));
    public static final Block SMOOTH_QUARTZ_VERTICAL_STAIRS = register("smooth_quartz_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ)));
    public static final Block BRICK_VERTICAL_STAIRS = register("brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.BRICKS)));
    public static final Block SANDSTONE_VERTICAL_STAIRS = register("sandstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.SANDSTONE)));
    public static final Block SMOOTH_SANDSTONE_VERTICAL_STAIRS = register("smooth_sandstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE)));
    public static final Block RED_SANDSTONE_VERTICAL_STAIRS = register("red_sandstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.RED_SANDSTONE)));
    public static final Block SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS = register("smooth_red_sandstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.SMOOTH_RED_SANDSTONE)));
    public static final Block BLACKSTONE_VERTICAL_STAIRS = register("blackstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE)));
    public static final Block POLISHED_BLACKSTONE_VERTICAL_STAIRS = register("polished_blackstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE)));
    public static final Block POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS = register("polished_blackstone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block PRISMARINE_VERTICAL_STAIRS = register("prismarine_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.PRISMARINE)));
    public static final Block DARK_PRISMARINE_VERTICAL_STAIRS = register("dark_prismarine_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)));
    public static final Block PRISMARINE_BRICK_VERTICAL_STAIRS = register("prismarine_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block NETHER_BRICK_VERTICAL_STAIRS = register("nether_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS)));
    public static final Block RED_NETHER_BRICK_VERTICAL_STAIRS = register("red_nether_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Block ANDESITE_VERTICAL_STAIRS = register("andesite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.ANDESITE)));
    public static final Block GRANITE_VERTICAL_STAIRS = register("granite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.GRANITE)));
    public static final Block DIORITE_VERTICAL_STAIRS = register("diorite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.DIORITE)));
    public static final Block POLISHED_ANDESITE_VERTICAL_STAIRS = register("polished_andesite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block POLISHED_GRANITE_VERTICAL_STAIRS = register("polished_granite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_DIORITE_VERTICAL_STAIRS = register("polished_diorite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block PURPUR_VERTICAL_STAIRS = register("purpur_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK)));
    public static final Block END_STONE_BRICK_VERTICAL_STAIRS = register("end_stone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.END_STONE_BRICKS)));

    //WOOD
    public static final Block OAK_MOSAIC = register("oak_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block OAK_MOSAIC_STAIRS = register("oak_mosaic_stairs", new StairsBlock(OAK_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD));
    public static final Block OAK_MOSAIC_SLAB = register("oak_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block OAK_MOSAIC_VERTICAL_STAIRS = register("oak_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD));

    public static final Block SPRUCE_MOSAIC = register("spruce_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block SPRUCE_MOSAIC_STAIRS = register("spruce_mosaic_stairs", new StairsBlock(SPRUCE_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD));
    public static final Block SPRUCE_MOSAIC_SLAB = register("spruce_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block SPRUCE_MOSAIC_VERTICAL_STAIRS = register("spruce_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD));

    public static final Block BIRCH_MOSAIC = register("birch_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block BIRCH_MOSAIC_STAIRS = register("birch_mosaic_stairs", new StairsBlock(BIRCH_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD));
    public static final Block BIRCH_MOSAIC_SLAB = register("birch_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block BIRCH_MOSAIC_VERTICAL_STAIRS = register("birch_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD));

    public static final Block JUNGLE_MOSAIC = register("jungle_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block JUNGLE_MOSAIC_STAIRS = register("jungle_mosaic_stairs", new StairsBlock(JUNGLE_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD));
    public static final Block JUNGLE_MOSAIC_SLAB = register("jungle_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block JUNGLE_MOSAIC_VERTICAL_STAIRS = register("jungle_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD));

    public static final Block ACACIA_MOSAIC = register("acacia_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block ACACIA_MOSAIC_STAIRS = register("acacia_mosaic_stairs", new StairsBlock(ACACIA_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD));
    public static final Block ACACIA_MOSAIC_SLAB = register("acacia_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block ACACIA_MOSAIC_VERTICAL_STAIRS = register("acacia_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD));

    public static final Block DARK_OAK_MOSAIC = register("dark_oak_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block DARK_OAK_MOSAIC_STAIRS = register("dark_oak_mosaic_stairs", new StairsBlock(DARK_OAK_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD));
    public static final Block DARK_OAK_MOSAIC_SLAB = register("dark_oak_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block DARK_OAK_MOSAIC_VERTICAL_STAIRS = register("dark_oak_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD));

    public static final Block MANGROVE_MOSAIC = register("mangrove_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block MANGROVE_MOSAIC_STAIRS = register("mangrove_mosaic_stairs", new StairsBlock(MANGROVE_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD));
    public static final Block MANGROVE_MOSAIC_SLAB = register("mangrove_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD));
    public static final Block MANGROVE_MOSAIC_VERTICAL_STAIRS = register("mangrove_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD));

    public static final Block CHERRY_MOSAIC = register("cherry_mosaic", new Block(EBProperties.BlockP.CHERRY_WOOD));
    public static final Block CHERRY_MOSAIC_STAIRS = register("cherry_mosaic_stairs", new StairsBlock(CHERRY_MOSAIC.getDefaultState(), EBProperties.BlockP.CHERRY_WOOD));
    public static final Block CHERRY_MOSAIC_SLAB = register("cherry_mosaic_slab", new SlabBlock(EBProperties.BlockP.CHERRY_WOOD));
    public static final Block CHERRY_MOSAIC_VERTICAL_STAIRS = register("cherry_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.CHERRY_WOOD));

    public static final Block BAMBOO_MOSAIC_VERTICAL_STAIRS = register("bamboo_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.BAMBOO_WOOD));

    public static final Block CRIMSON_MOSAIC = register("crimson_mosaic", new Block(EBProperties.BlockP.CRIMSON_WOOD));
    public static final Block CRIMSON_MOSAIC_STAIRS = register("crimson_mosaic_stairs", new StairsBlock(CRIMSON_MOSAIC.getDefaultState(), EBProperties.BlockP.CRIMSON_WOOD));
    public static final Block CRIMSON_MOSAIC_SLAB = register("crimson_mosaic_slab", new SlabBlock(EBProperties.BlockP.CRIMSON_WOOD));
    public static final Block CRIMSON_MOSAIC_VERTICAL_STAIRS = register("crimson_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.CRIMSON_WOOD));

    public static final Block WARPED_MOSAIC = register("warped_mosaic", new Block(EBProperties.BlockP.WARPED_WOOD));
    public static final Block WARPED_MOSAIC_STAIRS = register("warped_mosaic_stairs", new StairsBlock(WARPED_MOSAIC.getDefaultState(), EBProperties.BlockP.WARPED_WOOD));
    public static final Block WARPED_MOSAIC_SLAB = register("warped_mosaic_slab", new SlabBlock(EBProperties.BlockP.WARPED_WOOD));
    public static final Block WARPED_MOSAIC_VERTICAL_STAIRS = register("warped_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.WARPED_WOOD));

    //COBBLED BRICKS
    public static final Block COBBLESTONE_BRICKS = register("cobblestone_bricks", new Block(EBProperties.BlockP.COBBLESTONE_BRICKS));
    public static final Block COBBLESTONE_BRICK_STAIRS = register("cobblestone_brick_stairs", new StairsBlock(COBBLESTONE_BRICKS.getDefaultState(), EBProperties.BlockP.COBBLESTONE_BRICKS));
    public static final Block COBBLESTONE_BRICK_SLAB = register("cobblestone_brick_slab", new SlabBlock(EBProperties.BlockP.COBBLESTONE_BRICKS));
    public static final Block COBBLESTONE_BRICK_VERTICAL_STAIRS = register("cobblestone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.COBBLESTONE_BRICKS));
    public static final Block COBBLESTONE_BRICK_WALL = register("cobblestone_brick_wall", new WallBlock(EBProperties.BlockP.COBBLESTONE_BRICKS));
    public static final Block CRACKED_COBBLESTONE_BRICKS = register("cracked_cobblestone_bricks", new Block(EBProperties.BlockP.COBBLESTONE_BRICKS));
    public static final Block MOSSY_COBBLESTONE_BRICKS = register("mossy_cobblestone_bricks", new Block(EBProperties.BlockP.COBBLESTONE_BRICKS));
    public static final Block MOSSY_COBBLESTONE_BRICK_STAIRS = register("mossy_cobblestone_brick_stairs", new StairsBlock(MOSSY_COBBLESTONE_BRICKS.getDefaultState(), EBProperties.BlockP.COBBLESTONE_BRICKS));
    public static final Block MOSSY_COBBLESTONE_BRICK_SLAB = register("mossy_cobblestone_brick_slab", new SlabBlock(EBProperties.BlockP.COBBLESTONE_BRICKS));
    public static final Block MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS = register("mossy_cobblestone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.COBBLESTONE_BRICKS));
    public static final Block MOSSY_COBBLESTONE_BRICK_WALL = register("mossy_cobblestone_brick_wall", new WallBlock(EBProperties.BlockP.COBBLESTONE_BRICKS));

    public static final Block COBBLED_DEEPSLATE_BRICKS = register("cobbled_deepslate_bricks", new Block(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS));
    public static final Block COBBLED_DEEPSLATE_BRICK_STAIRS = register("cobbled_deepslate_brick_stairs", new StairsBlock(COBBLED_DEEPSLATE_BRICKS.getDefaultState(), EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS));
    public static final Block COBBLED_DEEPSLATE_BRICK_SLAB = register("cobbled_deepslate_brick_slab", new SlabBlock(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS));
    public static final Block COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS = register("cobbled_deepslate_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS));
    public static final Block COBBLED_DEEPSLATE_BRICK_WALL = register("cobbled_deepslate_brick_wall", new WallBlock(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS));
    public static final Block CRACKED_COBBLED_DEEPSLATE_BRICKS = register("cracked_cobbled_deepslate_bricks", new Block(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS));

    public static final Block BLACKSTONE_BRICKS = register("blackstone_bricks", new Block(EBProperties.BlockP.BLACKSTONE_BRICKS));
    public static final Block BLACKSTONE_BRICK_STAIRS = register("blackstone_brick_stairs", new StairsBlock(BLACKSTONE_BRICKS.getDefaultState(), EBProperties.BlockP.BLACKSTONE_BRICKS));
    public static final Block BLACKSTONE_BRICK_SLAB = register("blackstone_brick_slab", new SlabBlock(EBProperties.BlockP.BLACKSTONE_BRICKS));
    public static final Block BLACKSTONE_BRICK_VERTICAL_STAIRS = register("blackstone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.BLACKSTONE_BRICKS));
    public static final Block BLACKSTONE_BRICK_WALL = register("blackstone_brick_wall", new WallBlock(EBProperties.BlockP.BLACKSTONE_BRICKS));
    public static final Block CRACKED_BLACKSTONE_BRICKS = register("cracked_blackstone_bricks", new Block(EBProperties.BlockP.BLACKSTONE_BRICKS));

    //ANCIENT
    public static final Block ANCIENT_PLANKS = register("ancient_planks", new Block(EBProperties.BlockP.ANCIENT_WOOD));
    public static final Block ANCIENT_STAIRS = register("ancient__stairs", new StairsBlock(ANCIENT_PLANKS.getDefaultState(), EBProperties.BlockP.ANCIENT_WOOD));
    public static final Block ANCIENT_SLAB = register("ancient__slab", new SlabBlock(EBProperties.BlockP.ANCIENT_WOOD));
    public static final Block ANCIENT_VERTICAL_STAIRS = register("ancient__vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.ANCIENT_WOOD));
    
    //FUNCTIONAL
    public static final Block KILN = register("kiln", new KilnBlock(EBProperties.BlockP.KILN));

    //MISC
    public static final Block LOGO = registerWithoutItem("logo", new Block(EBProperties.BlockP.INDESTRUCTIBLE));

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
