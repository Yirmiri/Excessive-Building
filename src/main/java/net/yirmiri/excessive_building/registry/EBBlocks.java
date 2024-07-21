package net.yirmiri.excessive_building.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.block.*;
import net.yirmiri.excessive_building.block.sign.EBHangingSignBlock;
import net.yirmiri.excessive_building.block.sign.EBSignBlock;
import net.yirmiri.excessive_building.block.sign.EBWallHangingSignBlock;
import net.yirmiri.excessive_building.block.sign.EBWallSignBlock;
import net.yirmiri.excessive_building.util.EBBlockSetTypes;
import net.yirmiri.excessive_building.util.EBProperties;
import net.yirmiri.excessive_building.worldgen.EBSaplingGenerators;

import java.util.HashMap;

public class EBBlocks {

    //VANILLA VERTICAL STAIRS //TODO: CREATIVE TABS (flush out unused vertical stair data files), ADD 1.21 & COPPER VERTICAL SLABS
    public static final Block OAK_VERTICAL_STAIRS = register("oak_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), true);
    public static final Block SPRUCE_VERTICAL_STAIRS = register("spruce_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS)), true);
    public static final Block BIRCH_VERTICAL_STAIRS = register("birch_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS)), true);
    public static final Block JUNGLE_VERTICAL_STAIRS = register("jungle_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS)), true);
    public static final Block ACACIA_VERTICAL_STAIRS = register("acacia_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS)), true);
    public static final Block DARK_OAK_VERTICAL_STAIRS = register("dark_oak_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS)), true);
    public static final Block MANGROVE_VERTICAL_STAIRS = register("mangrove_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS)), true);
    public static final Block CHERRY_VERTICAL_STAIRS = register("cherry_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS)), true);
    public static final Block BAMBOO_VERTICAL_STAIRS = register("bamboo_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.BAMBOO_PLANKS)), true);
    public static final Block CRIMSON_VERTICAL_STAIRS = register("crimson_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS)), true);
    public static final Block WARPED_VERTICAL_STAIRS = register("warped_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS)), true);
    public static final Block STONE_VERTICAL_STAIRS = register("stone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.STONE)), true);
    public static final Block COBBLESTONE_VERTICAL_STAIRS = register("cobblestone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE)), true);
    public static final Block STONE_BRICK_VERTICAL_STAIRS = register("stone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)), true);
    public static final Block MOSSY_STONE_BRICK_VERTICAL_STAIRS = register("mossy_stone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.MOSSY_STONE_BRICKS)), true);
    public static final Block COBBLED_DEEPSLATE_VERTICAL_STAIRS = register("cobbled_deepslate_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE)), true);
    public static final Block DEEPSLATE_BRICK_VERTICAL_STAIRS = register("deepslate_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICKS)), true);
    public static final Block DEEPSLATE_TILE_VERTICAL_STAIRS = register("deepslate_tile_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_TILES)), true);
    public static final Block POLISHED_DEEPSLATE_VERTICAL_STAIRS = register("polished_deepslate_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE)), true);
    public static final Block QUARTZ_VERTICAL_STAIRS = register("quartz_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK)), true);
    public static final Block SMOOTH_QUARTZ_VERTICAL_STAIRS = register("smooth_quartz_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ)), true);
    public static final Block BRICK_VERTICAL_STAIRS = register("brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.BRICKS)), true);
    public static final Block SANDSTONE_VERTICAL_STAIRS = register("sandstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.SANDSTONE)), true);
    public static final Block SMOOTH_SANDSTONE_VERTICAL_STAIRS = register("smooth_sandstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE)), true);
    public static final Block RED_SANDSTONE_VERTICAL_STAIRS = register("red_sandstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.RED_SANDSTONE)), true);
    public static final Block SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS = register("smooth_red_sandstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.SMOOTH_RED_SANDSTONE)), true);
    public static final Block BLACKSTONE_VERTICAL_STAIRS = register("blackstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE)), true);
    public static final Block POLISHED_BLACKSTONE_VERTICAL_STAIRS = register("polished_blackstone_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE)), true);
    public static final Block POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS = register("polished_blackstone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)), true);
    public static final Block PRISMARINE_VERTICAL_STAIRS = register("prismarine_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.PRISMARINE)), true);
    public static final Block DARK_PRISMARINE_VERTICAL_STAIRS = register("dark_prismarine_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)), true);
    public static final Block PRISMARINE_BRICK_VERTICAL_STAIRS = register("prismarine_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.PRISMARINE_BRICKS)), true);
    public static final Block NETHER_BRICK_VERTICAL_STAIRS = register("nether_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS)), true);
    public static final Block RED_NETHER_BRICK_VERTICAL_STAIRS = register("red_nether_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.RED_NETHER_BRICKS)), true);
    public static final Block ANDESITE_VERTICAL_STAIRS = register("andesite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.ANDESITE)), true);
    public static final Block GRANITE_VERTICAL_STAIRS = register("granite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.GRANITE)), true);
    public static final Block DIORITE_VERTICAL_STAIRS = register("diorite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.DIORITE)), true);
    public static final Block POLISHED_ANDESITE_VERTICAL_STAIRS = register("polished_andesite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)), true);
    public static final Block POLISHED_GRANITE_VERTICAL_STAIRS = register("polished_granite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE)), true);
    public static final Block POLISHED_DIORITE_VERTICAL_STAIRS = register("polished_diorite_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.POLISHED_DIORITE)), true);
    public static final Block PURPUR_VERTICAL_STAIRS = register("purpur_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK)), true);
    public static final Block END_STONE_BRICK_VERTICAL_STAIRS = register("end_stone_brick_vertical_stairs", new VerticalStairsBlock(FabricBlockSettings.copy(Blocks.END_STONE_BRICKS)), true);

    //MOSAIC WOOD
    public static final Block OAK_MOSAIC = register("oak_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block OAK_MOSAIC_STAIRS = register("oak_mosaic_stairs", new StairsBlock(OAK_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block OAK_MOSAIC_SLAB = register("oak_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block OAK_MOSAIC_VERTICAL_STAIRS = register("oak_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Block SPRUCE_MOSAIC = register("spruce_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block SPRUCE_MOSAIC_STAIRS = register("spruce_mosaic_stairs", new StairsBlock(SPRUCE_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block SPRUCE_MOSAIC_SLAB = register("spruce_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block SPRUCE_MOSAIC_VERTICAL_STAIRS = register("spruce_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Block BIRCH_MOSAIC = register("birch_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block BIRCH_MOSAIC_STAIRS = register("birch_mosaic_stairs", new StairsBlock(BIRCH_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block BIRCH_MOSAIC_SLAB = register("birch_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block BIRCH_MOSAIC_VERTICAL_STAIRS = register("birch_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Block JUNGLE_MOSAIC = register("jungle_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block JUNGLE_MOSAIC_STAIRS = register("jungle_mosaic_stairs", new StairsBlock(JUNGLE_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block JUNGLE_MOSAIC_SLAB = register("jungle_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block JUNGLE_MOSAIC_VERTICAL_STAIRS = register("jungle_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Block ACACIA_MOSAIC = register("acacia_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block ACACIA_MOSAIC_STAIRS = register("acacia_mosaic_stairs", new StairsBlock(ACACIA_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block ACACIA_MOSAIC_SLAB = register("acacia_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block ACACIA_MOSAIC_VERTICAL_STAIRS = register("acacia_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Block DARK_OAK_MOSAIC = register("dark_oak_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block DARK_OAK_MOSAIC_STAIRS = register("dark_oak_mosaic_stairs", new StairsBlock(DARK_OAK_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block DARK_OAK_MOSAIC_SLAB = register("dark_oak_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block DARK_OAK_MOSAIC_VERTICAL_STAIRS = register("dark_oak_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Block MANGROVE_MOSAIC = register("mangrove_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block MANGROVE_MOSAIC_STAIRS = register("mangrove_mosaic_stairs", new StairsBlock(MANGROVE_MOSAIC.getDefaultState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block MANGROVE_MOSAIC_SLAB = register("mangrove_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block MANGROVE_MOSAIC_VERTICAL_STAIRS = register("mangrove_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Block CHERRY_MOSAIC = register("cherry_mosaic", new Block(EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Block CHERRY_MOSAIC_STAIRS = register("cherry_mosaic_stairs", new StairsBlock(CHERRY_MOSAIC.getDefaultState(), EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Block CHERRY_MOSAIC_SLAB = register("cherry_mosaic_slab", new SlabBlock(EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Block CHERRY_MOSAIC_VERTICAL_STAIRS = register("cherry_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.CHERRY_WOOD), true);

    public static final Block BAMBOO_MOSAIC_VERTICAL_STAIRS = register("bamboo_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.BAMBOO_WOOD), true);

    public static final Block CRIMSON_MOSAIC = register("crimson_mosaic", new Block(EBProperties.BlockP.CRIMSON_WOOD), true);
    public static final Block CRIMSON_MOSAIC_STAIRS = register("crimson_mosaic_stairs", new StairsBlock(CRIMSON_MOSAIC.getDefaultState(), EBProperties.BlockP.CRIMSON_WOOD), true);
    public static final Block CRIMSON_MOSAIC_SLAB = register("crimson_mosaic_slab", new SlabBlock(EBProperties.BlockP.CRIMSON_WOOD), true);
    public static final Block CRIMSON_MOSAIC_VERTICAL_STAIRS = register("crimson_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.CRIMSON_WOOD), true);

    public static final Block WARPED_MOSAIC = register("warped_mosaic", new Block(EBProperties.BlockP.WARPED_WOOD), true);
    public static final Block WARPED_MOSAIC_STAIRS = register("warped_mosaic_stairs", new StairsBlock(WARPED_MOSAIC.getDefaultState(), EBProperties.BlockP.WARPED_WOOD), true);
    public static final Block WARPED_MOSAIC_SLAB = register("warped_mosaic_slab", new SlabBlock(EBProperties.BlockP.WARPED_WOOD), true);
    public static final Block WARPED_MOSAIC_VERTICAL_STAIRS = register("warped_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.WARPED_WOOD), true);

    //CHISELED PLANKS
    public static final Block CHISELED_OAK_PLANKS = register("chiseled_oak_planks", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block CHISELED_SPRUCE_PLANKS = register("chiseled_spruce_planks", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block CHISELED_BIRCH_PLANKS = register("chiseled_birch_planks", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block CHISELED_JUNGLE_PLANKS = register("chiseled_jungle_planks", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block CHISELED_ACACIA_PLANKS = register("chiseled_acacia_planks", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block CHISELED_DARK_OAK_PLANKS = register("chiseled_dark_oak_planks", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block CHISELED_MANGROVE_PLANKS = register("chiseled_mangrove_planks", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block CHISELED_CHERRY_PLANKS = register("chiseled_cherry_planks", new Block(EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Block CHISELED_BAMBOO_PLANKS = register("chiseled_bamboo_planks", new Block(EBProperties.BlockP.BAMBOO_WOOD), true);
    public static final Block CHISELED_CRIMSON_PLANKS = register("chiseled_crimson_planks", new Block(EBProperties.BlockP.CRIMSON_WOOD), true);
    public static final Block CHISELED_WARPED_PLANKS = register("chiseled_warped_planks", new Block(EBProperties.BlockP.WARPED_WOOD), true);
    public static final Block CHISELED_ANCIENT_PLANKS = register("chiseled_ancient_planks", new Block(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Block CHISELED_GLOOM_PLANKS = register("chiseled_gloom_planks", new Block(EBProperties.BlockP.GLOOM_WOOD), true);

    //ANCIENT
    public static final Block ANCIENT_LOG = register("ancient_log", new PillarBlock(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Block STRIPPED_ANCIENT_LOG = register("stripped_ancient_log", new PillarBlock(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Block ANCIENT_WOOD = register("ancient_wood", new PillarBlock(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Block STRIPPED_ANCIENT_WOOD = register("stripped_ancient_wood", new PillarBlock(EBProperties.BlockP.ANCIENT_WOOD), true);

    public static final Block ANCIENT_PLANKS = register("ancient_planks", new Block(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Block ANCIENT_STAIRS = register("ancient_stairs", new StairsBlock(ANCIENT_PLANKS.getDefaultState(), EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Block ANCIENT_SLAB = register("ancient_slab", new SlabBlock(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Block ANCIENT_VERTICAL_STAIRS = register("ancient_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.ANCIENT_WOOD), true);

    public static final Block ANCIENT_MOSAIC = register("ancient_mosaic", new Block(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Block ANCIENT_MOSAIC_STAIRS = register("ancient_mosaic_stairs", new StairsBlock(ANCIENT_MOSAIC.getDefaultState(), EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Block ANCIENT_MOSAIC_SLAB = register("ancient_mosaic_slab", new SlabBlock(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Block ANCIENT_MOSAIC_VERTICAL_STAIRS = register("ancient_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.ANCIENT_WOOD), true);

    public static final Block ANCIENT_FENCE = register("ancient_fence", new FenceBlock(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Block ANCIENT_FENCE_GATE = register("ancient_fence_gate", new FenceGateBlock(EBBlockSetTypes.EBWoodTypes.ANCIENT, EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Block ANCIENT_DOOR = register("ancient_door", new DoorBlock(EBBlockSetTypes.ANCIENT, EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Block ANCIENT_TRAPDOOR = register("ancient_trapdoor", new TrapdoorBlock(EBBlockSetTypes.ANCIENT, EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Block ANCIENT_PRESSURE_PLATE = register("ancient_pressure_plate", new PressurePlateBlock(EBBlockSetTypes.ANCIENT, EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Block ANCIENT_BUTTON = register("ancient_button", new ButtonBlock(EBBlockSetTypes.ANCIENT, 30, EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Block ANCIENT_SIGN = register("ancient_sign", new EBSignBlock(EBBlockSetTypes.EBWoodTypes.ANCIENT, EBProperties.BlockP.ANCIENT_WOOD), false);
    public static final Block ANCIENT_WALL_SIGN = register("ancient_wall_sign", new EBWallSignBlock(EBBlockSetTypes.EBWoodTypes.ANCIENT, EBProperties.BlockP.ANCIENT_WOOD), false);
    public static final Block ANCIENT_HANGING_SIGN = register("ancient_hanging_sign", new EBHangingSignBlock(EBBlockSetTypes.EBWoodTypes.ANCIENT, EBProperties.BlockP.ANCIENT_WOOD), false);
    public static final Block ANCIENT_WALL_HANGING_SIGN = register("ancient_wall_hanging_sign", new EBWallHangingSignBlock(EBBlockSetTypes.EBWoodTypes.ANCIENT, EBProperties.BlockP.ANCIENT_WOOD), false);

    public static final Block ANCIENT_LEAVES = register("ancient_leaves", new AncientLeavesBlock(EBProperties.BlockP.ANCIENT_LEAVES), true);
    public static final Block ANCIENT_SAPLING = register("ancient_sapling", new SaplingBlock(EBSaplingGenerators.ANCIENT, EBProperties.BlockP.ANCIENT_SAPLING), true);
    public static final Block POTTED_ANCIENT_SAPLING = register("potted_ancient_sapling", Blocks.createFlowerPotBlock(EBBlocks.ANCIENT_SAPLING), false);

    //GLOOM
    public static final Block GLOOM_LOG = register("gloom_log", new PillarBlock(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Block STRIPPED_GLOOM_LOG = register("stripped_gloom_log", new PillarBlock(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Block GLOOM_WOOD = register("gloom_wood", new PillarBlock(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Block STRIPPED_GLOOM_WOOD = register("stripped_stripped_gloom_log_wood", new PillarBlock(EBProperties.BlockP.GLOOM_WOOD), true);

    public static final Block GLOOM_PLANKS = register("gloom_planks", new Block(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Block GLOOM_STAIRS = register("gloom_stairs", new StairsBlock(GLOOM_PLANKS.getDefaultState(), EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Block GLOOM_SLAB = register("gloom_slab", new SlabBlock(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Block GLOOM_VERTICAL_STAIRS = register("gloom_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GLOOM_WOOD), true);

    public static final Block GLOOM_MOSAIC = register("gloom_mosaic", new Block(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Block GLOOM_MOSAIC_STAIRS = register("gloom_mosaic_stairs", new StairsBlock(GLOOM_MOSAIC.getDefaultState(), EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Block GLOOM_MOSAIC_SLAB = register("gloom_mosaic_slab", new SlabBlock(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Block GLOOM_MOSAIC_VERTICAL_STAIRS = register("gloom_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GLOOM_WOOD), true);

    public static final Block GLOOM_FENCE = register("gloom_fence", new FenceBlock(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Block GLOOM_FENCE_GATE = register("gloom_fence_gate", new FenceGateBlock(EBBlockSetTypes.EBWoodTypes.GLOOM, EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Block GLOOM_DOOR = register("gloom_door", new DoorBlock(EBBlockSetTypes.GLOOM, EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Block GLOOM_TRAPDOOR = register("gloom_trapdoor", new TrapdoorBlock(EBBlockSetTypes.GLOOM, EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Block GLOOM_PRESSURE_PLATE = register("gloom_pressure_plate", new PressurePlateBlock(EBBlockSetTypes.GLOOM, EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Block GLOOM_BUTTON = register("gloom_button", new ButtonBlock(EBBlockSetTypes.GLOOM, 30, EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Block GLOOM_SIGN = register("gloom_sign", new EBSignBlock(EBBlockSetTypes.EBWoodTypes.GLOOM, EBProperties.BlockP.GLOOM_WOOD), false);
    public static final Block GLOOM_WALL_SIGN = register("gloom_wall_sign", new EBWallSignBlock(EBBlockSetTypes.EBWoodTypes.GLOOM, EBProperties.BlockP.GLOOM_WOOD), false);
    public static final Block GLOOM_HANGING_SIGN = register("gloom_hanging_sign", new EBHangingSignBlock(EBBlockSetTypes.EBWoodTypes.GLOOM, EBProperties.BlockP.GLOOM_WOOD), false);
    public static final Block GLOOM_WALL_HANGING_SIGN = register("gloom_wall_hanging_sign", new EBWallHangingSignBlock(EBBlockSetTypes.EBWoodTypes.GLOOM, EBProperties.BlockP.GLOOM_WOOD), false);

    //COBBLED BRICKS
    public static final Block COBBLESTONE_BRICKS = register("cobblestone_bricks", new Block(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Block COBBLESTONE_BRICK_STAIRS = register("cobblestone_brick_stairs", new StairsBlock(COBBLESTONE_BRICKS.getDefaultState(), EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Block COBBLESTONE_BRICK_SLAB = register("cobblestone_brick_slab", new SlabBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Block COBBLESTONE_BRICK_VERTICAL_STAIRS = register("cobblestone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Block COBBLESTONE_BRICK_WALL = register("cobblestone_brick_wall", new WallBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Block CRACKED_COBBLESTONE_BRICKS = register("cracked_cobblestone_bricks", new Block(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Block MOSSY_COBBLESTONE_BRICKS = register("mossy_cobblestone_bricks", new Block(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Block MOSSY_COBBLESTONE_BRICK_STAIRS = register("mossy_cobblestone_brick_stairs", new StairsBlock(MOSSY_COBBLESTONE_BRICKS.getDefaultState(), EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Block MOSSY_COBBLESTONE_BRICK_SLAB = register("mossy_cobblestone_brick_slab", new SlabBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Block MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS = register("mossy_cobblestone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Block MOSSY_COBBLESTONE_BRICK_WALL = register("mossy_cobblestone_brick_wall", new WallBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);

    public static final Block COBBLED_DEEPSLATE_BRICKS = register("cobbled_deepslate_bricks", new Block(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    public static final Block COBBLED_DEEPSLATE_BRICK_STAIRS = register("cobbled_deepslate_brick_stairs", new StairsBlock(COBBLED_DEEPSLATE_BRICKS.getDefaultState(), EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    public static final Block COBBLED_DEEPSLATE_BRICK_SLAB = register("cobbled_deepslate_brick_slab", new SlabBlock(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    public static final Block COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS = register("cobbled_deepslate_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    public static final Block COBBLED_DEEPSLATE_BRICK_WALL = register("cobbled_deepslate_brick_wall", new WallBlock(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    public static final Block CRACKED_COBBLED_DEEPSLATE_BRICKS = register("cracked_cobbled_deepslate_bricks", new Block(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);

    public static final Block BLACKSTONE_BRICKS = register("blackstone_bricks", new Block(EBProperties.BlockP.BLACKSTONE_BRICKS), true);
    public static final Block BLACKSTONE_BRICK_STAIRS = register("blackstone_brick_stairs", new StairsBlock(BLACKSTONE_BRICKS.getDefaultState(), EBProperties.BlockP.BLACKSTONE_BRICKS), true);
    public static final Block BLACKSTONE_BRICK_SLAB = register("blackstone_brick_slab", new SlabBlock(EBProperties.BlockP.BLACKSTONE_BRICKS), true);
    public static final Block BLACKSTONE_BRICK_VERTICAL_STAIRS = register("blackstone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.BLACKSTONE_BRICKS), true);
    public static final Block BLACKSTONE_BRICK_WALL = register("blackstone_brick_wall", new WallBlock(EBProperties.BlockP.BLACKSTONE_BRICKS), true);
    public static final Block CRACKED_BLACKSTONE_BRICKS = register("cracked_blackstone_bricks", new Block(EBProperties.BlockP.BLACKSTONE_BRICKS), true);

    //RESOURCE
    public static final Block GOLD_BRICKS = register("gold_bricks", new Block(EBProperties.BlockP.GOLD), true);
    public static final Block GOLD_BRICK_STAIRS = register("gold_brick_stairs", new StairsBlock(GOLD_BRICKS.getDefaultState(), EBProperties.BlockP.GOLD), true);
    public static final Block GOLD_BRICK_SLAB = register("gold_brick_slab", new SlabBlock(EBProperties.BlockP.GOLD), true);
    public static final Block GOLD_BRICK_VERTICAL_STAIRS = register("gold_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GOLD), true);

    public static final Block IRON_BRICKS = register("iron_bricks", new Block(EBProperties.BlockP.IRON), true);
    public static final Block IRON_BRICK_STAIRS = register("iron_brick_stairs", new StairsBlock(IRON_BRICKS.getDefaultState(), EBProperties.BlockP.IRON), true);
    public static final Block IRON_BRICK_SLAB = register("iron_brick_slab", new SlabBlock(EBProperties.BlockP.IRON), true);
    public static final Block IRON_BRICK_VERTICAL_STAIRS = register("iron_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.IRON), true);

    public static final Block LAPIS_BRICKS = register("lapis_bricks", new Block(EBProperties.BlockP.LAPIS), true);
    public static final Block LAPIS_BRICK_STAIRS = register("lapis_brick_stairs", new StairsBlock(LAPIS_BRICKS.getDefaultState(), EBProperties.BlockP.LAPIS), true);
    public static final Block LAPIS_BRICK_SLAB = register("lapis_brick_slab", new SlabBlock(EBProperties.BlockP.LAPIS), true);
    public static final Block LAPIS_BRICK_VERTICAL_STAIRS = register("lapis_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.LAPIS), true);

    public static final Block EMERALD_BRICKS = register("emerald_bricks", new Block(EBProperties.BlockP.EMERALD), true);
    public static final Block EMERALD_BRICK_STAIRS = register("emerald_brick_stairs", new StairsBlock(EMERALD_BRICKS.getDefaultState(), EBProperties.BlockP.EMERALD), true);
    public static final Block EMERALD_BRICK_SLAB = register("emerald_brick_slab", new SlabBlock(EBProperties.BlockP.EMERALD), true);
    public static final Block EMERALD_BRICK_VERTICAL_STAIRS = register("emerald_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.EMERALD), true);

    public static final Block DIAMOND_BRICKS = register("diamond_bricks", new Block(EBProperties.BlockP.DIAMOND), true);
    public static final Block DIAMOND_BRICK_STAIRS = register("diamond_brick_stairs", new StairsBlock(DIAMOND_BRICKS.getDefaultState(), EBProperties.BlockP.DIAMOND), true);
    public static final Block DIAMOND_BRICK_SLAB = register("diamond_brick_slab", new SlabBlock(EBProperties.BlockP.DIAMOND), true);
    public static final Block DIAMOND_BRICK_VERTICAL_STAIRS = register("diamond_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.DIAMOND), true);

    public static final Block NETHERITE_BRICKS = register("netherite_bricks", new Block(EBProperties.BlockP.NETHERITE), false);
    public static final Block NETHERITE_BRICK_STAIRS = register("netherite_brick_stairs", new StairsBlock(NETHERITE_BRICKS.getDefaultState(), EBProperties.BlockP.NETHERITE), false);
    public static final Block NETHERITE_BRICK_SLAB = register("netherite_brick_slab", new SlabBlock(EBProperties.BlockP.NETHERITE), false);
    public static final Block NETHERITE_BRICK_VERTICAL_STAIRS = register("netherite_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.NETHERITE), false);

    //COPPER - UNAFFECTED
    public static final Block COPPER_BRICKS = register("copper_bricks", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, EBProperties.BlockP.COPPER), true);
    public static final Block COPPER_BRICK_STAIRS = register("copper_brick_stairs", new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, COPPER_BRICKS.getDefaultState(), EBProperties.BlockP.COPPER), true);
    public static final Block COPPER_BRICK_SLAB = register("copper_brick_slab", new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, EBProperties.BlockP.COPPER), true);
    public static final Block COPPER_BRICK_VERTICAL_STAIRS = register("copper_brick_vertical_stairs", new OxidizableVerticalStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, EBProperties.BlockP.COPPER), true);
    public static final Block COPPER_PRESSURE_PLATE = register("copper_pressure_plate", new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, BlockSetType.COPPER, EBProperties.BlockP.COPPER_PRESSURE_PLATE, 10), true);
    public static final Block EXPOSED_COPPER_BRICKS = register("exposed_copper_bricks", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Block EXPOSED_COPPER_BRICK_STAIRS = register("exposed_copper_brick_stairs", new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, EXPOSED_COPPER_BRICKS.getDefaultState(), EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Block EXPOSED_COPPER_BRICK_SLAB = register("exposed_copper_brick_slab", new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Block EXPOSED_COPPER_BRICK_VERTICAL_STAIRS = register("exposed_copper_brick_vertical_stairs", new OxidizableVerticalStairsBlock(Oxidizable.OxidationLevel.EXPOSED, EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Block EXPOSED_COPPER_PRESSURE_PLATE = register("exposed_copper_pressure_plate", new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.EXPOSED, BlockSetType.COPPER, EBProperties.BlockP.COPPER_PRESSURE_PLATE, 20), true);
    public static final Block WEATHERED_COPPER_BRICKS = register("weathered_copper_bricks", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Block WEATHERED_COPPER_BRICK_STAIRS = register("weathered_copper_brick_stairs", new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, WEATHERED_COPPER_BRICKS.getDefaultState(), EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Block WEATHERED_COPPER_BRICK_SLAB = register("weathered_copper_brick_slab", new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Block WEATHERED_COPPER_BRICK_VERTICAL_STAIRS = register("weathered_copper_brick_vertical_stairs", new OxidizableVerticalStairsBlock(Oxidizable.OxidationLevel.WEATHERED, EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Block WEATHERED_COPPER_PRESSURE_PLATE = register("weathered_copper_pressure_plate", new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.WEATHERED, BlockSetType.COPPER, EBProperties.BlockP.COPPER_PRESSURE_PLATE, 30), true);
    public static final Block OXIDIZED_COPPER_BRICKS = register("oxidized_copper_bricks", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Block OXIDIZED_COPPER_BRICK_STAIRS = register("oxidized_copper_brick_stairs", new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, OXIDIZED_COPPER_BRICKS.getDefaultState(), EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Block OXIDIZED_COPPER_BRICK_SLAB = register("oxidized_copper_brick_slab", new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Block OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS = register("oxidized_copper_brick_vertical_stairs", new OxidizableVerticalStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Block OXIDIZED_COPPER_PRESSURE_PLATE = register("oxidized_copper_pressure_plate", new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.OXIDIZED, BlockSetType.COPPER, EBProperties.BlockP.COPPER_PRESSURE_PLATE, 40), true);
    public static final Block COPPER_BUTTON = register("copper_button", new OxidizableButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, BlockSetType.COPPER, 10, EBProperties.BlockP.COPPER_BUTTON), true);
    public static final Block EXPOSED_COPPER_BUTTON = register("exposed_copper_button", new OxidizableButtonBlock(Oxidizable.OxidationLevel.EXPOSED, BlockSetType.COPPER, 20, EBProperties.BlockP.COPPER_BUTTON), true);
    public static final Block WEATHERED_COPPER_BUTTON = register("weathered_copper_button", new OxidizableButtonBlock(Oxidizable.OxidationLevel.WEATHERED, BlockSetType.COPPER, 30, EBProperties.BlockP.COPPER_BUTTON), true);
    public static final Block OXIDIZED_COPPER_BUTTON = register("oxidized_copper_button", new OxidizableButtonBlock(Oxidizable.OxidationLevel.OXIDIZED, BlockSetType.COPPER, 40, EBProperties.BlockP.COPPER_BUTTON), true);
    
    //COPPER - WAXED
    public static final Block WAXED_COPPER_BRICKS = register("waxed_copper_bricks", new Block(EBProperties.BlockP.COPPER), true);
    public static final Block WAXED_COPPER_BRICK_STAIRS = register("waxed_copper_brick_stairs", new StairsBlock(WAXED_COPPER_BRICKS.getDefaultState(), EBProperties.BlockP.COPPER), true);
    public static final Block WAXED_COPPER_BRICK_SLAB = register("waxed_copper_brick_slab", new SlabBlock(EBProperties.BlockP.COPPER), true);
    public static final Block WAXED_COPPER_BRICK_VERTICAL_STAIRS = register("waxed_copper_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.COPPER), true);
    public static final Block WAXED_COPPER_PRESSURE_PLATE = register("waxed_copper_pressure_plate", new CopperPressurePlateBlock(BlockSetType.COPPER, EBProperties.BlockP.COPPER_PRESSURE_PLATE, 10), true);
    public static final Block WAXED_EXPOSED_COPPER_BRICKS = register("waxed_exposed_copper_bricks", new Block(EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Block WAXED_EXPOSED_COPPER_BRICK_STAIRS = register("waxed_exposed_copper_brick_stairs", new StairsBlock(WAXED_EXPOSED_COPPER_BRICKS.getDefaultState(), EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Block WAXED_EXPOSED_COPPER_BRICK_SLAB = register("waxed_exposed_copper_brick_slab", new SlabBlock(EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Block WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS = register("waxed_exposed_copper_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Block WAXED_EXPOSED_COPPER_PRESSURE_PLATE = register("waxed_exposed_copper_pressure_plate", new CopperPressurePlateBlock(BlockSetType.COPPER, EBProperties.BlockP.COPPER_PRESSURE_PLATE, 20), true);
    public static final Block WAXED_WEATHERED_COPPER_BRICKS = register("waxed_weathered_copper_bricks", new Block(EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Block WAXED_WEATHERED_COPPER_BRICK_STAIRS = register("waxed_weathered_copper_brick_stairs", new StairsBlock(WAXED_WEATHERED_COPPER_BRICKS.getDefaultState(), EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Block WAXED_WEATHERED_COPPER_BRICK_SLAB = register("waxed_weathered_copper_brick_slab", new SlabBlock(EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Block WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS = register("waxed_weathered_copper_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Block WAXED_WEATHERED_COPPER_PRESSURE_PLATE = register("waxed_weathered_copper_pressure_plate", new CopperPressurePlateBlock(BlockSetType.COPPER, EBProperties.BlockP.COPPER_PRESSURE_PLATE, 30), true);
    public static final Block WAXED_OXIDIZED_COPPER_BRICKS = register("waxed_oxidized_copper_bricks", new Block(EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Block WAXED_OXIDIZED_COPPER_BRICK_STAIRS = register("waxed_oxidized_copper_brick_stairs", new StairsBlock(WAXED_OXIDIZED_COPPER_BRICKS.getDefaultState(), EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Block WAXED_OXIDIZED_COPPER_BRICK_SLAB = register("waxed_oxidized_copper_brick_slab", new SlabBlock(EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Block WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS = register("waxed_oxidized_copper_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Block WAXED_OXIDIZED_COPPER_PRESSURE_PLATE = register("waxed_oxidized_copper_pressure_plate", new CopperPressurePlateBlock(BlockSetType.COPPER, EBProperties.BlockP.COPPER_PRESSURE_PLATE, 40), true);
    public static final Block WAXED_COPPER_BUTTON = register("waxed_copper_button", new ButtonBlock(BlockSetType.COPPER, 10, EBProperties.BlockP.COPPER_BUTTON), true);
    public static final Block WAXED_EXPOSED_COPPER_BUTTON = register("waxed_exposed_copper_button", new ButtonBlock(BlockSetType.COPPER, 20, EBProperties.BlockP.COPPER_BUTTON), true);
    public static final Block WAXED_WEATHERED_COPPER_BUTTON = register("waxed_weathered_copper_button", new ButtonBlock(BlockSetType.COPPER, 30, EBProperties.BlockP.COPPER_BUTTON), true);
    public static final Block WAXED_OXIDIZED_COPPER_BUTTON = register("waxed_oxidized_copper_button", new ButtonBlock(BlockSetType.COPPER, 40, EBProperties.BlockP.COPPER_BUTTON), true);

    //KNITTED WOOL
    public static final HashMap<DyeColor, Block> DYED_KNITTED_WOOL = new HashMap<>();
    public static final HashMap<DyeColor, Block> DYED_KNITTED_CARPET = new HashMap<>();

    public static Block getDyedKnittedWools(int colors) {
        return DYED_KNITTED_WOOL.get(DyeColor.byId(colors));
    }

    public static Block getDyedKnittedCarpets(int colors) {
        return DYED_KNITTED_CARPET.get(DyeColor.byId(colors));
    }

    static {
        for (DyeColor colors : DyeColor.values()) {
            DYED_KNITTED_WOOL.put(colors, register(colors + "_knitted_wool", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).mapColor(colors)), true));
        }

        for (DyeColor colors : DyeColor.values()) {
            DYED_KNITTED_CARPET.put(colors, register(colors + "_knitted_carpet", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).mapColor(colors)), true));
        }
    }

    //SEA GLASS
    public static final Block SEA_GLASS = register("sea_glass", new TransparentBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Block ROSE_SEA_GLASS = register("rose_sea_glass", new TransparentBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Block AQUA_SEA_GLASS = register("aqua_sea_glass", new TransparentBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Block VERDANT_SEA_GLASS = register("verdant_sea_glass", new TransparentBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Block SCARLET_SEA_GLASS = register("scarlet_sea_glass", new TransparentBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Block FUCHSIA_SEA_GLASS = register("fuchsia_sea_glass", new TransparentBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Block SEA_GLASS_PANE = register("sea_glass_pane", new SeaGlassPaneBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Block ROSE_SEA_GLASS_PANE = register("rose_sea_glass_pane", new SeaGlassPaneBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Block AQUA_SEA_GLASS_PANE = register("aqua_sea_glass_pane", new SeaGlassPaneBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Block VERDANT_SEA_GLASS_PANE = register("verdant_sea_glass_pane", new SeaGlassPaneBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Block SCARLET_SEA_GLASS_PANE = register("scarlet_sea_glass_pane", new SeaGlassPaneBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Block FUCHSIA_SEA_GLASS_PANE = register("fuchsia_sea_glass_pane", new SeaGlassPaneBlock(EBProperties.BlockP.SEA_GLASS), true);

    //SOUL SANDSTONE
    public static final Block SOUL_SANDSTONE = register("soul_sandstone", new Block(EBProperties.BlockP.SOUL_SANDSTONE), true);
    public static final Block SOUL_SANDSTONE_STAIRS = register("soul_sandstone_stairs", new StairsBlock(SOUL_SANDSTONE.getDefaultState(), EBProperties.BlockP.SOUL_SANDSTONE), true);
    public static final Block SOUL_SANDSTONE_SLAB = register("soul_sandstone_slab", new SlabBlock(EBProperties.BlockP.SOUL_SANDSTONE), true);
    public static final Block SOUL_SANDSTONE_VERTICAL_STAIRS = register("soul_sandstone_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.SOUL_SANDSTONE), true);
    public static final Block SOUL_SANDSTONE_WALL = register("soul_sandstone_wall", new WallBlock(EBProperties.BlockP.SOUL_SANDSTONE), true);

    public static final Block CUT_SOUL_SANDSTONE = register("cut_soul_sandstone", new Block(EBProperties.BlockP.CUT_SOUL_SANDSTONE), true);
    public static final Block CUT_SOUL_SANDSTONE_SLAB = register("cut_soul_sandstone_slab", new SlabBlock(EBProperties.BlockP.CUT_SOUL_SANDSTONE), true);
    public static final Block CHISELED_SOUL_SANDSTONE = register("chiseled_soul_sandstone", new Block(EBProperties.BlockP.CUT_SOUL_SANDSTONE), true);

    public static final Block SMOOTH_SOUL_SANDSTONE = register("smooth_soul_sandstone", new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Block SMOOTH_SOUL_SANDSTONE_STAIRS = register("smooth_soul_sandstone_stairs", new StairsBlock(SMOOTH_SOUL_SANDSTONE.getDefaultState(), EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Block SMOOTH_SOUL_SANDSTONE_SLAB = register("smooth_soul_sandstone_slab", new SlabBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Block SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS = register("smooth_soul_sandstone_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);

    public static final Block SOUL_MAGMA_BLOCK = register("soul_magma_block", new SoulMagmaBlock(EBProperties.BlockP.SOUL_MAGMA), true);

    //POLISHED SANDSTONE
    public static final Block POLISHED_SANDSTONE = register("polished_sandstone", new Block(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Block POLISHED_SANDSTONE_STAIRS = register("polished_sandstone_stairs", new StairsBlock(POLISHED_SANDSTONE.getDefaultState(), EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Block POLISHED_SANDSTONE_SLAB = register("polished_sandstone_slab", new SlabBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Block POLISHED_SANDSTONE_VERTICAL_STAIRS = register("polished_sandstone_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Block POLISHED_SANDSTONE_WALL = register("polished_sandstone_wall", new WallBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);

    public static final Block SANDSTONE_BRICKS = register("sandstone_bricks", new Block(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Block SANDSTONE_BRICK_STAIRS = register("sandstone_brick_stairs", new StairsBlock(SANDSTONE_BRICKS.getDefaultState(), EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Block SANDSTONE_BRICK_SLAB = register("sandstone_brick_slab", new SlabBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Block SANDSTONE_BRICK_VERTICAL_STAIRS = register("sandstone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Block SANDSTONE_BRICK_WALL = register("sandstone_brick_wall", new WallBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);

    public static final Block SANDSTONE_TILES = register("sandstone_tiles", new Block(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Block SANDSTONE_TILE_STAIRS = register("sandstone_tile_stairs", new StairsBlock(SANDSTONE_TILES.getDefaultState(), EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Block SANDSTONE_TILE_SLAB = register("sandstone_tile_slab", new SlabBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Block SANDSTONE_TILE_VERTICAL_STAIRS = register("sandstone_tile_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Block SANDSTONE_TILE_WALL = register("sandstone_tile_wall", new WallBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);

    public static final Block CHISELED_SANDSTONE_BRICKS = register("chiseled_sandstone_bricks", new Block(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Block ENGRAVED_SANDSTONE_BRICKS = register("engraved_sandstone_bricks", new Block(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Block DECORATED_SANDSTONE_BRICKS = register("decorated_sandstone_bricks", new Block(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Block SANDSTONE_PILLAR = register("sandstone_pillar", new PillarBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);

    //RED POLISHED SANDSTONE
    public static final Block POLISHED_RED_SANDSTONE = register("polished_red_sandstone", new Block(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Block POLISHED_RED_SANDSTONE_STAIRS = register("polished_red_sandstone_stairs", new StairsBlock(POLISHED_RED_SANDSTONE.getDefaultState(), EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Block POLISHED_RED_SANDSTONE_SLAB = register("polished_red_sandstone_slab", new SlabBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Block POLISHED_RED_SANDSTONE_VERTICAL_STAIRS = register("polished_red_sandstone_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Block POLISHED_RED_SANDSTONE_WALL = register("polished_red_sandstone_wall", new WallBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);

    public static final Block RED_SANDSTONE_BRICKS = register("red_sandstone_bricks", new Block(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Block RED_SANDSTONE_BRICK_STAIRS = register("red_sandstone_brick_stairs", new StairsBlock(RED_SANDSTONE_BRICKS.getDefaultState(), EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Block RED_SANDSTONE_BRICK_SLAB = register("red_sandstone_brick_slab", new SlabBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Block RED_SANDSTONE_BRICK_VERTICAL_STAIRS = register("red_sandstone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Block RED_SANDSTONE_BRICK_WALL = register("red_sandstone_brick_wall", new WallBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);

    public static final Block RED_SANDSTONE_TILES = register("red_sandstone_tiles", new Block(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Block RED_SANDSTONE_TILE_STAIRS = register("red_sandstone_tile_stairs", new StairsBlock(RED_SANDSTONE_TILES.getDefaultState(), EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Block RED_SANDSTONE_TILE_SLAB = register("red_sandstone_tile_slab", new SlabBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Block RED_SANDSTONE_TILE_VERTICAL_STAIRS = register("red_sandstone_tile_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Block RED_SANDSTONE_TILE_WALL = register("red_sandstone_tile_wall", new WallBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);

    public static final Block CHISELED_RED_SANDSTONE_BRICKS = register("chiseled_red_sandstone_bricks", new Block(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Block ENGRAVED_RED_SANDSTONE_BRICKS = register("engraved_red_sandstone_bricks", new Block(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Block DECORATED_RED_SANDSTONE_BRICKS = register("decorated_red_sandstone_bricks", new Block(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Block RED_SANDSTONE_PILLAR = register("red_sandstone_pillar", new PillarBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);


    //SOUL POLISHED SANDSTONE
    public static final Block POLISHED_SOUL_SANDSTONE = register("polished_soul_sandstone", new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Block POLISHED_SOUL_SANDSTONE_STAIRS = register("polished_soul_sandstone_stairs", new StairsBlock(POLISHED_SOUL_SANDSTONE.getDefaultState(), EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Block POLISHED_SOUL_SANDSTONE_SLAB = register("polished_soul_sandstone_slab", new SlabBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Block POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS = register("polished_soul_sandstone_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Block POLISHED_SOUL_SANDSTONE_WALL = register("polished_soul_sandstone_wall", new WallBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);

    public static final Block SOUL_SANDSTONE_BRICKS = register("soul_sandstone_bricks", new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Block SOUL_SANDSTONE_BRICK_STAIRS = register("soul_sandstone_brick_stairs", new StairsBlock(SOUL_SANDSTONE_BRICKS.getDefaultState(), EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Block SOUL_SANDSTONE_BRICK_SLAB = register("soul_sandstone_brick_slab", new SlabBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Block SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS = register("soul_sandstone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Block SOUL_SANDSTONE_BRICK_WALL = register("soul_sandstone_brick_wall", new WallBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);

    public static final Block SOUL_SANDSTONE_TILES = register("soul_sandstone_tiles", new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Block SOUL_SANDSTONE_TILE_STAIRS = register("soul_sandstone_tile_stairs", new StairsBlock(SOUL_SANDSTONE_TILES.getDefaultState(), EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Block SOUL_SANDSTONE_TILE_SLAB = register("soul_sandstone_tile_slab", new SlabBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Block SOUL_SANDSTONE_TILE_VERTICAL_STAIRS = register("soul_sandstone_tile_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Block SOUL_SANDSTONE_TILE_WALL = register("soul_sandstone_tile_wall", new WallBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);

    public static final Block CHISELED_SOUL_SANDSTONE_BRICKS = register("chiseled_soul_sandstone_bricks", new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Block ENGRAVED_SOUL_SANDSTONE_BRICKS = register("engraved_soul_sandstone_bricks", new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Block DECORATED_SOUL_SANDSTONE_BRICKS = register("decorated_soul_sandstone_bricks", new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Block SOUL_SANDSTONE_PILLAR = register("soul_sandstone_pillar", new PillarBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);

    //LADDERS
    public static final Block SPRUCE_LADDER = register("spruce_ladder", new LadderBlock(EBProperties.BlockP.GENERIC_LADDER), true);
    public static final Block BIRCH_LADDER = register("birch_ladder", new LadderBlock(EBProperties.BlockP.GENERIC_LADDER), true);
    public static final Block JUNGLE_LADDER = register("jungle_ladder", new LadderBlock(EBProperties.BlockP.GENERIC_LADDER), true);
    public static final Block ACACIA_LADDER = register("acacia_ladder", new LadderBlock(EBProperties.BlockP.GENERIC_LADDER), true);
    public static final Block DARK_OAK_LADDER = register("dark_oak_ladder", new LadderBlock(EBProperties.BlockP.GENERIC_LADDER), true);
    public static final Block MANGROVE_LADDER = register("mangrove_ladder", new LadderBlock(EBProperties.BlockP.GENERIC_LADDER), true);
    public static final Block CHERRY_LADDER = register("cherry_ladder", new LadderBlock(EBProperties.BlockP.CHERRY_LADDER), true);
    public static final Block BAMBOO_LADDER = register("bamboo_ladder", new LadderBlock(EBProperties.BlockP.BAMBOO_LADDER), true);
    public static final Block CRIMSON_LADDER = register("crimson_ladder", new LadderBlock(EBProperties.BlockP.CRIMSON_LADDER), true);
    public static final Block WARPED_LADDER = register("warped_ladder", new LadderBlock(EBProperties.BlockP.WARPED_LADDER), true);
    public static final Block ANCIENT_LADDER = register("ancient_ladder", new LadderBlock(EBProperties.BlockP.ANCIENT_LADDER), true);
    public static final Block GLOOM_LADDER = register("gloom_ladder", new LadderBlock(EBProperties.BlockP.GLOOM_LADDER), true);

    //CRAFTING TABLES
    public static final Block SPRUCE_CRAFTING_TABLE = register("spruce_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block BIRCH_CRAFTING_TABLE = register("birch_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block JUNGLE_CRAFTING_TABLE = register("jungle_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block ACACIA_CRAFTING_TABLE = register("acacia_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block DARK_OAK_CRAFTING_TABLE = register("dark_oak_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block MANGROVE_CRAFTING_TABLE = register("mangrove_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Block CHERRY_CRAFTING_TABLE = register("cherry_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Block BAMBOO_CRAFTING_TABLE = register("bamboo_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.BAMBOO_WOOD), true);
    public static final Block CRIMSON_CRAFTING_TABLE = register("crimson_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.CRIMSON_WOOD), true);
    public static final Block WARPED_CRAFTING_TABLE = register("warped_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.WARPED_WOOD), true);
    public static final Block ANCIENT_CRAFTING_TABLE = register("ancient_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Block GLOOM_CRAFTING_TABLE = register("gloom_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.CHERRY_WOOD), true);

    //DECORATIVES
    public static final Block WOODEN_MUG = register("wooden_mug", new WoodenMugBlock(EBProperties.BlockP.WOODEN_MUG), true);

    //MISC
    public static final Block BONE_BRICKS = register("bone_bricks", new Block(EBProperties.BlockP.BONE), true);
    public static final Block BONE_BRICK_STAIRS = register("bone_brick_stairs", new StairsBlock(BONE_BRICKS.getDefaultState(), EBProperties.BlockP.BONE), true);
    public static final Block BONE_BRICK_SLAB = register("bone_brick_slab", new SlabBlock(EBProperties.BlockP.BONE), true);
    public static final Block BONE_BRICK_VERTICAL_STAIRS = register("bone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.BONE), true);
    public static final Block BONE_BRICK_WALL = register("bone_brick_wall", new WallBlock(EBProperties.BlockP.BONE), true);

    public static final Block LOGO = register("logo", new Block(EBProperties.BlockP.INDESTRUCTIBLE), true);

    private static Block register(String id, Block block, boolean registerItem) {
        if (registerItem) {
            registerBlockItem(id, block);
        }
        return Registry.register(Registries.BLOCK, Identifier.of(ExcessiveBuilding.MOD_ID, id), block);
    }

    private static Item registerBlockItem(String id, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(ExcessiveBuilding.MOD_ID, id), new BlockItem(block, new Item.Settings()));
    }

    public static void registerEBBlocks() {
    }
}
