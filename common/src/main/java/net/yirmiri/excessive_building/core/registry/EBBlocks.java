package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.common.publicized.*;
import net.azurune.runiclib.core.platform.RLServices;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.block.*;
import net.yirmiri.excessive_building.common.util.EBProperties;
import net.yirmiri.excessive_building.core.init.EBTreeGrowers;

import java.util.HashMap;
import java.util.function.Supplier;

public class EBBlocks {
    //STONE BRICKS
    public static final Supplier<Block> COBBLESTONE_BRICKS = register("cobblestone_bricks", () -> new Block(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Supplier<Block> COBBLESTONE_BRICK_STAIRS = register("cobblestone_brick_stairs", () -> new PublicStairBlock(COBBLESTONE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Supplier<Block> COBBLESTONE_BRICK_SLAB = register("cobblestone_brick_slab", () -> new SlabBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Supplier<Block> COBBLESTONE_BRICK_WALL = register("cobblestone_brick_wall", () -> new WallBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Supplier<Block> CRACKED_COBBLESTONE_BRICKS = register("cracked_cobblestone_bricks", () -> new Block(EBProperties.BlockP.COBBLESTONE_BRICKS), true);

    public static final Supplier<Block> ANDESITE_BRICKS = register("andesite_bricks", () -> new Block(EBProperties.BlockP.POLISHED_ANDESITE), true);
    public static final Supplier<Block> ANDESITE_BRICK_STAIRS = register("andesite_brick_stairs", () -> new PublicStairBlock(ANDESITE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.POLISHED_ANDESITE), true);
    public static final Supplier<Block> ANDESITE_BRICK_SLAB = register("andesite_brick_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_ANDESITE), true);
    public static final Supplier<Block> ANDESITE_BRICK_WALL = register("andesite_brick_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_ANDESITE), true);

    public static final Supplier<Block> GRANITE_BRICKS = register("granite_bricks", () -> new Block(EBProperties.BlockP.POLISHED_GRANITE), true);
    public static final Supplier<Block> GRANITE_BRICK_STAIRS = register("granite_brick_stairs", () -> new PublicStairBlock(GRANITE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.POLISHED_GRANITE), true);
    public static final Supplier<Block> GRANITE_BRICK_SLAB = register("granite_brick_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_GRANITE), true);
    public static final Supplier<Block> GRANITE_BRICK_WALL = register("granite_brick_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_GRANITE), true);

    public static final Supplier<Block> DIORITE_BRICKS = register("diorite_bricks", () -> new Block(EBProperties.BlockP.POLISHED_DIORITE), true);
    public static final Supplier<Block> DIORITE_BRICK_STAIRS = register("diorite_brick_stairs", () -> new PublicStairBlock(DIORITE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.POLISHED_DIORITE), true);
    public static final Supplier<Block> DIORITE_BRICK_SLAB = register("diorite_brick_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_DIORITE), true);
    public static final Supplier<Block> DIORITE_BRICK_WALL = register("diorite_brick_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_DIORITE), true);

    //AMETHYST
    public static final Supplier<Block> AMETHYST_BRICKS = register("amethyst_bricks", () -> new Block(EBProperties.BlockP.AMETHYST), true);
    public static final Supplier<Block> AMETHYST_BRICK_STAIRS = register("amethyst_brick_stairs", () -> new PublicStairBlock(AMETHYST_BRICKS.get().defaultBlockState(), EBProperties.BlockP.AMETHYST), true);
    public static final Supplier<Block> AMETHYST_BRICK_SLAB = register("amethyst_brick_slab", () -> new SlabBlock(EBProperties.BlockP.AMETHYST), true);
    public static final Supplier<Block> AMETHYST_BRICK_WALL = register("amethyst_brick_wall", () -> new WallBlock(EBProperties.BlockP.AMETHYST), true);
    public static final Supplier<Block> AMETHYST_LAMP = register("amethyst_lamp", () -> new Block(EBProperties.BlockP.AMETHYST_LAMP), true);
    public static final Supplier<Block> AMETHYST_FRAMED_GLASS = register("amethyst_framed_glass", () -> new PublicTransparentBlock(EBProperties.BlockP.FRAMED_GLASS), true);
    public static final Supplier<Block> AMETHYST_FRAMED_GLASS_PANE = register("amethyst_framed_glass_pane", () -> new PublicIronBarsBlock(EBProperties.BlockP.FRAMED_GLASS_PANE), true);

    //LAVENDER
    public static final Supplier<Block> LAVENDER = register("lavender", () -> new ClayPlantBlock(MobEffects.HEALTH_BOOST, 7, EBProperties.BlockP.LAVENDER), true);
    public static final Supplier<Block> POTTED_LAVENDER = register("potted_lavender", () -> new FlowerPotBlock(LAVENDER.get(), EBProperties.BlockP.POTTED_LAVENDER), true);
    public static final Supplier<Block> LAVENDER_BLOCK = register("lavender_block", () -> new ClayPlantBaleBlock(EBProperties.BlockP.LAVENDER_BALE), true);
    public static final Supplier<Block> LAVENDER_CLAY = register("lavender_clay", () -> new Block(EBProperties.BlockP.LAVENDER_CLAY), true);
    public static final Supplier<Block> LAVENDER_BRICKS = register("lavender_bricks", () -> new Block(EBProperties.BlockP.LAVENDER_BRICKS), true);
    public static final Supplier<Block> LAVENDER_BRICK_STAIRS = register("lavender_brick_stairs", () -> new PublicStairBlock(LAVENDER_BRICKS.get().defaultBlockState(), EBProperties.BlockP.LAVENDER_BRICKS), true);
    public static final Supplier<Block> LAVENDER_BRICK_SLAB = register("lavender_brick_slab", () -> new SlabBlock(EBProperties.BlockP.LAVENDER_BRICKS), true);
    public static final Supplier<Block> LAVENDER_BRICK_WALL = register("lavender_brick_wall", () -> new WallBlock(EBProperties.BlockP.LAVENDER_BRICKS), true);
    public static final Supplier<Block> MOSSY_LAVENDER_BRICKS = register("mossy_lavender_bricks", () -> new Block(EBProperties.BlockP.LAVENDER_BRICKS), true);

    //SAGE
    public static final Supplier<Block> SAGE = register("sage", () -> new ClayPlantBlock(MobEffects.ABSORPTION, 7, EBProperties.BlockP.SAGE), true);
    public static final Supplier<Block> POTTED_SAGE = register("potted_sage", () -> new FlowerPotBlock(SAGE.get(), EBProperties.BlockP.POTTED_SAGE), true);
    public static final Supplier<Block> SAGE_BLOCK = register("sage_block", () -> new ClayPlantBaleBlock(EBProperties.BlockP.SAGE_BALE), true);
    public static final Supplier<Block> SAGE_CLAY = register("sage_clay", () -> new Block(EBProperties.BlockP.SAGE_CLAY), true);
    public static final Supplier<Block> SAGE_BRICKS = register("sage_bricks", () -> new Block(EBProperties.BlockP.SAGE_BRICKS), true);
    public static final Supplier<Block> SAGE_BRICK_STAIRS = register("sage_brick_stairs", () -> new PublicStairBlock(SAGE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.SAGE_BRICKS), true);
    public static final Supplier<Block> SAGE_BRICK_SLAB = register("sage_brick_slab", () -> new SlabBlock(EBProperties.BlockP.SAGE_BRICKS), true);
    public static final Supplier<Block> SAGE_BRICK_WALL = register("sage_brick_wall", () -> new WallBlock(EBProperties.BlockP.SAGE_BRICKS), true);
    public static final Supplier<Block> MOSSY_SAGE_BRICKS = register("mossy_sage_bricks", () -> new Block(EBProperties.BlockP.SAGE_BRICKS), true);

    //CORALSOIL
    public static final Supplier<Block> CORALSOIL = register("coralsoil", () -> new Block(EBProperties.BlockP.CORALSOIL_CLAY), true);
    public static final Supplier<Block> CORALSOIL_BRICKS = register("coralsoil_bricks", () -> new Block(EBProperties.BlockP.CORALSOIL), true);
    public static final Supplier<Block> CORALSOIL_BRICK_STAIRS = register("coralsoil_brick_stairs", () -> new PublicStairBlock(CORALSOIL_BRICKS.get().defaultBlockState(), EBProperties.BlockP.CORALSOIL), true);
    public static final Supplier<Block> CORALSOIL_BRICK_SLAB = register("coralsoil_brick_slab", () -> new SlabBlock(EBProperties.BlockP.CORALSOIL), true);
    public static final Supplier<Block> CORALSOIL_BRICK_WALL = register("coralsoil_brick_wall", () -> new WallBlock(EBProperties.BlockP.CORALSOIL), true);

    //COPPER BRICKS
    public static final Supplier<Block> COPPER_BRICKS = register("copper_bricks", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> COPPER_BRICK_STAIRS = register("copper_brick_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.UNAFFECTED, COPPER_BRICKS.get().defaultBlockState(), EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> COPPER_BRICK_SLAB = register("copper_brick_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.UNAFFECTED, EBProperties.BlockP.COPPER), true);

    public static final Supplier<Block> EXPOSED_COPPER_BRICKS = register("exposed_copper_bricks", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> EXPOSED_COPPER_BRICK_STAIRS = register("exposed_copper_brick_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.EXPOSED, EXPOSED_COPPER_BRICKS.get().defaultBlockState(), EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> EXPOSED_COPPER_BRICK_SLAB = register("exposed_copper_brick_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.EXPOSED, EBProperties.BlockP.COPPER), true);

    public static final Supplier<Block> WEATHERED_COPPER_BRICKS = register("weathered_copper_bricks", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> WEATHERED_COPPER_BRICK_STAIRS = register("weathered_copper_brick_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.WEATHERED, WEATHERED_COPPER_BRICKS.get().defaultBlockState(), EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> WEATHERED_COPPER_BRICK_SLAB = register("weathered_copper_brick_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.WEATHERED, EBProperties.BlockP.COPPER), true);

    public static final Supplier<Block> OXIDIZED_COPPER_BRICKS = register("oxidized_copper_bricks", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> OXIDIZED_COPPER_BRICK_STAIRS = register("oxidized_copper_brick_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.OXIDIZED, OXIDIZED_COPPER_BRICKS.get().defaultBlockState(), EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> OXIDIZED_COPPER_BRICK_SLAB = register("oxidized_copper_brick_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.OXIDIZED, EBProperties.BlockP.COPPER), true);

    //WAXED COPPER BRICKS
    public static final Supplier<Block> WAXED_COPPER_BRICKS = register("waxed_copper_bricks", () -> new Block(EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> WAXED_COPPER_BRICK_STAIRS = register("waxed_copper_brick_stairs", () -> new PublicStairBlock(WAXED_COPPER_BRICKS.get().defaultBlockState(), EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> WAXED_COPPER_BRICK_SLAB = register("waxed_copper_brick_slab", () -> new SlabBlock(EBProperties.BlockP.COPPER), true);

    public static final Supplier<Block> WAXED_EXPOSED_COPPER_BRICKS = register("waxed_exposed_copper_bricks", () -> new Block(EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> WAXED_EXPOSED_COPPER_BRICK_STAIRS = register("waxed_exposed_copper_brick_stairs", () -> new PublicStairBlock(WAXED_EXPOSED_COPPER_BRICKS.get().defaultBlockState(), EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> WAXED_EXPOSED_COPPER_BRICK_SLAB = register("waxed_exposed_copper_brick_slab", () -> new SlabBlock(EBProperties.BlockP.COPPER), true);

    public static final Supplier<Block> WAXED_WEATHERED_COPPER_BRICKS = register("waxed_weathered_copper_bricks", () -> new Block(EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> WAXED_WEATHERED_COPPER_BRICK_STAIRS = register("waxed_weathered_copper_brick_stairs", () -> new PublicStairBlock(WAXED_WEATHERED_COPPER_BRICKS.get().defaultBlockState(), EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> WAXED_WEATHERED_COPPER_BRICK_SLAB = register("waxed_weathered_copper_brick_slab", () -> new SlabBlock(EBProperties.BlockP.COPPER), true);

    public static final Supplier<Block> WAXED_OXIDIZED_COPPER_BRICKS = register("waxed_oxidized_copper_bricks", () -> new Block(EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> WAXED_OXIDIZED_COPPER_BRICK_STAIRS = register("waxed_oxidized_copper_brick_stairs", () -> new PublicStairBlock(WAXED_OXIDIZED_COPPER_BRICKS.get().defaultBlockState(), EBProperties.BlockP.COPPER), true);
    public static final Supplier<Block> WAXED_OXIDIZED_COPPER_BRICK_SLAB = register("waxed_oxidized_copper_brick_slab", () -> new SlabBlock(EBProperties.BlockP.COPPER), true);

    //CONGLOMERATE
    public static final Supplier<Block> PEBBLESTONE = register("pebblestone", () -> new Block(EBProperties.BlockP.PEBBLESTONE), true);

    public static final Supplier<Block> CONGLOMERATE = register("conglomerate", () -> new Block(EBProperties.BlockP.CONGLOMERATE), true);
    public static final Supplier<Block> CONGLOMERATE_STAIRS = register("conglomerate_stairs", () -> new PublicStairBlock(CONGLOMERATE.get().defaultBlockState(), EBProperties.BlockP.CONGLOMERATE), true);
    public static final Supplier<Block> CONGLOMERATE_SLAB = register("conglomerate_slab", () -> new SlabBlock(EBProperties.BlockP.CONGLOMERATE), true);
    public static final Supplier<Block> CONGLOMERATE_WALL = register("conglomerate_wall", () -> new WallBlock(EBProperties.BlockP.CONGLOMERATE), true);

    public static final Supplier<Block> CONGLOMERATE_BRICKS = register("conglomerate_bricks", () -> new Block(EBProperties.BlockP.CONGLOMERATE), true);
    public static final Supplier<Block> CONGLOMERATE_BRICK_STAIRS = register("conglomerate_brick_stairs", () -> new PublicStairBlock(CONGLOMERATE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.CONGLOMERATE), true);
    public static final Supplier<Block> CONGLOMERATE_BRICK_SLAB = register("conglomerate_brick_slab", () -> new SlabBlock(EBProperties.BlockP.CONGLOMERATE), true);
    public static final Supplier<Block> CONGLOMERATE_BRICK_WALL = register("conglomerate_brick_wall", () -> new WallBlock(EBProperties.BlockP.CONGLOMERATE), true);

    //BRIMSTONE
    public static final Supplier<Block> BRIMSTONE = register("brimstone", () -> new Block(EBProperties.BlockP.BRIMSTONE), true);
    public static final Supplier<Block> BRIMSTONE_STAIRS = register("brimstone_stairs", () -> new PublicStairBlock(BRIMSTONE.get().defaultBlockState(), EBProperties.BlockP.BRIMSTONE), true);
    public static final Supplier<Block> BRIMSTONE_SLAB = register("brimstone_slab", () -> new SlabBlock(EBProperties.BlockP.BRIMSTONE), true);
    public static final Supplier<Block> BRIMSTONE_WALL = register("brimstone_wall", () -> new WallBlock(EBProperties.BlockP.BRIMSTONE), true);

    public static final Supplier<Block> POLISHED_BRIMSTONE = register("polished_brimstone", () -> new Block(EBProperties.BlockP.POLISHED_BRIMSTONE), true);
    public static final Supplier<Block> POLISHED_BRIMSTONE_STAIRS = register("polished_brimstone_stairs", () -> new PublicStairBlock(POLISHED_BRIMSTONE.get().defaultBlockState(), EBProperties.BlockP.POLISHED_BRIMSTONE), true);
    public static final Supplier<Block> POLISHED_BRIMSTONE_SLAB = register("polished_brimstone_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_BRIMSTONE), true);

    public static final Supplier<Block> BRIMSTONE_BRICKS = register("brimstone_bricks", () -> new Block(EBProperties.BlockP.BRIMSTONE_BRICKS), true);
    public static final Supplier<Block> BRIMSTONE_BRICK_STAIRS = register("brimstone_brick_stairs", () -> new PublicStairBlock(BRIMSTONE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.BRIMSTONE_BRICKS), true);
    public static final Supplier<Block> BRIMSTONE_BRICK_SLAB = register("brimstone_brick_slab", () -> new SlabBlock(EBProperties.BlockP.BRIMSTONE_BRICKS), true);
    public static final Supplier<Block> BRIMSTONE_BRICK_WALL = register("brimstone_brick_wall", () -> new WallBlock(EBProperties.BlockP.BRIMSTONE_BRICKS), true);

    public static final Supplier<Block> BRIMSTONE_TILES = register("brimstone_tiles", () -> new Block(EBProperties.BlockP.BRIMSTONE_BRICKS), true);
    public static final Supplier<Block> BRIMSTONE_TILE_STAIRS = register("brimstone_tile_stairs", () -> new PublicStairBlock(BRIMSTONE_TILES.get().defaultBlockState(), EBProperties.BlockP.BRIMSTONE_BRICKS), true);
    public static final Supplier<Block> BRIMSTONE_TILE_SLAB = register("brimstone_tile_slab", () -> new SlabBlock(EBProperties.BlockP.BRIMSTONE_BRICKS), true);

    public static final Supplier<Block> BRIMSTONE_PILLAR = register("brimstone_pillar", () -> new RotatedPillarBlock(EBProperties.BlockP.BRIMSTONE_BRICKS), true);
    public static final Supplier<Block> BRIMSTONE_LAMP = register("brimstone_lamp", () -> new CopperBulbBlock(EBProperties.BlockP.BRIMSTONE_LAMP), true);

    //ANCIENT WOOD
    public static final Supplier<Block> ANCIENT_PLANKS = register("ancient_planks", () -> new Block(EBProperties.BlockP.PLANKS), true);
    public static final Supplier<Block> ANCIENT_STAIRS = register("ancient_stairs", () -> new PublicStairBlock(ANCIENT_PLANKS.get().defaultBlockState(), EBProperties.BlockP.PLANKS), true);
    public static final Supplier<Block> ANCIENT_SLAB = register("ancient_slab", () -> new SlabBlock(EBProperties.BlockP.PLANKS), true);

    public static final Supplier<Block> ANCIENT_PRESSURE_PLATE = register("ancient_pressure_plate", () -> new PublicPressurePlateBlock(WoodType.CHERRY.setType(), EBProperties.BlockP.PLATE), true);
    public static final Supplier<Block> ANCIENT_BUTTON = register("ancient_button", () -> new PublicButtonBlock(WoodType.CHERRY.setType(), 30, EBProperties.BlockP.BUTTON), true);
    public static final Supplier<Block> ANCIENT_FENCE = register("ancient_fence", () -> new FenceBlock(EBProperties.BlockP.FENCE), true);
    public static final Supplier<Block> ANCIENT_FENCE_GATE = register("ancient_fence_gate", () -> new FenceGateBlock(WoodType.CHERRY, EBProperties.BlockP.GATE), true);
    public static final Supplier<Block> ANCIENT_DOOR = register("ancient_door", () -> new PublicDoorBlock(WoodType.CHERRY.setType(), EBProperties.BlockP.DOOR), true);
    public static final Supplier<Block> ANCIENT_TRAPDOOR = register("ancient_trapdoor", () -> new PublicTrapdoorBlock(WoodType.CHERRY.setType(), EBProperties.BlockP.TRAPDOOR), true);

    public static final Supplier<Block> ANCIENT_LEAVES = register("ancient_leaves", () -> new AncientLeavesBlock(EBProperties.BlockP.GLOW_LEAVES), true);
    public static final Supplier<Block> ANCIENT_LOG = register("ancient_log", () -> new RotatedPillarBlock(EBProperties.BlockP.LOG), true);
    public static final Supplier<Block> STRIPPED_ANCIENT_LOG = register("stripped_ancient_log", () -> new RotatedPillarBlock(EBProperties.BlockP.LOG), true);
    public static final Supplier<Block> ANCIENT_WOOD = register("ancient_wood", () -> new RotatedPillarBlock(EBProperties.BlockP.LOG), true);
    public static final Supplier<Block> STRIPPED_ANCIENT_WOOD = register("stripped_ancient_wood", () -> new RotatedPillarBlock(EBProperties.BlockP.LOG), true);

    public static final Supplier<Block> ANCIENT_SIGN = register("ancient_sign", () -> new EBStandingSignBlock(WoodType.CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SIGN).mapColor(MapColor.SNOW)), false);
    public static final Supplier<Block> ANCIENT_WALL_SIGN = register("ancient_wall_sign", () -> new EBWallSignBlock(WoodType.CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_WALL_SIGN).mapColor(MapColor.SNOW)), false);
    public static final Supplier<Block> ANCIENT_HANGING_SIGN = register("ancient_hanging_sign", () -> new EBHangingSignBlock(WoodType.CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_HANGING_SIGN).mapColor(MapColor.SNOW)), false);
    public static final Supplier<Block> ANCIENT_WALL_HANGING_SIGN = register("ancient_wall_hanging_sign", () -> new EBWallHangingSignBlock(WoodType.CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_WALL_HANGING_SIGN).mapColor(MapColor.SNOW)), false);

    public static final Supplier<Block> ANCIENT_SAPLING = register("ancient_sapling", () -> new PublicSaplingBlock(EBTreeGrowers.ANCIENT, EBProperties.BlockP.GLOW_SAPLING), true);
    public static final Supplier<Block> POTTED_ANCIENT_SAPLING = register("potted_ancient_sapling", () -> new FlowerPotBlock(ANCIENT_SAPLING.get(), EBProperties.BlockP.GLOW_SAPLING_POT), false);
    public static final Supplier<Block> ANCIENT_VINES = register("ancient_vines", () -> new AncientVinesBlock(EBProperties.BlockP.ANCIENT_VINES), true);
    public static final Supplier<Block> ANCIENT_VINES_PLANT = register("ancient_vines_plant", () -> new AncientVinesPlantBlock(EBProperties.BlockP.ANCIENT_VINES_PLANT), false);

    //HECTALITE
    public static final Supplier<Block> HECTALITE = register("hectalite", () -> new Block(EBProperties.BlockP.HECTALITE), true);
    public static final Supplier<Block> HECTALITE_STAIRS = register("hectalite_stairs", () -> new PublicStairBlock(HECTALITE.get().defaultBlockState(), EBProperties.BlockP.HECTALITE), true);
    public static final Supplier<Block> HECTALITE_SLAB = register("hectalite_slab", () -> new SlabBlock(EBProperties.BlockP.HECTALITE), true);
    public static final Supplier<Block> HECTALITE_WALL = register("hectalite_wall", () -> new WallBlock(EBProperties.BlockP.HECTALITE), true);

    public static final Supplier<Block> POLISHED_HECTALITE = register("polished_hectalite", () -> new Block(EBProperties.BlockP.POLISHED_HECTALITE), true);
    public static final Supplier<Block> POLISHED_HECTALITE_STAIRS = register("polished_hectalite_stairs", () -> new PublicStairBlock(POLISHED_HECTALITE.get().defaultBlockState(), EBProperties.BlockP.POLISHED_HECTALITE), true);
    public static final Supplier<Block> POLISHED_HECTALITE_SLAB = register("polished_hectalite_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_HECTALITE), true);
    public static final Supplier<Block> POLISHED_HECTALITE_WALL = register("polished_hectalite_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_HECTALITE), true);

    public static final Supplier<Block> HECTALITE_BRICKS = register("hectalite_bricks", () -> new Block(EBProperties.BlockP.HECTALITE_BRICKS), true);
    public static final Supplier<Block> HECTALITE_BRICK_STAIRS = register("hectalite_brick_stairs", () -> new PublicStairBlock(HECTALITE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.HECTALITE_BRICKS), true);
    public static final Supplier<Block> HECTALITE_BRICK_SLAB = register("hectalite_brick_slab", () -> new SlabBlock(EBProperties.BlockP.HECTALITE_BRICKS), true);
    public static final Supplier<Block> HECTALITE_BRICK_WALL = register("hectalite_brick_wall", () -> new WallBlock(EBProperties.BlockP.HECTALITE_BRICKS), true);

    public static final Supplier<Block> CHISELED_HECTALITE = register("chiseled_hectalite", () -> new Block(EBProperties.BlockP.POLISHED_HECTALITE), true);
    public static final Supplier<Block> HECTALITE_PILLAR = register("hectalite_pillar", () -> new RotatedPillarBlock(EBProperties.BlockP.POLISHED_HECTALITE), true);

    //CHLOROSLATE
    public static final Supplier<Block> CHLOROSLATE = register("chloroslate", () -> new Block(EBProperties.BlockP.CHLOROSLATE), true);
    public static final Supplier<Block> CHLOROSLATE_STAIRS = register("chloroslate_stairs", () -> new PublicStairBlock(CHLOROSLATE.get().defaultBlockState(), EBProperties.BlockP.CHLOROSLATE), true);
    public static final Supplier<Block> CHLOROSLATE_SLAB = register("chloroslate_slab", () -> new SlabBlock(EBProperties.BlockP.CHLOROSLATE), true);
    public static final Supplier<Block> CHLOROSLATE_WALL = register("chloroslate_wall", () -> new WallBlock(EBProperties.BlockP.CHLOROSLATE), true);

    public static final Supplier<Block> POLISHED_CHLOROSLATE = register("polished_chloroslate", () -> new Block(EBProperties.BlockP.POLISHED_CHLOROSLATE), true);
    public static final Supplier<Block> POLISHED_CHLOROSLATE_STAIRS = register("polished_chloroslate_stairs", () -> new PublicStairBlock(POLISHED_CHLOROSLATE.get().defaultBlockState(), EBProperties.BlockP.POLISHED_CHLOROSLATE), true);
    public static final Supplier<Block> POLISHED_CHLOROSLATE_SLAB = register("polished_chloroslate_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_CHLOROSLATE), true);
    public static final Supplier<Block> POLISHED_CHLOROSLATE_WALL = register("polished_chloroslate_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_CHLOROSLATE), true);

    public static final Supplier<Block> CHLOROSLATE_BRICKS = register("chloroslate_bricks", () -> new Block(EBProperties.BlockP.CHLOROSLATE_BRICKS), true);
    public static final Supplier<Block> CHLOROSLATE_BRICK_STAIRS = register("chloroslate_brick_stairs", () -> new PublicStairBlock(CHLOROSLATE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.CHLOROSLATE_BRICKS), true);
    public static final Supplier<Block> CHLOROSLATE_BRICK_SLAB = register("chloroslate_brick_slab", () -> new SlabBlock(EBProperties.BlockP.CHLOROSLATE_BRICKS), true);
    public static final Supplier<Block> CHLOROSLATE_BRICK_WALL = register("chloroslate_brick_wall", () -> new WallBlock(EBProperties.BlockP.CHLOROSLATE_BRICKS), true);

    public static final Supplier<Block> CHISELED_CHLOROSLATE = register("chiseled_chloroslate", () -> new Block(EBProperties.BlockP.POLISHED_CHLOROSLATE), true);
    public static final Supplier<Block> CHLOROSLATE_PILLAR = register("chloroslate_pillar", () -> new RotatedPillarBlock(EBProperties.BlockP.POLISHED_CHLOROSLATE), true);

    //ARIDITE
    public static final Supplier<Block> ARIDITE = register("aridite", () -> new Block(EBProperties.BlockP.ARIDITE), true);
    public static final Supplier<Block> ARIDITE_STAIRS = register("aridite_stairs", () -> new PublicStairBlock(ARIDITE.get().defaultBlockState(), EBProperties.BlockP.ARIDITE), true);
    public static final Supplier<Block> ARIDITE_SLAB = register("aridite_slab", () -> new SlabBlock(EBProperties.BlockP.ARIDITE), true);
    public static final Supplier<Block> ARIDITE_WALL = register("aridite_wall", () -> new WallBlock(EBProperties.BlockP.ARIDITE), true);

    public static final Supplier<Block> POLISHED_ARIDITE = register("polished_aridite", () -> new Block(EBProperties.BlockP.POLISHED_ARIDITE), true);
    public static final Supplier<Block> POLISHED_ARIDITE_STAIRS = register("polished_aridite_stairs", () -> new PublicStairBlock(POLISHED_ARIDITE.get().defaultBlockState(), EBProperties.BlockP.POLISHED_ARIDITE), true);
    public static final Supplier<Block> POLISHED_ARIDITE_SLAB = register("polished_aridite_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_ARIDITE), true);
    public static final Supplier<Block> POLISHED_ARIDITE_WALL = register("polished_aridite_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_ARIDITE), true);

    public static final Supplier<Block> ARIDITE_BRICKS = register("aridite_bricks", () -> new Block(EBProperties.BlockP.ARIDITE_BRICKS), true);
    public static final Supplier<Block> ARIDITE_BRICK_STAIRS = register("aridite_brick_stairs", () -> new PublicStairBlock(ARIDITE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.ARIDITE_BRICKS), true);
    public static final Supplier<Block> ARIDITE_BRICK_SLAB = register("aridite_brick_slab", () -> new SlabBlock(EBProperties.BlockP.ARIDITE_BRICKS), true);
    public static final Supplier<Block> ARIDITE_BRICK_WALL = register("aridite_brick_wall", () -> new WallBlock(EBProperties.BlockP.ARIDITE_BRICKS), true);

    public static final Supplier<Block> CHISELED_ARIDITE = register("chiseled_aridite", () -> new Block(EBProperties.BlockP.POLISHED_ARIDITE), true);
    public static final Supplier<Block> ARIDITE_PILLAR = register("aridite_pillar", () -> new RotatedPillarBlock(EBProperties.BlockP.POLISHED_ARIDITE), true);

    //SITRITE
    public static final Supplier<Block> SITRITE = register("sitrite", () -> new Block(EBProperties.BlockP.SITRITE), true);
    public static final Supplier<Block> SITRITE_STAIRS = register("sitrite_stairs", () -> new PublicStairBlock(SITRITE.get().defaultBlockState(), EBProperties.BlockP.SITRITE), true);
    public static final Supplier<Block> SITRITE_SLAB = register("sitrite_slab", () -> new SlabBlock(EBProperties.BlockP.SITRITE), true);
    public static final Supplier<Block> SITRITE_WALL = register("sitrite_wall", () -> new WallBlock(EBProperties.BlockP.SITRITE), true);

    public static final Supplier<Block> POLISHED_SITRITE = register("polished_sitrite", () -> new Block(EBProperties.BlockP.SITRITE), true);
    public static final Supplier<Block> POLISHED_SITRITE_STAIRS = register("polished_sitrite_stairs", () -> new PublicStairBlock(POLISHED_SITRITE.get().defaultBlockState(), EBProperties.BlockP.SITRITE), true);
    public static final Supplier<Block> POLISHED_SITRITE_SLAB = register("polished_sitrite_slab", () -> new SlabBlock(EBProperties.BlockP.SITRITE), true);

    public static final Supplier<Block> SITRITE_BRICKS = register("sitrite_bricks", () -> new Block(EBProperties.BlockP.SITRITE), true);
    public static final Supplier<Block> SITRITE_BRICK_STAIRS = register("sitrite_brick_stairs", () -> new PublicStairBlock(SITRITE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.SITRITE), true);
    public static final Supplier<Block> SITRITE_BRICK_SLAB = register("sitrite_brick_slab", () -> new SlabBlock(EBProperties.BlockP.SITRITE), true);
    public static final Supplier<Block> SITRITE_BRICK_WALL = register("sitrite_brick_wall", () -> new WallBlock(EBProperties.BlockP.SITRITE), true);

    public static final Supplier<Block> SITRITE_TILES = register("sitrite_tiles", () -> new Block(EBProperties.BlockP.SITRITE), true);
    public static final Supplier<Block> SITRITE_TILE_STAIRS = register("sitrite_tile_stairs", () -> new PublicStairBlock(SITRITE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.SITRITE), true);
    public static final Supplier<Block> SITRITE_TILE_SLAB = register("sitrite_tile_slab", () -> new SlabBlock(EBProperties.BlockP.SITRITE), true);

    public static final Supplier<Block> CHISELED_SITRITE = register("chiseled_sitrite", () -> new Block(EBProperties.BlockP.SITRITE), true);
    public static final Supplier<Block> SITRITE_PILLAR = register("sitrite_pillar", () -> new RotatedPillarBlock(EBProperties.BlockP.SITRITE), true);

    //UNDYED
    public static final Supplier<Block> FROSTED_GLASS = register("frosted_glass", () -> new PublicHalfTransparentBlock(EBProperties.BlockP.FROSTED_GLASS), true);

    //DYED
    public static final HashMap<DyeColor, Supplier<Block>> DYED_CORRUGATED_IRON = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_CORRUGATED_IRON_STAIRS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_CORRUGATED_IRON_SLAB = new HashMap<>();

    public static final HashMap<DyeColor, Supplier<Block>> DYED_FROSTED_GLASS = new HashMap<>();

    static {
        for (DyeColor colors : DyeColor.values()) {
            DYED_CORRUGATED_IRON.put(colors, register(colors + "_corrugated_iron", () -> new Block(
                    EBProperties.BlockP.CORRUGATED_IRON.mapColor(colors)), true));

            DYED_CORRUGATED_IRON_STAIRS.put(colors, register(colors + "_corrugated_iron_stairs", () -> new PublicStairBlock(DYED_CORRUGATED_IRON.get(colors).get().defaultBlockState(),
                    EBProperties.BlockP.CORRUGATED_IRON.mapColor(colors)), true));

            DYED_CORRUGATED_IRON_SLAB.put(colors, register(colors + "_corrugated_iron_slab", () -> new SlabBlock(
                    EBProperties.BlockP.CORRUGATED_IRON.mapColor(colors)), true));

            DYED_FROSTED_GLASS.put(colors, register(colors + "_stained_frosted_glass", () -> new StainedGlassBlock(
                    colors, EBProperties.BlockP.FROSTED_GLASS.mapColor(colors)), true));
        }
    }

    public static Supplier<Block> getDyedCorrugatedIron(int colors){
        return DYED_CORRUGATED_IRON.get(DyeColor.byId(colors));
    }

    public static Supplier<Block> getDyedCorrugatedIronStairs(int colors){
        return DYED_CORRUGATED_IRON_STAIRS.get(DyeColor.byId(colors));
    }

    public static Supplier<Block> getDyedCorrugatedIronSlab(int colors){
        return DYED_CORRUGATED_IRON_SLAB.get(DyeColor.byId(colors));
    }

    public static Supplier<Block> getDyedFrostedGlass(int colors){
        return DYED_FROSTED_GLASS.get(DyeColor.byId(colors));
    }

    public static Supplier<Block> register(String id, Supplier<Block> supplier, boolean hasItem) {
        return RLServices.REGISTRY.registerBlock(ExcessiveBuilding.MOD_ID, id, supplier, hasItem);
    }

    public static void load() {
    }
}
