package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.common.publicized.PublicStairBlock;
import net.azurune.runiclib.core.platform.RLServices;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.block.LavenderBaleBlock;
import net.yirmiri.excessive_building.common.util.EBProperties;

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
    public static final Supplier<Block> LAVENDER_BLOCK = register("lavender_block", () -> new LavenderBaleBlock(EBProperties.BlockP.LAVENDER_BALE), true);
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

    public static Supplier<Block> register(String id, Supplier<Block> supplier, boolean hasItem) {
        return RLServices.REGISTRY.registerBlock(ExcessiveBuilding.MOD_ID, id, supplier, hasItem);
    }

    public static void loadBlocks() {
    }
}
