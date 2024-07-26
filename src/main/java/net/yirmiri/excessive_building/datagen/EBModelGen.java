package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;

import java.util.Optional;

public class EBModelGen extends FabricModelProvider {
    public EBModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {
        BlockStateModelGenerator.BlockTexturePool oakMosaic = generator.registerCubeAllModelTexturePool(EBBlocks.OAK_MOSAIC);
        oakMosaic.stairs(EBBlocks.OAK_MOSAIC_STAIRS);
        oakMosaic.slab(EBBlocks.OAK_MOSAIC_SLAB);

        BlockStateModelGenerator.BlockTexturePool spruceMosaic = generator.registerCubeAllModelTexturePool(EBBlocks.SPRUCE_MOSAIC);
        spruceMosaic.stairs(EBBlocks.SPRUCE_MOSAIC_STAIRS);
        spruceMosaic.slab(EBBlocks.SPRUCE_MOSAIC_SLAB);

        BlockStateModelGenerator.BlockTexturePool birchMosaic = generator.registerCubeAllModelTexturePool(EBBlocks.BIRCH_MOSAIC);
        birchMosaic.stairs(EBBlocks.BIRCH_MOSAIC_STAIRS);
        birchMosaic.slab(EBBlocks.BIRCH_MOSAIC_SLAB);

        BlockStateModelGenerator.BlockTexturePool jungleMosaic = generator.registerCubeAllModelTexturePool(EBBlocks.JUNGLE_MOSAIC);
        jungleMosaic.stairs(EBBlocks.JUNGLE_MOSAIC_STAIRS);
        jungleMosaic.slab(EBBlocks.JUNGLE_MOSAIC_SLAB);

        BlockStateModelGenerator.BlockTexturePool acaciaMosaic = generator.registerCubeAllModelTexturePool(EBBlocks.ACACIA_MOSAIC);
        acaciaMosaic.stairs(EBBlocks.ACACIA_MOSAIC_STAIRS);
        acaciaMosaic.slab(EBBlocks.ACACIA_MOSAIC_SLAB);

        BlockStateModelGenerator.BlockTexturePool darkOakMosaic = generator.registerCubeAllModelTexturePool(EBBlocks.DARK_OAK_MOSAIC);
        darkOakMosaic.stairs(EBBlocks.DARK_OAK_MOSAIC_STAIRS);
        darkOakMosaic.slab(EBBlocks.DARK_OAK_MOSAIC_SLAB);

        BlockStateModelGenerator.BlockTexturePool mangroveMosaic = generator.registerCubeAllModelTexturePool(EBBlocks.MANGROVE_MOSAIC);
        mangroveMosaic.stairs(EBBlocks.MANGROVE_MOSAIC_STAIRS);
        mangroveMosaic.slab(EBBlocks.MANGROVE_MOSAIC_SLAB);

        BlockStateModelGenerator.BlockTexturePool cherryMosaic = generator.registerCubeAllModelTexturePool(EBBlocks.CHERRY_MOSAIC);
        cherryMosaic.stairs(EBBlocks.CHERRY_MOSAIC_STAIRS);
        cherryMosaic.slab(EBBlocks.CHERRY_MOSAIC_SLAB);

        BlockStateModelGenerator.BlockTexturePool crimsonMosaic = generator.registerCubeAllModelTexturePool(EBBlocks.CRIMSON_MOSAIC);
        crimsonMosaic.stairs(EBBlocks.CRIMSON_MOSAIC_STAIRS);
        crimsonMosaic.slab(EBBlocks.CRIMSON_MOSAIC_SLAB);

        BlockStateModelGenerator.BlockTexturePool warpedMosaic = generator.registerCubeAllModelTexturePool(EBBlocks.WARPED_MOSAIC);
        warpedMosaic.stairs(EBBlocks.WARPED_MOSAIC_STAIRS);
        warpedMosaic.slab(EBBlocks.WARPED_MOSAIC_SLAB);

        BlockStateModelGenerator.BlockTexturePool cobblestoneBricks = generator.registerCubeAllModelTexturePool(EBBlocks.COBBLESTONE_BRICKS);
        cobblestoneBricks.stairs(EBBlocks.COBBLESTONE_BRICK_STAIRS);
        cobblestoneBricks.slab(EBBlocks.COBBLESTONE_BRICK_SLAB);
        cobblestoneBricks.wall(EBBlocks.COBBLESTONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool mossyCobblestoneBricks = generator.registerCubeAllModelTexturePool(EBBlocks.MOSSY_COBBLESTONE_BRICKS);
        mossyCobblestoneBricks.stairs(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS);
        mossyCobblestoneBricks.slab(EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB);
        mossyCobblestoneBricks.wall(EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool cobbledDeepslateBricks = generator.registerCubeAllModelTexturePool(EBBlocks.COBBLED_DEEPSLATE_BRICKS);
        cobbledDeepslateBricks.stairs(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS);
        cobbledDeepslateBricks.slab(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB);
        cobbledDeepslateBricks.wall(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool blackstoneBricks = generator.registerCubeAllModelTexturePool(EBBlocks.BLACKSTONE_BRICKS);
        blackstoneBricks.stairs(EBBlocks.BLACKSTONE_BRICK_STAIRS);
        blackstoneBricks.slab(EBBlocks.BLACKSTONE_BRICK_SLAB);
        blackstoneBricks.wall(EBBlocks.BLACKSTONE_BRICK_WALL);

        generator.registerSimpleCubeAll(EBBlocks.CRACKED_COBBLESTONE_BRICKS);
        generator.registerSimpleCubeAll(EBBlocks.CRACKED_COBBLED_DEEPSLATE_BRICKS);
        generator.registerSimpleCubeAll(EBBlocks.CRACKED_BLACKSTONE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool ancientPlanks = generator.registerCubeAllModelTexturePool(EBBlocks.ANCIENT_PLANKS);
        ancientPlanks.stairs(EBBlocks.ANCIENT_STAIRS);
        ancientPlanks.slab(EBBlocks.ANCIENT_SLAB);
        ancientPlanks.fence(EBBlocks.ANCIENT_FENCE);
        ancientPlanks.fenceGate(EBBlocks.ANCIENT_FENCE_GATE);
        ancientPlanks.button(EBBlocks.ANCIENT_BUTTON);
        ancientPlanks.pressurePlate(EBBlocks.ANCIENT_PRESSURE_PLATE);

        BlockStateModelGenerator.BlockTexturePool ancientMosaic = generator.registerCubeAllModelTexturePool(EBBlocks.ANCIENT_MOSAIC);
        ancientMosaic.stairs(EBBlocks.ANCIENT_MOSAIC_STAIRS);
        ancientMosaic.slab(EBBlocks.ANCIENT_MOSAIC_SLAB);

        generator.registerSimpleCubeAll(EBBlocks.ANCIENT_LEAVES);
        generator.registerDoor(EBBlocks.ANCIENT_DOOR);
        generator.registerOrientableTrapdoor(EBBlocks.ANCIENT_TRAPDOOR);

        generator.registerLog(EBBlocks.ANCIENT_LOG).log(EBBlocks.ANCIENT_LOG).wood(EBBlocks.ANCIENT_WOOD);
        generator.registerLog(EBBlocks.STRIPPED_ANCIENT_LOG).log(EBBlocks.STRIPPED_ANCIENT_LOG).wood(EBBlocks.STRIPPED_ANCIENT_WOOD);

        generator.registerFlowerPotPlant(EBBlocks.ANCIENT_SAPLING, EBBlocks.POTTED_ANCIENT_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        generator.registerSingleton(EBBlocks.CHISELED_ANCIENT_PLANKS, TexturedModel.CUBE_COLUMN);
        generator.registerHangingSign(EBBlocks.STRIPPED_ANCIENT_LOG, EBBlocks.ANCIENT_HANGING_SIGN, EBBlocks.ANCIENT_WALL_HANGING_SIGN);

        generator.registerSingleton(EBBlocks.CHISELED_OAK_PLANKS, TexturedModel.CUBE_COLUMN);
        generator.registerSingleton(EBBlocks.CHISELED_SPRUCE_PLANKS, TexturedModel.CUBE_COLUMN);
        generator.registerSingleton(EBBlocks.CHISELED_BIRCH_PLANKS, TexturedModel.CUBE_COLUMN);
        generator.registerSingleton(EBBlocks.CHISELED_JUNGLE_PLANKS, TexturedModel.CUBE_COLUMN);
        generator.registerSingleton(EBBlocks.CHISELED_ACACIA_PLANKS, TexturedModel.CUBE_COLUMN);
        generator.registerSingleton(EBBlocks.CHISELED_DARK_OAK_PLANKS, TexturedModel.CUBE_COLUMN);
        generator.registerSingleton(EBBlocks.CHISELED_MANGROVE_PLANKS, TexturedModel.CUBE_COLUMN);
        generator.registerSingleton(EBBlocks.CHISELED_BAMBOO_PLANKS, TexturedModel.CUBE_COLUMN);
        generator.registerSingleton(EBBlocks.CHISELED_CHERRY_PLANKS, TexturedModel.CUBE_COLUMN);
        generator.registerSingleton(EBBlocks.CHISELED_CRIMSON_PLANKS, TexturedModel.CUBE_COLUMN);
        generator.registerSingleton(EBBlocks.CHISELED_WARPED_PLANKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool gloomPlanks = generator.registerCubeAllModelTexturePool(EBBlocks.GLOOM_PLANKS);
        gloomPlanks.stairs(EBBlocks.GLOOM_STAIRS);
        gloomPlanks.slab(EBBlocks.GLOOM_SLAB);
        gloomPlanks.fence(EBBlocks.GLOOM_FENCE);
        gloomPlanks.fenceGate(EBBlocks.GLOOM_FENCE_GATE);
        gloomPlanks.button(EBBlocks.GLOOM_BUTTON);
        gloomPlanks.pressurePlate(EBBlocks.GLOOM_PRESSURE_PLATE);

        BlockStateModelGenerator.BlockTexturePool gloomMosaic = generator.registerCubeAllModelTexturePool(EBBlocks.GLOOM_MOSAIC);
        gloomMosaic.stairs(EBBlocks.GLOOM_MOSAIC_STAIRS);
        gloomMosaic.slab(EBBlocks.GLOOM_MOSAIC_SLAB);

        generator.registerDoor(EBBlocks.GLOOM_DOOR);
        generator.registerOrientableTrapdoor(EBBlocks.GLOOM_TRAPDOOR);

        generator.registerLog(EBBlocks.GLOOM_LOG).log(EBBlocks.GLOOM_LOG).wood(EBBlocks.GLOOM_WOOD);
        generator.registerLog(EBBlocks.STRIPPED_GLOOM_LOG).log(EBBlocks.STRIPPED_GLOOM_LOG).wood(EBBlocks.STRIPPED_GLOOM_WOOD);

        generator.registerSingleton(EBBlocks.CHISELED_GLOOM_PLANKS, TexturedModel.CUBE_COLUMN);
        generator.registerHangingSign(EBBlocks.STRIPPED_GLOOM_LOG, EBBlocks.GLOOM_HANGING_SIGN, EBBlocks.GLOOM_WALL_HANGING_SIGN);

        BlockStateModelGenerator.BlockTexturePool copper = generator.registerCubeAllModelTexturePool(Blocks.COPPER_BLOCK);
        copper.pressurePlate(EBBlocks.COPPER_PRESSURE_PLATE);
        copper.pressurePlate(EBBlocks.WAXED_COPPER_PRESSURE_PLATE);
        copper.button(EBBlocks.COPPER_BUTTON);
        copper.button(EBBlocks.WAXED_COPPER_BUTTON);

        BlockStateModelGenerator.BlockTexturePool exposedCopper = generator.registerCubeAllModelTexturePool(Blocks.EXPOSED_COPPER);
        exposedCopper.pressurePlate(EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
        exposedCopper.pressurePlate(EBBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
        exposedCopper.button(EBBlocks.EXPOSED_COPPER_BUTTON);
        exposedCopper.button(EBBlocks.WAXED_EXPOSED_COPPER_BUTTON);

        BlockStateModelGenerator.BlockTexturePool weatheredCopper = generator.registerCubeAllModelTexturePool(Blocks.WEATHERED_COPPER);
        weatheredCopper.pressurePlate(EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
        weatheredCopper.pressurePlate(EBBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
        weatheredCopper.button(EBBlocks.WEATHERED_COPPER_BUTTON);
        weatheredCopper.button(EBBlocks.WAXED_WEATHERED_COPPER_BUTTON);

        BlockStateModelGenerator.BlockTexturePool oxidizedCopper = generator.registerCubeAllModelTexturePool(Blocks.OXIDIZED_COPPER);
        oxidizedCopper.pressurePlate(EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
        oxidizedCopper.pressurePlate(EBBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
        oxidizedCopper.button(EBBlocks.OXIDIZED_COPPER_BUTTON);
        oxidizedCopper.button(EBBlocks.WAXED_OXIDIZED_COPPER_BUTTON);

        BlockStateModelGenerator.BlockTexturePool copperBricks = generator.registerCubeAllModelTexturePool(EBBlocks.COPPER_BRICKS);
        copperBricks.stairs(EBBlocks.COPPER_BRICK_STAIRS);
        copperBricks.slab(EBBlocks.COPPER_BRICK_SLAB);
        copperBricks.parented(EBBlocks.COPPER_BRICKS, EBBlocks.WAXED_COPPER_BRICKS);
        copperBricks.stairs(EBBlocks.WAXED_COPPER_BRICK_STAIRS);
        copperBricks.slab(EBBlocks.WAXED_COPPER_BRICK_SLAB);

        BlockStateModelGenerator.BlockTexturePool exposedCopperBricks = generator.registerCubeAllModelTexturePool(EBBlocks.EXPOSED_COPPER_BRICKS);
        exposedCopperBricks.stairs(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS);
        exposedCopperBricks.slab(EBBlocks.EXPOSED_COPPER_BRICK_SLAB);
        exposedCopperBricks.parented(EBBlocks.EXPOSED_COPPER_BRICKS, EBBlocks.WAXED_EXPOSED_COPPER_BRICKS);
        exposedCopperBricks.stairs(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS);
        exposedCopperBricks.slab(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB);

        BlockStateModelGenerator.BlockTexturePool weatheredCopperBricks = generator.registerCubeAllModelTexturePool(EBBlocks.WEATHERED_COPPER_BRICKS);
        weatheredCopperBricks.stairs(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS);
        weatheredCopperBricks.slab(EBBlocks.WEATHERED_COPPER_BRICK_SLAB);
        weatheredCopperBricks.parented(EBBlocks.WEATHERED_COPPER_BRICKS, EBBlocks.WAXED_WEATHERED_COPPER_BRICKS);
        weatheredCopperBricks.stairs(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS);
        weatheredCopperBricks.slab(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB);

        BlockStateModelGenerator.BlockTexturePool oxidizedCopperBricks = generator.registerCubeAllModelTexturePool(EBBlocks.OXIDIZED_COPPER_BRICKS);
        oxidizedCopperBricks.stairs(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS);
        oxidizedCopperBricks.slab(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB);
        oxidizedCopperBricks.parented(EBBlocks.OXIDIZED_COPPER_BRICKS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS);
        oxidizedCopperBricks.stairs(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS);
        oxidizedCopperBricks.slab(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB);

        EBModels.registerVerticalStairs(generator, EBBlocks.COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.COPPER_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.EXPOSED_COPPER_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WEATHERED_COPPER_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.OXIDIZED_COPPER_BRICKS);

        generator.registerParented(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS);
        generator.registerParented(EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS);
        generator.registerParented(EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS);
        generator.registerParented(EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS);

        BlockStateModelGenerator.BlockTexturePool ironBricks = generator.registerCubeAllModelTexturePool(EBBlocks.IRON_BRICKS);
        ironBricks.stairs(EBBlocks.IRON_BRICK_STAIRS);
        ironBricks.slab(EBBlocks.IRON_BRICK_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.IRON_BRICK_VERTICAL_STAIRS, EBBlocks.IRON_BRICKS);

        BlockStateModelGenerator.BlockTexturePool goldBricks = generator.registerCubeAllModelTexturePool(EBBlocks.GOLD_BRICKS);
        goldBricks.stairs(EBBlocks.GOLD_BRICK_STAIRS);
        goldBricks.slab(EBBlocks.GOLD_BRICK_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.GOLD_BRICK_VERTICAL_STAIRS, EBBlocks.GOLD_BRICKS);

        BlockStateModelGenerator.BlockTexturePool lapisBricks = generator.registerCubeAllModelTexturePool(EBBlocks.LAPIS_BRICKS);
        lapisBricks.stairs(EBBlocks.LAPIS_BRICK_STAIRS);
        lapisBricks.slab(EBBlocks.LAPIS_BRICK_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.LAPIS_BRICK_VERTICAL_STAIRS, EBBlocks.LAPIS_BRICKS);

        BlockStateModelGenerator.BlockTexturePool emeraldBricks = generator.registerCubeAllModelTexturePool(EBBlocks.EMERALD_BRICKS);
        emeraldBricks.stairs(EBBlocks.EMERALD_BRICK_STAIRS);
        emeraldBricks.slab(EBBlocks.EMERALD_BRICK_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS, EBBlocks.EMERALD_BRICKS);

        BlockStateModelGenerator.BlockTexturePool diamondBricks = generator.registerCubeAllModelTexturePool(EBBlocks.DIAMOND_BRICKS);
        diamondBricks.stairs(EBBlocks.DIAMOND_BRICK_STAIRS);
        diamondBricks.slab(EBBlocks.DIAMOND_BRICK_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.DIAMOND_BRICK_VERTICAL_STAIRS, EBBlocks.DIAMOND_BRICKS);

        BlockStateModelGenerator.BlockTexturePool netheriteBricks = generator.registerCubeAllModelTexturePool(EBBlocks.NETHERITE_BRICKS);
        netheriteBricks.stairs(EBBlocks.NETHERITE_BRICK_STAIRS);
        netheriteBricks.slab(EBBlocks.NETHERITE_BRICK_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.NETHERITE_BRICK_VERTICAL_STAIRS, EBBlocks.NETHERITE_BRICKS);

        EBModels.registerVerticalStairs(generator, EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS, EBBlocks.OAK_MOSAIC);
        EBModels.registerVerticalStairs(generator, EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS, EBBlocks.SPRUCE_MOSAIC);
        EBModels.registerVerticalStairs(generator, EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS, EBBlocks.BIRCH_MOSAIC);
        EBModels.registerVerticalStairs(generator, EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS, EBBlocks.JUNGLE_MOSAIC);
        EBModels.registerVerticalStairs(generator, EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS, EBBlocks.ACACIA_MOSAIC);
        EBModels.registerVerticalStairs(generator, EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS, EBBlocks.DARK_OAK_MOSAIC);
        EBModels.registerVerticalStairs(generator, EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS, EBBlocks.MANGROVE_MOSAIC);
        EBModels.registerVerticalStairs(generator, EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS, EBBlocks.CHERRY_MOSAIC);
        EBModels.registerVerticalStairs(generator, EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS, Blocks.BAMBOO_MOSAIC);
        EBModels.registerVerticalStairs(generator, EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS, EBBlocks.CRIMSON_MOSAIC);
        EBModels.registerVerticalStairs(generator, EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS, EBBlocks.WARPED_MOSAIC);
        EBModels.registerVerticalStairs(generator, EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS, EBBlocks.ANCIENT_MOSAIC);
        EBModels.registerVerticalStairs(generator, EBBlocks.GLOOM_MOSAIC_VERTICAL_STAIRS, EBBlocks.GLOOM_MOSAIC);

        EBModels.registerVerticalStairs(generator, EBBlocks.COBBLESTONE_BRICK_VERTICAL_STAIRS, EBBlocks.COBBLESTONE_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS, EBBlocks.COBBLED_DEEPSLATE_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.BLACKSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.BLACKSTONE_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS, EBBlocks.MOSSY_COBBLESTONE_BRICKS);

        EBModels.registerVerticalStairs(generator, EBBlocks.ANCIENT_VERTICAL_STAIRS, EBBlocks.ANCIENT_PLANKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.GLOOM_VERTICAL_STAIRS, EBBlocks.GLOOM_PLANKS);

        generator.registerSimpleCubeAll(EBBlocks.SEA_GLASS);
        generator.registerSimpleCubeAll(EBBlocks.VERDANT_SEA_GLASS);
        generator.registerSimpleCubeAll(EBBlocks.ROSE_SEA_GLASS);
        generator.registerSimpleCubeAll(EBBlocks.FUCHSIA_SEA_GLASS);
        generator.registerSimpleCubeAll(EBBlocks.AQUA_SEA_GLASS);
        generator.registerSimpleCubeAll(EBBlocks.SCARLET_SEA_GLASS);

        EBModels.registerSeaGlassPane(generator, EBBlocks.SEA_GLASS_PANE, EBBlocks.SEA_GLASS);
        EBModels.registerSeaGlassPane(generator, EBBlocks.VERDANT_SEA_GLASS_PANE, EBBlocks.VERDANT_SEA_GLASS);
        EBModels.registerSeaGlassPane(generator, EBBlocks.ROSE_SEA_GLASS_PANE, EBBlocks.ROSE_SEA_GLASS);
        EBModels.registerSeaGlassPane(generator, EBBlocks.FUCHSIA_SEA_GLASS_PANE, EBBlocks.FUCHSIA_SEA_GLASS);
        EBModels.registerSeaGlassPane(generator, EBBlocks.AQUA_SEA_GLASS_PANE, EBBlocks.AQUA_SEA_GLASS);
        EBModels.registerSeaGlassPane(generator, EBBlocks.SCARLET_SEA_GLASS_PANE, EBBlocks.SCARLET_SEA_GLASS);

        BlockStateModelGenerator.BlockTexturePool boneBricks = generator.registerCubeAllModelTexturePool(EBBlocks.BONE_BRICKS);
        boneBricks.stairs(EBBlocks.BONE_BRICK_STAIRS);
        boneBricks.slab(EBBlocks.BONE_BRICK_SLAB);
        boneBricks.wall(EBBlocks.BONE_BRICK_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.BONE_BRICK_VERTICAL_STAIRS, EBBlocks.BONE_BRICKS);

        for (DyeColor colors : DyeColor.values()) {
            generator.registerWoolAndCarpet(EBBlocks.getDyedKnittedWools(colors.getId()), EBBlocks.getDyedKnittedCarpets(colors.getId()));
        }

        generator.registerSimpleCubeAll(EBBlocks.SOUL_MAGMA_BLOCK);

        BlockStateModelGenerator.BlockTexturePool polishedSandstone = generator.registerCubeAllModelTexturePool(EBBlocks.POLISHED_SANDSTONE);
        polishedSandstone.stairs(EBBlocks.POLISHED_SANDSTONE_STAIRS);
        polishedSandstone.slab(EBBlocks.POLISHED_SANDSTONE_SLAB);
        polishedSandstone.wall(EBBlocks.POLISHED_SANDSTONE_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.POLISHED_SANDSTONE_VERTICAL_STAIRS, EBBlocks.POLISHED_SANDSTONE);

        BlockStateModelGenerator.BlockTexturePool sandstoneBricks = generator.registerCubeAllModelTexturePool(EBBlocks.SANDSTONE_BRICKS);
        sandstoneBricks.stairs(EBBlocks.SANDSTONE_BRICK_STAIRS);
        sandstoneBricks.slab(EBBlocks.SANDSTONE_BRICK_SLAB);
        sandstoneBricks.wall(EBBlocks.SANDSTONE_BRICK_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.SANDSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.SANDSTONE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool sandstoneTiles = generator.registerCubeAllModelTexturePool(EBBlocks.SANDSTONE_TILES);
        sandstoneTiles.stairs(EBBlocks.SANDSTONE_TILE_STAIRS);
        sandstoneTiles.slab(EBBlocks.SANDSTONE_TILE_SLAB);
        sandstoneTiles.wall(EBBlocks.SANDSTONE_TILE_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.SANDSTONE_TILE_VERTICAL_STAIRS, EBBlocks.SANDSTONE_TILES);

        generator.registerSingleton(EBBlocks.CHISELED_SANDSTONE_BRICKS, TexturedModel.CUBE_COLUMN);
        generator.registerSingleton(EBBlocks.DECORATED_SANDSTONE_BRICKS, TexturedModel.CUBE_COLUMN);
        generator.registerSingleton(EBBlocks.ENGRAVED_SANDSTONE_BRICKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool polishedRedSandstone = generator.registerCubeAllModelTexturePool(EBBlocks.POLISHED_RED_SANDSTONE);
        polishedRedSandstone.stairs(EBBlocks.POLISHED_RED_SANDSTONE_STAIRS);
        polishedRedSandstone.slab(EBBlocks.POLISHED_RED_SANDSTONE_SLAB);
        polishedRedSandstone.wall(EBBlocks.POLISHED_RED_SANDSTONE_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.POLISHED_RED_SANDSTONE_VERTICAL_STAIRS, EBBlocks.POLISHED_RED_SANDSTONE);

        BlockStateModelGenerator.BlockTexturePool sandstoneRedBricks = generator.registerCubeAllModelTexturePool(EBBlocks.RED_SANDSTONE_BRICKS);
        sandstoneRedBricks.stairs(EBBlocks.RED_SANDSTONE_BRICK_STAIRS);
        sandstoneRedBricks.slab(EBBlocks.RED_SANDSTONE_BRICK_SLAB);
        sandstoneRedBricks.wall(EBBlocks.RED_SANDSTONE_BRICK_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.RED_SANDSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.RED_SANDSTONE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool sandstoneRedTiles = generator.registerCubeAllModelTexturePool(EBBlocks.RED_SANDSTONE_TILES);
        sandstoneRedTiles.stairs(EBBlocks.RED_SANDSTONE_TILE_STAIRS);
        sandstoneRedTiles.slab(EBBlocks.RED_SANDSTONE_TILE_SLAB);
        sandstoneRedTiles.wall(EBBlocks.RED_SANDSTONE_TILE_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.RED_SANDSTONE_TILE_VERTICAL_STAIRS, EBBlocks.RED_SANDSTONE_TILES);

        generator.registerSingleton(EBBlocks.CHISELED_RED_SANDSTONE_BRICKS, TexturedModel.CUBE_COLUMN);
        generator.registerSingleton(EBBlocks.DECORATED_RED_SANDSTONE_BRICKS, TexturedModel.CUBE_COLUMN);
        generator.registerSingleton(EBBlocks.ENGRAVED_RED_SANDSTONE_BRICKS, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool polishedSoulSandstone = generator.registerCubeAllModelTexturePool(EBBlocks.POLISHED_SOUL_SANDSTONE);
        polishedSoulSandstone.stairs(EBBlocks.POLISHED_SOUL_SANDSTONE_STAIRS);
        polishedSoulSandstone.slab(EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB);
        polishedSoulSandstone.wall(EBBlocks.POLISHED_SOUL_SANDSTONE_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS, EBBlocks.POLISHED_SOUL_SANDSTONE);

        BlockStateModelGenerator.BlockTexturePool sandstoneSoulBricks = generator.registerCubeAllModelTexturePool(EBBlocks.SOUL_SANDSTONE_BRICKS);
        sandstoneSoulBricks.stairs(EBBlocks.SOUL_SANDSTONE_BRICK_STAIRS);
        sandstoneSoulBricks.slab(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB);
        sandstoneSoulBricks.wall(EBBlocks.SOUL_SANDSTONE_BRICK_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.SOUL_SANDSTONE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool sandstoneSoulTiles = generator.registerCubeAllModelTexturePool(EBBlocks.SOUL_SANDSTONE_TILES);
        sandstoneSoulTiles.stairs(EBBlocks.SOUL_SANDSTONE_TILE_STAIRS);
        sandstoneSoulTiles.slab(EBBlocks.SOUL_SANDSTONE_TILE_SLAB);
        sandstoneSoulTiles.wall(EBBlocks.SOUL_SANDSTONE_TILE_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.SOUL_SANDSTONE_TILE_VERTICAL_STAIRS, EBBlocks.SOUL_SANDSTONE_TILES);

        generator.registerSingleton(EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS, TexturedModel.CUBE_COLUMN);
        generator.registerSingleton(EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS, TexturedModel.CUBE_COLUMN);
        generator.registerSingleton(EBBlocks.ENGRAVED_SOUL_SANDSTONE_BRICKS, TexturedModel.CUBE_COLUMN);

        EBModels.registerLadder(generator, EBBlocks.SPRUCE_LADDER);
        EBModels.registerLadder(generator, EBBlocks.BIRCH_LADDER);
        EBModels.registerLadder(generator, EBBlocks.JUNGLE_LADDER);
        EBModels.registerLadder(generator, EBBlocks.ACACIA_LADDER);
        EBModels.registerLadder(generator, EBBlocks.DARK_OAK_LADDER);
        EBModels.registerLadder(generator, EBBlocks.MANGROVE_LADDER);
        EBModels.registerLadder(generator, EBBlocks.CHERRY_LADDER);
        EBModels.registerLadder(generator, EBBlocks.BAMBOO_LADDER);
        EBModels.registerLadder(generator, EBBlocks.CRIMSON_LADDER);
        EBModels.registerLadder(generator, EBBlocks.WARPED_LADDER);
        EBModels.registerLadder(generator, EBBlocks.GLOOM_LADDER);
        EBModels.registerLadder(generator, EBBlocks.ANCIENT_LADDER);

        generator.registerCubeWithCustomTextures(EBBlocks.SPRUCE_CRAFTING_TABLE, Blocks.SPRUCE_PLANKS, TextureMap::frontSideWithCustomBottom);
        generator.registerCubeWithCustomTextures(EBBlocks.BIRCH_CRAFTING_TABLE, Blocks.BIRCH_PLANKS, TextureMap::frontSideWithCustomBottom);
        generator.registerCubeWithCustomTextures(EBBlocks.JUNGLE_CRAFTING_TABLE, Blocks.JUNGLE_PLANKS, TextureMap::frontSideWithCustomBottom);
        generator.registerCubeWithCustomTextures(EBBlocks.ACACIA_CRAFTING_TABLE, Blocks.ACACIA_PLANKS, TextureMap::frontSideWithCustomBottom);
        generator.registerCubeWithCustomTextures(EBBlocks.DARK_OAK_CRAFTING_TABLE, Blocks.DARK_OAK_PLANKS, TextureMap::frontSideWithCustomBottom);
        generator.registerCubeWithCustomTextures(EBBlocks.MANGROVE_CRAFTING_TABLE, Blocks.MANGROVE_PLANKS, TextureMap::frontSideWithCustomBottom);
        generator.registerCubeWithCustomTextures(EBBlocks.CHERRY_CRAFTING_TABLE, Blocks.CHERRY_PLANKS, TextureMap::frontSideWithCustomBottom);
        generator.registerCubeWithCustomTextures(EBBlocks.BAMBOO_CRAFTING_TABLE, Blocks.BAMBOO_PLANKS, TextureMap::frontSideWithCustomBottom);
        generator.registerCubeWithCustomTextures(EBBlocks.CRIMSON_CRAFTING_TABLE, Blocks.CRIMSON_PLANKS, TextureMap::frontSideWithCustomBottom);
        generator.registerCubeWithCustomTextures(EBBlocks.WARPED_CRAFTING_TABLE, Blocks.WARPED_PLANKS, TextureMap::frontSideWithCustomBottom);
        generator.registerCubeWithCustomTextures(EBBlocks.ANCIENT_CRAFTING_TABLE, EBBlocks.ANCIENT_PLANKS, TextureMap::frontSideWithCustomBottom);
        generator.registerCubeWithCustomTextures(EBBlocks.GLOOM_CRAFTING_TABLE, EBBlocks.GLOOM_PLANKS, TextureMap::frontSideWithCustomBottom);

        EBModels.registerMug(generator, EBBlocks.WOODEN_MUG);

        BlockStateModelGenerator.BlockTexturePool quartzBricks = generator.registerCubeAllModelTexturePool(Blocks.QUARTZ_BRICKS);
        quartzBricks.stairs(EBBlocks.QUARTZ_BRICK_STAIRS);
        quartzBricks.slab(EBBlocks.QUARTZ_BRICK_SLAB);
        quartzBricks.wall(EBBlocks.QUARTZ_BRICK_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.QUARTZ_BRICK_VERTICAL_STAIRS, Blocks.QUARTZ_BRICKS);

        for (DyeColor colors : DyeColor.values()) {
            BlockStateModelGenerator.BlockTexturePool dyedTerracottaTiles = generator.registerCubeAllModelTexturePool(EBBlocks.getDyedTerracottaTiles(colors.getId()));
            dyedTerracottaTiles.stairs(EBBlocks.getDyedTerracottaTileStairs(colors.getId()));
            dyedTerracottaTiles.slab(EBBlocks.getDyedTerracottaTileSlab(colors.getId()));
            EBModels.registerVerticalStairs(generator, EBBlocks.getDyedTerracottaTileVerticalStairs(colors.getId()), EBBlocks.getDyedTerracottaTiles(colors.getId()));
        }

        BlockStateModelGenerator.BlockTexturePool terracottaTiles = generator.registerCubeAllModelTexturePool(EBBlocks.TERRACOTTA_TILES);
        terracottaTiles.stairs(EBBlocks.TERRACOTTA_TILE_STAIRS);
        terracottaTiles.slab(EBBlocks.TERRACOTTA_TILE_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.TERRACOTTA_TILE_VERTICAL_STAIRS, EBBlocks.TERRACOTTA_TILES);

        EBModels.registerVerticalStairs(generator, EBBlocks.OAK_VERTICAL_STAIRS, Blocks.OAK_PLANKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.SPRUCE_VERTICAL_STAIRS, Blocks.SPRUCE_PLANKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.JUNGLE_VERTICAL_STAIRS, Blocks.JUNGLE_PLANKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.ACACIA_VERTICAL_STAIRS, Blocks.ACACIA_PLANKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.DARK_OAK_VERTICAL_STAIRS, Blocks.DARK_OAK_PLANKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.MANGROVE_VERTICAL_STAIRS, Blocks.MANGROVE_PLANKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.CHERRY_VERTICAL_STAIRS, Blocks.CHERRY_PLANKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.BAMBOO_VERTICAL_STAIRS, Blocks.BAMBOO_PLANKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.CRIMSON_VERTICAL_STAIRS, Blocks.CRIMSON_PLANKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.WARPED_VERTICAL_STAIRS, Blocks.WARPED_PLANKS);

        EBModels.registerVerticalStairs(generator, EBBlocks.STONE_VERTICAL_STAIRS, Blocks.STONE);
        EBModels.registerVerticalStairs(generator, EBBlocks.STONE_BRICK_VERTICAL_STAIRS, Blocks.STONE_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.MOSSY_STONE_BRICK_VERTICAL_STAIRS, Blocks.MOSSY_STONE_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.COBBLESTONE_VERTICAL_STAIRS, Blocks.COBBLESTONE);
        EBModels.registerVerticalStairs(generator, EBBlocks.MOSSY_COBBLESTONE_VERTICAL_STAIRS, Blocks.MOSSY_COBBLESTONE);

        EBModels.registerVerticalStairs(generator, EBBlocks.COBBLED_DEEPSLATE_VERTICAL_STAIRS, Blocks.COBBLED_DEEPSLATE);
        EBModels.registerVerticalStairs(generator, EBBlocks.DEEPSLATE_BRICK_VERTICAL_STAIRS, Blocks.DEEPSLATE_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.DEEPSLATE_TILE_VERTICAL_STAIRS, Blocks.DEEPSLATE_TILES);
        EBModels.registerVerticalStairs(generator, EBBlocks.POLISHED_DEEPSLATE_VERTICAL_STAIRS, Blocks.POLISHED_DEEPSLATE);

        EBModels.registerVerticalStairs(generator, EBBlocks.BRICK_VERTICAL_STAIRS, Blocks.BRICKS);

        EBModels.registerVerticalStairs(generator, EBBlocks.POLISHED_BLACKSTONE_VERTICAL_STAIRS, Blocks.POLISHED_BLACKSTONE);
        EBModels.registerVerticalStairs(generator, EBBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS, Blocks.POLISHED_BLACKSTONE_BRICKS);

        EBModels.registerVerticalStairs(generator, EBBlocks.NETHER_BRICK_VERTICAL_STAIRS, Blocks.NETHER_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.RED_NETHER_BRICK_VERTICAL_STAIRS, Blocks.RED_NETHER_BRICKS);

        EBModels.registerVerticalStairs(generator, EBBlocks.PRISMARINE_VERTICAL_STAIRS, Blocks.PRISMARINE);
        EBModels.registerVerticalStairs(generator, EBBlocks.PRISMARINE_BRICK_VERTICAL_STAIRS, Blocks.PRISMARINE_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.DARK_PRISMARINE_VERTICAL_STAIRS, Blocks.DARK_PRISMARINE);

        EBModels.registerVerticalStairs(generator, EBBlocks.ANDESITE_VERTICAL_STAIRS, Blocks.ANDESITE);
        EBModels.registerVerticalStairs(generator, EBBlocks.POLISHED_ANDESITE_VERTICAL_STAIRS, Blocks.POLISHED_ANDESITE);
        EBModels.registerVerticalStairs(generator, EBBlocks.GRANITE_VERTICAL_STAIRS, Blocks.GRANITE);
        EBModels.registerVerticalStairs(generator, EBBlocks.POLISHED_GRANITE_VERTICAL_STAIRS, Blocks.POLISHED_GRANITE);
        EBModels.registerVerticalStairs(generator, EBBlocks.DIORITE_VERTICAL_STAIRS, Blocks.DIORITE);
        EBModels.registerVerticalStairs(generator, EBBlocks.POLISHED_DIORITE_VERTICAL_STAIRS, Blocks.POLISHED_DIORITE);

        EBModels.registerVerticalStairs(generator, EBBlocks.END_STONE_BRICK_VERTICAL_STAIRS, Blocks.END_STONE_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.PURPUR_VERTICAL_STAIRS, Blocks.PURPUR_BLOCK);
        EBModels.registerVerticalStairs(generator, EBBlocks.BIRCH_VERTICAL_STAIRS, Blocks.BIRCH_PLANKS);

        EBModels.registerVerticalStairs(generator, EBBlocks.TUFF_VERTICAL_STAIRS, Blocks.TUFF);
        EBModels.registerVerticalStairs(generator, EBBlocks.TUFF_BRICK_VERTICAL_STAIRS, Blocks.TUFF_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.POLISHED_TUFF_VERTICAL_STAIRS, Blocks.POLISHED_TUFF);

        EBModels.registerVerticalStairs(generator, EBBlocks.CUT_COPPER_VERTICAL_STAIRS, Blocks.CUT_COPPER);
        EBModels.registerVerticalStairs(generator, EBBlocks.EXPOSED_CUT_COPPER_VERTICAL_STAIRS, Blocks.EXPOSED_CUT_COPPER);
        EBModels.registerVerticalStairs(generator, EBBlocks.WEATHERED_CUT_COPPER_VERTICAL_STAIRS, Blocks.WEATHERED_CUT_COPPER);
        EBModels.registerVerticalStairs(generator, EBBlocks.OXIDIZED_CUT_COPPER_VERTICAL_STAIRS, Blocks.OXIDIZED_CUT_COPPER);

        EBModels.registerVerticalStairs(generator, EBBlocks.WAXED_CUT_COPPER_VERTICAL_STAIRS, Blocks.CUT_COPPER);
        EBModels.registerVerticalStairs(generator, EBBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_STAIRS, Blocks.EXPOSED_CUT_COPPER);
        EBModels.registerVerticalStairs(generator, EBBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_STAIRS, Blocks.WEATHERED_CUT_COPPER);
        EBModels.registerVerticalStairs(generator, EBBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_STAIRS, Blocks.OXIDIZED_CUT_COPPER);

        EBModels.registerTintableCrossWithoutItem(generator, EBBlocks.GLOOM_SEEDS, BlockStateModelGenerator.TintType.NOT_TINTED);

        BlockStateModelGenerator.BlockTexturePool graniteBricks = generator.registerCubeAllModelTexturePool(EBBlocks.GRANITE_BRICKS);
        graniteBricks.stairs(EBBlocks.GRANITE_BRICK_STAIRS);
        graniteBricks.slab(EBBlocks.GRANITE_BRICK_SLAB);
        graniteBricks.wall(EBBlocks.GRANITE_BRICK_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.GRANITE_BRICK_VERTICAL_STAIRS, EBBlocks.GRANITE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool dioriteBricks = generator.registerCubeAllModelTexturePool(EBBlocks.DIORITE_BRICKS);
        dioriteBricks.stairs(EBBlocks.DIORITE_BRICK_STAIRS);
        dioriteBricks.slab(EBBlocks.DIORITE_BRICK_SLAB);
        dioriteBricks.wall(EBBlocks.DIORITE_BRICK_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.DIORITE_BRICK_VERTICAL_STAIRS, EBBlocks.DIORITE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool andesiteBricks = generator.registerCubeAllModelTexturePool(EBBlocks.ANDESITE_BRICKS);
        andesiteBricks.stairs(EBBlocks.ANDESITE_BRICK_STAIRS);
        andesiteBricks.slab(EBBlocks.ANDESITE_BRICK_SLAB);
        andesiteBricks.wall(EBBlocks.ANDESITE_BRICK_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.ANDESITE_BRICK_VERTICAL_STAIRS, EBBlocks.ANDESITE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool smoothBricks = generator.registerCubeAllModelTexturePool(EBBlocks.SMOOTH_BRICKS);
        smoothBricks.stairs(EBBlocks.SMOOTH_BRICK_STAIRS);
        smoothBricks.slab(EBBlocks.SMOOTH_BRICK_SLAB);
        smoothBricks.wall(EBBlocks.SMOOTH_BRICK_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.SMOOTH_BRICK_VERTICAL_STAIRS, EBBlocks.SMOOTH_BRICKS);

        generator.registerSimpleCubeAll(EBBlocks.HERRINGBONE_BRICKS);
        generator.registerSimpleCubeAll(EBBlocks.SMOOTH_HERRINGBONE_BRICKS);
        generator.registerSimpleCubeAll(EBBlocks.CRACKED_BRICKS);
        generator.registerSimpleCubeAll(EBBlocks.CRACKED_SMOOTH_BRICKS);

        generator.registerLantern(EBBlocks.REACHING_LANTERN);

        EBModels.registerEBBookshelf(generator, EBBlocks.SPRUCE_BOOKSHELF, Blocks.SPRUCE_PLANKS);
        EBModels.registerEBBookshelf(generator, EBBlocks.BIRCH_BOOKSHELF, Blocks.BIRCH_PLANKS);
        EBModels.registerEBBookshelf(generator, EBBlocks.JUNGLE_BOOKSHELF, Blocks.JUNGLE_PLANKS);
        EBModels.registerEBBookshelf(generator, EBBlocks.ACACIA_BOOKSHELF, Blocks.ACACIA_PLANKS);
        EBModels.registerEBBookshelf(generator, EBBlocks.DARK_OAK_BOOKSHELF, Blocks.DARK_OAK_PLANKS);
        EBModels.registerEBBookshelf(generator, EBBlocks.MANGROVE_BOOKSHELF, Blocks.MANGROVE_PLANKS);
        EBModels.registerEBBookshelf(generator, EBBlocks.CHERRY_BOOKSHELF, Blocks.CHERRY_PLANKS);
        EBModels.registerEBBookshelf(generator, EBBlocks.BAMBOO_BOOKSHELF, Blocks.BAMBOO_PLANKS);
        EBModels.registerEBBookshelf(generator, EBBlocks.CRIMSON_BOOKSHELF, Blocks.CRIMSON_PLANKS);
        EBModels.registerEBBookshelf(generator, EBBlocks.WARPED_BOOKSHELF, Blocks.WARPED_PLANKS);
        EBModels.registerEBBookshelf(generator, EBBlocks.ANCIENT_BOOKSHELF, EBBlocks.ANCIENT_PLANKS);
        EBModels.registerEBBookshelf(generator, EBBlocks.GLOOM_BOOKSHELF, EBBlocks.GLOOM_PLANKS);

        generator.registerSimpleCubeAll(EBBlocks.BRIMSTONE_WINDOW);
        generator.registerSimpleCubeAll(EBBlocks.BRIMSTONE_LAMP);
        generator.registerAxisRotated(EBBlocks.BRIMSTONE_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);

        BlockStateModelGenerator.BlockTexturePool brimstone = generator.registerCubeAllModelTexturePool(EBBlocks.BRIMSTONE);
        brimstone.stairs(EBBlocks.BRIMSTONE_STAIRS);
        brimstone.slab(EBBlocks.BRIMSTONE_SLAB);
        brimstone.wall(EBBlocks.BRIMSTONE_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.BRIMSTONE_VERTICAL_STAIRS, EBBlocks.BRIMSTONE);

        BlockStateModelGenerator.BlockTexturePool brimstoneBricks = generator.registerCubeAllModelTexturePool(EBBlocks.BRIMSTONE_BRICKS);
        brimstoneBricks.stairs(EBBlocks.BRIMSTONE_BRICK_STAIRS);
        brimstoneBricks.slab(EBBlocks.BRIMSTONE_BRICK_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.BRIMSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.BRIMSTONE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool brimstoneTiles = generator.registerCubeAllModelTexturePool(EBBlocks.BRIMSTONE_TILES);
        brimstoneTiles.stairs(EBBlocks.BRIMSTONE_TILE_STAIRS);
        brimstoneTiles.slab(EBBlocks.BRIMSTONE_TILE_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.BRIMSTONE_TILE_VERTICAL_STAIRS, EBBlocks.BRIMSTONE_TILES);

        BlockStateModelGenerator.BlockTexturePool polishedBrimstone = generator.registerCubeAllModelTexturePool(EBBlocks.POLISHED_BRIMSTONE);
        polishedBrimstone.stairs(EBBlocks.POLISHED_BRIMSTONE_STAIRS);
        polishedBrimstone.slab(EBBlocks.POLISHED_BRIMSTONE_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.POLISHED_BRIMSTONE_VERTICAL_STAIRS, EBBlocks.POLISHED_BRIMSTONE);

        BlockStateModelGenerator.BlockTexturePool asphalt = generator.registerCubeAllModelTexturePool(EBBlocks.ASPHALT);
        asphalt.stairs(EBBlocks.ASPHALT_STAIRS);
        asphalt.slab(EBBlocks.ASPHALT_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.ASPHALT_VERTICAL_STAIRS, EBBlocks.ASPHALT);

        generator.registerSimpleCubeAll(EBBlocks.IRON_GRATE);
        generator.registerSimpleCubeAll(EBBlocks.GOLD_GRATE);

        generator.registerFlowerPotPlant(EBBlocks.ROSE, EBBlocks.POTTED_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        generator.registerFlowerPotPlant(EBBlocks.CYAN_ROSE, EBBlocks.POTTED_CYAN_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        generator.registerFlowerPotPlant(EBBlocks.WHITE_ROSE, EBBlocks.POTTED_WHITE_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);

        generator.registerSimpleCubeAll(EBBlocks.CRACKED_DIORITE_BRICKS);
        generator.registerSimpleCubeAll(EBBlocks.CRACKED_MUD_BRICKS);
        generator.registerSimpleCubeAll(EBBlocks.CRACKED_GRANITE_BRICKS);
        generator.registerSimpleCubeAll(EBBlocks.CRACKED_BRIMSTONE_BRICKS);
        generator.registerSimpleCubeAll(EBBlocks.CRACKED_ANDESITE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool redstoneBricks = generator.registerCubeAllModelTexturePool(EBBlocks.REDSTONE_BRICKS);
        redstoneBricks.stairs(EBBlocks.REDSTONE_BRICK_STAIRS);
        redstoneBricks.slab(EBBlocks.REDSTONE_BRICK_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.REDSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.REDSTONE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool polishedStone = generator.registerCubeAllModelTexturePool(EBBlocks.POLISHED_STONE);
        polishedStone.stairs(EBBlocks.POLISHED_STONE_STAIRS);
        polishedStone.slab(EBBlocks.POLISHED_STONE_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.POLISHED_STONE_VERTICAL_STAIRS, EBBlocks.POLISHED_STONE);

        BlockStateModelGenerator.BlockTexturePool smoothStoneBricks = generator.registerCubeAllModelTexturePool(EBBlocks.SMOOTH_STONE_BRICKS);
        smoothStoneBricks.stairs(EBBlocks.SMOOTH_STONE_BRICK_STAIRS);
        smoothStoneBricks.slab(EBBlocks.SMOOTH_STONE_BRICK_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.SMOOTH_STONE_BRICK_VERTICAL_STAIRS, EBBlocks.SMOOTH_STONE_BRICKS);
        generator.registerSimpleCubeAll(EBBlocks.CRACKED_SMOOTH_STONE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool smoothStoneTiles = generator.registerCubeAllModelTexturePool(EBBlocks.SMOOTH_STONE_TILES);
        smoothStoneTiles.stairs(EBBlocks.SMOOTH_STONE_TILE_STAIRS);
        smoothStoneTiles.slab(EBBlocks.SMOOTH_STONE_TILE_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.SMOOTH_STONE_TILE_VERTICAL_STAIRS, EBBlocks.SMOOTH_STONE_TILES);
        generator.registerSimpleCubeAll(EBBlocks.CRACKED_SMOOTH_STONE_TILES);

        generator.registerAxisRotated(EBBlocks.SMOOTH_STONE_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
        generator.registerSimpleCubeAll(EBBlocks.CHISELED_SMOOTH_STONE_BRICKS);

        EBModels.registerDecorativeShelfModel(generator, EBBlocks.OAK_DECORATIVE_SHELF, "0", EBBlocks.OAK_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.OAK_DECORATIVE_SHELF, "1", EBBlocks.OAK_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.OAK_DECORATIVE_SHELF, "2", EBBlocks.OAK_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.OAK_DECORATIVE_SHELF, "3", EBBlocks.OAK_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.OAK_DECORATIVE_SHELF, "4", EBBlocks.OAK_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.OAK_DECORATIVE_SHELF, "5", EBBlocks.OAK_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.OAK_DECORATIVE_SHELF, "6", EBBlocks.OAK_MOSAIC);

        EBModels.registerDecorativeShelfModel(generator, EBBlocks.WARPED_DECORATIVE_SHELF, "0", EBBlocks.WARPED_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.WARPED_DECORATIVE_SHELF, "1", EBBlocks.WARPED_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.WARPED_DECORATIVE_SHELF, "2", EBBlocks.WARPED_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.WARPED_DECORATIVE_SHELF, "3", EBBlocks.WARPED_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.WARPED_DECORATIVE_SHELF, "4", EBBlocks.WARPED_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.WARPED_DECORATIVE_SHELF, "5", EBBlocks.WARPED_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.WARPED_DECORATIVE_SHELF, "6", EBBlocks.WARPED_MOSAIC);

        EBModels.registerDecorativeShelfModel(generator, EBBlocks.CRIMSON_DECORATIVE_SHELF, "0", EBBlocks.CRIMSON_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.CRIMSON_DECORATIVE_SHELF, "1", EBBlocks.CRIMSON_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.CRIMSON_DECORATIVE_SHELF, "2", EBBlocks.CRIMSON_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.CRIMSON_DECORATIVE_SHELF, "3", EBBlocks.CRIMSON_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.CRIMSON_DECORATIVE_SHELF, "4", EBBlocks.CRIMSON_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.CRIMSON_DECORATIVE_SHELF, "5", EBBlocks.CRIMSON_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.CRIMSON_DECORATIVE_SHELF, "6", EBBlocks.CRIMSON_MOSAIC);

        EBModels.registerDecorativeShelfModel(generator, EBBlocks.BAMBOO_DECORATIVE_SHELF, "0", Blocks.BAMBOO_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.BAMBOO_DECORATIVE_SHELF, "1", Blocks.BAMBOO_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.BAMBOO_DECORATIVE_SHELF, "2", Blocks.BAMBOO_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.BAMBOO_DECORATIVE_SHELF, "3", Blocks.BAMBOO_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.BAMBOO_DECORATIVE_SHELF, "4", Blocks.BAMBOO_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.BAMBOO_DECORATIVE_SHELF, "5", Blocks.BAMBOO_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.BAMBOO_DECORATIVE_SHELF, "6", Blocks.BAMBOO_MOSAIC);

        EBModels.registerDecorativeShelfModel(generator, EBBlocks.CHERRY_DECORATIVE_SHELF, "0", EBBlocks.CHERRY_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.CHERRY_DECORATIVE_SHELF, "1", EBBlocks.CHERRY_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.CHERRY_DECORATIVE_SHELF, "2", EBBlocks.CHERRY_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.CHERRY_DECORATIVE_SHELF, "3", EBBlocks.CHERRY_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.CHERRY_DECORATIVE_SHELF, "4", EBBlocks.CHERRY_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.CHERRY_DECORATIVE_SHELF, "5", EBBlocks.CHERRY_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.CHERRY_DECORATIVE_SHELF, "6", EBBlocks.CHERRY_MOSAIC);

        EBModels.registerDecorativeShelfModel(generator, EBBlocks.MANGROVE_DECORATIVE_SHELF, "0", EBBlocks.MANGROVE_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.MANGROVE_DECORATIVE_SHELF, "1", EBBlocks.MANGROVE_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.MANGROVE_DECORATIVE_SHELF, "2", EBBlocks.MANGROVE_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.MANGROVE_DECORATIVE_SHELF, "3", EBBlocks.MANGROVE_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.MANGROVE_DECORATIVE_SHELF, "4", EBBlocks.MANGROVE_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.MANGROVE_DECORATIVE_SHELF, "5", EBBlocks.MANGROVE_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.MANGROVE_DECORATIVE_SHELF, "6", EBBlocks.MANGROVE_MOSAIC);

        EBModels.registerDecorativeShelfModel(generator, EBBlocks.DARK_OAK_DECORATIVE_SHELF, "0", EBBlocks.DARK_OAK_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.DARK_OAK_DECORATIVE_SHELF, "1", EBBlocks.DARK_OAK_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.DARK_OAK_DECORATIVE_SHELF, "2", EBBlocks.DARK_OAK_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.DARK_OAK_DECORATIVE_SHELF, "3", EBBlocks.DARK_OAK_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.DARK_OAK_DECORATIVE_SHELF, "4", EBBlocks.DARK_OAK_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.DARK_OAK_DECORATIVE_SHELF, "5", EBBlocks.DARK_OAK_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.DARK_OAK_DECORATIVE_SHELF, "6", EBBlocks.DARK_OAK_MOSAIC);

        EBModels.registerDecorativeShelfModel(generator, EBBlocks.ACACIA_DECORATIVE_SHELF, "0", EBBlocks.ACACIA_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.ACACIA_DECORATIVE_SHELF, "1", EBBlocks.ACACIA_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.ACACIA_DECORATIVE_SHELF, "2", EBBlocks.ACACIA_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.ACACIA_DECORATIVE_SHELF, "3", EBBlocks.ACACIA_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.ACACIA_DECORATIVE_SHELF, "4", EBBlocks.ACACIA_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.ACACIA_DECORATIVE_SHELF, "5", EBBlocks.ACACIA_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.ACACIA_DECORATIVE_SHELF, "6", EBBlocks.ACACIA_MOSAIC);

        EBModels.registerDecorativeShelfModel(generator, EBBlocks.JUNGLE_DECORATIVE_SHELF, "0", EBBlocks.JUNGLE_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.JUNGLE_DECORATIVE_SHELF, "1", EBBlocks.JUNGLE_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.JUNGLE_DECORATIVE_SHELF, "2", EBBlocks.JUNGLE_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.JUNGLE_DECORATIVE_SHELF, "3", EBBlocks.JUNGLE_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.JUNGLE_DECORATIVE_SHELF, "4", EBBlocks.JUNGLE_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.JUNGLE_DECORATIVE_SHELF, "5", EBBlocks.JUNGLE_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.JUNGLE_DECORATIVE_SHELF, "6", EBBlocks.JUNGLE_MOSAIC);

        EBModels.registerDecorativeShelfModel(generator, EBBlocks.BIRCH_DECORATIVE_SHELF, "0", EBBlocks.BIRCH_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.BIRCH_DECORATIVE_SHELF, "1", EBBlocks.BIRCH_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.BIRCH_DECORATIVE_SHELF, "2", EBBlocks.BIRCH_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.BIRCH_DECORATIVE_SHELF, "3", EBBlocks.BIRCH_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.BIRCH_DECORATIVE_SHELF, "4", EBBlocks.BIRCH_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.BIRCH_DECORATIVE_SHELF, "5", EBBlocks.BIRCH_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.BIRCH_DECORATIVE_SHELF, "6", EBBlocks.BIRCH_MOSAIC);

        EBModels.registerDecorativeShelfModel(generator, EBBlocks.SPRUCE_DECORATIVE_SHELF, "0", EBBlocks.SPRUCE_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.SPRUCE_DECORATIVE_SHELF, "1", EBBlocks.SPRUCE_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.SPRUCE_DECORATIVE_SHELF, "2", EBBlocks.SPRUCE_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.SPRUCE_DECORATIVE_SHELF, "3", EBBlocks.SPRUCE_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.SPRUCE_DECORATIVE_SHELF, "4", EBBlocks.SPRUCE_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.SPRUCE_DECORATIVE_SHELF, "5", EBBlocks.SPRUCE_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.SPRUCE_DECORATIVE_SHELF, "6", EBBlocks.SPRUCE_MOSAIC);

        EBModels.registerDecorativeShelfModel(generator, EBBlocks.ANCIENT_DECORATIVE_SHELF, "0", EBBlocks.ANCIENT_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.ANCIENT_DECORATIVE_SHELF, "1", EBBlocks.ANCIENT_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.ANCIENT_DECORATIVE_SHELF, "2", EBBlocks.ANCIENT_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.ANCIENT_DECORATIVE_SHELF, "3", EBBlocks.ANCIENT_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.ANCIENT_DECORATIVE_SHELF, "4", EBBlocks.ANCIENT_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.ANCIENT_DECORATIVE_SHELF, "5", EBBlocks.ANCIENT_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.ANCIENT_DECORATIVE_SHELF, "6", EBBlocks.ANCIENT_MOSAIC);

        EBModels.registerDecorativeShelfModel(generator, EBBlocks.GLOOM_DECORATIVE_SHELF, "0", EBBlocks.GLOOM_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.GLOOM_DECORATIVE_SHELF, "1", EBBlocks.GLOOM_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.GLOOM_DECORATIVE_SHELF, "2", EBBlocks.GLOOM_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.GLOOM_DECORATIVE_SHELF, "3", EBBlocks.GLOOM_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.GLOOM_DECORATIVE_SHELF, "4", EBBlocks.GLOOM_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.GLOOM_DECORATIVE_SHELF, "5", EBBlocks.GLOOM_MOSAIC);
        EBModels.registerDecorativeShelfModel(generator, EBBlocks.GLOOM_DECORATIVE_SHELF, "6", EBBlocks.GLOOM_MOSAIC);
    }

    @Override
    public void generateItemModels(ItemModelGenerator generator) {
        generator.register(EBItems.ANCIENT_FRUIT, Models.GENERATED);
        generator.register(EBItems.ANCIENT_SIGN, Models.GENERATED);
        generator.register(EBItems.GLOOM_SIGN, Models.GENERATED);

        generator.register(EBItems.ROYALTY_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.ANCIENT_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.BITTER_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.BOIN_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.BUSTLING_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.CHECKERED_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.DECAY_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.DESTRUCTION_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.FORWARDS_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.HEXXED_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.KITTEH_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.LIFE_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.MESMERIZE_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.PORTAL_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.POTTERY_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.RING_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.SNOUT_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.SPRITE_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.TWINS_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.WRATHFUL_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.IS_THAT_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.KOKOS_BUG_POTTERY_SHERD, Models.GENERATED);
        generator.register(EBItems.THIEF_POTTERY_SHERD, Models.GENERATED);

        generator.register(EBBlocks.SPRUCE_LADDER.asItem(), Models.GENERATED);
        generator.register(EBBlocks.BIRCH_LADDER.asItem(), Models.GENERATED);
        generator.register(EBBlocks.JUNGLE_LADDER.asItem(), Models.GENERATED);
        generator.register(EBBlocks.ACACIA_LADDER.asItem(), Models.GENERATED);
        generator.register(EBBlocks.DARK_OAK_LADDER.asItem(), Models.GENERATED);
        generator.register(EBBlocks.MANGROVE_LADDER.asItem(), Models.GENERATED);
        generator.register(EBBlocks.CHERRY_LADDER.asItem(), Models.GENERATED);
        generator.register(EBBlocks.BAMBOO_LADDER.asItem(), Models.GENERATED);
        generator.register(EBBlocks.CRIMSON_LADDER.asItem(), Models.GENERATED);
        generator.register(EBBlocks.WARPED_LADDER.asItem(), Models.GENERATED);
        generator.register(EBBlocks.ANCIENT_LADDER.asItem(), Models.GENERATED);
        generator.register(EBBlocks.GLOOM_LADDER.asItem(), Models.GENERATED);
        generator.register(EBBlocks.GLOOM_SEEDS.asItem(), Models.GENERATED);
    }

    public static class EBModels {
        public static final Model VERTICAL_STAIRS = new Model(Optional.of(Identifier.of(ExcessiveBuilding.MOD_ID, "template_vertical_stairs")
                .withPrefixedPath("block/")), Optional.empty(), TextureKey.TEXTURE, TextureKey.PARTICLE);

        public static final Model SEA_GLASS_PANE = new Model(Optional.of(Identifier.of(ExcessiveBuilding.MOD_ID, "template_sea_glass_pane")
                .withPrefixedPath("block/")), Optional.empty(), TextureKey.TEXTURE, TextureKey.PARTICLE);

        public static final Model LADDER = new Model(Optional.of(Identifier.of(ExcessiveBuilding.MOD_ID, "template_ladder")
                .withPrefixedPath("block/")), Optional.empty(), TextureKey.TEXTURE, TextureKey.PARTICLE);

        public static final Model MUG = new Model(Optional.of(Identifier.of(ExcessiveBuilding.MOD_ID, "template_mug")
                .withPrefixedPath("block/")), Optional.empty(), TextureKey.TEXTURE, TextureKey.PARTICLE);

        private static void registerEBBookshelf(BlockStateModelGenerator generator, Block bookshelf, Block planks) {
            TextureMap textureMap = TextureMap.sideEnd(TextureMap.getId(bookshelf), TextureMap.getId(planks));
            Identifier identifier = Models.CUBE_COLUMN.upload(bookshelf, textureMap, generator.modelCollector);
            generator.blockStateCollector.accept(generator.createSingletonBlockState(bookshelf, identifier));
        }

        private static void registerDecorativeShelfModel(BlockStateModelGenerator generator, Block bookshelf, String variant, Block planks) {
            TextureMap textureMap = TextureMap.sideEnd(TextureMap.getSubId(bookshelf, variant), TextureMap.getId(planks));
            Identifier identifier = Models.CUBE_COLUMN.upload(bookshelf, variant, textureMap, generator.modelCollector);
        }

        public static void registerTintableCrossWithoutItem(BlockStateModelGenerator generator, Block block, BlockStateModelGenerator.TintType tintType) {
            generator.registerTintableCrossBlockState(block, tintType);
        }

        public static void registerVerticalStairs(BlockStateModelGenerator generator, Block verticalStairs, Block texture) {
            Identifier model = VERTICAL_STAIRS.upload(verticalStairs, TextureMap.texture(texture), generator.modelCollector);
            generator.blockStateCollector.accept(VariantsBlockStateSupplier.create(verticalStairs).coordinate(BlockStateVariantMap.create(Properties.HORIZONTAL_FACING)
                    .register(Direction.NORTH, BlockStateVariant.create().put(VariantSettings.MODEL, model)
                            .put(VariantSettings.Y, VariantSettings.Rotation.R0).put(VariantSettings.UVLOCK, true))
                    .register(Direction.EAST, BlockStateVariant.create().put(VariantSettings.MODEL, model)
                            .put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                    .register(Direction.WEST, BlockStateVariant.create().put(VariantSettings.MODEL, model)
                            .put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true))
                    .register(Direction.SOUTH, BlockStateVariant.create().put(VariantSettings.MODEL, model)
                            .put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))));
        }

        public static void registerMug(BlockStateModelGenerator generator, Block mug) {
            Identifier model = MUG.upload(mug, TextureMap.texture(mug), generator.modelCollector);
            generator.blockStateCollector.accept(VariantsBlockStateSupplier.create(mug).coordinate(BlockStateVariantMap.create(Properties.HORIZONTAL_FACING)
                    .register(Direction.NORTH, BlockStateVariant.create().put(VariantSettings.MODEL, model)
                            .put(VariantSettings.Y, VariantSettings.Rotation.R0).put(VariantSettings.UVLOCK, false))
                    .register(Direction.EAST, BlockStateVariant.create().put(VariantSettings.MODEL, model)
                            .put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, false))
                    .register(Direction.WEST, BlockStateVariant.create().put(VariantSettings.MODEL, model)
                            .put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, false))
                    .register(Direction.SOUTH, BlockStateVariant.create().put(VariantSettings.MODEL, model)
                            .put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, false))));
        }

            public static void registerSeaGlassPane(BlockStateModelGenerator generator, Block seaGlass, Block texture) {
                Identifier model = SEA_GLASS_PANE.upload(seaGlass, TextureMap.texture(texture), generator.modelCollector);
                generator.blockStateCollector.accept(VariantsBlockStateSupplier.create(seaGlass).coordinate(BlockStateVariantMap.create(Properties.HORIZONTAL_FACING)
                        .register(Direction.NORTH, BlockStateVariant.create().put(VariantSettings.MODEL, model)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R0).put(VariantSettings.UVLOCK, true))
                        .register(Direction.EAST, BlockStateVariant.create().put(VariantSettings.MODEL, model)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                        .register(Direction.WEST, BlockStateVariant.create().put(VariantSettings.MODEL, model)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true))
                        .register(Direction.SOUTH, BlockStateVariant.create().put(VariantSettings.MODEL, model)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))));
        }

        public static void registerLadder(BlockStateModelGenerator generator, Block ladder) {
            Identifier model = LADDER.upload(ladder, TextureMap.texture(ladder), generator.modelCollector);
            generator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ladder).coordinate(BlockStateVariantMap.create(Properties.HORIZONTAL_FACING)
                    .register(Direction.NORTH, BlockStateVariant.create().put(VariantSettings.MODEL, model)
                            .put(VariantSettings.Y, VariantSettings.Rotation.R0).put(VariantSettings.UVLOCK, true))
                    .register(Direction.EAST, BlockStateVariant.create().put(VariantSettings.MODEL, model)
                            .put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.UVLOCK, true))
                    .register(Direction.WEST, BlockStateVariant.create().put(VariantSettings.MODEL, model)
                            .put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.UVLOCK, true))
                    .register(Direction.SOUTH, BlockStateVariant.create().put(VariantSettings.MODEL, model)
                            .put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.UVLOCK, true))));
        }
    }
}
