package net.yirmiri.excessive_building.registry;

import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.PushReaction;
import net.yirmiri.excessive_building.block.*;
import net.yirmiri.excessive_building.block.configurable.*;
import net.yirmiri.excessive_building.block.sign.EBHangingSignBlock;
import net.yirmiri.excessive_building.block.sign.EBSignBlock;
import net.yirmiri.excessive_building.block.sign.EBWallHangingSignBlock;
import net.yirmiri.excessive_building.block.sign.EBWallSignBlock;
import net.yirmiri.excessive_building.platform.Services;
import net.yirmiri.excessive_building.util.EBBlockSetTypes;
import net.yirmiri.excessive_building.util.EBProperties;

import java.util.HashMap;

public class EBBlocks {

    public static final Holder<Block> OAK_VERTICAL_STAIRS = register("oak_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)), true);
    public static final Holder<Block> SPRUCE_VERTICAL_STAIRS = register("spruce_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)), true);
    public static final Holder<Block> BIRCH_VERTICAL_STAIRS = register("birch_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)), true);
    public static final Holder<Block> JUNGLE_VERTICAL_STAIRS = register("jungle_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)), true);
    public static final Holder<Block> ACACIA_VERTICAL_STAIRS = register("acacia_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)), true);
    public static final Holder<Block> DARK_OAK_VERTICAL_STAIRS = register("dark_oak_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)), true);
    public static final Holder<Block> MANGROVE_VERTICAL_STAIRS = register("mangrove_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)), true);
    public static final Holder<Block> CHERRY_VERTICAL_STAIRS = register("cherry_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)), true);
    public static final Holder<Block> BAMBOO_VERTICAL_STAIRS = register("bamboo_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)), true);
    public static final Holder<Block> CRIMSON_VERTICAL_STAIRS = register("crimson_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)), true);
    public static final Holder<Block> WARPED_VERTICAL_STAIRS = register("warped_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)), true);

    public static final Holder<Block> STONE_VERTICAL_STAIRS = register("stone_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)), true);
    public static final Holder<Block> COBBLESTONE_VERTICAL_STAIRS = register("cobblestone_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)), true);
    public static final Holder<Block> MOSSY_COBBLESTONE_VERTICAL_STAIRS = register("mossy_cobblestone_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE)), true);
    public static final Holder<Block> STONE_BRICK_VERTICAL_STAIRS = register("stone_brick_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)), true);
    public static final Holder<Block> MOSSY_STONE_BRICK_VERTICAL_STAIRS = register("mossy_stone_brick_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICKS)), true);
    public static final Holder<Block> COBBLED_DEEPSLATE_VERTICAL_STAIRS = register("cobbled_deepslate_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE)), true);
    public static final Holder<Block> DEEPSLATE_BRICK_VERTICAL_STAIRS = register("deepslate_brick_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)), true);
    public static final Holder<Block> DEEPSLATE_TILE_VERTICAL_STAIRS = register("deepslate_tile_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES)), true);
    public static final Holder<Block> POLISHED_DEEPSLATE_VERTICAL_STAIRS = register("polished_deepslate_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DEEPSLATE)), true);
    public static final Holder<Block> QUARTZ_VERTICAL_STAIRS = register("quartz_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)), true);
    public static final Holder<Block> SMOOTH_QUARTZ_VERTICAL_STAIRS = register("smooth_quartz_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ)), true);
    public static final Holder<Block> BRICK_VERTICAL_STAIRS = register("brick_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)), true);
    public static final Holder<Block> SANDSTONE_VERTICAL_STAIRS = register("sandstone_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)), true);
    public static final Holder<Block> SMOOTH_SANDSTONE_VERTICAL_STAIRS = register("smooth_sandstone_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_SANDSTONE)), true);
    public static final Holder<Block> RED_SANDSTONE_VERTICAL_STAIRS = register("red_sandstone_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)), true);
    public static final Holder<Block> SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS = register("smooth_red_sandstone_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_RED_SANDSTONE)), true);
    public static final Holder<Block> BLACKSTONE_VERTICAL_STAIRS = register("blackstone_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)), true);
    public static final Holder<Block> POLISHED_BLACKSTONE_VERTICAL_STAIRS = register("polished_blackstone_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE)), true);
    public static final Holder<Block> POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS = register("polished_blackstone_brick_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)), true);
    public static final Holder<Block> PRISMARINE_VERTICAL_STAIRS = register("prismarine_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE)), true);
    public static final Holder<Block> DARK_PRISMARINE_VERTICAL_STAIRS = register("dark_prismarine_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE)), true);
    public static final Holder<Block> PRISMARINE_BRICK_VERTICAL_STAIRS = register("prismarine_brick_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)), true);
    public static final Holder<Block> NETHER_BRICK_VERTICAL_STAIRS = register("nether_brick_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)), true);
    public static final Holder<Block> RED_NETHER_BRICK_VERTICAL_STAIRS = register("red_nether_brick_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)), true);
    public static final Holder<Block> ANDESITE_VERTICAL_STAIRS = register("andesite_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE)), true);
    public static final Holder<Block> GRANITE_VERTICAL_STAIRS = register("granite_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE)), true);
    public static final Holder<Block> DIORITE_VERTICAL_STAIRS = register("diorite_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)), true);
    public static final Holder<Block> POLISHED_ANDESITE_VERTICAL_STAIRS = register("polished_andesite_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)), true);
    public static final Holder<Block> POLISHED_GRANITE_VERTICAL_STAIRS = register("polished_granite_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)), true);
    public static final Holder<Block> POLISHED_DIORITE_VERTICAL_STAIRS = register("polished_diorite_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)), true);
    public static final Holder<Block> PURPUR_VERTICAL_STAIRS = register("purpur_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)), true);
    public static final Holder<Block> END_STONE_BRICK_VERTICAL_STAIRS = register("end_stone_brick_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)), true);

    public static final Holder<Block> CUT_COPPER_VERTICAL_STAIRS = register("cut_copper_vertical_stairs", new OxidizableVerticalStairsBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER)), true);
    public static final Holder<Block> EXPOSED_CUT_COPPER_VERTICAL_STAIRS = register("exposed_cut_copper_vertical_stairs", new OxidizableVerticalStairsBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_CUT_COPPER)), true);
    public static final Holder<Block> WEATHERED_CUT_COPPER_VERTICAL_STAIRS = register("weathered_cut_copper_vertical_stairs", new OxidizableVerticalStairsBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_CUT_COPPER)), true);
    public static final Holder<Block> OXIDIZED_CUT_COPPER_VERTICAL_STAIRS = register("oxidized_cut_copper_vertical_stairs", new OxidizableVerticalStairsBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_CUT_COPPER)), true);
    public static final Holder<Block> WAXED_CUT_COPPER_VERTICAL_STAIRS = register("waxed_cut_copper_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_CUT_COPPER)), true);
    public static final Holder<Block> WAXED_EXPOSED_CUT_COPPER_VERTICAL_STAIRS = register("waxed_exposed_cut_copper_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_EXPOSED_CUT_COPPER)), true);
    public static final Holder<Block> WAXED_WEATHERED_CUT_COPPER_VERTICAL_STAIRS = register("waxed_weathered_cut_copper_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_WEATHERED_CUT_COPPER)), true);
    public static final Holder<Block> WAXED_OXIDIZED_CUT_COPPER_VERTICAL_STAIRS = register("waxed_oxidized_cut_copper_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_OXIDIZED_CUT_COPPER)), true);
    public static final Holder<Block> TUFF_VERTICAL_STAIRS = register("tuff_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF)), true);
    public static final Holder<Block> POLISHED_TUFF_VERTICAL_STAIRS = register("polished_tuff_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_TUFF)), true);
    public static final Holder<Block> TUFF_BRICK_VERTICAL_STAIRS = register("tuff_brick_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF_BRICKS)), true);
    public static final Holder<Block> MUD_BRICK_VERTICAL_STAIRS = register("mud_brick_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)), true);

    //VANILLA ADDITIONS
    public static final Holder<Block> QUARTZ_BRICK_STAIRS = register("quartz_brick_stairs", new EBStairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(), EBProperties.BlockP.QUARTZ_BRICKS), true);
    public static final Holder<Block> QUARTZ_BRICK_SLAB = register("quartz_brick_slab", new SlabBlock(EBProperties.BlockP.QUARTZ_BRICKS), true);
    public static final Holder<Block> QUARTZ_BRICK_VERTICAL_STAIRS = register("quartz_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.QUARTZ_BRICKS), true);
    public static final Holder<Block> QUARTZ_BRICK_WALL = register("quartz_brick_wall", new WallBlock(EBProperties.BlockP.QUARTZ_BRICKS), true);

    public static final Holder<Block> CRACKED_MUD_BRICKS = register("cracked_mud_bricks", new Block(EBProperties.BlockP.MUD_BRICKS), true);

    public static final Holder<Block> TUFF_TILES = register("tuff_tiles", new Block(EBProperties.BlockP.TUFF_TILES), true);
    public static final Holder<Block> TUFF_TILE_STAIRS = register("tuff_tile_stairs", new EBStairBlock(TUFF_TILES.value().defaultBlockState(), EBProperties.BlockP.TUFF_TILES), true);
    public static final Holder<Block> TUFF_TILE_SLAB = register("tuff_tile_slab", new SlabBlock(EBProperties.BlockP.TUFF_TILES), true);
    public static final Holder<Block> TUFF_TILE_VERTICAL_STAIRS = register("tuff_tile_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.TUFF_TILES), true);
    public static final Holder<Block> TUFF_TILE_WALL = register("tuff_tile_wall", new WallBlock(EBProperties.BlockP.TUFF_TILES), true);

    public static final Holder<Block> MOSSY_DEEPSLATE_BRICKS = register("mossy_deepslate_bricks", new Block(EBProperties.BlockP.DEEPSLATE_BRICKS), true);
    public static final Holder<Block> MOSSY_DEEPSLATE_BRICK_STAIRS = register("mossy_deepslate_brick_stairs", new EBStairBlock(MOSSY_DEEPSLATE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.DEEPSLATE_BRICKS), true);
    public static final Holder<Block> MOSSY_DEEPSLATE_BRICK_SLAB = register("mossy_deepslate_brick_slab", new SlabBlock(EBProperties.BlockP.DEEPSLATE_BRICKS), true);
    public static final Holder<Block> MOSSY_DEEPSLATE_BRICK_VERTICAL_STAIRS = register("mossy_deepslate_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.DEEPSLATE_BRICKS), true);
    public static final Holder<Block> MOSSY_DEEPSLATE_BRICK_WALL = register("mossy_deepslate_brick_wall", new WallBlock(EBProperties.BlockP.DEEPSLATE_BRICKS), true);

    public static final Holder<Block> WEEPING_POLISHED_BLACKSTONE_BRICKS = register("weeping_polished_blackstone_bricks", new Block(EBProperties.BlockP.POLISHED_BLACKSTONE_BRICKS), true);
    public static final Holder<Block> WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS = register("weeping_polished_blackstone_brick_stairs", new EBStairBlock(WEEPING_POLISHED_BLACKSTONE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.POLISHED_BLACKSTONE_BRICKS), true);
    public static final Holder<Block> WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB = register("weeping_polished_blackstone_brick_slab", new SlabBlock(EBProperties.BlockP.POLISHED_BLACKSTONE_BRICKS), true);
    public static final Holder<Block> WEEPING_POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS = register("weeping_polished_blackstone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.POLISHED_BLACKSTONE_BRICKS), true);
    public static final Holder<Block> WEEPING_POLISHED_BLACKSTONE_BRICK_WALL = register("weeping_polished_blackstone_brick_wall", new WallBlock(EBProperties.BlockP.POLISHED_BLACKSTONE_BRICKS), true);
    public static final Holder<Block> TWISTING_POLISHED_BLACKSTONE_BRICKS = register("twisting_polished_blackstone_bricks", new Block(EBProperties.BlockP.POLISHED_BLACKSTONE_BRICKS), true);
    public static final Holder<Block> TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS = register("twisting_polished_blackstone_brick_stairs", new EBStairBlock(TWISTING_POLISHED_BLACKSTONE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.POLISHED_BLACKSTONE_BRICKS), true);
    public static final Holder<Block> TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB = register("twisting_polished_blackstone_brick_slab", new SlabBlock(EBProperties.BlockP.POLISHED_BLACKSTONE_BRICKS), true);
    public static final Holder<Block> TWISTING_POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS = register("twisting_polished_blackstone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.POLISHED_BLACKSTONE_BRICKS), true);
    public static final Holder<Block> TWISTING_POLISHED_BLACKSTONE_BRICK_WALL = register("twisting_polished_blackstone_brick_wall", new WallBlock(EBProperties.BlockP.POLISHED_BLACKSTONE_BRICKS), true);

    //PLANK BOARDS
    public static final Holder<Block> OAK_BOARDS = register("oak_boards", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> OAK_BOARD_STAIRS = register("oak_board_stairs", new EBStairBlock(OAK_BOARDS.value().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> OAK_BOARD_SLAB = register("oak_board_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> OAK_BOARD_VERTICAL_STAIRS = register("oak_board_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Holder<Block> SPRUCE_BOARDS = register("spruce_boards", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> SPRUCE_BOARD_STAIRS = register("spruce_board_stairs", new EBStairBlock(SPRUCE_BOARDS.value().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> SPRUCE_BOARD_SLAB = register("spruce_board_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> SPRUCE_BOARD_VERTICAL_STAIRS = register("spruce_board_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Holder<Block> BIRCH_BOARDS = register("birch_boards", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> BIRCH_BOARD_STAIRS = register("birch_board_stairs", new EBStairBlock(BIRCH_BOARDS.value().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> BIRCH_BOARD_SLAB = register("birch_board_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> BIRCH_BOARD_VERTICAL_STAIRS = register("birch_board_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Holder<Block> JUNGLE_BOARDS = register("jungle_boards", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> JUNGLE_BOARD_STAIRS = register("jungle_board_stairs", new EBStairBlock(JUNGLE_BOARDS.value().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> JUNGLE_BOARD_SLAB = register("jungle_board_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> JUNGLE_BOARD_VERTICAL_STAIRS = register("jungle_board_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Holder<Block> ACACIA_BOARDS = register("acacia_boards", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> ACACIA_BOARD_STAIRS = register("acacia_board_stairs", new EBStairBlock(ACACIA_BOARDS.value().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> ACACIA_BOARD_SLAB = register("acacia_board_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> ACACIA_BOARD_VERTICAL_STAIRS = register("acacia_board_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Holder<Block> DARK_OAK_BOARDS = register("dark_oak_boards", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> DARK_OAK_BOARD_STAIRS = register("dark_oak_board_stairs", new EBStairBlock(DARK_OAK_BOARDS.value().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> DARK_OAK_BOARD_SLAB = register("dark_oak_board_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> DARK_OAK_BOARD_VERTICAL_STAIRS = register("dark_oak_board_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Holder<Block> MANGROVE_BOARDS = register("mangrove_boards", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> MANGROVE_BOARD_STAIRS = register("mangrove_board_stairs", new EBStairBlock(MANGROVE_BOARDS.value().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> MANGROVE_BOARD_SLAB = register("mangrove_board_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> MANGROVE_BOARD_VERTICAL_STAIRS = register("mangrove_board_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Holder<Block> CHERRY_BOARDS = register("cherry_boards", new Block(EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Holder<Block> CHERRY_BOARD_STAIRS = register("cherry_board_stairs", new EBStairBlock(CHERRY_BOARDS.value().defaultBlockState(), EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Holder<Block> CHERRY_BOARD_SLAB = register("cherry_board_slab", new SlabBlock(EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Holder<Block> CHERRY_BOARD_VERTICAL_STAIRS = register("cherry_board_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.CHERRY_WOOD), true);

    public static final Holder<Block> BAMBOO_BOARDS = register("bamboo_boards", new Block(EBProperties.BlockP.BAMBOO_WOOD), true);
    public static final Holder<Block> BAMBOO_BOARD_STAIRS = register("bamboo_board_stairs", new EBStairBlock(BAMBOO_BOARDS.value().defaultBlockState(), EBProperties.BlockP.BAMBOO_WOOD), true);
    public static final Holder<Block> BAMBOO_BOARD_SLAB = register("bamboo_board_slab", new SlabBlock(EBProperties.BlockP.BAMBOO_WOOD), true);
    public static final Holder<Block> BAMBOO_BOARD_VERTICAL_STAIRS = register("bamboo_board_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.BAMBOO_WOOD), true);

    public static final Holder<Block> CRIMSON_BOARDS = register("crimson_boards", new Block(EBProperties.BlockP.CRIMSON_WOOD), true);
    public static final Holder<Block> CRIMSON_BOARD_STAIRS = register("crimson_board_stairs", new EBStairBlock(CRIMSON_BOARDS.value().defaultBlockState(), EBProperties.BlockP.CRIMSON_WOOD), true);
    public static final Holder<Block> CRIMSON_BOARD_SLAB = register("crimson_board_slab", new SlabBlock(EBProperties.BlockP.CRIMSON_WOOD), true);
    public static final Holder<Block> CRIMSON_BOARD_VERTICAL_STAIRS = register("crimson_board_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.CRIMSON_WOOD), true);

    public static final Holder<Block> WARPED_BOARDS = register("warped_boards", new Block(EBProperties.BlockP.WARPED_WOOD), true);
    public static final Holder<Block> WARPED_BOARD_STAIRS = register("warped_board_stairs", new EBStairBlock(WARPED_BOARDS.value().defaultBlockState(), EBProperties.BlockP.WARPED_WOOD), true);
    public static final Holder<Block> WARPED_BOARD_SLAB = register("warped_board_slab", new SlabBlock(EBProperties.BlockP.WARPED_WOOD), true);
    public static final Holder<Block> WARPED_BOARD_VERTICAL_STAIRS = register("warped_board_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.WARPED_WOOD), true);

    public static final Holder<Block> ANCIENT_BOARDS = register("ancient_boards", new Block(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Holder<Block> ANCIENT_BOARD_STAIRS = register("ancient_board_stairs", new EBStairBlock(ANCIENT_BOARDS.value().defaultBlockState(), EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Holder<Block> ANCIENT_BOARD_SLAB = register("ancient_board_slab", new SlabBlock(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Holder<Block> ANCIENT_BOARD_VERTICAL_STAIRS = register("ancient_board_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.ANCIENT_WOOD), true);

    public static final Holder<Block> GLOOM_BOARDS = register("gloom_boards", new Block(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Holder<Block> GLOOM_BOARD_STAIRS = register("gloom_board_stairs", new EBStairBlock(GLOOM_BOARDS.value().defaultBlockState(), EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Holder<Block> GLOOM_BOARD_SLAB = register("gloom_board_slab", new SlabBlock(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Holder<Block> GLOOM_BOARD_VERTICAL_STAIRS = register("gloom_board_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GLOOM_WOOD), true);

    //MOSAIC WOOD
    public static final Holder<Block> OAK_MOSAIC = register("oak_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> OAK_MOSAIC_STAIRS = register("oak_mosaic_stairs", new EBStairBlock(OAK_MOSAIC.value().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> OAK_MOSAIC_SLAB = register("oak_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> OAK_MOSAIC_VERTICAL_STAIRS = register("oak_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Holder<Block> SPRUCE_MOSAIC = register("spruce_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> SPRUCE_MOSAIC_STAIRS = register("spruce_mosaic_stairs", new EBStairBlock(SPRUCE_MOSAIC.value().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> SPRUCE_MOSAIC_SLAB = register("spruce_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> SPRUCE_MOSAIC_VERTICAL_STAIRS = register("spruce_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Holder<Block> BIRCH_MOSAIC = register("birch_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> BIRCH_MOSAIC_STAIRS = register("birch_mosaic_stairs", new EBStairBlock(BIRCH_MOSAIC.value().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> BIRCH_MOSAIC_SLAB = register("birch_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> BIRCH_MOSAIC_VERTICAL_STAIRS = register("birch_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Holder<Block> JUNGLE_MOSAIC = register("jungle_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> JUNGLE_MOSAIC_STAIRS = register("jungle_mosaic_stairs", new EBStairBlock(JUNGLE_MOSAIC.value().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> JUNGLE_MOSAIC_SLAB = register("jungle_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> JUNGLE_MOSAIC_VERTICAL_STAIRS = register("jungle_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Holder<Block> ACACIA_MOSAIC = register("acacia_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> ACACIA_MOSAIC_STAIRS = register("acacia_mosaic_stairs", new EBStairBlock(ACACIA_MOSAIC.value().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> ACACIA_MOSAIC_SLAB = register("acacia_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> ACACIA_MOSAIC_VERTICAL_STAIRS = register("acacia_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Holder<Block> DARK_OAK_MOSAIC = register("dark_oak_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> DARK_OAK_MOSAIC_STAIRS = register("dark_oak_mosaic_stairs", new EBStairBlock(DARK_OAK_MOSAIC.value().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> DARK_OAK_MOSAIC_SLAB = register("dark_oak_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> DARK_OAK_MOSAIC_VERTICAL_STAIRS = register("dark_oak_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Holder<Block> MANGROVE_MOSAIC = register("mangrove_mosaic", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> MANGROVE_MOSAIC_STAIRS = register("mangrove_mosaic_stairs", new EBStairBlock(MANGROVE_MOSAIC.value().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> MANGROVE_MOSAIC_SLAB = register("mangrove_mosaic_slab", new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> MANGROVE_MOSAIC_VERTICAL_STAIRS = register("mangrove_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Holder<Block> CHERRY_MOSAIC = register("cherry_mosaic", new Block(EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Holder<Block> CHERRY_MOSAIC_STAIRS = register("cherry_mosaic_stairs", new EBStairBlock(CHERRY_MOSAIC.value().defaultBlockState(), EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Holder<Block> CHERRY_MOSAIC_SLAB = register("cherry_mosaic_slab", new SlabBlock(EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Holder<Block> CHERRY_MOSAIC_VERTICAL_STAIRS = register("cherry_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.CHERRY_WOOD), true);

    public static final Holder<Block> BAMBOO_MOSAIC_VERTICAL_STAIRS = register("bamboo_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.BAMBOO_WOOD), true);

    public static final Holder<Block> CRIMSON_MOSAIC = register("crimson_mosaic", new Block(EBProperties.BlockP.CRIMSON_WOOD), true);
    public static final Holder<Block> CRIMSON_MOSAIC_STAIRS = register("crimson_mosaic_stairs", new EBStairBlock(CRIMSON_MOSAIC.value().defaultBlockState(), EBProperties.BlockP.CRIMSON_WOOD), true);
    public static final Holder<Block> CRIMSON_MOSAIC_SLAB = register("crimson_mosaic_slab", new SlabBlock(EBProperties.BlockP.CRIMSON_WOOD), true);
    public static final Holder<Block> CRIMSON_MOSAIC_VERTICAL_STAIRS = register("crimson_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.CRIMSON_WOOD), true);

    public static final Holder<Block> WARPED_MOSAIC = register("warped_mosaic", new Block(EBProperties.BlockP.WARPED_WOOD), true);
    public static final Holder<Block> WARPED_MOSAIC_STAIRS = register("warped_mosaic_stairs", new EBStairBlock(WARPED_MOSAIC.value().defaultBlockState(), EBProperties.BlockP.WARPED_WOOD), true);
    public static final Holder<Block> WARPED_MOSAIC_SLAB = register("warped_mosaic_slab", new SlabBlock(EBProperties.BlockP.WARPED_WOOD), true);
    public static final Holder<Block> WARPED_MOSAIC_VERTICAL_STAIRS = register("warped_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.WARPED_WOOD), true);

    //CHISELED PLANKS
    public static final Holder<Block> CHISELED_OAK_PLANKS = register("chiseled_oak_planks", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> CHISELED_SPRUCE_PLANKS = register("chiseled_spruce_planks", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> CHISELED_BIRCH_PLANKS = register("chiseled_birch_planks", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> CHISELED_JUNGLE_PLANKS = register("chiseled_jungle_planks", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> CHISELED_ACACIA_PLANKS = register("chiseled_acacia_planks", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> CHISELED_DARK_OAK_PLANKS = register("chiseled_dark_oak_planks", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> CHISELED_MANGROVE_PLANKS = register("chiseled_mangrove_planks", new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> CHISELED_CHERRY_PLANKS = register("chiseled_cherry_planks", new Block(EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Holder<Block> CHISELED_BAMBOO_PLANKS = register("chiseled_bamboo_planks", new Block(EBProperties.BlockP.BAMBOO_WOOD), true);
    public static final Holder<Block> CHISELED_CRIMSON_PLANKS = register("chiseled_crimson_planks", new Block(EBProperties.BlockP.CRIMSON_WOOD), true);
    public static final Holder<Block> CHISELED_WARPED_PLANKS = register("chiseled_warped_planks", new Block(EBProperties.BlockP.WARPED_WOOD), true);
    public static final Holder<Block> CHISELED_ANCIENT_PLANKS = register("chiseled_ancient_planks", new Block(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Holder<Block> CHISELED_GLOOM_PLANKS = register("chiseled_gloom_planks", new Block(EBProperties.BlockP.GLOOM_WOOD), true);

    //ANCIENT
    public static final Holder<Block> ANCIENT_LOG = register("ancient_log", new RotatedPillarBlock(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Holder<Block> STRIPPED_ANCIENT_LOG = register("stripped_ancient_log", new RotatedPillarBlock(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Holder<Block> ANCIENT_WOOD = register("ancient_wood", new RotatedPillarBlock(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Holder<Block> STRIPPED_ANCIENT_WOOD = register("stripped_ancient_wood", new RotatedPillarBlock(EBProperties.BlockP.ANCIENT_WOOD), true);

    public static final Holder<Block> ANCIENT_PLANKS = register("ancient_planks", new Block(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Holder<Block> ANCIENT_STAIRS = register("ancient_stairs", new EBStairBlock(ANCIENT_PLANKS.value().defaultBlockState(), EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Holder<Block> ANCIENT_SLAB = register("ancient_slab", new SlabBlock(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Holder<Block> ANCIENT_VERTICAL_STAIRS = register("ancient_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.ANCIENT_WOOD), true);

    public static final Holder<Block> ANCIENT_MOSAIC = register("ancient_mosaic", new Block(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Holder<Block> ANCIENT_MOSAIC_STAIRS = register("ancient_mosaic_stairs", new EBStairBlock(ANCIENT_MOSAIC.value().defaultBlockState(), EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Holder<Block> ANCIENT_MOSAIC_SLAB = register("ancient_mosaic_slab", new SlabBlock(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Holder<Block> ANCIENT_MOSAIC_VERTICAL_STAIRS = register("ancient_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.ANCIENT_WOOD), true);

    public static final Holder<Block> ANCIENT_FENCE = register("ancient_fence", new FenceBlock(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Holder<Block> ANCIENT_FENCE_GATE = register("ancient_fence_gate", new FenceGateBlock(EBBlockSetTypes.EBWoodTypes.ANCIENT, EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Holder<Block> ANCIENT_DOOR = register("ancient_door", new EBDoorBlock(EBBlockSetTypes.ANCIENT, EBProperties.BlockP.ANCIENT_DOOR), true);
    public static final Holder<Block> ANCIENT_TRAPDOOR = register("ancient_trapdoor", new EBTrapDoorBlock(EBBlockSetTypes.ANCIENT, EBProperties.BlockP.ANCIENT_TRAPDOOR), true);
    public static final Holder<Block> ANCIENT_PRESSURE_PLATE = register("ancient_pressure_plate", new EBPressurePlateBlock(EBBlockSetTypes.ANCIENT, EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Holder<Block> ANCIENT_BUTTON = register("ancient_button", new EBButtonBlock(EBBlockSetTypes.ANCIENT, 30, EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Holder<Block> ANCIENT_SIGN = register("ancient_sign", new EBSignBlock(EBBlockSetTypes.EBWoodTypes.ANCIENT, EBProperties.BlockP.ANCIENT_WOOD), false);
    public static final Holder<Block> ANCIENT_WALL_SIGN = register("ancient_wall_sign", new EBWallSignBlock(EBBlockSetTypes.EBWoodTypes.ANCIENT, EBProperties.BlockP.ANCIENT_WOOD), false);
    public static final Holder<Block> ANCIENT_HANGING_SIGN = register("ancient_hanging_sign", new EBHangingSignBlock(EBBlockSetTypes.EBWoodTypes.ANCIENT, EBProperties.BlockP.ANCIENT_WOOD), false);
    public static final Holder<Block> ANCIENT_WALL_HANGING_SIGN = register("ancient_wall_hanging_sign", new EBWallHangingSignBlock(EBBlockSetTypes.EBWoodTypes.ANCIENT, EBProperties.BlockP.ANCIENT_WOOD), false);

    public static final Holder<Block> ANCIENT_LEAVES = register("ancient_leaves", new GlowingLeavesBlock(EBParticles.ANCIENT_PARTICLE.value(), EBProperties.BlockP.GLOWING_LEAVES), true);
    public static final Holder<Block> ANCIENT_SAPLING = register("ancient_sapling", new AncientSaplingBlock(TreeGrower.OAK, //EBSaplingGenerators.ANCIENT,
            EBProperties.BlockP.GLOWING_SAPLING), true);
    public static final Holder<Block> POTTED_ANCIENT_SAPLING = register("potted_ancient_sapling", flowerPot(EBBlocks.ANCIENT_SAPLING), false);

    //GLOOM
    public static final Holder<Block> GLOOM_LOG = register("gloom_log", new RotatedPillarBlock(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Holder<Block> STRIPPED_GLOOM_LOG = register("stripped_gloom_log", new RotatedPillarBlock(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Holder<Block> GLOOM_WOOD = register("gloom_wood", new RotatedPillarBlock(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Holder<Block> STRIPPED_GLOOM_WOOD = register("stripped_stripped_gloom_log_wood", new RotatedPillarBlock(EBProperties.BlockP.GLOOM_WOOD), true);

    public static final Holder<Block> GLOOM_PLANKS = register("gloom_planks", new Block(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Holder<Block> GLOOM_STAIRS = register("gloom_stairs", new EBStairBlock(GLOOM_PLANKS.value().defaultBlockState(), EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Holder<Block> GLOOM_SLAB = register("gloom_slab", new SlabBlock(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Holder<Block> GLOOM_VERTICAL_STAIRS = register("gloom_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GLOOM_WOOD), true);

    public static final Holder<Block> GLOOM_MOSAIC = register("gloom_mosaic", new Block(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Holder<Block> GLOOM_MOSAIC_STAIRS = register("gloom_mosaic_stairs", new EBStairBlock(GLOOM_MOSAIC.value().defaultBlockState(), EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Holder<Block> GLOOM_MOSAIC_SLAB = register("gloom_mosaic_slab", new SlabBlock(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Holder<Block> GLOOM_MOSAIC_VERTICAL_STAIRS = register("gloom_mosaic_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.GLOOM_WOOD), true);

    public static final Holder<Block> GLOOM_FENCE = register("gloom_fence", new FenceBlock(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Holder<Block> GLOOM_FENCE_GATE = register("gloom_fence_gate", new FenceGateBlock(EBBlockSetTypes.EBWoodTypes.GLOOM, EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Holder<Block> GLOOM_DOOR = register("gloom_door", new EBDoorBlock(EBBlockSetTypes.GLOOM, EBProperties.BlockP.GLOOM_DOOR), true);
    public static final Holder<Block> GLOOM_TRAPDOOR = register("gloom_trapdoor", new EBTrapDoorBlock(EBBlockSetTypes.GLOOM, EBProperties.BlockP.GLOOM_TRAPDOOR), true);
    public static final Holder<Block> GLOOM_PRESSURE_PLATE = register("gloom_pressure_plate", new EBPressurePlateBlock(EBBlockSetTypes.GLOOM, EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Holder<Block> GLOOM_BUTTON = register("gloom_button", new EBButtonBlock(EBBlockSetTypes.GLOOM, 30, EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Holder<Block> GLOOM_SIGN = register("gloom_sign", new EBSignBlock(EBBlockSetTypes.EBWoodTypes.GLOOM, EBProperties.BlockP.GLOOM_WOOD), false);
    public static final Holder<Block> GLOOM_WALL_SIGN = register("gloom_wall_sign", new EBWallSignBlock(EBBlockSetTypes.EBWoodTypes.GLOOM, EBProperties.BlockP.GLOOM_WOOD), false);
    public static final Holder<Block> GLOOM_HANGING_SIGN = register("gloom_hanging_sign", new EBHangingSignBlock(EBBlockSetTypes.EBWoodTypes.GLOOM, EBProperties.BlockP.GLOOM_WOOD), false);
    public static final Holder<Block> GLOOM_WALL_HANGING_SIGN = register("gloom_wall_hanging_sign", new EBWallHangingSignBlock(EBBlockSetTypes.EBWoodTypes.GLOOM, EBProperties.BlockP.GLOOM_WOOD), false);

    public static final Holder<Block> GLOOM_LEAVES = register("gloom_leaves", new FloweringLeavesBlock(EBParticles.GLOOM_PARTICLE.value(), EBProperties.BlockP.GLOOM_LEAVES), true);
    public static final Holder<Block> GLOOM_SEEDS = register("gloom_seeds", new EBSaplingBlock(TreeGrower.OAK, //EBSaplingGenerators.GLOOM,
            EBProperties.BlockP.GLOOM_SEEDS), true);
    public static final Holder<Block> GLOOM_SAPLING = register("gloom_sapling", new GloomSaplingBlock(TreeGrower.OAK, //EBSaplingGenerators.GLOOM,
            EBProperties.BlockP.GLOOM_SAPLING), true);
    public static final Holder<Block> POTTED_GLOOM_SAPLING = register("potted_gloom_sapling", flowerPot(EBBlocks.GLOOM_SAPLING), false);

    //COBBLED BRICKS
    public static final Holder<Block> COBBLESTONE_BRICKS = register("cobblestone_bricks", new Block(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Holder<Block> COBBLESTONE_BRICK_STAIRS = register("cobblestone_brick_stairs", new EBStairBlock(COBBLESTONE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Holder<Block> COBBLESTONE_BRICK_SLAB = register("cobblestone_brick_slab", new SlabBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Holder<Block> COBBLESTONE_BRICK_VERTICAL_STAIRS = register("cobblestone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Holder<Block> COBBLESTONE_BRICK_WALL = register("cobblestone_brick_wall", new WallBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Holder<Block> CRACKED_COBBLESTONE_BRICKS = register("cracked_cobblestone_bricks", new Block(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Holder<Block> MOSSY_COBBLESTONE_BRICKS = register("mossy_cobblestone_bricks", new Block(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Holder<Block> MOSSY_COBBLESTONE_BRICK_STAIRS = register("mossy_cobblestone_brick_stairs", new EBStairBlock(MOSSY_COBBLESTONE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Holder<Block> MOSSY_COBBLESTONE_BRICK_SLAB = register("mossy_cobblestone_brick_slab", new SlabBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Holder<Block> MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS = register("mossy_cobblestone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Holder<Block> MOSSY_COBBLESTONE_BRICK_WALL = register("mossy_cobblestone_brick_wall", new WallBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);

    public static final Holder<Block> COBBLED_DEEPSLATE_BRICKS = register("cobbled_deepslate_bricks", new Block(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    public static final Holder<Block> COBBLED_DEEPSLATE_BRICK_STAIRS = register("cobbled_deepslate_brick_stairs", new EBStairBlock(COBBLED_DEEPSLATE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    public static final Holder<Block> COBBLED_DEEPSLATE_BRICK_SLAB = register("cobbled_deepslate_brick_slab", new SlabBlock(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    public static final Holder<Block> COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS = register("cobbled_deepslate_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    public static final Holder<Block> COBBLED_DEEPSLATE_BRICK_WALL = register("cobbled_deepslate_brick_wall", new WallBlock(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    public static final Holder<Block> CRACKED_COBBLED_DEEPSLATE_BRICKS = register("cracked_cobbled_deepslate_bricks", new Block(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    public static final Holder<Block> MOSSY_COBBLED_DEEPSLATE_BRICKS = register("mossy_cobbled_deepslate_bricks", new Block(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    public static final Holder<Block> MOSSY_COBBLED_DEEPSLATE_BRICK_STAIRS = register("mossy_cobbled_deepslate_brick_stairs", new EBStairBlock(MOSSY_COBBLED_DEEPSLATE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    public static final Holder<Block> MOSSY_COBBLED_DEEPSLATE_BRICK_SLAB = register("mossy_cobbled_deepslate_brick_slab", new SlabBlock(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    public static final Holder<Block> MOSSY_COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS = register("mossy_cobbled_deepslate_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    public static final Holder<Block> MOSSY_COBBLED_DEEPSLATE_BRICK_WALL = register("mossy_cobbled_deepslate_brick_wall", new WallBlock(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    
    public static final Holder<Block> BLACKSTONE_BRICKS = register("blackstone_bricks", new Block(EBProperties.BlockP.BLACKSTONE_BRICKS), true);
    public static final Holder<Block> BLACKSTONE_BRICK_STAIRS = register("blackstone_brick_stairs", new EBStairBlock(BLACKSTONE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.BLACKSTONE_BRICKS), true);
    public static final Holder<Block> BLACKSTONE_BRICK_SLAB = register("blackstone_brick_slab", new SlabBlock(EBProperties.BlockP.BLACKSTONE_BRICKS), true);
    public static final Holder<Block> BLACKSTONE_BRICK_VERTICAL_STAIRS = register("blackstone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.BLACKSTONE_BRICKS), true);
    public static final Holder<Block> BLACKSTONE_BRICK_WALL = register("blackstone_brick_wall", new WallBlock(EBProperties.BlockP.BLACKSTONE_BRICKS), true);
    public static final Holder<Block> CRACKED_BLACKSTONE_BRICKS = register("cracked_blackstone_bricks", new Block(EBProperties.BlockP.BLACKSTONE_BRICKS), true);
    public static final Holder<Block> WEEPING_BLACKSTONE_BRICKS = register("weeping_blackstone_bricks", new Block(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Holder<Block> WEEPING_BLACKSTONE_BRICK_STAIRS = register("weeping_blackstone_brick_stairs", new EBStairBlock(WEEPING_BLACKSTONE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Holder<Block> WEEPING_BLACKSTONE_BRICK_SLAB = register("weeping_blackstone_brick_slab", new SlabBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Holder<Block> WEEPING_BLACKSTONE_BRICK_VERTICAL_STAIRS = register("weeping_blackstone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Holder<Block> WEEPING_BLACKSTONE_BRICK_WALL = register("weeping_blackstone_brick_wall", new WallBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Holder<Block> TWISTING_BLACKSTONE_BRICKS = register("twisting_blackstone_bricks", new Block(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Holder<Block> TWISTING_BLACKSTONE_BRICK_STAIRS = register("twisting_blackstone_brick_stairs", new EBStairBlock(TWISTING_BLACKSTONE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Holder<Block> TWISTING_BLACKSTONE_BRICK_SLAB = register("twisting_blackstone_brick_slab", new SlabBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Holder<Block> TWISTING_BLACKSTONE_BRICK_VERTICAL_STAIRS = register("twisting_blackstone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Holder<Block> TWISTING_BLACKSTONE_BRICK_WALL = register("twisting_blackstone_brick_wall", new WallBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);

    //RESOURCE
    public static final Holder<Block> GOLD_BRICKS = register("gold_bricks", new ResourceBrickBlock(EBProperties.BlockP.GOLD), true);
    public static final Holder<Block> GOLD_BRICK_STAIRS = register("gold_brick_stairs", new ResourceBrickStairsBlock(GOLD_BRICKS.value().defaultBlockState(), EBProperties.BlockP.GOLD), true);
    public static final Holder<Block> GOLD_BRICK_SLAB = register("gold_brick_slab", new ResourceBrickSlabBlock(EBProperties.BlockP.GOLD), true);
    public static final Holder<Block> GOLD_BRICK_VERTICAL_STAIRS = register("gold_brick_vertical_stairs", new ResourceBrickVerticalStairsBlock(EBProperties.BlockP.GOLD), true);

    public static final Holder<Block> IRON_BRICKS = register("iron_bricks", new ResourceBrickBlock(EBProperties.BlockP.IRON), true);
    public static final Holder<Block> IRON_BRICK_STAIRS = register("iron_brick_stairs", new ResourceBrickStairsBlock(IRON_BRICKS.value().defaultBlockState(), EBProperties.BlockP.IRON), true);
    public static final Holder<Block> IRON_BRICK_SLAB = register("iron_brick_slab", new ResourceBrickSlabBlock(EBProperties.BlockP.IRON), true);
    public static final Holder<Block> IRON_BRICK_VERTICAL_STAIRS = register("iron_brick_vertical_stairs", new ResourceBrickVerticalStairsBlock(EBProperties.BlockP.IRON), true);

    public static final Holder<Block> LAPIS_BRICKS = register("lapis_bricks", new ResourceBrickBlock(EBProperties.BlockP.LAPIS), true);
    public static final Holder<Block> LAPIS_BRICK_STAIRS = register("lapis_brick_stairs", new ResourceBrickStairsBlock(LAPIS_BRICKS.value().defaultBlockState(), EBProperties.BlockP.LAPIS), true);
    public static final Holder<Block> LAPIS_BRICK_SLAB = register("lapis_brick_slab", new ResourceBrickSlabBlock(EBProperties.BlockP.LAPIS), true);
    public static final Holder<Block> LAPIS_BRICK_VERTICAL_STAIRS = register("lapis_brick_vertical_stairs", new ResourceBrickVerticalStairsBlock(EBProperties.BlockP.LAPIS), true);

    public static final Holder<Block> EMERALD_BRICKS = register("emerald_bricks", new ResourceBrickBlock(EBProperties.BlockP.EMERALD), true);
    public static final Holder<Block> EMERALD_BRICK_STAIRS = register("emerald_brick_stairs", new ResourceBrickStairsBlock(EMERALD_BRICKS.value().defaultBlockState(), EBProperties.BlockP.EMERALD), true);
    public static final Holder<Block> EMERALD_BRICK_SLAB = register("emerald_brick_slab", new ResourceBrickSlabBlock(EBProperties.BlockP.EMERALD), true);
    public static final Holder<Block> EMERALD_BRICK_VERTICAL_STAIRS = register("emerald_brick_vertical_stairs", new ResourceBrickVerticalStairsBlock(EBProperties.BlockP.EMERALD), true);

    public static final Holder<Block> DIAMOND_BRICKS = register("diamond_bricks", new ResourceBrickBlock(EBProperties.BlockP.DIAMOND), true);
    public static final Holder<Block> DIAMOND_BRICK_STAIRS = register("diamond_brick_stairs", new ResourceBrickStairsBlock(DIAMOND_BRICKS.value().defaultBlockState(), EBProperties.BlockP.DIAMOND), true);
    public static final Holder<Block> DIAMOND_BRICK_SLAB = register("diamond_brick_slab", new ResourceBrickSlabBlock(EBProperties.BlockP.DIAMOND), true);
    public static final Holder<Block> DIAMOND_BRICK_VERTICAL_STAIRS = register("diamond_brick_vertical_stairs", new ResourceBrickVerticalStairsBlock(EBProperties.BlockP.DIAMOND), true);

    public static final Holder<Block> NETHERITE_BRICKS = register("netherite_bricks", new ResourceBrickBlock(EBProperties.BlockP.NETHERITE), false);
    public static final Holder<Block> NETHERITE_BRICK_STAIRS = register("netherite_brick_stairs", new ResourceBrickStairsBlock(NETHERITE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.NETHERITE), false);
    public static final Holder<Block> NETHERITE_BRICK_SLAB = register("netherite_brick_slab", new ResourceBrickSlabBlock(EBProperties.BlockP.NETHERITE), false);
    public static final Holder<Block> NETHERITE_BRICK_VERTICAL_STAIRS = register("netherite_brick_vertical_stairs", new ResourceBrickVerticalStairsBlock(EBProperties.BlockP.NETHERITE), false);

    public static final Holder<Block> REDSTONE_BRICKS = register("redstone_bricks", new RedstoneResourceBrickBlock(EBProperties.BlockP.REDSTONE), true);
    public static final Holder<Block> REDSTONE_BRICK_STAIRS = register("redstone_brick_stairs", new RedstoneResourceBrickStairsBlock(REDSTONE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.REDSTONE), true);
    public static final Holder<Block> REDSTONE_BRICK_SLAB = register("redstone_brick_slab", new RedstoneResourceBrickSlabBlock(EBProperties.BlockP.REDSTONE), true);
    public static final Holder<Block> REDSTONE_BRICK_VERTICAL_STAIRS = register("redstone_brick_vertical_stairs", new RedstoneResourceBrickVerticalStairsBlock(EBProperties.BlockP.REDSTONE), true);

    //COPPER - UNAFFECTED
    public static final Holder<Block> COPPER_BRICKS = register("copper_bricks", new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, EBProperties.BlockP.COPPER), true);
    public static final Holder<Block> COPPER_BRICK_STAIRS = register("copper_brick_stairs", new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.UNAFFECTED, COPPER_BRICKS.value().defaultBlockState(), EBProperties.BlockP.COPPER), true);
    public static final Holder<Block> COPPER_BRICK_SLAB = register("copper_brick_slab", new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.UNAFFECTED, EBProperties.BlockP.COPPER), true);
    public static final Holder<Block> COPPER_BRICK_VERTICAL_STAIRS = register("copper_brick_vertical_stairs", new OxidizableVerticalStairsBlock(WeatheringCopper.WeatherState.UNAFFECTED, EBProperties.BlockP.COPPER), true);
    public static final Holder<Block> COPPER_PRESSURE_PLATE = register("copper_pressure_plate", new OxidizablePressurePlateBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockSetType.COPPER, EBProperties.BlockP.COPPER_PRESSURE_PLATE, 10), true);
    public static final Holder<Block> EXPOSED_COPPER_BRICKS = register("exposed_copper_bricks", new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Holder<Block> EXPOSED_COPPER_BRICK_STAIRS = register("exposed_copper_brick_stairs", new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.EXPOSED, EXPOSED_COPPER_BRICKS.value().defaultBlockState(), EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Holder<Block> EXPOSED_COPPER_BRICK_SLAB = register("exposed_copper_brick_slab", new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.EXPOSED, EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Holder<Block> EXPOSED_COPPER_BRICK_VERTICAL_STAIRS = register("exposed_copper_brick_vertical_stairs", new OxidizableVerticalStairsBlock(WeatheringCopper.WeatherState.EXPOSED, EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Holder<Block> EXPOSED_COPPER_PRESSURE_PLATE = register("exposed_copper_pressure_plate", new OxidizablePressurePlateBlock(WeatheringCopper.WeatherState.EXPOSED, BlockSetType.COPPER, EBProperties.BlockP.COPPER_PRESSURE_PLATE, 20), true);
    public static final Holder<Block> WEATHERED_COPPER_BRICKS = register("weathered_copper_bricks", new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Holder<Block> WEATHERED_COPPER_BRICK_STAIRS = register("weathered_copper_brick_stairs", new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.WEATHERED, WEATHERED_COPPER_BRICKS.value().defaultBlockState(), EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Holder<Block> WEATHERED_COPPER_BRICK_SLAB = register("weathered_copper_brick_slab", new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.WEATHERED, EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Holder<Block> WEATHERED_COPPER_BRICK_VERTICAL_STAIRS = register("weathered_copper_brick_vertical_stairs", new OxidizableVerticalStairsBlock(WeatheringCopper.WeatherState.WEATHERED, EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Holder<Block> WEATHERED_COPPER_PRESSURE_PLATE = register("weathered_copper_pressure_plate", new OxidizablePressurePlateBlock(WeatheringCopper.WeatherState.WEATHERED, BlockSetType.COPPER, EBProperties.BlockP.COPPER_PRESSURE_PLATE, 30), true);
    public static final Holder<Block> OXIDIZED_COPPER_BRICKS = register("oxidized_copper_bricks", new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Holder<Block> OXIDIZED_COPPER_BRICK_STAIRS = register("oxidized_copper_brick_stairs", new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.OXIDIZED, OXIDIZED_COPPER_BRICKS.value().defaultBlockState(), EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Holder<Block> OXIDIZED_COPPER_BRICK_SLAB = register("oxidized_copper_brick_slab", new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.OXIDIZED, EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Holder<Block> OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS = register("oxidized_copper_brick_vertical_stairs", new OxidizableVerticalStairsBlock(WeatheringCopper.WeatherState.OXIDIZED, EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Holder<Block> OXIDIZED_COPPER_PRESSURE_PLATE = register("oxidized_copper_pressure_plate", new OxidizablePressurePlateBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockSetType.COPPER, EBProperties.BlockP.COPPER_PRESSURE_PLATE, 40), true);
    public static final Holder<Block> COPPER_BUTTON = register("copper_button", new OxidizableButtonBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockSetType.COPPER, 10, EBProperties.BlockP.COPPER_BUTTON), true);
    public static final Holder<Block> EXPOSED_COPPER_BUTTON = register("exposed_copper_button", new OxidizableButtonBlock(WeatheringCopper.WeatherState.EXPOSED, BlockSetType.COPPER, 20, EBProperties.BlockP.COPPER_BUTTON), true);
    public static final Holder<Block> WEATHERED_COPPER_BUTTON = register("weathered_copper_button", new OxidizableButtonBlock(WeatheringCopper.WeatherState.WEATHERED, BlockSetType.COPPER, 30, EBProperties.BlockP.COPPER_BUTTON), true);
    public static final Holder<Block> OXIDIZED_COPPER_BUTTON = register("oxidized_copper_button", new OxidizableButtonBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockSetType.COPPER, 40, EBProperties.BlockP.COPPER_BUTTON), true);
    
    //COPPER - WAXED
    public static final Holder<Block> WAXED_COPPER_BRICKS = register("waxed_copper_bricks", new Block(EBProperties.BlockP.COPPER), true);
    public static final Holder<Block> WAXED_COPPER_BRICK_STAIRS = register("waxed_copper_brick_stairs", new EBStairBlock(WAXED_COPPER_BRICKS.value().defaultBlockState(), EBProperties.BlockP.COPPER), true);
    public static final Holder<Block> WAXED_COPPER_BRICK_SLAB = register("waxed_copper_brick_slab", new SlabBlock(EBProperties.BlockP.COPPER), true);
    public static final Holder<Block> WAXED_COPPER_BRICK_VERTICAL_STAIRS = register("waxed_copper_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.COPPER), true);
    public static final Holder<Block> WAXED_COPPER_PRESSURE_PLATE = register("waxed_copper_pressure_plate", new CopperPressurePlateBlock(BlockSetType.COPPER, EBProperties.BlockP.COPPER_PRESSURE_PLATE, 10), true);
    public static final Holder<Block> WAXED_EXPOSED_COPPER_BRICKS = register("waxed_exposed_copper_bricks", new Block(EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Holder<Block> WAXED_EXPOSED_COPPER_BRICK_STAIRS = register("waxed_exposed_copper_brick_stairs", new EBStairBlock(WAXED_EXPOSED_COPPER_BRICKS.value().defaultBlockState(), EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Holder<Block> WAXED_EXPOSED_COPPER_BRICK_SLAB = register("waxed_exposed_copper_brick_slab", new SlabBlock(EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Holder<Block> WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS = register("waxed_exposed_copper_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Holder<Block> WAXED_EXPOSED_COPPER_PRESSURE_PLATE = register("waxed_exposed_copper_pressure_plate", new CopperPressurePlateBlock(BlockSetType.COPPER, EBProperties.BlockP.COPPER_PRESSURE_PLATE, 20), true);
    public static final Holder<Block> WAXED_WEATHERED_COPPER_BRICKS = register("waxed_weathered_copper_bricks", new Block(EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Holder<Block> WAXED_WEATHERED_COPPER_BRICK_STAIRS = register("waxed_weathered_copper_brick_stairs", new EBStairBlock(WAXED_WEATHERED_COPPER_BRICKS.value().defaultBlockState(), EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Holder<Block> WAXED_WEATHERED_COPPER_BRICK_SLAB = register("waxed_weathered_copper_brick_slab", new SlabBlock(EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Holder<Block> WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS = register("waxed_weathered_copper_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Holder<Block> WAXED_WEATHERED_COPPER_PRESSURE_PLATE = register("waxed_weathered_copper_pressure_plate", new CopperPressurePlateBlock(BlockSetType.COPPER, EBProperties.BlockP.COPPER_PRESSURE_PLATE, 30), true);
    public static final Holder<Block> WAXED_OXIDIZED_COPPER_BRICKS = register("waxed_oxidized_copper_bricks", new Block(EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Holder<Block> WAXED_OXIDIZED_COPPER_BRICK_STAIRS = register("waxed_oxidized_copper_brick_stairs", new EBStairBlock(WAXED_OXIDIZED_COPPER_BRICKS.value().defaultBlockState(), EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Holder<Block> WAXED_OXIDIZED_COPPER_BRICK_SLAB = register("waxed_oxidized_copper_brick_slab", new SlabBlock(EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Holder<Block> WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS = register("waxed_oxidized_copper_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Holder<Block> WAXED_OXIDIZED_COPPER_PRESSURE_PLATE = register("waxed_oxidized_copper_pressure_plate", new CopperPressurePlateBlock(BlockSetType.COPPER, EBProperties.BlockP.COPPER_PRESSURE_PLATE, 40), true);
    public static final Holder<Block> WAXED_COPPER_BUTTON = register("waxed_copper_button", new EBButtonBlock(BlockSetType.COPPER, 10, EBProperties.BlockP.COPPER_BUTTON), true);
    public static final Holder<Block> WAXED_EXPOSED_COPPER_BUTTON = register("waxed_exposed_copper_button", new EBButtonBlock(BlockSetType.COPPER, 20, EBProperties.BlockP.COPPER_BUTTON), true);
    public static final Holder<Block> WAXED_WEATHERED_COPPER_BUTTON = register("waxed_weathered_copper_button", new EBButtonBlock(BlockSetType.COPPER, 30, EBProperties.BlockP.COPPER_BUTTON), true);
    public static final Holder<Block> WAXED_OXIDIZED_COPPER_BUTTON = register("waxed_oxidized_copper_button", new EBButtonBlock(BlockSetType.COPPER, 40, EBProperties.BlockP.COPPER_BUTTON), true);

    //KNITTED WOOL
    public static final HashMap<DyeColor, Holder<Block>> DYED_KNITTED_WOOL = new HashMap<>();
    public static final HashMap<DyeColor, Holder<Block>> DYED_KNITTED_CARPET = new HashMap<>();

    public static Holder<Block> getDyedKnittedWools(int colors) {
        return DYED_KNITTED_WOOL.get(DyeColor.byId(colors));
    }

    public static Holder<Block> getDyedKnittedCarpets(int colors) {
        return DYED_KNITTED_CARPET.get(DyeColor.byId(colors));
    }

    static {
        for (DyeColor colors : DyeColor.values()) {
            DYED_KNITTED_WOOL.put(colors, register(colors + "_knitted_wool", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(colors)), true));
            DYED_KNITTED_CARPET.put(colors, register(colors + "_knitted_carpet", new CarpetBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CARPET).mapColor(colors)), true));
        }
    }

    //TERRACOTTA TILES
    public static final Holder<Block> TERRACOTTA_TILES = register("terracotta_tiles", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)), true);
    public static final Holder<Block> TERRACOTTA_TILE_STAIRS = register("terracotta_tile_stairs", new EBStairBlock(EBBlocks.TERRACOTTA_TILES.value().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)), true);
    public static final Holder<Block> TERRACOTTA_TILE_VERTICAL_STAIRS = register("terracotta_tile_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)), true);
    public static final Holder<Block> TERRACOTTA_TILE_SLAB = register("terracotta_tile_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)), true);

    public static final HashMap<DyeColor, Holder<Block>> DYED_TERRACOTTA_TILES = new HashMap<>();
    public static final HashMap<DyeColor, Holder<Block>> DYED_TERRACOTTA_TILE_STAIRS = new HashMap<>();
    public static final HashMap<DyeColor, Holder<Block>> DYED_TERRACOTTA_TILE_VERTICAL_STAIRS = new HashMap<>();
    public static final HashMap<DyeColor, Holder<Block>> DYED_TERRACOTTA_TILE_SLAB = new HashMap<>();

    public static Holder<Block> getDyedTerracottaTiles(int colors) {
        return DYED_TERRACOTTA_TILES.get(DyeColor.byId(colors));
    }

    public static Holder<Block> getDyedTerracottaTileStairs(int colors) {
        return DYED_TERRACOTTA_TILE_STAIRS.get(DyeColor.byId(colors));
    }

    public static Holder<Block> getDyedTerracottaTileVerticalStairs(int colors) {
        return DYED_TERRACOTTA_TILE_VERTICAL_STAIRS.get(DyeColor.byId(colors));
    }

    public static Holder<Block> getDyedTerracottaTileSlab(int colors) {
        return DYED_TERRACOTTA_TILE_SLAB.get(DyeColor.byId(colors));
    }

    static {
        for (DyeColor colors : DyeColor.values()) {
            DYED_TERRACOTTA_TILES.put(colors, register(colors + "_terracotta_tiles", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA).mapColor(colors)), true));
            DYED_TERRACOTTA_TILE_STAIRS.put(colors, register(colors + "_terracotta_tile_stairs", new EBStairBlock(getDyedTerracottaTiles(colors.getId()).value().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA).mapColor(colors)), true));
            DYED_TERRACOTTA_TILE_VERTICAL_STAIRS.put(colors, register(colors + "_terracotta_tile_vertical_stairs", new VerticalStairsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA).mapColor(colors)), true));
            DYED_TERRACOTTA_TILE_SLAB.put(colors, register(colors + "_terracotta_tile_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA).mapColor(colors)), true));
        }
    }

    //ALMENTRA STATUES
    public static final Holder<Block> ALMENTRA_STATUE = register("almentra_statue", new AlmentraStatueBlock(EBProperties.BlockP.POLISHED_ALMENTRA), true);

    public static final HashMap<DyeColor, Holder<Block>> DYED_ALMENTRA_STATUE = new HashMap<>();

    public static Holder<Block> getDyedAlmentraStatues(int colors) {
        return DYED_ALMENTRA_STATUE.get(DyeColor.byId(colors));
    }

    static {
        for (DyeColor colors : DyeColor.values()) {
            DYED_ALMENTRA_STATUE.put(colors, register(colors + "_almentra_statue", new AlmentraStatueBlock(EBProperties.BlockP.POLISHED_ALMENTRA.mapColor(colors)), true));
        }
    }

    //ALMENTRA
    public static final Holder<Block> ALMENTRA = register("almentra", new Block(EBProperties.BlockP.ALMENTRA), true);
    public static final Holder<Block> ALMENTRA_STAIRS = register("almentra_stairs", new EBStairBlock(EBBlocks.ALMENTRA.value().defaultBlockState(), EBProperties.BlockP.ALMENTRA), true);
    public static final Holder<Block> ALMENTRA_VERTICAL_STAIRS = register("almentra_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.ALMENTRA), true);
    public static final Holder<Block> ALMENTRA_SLAB = register("almentra_slab", new SlabBlock(EBProperties.BlockP.ALMENTRA), true);

    public static final HashMap<DyeColor, Holder<Block>> DYED_ALMENTRA = new HashMap<>();
    public static final HashMap<DyeColor, Holder<Block>> DYED_ALMENTRA_STAIRS = new HashMap<>();
    public static final HashMap<DyeColor, Holder<Block>> DYED_ALMENTRA_VERTICAL_STAIRS = new HashMap<>();
    public static final HashMap<DyeColor, Holder<Block>> DYED_ALMENTRA_SLAB = new HashMap<>();

    public static Holder<Block> getDyedAlmentra(int colors) {
        return DYED_ALMENTRA.get(DyeColor.byId(colors));
    }

    public static Holder<Block> getDyedAlmentraStairs(int colors) {
        return DYED_ALMENTRA_STAIRS.get(DyeColor.byId(colors));
    }

    public static Holder<Block> getDyedAlmentraVerticalStairs(int colors) {
        return DYED_ALMENTRA_VERTICAL_STAIRS.get(DyeColor.byId(colors));
    }

    public static Holder<Block> getDyedAlmentraSlab(int colors) {
        return DYED_ALMENTRA_SLAB.get(DyeColor.byId(colors));
    }

    //POLISHED ALMENTRA
    public static final Holder<Block> POLISHED_ALMENTRA = register("polished_almentra", new HammerableIntoRotatableBlock(EBBlocks.ALMENTRA_STATUE.value(), EBProperties.BlockP.POLISHED_ALMENTRA), true);
    public static final Holder<Block> POLISHED_ALMENTRA_STAIRS = register("polished_almentra_stairs", new EBStairBlock(EBBlocks.POLISHED_ALMENTRA.value().defaultBlockState(), EBProperties.BlockP.POLISHED_ALMENTRA), true);
    public static final Holder<Block> POLISHED_ALMENTRA_VERTICAL_STAIRS = register("polished_almentra_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.POLISHED_ALMENTRA), true);
    public static final Holder<Block> POLISHED_ALMENTRA_SLAB = register("polished_almentra_slab", new SlabBlock(EBProperties.BlockP.POLISHED_ALMENTRA), true);

    public static final HashMap<DyeColor, Holder<Block>> DYED_POLISHED_ALMENTRA = new HashMap<>();
    public static final HashMap<DyeColor, Holder<Block>> DYED_POLISHED_ALMENTRA_STAIRS = new HashMap<>();
    public static final HashMap<DyeColor, Holder<Block>> DYED_POLISHED_ALMENTRA_VERTICAL_STAIRS = new HashMap<>();
    public static final HashMap<DyeColor, Holder<Block>> DYED_POLISHED_ALMENTRA_SLAB = new HashMap<>();

    public static Holder<Block> getDyedPolishedAlmentra(int colors) {
        return DYED_POLISHED_ALMENTRA.get(DyeColor.byId(colors));
    }

    public static Holder<Block> getDyedPolishedAlmentraStairs(int colors) {
        return DYED_POLISHED_ALMENTRA_STAIRS.get(DyeColor.byId(colors));
    }

    public static Holder<Block> getDyedPolishedAlmentraVerticalStairs(int colors) {
        return DYED_POLISHED_ALMENTRA_VERTICAL_STAIRS.get(DyeColor.byId(colors));
    }

    public static Holder<Block> getDyedPolishedAlmentraSlab(int colors) {
        return DYED_POLISHED_ALMENTRA_SLAB.get(DyeColor.byId(colors));
    }

    //DYED BLOCKS
    public static final Holder<Block> TERRACOTTA_POT = register("terracotta_pot", new TerracottaPotBlock(EBProperties.BlockP.TERRACOTTA_POT), true);

    public static final Holder<Block> ALMENTRA_BRICKS = register("almentra_bricks", new Block(EBProperties.BlockP.ALMENTRA_BRICKS), true);
    public static final Holder<Block> ALMENTRA_BRICK_STAIRS = register("almentra_brick_stairs", new EBStairBlock(EBBlocks.ALMENTRA_BRICKS.value().defaultBlockState(), EBProperties.BlockP.ALMENTRA_BRICKS), true);
    public static final Holder<Block> ALMENTRA_BRICK_VERTICAL_STAIRS = register("almentra_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.ALMENTRA_BRICKS), true);
    public static final Holder<Block> ALMENTRA_BRICK_SLAB = register("almentra_brick_slab", new SlabBlock(EBProperties.BlockP.ALMENTRA_BRICKS), true);

    public static final HashMap<DyeColor, Holder<Block>> DYED_ALMENTRA_BRICKS = new HashMap<>();
    public static final HashMap<DyeColor, Holder<Block>> DYED_ALMENTRA_BRICK_STAIRS = new HashMap<>();
    public static final HashMap<DyeColor, Holder<Block>> DYED_ALMENTRA_BRICK_VERTICAL_STAIRS = new HashMap<>();
    public static final HashMap<DyeColor, Holder<Block>> DYED_ALMENTRA_BRICK_SLAB = new HashMap<>();

    public static final HashMap<DyeColor, Holder<Block>> DYED_TERRACOTTA_POTS = new HashMap<>();

    public static Holder<Block> getDyedAlmentraBricks(int colors) {
        return DYED_ALMENTRA_BRICKS.get(DyeColor.byId(colors));
    }

    public static Holder<Block> getDyedAlmentraBrickStairs(int colors) {
        return DYED_ALMENTRA_BRICK_STAIRS.get(DyeColor.byId(colors));
    }

    public static Holder<Block> getDyedAlmentraBrickVerticalStairs(int colors) {
        return DYED_ALMENTRA_BRICK_VERTICAL_STAIRS.get(DyeColor.byId(colors));
    }

    public static Holder<Block> getDyedAlmentraBrickSlab(int colors) {
        return DYED_ALMENTRA_BRICK_SLAB.get(DyeColor.byId(colors));
    }

    public static Holder<Block> getDyedTerracottaPots(int colors) {
        return DYED_TERRACOTTA_POTS.get(DyeColor.byId(colors));
    }

    static {
        for (DyeColor colors : DyeColor.values()) {
            DYED_ALMENTRA.put(colors, register(colors + "_almentra", new Block(EBProperties.BlockP.ALMENTRA.mapColor(colors)), true));
            DYED_ALMENTRA_STAIRS.put(colors, register(colors + "_almentra_stairs", new EBStairBlock(getDyedAlmentra(colors.getId()).value().defaultBlockState(), EBProperties.BlockP.ALMENTRA.mapColor(colors)), true));
            DYED_ALMENTRA_VERTICAL_STAIRS.put(colors, register(colors + "_almentra_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.ALMENTRA.mapColor(colors)), true));
            DYED_ALMENTRA_SLAB.put(colors, register(colors + "_almentra_slab", new SlabBlock(EBProperties.BlockP.ALMENTRA.mapColor(colors)), true));

            DYED_POLISHED_ALMENTRA.put(colors, register(colors + "_polished_almentra", new HammerableIntoRotatableBlock(EBBlocks.getDyedAlmentraStatues(colors.getId()).value(), EBProperties.BlockP.POLISHED_ALMENTRA.mapColor(colors)), true));
            DYED_POLISHED_ALMENTRA_STAIRS.put(colors, register(colors + "_polished_almentra_stairs", new EBStairBlock(getDyedPolishedAlmentra(colors.getId()).value().defaultBlockState(), EBProperties.BlockP.POLISHED_ALMENTRA.mapColor(colors)), true));
            DYED_POLISHED_ALMENTRA_VERTICAL_STAIRS.put(colors, register(colors + "_polished_almentra_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.POLISHED_ALMENTRA.mapColor(colors)), true));
            DYED_POLISHED_ALMENTRA_SLAB.put(colors, register(colors + "_polished_almentra_slab", new SlabBlock(EBProperties.BlockP.POLISHED_ALMENTRA.mapColor(colors)), true));

            DYED_ALMENTRA_BRICKS.put(colors, register(colors + "_almentra_bricks", new Block(EBProperties.BlockP.ALMENTRA_BRICKS.mapColor(colors)), true));
            DYED_ALMENTRA_BRICK_STAIRS.put(colors, register(colors + "_almentra_brick_stairs", new EBStairBlock(getDyedAlmentraBricks(colors.getId()).value().defaultBlockState(), EBProperties.BlockP.ALMENTRA_BRICKS.mapColor(colors)), true));
            DYED_ALMENTRA_BRICK_VERTICAL_STAIRS.put(colors, register(colors + "_almentra_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.ALMENTRA_BRICKS.mapColor(colors)), true));
            DYED_ALMENTRA_BRICK_SLAB.put(colors, register(colors + "_almentra_brick_slab", new SlabBlock(EBProperties.BlockP.ALMENTRA_BRICKS.mapColor(colors)), true));

            DYED_TERRACOTTA_POTS.put(colors, register(colors + "_terracotta_pot", new TerracottaPotBlock(EBProperties.BlockP.TERRACOTTA_POT.mapColor(colors)), true));
        }
    }

    //SEA GLASS
    public static final Holder<Block> SEA_GLASS = register("sea_glass", new EBTransparentBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Holder<Block> ROSE_SEA_GLASS = register("rose_sea_glass", new EBTransparentBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Holder<Block> AQUA_SEA_GLASS = register("aqua_sea_glass", new EBTransparentBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Holder<Block> VERDANT_SEA_GLASS = register("verdant_sea_glass", new EBTransparentBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Holder<Block> SCARLET_SEA_GLASS = register("scarlet_sea_glass", new EBTransparentBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Holder<Block> FUCHSIA_SEA_GLASS = register("fuchsia_sea_glass", new EBTransparentBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Holder<Block> SEA_GLASS_PANE = register("sea_glass_pane", new SeaGlassPaneBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Holder<Block> ROSE_SEA_GLASS_PANE = register("rose_sea_glass_pane", new SeaGlassPaneBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Holder<Block> AQUA_SEA_GLASS_PANE = register("aqua_sea_glass_pane", new SeaGlassPaneBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Holder<Block> VERDANT_SEA_GLASS_PANE = register("verdant_sea_glass_pane", new SeaGlassPaneBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Holder<Block> SCARLET_SEA_GLASS_PANE = register("scarlet_sea_glass_pane", new SeaGlassPaneBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Holder<Block> FUCHSIA_SEA_GLASS_PANE = register("fuchsia_sea_glass_pane", new SeaGlassPaneBlock(EBProperties.BlockP.SEA_GLASS), true);

    //SOUL SANDSTONE
    public static final Holder<Block> SOUL_SANDSTONE = register("soul_sandstone", new Block(EBProperties.BlockP.SOUL_SANDSTONE), true);
    public static final Holder<Block> SOUL_SANDSTONE_STAIRS = register("soul_sandstone_stairs", new EBStairBlock(SOUL_SANDSTONE.value().defaultBlockState(), EBProperties.BlockP.SOUL_SANDSTONE), true);
    public static final Holder<Block> SOUL_SANDSTONE_SLAB = register("soul_sandstone_slab", new SlabBlock(EBProperties.BlockP.SOUL_SANDSTONE), true);
    public static final Holder<Block> SOUL_SANDSTONE_VERTICAL_STAIRS = register("soul_sandstone_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.SOUL_SANDSTONE), true);
    public static final Holder<Block> SOUL_SANDSTONE_WALL = register("soul_sandstone_wall", new WallBlock(EBProperties.BlockP.SOUL_SANDSTONE), true);

    public static final Holder<Block> CUT_SOUL_SANDSTONE = register("cut_soul_sandstone", new Block(EBProperties.BlockP.CUT_SOUL_SANDSTONE), true);
    public static final Holder<Block> CUT_SOUL_SANDSTONE_SLAB = register("cut_soul_sandstone_slab", new SlabBlock(EBProperties.BlockP.CUT_SOUL_SANDSTONE), true);
    public static final Holder<Block> CHISELED_SOUL_SANDSTONE = register("chiseled_soul_sandstone", new Block(EBProperties.BlockP.CUT_SOUL_SANDSTONE), true);

    public static final Holder<Block> SMOOTH_SOUL_SANDSTONE = register("smooth_soul_sandstone", new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Holder<Block> SMOOTH_SOUL_SANDSTONE_STAIRS = register("smooth_soul_sandstone_stairs", new EBStairBlock(SMOOTH_SOUL_SANDSTONE.value().defaultBlockState(), EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Holder<Block> SMOOTH_SOUL_SANDSTONE_SLAB = register("smooth_soul_sandstone_slab", new SlabBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Holder<Block> SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS = register("smooth_soul_sandstone_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);

    public static final Holder<Block> SOUL_MAGMA_BLOCK = register("soul_magma_block", new SoulMagmaBlock(EBProperties.BlockP.SOUL_MAGMA), true);

    //POLISHED SANDSTONE
    public static final Holder<Block> POLISHED_SANDSTONE = register("polished_sandstone", new Block(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Holder<Block> POLISHED_SANDSTONE_STAIRS = register("polished_sandstone_stairs", new EBStairBlock(POLISHED_SANDSTONE.value().defaultBlockState(), EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Holder<Block> POLISHED_SANDSTONE_SLAB = register("polished_sandstone_slab", new SlabBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Holder<Block> POLISHED_SANDSTONE_VERTICAL_STAIRS = register("polished_sandstone_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Holder<Block> POLISHED_SANDSTONE_WALL = register("polished_sandstone_wall", new WallBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);

    public static final Holder<Block> SANDSTONE_BRICKS = register("sandstone_bricks", new Block(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Holder<Block> SANDSTONE_BRICK_STAIRS = register("sandstone_brick_stairs", new EBStairBlock(SANDSTONE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Holder<Block> SANDSTONE_BRICK_SLAB = register("sandstone_brick_slab", new SlabBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Holder<Block> SANDSTONE_BRICK_VERTICAL_STAIRS = register("sandstone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Holder<Block> SANDSTONE_BRICK_WALL = register("sandstone_brick_wall", new WallBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);

    public static final Holder<Block> SANDSTONE_TILES = register("sandstone_tiles", new Block(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Holder<Block> SANDSTONE_TILE_STAIRS = register("sandstone_tile_stairs", new EBStairBlock(SANDSTONE_TILES.value().defaultBlockState(), EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Holder<Block> SANDSTONE_TILE_SLAB = register("sandstone_tile_slab", new SlabBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Holder<Block> SANDSTONE_TILE_VERTICAL_STAIRS = register("sandstone_tile_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Holder<Block> SANDSTONE_TILE_WALL = register("sandstone_tile_wall", new WallBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);

    public static final Holder<Block> CHISELED_SANDSTONE_BRICKS = register("chiseled_sandstone_bricks", new Block(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Holder<Block> ENGRAVED_SANDSTONE_BRICKS = register("engraved_sandstone_bricks", new Block(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Holder<Block> DECORATED_SANDSTONE_BRICKS = register("decorated_sandstone_bricks", new Block(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Holder<Block> SANDSTONE_PILLAR = register("sandstone_pillar", new RotatedPillarBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);

    //RED POLISHED SANDSTONE
    public static final Holder<Block> POLISHED_RED_SANDSTONE = register("polished_red_sandstone", new Block(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Holder<Block> POLISHED_RED_SANDSTONE_STAIRS = register("polished_red_sandstone_stairs", new EBStairBlock(POLISHED_RED_SANDSTONE.value().defaultBlockState(), EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Holder<Block> POLISHED_RED_SANDSTONE_SLAB = register("polished_red_sandstone_slab", new SlabBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Holder<Block> POLISHED_RED_SANDSTONE_VERTICAL_STAIRS = register("polished_red_sandstone_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Holder<Block> POLISHED_RED_SANDSTONE_WALL = register("polished_red_sandstone_wall", new WallBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);

    public static final Holder<Block> RED_SANDSTONE_BRICKS = register("red_sandstone_bricks", new Block(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Holder<Block> RED_SANDSTONE_BRICK_STAIRS = register("red_sandstone_brick_stairs", new EBStairBlock(RED_SANDSTONE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Holder<Block> RED_SANDSTONE_BRICK_SLAB = register("red_sandstone_brick_slab", new SlabBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Holder<Block> RED_SANDSTONE_BRICK_VERTICAL_STAIRS = register("red_sandstone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Holder<Block> RED_SANDSTONE_BRICK_WALL = register("red_sandstone_brick_wall", new WallBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);

    public static final Holder<Block> RED_SANDSTONE_TILES = register("red_sandstone_tiles", new Block(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Holder<Block> RED_SANDSTONE_TILE_STAIRS = register("red_sandstone_tile_stairs", new EBStairBlock(RED_SANDSTONE_TILES.value().defaultBlockState(), EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Holder<Block> RED_SANDSTONE_TILE_SLAB = register("red_sandstone_tile_slab", new SlabBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Holder<Block> RED_SANDSTONE_TILE_VERTICAL_STAIRS = register("red_sandstone_tile_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Holder<Block> RED_SANDSTONE_TILE_WALL = register("red_sandstone_tile_wall", new WallBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);

    public static final Holder<Block> CHISELED_RED_SANDSTONE_BRICKS = register("chiseled_red_sandstone_bricks", new Block(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Holder<Block> ENGRAVED_RED_SANDSTONE_BRICKS = register("engraved_red_sandstone_bricks", new Block(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Holder<Block> DECORATED_RED_SANDSTONE_BRICKS = register("decorated_red_sandstone_bricks", new Block(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Holder<Block> RED_SANDSTONE_PILLAR = register("red_sandstone_pillar", new RotatedPillarBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);

    //SOUL POLISHED SANDSTONE
    public static final Holder<Block> POLISHED_SOUL_SANDSTONE = register("polished_soul_sandstone", new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Holder<Block> POLISHED_SOUL_SANDSTONE_STAIRS = register("polished_soul_sandstone_stairs", new EBStairBlock(POLISHED_SOUL_SANDSTONE.value().defaultBlockState(), EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Holder<Block> POLISHED_SOUL_SANDSTONE_SLAB = register("polished_soul_sandstone_slab", new SlabBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Holder<Block> POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS = register("polished_soul_sandstone_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Holder<Block> POLISHED_SOUL_SANDSTONE_WALL = register("polished_soul_sandstone_wall", new WallBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);

    public static final Holder<Block> SOUL_SANDSTONE_BRICKS = register("soul_sandstone_bricks", new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Holder<Block> SOUL_SANDSTONE_BRICK_STAIRS = register("soul_sandstone_brick_stairs", new EBStairBlock(SOUL_SANDSTONE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Holder<Block> SOUL_SANDSTONE_BRICK_SLAB = register("soul_sandstone_brick_slab", new SlabBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Holder<Block> SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS = register("soul_sandstone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Holder<Block> SOUL_SANDSTONE_BRICK_WALL = register("soul_sandstone_brick_wall", new WallBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);

    public static final Holder<Block> SOUL_SANDSTONE_TILES = register("soul_sandstone_tiles", new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Holder<Block> SOUL_SANDSTONE_TILE_STAIRS = register("soul_sandstone_tile_stairs", new EBStairBlock(SOUL_SANDSTONE_TILES.value().defaultBlockState(), EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Holder<Block> SOUL_SANDSTONE_TILE_SLAB = register("soul_sandstone_tile_slab", new SlabBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Holder<Block> SOUL_SANDSTONE_TILE_VERTICAL_STAIRS = register("soul_sandstone_tile_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Holder<Block> SOUL_SANDSTONE_TILE_WALL = register("soul_sandstone_tile_wall", new WallBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);

    public static final Holder<Block> CHISELED_SOUL_SANDSTONE_BRICKS = register("chiseled_soul_sandstone_bricks", new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Holder<Block> ENGRAVED_SOUL_SANDSTONE_BRICKS = register("engraved_soul_sandstone_bricks", new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Holder<Block> DECORATED_SOUL_SANDSTONE_BRICKS = register("decorated_soul_sandstone_bricks", new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Holder<Block> SOUL_SANDSTONE_PILLAR = register("soul_sandstone_pillar", new RotatedPillarBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);

    //LADDERS
    public static final Holder<Block> SPRUCE_LADDER = register("spruce_ladder", new EBLadderBlock(EBProperties.BlockP.GENERIC_LADDER), true);
    public static final Holder<Block> BIRCH_LADDER = register("birch_ladder", new EBLadderBlock(EBProperties.BlockP.GENERIC_LADDER), true);
    public static final Holder<Block> JUNGLE_LADDER = register("jungle_ladder", new EBLadderBlock(EBProperties.BlockP.GENERIC_LADDER), true);
    public static final Holder<Block> ACACIA_LADDER = register("acacia_ladder", new EBLadderBlock(EBProperties.BlockP.GENERIC_LADDER), true);
    public static final Holder<Block> DARK_OAK_LADDER = register("dark_oak_ladder", new EBLadderBlock(EBProperties.BlockP.GENERIC_LADDER), true);
    public static final Holder<Block> MANGROVE_LADDER = register("mangrove_ladder", new EBLadderBlock(EBProperties.BlockP.GENERIC_LADDER), true);
    public static final Holder<Block> CHERRY_LADDER = register("cherry_ladder", new EBLadderBlock(EBProperties.BlockP.CHERRY_LADDER), true);
    public static final Holder<Block> BAMBOO_LADDER = register("bamboo_ladder", new EBLadderBlock(EBProperties.BlockP.BAMBOO_LADDER), true);
    public static final Holder<Block> CRIMSON_LADDER = register("crimson_ladder", new EBLadderBlock(EBProperties.BlockP.CRIMSON_LADDER), true);
    public static final Holder<Block> WARPED_LADDER = register("warped_ladder", new EBLadderBlock(EBProperties.BlockP.WARPED_LADDER), true);
    public static final Holder<Block> ANCIENT_LADDER = register("ancient_ladder", new EBLadderBlock(EBProperties.BlockP.ANCIENT_LADDER), true);
    public static final Holder<Block> GLOOM_LADDER = register("gloom_ladder", new EBLadderBlock(EBProperties.BlockP.GLOOM_LADDER), true);

    //CRAFTING TABLES
    public static final Holder<Block> SPRUCE_CRAFTING_TABLE = register("spruce_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> BIRCH_CRAFTING_TABLE = register("birch_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> JUNGLE_CRAFTING_TABLE = register("jungle_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> ACACIA_CRAFTING_TABLE = register("acacia_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> DARK_OAK_CRAFTING_TABLE = register("dark_oak_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> MANGROVE_CRAFTING_TABLE = register("mangrove_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Holder<Block> CHERRY_CRAFTING_TABLE = register("cherry_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Holder<Block> BAMBOO_CRAFTING_TABLE = register("bamboo_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.BAMBOO_WOOD), true);
    public static final Holder<Block> CRIMSON_CRAFTING_TABLE = register("crimson_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.CRIMSON_WOOD), true);
    public static final Holder<Block> WARPED_CRAFTING_TABLE = register("warped_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.WARPED_WOOD), true);
    public static final Holder<Block> ANCIENT_CRAFTING_TABLE = register("ancient_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Holder<Block> GLOOM_CRAFTING_TABLE = register("gloom_crafting_table", new EBCraftingTableBlock(EBProperties.BlockP.CHERRY_WOOD), true);

    //BOOKSHELF
    public static final Holder<Block> SPRUCE_BOOKSHELF = register("spruce_bookshelf", new EBBookshelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Holder<Block> BIRCH_BOOKSHELF = register("birch_bookshelf", new EBBookshelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Holder<Block> JUNGLE_BOOKSHELF = register("jungle_bookshelf", new EBBookshelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Holder<Block> ACACIA_BOOKSHELF = register("acacia_bookshelf", new EBBookshelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Holder<Block> DARK_OAK_BOOKSHELF = register("dark_oak_bookshelf", new EBBookshelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Holder<Block> MANGROVE_BOOKSHELF = register("mangrove_bookshelf", new EBBookshelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Holder<Block> CHERRY_BOOKSHELF = register("cherry_bookshelf", new EBBookshelfBlock(EBProperties.BlockP.CHERRY_SHELF), true);
    public static final Holder<Block> BAMBOO_BOOKSHELF = register("bamboo_bookshelf", new EBBookshelfBlock(EBProperties.BlockP.BAMBOO_SHELF), true);
    public static final Holder<Block> CRIMSON_BOOKSHELF = register("crimson_bookshelf", new EBBookshelfBlock(EBProperties.BlockP.CRIMSON_SHELF), true);
    public static final Holder<Block> WARPED_BOOKSHELF = register("warped_bookshelf", new EBBookshelfBlock(EBProperties.BlockP.WARPED_SHELF), true);
    public static final Holder<Block> ANCIENT_BOOKSHELF = register("ancient_bookshelf", new EBBookshelfBlock(EBProperties.BlockP.CHERRY_SHELF), true);
    public static final Holder<Block> GLOOM_BOOKSHELF = register("gloom_bookshelf", new EBBookshelfBlock(EBProperties.BlockP.CHERRY_SHELF), true);

    //DECORATIVE SHELF
    public static final Holder<Block> OAK_DECORATIVE_SHELF = register("oak_decorative_shelf", new DecorativeShelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Holder<Block> SPRUCE_DECORATIVE_SHELF = register("spruce_decorative_shelf", new DecorativeShelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Holder<Block> BIRCH_DECORATIVE_SHELF = register("birch_decorative_shelf", new DecorativeShelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Holder<Block> JUNGLE_DECORATIVE_SHELF = register("jungle_decorative_shelf", new DecorativeShelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Holder<Block> ACACIA_DECORATIVE_SHELF = register("acacia_decorative_shelf", new DecorativeShelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Holder<Block> DARK_OAK_DECORATIVE_SHELF = register("dark_oak_decorative_shelf", new DecorativeShelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Holder<Block> MANGROVE_DECORATIVE_SHELF = register("mangrove_decorative_shelf", new DecorativeShelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Holder<Block> CHERRY_DECORATIVE_SHELF = register("cherry_decorative_shelf", new DecorativeShelfBlock(EBProperties.BlockP.CHERRY_SHELF), true);
    public static final Holder<Block> BAMBOO_DECORATIVE_SHELF = register("bamboo_decorative_shelf", new DecorativeShelfBlock(EBProperties.BlockP.BAMBOO_SHELF), true);
    public static final Holder<Block> CRIMSON_DECORATIVE_SHELF = register("crimson_decorative_shelf", new DecorativeShelfBlock(EBProperties.BlockP.CRIMSON_SHELF), true);
    public static final Holder<Block> WARPED_DECORATIVE_SHELF = register("warped_decorative_shelf", new DecorativeShelfBlock(EBProperties.BlockP.WARPED_SHELF), true);
    public static final Holder<Block> ANCIENT_DECORATIVE_SHELF = register("ancient_decorative_shelf", new DecorativeShelfBlock(EBProperties.BlockP.CHERRY_SHELF), true);
    public static final Holder<Block> GLOOM_DECORATIVE_SHELF = register("gloom_decorative_shelf", new DecorativeShelfBlock(EBProperties.BlockP.CHERRY_SHELF), true);
    
    //DECORATIVES
    public static final Holder<Block> WOODEN_MUG = register("wooden_mug", new WoodenMugBlock(EBProperties.BlockP.WOODEN_MUG), true);
    public static final Holder<Block> GLASS_JAR = register("glass_jar", new GlassJarBlock(EBProperties.BlockP.GLASS_JAR), true);
    public static final Holder<Block> GLASS_JAR_OF_FIRE = register("glass_jar_of_fire", new GlassJarBlock(EBProperties.BlockP.FIRE_GLASS_JAR), true);
    public static final Holder<Block> GLASS_JAR_OF_SOUL_FIRE = register("glass_jar_of_soul_fire", new GlassJarBlock(EBProperties.BlockP.SOUL_FIRE_GLASS_JAR), true);

    //STONE VARIANTS
    public static final Holder<Block> GRANITE_BRICKS = register("granite_bricks", new Block(EBProperties.BlockP.POLISHED_GRANITE), true);
    public static final Holder<Block> GRANITE_BRICK_STAIRS = register("granite_brick_stairs", new EBStairBlock(GRANITE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.POLISHED_GRANITE), true);
    public static final Holder<Block> GRANITE_BRICK_SLAB = register("granite_brick_slab", new SlabBlock(EBProperties.BlockP.POLISHED_GRANITE), true);
    public static final Holder<Block> GRANITE_BRICK_VERTICAL_STAIRS = register("granite_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.POLISHED_GRANITE), true);
    public static final Holder<Block> GRANITE_BRICK_WALL = register("granite_brick_wall", new WallBlock(EBProperties.BlockP.POLISHED_GRANITE), true);
    public static final Holder<Block> CRACKED_GRANITE_BRICKS = register("cracked_granite_bricks", new Block(EBProperties.BlockP.POLISHED_GRANITE), true);

    public static final Holder<Block> ANDESITE_BRICKS = register("andesite_bricks", new Block(EBProperties.BlockP.POLISHED_ANDESITE), true);
    public static final Holder<Block> ANDESITE_BRICK_STAIRS = register("andesite_brick_stairs", new EBStairBlock(ANDESITE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.POLISHED_ANDESITE), true);
    public static final Holder<Block> ANDESITE_BRICK_SLAB = register("andesite_brick_slab", new SlabBlock(EBProperties.BlockP.POLISHED_ANDESITE), true);
    public static final Holder<Block> ANDESITE_BRICK_VERTICAL_STAIRS = register("andesite_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.POLISHED_ANDESITE), true);
    public static final Holder<Block> ANDESITE_BRICK_WALL = register("andesite_brick_wall", new WallBlock(EBProperties.BlockP.POLISHED_ANDESITE), true);
    public static final Holder<Block> CRACKED_ANDESITE_BRICKS = register("cracked_andesite_bricks", new Block(EBProperties.BlockP.POLISHED_ANDESITE), true);

    public static final Holder<Block> DIORITE_BRICKS = register("diorite_bricks", new Block(EBProperties.BlockP.POLISHED_DIORITE), true);
    public static final Holder<Block> DIORITE_BRICK_STAIRS = register("diorite_brick_stairs", new EBStairBlock(DIORITE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.POLISHED_DIORITE), true);
    public static final Holder<Block> DIORITE_BRICK_SLAB = register("diorite_brick_slab", new SlabBlock(EBProperties.BlockP.POLISHED_DIORITE), true);
    public static final Holder<Block> DIORITE_BRICK_VERTICAL_STAIRS = register("diorite_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.POLISHED_DIORITE), true);
    public static final Holder<Block> DIORITE_BRICK_WALL = register("diorite_brick_wall", new WallBlock(EBProperties.BlockP.POLISHED_DIORITE), true);
    public static final Holder<Block> CRACKED_DIORITE_BRICKS = register("cracked_diorite_bricks", new Block(EBProperties.BlockP.POLISHED_DIORITE), true);

    //BRICKS
    public static final Holder<Block> SMOOTH_BRICKS = register("smooth_bricks", new Block(EBProperties.BlockP.BRICKS), true);
    public static final Holder<Block> SMOOTH_BRICK_STAIRS = register("smooth_brick_stairs", new EBStairBlock(SMOOTH_BRICKS.value().defaultBlockState(), EBProperties.BlockP.BRICKS), true);
    public static final Holder<Block> SMOOTH_BRICK_SLAB = register("smooth_brick_slab", new SlabBlock(EBProperties.BlockP.BRICKS), true);
    public static final Holder<Block> SMOOTH_BRICK_VERTICAL_STAIRS = register("smooth_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.BRICKS), true);
    public static final Holder<Block> SMOOTH_BRICK_WALL = register("smooth_brick_wall", new WallBlock(EBProperties.BlockP.BRICKS), true);
    public static final Holder<Block> HERRINGBONE_BRICKS = register("herringbone_bricks", new Block(EBProperties.BlockP.BRICKS), true);
    public static final Holder<Block> SMOOTH_HERRINGBONE_BRICKS = register("smooth_herringbone_bricks", new Block(EBProperties.BlockP.BRICKS), true);
    public static final Holder<Block> CRACKED_SMOOTH_BRICKS = register("cracked_smooth_bricks", new Block(EBProperties.BlockP.BRICKS), true);
    public static final Holder<Block> CRACKED_BRICKS = register("cracked_bricks", new Block(EBProperties.BlockP.BRICKS), true);

    //BRIMSTONE
    public static final Holder<Block> BRIMSTONE = register("brimstone", new Block(EBProperties.BlockP.BRIMSTONE), true);
    public static final Holder<Block> BRIMSTONE_STAIRS = register("brimstone_stairs", new EBStairBlock(BRIMSTONE.value().defaultBlockState(), EBProperties.BlockP.BRIMSTONE), true);
    public static final Holder<Block> BRIMSTONE_SLAB = register("brimstone_slab", new SlabBlock(EBProperties.BlockP.BRIMSTONE), true);
    public static final Holder<Block> BRIMSTONE_VERTICAL_STAIRS = register("brimstone_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.BRIMSTONE), true);
    public static final Holder<Block> BRIMSTONE_WALL = register("brimstone_wall", new WallBlock(EBProperties.BlockP.BRIMSTONE), true);

    public static final Holder<Block> POLISHED_BRIMSTONE = register("polished_brimstone", new Block(EBProperties.BlockP.POLISHED_BRIMSTONE), true);
    public static final Holder<Block> POLISHED_BRIMSTONE_STAIRS = register("polished_brimstone_stairs", new EBStairBlock(POLISHED_BRIMSTONE.value().defaultBlockState(), EBProperties.BlockP.POLISHED_BRIMSTONE), true);
    public static final Holder<Block> POLISHED_BRIMSTONE_SLAB = register("polished_brimstone_slab", new SlabBlock(EBProperties.BlockP.POLISHED_BRIMSTONE), true);
    public static final Holder<Block> POLISHED_BRIMSTONE_VERTICAL_STAIRS = register("polished_brimstone_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.POLISHED_BRIMSTONE), true);

    public static final Holder<Block> BRIMSTONE_BRICKS = register("brimstone_bricks", new Block(EBProperties.BlockP.BRIMSTONE_BRICKS), true);
    public static final Holder<Block> BRIMSTONE_BRICK_STAIRS = register("brimstone_brick_stairs", new EBStairBlock(BRIMSTONE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.BRIMSTONE_BRICKS), true);
    public static final Holder<Block> BRIMSTONE_BRICK_SLAB = register("brimstone_brick_slab", new SlabBlock(EBProperties.BlockP.BRIMSTONE_BRICKS), true);
    public static final Holder<Block> BRIMSTONE_BRICK_VERTICAL_STAIRS = register("brimstone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.BRIMSTONE_BRICKS), true);
    public static final Holder<Block> CRACKED_BRIMSTONE_BRICKS = register("cracked_brimstone_bricks", new Block(EBProperties.BlockP.BRIMSTONE_BRICKS), true);

    public static final Holder<Block> BRIMSTONE_TILES = register("brimstone_tiles", new Block(EBProperties.BlockP.BRIMSTONE_TILES), true);
    public static final Holder<Block> BRIMSTONE_TILE_STAIRS = register("brimstone_tile_stairs", new EBStairBlock(BRIMSTONE_TILES.value().defaultBlockState(), EBProperties.BlockP.BRIMSTONE_TILES), true);
    public static final Holder<Block> BRIMSTONE_TILE_SLAB = register("brimstone_tile_slab", new SlabBlock(EBProperties.BlockP.BRIMSTONE_TILES), true);
    public static final Holder<Block> BRIMSTONE_TILE_VERTICAL_STAIRS = register("brimstone_tile_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.BRIMSTONE_TILES), true);

    public static final Holder<Block> BRIMSTONE_PILLAR = register("brimstone_pillar", new RotatedPillarBlock(EBProperties.BlockP.BRIMSTONE_BRICKS), true);
    public static final Holder<Block> BRIMSTONE_LAMP = register("brimstone_lamp", new Block(EBProperties.BlockP.BRIMSTONE_LAMP), true);
    public static final Holder<Block> BRIMSTONE_WINDOW = register("brimstone_window", new Block(EBProperties.BlockP.BRIMSTONE_LAMP), true);

    //SMOOTH STONE
    public static final Holder<Block> POLISHED_STONE = register("polished_stone", new Block(EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Holder<Block> POLISHED_STONE_STAIRS = register("polished_stone_stairs", new EBStairBlock(POLISHED_STONE.value().defaultBlockState(), EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Holder<Block> POLISHED_STONE_SLAB = register("polished_stone_slab", new SlabBlock(EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Holder<Block> POLISHED_STONE_VERTICAL_STAIRS = register("polished_stone_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.SMOOTH_STONE), true);

    public static final Holder<Block> SMOOTH_STONE_BRICKS = register("smooth_stone_bricks", new Block(EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Holder<Block> SMOOTH_STONE_BRICK_STAIRS = register("smooth_stone_brick_stairs", new EBStairBlock(SMOOTH_STONE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Holder<Block> SMOOTH_STONE_BRICK_SLAB = register("smooth_stone_brick_slab", new SlabBlock(EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Holder<Block> SMOOTH_STONE_BRICK_VERTICAL_STAIRS = register("smooth_stone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Holder<Block> CRACKED_SMOOTH_STONE_BRICKS = register("cracked_smooth_stone_bricks", new Block(EBProperties.BlockP.SMOOTH_STONE), true);

    public static final Holder<Block> SMOOTH_STONE_TILES = register("smooth_stone_tiles", new Block(EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Holder<Block> SMOOTH_STONE_TILE_STAIRS = register("smooth_stone_tile_stairs", new EBStairBlock(SMOOTH_STONE_TILES.value().defaultBlockState(), EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Holder<Block> SMOOTH_STONE_TILE_SLAB = register("smooth_stone_tile_slab", new SlabBlock(EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Holder<Block> SMOOTH_STONE_TILE_VERTICAL_STAIRS = register("smooth_stone_tile_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Holder<Block> CRACKED_SMOOTH_STONE_TILES = register("cracked_smooth_stone_tiles", new Block(EBProperties.BlockP.SMOOTH_STONE), true);

    public static final Holder<Block> CHISELED_SMOOTH_STONE_BRICKS = register("chiseled_smooth_stone_bricks", new Block(EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Holder<Block> SMOOTH_STONE_PILLAR = register("smooth_stone_pillar", new RotatedPillarBlock(EBProperties.BlockP.SMOOTH_STONE), true);

    //ASPHALT
    public static final Holder<Block> ASPHALT = register("asphalt", new AsphaltBlock(EBProperties.BlockP.ASPHALT), true);
    public static final Holder<Block> ASPHALT_STAIRS = register("asphalt_stairs", new AsphaltStairsBlock(ASPHALT.value().defaultBlockState(), EBProperties.BlockP.ASPHALT), true);
    public static final Holder<Block> ASPHALT_SLAB = register("asphalt_slab", new AsphaltSlabBlock(EBProperties.BlockP.ASPHALT), true);
    public static final Holder<Block> ASPHALT_VERTICAL_STAIRS = register("asphalt_vertical_stairs", new AsphaltVerticalStairsBlock(EBProperties.BlockP.ASPHALT), true);

    //NATURE
    public static final Holder<Block> ROSE = register("rose", new FlowerBlock(MobEffects.HEALTH_BOOST, 20, EBProperties.BlockP.ROSE), true);
    public static final Holder<Block> POTTED_ROSE = register("potted_rose", flowerPot(EBBlocks.ROSE), false);
    public static final Holder<Block> CYAN_ROSE = register("cyan_rose", new FlowerBlock(MobEffects.INVISIBILITY, 10, EBProperties.BlockP.CYAN_ROSE), true);
    public static final Holder<Block> POTTED_CYAN_ROSE = register("potted_cyan_rose", flowerPot(EBBlocks.CYAN_ROSE), false);
    public static final Holder<Block> WHITE_ROSE = register("white_rose", new FlowerBlock(MobEffects.LUCK, 30, EBProperties.BlockP.WHITE_ROSE), true);
    public static final Holder<Block> POTTED_WHITE_ROSE = register("potted_white_rose", flowerPot(EBBlocks.WHITE_ROSE), false);
    public static final Holder<Block> MOSS_PASTE = register("moss_paste", new GlowLichenBlock(EBProperties.BlockP.MOSS_PASTE), true);

    //PAPER
    public static final Holder<Block> PAPER_BLOCK = register("paper_block", new Block(EBProperties.BlockP.PAPER), true);

    public static final Holder<Block> THICK_PAPER_BLOCK = register("thick_paper_block", new Block(EBProperties.BlockP.PAPER), true);
    public static final Holder<Block> THICK_PAPER_STAIRS = register("thick_paper_stairs", new EBStairBlock(THICK_PAPER_BLOCK.value().defaultBlockState(), EBProperties.BlockP.PAPER), true);
    public static final Holder<Block> THICK_PAPER_SLAB = register("thick_paper_slab", new SlabBlock(EBProperties.BlockP.PAPER), true);
    public static final Holder<Block> THICK_PAPER_VERTICAL_STAIRS = register("thick_paper_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.PAPER), true);
    public static final Holder<Block> THICK_DIVIDED_PAPER_BLOCK = register("thick_divided_paper_block", new Block(EBProperties.BlockP.PAPER), true);
    public static final Holder<Block> THICK_DIAGONAL_PAPER_BLOCK = register("thick_diagonal_paper_block", new EBHorizontalFacingBlock(EBProperties.BlockP.PAPER), true);

    public static final Holder<Block> THIN_PAPER_BLOCK = register("thin_paper_block", new Block(EBProperties.BlockP.PAPER), true);
    public static final Holder<Block> THIN_PAPER_STAIRS = register("thin_paper_stairs", new EBStairBlock(THIN_PAPER_BLOCK.value().defaultBlockState(), EBProperties.BlockP.PAPER), true);
    public static final Holder<Block> THIN_PAPER_SLAB = register("thin_paper_slab", new SlabBlock(EBProperties.BlockP.PAPER), true);
    public static final Holder<Block> THIN_PAPER_VERTICAL_STAIRS = register("thin_paper_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.PAPER), true);
    public static final Holder<Block> THIN_DIVIDED_PAPER_BLOCK = register("thin_divided_paper_block", new Block(EBProperties.BlockP.PAPER), true);
    public static final Holder<Block> THIN_DIAGONAL_PAPER_BLOCK = register("thin_diagonal_paper_block", new EBHorizontalFacingBlock(EBProperties.BlockP.PAPER), true);

    //MISC
    public static final Holder<Block> GRUMPY_CARVED_PUMPKIN = register("grumpy_carved_pumpkin", new EBCarvedPumpkinBlock(EBProperties.BlockP.PUMPKIN, true), true);
    public static final Holder<Block> CHEERFUL_CARVED_PUMPKIN = register("cheerful_carved_pumpkin", new EBCarvedPumpkinBlock(EBProperties.BlockP.PUMPKIN, true), true);
    public static final Holder<Block> WICKED_CARVED_PUMPKIN = register("wicked_carved_pumpkin", new EBCarvedPumpkinBlock(EBProperties.BlockP.PUMPKIN, true), true);

    public static final Holder<Block> GRUMPY_JACK_O_LANTERN = register("grumpy_jack_o_lantern", new EBCarvedPumpkinBlock(EBProperties.BlockP.JACK_O, false), true);
    public static final Holder<Block> CHEERFUL_JACK_O_LANTERN = register("cheerful_jack_o_lantern", new EBCarvedPumpkinBlock(EBProperties.BlockP.JACK_O, false), true);
    public static final Holder<Block> WICKED_JACK_O_LANTERN = register("wicked_jack_o_lantern", new EBCarvedPumpkinBlock(EBProperties.BlockP.JACK_O, false), true);

    public static final Holder<Block> SOUL_JACK_O_LANTERN = register("soul_jack_o_lantern", new EBCarvedPumpkinBlock(EBProperties.BlockP.SOUL_JACK_O, false), true);
    public static final Holder<Block> GRUMPY_SOUL_JACK_O_LANTERN = register("grumpy_soul_jack_o_lantern", new EBCarvedPumpkinBlock(EBProperties.BlockP.SOUL_JACK_O, false), true);
    public static final Holder<Block> CHEERFUL_SOUL_JACK_O_LANTERN = register("cheerful_soul_jack_o_lantern", new EBCarvedPumpkinBlock(EBProperties.BlockP.SOUL_JACK_O, false), true);
    public static final Holder<Block> WICKED_SOUL_JACK_O_LANTERN = register("wicked_soul_jack_o_lantern", new EBCarvedPumpkinBlock(EBProperties.BlockP.SOUL_JACK_O, false), true);

    public static final Holder<Block> WEEPING_CANDLE = register("weeping_candle", new ParticleCandleBlock(ParticleTypes.CRIMSON_SPORE, EBProperties.BlockP.PARTICLE_CANDLE), true);
    public static final Holder<Block> TWISTING_CANDLE = register("twisting_candle", new ParticleCandleBlock(ParticleTypes.WARPED_SPORE, EBProperties.BlockP.PARTICLE_CANDLE), true);

    public static final Holder<Block> IRON_GRATE = register("iron_grate", new EBWaterloggedTransparentBlock(EBProperties.BlockP.IRON_GRATE), true);
    public static final Holder<Block> GOLD_GRATE = register("gold_grate", new EBWaterloggedTransparentBlock(EBProperties.BlockP.GOLD_GRATE), true);

    public static final Holder<Block> ARMADILLO_SCUTE_BLOCK = register("armadillo_scute_block", new Block(EBProperties.BlockP.ARMADILLO_SCUTE_BLOCK), true);
    public static final Holder<Block> ARMADILLO_SCUTE_STAIRS = register("armadillo_scute_stairs", new EBStairBlock(ARMADILLO_SCUTE_BLOCK.value().defaultBlockState(), EBProperties.BlockP.ARMADILLO_SCUTE_BLOCK), true);
    public static final Holder<Block> ARMADILLO_SCUTE_SLAB = register("armadillo_scute_slab", new SlabBlock(EBProperties.BlockP.ARMADILLO_SCUTE_BLOCK), true);
    public static final Holder<Block> ARMADILLO_SCUTE_VERTICAL_STAIRS = register("armadillo_scute_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.ARMADILLO_SCUTE_BLOCK), true);

    public static final Holder<Block> REACHING_LANTERN = register("reaching_lantern", new ReachingLanternBlock(EBProperties.BlockP.REACHING_LANTERN), true);
    public static final Holder<Block> AMETHYST_LAMP = register("amethyst_lamp", new Block(EBProperties.BlockP.LAMP), true);

    public static final Holder<Block> BONE_BRICKS = register("bone_bricks", new Block(EBProperties.BlockP.BONE), true);
    public static final Holder<Block> BONE_BRICK_STAIRS = register("bone_brick_stairs", new EBStairBlock(BONE_BRICKS.value().defaultBlockState(), EBProperties.BlockP.BONE), true);
    public static final Holder<Block> BONE_BRICK_SLAB = register("bone_brick_slab", new SlabBlock(EBProperties.BlockP.BONE), true);
    public static final Holder<Block> BONE_BRICK_VERTICAL_STAIRS = register("bone_brick_vertical_stairs", new VerticalStairsBlock(EBProperties.BlockP.BONE), true);
    public static final Holder<Block> BONE_BRICK_WALL = register("bone_brick_wall", new WallBlock(EBProperties.BlockP.BONE), true);

    public static final Holder<Block> LOGO_BLOCK = register("logo_block", new Block(EBProperties.BlockP.INDESTRUCTIBLE), true);

    private static Holder<Block> register(String id, Block block, boolean hasItem) {
        return Services.REGISTRY.registerBlock(id, block, hasItem);
    }
    
    private static Holder<Block> registerConfigurable(String id, Block block, boolean hasItem) {
        return Services.REGISTRY.registerBlock(id, block, hasItem);
    }

    private static FlowerPotBlock flowerPot(Holder<Block> block, FeatureFlag... flags) {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY);
        if (flags.length > 0) {
            properties = properties.requiredFeatures(flags);
        }

        return new FlowerPotBlock(block.value(), properties);
    }

    public static void loadBlocks() {
    }
}
