package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.common.publicized.*;
import net.azurune.runiclib.core.platform.RLServices;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.block.AncientVinesBlock;
import net.yirmiri.excessive_building.common.block.AncientVinesPlantBlock;
import net.yirmiri.excessive_building.common.block.AncientLeavesBlock;
import net.yirmiri.excessive_building.common.block.ClayPlantBaleBlock;
import net.yirmiri.excessive_building.common.util.EBProperties;
import net.yirmiri.excessive_building.common.util.EBRegistries;
import net.yirmiri.excessive_building.core.init.EBTreeGrowers;

import java.util.function.Supplier;

public class EBBlocks {
    //COBBLESTONE BRICKS
    public static final Supplier<Block> COBBLESTONE_BRICKS = register("cobblestone_bricks", () -> new Block(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Supplier<Block> COBBLESTONE_BRICK_STAIRS = register("cobblestone_brick_stairs", () -> new PublicStairBlock(COBBLESTONE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Supplier<Block> COBBLESTONE_BRICK_SLAB = register("cobblestone_brick_slab", () -> new SlabBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Supplier<Block> COBBLESTONE_BRICK_WALL = register("cobblestone_brick_wall", () -> new WallBlock(EBProperties.BlockP.COBBLESTONE_BRICKS), true);
    public static final Supplier<Block> CRACKED_COBBLESTONE_BRICKS = register("cracked_cobblestone_bricks", () -> new Block(EBProperties.BlockP.COBBLESTONE_BRICKS), true);

    //LAVENDER
    public static final Supplier<Block> LAVENDER = register("lavender", () -> new FlowerBlock(MobEffects.HEALTH_BOOST, 7, EBProperties.BlockP.LAVENDER), true);
    public static final Supplier<Block> POTTED_LAVENDER = register("potted_lavender", () -> new FlowerPotBlock(LAVENDER.get(), EBProperties.BlockP.POTTED_LAVENDER), true);
    public static final Supplier<Block> LAVENDER_BLOCK = register("lavender_block", () -> new ClayPlantBaleBlock(EBProperties.BlockP.LAVENDER_BALE), true);
    public static final Supplier<Block> LAVENDER_CLAY = register("lavender_clay", () -> new Block(EBProperties.BlockP.LAVENDER_CLAY), true);
    public static final Supplier<Block> LAVENDER_BRICKS = register("lavender_bricks", () -> new Block(EBProperties.BlockP.LAVENDER_BRICKS), true);
    public static final Supplier<Block> LAVENDER_BRICK_STAIRS = register("lavender_brick_stairs", () -> new PublicStairBlock(LAVENDER_BRICKS.get().defaultBlockState(), EBProperties.BlockP.LAVENDER_BRICKS), true);
    public static final Supplier<Block> LAVENDER_BRICK_SLAB = register("lavender_brick_slab", () -> new SlabBlock(EBProperties.BlockP.LAVENDER_BRICKS), true);
    public static final Supplier<Block> LAVENDER_BRICK_WALL = register("lavender_brick_wall", () -> new WallBlock(EBProperties.BlockP.LAVENDER_BRICKS), true);
    public static final Supplier<Block> MOSSY_LAVENDER_BRICKS = register("mossy_lavender_bricks", () -> new Block(EBProperties.BlockP.LAVENDER_BRICKS), true);

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

    public static final Supplier<Block> ANCIENT_PRESSURE_PLATE = register("ancient_pressure_plate", () -> new PublicPressurePlateBlock(EBRegistries.ANCIENT.setType(), EBProperties.BlockP.PLATE), true);
    public static final Supplier<Block> ANCIENT_BUTTON = register("ancient_button", () -> new PublicButtonBlock(EBRegistries.ANCIENT.setType(), 30, EBProperties.BlockP.BUTTON), true);
    public static final Supplier<Block> ANCIENT_FENCE = register("ancient_fence", () -> new FenceBlock(EBProperties.BlockP.FENCE), true);
    public static final Supplier<Block> ANCIENT_FENCE_GATE = register("ancient_fence_gate", () -> new FenceGateBlock(EBRegistries.ANCIENT, EBProperties.BlockP.GATE), true);
    public static final Supplier<Block> ANCIENT_DOOR = register("ancient_door", () -> new PublicDoorBlock(EBRegistries.ANCIENT.setType(), EBProperties.BlockP.DOOR), true);
    public static final Supplier<Block> ANCIENT_TRAPDOOR = register("ancient_trapdoor", () -> new PublicTrapdoorBlock(EBRegistries.ANCIENT.setType(), EBProperties.BlockP.TRAPDOOR), true);

    public static final Supplier<Block> ANCIENT_LEAVES = register("ancient_leaves", () -> new AncientLeavesBlock(EBProperties.BlockP.GLOW_LEAVES), true);
    public static final Supplier<Block> ANCIENT_LOG = register("ancient_log", () -> new RotatedPillarBlock(EBProperties.BlockP.LOG), true);
    public static final Supplier<Block> STRIPPED_ANCIENT_LOG = register("stripped_ancient_log", () -> new RotatedPillarBlock(EBProperties.BlockP.LOG), true);
    public static final Supplier<Block> ANCIENT_WOOD = register("ancient_wood", () -> new RotatedPillarBlock(EBProperties.BlockP.LOG), true);
    public static final Supplier<Block> STRIPPED_ANCIENT_WOOD = register("stripped_ancient_wood", () -> new RotatedPillarBlock(EBProperties.BlockP.LOG), true);

    public static final Supplier<Block> ANCIENT_SIGN = register("ancient_sign", () -> new StandingSignBlock(EBRegistries.ANCIENT, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SIGN).mapColor(MapColor.SNOW)), false);
    public static final Supplier<Block> ANCIENT_WALL_SIGN = register("ancient_wall_sign", () -> new WallSignBlock(EBRegistries.ANCIENT, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_WALL_SIGN).mapColor(MapColor.SNOW)), false);
    public static final Supplier<Block> ANCIENT_HANGING_SIGN = register("ancient_hanging_sign", () -> new CeilingHangingSignBlock(EBRegistries.ANCIENT, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_HANGING_SIGN).mapColor(MapColor.SNOW)), false);
    public static final Supplier<Block> ANCIENT_WALL_HANGING_SIGN = register("ancient_wall_hanging_sign", () -> new WallHangingSignBlock(EBRegistries.ANCIENT, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_WALL_HANGING_SIGN).mapColor(MapColor.SNOW)), false);

    public static final Supplier<Block> ANCIENT_SAPLING = register("ancient_sapling", () -> new PublicSaplingBlock(EBTreeGrowers.ANCIENT, EBProperties.BlockP.GLOW_SAPLING), true);
    public static final Supplier<Block> POTTED_ANCIENT_SAPLING = register("potted_ancient_sapling", () -> new FlowerPotBlock(ANCIENT_SAPLING.get(), EBProperties.BlockP.GLOW_SAPLING_POT), false);
    public static final Supplier<Block> ANCIENT_VINES = register("ancient_vines", () -> new AncientVinesBlock(EBProperties.BlockP.ANCIENT_VINES), true);
    public static final Supplier<Block> ANCIENT_VINES_PLANT = register("ancient_vines_plant", () -> new AncientVinesPlantBlock(EBProperties.BlockP.ANCIENT_VINES_PLANT), false);

    public static Supplier<Block> register(String id, Supplier<Block> supplier, boolean hasItem) {
        return RLServices.REGISTRY.registerBlock(ExcessiveBuilding.MOD_ID, id, supplier, hasItem);
    }

    public static void load() {
    }
}
