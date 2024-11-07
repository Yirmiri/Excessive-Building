package net.yirmiri.excessive_building.registry;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.yirmiri.excessive_building.block.EBSaplingBlock;
import net.yirmiri.excessive_building.block.*;
import net.yirmiri.excessive_building.block.configurable.*;
import net.yirmiri.excessive_building.block.sign.EBHangingSignBlock;
import net.yirmiri.excessive_building.block.sign.EBSignBlock;
import net.yirmiri.excessive_building.block.sign.EBWallHangingSignBlock;
import net.yirmiri.excessive_building.block.sign.EBWallSignBlock;
import net.yirmiri.excessive_building.platform.Services;
import net.yirmiri.excessive_building.util.EBBlockSetTypes;
import net.yirmiri.excessive_building.util.EBProperties;
import net.yirmiri.excessive_building.worldgen.sapling.AncientSaplingGenerator;
import net.yirmiri.excessive_building.worldgen.sapling.GloomSaplingGenerator;

import java.util.HashMap;
import java.util.Optional;
import java.util.function.Supplier;

public class EBBlocks {

    public static final Supplier<Block> OAK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"oak_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), true);
    public static final Supplier<Block> SPRUCE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"spruce_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)), true);
    public static final Supplier<Block> BIRCH_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"birch_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)), true);
    public static final Supplier<Block> JUNGLE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"jungle_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)), true);
    public static final Supplier<Block> ACACIA_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"acacia_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)), true);
    public static final Supplier<Block> DARK_OAK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"dark_oak_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)), true);
    public static final Supplier<Block> MANGROVE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"mangrove_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)), true);
    public static final Supplier<Block> CHERRY_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"cherry_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)), true);
    public static final Supplier<Block> BAMBOO_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"bamboo_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)), true);
    public static final Supplier<Block> CRIMSON_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"crimson_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)), true);
    public static final Supplier<Block> WARPED_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"warped_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)), true);

    public static final Supplier<Block> MUD_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"mud_brick_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)), true);
    public static final Supplier<Block> STONE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"stone_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.STONE)), true);
    public static final Supplier<Block> COBBLESTONE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"cobblestone_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)), true);
    public static final Supplier<Block> MOSSY_COBBLESTONE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"mossy_cobblestone_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)), true);
    public static final Supplier<Block> STONE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"stone_brick_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), true);
    public static final Supplier<Block> MOSSY_STONE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"mossy_stone_brick_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)), true);
    public static final Supplier<Block> COBBLED_DEEPSLATE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"cobbled_deepslate_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)), true);
    public static final Supplier<Block> DEEPSLATE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"deepslate_brick_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)), true);
    public static final Supplier<Block> DEEPSLATE_TILE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"deepslate_tile_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)), true);
    public static final Supplier<Block> POLISHED_DEEPSLATE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"polished_deepslate_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE)), true);
    public static final Supplier<Block> QUARTZ_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"quartz_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)), true);
    public static final Supplier<Block> SMOOTH_QUARTZ_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"smooth_quartz_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ)), true);
    public static final Supplier<Block> BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"brick_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)), true);
    public static final Supplier<Block> SANDSTONE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"sandstone_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)), true);
    public static final Supplier<Block> SMOOTH_SANDSTONE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"smooth_sandstone_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE)), true);
    public static final Supplier<Block> RED_SANDSTONE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"red_sandstone_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)), true);
    public static final Supplier<Block> SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"smooth_red_sandstone_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE)), true);
    public static final Supplier<Block> BLACKSTONE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"blackstone_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)), true);
    public static final Supplier<Block> POLISHED_BLACKSTONE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"polished_blackstone_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE)), true);
    public static final Supplier<Block> POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"polished_blackstone_brick_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)), true);
    public static final Supplier<Block> PRISMARINE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"prismarine_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)), true);
    public static final Supplier<Block> DARK_PRISMARINE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"dark_prismarine_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)), true);
    public static final Supplier<Block> PRISMARINE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"prismarine_brick_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)), true);
    public static final Supplier<Block> NETHER_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"nether_brick_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)), true);
    public static final Supplier<Block> RED_NETHER_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"red_nether_brick_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS)), true);
    public static final Supplier<Block> ANDESITE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"andesite_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)), true);
    public static final Supplier<Block> GRANITE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"granite_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)), true);
    public static final Supplier<Block> DIORITE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"diorite_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)), true);
    public static final Supplier<Block> POLISHED_ANDESITE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"polished_andesite_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)), true);
    public static final Supplier<Block> POLISHED_GRANITE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"polished_granite_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)), true);
    public static final Supplier<Block> POLISHED_DIORITE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"polished_diorite_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)), true);
    public static final Supplier<Block> PURPUR_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"purpur_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)), true);
    public static final Supplier<Block> END_STONE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"end_stone_brick_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)), true);

    public static final Supplier<Block> CUT_COPPER_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"cut_copper_vertical_stairs", () -> new OxidizableVerticalStairsBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(Blocks.CUT_COPPER)), true);
    public static final Supplier<Block> EXPOSED_CUT_COPPER_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"exposed_cut_copper_vertical_stairs", () -> new OxidizableVerticalStairsBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(Blocks.EXPOSED_CUT_COPPER)), true);
    public static final Supplier<Block> WEATHERED_CUT_COPPER_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"weathered_cut_copper_vertical_stairs", () -> new OxidizableVerticalStairsBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(Blocks.WEATHERED_CUT_COPPER)), true);
    public static final Supplier<Block> OXIDIZED_CUT_COPPER_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"oxidized_cut_copper_vertical_stairs", () -> new OxidizableVerticalStairsBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(Blocks.OXIDIZED_CUT_COPPER)), true);
    public static final Supplier<Block> WAXED_CUT_COPPER_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"waxed_cut_copper_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_CUT_COPPER)), true);
    public static final Supplier<Block> WAXED_EXPOSED_CUT_COPPER_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"waxed_exposed_cut_copper_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_CUT_COPPER)), true);
    public static final Supplier<Block> WAXED_WEATHERED_CUT_COPPER_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"waxed_weathered_cut_copper_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_CUT_COPPER)), true);
    public static final Supplier<Block> WAXED_OXIDIZED_CUT_COPPER_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"waxed_oxidized_cut_copper_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER)), true);

    //VANILLA ADDITIONS
    public static final Supplier<Block> QUARTZ_BRICK_STAIRS = register("quartz_brick_stairs", () -> new EBStairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(), EBProperties.BlockP.QUARTZ_BRICKS), true);
    public static final Supplier<Block> QUARTZ_BRICK_SLAB = register("quartz_brick_slab", () -> new SlabBlock(EBProperties.BlockP.QUARTZ_BRICKS), true);
    public static final Supplier<Block> QUARTZ_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"quartz_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.QUARTZ_BRICKS), true);
    public static final Supplier<Block> QUARTZ_BRICK_WALL = register("quartz_brick_wall", () -> new WallBlock(EBProperties.BlockP.QUARTZ_BRICKS), true);

    public static final Supplier<Block> CRACKED_MUD_BRICKS = register("cracked_mud_bricks", () -> new Block(EBProperties.BlockP.MUD_BRICKS), true);

    //MOSAIC WOOD
    public static final Supplier<Block> OAK_MOSAIC = register("oak_mosaic", () -> new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> OAK_MOSAIC_STAIRS = register("oak_mosaic_stairs", () -> new EBStairBlock(OAK_MOSAIC.get().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> OAK_MOSAIC_SLAB = register("oak_mosaic_slab", () -> new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> OAK_MOSAIC_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"oak_mosaic_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Supplier<Block> SPRUCE_MOSAIC = register("spruce_mosaic", () -> new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> SPRUCE_MOSAIC_STAIRS = register("spruce_mosaic_stairs", () -> new EBStairBlock(SPRUCE_MOSAIC.get().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> SPRUCE_MOSAIC_SLAB = register("spruce_mosaic_slab", () -> new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> SPRUCE_MOSAIC_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"spruce_mosaic_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Supplier<Block> BIRCH_MOSAIC = register("birch_mosaic", () -> new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> BIRCH_MOSAIC_STAIRS = register("birch_mosaic_stairs", () -> new EBStairBlock(BIRCH_MOSAIC.get().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> BIRCH_MOSAIC_SLAB = register("birch_mosaic_slab", () -> new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> BIRCH_MOSAIC_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"birch_mosaic_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Supplier<Block> JUNGLE_MOSAIC = register("jungle_mosaic", () -> new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> JUNGLE_MOSAIC_STAIRS = register("jungle_mosaic_stairs", () -> new EBStairBlock(JUNGLE_MOSAIC.get().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> JUNGLE_MOSAIC_SLAB = register("jungle_mosaic_slab", () -> new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> JUNGLE_MOSAIC_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"jungle_mosaic_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Supplier<Block> ACACIA_MOSAIC = register("acacia_mosaic", () -> new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> ACACIA_MOSAIC_STAIRS = register("acacia_mosaic_stairs", () -> new EBStairBlock(ACACIA_MOSAIC.get().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> ACACIA_MOSAIC_SLAB = register("acacia_mosaic_slab", () -> new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> ACACIA_MOSAIC_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"acacia_mosaic_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Supplier<Block> DARK_OAK_MOSAIC = register("dark_oak_mosaic", () -> new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> DARK_OAK_MOSAIC_STAIRS = register("dark_oak_mosaic_stairs", () -> new EBStairBlock(DARK_OAK_MOSAIC.get().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> DARK_OAK_MOSAIC_SLAB = register("dark_oak_mosaic_slab", () -> new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> DARK_OAK_MOSAIC_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"dark_oak_mosaic_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Supplier<Block> MANGROVE_MOSAIC = register("mangrove_mosaic", () -> new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> MANGROVE_MOSAIC_STAIRS = register("mangrove_mosaic_stairs", () -> new EBStairBlock(MANGROVE_MOSAIC.get().defaultBlockState(), EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> MANGROVE_MOSAIC_SLAB = register("mangrove_mosaic_slab", () -> new SlabBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> MANGROVE_MOSAIC_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"mangrove_mosaic_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.GENERIC_WOOD), true);

    public static final Supplier<Block> CHERRY_MOSAIC = register("cherry_mosaic", () -> new Block(EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Supplier<Block> CHERRY_MOSAIC_STAIRS = register("cherry_mosaic_stairs", () -> new EBStairBlock(CHERRY_MOSAIC.get().defaultBlockState(), EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Supplier<Block> CHERRY_MOSAIC_SLAB = register("cherry_mosaic_slab", () -> new SlabBlock(EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Supplier<Block> CHERRY_MOSAIC_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"cherry_mosaic_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.CHERRY_WOOD), true);

    public static final Supplier<Block> BAMBOO_MOSAIC_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"bamboo_mosaic_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.BAMBOO_WOOD), true);

    public static final Supplier<Block> CRIMSON_MOSAIC = register("crimson_mosaic", () -> new Block(EBProperties.BlockP.CRIMSON_WOOD), true);
    public static final Supplier<Block> CRIMSON_MOSAIC_STAIRS = register("crimson_mosaic_stairs", () -> new EBStairBlock(CRIMSON_MOSAIC.get().defaultBlockState(), EBProperties.BlockP.CRIMSON_WOOD), true);
    public static final Supplier<Block> CRIMSON_MOSAIC_SLAB = register("crimson_mosaic_slab", () -> new SlabBlock(EBProperties.BlockP.CRIMSON_WOOD), true);
    public static final Supplier<Block> CRIMSON_MOSAIC_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"crimson_mosaic_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.CRIMSON_WOOD), true);

    public static final Supplier<Block> WARPED_MOSAIC = register("warped_mosaic", () -> new Block(EBProperties.BlockP.WARPED_WOOD), true);
    public static final Supplier<Block> WARPED_MOSAIC_STAIRS = register("warped_mosaic_stairs", () -> new EBStairBlock(WARPED_MOSAIC.get().defaultBlockState(), EBProperties.BlockP.WARPED_WOOD), true);
    public static final Supplier<Block> WARPED_MOSAIC_SLAB = register("warped_mosaic_slab", () -> new SlabBlock(EBProperties.BlockP.WARPED_WOOD), true);
    public static final Supplier<Block> WARPED_MOSAIC_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"warped_mosaic_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.WARPED_WOOD), true);

    //CHISELED PLANKS
    public static final Supplier<Block> CHISELED_OAK_PLANKS = register("chiseled_oak_planks", () -> new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> CHISELED_SPRUCE_PLANKS = register("chiseled_spruce_planks", () -> new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> CHISELED_BIRCH_PLANKS = register("chiseled_birch_planks", () -> new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> CHISELED_JUNGLE_PLANKS = register("chiseled_jungle_planks", () -> new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> CHISELED_ACACIA_PLANKS = register("chiseled_acacia_planks", () -> new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> CHISELED_DARK_OAK_PLANKS = register("chiseled_dark_oak_planks", () -> new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> CHISELED_MANGROVE_PLANKS = register("chiseled_mangrove_planks", () -> new Block(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> CHISELED_CHERRY_PLANKS = register("chiseled_cherry_planks", () -> new Block(EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Supplier<Block> CHISELED_BAMBOO_PLANKS = register("chiseled_bamboo_planks", () -> new Block(EBProperties.BlockP.BAMBOO_WOOD), true);
    public static final Supplier<Block> CHISELED_CRIMSON_PLANKS = register("chiseled_crimson_planks", () -> new Block(EBProperties.BlockP.CRIMSON_WOOD), true);
    public static final Supplier<Block> CHISELED_WARPED_PLANKS = register("chiseled_warped_planks", () -> new Block(EBProperties.BlockP.WARPED_WOOD), true);
    public static final Supplier<Block> CHISELED_ANCIENT_PLANKS = register("chiseled_ancient_planks", () -> new Block(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Supplier<Block> CHISELED_GLOOM_PLANKS = register("chiseled_gloom_planks", () -> new Block(EBProperties.BlockP.GLOOM_WOOD), true);

    //ANCIENT
    public static final Supplier<Block> ANCIENT_LOG = register("ancient_log", () -> new RotatedPillarBlock(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Supplier<Block> STRIPPED_ANCIENT_LOG = register("stripped_ancient_log", () -> new RotatedPillarBlock(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Supplier<Block> ANCIENT_WOOD = register("ancient_wood", () -> new RotatedPillarBlock(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Supplier<Block> STRIPPED_ANCIENT_WOOD = register("stripped_ancient_wood", () -> new RotatedPillarBlock(EBProperties.BlockP.ANCIENT_WOOD), true);

    public static final Supplier<Block> ANCIENT_PLANKS = register("ancient_planks", () -> new Block(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Supplier<Block> ANCIENT_STAIRS = register("ancient_stairs", () -> new EBStairBlock(ANCIENT_PLANKS.get().defaultBlockState(), EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Supplier<Block> ANCIENT_SLAB = register("ancient_slab", () -> new SlabBlock(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Supplier<Block> ANCIENT_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"ancient_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.ANCIENT_WOOD), true);

    public static final Supplier<Block> ANCIENT_MOSAIC = register("ancient_mosaic", () -> new Block(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Supplier<Block> ANCIENT_MOSAIC_STAIRS = register("ancient_mosaic_stairs", () -> new EBStairBlock(ANCIENT_MOSAIC.get().defaultBlockState(), EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Supplier<Block> ANCIENT_MOSAIC_SLAB = register("ancient_mosaic_slab", () -> new SlabBlock(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Supplier<Block> ANCIENT_MOSAIC_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"ancient_mosaic_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.ANCIENT_WOOD), true);

    public static final Supplier<Block> ANCIENT_FENCE = register("ancient_fence", () -> new FenceBlock(EBProperties.BlockP.ANCIENT_WOOD), true);
    public static final Supplier<Block> ANCIENT_FENCE_GATE = register("ancient_fence_gate", () -> new FenceGateBlock(EBProperties.BlockP.ANCIENT_WOOD, EBBlockSetTypes.EBWoodTypes.ANCIENT), true);
    public static final Supplier<Block> ANCIENT_DOOR = register("ancient_door", () -> new EBDoorBlock(EBProperties.BlockP.ANCIENT_DOOR, EBBlockSetTypes.ANCIENT), true);
    public static final Supplier<Block> ANCIENT_TRAPDOOR = register("ancient_trapdoor", () -> new EBTrapDoorBlock(EBProperties.BlockP.ANCIENT_TRAPDOOR, EBBlockSetTypes.ANCIENT), true);
    public static final Supplier<Block> ANCIENT_PRESSURE_PLATE = register("ancient_pressure_plate", () -> new EBPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, EBProperties.BlockP.ANCIENT_WOOD, EBBlockSetTypes.ANCIENT), true);
    public static final Supplier<Block> ANCIENT_BUTTON = register("ancient_button", () -> new EBButtonBlock(EBProperties.BlockP.ANCIENT_WOOD, EBBlockSetTypes.ANCIENT, 30, true), true);
    public static final Supplier<Block> ANCIENT_SIGN = register("ancient_sign", () -> new EBSignBlock(EBBlockSetTypes.EBWoodTypes.ANCIENT, EBProperties.BlockP.ANCIENT_WOOD), false);
    public static final Supplier<Block> ANCIENT_WALL_SIGN = register("ancient_wall_sign", () -> new EBWallSignBlock(EBBlockSetTypes.EBWoodTypes.ANCIENT, EBProperties.BlockP.ANCIENT_WOOD), false);
    public static final Supplier<Block> ANCIENT_HANGING_SIGN = register("ancient_hanging_sign", () -> new EBHangingSignBlock(EBBlockSetTypes.EBWoodTypes.ANCIENT, EBProperties.BlockP.ANCIENT_WOOD), false);
    public static final Supplier<Block> ANCIENT_WALL_HANGING_SIGN = register("ancient_wall_hanging_sign", () -> new EBWallHangingSignBlock(EBBlockSetTypes.EBWoodTypes.ANCIENT, EBProperties.BlockP.ANCIENT_WOOD), false);

    public static final Supplier<Block> ANCIENT_LEAVES = register("ancient_leaves", () -> new GlowingLeavesBlock(EBParticles.ANCIENT_PARTICLE, EBProperties.BlockP.GLOWING_LEAVES), true);
    public static final Supplier<Block> ANCIENT_SAPLING = registerConfigurable(Services.CONFIG.enableAncientSapling(), Optional.empty(), "ancient_sapling", () -> new AncientSaplingBlock(new AncientSaplingGenerator(), EBProperties.BlockP.GLOWING_SAPLING), true);
    public static final Supplier<Block> POTTED_ANCIENT_SAPLING = register("potted_ancient_sapling", () -> flowerPot(EBBlocks.ANCIENT_SAPLING), false);

    //GLOOM
    public static final Supplier<Block> GLOOM_LOG = register("gloom_log", () -> new RotatedPillarBlock(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Supplier<Block> STRIPPED_GLOOM_LOG = register("stripped_gloom_log", () -> new RotatedPillarBlock(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Supplier<Block> GLOOM_WOOD = register("gloom_wood", () -> new RotatedPillarBlock(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Supplier<Block> STRIPPED_GLOOM_WOOD = register("stripped_stripped_gloom_log_wood", () -> new RotatedPillarBlock(EBProperties.BlockP.GLOOM_WOOD), true);

    public static final Supplier<Block> GLOOM_PLANKS = register("gloom_planks", () -> new Block(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Supplier<Block> GLOOM_STAIRS = register("gloom_stairs", () -> new EBStairBlock(GLOOM_PLANKS.get().defaultBlockState(), EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Supplier<Block> GLOOM_SLAB = register("gloom_slab", () -> new SlabBlock(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Supplier<Block> GLOOM_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"gloom_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.GLOOM_WOOD), true);

    public static final Supplier<Block> GLOOM_MOSAIC = register("gloom_mosaic", () -> new Block(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Supplier<Block> GLOOM_MOSAIC_STAIRS = register("gloom_mosaic_stairs", () -> new EBStairBlock(GLOOM_MOSAIC.get().defaultBlockState(), EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Supplier<Block> GLOOM_MOSAIC_SLAB = register("gloom_mosaic_slab", () -> new SlabBlock(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Supplier<Block> GLOOM_MOSAIC_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"gloom_mosaic_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.GLOOM_WOOD), true);

    public static final Supplier<Block> GLOOM_FENCE = register("gloom_fence", () -> new FenceBlock(EBProperties.BlockP.GLOOM_WOOD), true);
    public static final Supplier<Block> GLOOM_FENCE_GATE = register("gloom_fence_gate", () -> new FenceGateBlock(EBProperties.BlockP.GLOOM_WOOD, EBBlockSetTypes.EBWoodTypes.GLOOM), true);
    public static final Supplier<Block> GLOOM_DOOR = register("gloom_door", () -> new EBDoorBlock(EBProperties.BlockP.GLOOM_DOOR, EBBlockSetTypes.GLOOM), true);
    public static final Supplier<Block> GLOOM_TRAPDOOR = register("gloom_trapdoor", () -> new EBTrapDoorBlock(EBProperties.BlockP.GLOOM_TRAPDOOR, EBBlockSetTypes.GLOOM), true);
    public static final Supplier<Block> GLOOM_PRESSURE_PLATE = register("gloom_pressure_plate", () -> new EBPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, EBProperties.BlockP.GLOOM_WOOD, EBBlockSetTypes.GLOOM), true);
    public static final Supplier<Block> GLOOM_BUTTON = register("gloom_button", () -> new EBButtonBlock(EBProperties.BlockP.GLOOM_WOOD, EBBlockSetTypes.GLOOM, 30, true), true);
    public static final Supplier<Block> GLOOM_SIGN = register("gloom_sign", () -> new EBSignBlock(EBBlockSetTypes.EBWoodTypes.GLOOM, EBProperties.BlockP.GLOOM_WOOD), false);
    public static final Supplier<Block> GLOOM_WALL_SIGN = register("gloom_wall_sign", () -> new EBWallSignBlock(EBBlockSetTypes.EBWoodTypes.GLOOM, EBProperties.BlockP.GLOOM_WOOD), false);
    public static final Supplier<Block> GLOOM_HANGING_SIGN = register("gloom_hanging_sign", () -> new EBHangingSignBlock(EBBlockSetTypes.EBWoodTypes.GLOOM, EBProperties.BlockP.GLOOM_WOOD), false);
    public static final Supplier<Block> GLOOM_WALL_HANGING_SIGN = register("gloom_wall_hanging_sign", () -> new EBWallHangingSignBlock(EBBlockSetTypes.EBWoodTypes.GLOOM, EBProperties.BlockP.GLOOM_WOOD), false);

    public static final Supplier<Block> GLOOM_LEAVES = register("gloom_leaves", () -> new FloweringLeavesBlock(EBParticles.GLOOM_PARTICLE, EBProperties.BlockP.GLOOM_LEAVES), true);
    public static final Supplier<Block> GLOOM_SEEDS = register("gloom_seeds", () -> new EBSaplingBlock(new GloomSaplingGenerator(), EBProperties.BlockP.GLOOM_SEEDS), true);
    public static final Supplier<Block> GLOOM_SAPLING = registerConfigurable(Services.CONFIG.enableGloomSeeds(), Optional.empty(), "gloom_sapling", () -> new GloomSaplingBlock(new GloomSaplingGenerator(), EBProperties.BlockP.GLOOM_SAPLING), true);
    public static final Supplier<Block> POTTED_GLOOM_SAPLING = register("potted_gloom_sapling", () -> flowerPot(EBBlocks.GLOOM_SAPLING), false);

    //COBBLED BRICKS
    public static final Supplier<Block> COBBLESTONE_BRICKS = register("cobblestone_bricks", () -> new Block(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Supplier<Block> COBBLESTONE_BRICK_STAIRS = register("cobblestone_brick_stairs", () -> new EBStairBlock(COBBLESTONE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Supplier<Block> COBBLESTONE_BRICK_SLAB = register("cobblestone_brick_slab", () -> new SlabBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Supplier<Block> COBBLESTONE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"cobblestone_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Supplier<Block> COBBLESTONE_BRICK_WALL = register("cobblestone_brick_wall", () -> new WallBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Supplier<Block> CRACKED_COBBLESTONE_BRICKS = register("cracked_cobblestone_bricks", () -> new Block(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Supplier<Block> MOSSY_COBBLESTONE_BRICKS = register("mossy_cobblestone_bricks", () -> new Block(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Supplier<Block> MOSSY_COBBLESTONE_BRICK_STAIRS = register("mossy_cobblestone_brick_stairs", () -> new EBStairBlock(MOSSY_COBBLESTONE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Supplier<Block> MOSSY_COBBLESTONE_BRICK_SLAB = register("mossy_cobblestone_brick_slab", () -> new SlabBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Supplier<Block> MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"mossy_cobblestone_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Supplier<Block> MOSSY_COBBLESTONE_BRICK_WALL = register("mossy_cobblestone_brick_wall", () -> new WallBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);

    public static final Supplier<Block> COBBLED_DEEPSLATE_BRICKS = register("cobbled_deepslate_bricks", () -> new Block(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    public static final Supplier<Block> COBBLED_DEEPSLATE_BRICK_STAIRS = register("cobbled_deepslate_brick_stairs", () -> new EBStairBlock(COBBLED_DEEPSLATE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    public static final Supplier<Block> COBBLED_DEEPSLATE_BRICK_SLAB = register("cobbled_deepslate_brick_slab", () -> new SlabBlock(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    public static final Supplier<Block> COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"cobbled_deepslate_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    public static final Supplier<Block> COBBLED_DEEPSLATE_BRICK_WALL = register("cobbled_deepslate_brick_wall", () -> new WallBlock(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);
    public static final Supplier<Block> CRACKED_COBBLED_DEEPSLATE_BRICKS = register("cracked_cobbled_deepslate_bricks", () -> new Block(EBProperties.BlockP.COBBLED_DEEPSLATE_BRICKS), true);

    public static final Supplier<Block> BLACKSTONE_BRICKS = register("blackstone_bricks", () -> new Block(EBProperties.BlockP.BLACKSTONE_BRICKS), true);
    public static final Supplier<Block> BLACKSTONE_BRICK_STAIRS = register("blackstone_brick_stairs", () -> new EBStairBlock(BLACKSTONE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.BLACKSTONE_BRICKS), true);
    public static final Supplier<Block> BLACKSTONE_BRICK_SLAB = register("blackstone_brick_slab", () -> new SlabBlock(EBProperties.BlockP.BLACKSTONE_BRICKS), true);
    public static final Supplier<Block> BLACKSTONE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"blackstone_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.BLACKSTONE_BRICKS), true);
    public static final Supplier<Block> BLACKSTONE_BRICK_WALL = register("blackstone_brick_wall", () -> new WallBlock(EBProperties.BlockP.BLACKSTONE_BRICKS), true);
    public static final Supplier<Block> CRACKED_BLACKSTONE_BRICKS = register("cracked_blackstone_bricks", () -> new Block(EBProperties.BlockP.BLACKSTONE_BRICKS), true);

    //RESOURCE
    public static final Supplier<Block> GOLD_BRICKS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "gold_bricks", () -> new ResourceBrickBlock(EBProperties.BlockP.GOLD), true);
    public static final Supplier<Block> GOLD_BRICK_STAIRS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "gold_brick_stairs", () -> new ResourceBrickStairsBlock(GOLD_BRICKS.get().defaultBlockState(), EBProperties.BlockP.GOLD), true);
    public static final Supplier<Block> GOLD_BRICK_SLAB = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "gold_brick_slab", () -> new ResourceBrickSlabBlock(EBProperties.BlockP.GOLD), true);
    public static final Supplier<Block> GOLD_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.of(Services.CONFIG.enableVerticalStairs()), "gold_brick_vertical_stairs", () -> new ResourceBrickVerticalStairsBlock(EBProperties.BlockP.GOLD), true);

    public static final Supplier<Block> IRON_BRICKS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "iron_bricks", () -> new ResourceBrickBlock(EBProperties.BlockP.IRON), true);
    public static final Supplier<Block> IRON_BRICK_STAIRS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "iron_brick_stairs", () -> new ResourceBrickStairsBlock(IRON_BRICKS.get().defaultBlockState(), EBProperties.BlockP.IRON), true);
    public static final Supplier<Block> IRON_BRICK_SLAB = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "iron_brick_slab", () -> new ResourceBrickSlabBlock(EBProperties.BlockP.IRON), true);
    public static final Supplier<Block> IRON_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.of(Services.CONFIG.enableVerticalStairs()), "iron_brick_vertical_stairs", () -> new ResourceBrickVerticalStairsBlock(EBProperties.BlockP.IRON), true);

    public static final Supplier<Block> LAPIS_BRICKS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "lapis_bricks", () -> new ResourceBrickBlock(EBProperties.BlockP.LAPIS), true);
    public static final Supplier<Block> LAPIS_BRICK_STAIRS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "lapis_brick_stairs", () -> new ResourceBrickStairsBlock(LAPIS_BRICKS.get().defaultBlockState(), EBProperties.BlockP.LAPIS), true);
    public static final Supplier<Block> LAPIS_BRICK_SLAB = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "lapis_brick_slab", () -> new ResourceBrickSlabBlock(EBProperties.BlockP.LAPIS), true);
    public static final Supplier<Block> LAPIS_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.of(Services.CONFIG.enableVerticalStairs()), "lapis_brick_vertical_stairs", () -> new ResourceBrickVerticalStairsBlock(EBProperties.BlockP.LAPIS), true);

    public static final Supplier<Block> EMERALD_BRICKS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "emerald_bricks", () -> new ResourceBrickBlock(EBProperties.BlockP.EMERALD), true);
    public static final Supplier<Block> EMERALD_BRICK_STAIRS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "emerald_brick_stairs", () -> new ResourceBrickStairsBlock(EMERALD_BRICKS.get().defaultBlockState(), EBProperties.BlockP.EMERALD), true);
    public static final Supplier<Block> EMERALD_BRICK_SLAB = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "emerald_brick_slab", () -> new ResourceBrickSlabBlock(EBProperties.BlockP.EMERALD), true);
    public static final Supplier<Block> EMERALD_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.of(Services.CONFIG.enableVerticalStairs()), "emerald_brick_vertical_stairs", () -> new ResourceBrickVerticalStairsBlock(EBProperties.BlockP.EMERALD), true);

    public static final Supplier<Block> DIAMOND_BRICKS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "diamond_bricks", () -> new ResourceBrickBlock(EBProperties.BlockP.DIAMOND), true);
    public static final Supplier<Block> DIAMOND_BRICK_STAIRS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "diamond_brick_stairs", () -> new ResourceBrickStairsBlock(DIAMOND_BRICKS.get().defaultBlockState(), EBProperties.BlockP.DIAMOND), true);
    public static final Supplier<Block> DIAMOND_BRICK_SLAB = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "diamond_brick_slab", () -> new ResourceBrickSlabBlock(EBProperties.BlockP.DIAMOND), true);
    public static final Supplier<Block> DIAMOND_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.of(Services.CONFIG.enableVerticalStairs()), "diamond_brick_vertical_stairs", () -> new ResourceBrickVerticalStairsBlock(EBProperties.BlockP.DIAMOND), true);

    public static final Supplier<Block> NETHERITE_BRICKS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "netherite_bricks", () -> new ResourceBrickBlock(EBProperties.BlockP.NETHERITE), false);
    public static final Supplier<Block> NETHERITE_BRICK_STAIRS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "netherite_brick_stairs", () -> new ResourceBrickStairsBlock(NETHERITE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.NETHERITE), false);
    public static final Supplier<Block> NETHERITE_BRICK_SLAB = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "netherite_brick_slab", () -> new ResourceBrickSlabBlock(EBProperties.BlockP.NETHERITE), false);
    public static final Supplier<Block> NETHERITE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.of(Services.CONFIG.enableVerticalStairs()), "netherite_brick_vertical_stairs", () -> new ResourceBrickVerticalStairsBlock(EBProperties.BlockP.NETHERITE), false);

    public static final Supplier<Block> REDSTONE_BRICKS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "redstone_bricks", () -> new RedstoneResourceBrickBlock(EBProperties.BlockP.REDSTONE), true);
    public static final Supplier<Block> REDSTONE_BRICK_STAIRS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "redstone_brick_stairs", () -> new RedstoneResourceBrickStairsBlock(REDSTONE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.REDSTONE), true);
    public static final Supplier<Block> REDSTONE_BRICK_SLAB = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.empty(), "redstone_brick_slab", () -> new RedstoneResourceBrickSlabBlock(EBProperties.BlockP.REDSTONE), true);
    public static final Supplier<Block> REDSTONE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableResourceBricks(), Optional.of(Services.CONFIG.enableVerticalStairs()), "redstone_brick_vertical_stairs", () -> new RedstoneResourceBrickVerticalStairsBlock(EBProperties.BlockP.REDSTONE), true);

    //COPPER - UNAFFECTED
    public static final Supplier<Block> COPPER_BRICKS = register("copper_bricks", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> COPPER_BRICK_STAIRS = register("copper_brick_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.UNAFFECTED, COPPER_BRICKS.get().defaultBlockState(), EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> COPPER_BRICK_SLAB = register("copper_brick_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.UNAFFECTED, EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> COPPER_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"copper_brick_vertical_stairs", () -> new OxidizableVerticalStairsBlock(WeatheringCopper.WeatherState.UNAFFECTED, EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> EXPOSED_COPPER_BRICKS = register("exposed_copper_bricks", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Supplier<Block> EXPOSED_COPPER_BRICK_STAIRS = register("exposed_copper_brick_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.EXPOSED, EXPOSED_COPPER_BRICKS.get().defaultBlockState(), EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Supplier<Block> EXPOSED_COPPER_BRICK_SLAB = register("exposed_copper_brick_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.EXPOSED, EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Supplier<Block> EXPOSED_COPPER_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"exposed_copper_brick_vertical_stairs", () -> new OxidizableVerticalStairsBlock(WeatheringCopper.WeatherState.EXPOSED, EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Supplier<Block> WEATHERED_COPPER_BRICKS = register("weathered_copper_bricks", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Supplier<Block> WEATHERED_COPPER_BRICK_STAIRS = register("weathered_copper_brick_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.WEATHERED, WEATHERED_COPPER_BRICKS.get().defaultBlockState(), EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Supplier<Block> WEATHERED_COPPER_BRICK_SLAB = register("weathered_copper_brick_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.WEATHERED, EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Supplier<Block> WEATHERED_COPPER_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"weathered_copper_brick_vertical_stairs", () -> new OxidizableVerticalStairsBlock(WeatheringCopper.WeatherState.WEATHERED, EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Supplier<Block> OXIDIZED_COPPER_BRICKS = register("oxidized_copper_bricks", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Supplier<Block> OXIDIZED_COPPER_BRICK_STAIRS = register("oxidized_copper_brick_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.OXIDIZED, OXIDIZED_COPPER_BRICKS.get().defaultBlockState(), EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Supplier<Block> OXIDIZED_COPPER_BRICK_SLAB = register("oxidized_copper_brick_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.OXIDIZED, EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Supplier<Block> OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"oxidized_copper_brick_vertical_stairs", () -> new OxidizableVerticalStairsBlock(WeatheringCopper.WeatherState.OXIDIZED, EBProperties.BlockP.OXIDIZED_COPPER), true);

    //COPPER - WAXED
    public static final Supplier<Block> WAXED_COPPER_BRICKS = register("waxed_copper_bricks", () -> new Block(EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> WAXED_COPPER_BRICK_STAIRS = register("waxed_copper_brick_stairs", () -> new EBStairBlock(WAXED_COPPER_BRICKS.get().defaultBlockState(), EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> WAXED_COPPER_BRICK_SLAB = register("waxed_copper_brick_slab", () -> new SlabBlock(EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> WAXED_COPPER_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"waxed_copper_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> WAXED_EXPOSED_COPPER_BRICKS = register("waxed_exposed_copper_bricks", () -> new Block(EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Supplier<Block> WAXED_EXPOSED_COPPER_BRICK_STAIRS = register("waxed_exposed_copper_brick_stairs", () -> new EBStairBlock(WAXED_EXPOSED_COPPER_BRICKS.get().defaultBlockState(), EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Supplier<Block> WAXED_EXPOSED_COPPER_BRICK_SLAB = register("waxed_exposed_copper_brick_slab", () -> new SlabBlock(EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Supplier<Block> WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"waxed_exposed_copper_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.EXPOSED_COPPER), true);
    public static final Supplier<Block> WAXED_WEATHERED_COPPER_BRICKS = register("waxed_weathered_copper_bricks", () -> new Block(EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Supplier<Block> WAXED_WEATHERED_COPPER_BRICK_STAIRS = register("waxed_weathered_copper_brick_stairs", () -> new EBStairBlock(WAXED_WEATHERED_COPPER_BRICKS.get().defaultBlockState(), EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Supplier<Block> WAXED_WEATHERED_COPPER_BRICK_SLAB = register("waxed_weathered_copper_brick_slab", () -> new SlabBlock(EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Supplier<Block> WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"waxed_weathered_copper_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.WEATHERED_COPPER), true);
    public static final Supplier<Block> WAXED_OXIDIZED_COPPER_BRICKS = register("waxed_oxidized_copper_bricks", () -> new Block(EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Supplier<Block> WAXED_OXIDIZED_COPPER_BRICK_STAIRS = register("waxed_oxidized_copper_brick_stairs", () -> new EBStairBlock(WAXED_OXIDIZED_COPPER_BRICKS.get().defaultBlockState(), EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Supplier<Block> WAXED_OXIDIZED_COPPER_BRICK_SLAB = register("waxed_oxidized_copper_brick_slab", () -> new SlabBlock(EBProperties.BlockP.OXIDIZED_COPPER), true);
    public static final Supplier<Block> WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"waxed_oxidized_copper_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.OXIDIZED_COPPER), true);

    //KNITTED WOOL
    public static final HashMap<DyeColor, Supplier<Block>> DYED_KNITTED_WOOL = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_KNITTED_CARPET = new HashMap<>();

    public static Block getDyedKnittedWools(int colors) {
        return DYED_KNITTED_WOOL.get(DyeColor.byId(colors)).get();
    }

    public static Block getDyedKnittedCarpets(int colors) {
        return DYED_KNITTED_CARPET.get(DyeColor.byId(colors)).get();
    }

    static {
        for (DyeColor colors : DyeColor.values()) {
            DYED_KNITTED_WOOL.put(colors, register(colors + "_knitted_wool", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).mapColor(colors)), true));
            DYED_KNITTED_CARPET.put(colors, register(colors + "_knitted_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CARPET).mapColor(colors)), true));
        }
    }

    //TERRACOTTA TILES
    public static final Supplier<Block> TERRACOTTA_TILES = register("terracotta_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), true);
    public static final Supplier<Block> TERRACOTTA_TILE_STAIRS = register("terracotta_tile_stairs", () -> new EBStairBlock(EBBlocks.TERRACOTTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), true);
    public static final Supplier<Block> TERRACOTTA_TILE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"terracotta_tile_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), true);
    public static final Supplier<Block> TERRACOTTA_TILE_SLAB = register("terracotta_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), true);

    public static final HashMap<DyeColor, Supplier<Block>> DYED_TERRACOTTA_TILES = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_TERRACOTTA_TILE_STAIRS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_TERRACOTTA_TILE_VERTICAL_STAIRS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_TERRACOTTA_TILE_SLAB = new HashMap<>();

    public static Block getDyedTerracottaTiles(int colors) {
        return DYED_TERRACOTTA_TILES.get(DyeColor.byId(colors)).get();
    }

    public static Block getDyedTerracottaTileStairs(int colors) {
        return DYED_TERRACOTTA_TILE_STAIRS.get(DyeColor.byId(colors)).get();
    }

    public static Block getDyedTerracottaTileVerticalStairs(int colors) {
        return DYED_TERRACOTTA_TILE_VERTICAL_STAIRS.get(DyeColor.byId(colors)).get();
    }

    public static Block getDyedTerracottaTileSlab(int colors) {
        return DYED_TERRACOTTA_TILE_SLAB.get(DyeColor.byId(colors)).get();
    }

    static {
        for (DyeColor colors : DyeColor.values()) {
            DYED_TERRACOTTA_TILES.put(colors, register(colors + "_terracotta_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(colors)), true));
            DYED_TERRACOTTA_TILE_STAIRS.put(colors, register(colors + "_terracotta_tile_stairs", () -> new EBStairBlock(getDyedTerracottaTiles(colors.getId()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(colors)), true));
            DYED_TERRACOTTA_TILE_VERTICAL_STAIRS.put(colors, registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),colors + "_terracotta_tile_vertical_stairs", () -> new VerticalStairsBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(colors)), true));
            DYED_TERRACOTTA_TILE_SLAB.put(colors, register(colors + "_terracotta_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).mapColor(colors)), true));
        }
    }

    //ALMENTRA STATUES
    public static final Supplier<Block> ALMENTRA_STATUE = register("almentra_statue", () -> new AlmentraStatueBlock(EBProperties.BlockP.ALMENTRA), true);

    public static final HashMap<DyeColor, Supplier<Block>> DYED_ALMENTRA_STATUE = new HashMap<>();

    public static Block getDyedAlmentraStatues(int colors) {
        return DYED_ALMENTRA_STATUE.get(DyeColor.byId(colors)).get();
    }

    static {
        for (DyeColor colors : DyeColor.values()) {
            DYED_ALMENTRA_STATUE.put(colors, register(colors + "_almentra_statue", () -> new AlmentraStatueBlock(EBProperties.BlockP.ALMENTRA.mapColor(colors)), true));
        }
    }

    //ALMENTRA
    public static final Supplier<Block> ALMENTRA = register("almentra", () -> new Block(EBProperties.BlockP.ALMENTRA), true);
    public static final Supplier<Block> ALMENTRA_STAIRS = register("almentra_stairs", () -> new EBStairBlock(EBBlocks.ALMENTRA.get().defaultBlockState(), EBProperties.BlockP.ALMENTRA), true);
    public static final Supplier<Block> ALMENTRA_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"almentra_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.ALMENTRA), true);
    public static final Supplier<Block> ALMENTRA_SLAB = register("almentra_slab", () -> new SlabBlock(EBProperties.BlockP.ALMENTRA), true);

    public static final HashMap<DyeColor, Supplier<Block>> DYED_ALMENTRA = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_ALMENTRA_STAIRS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_ALMENTRA_VERTICAL_STAIRS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_ALMENTRA_SLAB = new HashMap<>();

    public static Block getDyedAlmentra(int colors) {
        return DYED_ALMENTRA.get(DyeColor.byId(colors)).get();
    }

    public static Block getDyedAlmentraStairs(int colors) {
        return DYED_ALMENTRA_STAIRS.get(DyeColor.byId(colors)).get();
    }

    public static Block getDyedAlmentraVerticalStairs(int colors) {
        return DYED_ALMENTRA_VERTICAL_STAIRS.get(DyeColor.byId(colors)).get();
    }

    public static Block getDyedAlmentraSlab(int colors) {
        return DYED_ALMENTRA_SLAB.get(DyeColor.byId(colors)).get();
    }

    //POLISHED ALMENTRA
    public static final Supplier<Block> POLISHED_ALMENTRA = register("polished_almentra", () -> new Block(EBProperties.BlockP.ALMENTRA), true);
    public static final Supplier<Block> POLISHED_ALMENTRA_STAIRS = register("polished_almentra_stairs", () -> new EBStairBlock(EBBlocks.POLISHED_ALMENTRA.get().defaultBlockState(), EBProperties.BlockP.ALMENTRA), true);
    public static final Supplier<Block> POLISHED_ALMENTRA_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"polished_almentra_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.ALMENTRA), true);
    public static final Supplier<Block> POLISHED_ALMENTRA_SLAB = register("polished_almentra_slab", () -> new SlabBlock(EBProperties.BlockP.ALMENTRA), true);

    public static final HashMap<DyeColor, Supplier<Block>> DYED_POLISHED_ALMENTRA = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_POLISHED_ALMENTRA_STAIRS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_POLISHED_ALMENTRA_VERTICAL_STAIRS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_POLISHED_ALMENTRA_SLAB = new HashMap<>();

    public static Block getDyedPolishedAlmentra(int colors) {
        return DYED_POLISHED_ALMENTRA.get(DyeColor.byId(colors)).get();
    }

    public static Block getDyedPolishedAlmentraStairs(int colors) {
        return DYED_POLISHED_ALMENTRA_STAIRS.get(DyeColor.byId(colors)).get();
    }

    public static Block getDyedPolishedAlmentraVerticalStairs(int colors) {
        return DYED_POLISHED_ALMENTRA_VERTICAL_STAIRS.get(DyeColor.byId(colors)).get();
    }

    public static Block getDyedPolishedAlmentraSlab(int colors) {
        return DYED_POLISHED_ALMENTRA_SLAB.get(DyeColor.byId(colors)).get();
    }

    //ALMENTRA BRICKS
    public static final Supplier<Block> ALMENTRA_BRICKS = register("almentra_bricks", () -> new Block(EBProperties.BlockP.ALMENTRA_BRICKS), true);
    public static final Supplier<Block> ALMENTRA_BRICK_STAIRS = register("almentra_brick_stairs", () -> new EBStairBlock(EBBlocks.ALMENTRA_BRICKS.get().defaultBlockState(), EBProperties.BlockP.ALMENTRA_BRICKS), true);
    public static final Supplier<Block> ALMENTRA_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"almentra_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.ALMENTRA_BRICKS), true);
    public static final Supplier<Block> ALMENTRA_BRICK_SLAB = register("almentra_brick_slab", () -> new SlabBlock(EBProperties.BlockP.ALMENTRA_BRICKS), true);

    public static final HashMap<DyeColor, Supplier<Block>> DYED_ALMENTRA_BRICKS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_ALMENTRA_BRICK_STAIRS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_ALMENTRA_BRICK_VERTICAL_STAIRS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_ALMENTRA_BRICK_SLAB = new HashMap<>();

    public static Block getDyedAlmentraBricks(int colors) {
        return DYED_ALMENTRA_BRICKS.get(DyeColor.byId(colors)).get();
    }

    public static Block getDyedAlmentraBrickStairs(int colors) {
        return DYED_ALMENTRA_BRICK_STAIRS.get(DyeColor.byId(colors)).get();
    }

    public static Block getDyedAlmentraBrickVerticalStairs(int colors) {
        return DYED_ALMENTRA_BRICK_VERTICAL_STAIRS.get(DyeColor.byId(colors)).get();
    }

    public static Block getDyedAlmentraBrickSlab(int colors) {
        return DYED_ALMENTRA_BRICK_SLAB.get(DyeColor.byId(colors)).get();
    }

    static {
        for (DyeColor colors : DyeColor.values()) {
            DYED_ALMENTRA.put(colors, register(colors + "_almentra", () -> new Block(EBProperties.BlockP.ALMENTRA.mapColor(colors)), true));
            DYED_ALMENTRA_STAIRS.put(colors, register(colors + "_almentra_stairs", () -> new EBStairBlock(getDyedAlmentra(colors.getId()).defaultBlockState(), EBProperties.BlockP.ALMENTRA.mapColor(colors)), true));
            DYED_ALMENTRA_VERTICAL_STAIRS.put(colors, registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),colors + "_almentra_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.ALMENTRA.mapColor(colors)), true));
            DYED_ALMENTRA_SLAB.put(colors, register(colors + "_almentra_slab", () -> new SlabBlock(EBProperties.BlockP.ALMENTRA.mapColor(colors)), true));

            DYED_POLISHED_ALMENTRA.put(colors, register(colors + "_polished_almentra", () -> new Block(EBProperties.BlockP.ALMENTRA.mapColor(colors)), true));
            DYED_POLISHED_ALMENTRA_STAIRS.put(colors, register(colors + "_polished_almentra_stairs", () -> new EBStairBlock(getDyedPolishedAlmentra(colors.getId()).defaultBlockState(), EBProperties.BlockP.ALMENTRA.mapColor(colors)), true));
            DYED_POLISHED_ALMENTRA_VERTICAL_STAIRS.put(colors, registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),colors + "_polished_almentra_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.ALMENTRA.mapColor(colors)), true));
            DYED_POLISHED_ALMENTRA_SLAB.put(colors, register(colors + "_polished_almentra_slab", () -> new SlabBlock(EBProperties.BlockP.ALMENTRA.mapColor(colors)), true));

            DYED_ALMENTRA_BRICKS.put(colors, register(colors + "_almentra_bricks", () -> new Block(EBProperties.BlockP.ALMENTRA_BRICKS.mapColor(colors)), true));
            DYED_ALMENTRA_BRICK_STAIRS.put(colors, register(colors + "_almentra_brick_stairs", () -> new EBStairBlock(getDyedAlmentraBricks(colors.getId()).defaultBlockState(), EBProperties.BlockP.ALMENTRA_BRICKS.mapColor(colors)), true));
            DYED_ALMENTRA_BRICK_VERTICAL_STAIRS.put(colors, registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),colors + "_almentra_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.ALMENTRA_BRICKS.mapColor(colors)), true));
            DYED_ALMENTRA_BRICK_SLAB.put(colors, register(colors + "_almentra_brick_slab", () -> new SlabBlock(EBProperties.BlockP.ALMENTRA_BRICKS.mapColor(colors)), true));
        }
    }

    //SEA GLASS
    public static final Supplier<Block> SEA_GLASS = register("sea_glass", () -> new EBHalfTransparentBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Supplier<Block> ROSE_SEA_GLASS = register("rose_sea_glass", () -> new EBHalfTransparentBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Supplier<Block> AQUA_SEA_GLASS = register("aqua_sea_glass", () -> new EBHalfTransparentBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Supplier<Block> VERDANT_SEA_GLASS = register("verdant_sea_glass", () -> new EBHalfTransparentBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Supplier<Block> SCARLET_SEA_GLASS = register("scarlet_sea_glass", () -> new EBHalfTransparentBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Supplier<Block> FUCHSIA_SEA_GLASS = register("fuchsia_sea_glass", () -> new EBHalfTransparentBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Supplier<Block> SEA_GLASS_PANE = register("sea_glass_pane", () -> new SeaGlassPaneBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Supplier<Block> ROSE_SEA_GLASS_PANE = register("rose_sea_glass_pane", () -> new SeaGlassPaneBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Supplier<Block> AQUA_SEA_GLASS_PANE = register("aqua_sea_glass_pane", () -> new SeaGlassPaneBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Supplier<Block> VERDANT_SEA_GLASS_PANE = register("verdant_sea_glass_pane", () -> new SeaGlassPaneBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Supplier<Block> SCARLET_SEA_GLASS_PANE = register("scarlet_sea_glass_pane", () -> new SeaGlassPaneBlock(EBProperties.BlockP.SEA_GLASS), true);
    public static final Supplier<Block> FUCHSIA_SEA_GLASS_PANE = register("fuchsia_sea_glass_pane", () -> new SeaGlassPaneBlock(EBProperties.BlockP.SEA_GLASS), true);

    //SOUL SANDSTONE
    public static final Supplier<Block> SOUL_SANDSTONE = register("soul_sandstone", () -> new Block(EBProperties.BlockP.SOUL_SANDSTONE), true);
    public static final Supplier<Block> SOUL_SANDSTONE_STAIRS = register("soul_sandstone_stairs", () -> new EBStairBlock(SOUL_SANDSTONE.get().defaultBlockState(), EBProperties.BlockP.SOUL_SANDSTONE), true);
    public static final Supplier<Block> SOUL_SANDSTONE_SLAB = register("soul_sandstone_slab", () -> new SlabBlock(EBProperties.BlockP.SOUL_SANDSTONE), true);
    public static final Supplier<Block> SOUL_SANDSTONE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"soul_sandstone_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.SOUL_SANDSTONE), true);
    public static final Supplier<Block> SOUL_SANDSTONE_WALL = register("soul_sandstone_wall", () -> new WallBlock(EBProperties.BlockP.SOUL_SANDSTONE), true);

    public static final Supplier<Block> CUT_SOUL_SANDSTONE = register("cut_soul_sandstone", () -> new Block(EBProperties.BlockP.CUT_SOUL_SANDSTONE), true);
    public static final Supplier<Block> CUT_SOUL_SANDSTONE_SLAB = register("cut_soul_sandstone_slab", () -> new SlabBlock(EBProperties.BlockP.CUT_SOUL_SANDSTONE), true);
    public static final Supplier<Block> CHISELED_SOUL_SANDSTONE = register("chiseled_soul_sandstone", () -> new Block(EBProperties.BlockP.CUT_SOUL_SANDSTONE), true);

    public static final Supplier<Block> SMOOTH_SOUL_SANDSTONE = register("smooth_soul_sandstone", () -> new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Supplier<Block> SMOOTH_SOUL_SANDSTONE_STAIRS = register("smooth_soul_sandstone_stairs", () -> new EBStairBlock(SMOOTH_SOUL_SANDSTONE.get().defaultBlockState(), EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Supplier<Block> SMOOTH_SOUL_SANDSTONE_SLAB = register("smooth_soul_sandstone_slab", () -> new SlabBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Supplier<Block> SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"smooth_soul_sandstone_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);

    public static final Supplier<Block> SOUL_MAGMA_BLOCK = register("soul_magma_block", () -> new SoulMagmaBlock(EBProperties.BlockP.SOUL_MAGMA), true);

    //POLISHED SANDSTONE
    public static final Supplier<Block> POLISHED_SANDSTONE = register("polished_sandstone", () -> new Block(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Supplier<Block> POLISHED_SANDSTONE_STAIRS = register("polished_sandstone_stairs", () -> new EBStairBlock(POLISHED_SANDSTONE.get().defaultBlockState(), EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Supplier<Block> POLISHED_SANDSTONE_SLAB = register("polished_sandstone_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Supplier<Block> POLISHED_SANDSTONE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"polished_sandstone_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Supplier<Block> POLISHED_SANDSTONE_WALL = register("polished_sandstone_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);

    public static final Supplier<Block> SANDSTONE_BRICKS = register("sandstone_bricks", () -> new Block(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Supplier<Block> SANDSTONE_BRICK_STAIRS = register("sandstone_brick_stairs", () -> new EBStairBlock(SANDSTONE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Supplier<Block> SANDSTONE_BRICK_SLAB = register("sandstone_brick_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Supplier<Block> SANDSTONE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"sandstone_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Supplier<Block> SANDSTONE_BRICK_WALL = register("sandstone_brick_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);

    public static final Supplier<Block> SANDSTONE_TILES = register("sandstone_tiles", () -> new Block(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Supplier<Block> SANDSTONE_TILE_STAIRS = register("sandstone_tile_stairs", () -> new EBStairBlock(SANDSTONE_TILES.get().defaultBlockState(), EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Supplier<Block> SANDSTONE_TILE_SLAB = register("sandstone_tile_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Supplier<Block> SANDSTONE_TILE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"sandstone_tile_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Supplier<Block> SANDSTONE_TILE_WALL = register("sandstone_tile_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);

    public static final Supplier<Block> CHISELED_SANDSTONE_BRICKS = register("chiseled_sandstone_bricks", () -> new Block(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Supplier<Block> ENGRAVED_SANDSTONE_BRICKS = register("engraved_sandstone_bricks", () -> new Block(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Supplier<Block> DECORATED_SANDSTONE_BRICKS = register("decorated_sandstone_bricks", () -> new Block(EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Supplier<Block> SANDSTONE_PILLAR = register("sandstone_pillar", () -> new RotatedPillarBlock(EBProperties.BlockP.POLISHED_SANDSTONE), true);

    //RED POLISHED SANDSTONE
    public static final Supplier<Block> POLISHED_RED_SANDSTONE = register("polished_red_sandstone", () -> new Block(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Supplier<Block> POLISHED_RED_SANDSTONE_STAIRS = register("polished_red_sandstone_stairs", () -> new EBStairBlock(POLISHED_RED_SANDSTONE.get().defaultBlockState(), EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Supplier<Block> POLISHED_RED_SANDSTONE_SLAB = register("polished_red_sandstone_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Supplier<Block> POLISHED_RED_SANDSTONE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"polished_red_sandstone_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Supplier<Block> POLISHED_RED_SANDSTONE_WALL = register("polished_red_sandstone_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);

    public static final Supplier<Block> RED_SANDSTONE_BRICKS = register("red_sandstone_bricks", () -> new Block(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Supplier<Block> RED_SANDSTONE_BRICK_STAIRS = register("red_sandstone_brick_stairs", () -> new EBStairBlock(RED_SANDSTONE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Supplier<Block> RED_SANDSTONE_BRICK_SLAB = register("red_sandstone_brick_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Supplier<Block> RED_SANDSTONE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"red_sandstone_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Supplier<Block> RED_SANDSTONE_BRICK_WALL = register("red_sandstone_brick_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);

    public static final Supplier<Block> RED_SANDSTONE_TILES = register("red_sandstone_tiles", () -> new Block(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Supplier<Block> RED_SANDSTONE_TILE_STAIRS = register("red_sandstone_tile_stairs", () -> new EBStairBlock(RED_SANDSTONE_TILES.get().defaultBlockState(), EBProperties.BlockP.POLISHED_SANDSTONE), true);
    public static final Supplier<Block> RED_SANDSTONE_TILE_SLAB = register("red_sandstone_tile_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Supplier<Block> RED_SANDSTONE_TILE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"red_sandstone_tile_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Supplier<Block> RED_SANDSTONE_TILE_WALL = register("red_sandstone_tile_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);

    public static final Supplier<Block> CHISELED_RED_SANDSTONE_BRICKS = register("chiseled_red_sandstone_bricks", () -> new Block(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Supplier<Block> ENGRAVED_RED_SANDSTONE_BRICKS = register("engraved_red_sandstone_bricks", () -> new Block(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Supplier<Block> DECORATED_RED_SANDSTONE_BRICKS = register("decorated_red_sandstone_bricks", () -> new Block(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);
    public static final Supplier<Block> RED_SANDSTONE_PILLAR = register("red_sandstone_pillar", () -> new RotatedPillarBlock(EBProperties.BlockP.POLISHED_RED_SANDSTONE), true);

    //SOUL POLISHED SANDSTONE
    public static final Supplier<Block> POLISHED_SOUL_SANDSTONE = register("polished_soul_sandstone", () -> new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Supplier<Block> POLISHED_SOUL_SANDSTONE_STAIRS = register("polished_soul_sandstone_stairs", () -> new EBStairBlock(POLISHED_SOUL_SANDSTONE.get().defaultBlockState(), EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Supplier<Block> POLISHED_SOUL_SANDSTONE_SLAB = register("polished_soul_sandstone_slab", () -> new SlabBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Supplier<Block> POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"polished_soul_sandstone_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Supplier<Block> POLISHED_SOUL_SANDSTONE_WALL = register("polished_soul_sandstone_wall", () -> new WallBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);

    public static final Supplier<Block> SOUL_SANDSTONE_BRICKS = register("soul_sandstone_bricks", () -> new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Supplier<Block> SOUL_SANDSTONE_BRICK_STAIRS = register("soul_sandstone_brick_stairs", () -> new EBStairBlock(SOUL_SANDSTONE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Supplier<Block> SOUL_SANDSTONE_BRICK_SLAB = register("soul_sandstone_brick_slab", () -> new SlabBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Supplier<Block> SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"soul_sandstone_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Supplier<Block> SOUL_SANDSTONE_BRICK_WALL = register("soul_sandstone_brick_wall", () -> new WallBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);

    public static final Supplier<Block> SOUL_SANDSTONE_TILES = register("soul_sandstone_tiles", () -> new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Supplier<Block> SOUL_SANDSTONE_TILE_STAIRS = register("soul_sandstone_tile_stairs", () -> new EBStairBlock(SOUL_SANDSTONE_TILES.get().defaultBlockState(), EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Supplier<Block> SOUL_SANDSTONE_TILE_SLAB = register("soul_sandstone_tile_slab", () -> new SlabBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Supplier<Block> SOUL_SANDSTONE_TILE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"soul_sandstone_tile_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Supplier<Block> SOUL_SANDSTONE_TILE_WALL = register("soul_sandstone_tile_wall", () -> new WallBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);

    public static final Supplier<Block> CHISELED_SOUL_SANDSTONE_BRICKS = register("chiseled_soul_sandstone_bricks", () -> new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Supplier<Block> ENGRAVED_SOUL_SANDSTONE_BRICKS = register("engraved_soul_sandstone_bricks", () -> new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Supplier<Block> DECORATED_SOUL_SANDSTONE_BRICKS = register("decorated_soul_sandstone_bricks", () -> new Block(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);
    public static final Supplier<Block> SOUL_SANDSTONE_PILLAR = register("soul_sandstone_pillar", () -> new RotatedPillarBlock(EBProperties.BlockP.SMOOTH_SOUL_SANDSTONE), true);

    //LADDERS
    public static final Supplier<Block> SPRUCE_LADDER = registerConfigurable(Services.CONFIG.enableLadderVariants(), Optional.empty(), "spruce_ladder", () -> new EBLadderBlock(EBProperties.BlockP.GENERIC_LADDER), true);
    public static final Supplier<Block> BIRCH_LADDER = registerConfigurable(Services.CONFIG.enableLadderVariants(), Optional.empty(), "birch_ladder", () -> new EBLadderBlock(EBProperties.BlockP.GENERIC_LADDER), true);
    public static final Supplier<Block> JUNGLE_LADDER = registerConfigurable(Services.CONFIG.enableLadderVariants(), Optional.empty(), "jungle_ladder", () -> new EBLadderBlock(EBProperties.BlockP.GENERIC_LADDER), true);
    public static final Supplier<Block> ACACIA_LADDER = registerConfigurable(Services.CONFIG.enableLadderVariants(), Optional.empty(), "acacia_ladder", () -> new EBLadderBlock(EBProperties.BlockP.GENERIC_LADDER), true);
    public static final Supplier<Block> DARK_OAK_LADDER = registerConfigurable(Services.CONFIG.enableLadderVariants(), Optional.empty(), "dark_oak_ladder", () -> new EBLadderBlock(EBProperties.BlockP.GENERIC_LADDER), true);
    public static final Supplier<Block> MANGROVE_LADDER = registerConfigurable(Services.CONFIG.enableLadderVariants(), Optional.empty(), "mangrove_ladder", () -> new EBLadderBlock(EBProperties.BlockP.GENERIC_LADDER), true);
    public static final Supplier<Block> CHERRY_LADDER = registerConfigurable(Services.CONFIG.enableLadderVariants(), Optional.empty(), "cherry_ladder", () -> new EBLadderBlock(EBProperties.BlockP.CHERRY_LADDER), true);
    public static final Supplier<Block> BAMBOO_LADDER = registerConfigurable(Services.CONFIG.enableLadderVariants(), Optional.empty(), "bamboo_ladder", () -> new EBLadderBlock(EBProperties.BlockP.BAMBOO_LADDER), true);
    public static final Supplier<Block> CRIMSON_LADDER = registerConfigurable(Services.CONFIG.enableLadderVariants(), Optional.empty(), "crimson_ladder", () -> new EBLadderBlock(EBProperties.BlockP.CRIMSON_LADDER), true);
    public static final Supplier<Block> WARPED_LADDER = registerConfigurable(Services.CONFIG.enableLadderVariants(), Optional.empty(), "warped_ladder", () -> new EBLadderBlock(EBProperties.BlockP.WARPED_LADDER), true);
    public static final Supplier<Block> ANCIENT_LADDER = registerConfigurable(Services.CONFIG.enableLadderVariants(), Optional.empty(), "ancient_ladder", () -> new EBLadderBlock(EBProperties.BlockP.ANCIENT_LADDER), true);
    public static final Supplier<Block> GLOOM_LADDER = registerConfigurable(Services.CONFIG.enableLadderVariants(), Optional.empty(), "gloom_ladder", () -> new EBLadderBlock(EBProperties.BlockP.GLOOM_LADDER), true);

    //CHESTS
//    public static final Supplier<Block> SPRUCE_CHEST = registerCV("spruce_chest", () -> new EBChestBlock(EBProperties.BlockP.GENERIC_WOOD, WoodType.SPRUCE, () -> EBBlockEntities.EB_CHEST), true);
//    public static final Supplier<Block> BIRCH_CHEST = registerCV("birch_chest", () -> new EBChestBlock(EBProperties.BlockP.GENERIC_WOOD, WoodType.BIRCH, () -> EBBlockEntities.EB_CHEST), true);
//    public static final Supplier<Block> JUNGLE_CHEST = registerCV("jungle_chest", () -> new EBChestBlock(EBProperties.BlockP.GENERIC_WOOD, WoodType.JUNGLE, () -> EBBlockEntities.EB_CHEST), true);
//    public static final Supplier<Block> ACACIA_CHEST = registerCV("acacia_chest", () -> new EBChestBlock(EBProperties.BlockP.GENERIC_WOOD, WoodType.ACACIA, () -> EBBlockEntities.EB_CHEST), true);
//    public static final Supplier<Block> DARK_OAK_CHEST = registerCV("dark_oak_chest", () -> new EBChestBlock(EBProperties.BlockP.GENERIC_WOOD, WoodType.DARK_OAK, () -> EBBlockEntities.EB_CHEST), true);
//    public static final Supplier<Block> MANGROVE_CHEST = registerCV("mangrove_chest", () -> new EBChestBlock(EBProperties.BlockP.GENERIC_WOOD, WoodType.MANGROVE, () -> EBBlockEntities.EB_CHEST), true);
//    public static final Supplier<Block> CHERRY_CHEST = registerCV("cherry_chest", () -> new EBChestBlock(EBProperties.BlockP.CHERRY_WOOD, WoodType.CHERRY, () -> EBBlockEntities.EB_CHEST), true);
//    public static final Supplier<Block> BAMBOO_CHEST = registerCV("bamboo_chest", () -> new EBChestBlock(EBProperties.BlockP.BAMBOO_WOOD, WoodType.BAMBOO, () -> EBBlockEntities.EB_CHEST), true);
//    public static final Supplier<Block> CRIMSON_CHEST = registerCV("crimson_chest", () -> new EBChestBlock(EBProperties.BlockP.CRIMSON_WOOD, WoodType.CRIMSON, () -> EBBlockEntities.EB_CHEST), true);
//    public static final Supplier<Block> WARPED_CHEST = registerCV("warped_chest", () -> new EBChestBlock(EBProperties.BlockP.WARPED_WOOD, WoodType.WARPED, () -> EBBlockEntities.EB_CHEST), true);
//    public static final Supplier<Block> ANCIENT_CHEST = registerCV("ancient_chest", () -> new EBChestBlock(EBProperties.BlockP.CHERRY_WOOD, EBBlockSetTypes.EBWoodTypes.ANCIENT, () -> EBBlockEntities.EB_CHEST), true);
//    public static final Supplier<Block> GLOOM_CHEST = registerCV("gloom_chest", () -> new EBChestBlock(EBProperties.BlockP.CHERRY_WOOD, EBBlockSetTypes.EBWoodTypes.GLOOM, () -> EBBlockEntities.EB_CHEST), true);
//
//    //TRAPPED CHESTS
//    public static final Supplier<Block> TRAPPED_SPRUCE_CHEST = registerCV("trapped_spruce_chest", () -> new EBTrappedChestBlock(EBProperties.BlockP.GENERIC_WOOD, WoodType.SPRUCE, () -> EBBlockEntities.EB_TRAPPED_CHEST), true);
//    public static final Supplier<Block> TRAPPED_BIRCH_CHEST = registerCV("trapped_birch_chest", () -> new EBTrappedChestBlock(EBProperties.BlockP.GENERIC_WOOD, WoodType.BIRCH, () -> EBBlockEntities.EB_TRAPPED_CHEST), true);
//    public static final Supplier<Block> TRAPPED_JUNGLE_CHEST = registerCV("trapped_jungle_chest", () -> new EBTrappedChestBlock(EBProperties.BlockP.GENERIC_WOOD, WoodType.JUNGLE, () -> EBBlockEntities.EB_TRAPPED_CHEST), true);
//    public static final Supplier<Block> TRAPPED_ACACIA_CHEST = registerCV("trapped_acacia_chest", () -> new EBTrappedChestBlock(EBProperties.BlockP.GENERIC_WOOD, WoodType.ACACIA, () -> EBBlockEntities.EB_TRAPPED_CHEST), true);
//    public static final Supplier<Block> TRAPPED_DARK_OAK_CHEST = registerCV("trapped_dark_oak_chest", () -> new EBTrappedChestBlock(EBProperties.BlockP.GENERIC_WOOD, WoodType.DARK_OAK, () -> EBBlockEntities.EB_TRAPPED_CHEST), true);
//    public static final Supplier<Block> TRAPPED_MANGROVE_CHEST = registerCV("trapped_mangrove_chest", () -> new EBTrappedChestBlock(EBProperties.BlockP.GENERIC_WOOD, WoodType.MANGROVE, () -> EBBlockEntities.EB_TRAPPED_CHEST), true);
//    public static final Supplier<Block> TRAPPED_CHERRY_CHEST = registerCV("trapped_cherry_chest", () -> new EBTrappedChestBlock(EBProperties.BlockP.CHERRY_WOOD, WoodType.CHERRY, () -> EBBlockEntities.EB_TRAPPED_CHEST), true);
//    public static final Supplier<Block> TRAPPED_BAMBOO_CHEST = registerCV("trapped_bamboo_chest", () -> new EBTrappedChestBlock(EBProperties.BlockP.BAMBOO_WOOD, WoodType.BAMBOO, () -> EBBlockEntities.EB_TRAPPED_CHEST), true);
//    public static final Supplier<Block> TRAPPED_CRIMSON_CHEST = registerCV("trapped_crimson_chest", () -> new EBTrappedChestBlock(EBProperties.BlockP.CRIMSON_WOOD, WoodType.CRIMSON, () -> EBBlockEntities.EB_TRAPPED_CHEST), true);
//    public static final Supplier<Block> TRAPPED_WARPED_CHEST = registerCV("trapped_warped_chest", () -> new EBTrappedChestBlock(EBProperties.BlockP.WARPED_WOOD, WoodType.WARPED, () -> EBBlockEntities.EB_TRAPPED_CHEST), true);
//    public static final Supplier<Block> TRAPPED_ANCIENT_CHEST = registerCV("trapped_ancient_chest", () -> new EBTrappedChestBlock(EBProperties.BlockP.CHERRY_WOOD, EBBlockSetTypes.EBWoodTypes.ANCIENT, () -> EBBlockEntities.EB_TRAPPED_CHEST), true);
//    public static final Supplier<Block> TRAPPED_GLOOM_CHEST = registerCV("trapped_gloom_chest", () -> new EBTrappedChestBlock(EBProperties.BlockP.CHERRY_WOOD, EBBlockSetTypes.EBWoodTypes.GLOOM, () -> EBBlockEntities.EB_TRAPPED_CHEST), true);

    //CRAFTING TABLES
    public static final Supplier<Block> SPRUCE_CRAFTING_TABLE = registerConfigurable(Services.CONFIG.enableCraftingTableVariants(), Optional.empty(), "spruce_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> BIRCH_CRAFTING_TABLE = registerConfigurable(Services.CONFIG.enableCraftingTableVariants(), Optional.empty(), "birch_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> JUNGLE_CRAFTING_TABLE = registerConfigurable(Services.CONFIG.enableCraftingTableVariants(), Optional.empty(), "jungle_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> ACACIA_CRAFTING_TABLE = registerConfigurable(Services.CONFIG.enableCraftingTableVariants(), Optional.empty(), "acacia_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> DARK_OAK_CRAFTING_TABLE = registerConfigurable(Services.CONFIG.enableCraftingTableVariants(), Optional.empty(), "dark_oak_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> MANGROVE_CRAFTING_TABLE = registerConfigurable(Services.CONFIG.enableCraftingTableVariants(), Optional.empty(), "mangrove_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockP.GENERIC_WOOD), true);
    public static final Supplier<Block> CHERRY_CRAFTING_TABLE = registerConfigurable(Services.CONFIG.enableCraftingTableVariants(), Optional.empty(), "cherry_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Supplier<Block> BAMBOO_CRAFTING_TABLE = registerConfigurable(Services.CONFIG.enableCraftingTableVariants(), Optional.empty(), "bamboo_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockP.BAMBOO_WOOD), true);
    public static final Supplier<Block> CRIMSON_CRAFTING_TABLE = registerConfigurable(Services.CONFIG.enableCraftingTableVariants(), Optional.empty(), "crimson_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockP.CRIMSON_WOOD), true);
    public static final Supplier<Block> WARPED_CRAFTING_TABLE = registerConfigurable(Services.CONFIG.enableCraftingTableVariants(), Optional.empty(), "warped_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockP.WARPED_WOOD), true);
    public static final Supplier<Block> ANCIENT_CRAFTING_TABLE = registerConfigurable(Services.CONFIG.enableCraftingTableVariants(), Optional.empty(), "ancient_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockP.CHERRY_WOOD), true);
    public static final Supplier<Block> GLOOM_CRAFTING_TABLE = registerConfigurable(Services.CONFIG.enableCraftingTableVariants(), Optional.empty(), "gloom_crafting_table", () -> new EBCraftingTableBlock(EBProperties.BlockP.CHERRY_WOOD), true);

    //BOOKSHELF
    public static final Supplier<Block> SPRUCE_BOOKSHELF = registerConfigurable(Services.CONFIG.enableShelfVariants(), Optional.empty(), "spruce_bookshelf", () -> new EBBookshelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Supplier<Block> BIRCH_BOOKSHELF = registerConfigurable(Services.CONFIG.enableShelfVariants(), Optional.empty(), "birch_bookshelf", () -> new EBBookshelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Supplier<Block> JUNGLE_BOOKSHELF = registerConfigurable(Services.CONFIG.enableShelfVariants(), Optional.empty(), "jungle_bookshelf", () -> new EBBookshelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Supplier<Block> ACACIA_BOOKSHELF = registerConfigurable(Services.CONFIG.enableShelfVariants(), Optional.empty(), "acacia_bookshelf", () -> new EBBookshelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Supplier<Block> DARK_OAK_BOOKSHELF = registerConfigurable(Services.CONFIG.enableShelfVariants(), Optional.empty(), "dark_oak_bookshelf", () -> new EBBookshelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Supplier<Block> MANGROVE_BOOKSHELF = registerConfigurable(Services.CONFIG.enableShelfVariants(), Optional.empty(), "mangrove_bookshelf", () -> new EBBookshelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Supplier<Block> CHERRY_BOOKSHELF = registerConfigurable(Services.CONFIG.enableShelfVariants(), Optional.empty(), "cherry_bookshelf", () -> new EBBookshelfBlock(EBProperties.BlockP.CHERRY_SHELF), true);
    public static final Supplier<Block> BAMBOO_BOOKSHELF = registerConfigurable(Services.CONFIG.enableShelfVariants(), Optional.empty(), "bamboo_bookshelf", () -> new EBBookshelfBlock(EBProperties.BlockP.BAMBOO_SHELF), true);
    public static final Supplier<Block> CRIMSON_BOOKSHELF = registerConfigurable(Services.CONFIG.enableShelfVariants(), Optional.empty(), "crimson_bookshelf", () -> new EBBookshelfBlock(EBProperties.BlockP.CRIMSON_SHELF), true);
    public static final Supplier<Block> WARPED_BOOKSHELF = registerConfigurable(Services.CONFIG.enableShelfVariants(), Optional.empty(), "warped_bookshelf", () -> new EBBookshelfBlock(EBProperties.BlockP.WARPED_SHELF), true);
    public static final Supplier<Block> ANCIENT_BOOKSHELF = registerConfigurable(Services.CONFIG.enableShelfVariants(), Optional.empty(), "ancient_bookshelf", () -> new EBBookshelfBlock(EBProperties.BlockP.CHERRY_SHELF), true);
    public static final Supplier<Block> GLOOM_BOOKSHELF = registerConfigurable(Services.CONFIG.enableShelfVariants(), Optional.empty(), "gloom_bookshelf", () -> new EBBookshelfBlock(EBProperties.BlockP.CHERRY_SHELF), true);

    //DECORATIVE SHELF
    public static final Supplier<Block> OAK_DECORATIVE_SHELF = registerConfigurable(Services.CONFIG.enableDecorativeShelves(), Optional.empty(), "oak_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Supplier<Block> SPRUCE_DECORATIVE_SHELF = registerConfigurable(Services.CONFIG.enableDecorativeShelves(), Optional.empty(), "spruce_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Supplier<Block> BIRCH_DECORATIVE_SHELF = registerConfigurable(Services.CONFIG.enableDecorativeShelves(), Optional.empty(), "birch_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Supplier<Block> JUNGLE_DECORATIVE_SHELF = registerConfigurable(Services.CONFIG.enableDecorativeShelves(), Optional.empty(), "jungle_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Supplier<Block> ACACIA_DECORATIVE_SHELF = registerConfigurable(Services.CONFIG.enableDecorativeShelves(), Optional.empty(), "acacia_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Supplier<Block> DARK_OAK_DECORATIVE_SHELF = registerConfigurable(Services.CONFIG.enableDecorativeShelves(), Optional.empty(), "dark_oak_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Supplier<Block> MANGROVE_DECORATIVE_SHELF = registerConfigurable(Services.CONFIG.enableDecorativeShelves(), Optional.empty(), "mangrove_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockP.GENERIC_SHELF), true);
    public static final Supplier<Block> CHERRY_DECORATIVE_SHELF = registerConfigurable(Services.CONFIG.enableDecorativeShelves(), Optional.empty(), "cherry_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockP.CHERRY_SHELF), true);
    public static final Supplier<Block> BAMBOO_DECORATIVE_SHELF = registerConfigurable(Services.CONFIG.enableDecorativeShelves(), Optional.empty(), "bamboo_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockP.BAMBOO_SHELF), true);
    public static final Supplier<Block> CRIMSON_DECORATIVE_SHELF = registerConfigurable(Services.CONFIG.enableDecorativeShelves(), Optional.empty(), "crimson_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockP.CRIMSON_SHELF), true);
    public static final Supplier<Block> WARPED_DECORATIVE_SHELF = registerConfigurable(Services.CONFIG.enableDecorativeShelves(), Optional.empty(), "warped_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockP.WARPED_SHELF), true);
    public static final Supplier<Block> ANCIENT_DECORATIVE_SHELF = registerConfigurable(Services.CONFIG.enableDecorativeShelves(), Optional.empty(), "ancient_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockP.CHERRY_SHELF), true);
    public static final Supplier<Block> GLOOM_DECORATIVE_SHELF = registerConfigurable(Services.CONFIG.enableDecorativeShelves(), Optional.empty(), "gloom_decorative_shelf", () -> new DecorativeShelfBlock(EBProperties.BlockP.CHERRY_SHELF), true);
    
    //DECORATIVES
    public static final Supplier<Block> WOODEN_MUG = registerConfigurable(Services.CONFIG.enableDecoratives(), Optional.empty(), "wooden_mug", () -> new WoodenMugBlock(EBProperties.BlockP.WOODEN_MUG), true);
    public static final Supplier<Block> GLASS_JAR = registerConfigurable(Services.CONFIG.enableDecoratives(), Optional.empty(), "glass_jar", () -> new GlassJarBlock(EBProperties.BlockP.GLASS_JAR), true);
    public static final Supplier<Block> GLASS_JAR_OF_FIRE = registerConfigurable(Services.CONFIG.enableDecoratives(), Optional.empty(), "glass_jar_of_fire", () -> new GlassJarBlock(EBProperties.BlockP.FIRE_GLASS_JAR), true);
    public static final Supplier<Block> GLASS_JAR_OF_SOUL_FIRE = registerConfigurable(Services.CONFIG.enableDecoratives(), Optional.empty(), "glass_jar_of_soul_fire", () -> new GlassJarBlock(EBProperties.BlockP.SOUL_FIRE_GLASS_JAR), true);

    //STONE VARIANTS
    public static final Supplier<Block> GRANITE_BRICKS = register("granite_bricks", () -> new Block(EBProperties.BlockP.POLISHED_GRANITE), true);
    public static final Supplier<Block> GRANITE_BRICK_STAIRS = register("granite_brick_stairs", () -> new EBStairBlock(GRANITE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.POLISHED_GRANITE), true);
    public static final Supplier<Block> GRANITE_BRICK_SLAB = register("granite_brick_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_GRANITE), true);
    public static final Supplier<Block> GRANITE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"granite_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.POLISHED_GRANITE), true);
    public static final Supplier<Block> GRANITE_BRICK_WALL = register("granite_brick_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_GRANITE), true);
    public static final Supplier<Block> CRACKED_GRANITE_BRICKS = register("cracked_granite_bricks", () -> new Block(EBProperties.BlockP.POLISHED_GRANITE), true);

    public static final Supplier<Block> ANDESITE_BRICKS = register("andesite_bricks", () -> new Block(EBProperties.BlockP.POLISHED_ANDESITE), true);
    public static final Supplier<Block> ANDESITE_BRICK_STAIRS = register("andesite_brick_stairs", () -> new EBStairBlock(ANDESITE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.POLISHED_ANDESITE), true);
    public static final Supplier<Block> ANDESITE_BRICK_SLAB = register("andesite_brick_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_ANDESITE), true);
    public static final Supplier<Block> ANDESITE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"andesite_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.POLISHED_ANDESITE), true);
    public static final Supplier<Block> ANDESITE_BRICK_WALL = register("andesite_brick_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_ANDESITE), true);
    public static final Supplier<Block> CRACKED_ANDESITE_BRICKS = register("cracked_andesite_bricks", () -> new Block(EBProperties.BlockP.POLISHED_ANDESITE), true);

    public static final Supplier<Block> DIORITE_BRICKS = register("diorite_bricks", () -> new Block(EBProperties.BlockP.POLISHED_DIORITE), true);
    public static final Supplier<Block> DIORITE_BRICK_STAIRS = register("diorite_brick_stairs", () -> new EBStairBlock(DIORITE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.POLISHED_DIORITE), true);
    public static final Supplier<Block> DIORITE_BRICK_SLAB = register("diorite_brick_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_DIORITE), true);
    public static final Supplier<Block> DIORITE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"diorite_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.POLISHED_DIORITE), true);
    public static final Supplier<Block> DIORITE_BRICK_WALL = register("diorite_brick_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_DIORITE), true);
    public static final Supplier<Block> CRACKED_DIORITE_BRICKS = register("cracked_diorite_bricks", () -> new Block(EBProperties.BlockP.POLISHED_DIORITE), true);

    //BRICKS
    public static final Supplier<Block> SMOOTH_BRICKS = register("smooth_bricks", () -> new Block(EBProperties.BlockP.BRICKS), true);
    public static final Supplier<Block> SMOOTH_BRICK_STAIRS = register("smooth_brick_stairs", () -> new EBStairBlock(SMOOTH_BRICKS.get().defaultBlockState(), EBProperties.BlockP.BRICKS), true);
    public static final Supplier<Block> SMOOTH_BRICK_SLAB = register("smooth_brick_slab", () -> new SlabBlock(EBProperties.BlockP.BRICKS), true);
    public static final Supplier<Block> SMOOTH_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"smooth_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.BRICKS), true);
    public static final Supplier<Block> SMOOTH_BRICK_WALL = register("smooth_brick_wall", () -> new WallBlock(EBProperties.BlockP.BRICKS), true);
    public static final Supplier<Block> HERRINGBONE_BRICKS = register("herringbone_bricks", () -> new Block(EBProperties.BlockP.BRICKS), true);
    public static final Supplier<Block> SMOOTH_HERRINGBONE_BRICKS = register("smooth_herringbone_bricks", () -> new Block(EBProperties.BlockP.BRICKS), true);
    public static final Supplier<Block> CRACKED_SMOOTH_BRICKS = register("cracked_smooth_bricks", () -> new Block(EBProperties.BlockP.BRICKS), true);
    public static final Supplier<Block> CRACKED_BRICKS = register("cracked_bricks", () -> new Block(EBProperties.BlockP.BRICKS), true);

    //BRIMSTONE
    public static final Supplier<Block> BRIMSTONE = register("brimstone", () -> new Block(EBProperties.BlockP.BRIMSTONE), true);
    public static final Supplier<Block> BRIMSTONE_STAIRS = register("brimstone_stairs", () -> new EBStairBlock(BRIMSTONE.get().defaultBlockState(), EBProperties.BlockP.BRIMSTONE), true);
    public static final Supplier<Block> BRIMSTONE_SLAB = register("brimstone_slab", () -> new SlabBlock(EBProperties.BlockP.BRIMSTONE), true);
    public static final Supplier<Block> BRIMSTONE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"brimstone_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.BRIMSTONE), true);
    public static final Supplier<Block> BRIMSTONE_WALL = register("brimstone_wall", () -> new WallBlock(EBProperties.BlockP.BRIMSTONE), true);

    public static final Supplier<Block> POLISHED_BRIMSTONE = register("polished_brimstone", () -> new Block(EBProperties.BlockP.POLISHED_BRIMSTONE), true);
    public static final Supplier<Block> POLISHED_BRIMSTONE_STAIRS = register("polished_brimstone_stairs", () -> new EBStairBlock(POLISHED_BRIMSTONE.get().defaultBlockState(), EBProperties.BlockP.POLISHED_BRIMSTONE), true);
    public static final Supplier<Block> POLISHED_BRIMSTONE_SLAB = register("polished_brimstone_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_BRIMSTONE), true);
    public static final Supplier<Block> POLISHED_BRIMSTONE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"polished_brimstone_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.POLISHED_BRIMSTONE), true);

    public static final Supplier<Block> BRIMSTONE_BRICKS = register("brimstone_bricks", () -> new Block(EBProperties.BlockP.BRIMSTONE_BRICKS), true);
    public static final Supplier<Block> BRIMSTONE_BRICK_STAIRS = register("brimstone_brick_stairs", () -> new EBStairBlock(BRIMSTONE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.BRIMSTONE_BRICKS), true);
    public static final Supplier<Block> BRIMSTONE_BRICK_SLAB = register("brimstone_brick_slab", () -> new SlabBlock(EBProperties.BlockP.BRIMSTONE_BRICKS), true);
    public static final Supplier<Block> BRIMSTONE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"brimstone_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.BRIMSTONE_BRICKS), true);
    public static final Supplier<Block> CRACKED_BRIMSTONE_BRICKS = register("cracked_brimstone_bricks", () -> new Block(EBProperties.BlockP.BRIMSTONE_BRICKS), true);

    public static final Supplier<Block> BRIMSTONE_TILES = register("brimstone_tiles", () -> new Block(EBProperties.BlockP.BRIMSTONE_TILES), true);
    public static final Supplier<Block> BRIMSTONE_TILE_STAIRS = register("brimstone_tile_stairs", () -> new EBStairBlock(BRIMSTONE_TILES.get().defaultBlockState(), EBProperties.BlockP.BRIMSTONE_TILES), true);
    public static final Supplier<Block> BRIMSTONE_TILE_SLAB = register("brimstone_tile_slab", () -> new SlabBlock(EBProperties.BlockP.BRIMSTONE_TILES), true);
    public static final Supplier<Block> BRIMSTONE_TILE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"brimstone_tile_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.BRIMSTONE_TILES), true);

    public static final Supplier<Block> BRIMSTONE_PILLAR = register("brimstone_pillar", () -> new RotatedPillarBlock(EBProperties.BlockP.BRIMSTONE_BRICKS), true);
    public static final Supplier<Block> BRIMSTONE_LAMP = register("brimstone_lamp", () -> new Block(EBProperties.BlockP.BRIMSTONE_LAMP), true);
    public static final Supplier<Block> BRIMSTONE_WINDOW = register("brimstone_window", () -> new Block(EBProperties.BlockP.BRIMSTONE_LAMP), true);

    //SMOOTH STONE
    public static final Supplier<Block> POLISHED_STONE = register("polished_stone", () -> new Block(EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Supplier<Block> POLISHED_STONE_STAIRS = register("polished_stone_stairs", () -> new EBStairBlock(POLISHED_STONE.get().defaultBlockState(), EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Supplier<Block> POLISHED_STONE_SLAB = register("polished_stone_slab", () -> new SlabBlock(EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Supplier<Block> POLISHED_STONE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"polished_stone_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.SMOOTH_STONE), true);

    public static final Supplier<Block> SMOOTH_STONE_BRICKS = register("smooth_stone_bricks", () -> new Block(EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Supplier<Block> SMOOTH_STONE_BRICK_STAIRS = register("smooth_stone_brick_stairs", () -> new EBStairBlock(SMOOTH_STONE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Supplier<Block> SMOOTH_STONE_BRICK_SLAB = register("smooth_stone_brick_slab", () -> new SlabBlock(EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Supplier<Block> SMOOTH_STONE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"smooth_stone_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Supplier<Block> CRACKED_SMOOTH_STONE_BRICKS = register("cracked_smooth_stone_bricks", () -> new Block(EBProperties.BlockP.SMOOTH_STONE), true);

    public static final Supplier<Block> SMOOTH_STONE_TILES = register("smooth_stone_tiles", () -> new Block(EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Supplier<Block> SMOOTH_STONE_TILE_STAIRS = register("smooth_stone_tile_stairs", () -> new EBStairBlock(SMOOTH_STONE_TILES.get().defaultBlockState(), EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Supplier<Block> SMOOTH_STONE_TILE_SLAB = register("smooth_stone_tile_slab", () -> new SlabBlock(EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Supplier<Block> SMOOTH_STONE_TILE_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"smooth_stone_tile_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Supplier<Block> CRACKED_SMOOTH_STONE_TILES = register("cracked_smooth_stone_tiles", () -> new Block(EBProperties.BlockP.SMOOTH_STONE), true);

    public static final Supplier<Block> CHISELED_SMOOTH_STONE_BRICKS = register("chiseled_smooth_stone_bricks", () -> new Block(EBProperties.BlockP.SMOOTH_STONE), true);
    public static final Supplier<Block> SMOOTH_STONE_PILLAR = register("smooth_stone_pillar", () -> new RotatedPillarBlock(EBProperties.BlockP.SMOOTH_STONE), true);

    //ASPHALT
    public static final Supplier<Block> ASPHALT = registerConfigurable(Services.CONFIG.enableAsphalt(), Optional.empty(), "asphalt", () -> new AsphaltBlock(EBProperties.BlockP.ASPHALT), true);
    public static final Supplier<Block> ASPHALT_STAIRS = registerConfigurable(Services.CONFIG.enableAsphalt(), Optional.empty(), "asphalt_stairs", () -> new AsphaltStairsBlock(ASPHALT.get().defaultBlockState(), EBProperties.BlockP.ASPHALT), true);
    public static final Supplier<Block> ASPHALT_SLAB = registerConfigurable(Services.CONFIG.enableAsphalt(), Optional.empty(), "asphalt_slab", () -> new AsphaltSlabBlock(EBProperties.BlockP.ASPHALT), true);
    public static final Supplier<Block> ASPHALT_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.of(Services.CONFIG.enableAsphalt()), "asphalt_vertical_stairs", () -> new AsphaltVerticalStairsBlock(EBProperties.BlockP.ASPHALT), true);

    //NATURE
    public static final Supplier<Block> ROSE = register("rose", () -> new FlowerBlock(MobEffects.HEALTH_BOOST, 20, EBProperties.BlockP.ROSE), true);
    public static final Supplier<Block> POTTED_ROSE = register("potted_rose", () -> flowerPot(EBBlocks.ROSE), false);
    public static final Supplier<Block> CYAN_ROSE = register("cyan_rose", () -> new FlowerBlock(MobEffects.INVISIBILITY, 10, EBProperties.BlockP.CYAN_ROSE), true);
    public static final Supplier<Block> POTTED_CYAN_ROSE = register("potted_cyan_rose", () -> flowerPot(EBBlocks.CYAN_ROSE), false);
    public static final Supplier<Block> WHITE_ROSE = register("white_rose", () -> new FlowerBlock(MobEffects.LUCK, 30, EBProperties.BlockP.WHITE_ROSE), true);
    public static final Supplier<Block> POTTED_WHITE_ROSE = register("potted_white_rose", () -> flowerPot(EBBlocks.WHITE_ROSE), false);
    public static final Supplier<Block> MOSS_PASTE = register("moss_paste", () -> new GlowLichenBlock(EBProperties.BlockP.MOSS_PASTE), true);

    //PAPER
    public static final Supplier<Block> PAPER_BLOCK = register("paper_block", () -> new Block(EBProperties.BlockP.PAPER), true);

    public static final Supplier<Block> THIN_PAPER_BLOCK = register("thin_paper_block", () -> new Block(EBProperties.BlockP.PAPER), true);
    public static final Supplier<Block> THIN_PAPER_STAIRS = register("thin_paper_stairs", () -> new EBStairBlock(THIN_PAPER_BLOCK.get().defaultBlockState(), EBProperties.BlockP.PAPER), true);
    public static final Supplier<Block> THIN_PAPER_SLAB = register("thin_paper_slab", () -> new SlabBlock(EBProperties.BlockP.PAPER), true);
    public static final Supplier<Block> THIN_PAPER_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"thin_paper_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.PAPER), true);
    public static final Supplier<Block> THIN_DIVIDED_PAPER_BLOCK = register("thin_divided_paper_block", () -> new Block(EBProperties.BlockP.PAPER), true);
    public static final Supplier<Block> THIN_DIAGONAL_PAPER_BLOCK = register("thin_diagonal_paper_block", () -> new EBHorizontalFacingBlock(EBProperties.BlockP.PAPER), true);

    public static final Supplier<Block> THICK_PAPER_BLOCK = register("thick_paper_block", () -> new Block(EBProperties.BlockP.PAPER), true);
    public static final Supplier<Block> THICK_PAPER_STAIRS = register("thick_paper_stairs", () -> new EBStairBlock(THICK_PAPER_BLOCK.get().defaultBlockState(), EBProperties.BlockP.PAPER), true);
    public static final Supplier<Block> THICK_PAPER_SLAB = register("thick_paper_slab", () -> new SlabBlock(EBProperties.BlockP.PAPER), true);
    public static final Supplier<Block> THICK_PAPER_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"thick_paper_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.PAPER), true);
    public static final Supplier<Block> THICK_DIVIDED_PAPER_BLOCK = register("thick_divided_paper_block", () -> new Block(EBProperties.BlockP.PAPER), true);
    public static final Supplier<Block> THICK_DIAGONAL_PAPER_BLOCK = register("thick_diagonal_paper_block", () -> new EBHorizontalFacingBlock(EBProperties.BlockP.PAPER), true);

    //MISC
    public static final Supplier<Block> WEEPING_CANDLE = register("weeping_candle", () -> new ParticleCandleBlock(ParticleTypes.CRIMSON_SPORE, EBProperties.BlockP.PARTICLE_CANDLE), true);
    public static final Supplier<Block> TWISTING_CANDLE = register("twisting_candle", () -> new ParticleCandleBlock(ParticleTypes.WARPED_SPORE, EBProperties.BlockP.PARTICLE_CANDLE), true);
    
    public static final Supplier<Block> REACHING_LANTERN = register("reaching_lantern", () -> new ReachingLanternBlock(EBProperties.BlockP.REACHING_LANTERN), true);
    public static final Supplier<Block> AMETHYST_LAMP = register("amethyst_lamp", () -> new Block(EBProperties.BlockP.LAMP), true);

    public static final Supplier<Block> BONE_BRICKS = register("bone_bricks", () -> new Block(EBProperties.BlockP.BONE), true);
    public static final Supplier<Block> BONE_BRICK_STAIRS = register("bone_brick_stairs", () -> new EBStairBlock(BONE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.BONE), true);
    public static final Supplier<Block> BONE_BRICK_SLAB = register("bone_brick_slab", () -> new SlabBlock(EBProperties.BlockP.BONE), true);
    public static final Supplier<Block> BONE_BRICK_VERTICAL_STAIRS = registerConfigurable(Services.CONFIG.enableVerticalStairs(), Optional.empty(),"bone_brick_vertical_stairs", () -> new VerticalStairsBlock(EBProperties.BlockP.BONE), true);
    public static final Supplier<Block> BONE_BRICK_WALL = register("bone_brick_wall", () -> new WallBlock(EBProperties.BlockP.BONE), true);

    public static final Supplier<Block> LOGO_BLOCK = register("logo_block", () -> new Block(EBProperties.BlockP.INDESTRUCTIBLE), true);

    //TODO: CALCITE BLOCKSET, PEDESTALS, DYED TERRACOTTA POTS, GLOOM CRYSTALS, FLOWERING LEAVES (WITH FALLING LEAVES), BRAZIERS, DYEABLE PAPER BLOCKS

    private static <T extends Block> Supplier<T> register(String name, Supplier<T> blockSupplier, boolean blockItem) {
        if (blockItem) {
            return Services.REGISTRY.registerBlockWithItem(name, blockSupplier);
        }
        return Services.REGISTRY.registerBlock(name, blockSupplier);
    }

    private static <T extends Block> Supplier<T> registerConfigurable(boolean configValue, Optional<Boolean> optionalConfigValue, String name, Supplier<T> blockSupplier, boolean blockItem) {
        if (blockItem) {
            return Services.REGISTRY.registerConfigurableBlockWithItem(configValue, optionalConfigValue, name, blockSupplier);
        }
        return Services.REGISTRY.registerBlock(name, blockSupplier);
    }

    private static FlowerPotBlock flowerPot(Supplier<Block> $$0, FeatureFlag... $$1) {
        BlockBehaviour.Properties $$2 = BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY);
        if ($$1.length > 0) {
            $$2 = $$2.requiredFeatures($$1);
        }

        return new FlowerPotBlock($$0.get(), $$2);
    }


    public static void register() {
    }
}
