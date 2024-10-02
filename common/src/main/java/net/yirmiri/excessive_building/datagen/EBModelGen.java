package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.core.Direction;
import net.minecraft.data.client.*;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.PropertyDispatch;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.data.models.model.TexturedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.block.AlmentraStatueBlock;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;

import java.util.Optional;

public class EBModelGen extends FabricModelProvider {
    public EBModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {
        BlockModelGenerators.BlockFamilyProvider oakMosaic = generator.family(EBBlocks.OAK_MOSAIC);
        oakMosaic.stairs(EBBlocks.OAK_MOSAIC_STAIRS);
        oakMosaic.slab(EBBlocks.OAK_MOSAIC_SLAB);

        BlockModelGenerators.BlockFamilyProvider spruceMosaic = generator.family(EBBlocks.SPRUCE_MOSAIC);
        spruceMosaic.stairs(EBBlocks.SPRUCE_MOSAIC_STAIRS);
        spruceMosaic.slab(EBBlocks.SPRUCE_MOSAIC_SLAB);

        BlockModelGenerators.BlockFamilyProvider birchMosaic = generator.family(EBBlocks.BIRCH_MOSAIC);
        birchMosaic.stairs(EBBlocks.BIRCH_MOSAIC_STAIRS);
        birchMosaic.slab(EBBlocks.BIRCH_MOSAIC_SLAB);

        BlockModelGenerators.BlockFamilyProvider jungleMosaic = generator.family(EBBlocks.JUNGLE_MOSAIC);
        jungleMosaic.stairs(EBBlocks.JUNGLE_MOSAIC_STAIRS);
        jungleMosaic.slab(EBBlocks.JUNGLE_MOSAIC_SLAB);

        BlockModelGenerators.BlockFamilyProvider acaciaMosaic = generator.family(EBBlocks.ACACIA_MOSAIC);
        acaciaMosaic.stairs(EBBlocks.ACACIA_MOSAIC_STAIRS);
        acaciaMosaic.slab(EBBlocks.ACACIA_MOSAIC_SLAB);

        BlockModelGenerators.BlockFamilyProvider darkOakMosaic = generator.family(EBBlocks.DARK_OAK_MOSAIC);
        darkOakMosaic.stairs(EBBlocks.DARK_OAK_MOSAIC_STAIRS);
        darkOakMosaic.slab(EBBlocks.DARK_OAK_MOSAIC_SLAB);

        BlockModelGenerators.BlockFamilyProvider mangroveMosaic = generator.family(EBBlocks.MANGROVE_MOSAIC);
        mangroveMosaic.stairs(EBBlocks.MANGROVE_MOSAIC_STAIRS);
        mangroveMosaic.slab(EBBlocks.MANGROVE_MOSAIC_SLAB);

        BlockModelGenerators.BlockFamilyProvider cherryMosaic = generator.family(EBBlocks.CHERRY_MOSAIC);
        cherryMosaic.stairs(EBBlocks.CHERRY_MOSAIC_STAIRS);
        cherryMosaic.slab(EBBlocks.CHERRY_MOSAIC_SLAB);

        BlockModelGenerators.BlockFamilyProvider crimsonMosaic = generator.family(EBBlocks.CRIMSON_MOSAIC);
        crimsonMosaic.stairs(EBBlocks.CRIMSON_MOSAIC_STAIRS);
        crimsonMosaic.slab(EBBlocks.CRIMSON_MOSAIC_SLAB);

        BlockModelGenerators.BlockFamilyProvider warpedMosaic = generator.family(EBBlocks.WARPED_MOSAIC);
        warpedMosaic.stairs(EBBlocks.WARPED_MOSAIC_STAIRS);
        warpedMosaic.slab(EBBlocks.WARPED_MOSAIC_SLAB);

        BlockModelGenerators.BlockFamilyProvider cobblestoneBricks = generator.family(EBBlocks.COBBLESTONE_BRICKS);
        cobblestoneBricks.stairs(EBBlocks.COBBLESTONE_BRICK_STAIRS);
        cobblestoneBricks.slab(EBBlocks.COBBLESTONE_BRICK_SLAB);
        cobblestoneBricks.wall(EBBlocks.COBBLESTONE_BRICK_WALL);

        BlockModelGenerators.BlockFamilyProvider mossyCobblestoneBricks = generator.family(EBBlocks.MOSSY_COBBLESTONE_BRICKS);
        mossyCobblestoneBricks.stairs(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS);
        mossyCobblestoneBricks.slab(EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB);
        mossyCobblestoneBricks.wall(EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL);

        BlockModelGenerators.BlockFamilyProvider cobbledDeepslateBricks = generator.family(EBBlocks.COBBLED_DEEPSLATE_BRICKS);
        cobbledDeepslateBricks.stairs(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS);
        cobbledDeepslateBricks.slab(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB);
        cobbledDeepslateBricks.wall(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL);

        BlockModelGenerators.BlockFamilyProvider blackstoneBricks = generator.family(EBBlocks.BLACKSTONE_BRICKS);
        blackstoneBricks.stairs(EBBlocks.BLACKSTONE_BRICK_STAIRS);
        blackstoneBricks.slab(EBBlocks.BLACKSTONE_BRICK_SLAB);
        blackstoneBricks.wall(EBBlocks.BLACKSTONE_BRICK_WALL);

        generator.createTrivialCube(EBBlocks.CRACKED_COBBLESTONE_BRICKS);
        generator.createTrivialCube(EBBlocks.CRACKED_COBBLED_DEEPSLATE_BRICKS);
        generator.createTrivialCube(EBBlocks.CRACKED_BLACKSTONE_BRICKS);

        BlockModelGenerators.BlockFamilyProvider ancientPlanks = generator.family(EBBlocks.ANCIENT_PLANKS);
        ancientPlanks.stairs(EBBlocks.ANCIENT_STAIRS);
        ancientPlanks.slab(EBBlocks.ANCIENT_SLAB);
        ancientPlanks.fence(EBBlocks.ANCIENT_FENCE);
        ancientPlanks.fenceGate(EBBlocks.ANCIENT_FENCE_GATE);
        ancientPlanks.button(EBBlocks.ANCIENT_BUTTON);
        ancientPlanks.pressurePlate(EBBlocks.ANCIENT_PRESSURE_PLATE);

        BlockModelGenerators.BlockFamilyProvider ancientMosaic = generator.family(EBBlocks.ANCIENT_MOSAIC);
        ancientMosaic.stairs(EBBlocks.ANCIENT_MOSAIC_STAIRS);
        ancientMosaic.slab(EBBlocks.ANCIENT_MOSAIC_SLAB);

        generator.createTrivialCube(EBBlocks.ANCIENT_LEAVES);
        generator.createDoor(EBBlocks.ANCIENT_DOOR);
        generator.createOrientableTrapdoor(EBBlocks.ANCIENT_TRAPDOOR);

        generator.woodProvider(EBBlocks.ANCIENT_LOG).logWithHorizontal(EBBlocks.ANCIENT_LOG).wood(EBBlocks.ANCIENT_WOOD);
        generator.woodProvider(EBBlocks.STRIPPED_ANCIENT_LOG).logWithHorizontal(EBBlocks.STRIPPED_ANCIENT_LOG).wood(EBBlocks.STRIPPED_ANCIENT_WOOD);

        generator.createPlant(EBBlocks.ANCIENT_SAPLING, EBBlocks.POTTED_ANCIENT_SAPLING, BlockModelGenerators.TintState.NOT_TINTED);
        generator.createTrivialBlock(EBBlocks.CHISELED_ANCIENT_PLANKS, TexturedModel.COLUMN);
        generator.createHangingSign(EBBlocks.STRIPPED_ANCIENT_LOG, EBBlocks.ANCIENT_HANGING_SIGN, EBBlocks.ANCIENT_WALL_HANGING_SIGN);

        generator.createTrivialBlock(EBBlocks.CHISELED_OAK_PLANKS, TexturedModel.COLUMN);
        generator.createTrivialBlock(EBBlocks.CHISELED_SPRUCE_PLANKS, TexturedModel.COLUMN);
        generator.createTrivialBlock(EBBlocks.CHISELED_BIRCH_PLANKS, TexturedModel.COLUMN);
        generator.createTrivialBlock(EBBlocks.CHISELED_JUNGLE_PLANKS, TexturedModel.COLUMN);
        generator.createTrivialBlock(EBBlocks.CHISELED_ACACIA_PLANKS, TexturedModel.COLUMN);
        generator.createTrivialBlock(EBBlocks.CHISELED_DARK_OAK_PLANKS, TexturedModel.COLUMN);
        generator.createTrivialBlock(EBBlocks.CHISELED_MANGROVE_PLANKS, TexturedModel.COLUMN);
        generator.createTrivialBlock(EBBlocks.CHISELED_BAMBOO_PLANKS, TexturedModel.COLUMN);
        generator.createTrivialBlock(EBBlocks.CHISELED_CHERRY_PLANKS, TexturedModel.COLUMN);
        generator.createTrivialBlock(EBBlocks.CHISELED_CRIMSON_PLANKS, TexturedModel.COLUMN);
        generator.createTrivialBlock(EBBlocks.CHISELED_WARPED_PLANKS, TexturedModel.COLUMN);

        BlockModelGenerators.BlockFamilyProvider gloomPlanks = generator.family(EBBlocks.GLOOM_PLANKS);
        gloomPlanks.stairs(EBBlocks.GLOOM_STAIRS);
        gloomPlanks.slab(EBBlocks.GLOOM_SLAB);
        gloomPlanks.fence(EBBlocks.GLOOM_FENCE);
        gloomPlanks.fenceGate(EBBlocks.GLOOM_FENCE_GATE);
        gloomPlanks.button(EBBlocks.GLOOM_BUTTON);
        gloomPlanks.pressurePlate(EBBlocks.GLOOM_PRESSURE_PLATE);

        BlockModelGenerators.BlockFamilyProvider gloomMosaic = generator.family(EBBlocks.GLOOM_MOSAIC);
        gloomMosaic.stairs(EBBlocks.GLOOM_MOSAIC_STAIRS);
        gloomMosaic.slab(EBBlocks.GLOOM_MOSAIC_SLAB);

        generator.createDoor(EBBlocks.GLOOM_DOOR);
        generator.createOrientableTrapdoor(EBBlocks.GLOOM_TRAPDOOR);

        generator.woodProvider(EBBlocks.GLOOM_LOG).logWithHorizontal(EBBlocks.GLOOM_LOG).wood(EBBlocks.GLOOM_WOOD);
        generator.woodProvider(EBBlocks.STRIPPED_GLOOM_LOG).logWithHorizontal(EBBlocks.STRIPPED_GLOOM_LOG).wood(EBBlocks.STRIPPED_GLOOM_WOOD);

        generator.createTrivialBlock(EBBlocks.CHISELED_GLOOM_PLANKS, TexturedModel.COLUMN);
        generator.createHangingSign(EBBlocks.STRIPPED_GLOOM_LOG, EBBlocks.GLOOM_HANGING_SIGN, EBBlocks.GLOOM_WALL_HANGING_SIGN);

        BlockModelGenerators.BlockFamilyProvider copper = generator.family(Blocks.COPPER_BLOCK);

        BlockModelGenerators.BlockFamilyProvider exposedCopper = generator.family(Blocks.EXPOSED_COPPER);

        BlockModelGenerators.BlockFamilyProvider weatheredCopper = generator.family(Blocks.WEATHERED_COPPER);

        BlockModelGenerators.BlockFamilyProvider oxidizedCopper = generator.family(Blocks.OXIDIZED_COPPER);

        BlockModelGenerators.BlockFamilyProvider copperBricks = generator.family(EBBlocks.COPPER_BRICKS);
        copperBricks.stairs(EBBlocks.COPPER_BRICK_STAIRS);
        copperBricks.slab(EBBlocks.COPPER_BRICK_SLAB);
        generator.family(EBBlocks.WAXED_COPPER_BRICKS);
        copperBricks.stairs(EBBlocks.WAXED_COPPER_BRICK_STAIRS);
        copperBricks.slab(EBBlocks.WAXED_COPPER_BRICK_SLAB);

        BlockModelGenerators.BlockFamilyProvider exposedCopperBricks = generator.family(EBBlocks.EXPOSED_COPPER_BRICKS);
        exposedCopperBricks.stairs(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS);
        exposedCopperBricks.slab(EBBlocks.EXPOSED_COPPER_BRICK_SLAB);
        generator.family(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS);
        exposedCopperBricks.stairs(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS);
        exposedCopperBricks.slab(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB);

        BlockModelGenerators.BlockFamilyProvider weatheredCopperBricks = generator.family(EBBlocks.WEATHERED_COPPER_BRICKS);
        weatheredCopperBricks.stairs(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS);
        weatheredCopperBricks.slab(EBBlocks.WEATHERED_COPPER_BRICK_SLAB);
        generator.family(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS);
        weatheredCopperBricks.stairs(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS);
        weatheredCopperBricks.slab(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB);

        BlockModelGenerators.BlockFamilyProvider oxidizedCopperBricks = generator.family(EBBlocks.OXIDIZED_COPPER_BRICKS);
        oxidizedCopperBricks.stairs(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS);
        oxidizedCopperBricks.slab(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB);
        generator.family(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS);
        oxidizedCopperBricks.stairs(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS);
        oxidizedCopperBricks.slab(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB);

        EBModels.registerVerticalStairs(generator, EBBlocks.COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.COPPER_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.EXPOSED_COPPER_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WEATHERED_COPPER_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.OXIDIZED_COPPER_BRICKS);

        EBModels.registerVerticalStairs(generator, EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.COPPER_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.EXPOSED_COPPER_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WEATHERED_COPPER_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.OXIDIZED_COPPER_BRICKS);

        BlockModelGenerators.BlockFamilyProvider ironBricks = generator.family(EBBlocks.IRON_BRICKS);
        ironBricks.stairs(EBBlocks.IRON_BRICK_STAIRS);
        ironBricks.slab(EBBlocks.IRON_BRICK_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.IRON_BRICK_VERTICAL_STAIRS, EBBlocks.IRON_BRICKS);

        BlockModelGenerators.BlockFamilyProvider goldBricks = generator.family(EBBlocks.GOLD_BRICKS);
        goldBricks.stairs(EBBlocks.GOLD_BRICK_STAIRS);
        goldBricks.slab(EBBlocks.GOLD_BRICK_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.GOLD_BRICK_VERTICAL_STAIRS, EBBlocks.GOLD_BRICKS);

        BlockModelGenerators.BlockFamilyProvider lapisBricks = generator.family(EBBlocks.LAPIS_BRICKS);
        lapisBricks.stairs(EBBlocks.LAPIS_BRICK_STAIRS);
        lapisBricks.slab(EBBlocks.LAPIS_BRICK_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.LAPIS_BRICK_VERTICAL_STAIRS, EBBlocks.LAPIS_BRICKS);

        BlockModelGenerators.BlockFamilyProvider emeraldBricks = generator.family(EBBlocks.EMERALD_BRICKS);
        emeraldBricks.stairs(EBBlocks.EMERALD_BRICK_STAIRS);
        emeraldBricks.slab(EBBlocks.EMERALD_BRICK_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS, EBBlocks.EMERALD_BRICKS);

        BlockModelGenerators.BlockFamilyProvider diamondBricks = generator.family(EBBlocks.DIAMOND_BRICKS);
        diamondBricks.stairs(EBBlocks.DIAMOND_BRICK_STAIRS);
        diamondBricks.slab(EBBlocks.DIAMOND_BRICK_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.DIAMOND_BRICK_VERTICAL_STAIRS, EBBlocks.DIAMOND_BRICKS);

        BlockModelGenerators.BlockFamilyProvider netheriteBricks = generator.family(EBBlocks.NETHERITE_BRICKS);
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

        EBModels.registerVerticalStairs(generator, EBBlocks.MUD_BRICK_VERTICAL_STAIRS, Blocks.MUD_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.COBBLESTONE_BRICK_VERTICAL_STAIRS, EBBlocks.COBBLESTONE_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS, EBBlocks.COBBLED_DEEPSLATE_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.BLACKSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.BLACKSTONE_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS, EBBlocks.MOSSY_COBBLESTONE_BRICKS);

        EBModels.registerVerticalStairs(generator, EBBlocks.ANCIENT_VERTICAL_STAIRS, EBBlocks.ANCIENT_PLANKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.GLOOM_VERTICAL_STAIRS, EBBlocks.GLOOM_PLANKS);

        generator.createTrivialCube(EBBlocks.SEA_GLASS);
        generator.createTrivialCube(EBBlocks.VERDANT_SEA_GLASS);
        generator.createTrivialCube(EBBlocks.ROSE_SEA_GLASS);
        generator.createTrivialCube(EBBlocks.FUCHSIA_SEA_GLASS);
        generator.createTrivialCube(EBBlocks.AQUA_SEA_GLASS);
        generator.createTrivialCube(EBBlocks.SCARLET_SEA_GLASS);

        EBModels.registerSeaGlassPane(generator, EBBlocks.SEA_GLASS_PANE, EBBlocks.SEA_GLASS);
        EBModels.registerSeaGlassPane(generator, EBBlocks.VERDANT_SEA_GLASS_PANE, EBBlocks.VERDANT_SEA_GLASS);
        EBModels.registerSeaGlassPane(generator, EBBlocks.ROSE_SEA_GLASS_PANE, EBBlocks.ROSE_SEA_GLASS);
        EBModels.registerSeaGlassPane(generator, EBBlocks.FUCHSIA_SEA_GLASS_PANE, EBBlocks.FUCHSIA_SEA_GLASS);
        EBModels.registerSeaGlassPane(generator, EBBlocks.AQUA_SEA_GLASS_PANE, EBBlocks.AQUA_SEA_GLASS);
        EBModels.registerSeaGlassPane(generator, EBBlocks.SCARLET_SEA_GLASS_PANE, EBBlocks.SCARLET_SEA_GLASS);

        BlockModelGenerators.BlockFamilyProvider boneBricks = generator.family(EBBlocks.BONE_BRICKS);
        boneBricks.stairs(EBBlocks.BONE_BRICK_STAIRS);
        boneBricks.slab(EBBlocks.BONE_BRICK_SLAB);
        boneBricks.wall(EBBlocks.BONE_BRICK_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.BONE_BRICK_VERTICAL_STAIRS, EBBlocks.BONE_BRICKS);

        for (DyeColor colors : DyeColor.values()) {
            generator.createFullAndCarpetBlocks(EBBlocks.getDyedKnittedWools(colors.getId()), EBBlocks.getDyedKnittedCarpets(colors.getId()));
        }

        generator.createTrivialCube(EBBlocks.SOUL_MAGMA_BLOCK);

        BlockModelGenerators.BlockFamilyProvider polishedSandstone = generator.family(EBBlocks.POLISHED_SANDSTONE);
        polishedSandstone.stairs(EBBlocks.POLISHED_SANDSTONE_STAIRS);
        polishedSandstone.slab(EBBlocks.POLISHED_SANDSTONE_SLAB);
        polishedSandstone.wall(EBBlocks.POLISHED_SANDSTONE_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.POLISHED_SANDSTONE_VERTICAL_STAIRS, EBBlocks.POLISHED_SANDSTONE);

        BlockModelGenerators.BlockFamilyProvider sandstoneBricks = generator.family(EBBlocks.SANDSTONE_BRICKS);
        sandstoneBricks.stairs(EBBlocks.SANDSTONE_BRICK_STAIRS);
        sandstoneBricks.slab(EBBlocks.SANDSTONE_BRICK_SLAB);
        sandstoneBricks.wall(EBBlocks.SANDSTONE_BRICK_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.SANDSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.SANDSTONE_BRICKS);

        BlockModelGenerators.BlockFamilyProvider sandstoneTiles = generator.family(EBBlocks.SANDSTONE_TILES);
        sandstoneTiles.stairs(EBBlocks.SANDSTONE_TILE_STAIRS);
        sandstoneTiles.slab(EBBlocks.SANDSTONE_TILE_SLAB);
        sandstoneTiles.wall(EBBlocks.SANDSTONE_TILE_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.SANDSTONE_TILE_VERTICAL_STAIRS, EBBlocks.SANDSTONE_TILES);

        generator.createTrivialBlock(EBBlocks.CHISELED_SANDSTONE_BRICKS, TexturedModel.COLUMN);
        generator.createTrivialBlock(EBBlocks.DECORATED_SANDSTONE_BRICKS, TexturedModel.COLUMN);
        generator.createTrivialBlock(EBBlocks.ENGRAVED_SANDSTONE_BRICKS, TexturedModel.COLUMN);

        BlockModelGenerators.BlockFamilyProvider polishedRedSandstone = generator.family(EBBlocks.POLISHED_RED_SANDSTONE);
        polishedRedSandstone.stairs(EBBlocks.POLISHED_RED_SANDSTONE_STAIRS);
        polishedRedSandstone.slab(EBBlocks.POLISHED_RED_SANDSTONE_SLAB);
        polishedRedSandstone.wall(EBBlocks.POLISHED_RED_SANDSTONE_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.POLISHED_RED_SANDSTONE_VERTICAL_STAIRS, EBBlocks.POLISHED_RED_SANDSTONE);

        BlockModelGenerators.BlockFamilyProvider sandstoneRedBricks = generator.family(EBBlocks.RED_SANDSTONE_BRICKS);
        sandstoneRedBricks.stairs(EBBlocks.RED_SANDSTONE_BRICK_STAIRS);
        sandstoneRedBricks.slab(EBBlocks.RED_SANDSTONE_BRICK_SLAB);
        sandstoneRedBricks.wall(EBBlocks.RED_SANDSTONE_BRICK_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.RED_SANDSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.RED_SANDSTONE_BRICKS);

        BlockModelGenerators.BlockFamilyProvider sandstoneRedTiles = generator.family(EBBlocks.RED_SANDSTONE_TILES);
        sandstoneRedTiles.stairs(EBBlocks.RED_SANDSTONE_TILE_STAIRS);
        sandstoneRedTiles.slab(EBBlocks.RED_SANDSTONE_TILE_SLAB);
        sandstoneRedTiles.wall(EBBlocks.RED_SANDSTONE_TILE_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.RED_SANDSTONE_TILE_VERTICAL_STAIRS, EBBlocks.RED_SANDSTONE_TILES);

        generator.createTrivialBlock(EBBlocks.CHISELED_RED_SANDSTONE_BRICKS, TexturedModel.COLUMN);
        generator.createTrivialBlock(EBBlocks.DECORATED_RED_SANDSTONE_BRICKS, TexturedModel.COLUMN);
        generator.createTrivialBlock(EBBlocks.ENGRAVED_RED_SANDSTONE_BRICKS, TexturedModel.COLUMN);

        BlockModelGenerators.BlockFamilyProvider polishedSoulSandstone = generator.family(EBBlocks.POLISHED_SOUL_SANDSTONE);
        polishedSoulSandstone.stairs(EBBlocks.POLISHED_SOUL_SANDSTONE_STAIRS);
        polishedSoulSandstone.slab(EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB);
        polishedSoulSandstone.wall(EBBlocks.POLISHED_SOUL_SANDSTONE_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS, EBBlocks.POLISHED_SOUL_SANDSTONE);

        BlockModelGenerators.BlockFamilyProvider sandstoneSoulBricks = generator.family(EBBlocks.SOUL_SANDSTONE_BRICKS);
        sandstoneSoulBricks.stairs(EBBlocks.SOUL_SANDSTONE_BRICK_STAIRS);
        sandstoneSoulBricks.slab(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB);
        sandstoneSoulBricks.wall(EBBlocks.SOUL_SANDSTONE_BRICK_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.SOUL_SANDSTONE_BRICKS);

        BlockModelGenerators.BlockFamilyProvider sandstoneSoulTiles = generator.family(EBBlocks.SOUL_SANDSTONE_TILES);
        sandstoneSoulTiles.stairs(EBBlocks.SOUL_SANDSTONE_TILE_STAIRS);
        sandstoneSoulTiles.slab(EBBlocks.SOUL_SANDSTONE_TILE_SLAB);
        sandstoneSoulTiles.wall(EBBlocks.SOUL_SANDSTONE_TILE_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.SOUL_SANDSTONE_TILE_VERTICAL_STAIRS, EBBlocks.SOUL_SANDSTONE_TILES);

        generator.createTrivialBlock(EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS, TexturedModel.COLUMN);
        generator.createTrivialBlock(EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS, TexturedModel.COLUMN);
        generator.createTrivialBlock(EBBlocks.ENGRAVED_SOUL_SANDSTONE_BRICKS, TexturedModel.COLUMN);

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

        generator.createCraftingTableLike(EBBlocks.SPRUCE_CRAFTING_TABLE, Blocks.SPRUCE_PLANKS, TextureMapping::craftingTable);
        generator.createCraftingTableLike(EBBlocks.BIRCH_CRAFTING_TABLE, Blocks.BIRCH_PLANKS, TextureMapping::craftingTable);
        generator.createCraftingTableLike(EBBlocks.JUNGLE_CRAFTING_TABLE, Blocks.JUNGLE_PLANKS, TextureMapping::craftingTable);
        generator.createCraftingTableLike(EBBlocks.ACACIA_CRAFTING_TABLE, Blocks.ACACIA_PLANKS, TextureMapping::craftingTable);
        generator.createCraftingTableLike(EBBlocks.DARK_OAK_CRAFTING_TABLE, Blocks.DARK_OAK_PLANKS, TextureMapping::craftingTable);
        generator.createCraftingTableLike(EBBlocks.MANGROVE_CRAFTING_TABLE, Blocks.MANGROVE_PLANKS, TextureMapping::craftingTable);
        generator.createCraftingTableLike(EBBlocks.CHERRY_CRAFTING_TABLE, Blocks.CHERRY_PLANKS, TextureMapping::craftingTable);
        generator.createCraftingTableLike(EBBlocks.BAMBOO_CRAFTING_TABLE, Blocks.BAMBOO_PLANKS, TextureMapping::craftingTable);
        generator.createCraftingTableLike(EBBlocks.CRIMSON_CRAFTING_TABLE, Blocks.CRIMSON_PLANKS, TextureMapping::craftingTable);
        generator.createCraftingTableLike(EBBlocks.WARPED_CRAFTING_TABLE, Blocks.WARPED_PLANKS, TextureMapping::craftingTable);
        generator.createCraftingTableLike(EBBlocks.ANCIENT_CRAFTING_TABLE, EBBlocks.ANCIENT_PLANKS, TextureMapping::craftingTable);
        generator.createCraftingTableLike(EBBlocks.GLOOM_CRAFTING_TABLE, EBBlocks.GLOOM_PLANKS, TextureMapping::craftingTable);

        EBModels.registerMug(generator, EBBlocks.WOODEN_MUG);

        BlockModelGenerators.BlockFamilyProvider quartzBricks = generator.family(Blocks.QUARTZ_BRICKS);
        quartzBricks.stairs(EBBlocks.QUARTZ_BRICK_STAIRS);
        quartzBricks.slab(EBBlocks.QUARTZ_BRICK_SLAB);
        quartzBricks.wall(EBBlocks.QUARTZ_BRICK_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.QUARTZ_BRICK_VERTICAL_STAIRS, Blocks.QUARTZ_BRICKS);

        for (DyeColor colors : DyeColor.values()) {
            BlockModelGenerators.BlockFamilyProvider dyedTerracottaTiles = generator.family(EBBlocks.getDyedTerracottaTiles(colors.getId()));
            dyedTerracottaTiles.stairs(EBBlocks.getDyedTerracottaTileStairs(colors.getId()));
            dyedTerracottaTiles.slab(EBBlocks.getDyedTerracottaTileSlab(colors.getId()));
            EBModels.registerVerticalStairs(generator, EBBlocks.getDyedTerracottaTileVerticalStairs(colors.getId()), EBBlocks.getDyedTerracottaTiles(colors.getId()));
        }

        BlockModelGenerators.BlockFamilyProvider terracottaTiles = generator.family(EBBlocks.TERRACOTTA_TILES);
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

        EBModels.registerVerticalStairs(generator, EBBlocks.CUT_COPPER_VERTICAL_STAIRS, Blocks.CUT_COPPER);
        EBModels.registerVerticalStairs(generator, EBBlocks.EXPOSED_CUT_COPPER_VERTICAL_STAIRS, Blocks.EXPOSED_CUT_COPPER);
        EBModels.registerVerticalStairs(generator, EBBlocks.WEATHERED_CUT_COPPER_VERTICAL_STAIRS, Blocks.WEATHERED_CUT_COPPER);
        EBModels.registerVerticalStairs(generator, EBBlocks.OXIDIZED_CUT_COPPER_VERTICAL_STAIRS, Blocks.OXIDIZED_CUT_COPPER);

        EBModels.registerVerticalStairs(generator, EBBlocks.WAXED_CUT_COPPER_VERTICAL_STAIRS, Blocks.CUT_COPPER);
        EBModels.registerVerticalStairs(generator, EBBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_STAIRS, Blocks.EXPOSED_CUT_COPPER);
        EBModels.registerVerticalStairs(generator, EBBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_STAIRS, Blocks.WEATHERED_CUT_COPPER);
        EBModels.registerVerticalStairs(generator, EBBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_STAIRS, Blocks.OXIDIZED_CUT_COPPER);

        EBModels.registerTintableCrossWithoutItem(generator, EBBlocks.GLOOM_SEEDS, BlockModelGenerators.TintState.NOT_TINTED);

        BlockModelGenerators.BlockFamilyProvider graniteBricks = generator.family(EBBlocks.GRANITE_BRICKS);
        graniteBricks.stairs(EBBlocks.GRANITE_BRICK_STAIRS);
        graniteBricks.slab(EBBlocks.GRANITE_BRICK_SLAB);
        graniteBricks.wall(EBBlocks.GRANITE_BRICK_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.GRANITE_BRICK_VERTICAL_STAIRS, EBBlocks.GRANITE_BRICKS);

        BlockModelGenerators.BlockFamilyProvider dioriteBricks = generator.family(EBBlocks.DIORITE_BRICKS);
        dioriteBricks.stairs(EBBlocks.DIORITE_BRICK_STAIRS);
        dioriteBricks.slab(EBBlocks.DIORITE_BRICK_SLAB);
        dioriteBricks.wall(EBBlocks.DIORITE_BRICK_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.DIORITE_BRICK_VERTICAL_STAIRS, EBBlocks.DIORITE_BRICKS);

        BlockModelGenerators.BlockFamilyProvider andesiteBricks = generator.family(EBBlocks.ANDESITE_BRICKS);
        andesiteBricks.stairs(EBBlocks.ANDESITE_BRICK_STAIRS);
        andesiteBricks.slab(EBBlocks.ANDESITE_BRICK_SLAB);
        andesiteBricks.wall(EBBlocks.ANDESITE_BRICK_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.ANDESITE_BRICK_VERTICAL_STAIRS, EBBlocks.ANDESITE_BRICKS);

        BlockModelGenerators.BlockFamilyProvider smoothBricks = generator.family(EBBlocks.SMOOTH_BRICKS);
        smoothBricks.stairs(EBBlocks.SMOOTH_BRICK_STAIRS);
        smoothBricks.slab(EBBlocks.SMOOTH_BRICK_SLAB);
        smoothBricks.wall(EBBlocks.SMOOTH_BRICK_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.SMOOTH_BRICK_VERTICAL_STAIRS, EBBlocks.SMOOTH_BRICKS);

        generator.createTrivialCube(EBBlocks.HERRINGBONE_BRICKS);
        generator.createTrivialCube(EBBlocks.SMOOTH_HERRINGBONE_BRICKS);
        generator.createTrivialCube(EBBlocks.CRACKED_BRICKS);
        generator.createTrivialCube(EBBlocks.CRACKED_SMOOTH_BRICKS);

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

        generator.createTrivialCube(EBBlocks.BRIMSTONE_WINDOW);
        generator.createTrivialCube(EBBlocks.BRIMSTONE_LAMP);
        generator.createRotatedPillarWithHorizontalVariant(EBBlocks.BRIMSTONE_PILLAR, TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL_ALT);

        BlockModelGenerators.BlockFamilyProvider brimstone = generator.family(EBBlocks.BRIMSTONE);
        brimstone.stairs(EBBlocks.BRIMSTONE_STAIRS);
        brimstone.slab(EBBlocks.BRIMSTONE_SLAB);
        brimstone.wall(EBBlocks.BRIMSTONE_WALL);
        EBModels.registerVerticalStairs(generator, EBBlocks.BRIMSTONE_VERTICAL_STAIRS, EBBlocks.BRIMSTONE);

        BlockModelGenerators.BlockFamilyProvider brimstoneBricks = generator.family(EBBlocks.BRIMSTONE_BRICKS);
        brimstoneBricks.stairs(EBBlocks.BRIMSTONE_BRICK_STAIRS);
        brimstoneBricks.slab(EBBlocks.BRIMSTONE_BRICK_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.BRIMSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.BRIMSTONE_BRICKS);

        BlockModelGenerators.BlockFamilyProvider brimstoneTiles = generator.family(EBBlocks.BRIMSTONE_TILES);
        brimstoneTiles.stairs(EBBlocks.BRIMSTONE_TILE_STAIRS);
        brimstoneTiles.slab(EBBlocks.BRIMSTONE_TILE_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.BRIMSTONE_TILE_VERTICAL_STAIRS, EBBlocks.BRIMSTONE_TILES);

        BlockModelGenerators.BlockFamilyProvider polishedBrimstone = generator.family(EBBlocks.POLISHED_BRIMSTONE);
        polishedBrimstone.stairs(EBBlocks.POLISHED_BRIMSTONE_STAIRS);
        polishedBrimstone.slab(EBBlocks.POLISHED_BRIMSTONE_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.POLISHED_BRIMSTONE_VERTICAL_STAIRS, EBBlocks.POLISHED_BRIMSTONE);

        BlockModelGenerators.BlockFamilyProvider asphalt = generator.family(EBBlocks.ASPHALT);
        asphalt.stairs(EBBlocks.ASPHALT_STAIRS);
        asphalt.slab(EBBlocks.ASPHALT_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.ASPHALT_VERTICAL_STAIRS, EBBlocks.ASPHALT);

        generator.createPlant(EBBlocks.ROSE, EBBlocks.POTTED_ROSE, BlockModelGenerators.TintState.NOT_TINTED);
        generator.createPlant(EBBlocks.CYAN_ROSE, EBBlocks.POTTED_CYAN_ROSE, BlockModelGenerators.TintState.NOT_TINTED);
        generator.createPlant(EBBlocks.WHITE_ROSE, EBBlocks.POTTED_WHITE_ROSE, BlockModelGenerators.TintState.NOT_TINTED);

        generator.createTrivialCube(EBBlocks.CRACKED_DIORITE_BRICKS);
        generator.createTrivialCube(EBBlocks.CRACKED_MUD_BRICKS);
        generator.createTrivialCube(EBBlocks.CRACKED_GRANITE_BRICKS);
        generator.createTrivialCube(EBBlocks.CRACKED_BRIMSTONE_BRICKS);
        generator.createTrivialCube(EBBlocks.CRACKED_ANDESITE_BRICKS);

        BlockModelGenerators.BlockFamilyProvider redstoneBricks = generator.family(EBBlocks.REDSTONE_BRICKS);
        redstoneBricks.stairs(EBBlocks.REDSTONE_BRICK_STAIRS);
        redstoneBricks.slab(EBBlocks.REDSTONE_BRICK_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.REDSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.REDSTONE_BRICKS);

        BlockModelGenerators.BlockFamilyProvider polishedStone = generator.family(EBBlocks.POLISHED_STONE);
        polishedStone.stairs(EBBlocks.POLISHED_STONE_STAIRS);
        polishedStone.slab(EBBlocks.POLISHED_STONE_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.POLISHED_STONE_VERTICAL_STAIRS, EBBlocks.POLISHED_STONE);

        BlockModelGenerators.BlockFamilyProvider smoothStoneBricks = generator.family(EBBlocks.SMOOTH_STONE_BRICKS);
        smoothStoneBricks.stairs(EBBlocks.SMOOTH_STONE_BRICK_STAIRS);
        smoothStoneBricks.slab(EBBlocks.SMOOTH_STONE_BRICK_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.SMOOTH_STONE_BRICK_VERTICAL_STAIRS, EBBlocks.SMOOTH_STONE_BRICKS);
        generator.createTrivialCube(EBBlocks.CRACKED_SMOOTH_STONE_BRICKS);

        BlockModelGenerators.BlockFamilyProvider smoothStoneTiles = generator.family(EBBlocks.SMOOTH_STONE_TILES);
        smoothStoneTiles.stairs(EBBlocks.SMOOTH_STONE_TILE_STAIRS);
        smoothStoneTiles.slab(EBBlocks.SMOOTH_STONE_TILE_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.SMOOTH_STONE_TILE_VERTICAL_STAIRS, EBBlocks.SMOOTH_STONE_TILES);
        generator.createTrivialCube(EBBlocks.CRACKED_SMOOTH_STONE_TILES);

        generator.createRotatedPillarWithHorizontalVariant(EBBlocks.SMOOTH_STONE_PILLAR, TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL_ALT);
        generator.createTrivialCube(EBBlocks.CHISELED_SMOOTH_STONE_BRICKS);

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

        EBModels.registerParticleCandle(generator, EBBlocks.WEEPING_CANDLE);
        EBModels.registerParticleCandle(generator, EBBlocks.TWISTING_CANDLE);

        generator.createTrivialCube(EBBlocks.GLOOM_LEAVES);
        generator.createPlant(EBBlocks.GLOOM_SAPLING, EBBlocks.POTTED_GLOOM_SAPLING, BlockModelGenerators.TintState.NOT_TINTED);

        EBModels.registerAlmentraStatueState(generator, EBBlocks.ALMENTRA_STATUE, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, "block/almentra_statue"),
                ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, "block/almentra_statue_diagonal"));

        for (DyeColor colors : DyeColor.values()) {
            EBModels.registerAlmentraStatueState(generator, EBBlocks.getDyedAlmentraStatues(colors.getId()),
                    ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, "block/" + colors.getName() + "_almentra_statue"),
                    ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, "block/" + colors.getName() + "_almentra_statue_diagonal"));
        }

        BlockModelGenerators.BlockFamilyProvider almentra = generator.family(EBBlocks.ALMENTRA);
        almentra.stairs(EBBlocks.ALMENTRA_STAIRS);
        almentra.slab(EBBlocks.ALMENTRA_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.ALMENTRA_VERTICAL_STAIRS, EBBlocks.ALMENTRA);

        BlockModelGenerators.BlockFamilyProvider polishedAlmentra = generator.family(EBBlocks.POLISHED_ALMENTRA);
        polishedAlmentra.stairs(EBBlocks.POLISHED_ALMENTRA_STAIRS);
        polishedAlmentra.slab(EBBlocks.POLISHED_ALMENTRA_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.POLISHED_ALMENTRA_VERTICAL_STAIRS, EBBlocks.POLISHED_ALMENTRA);

        BlockModelGenerators.BlockFamilyProvider almentraBricks = generator.family(EBBlocks.ALMENTRA_BRICKS);
        almentraBricks.stairs(EBBlocks.ALMENTRA_BRICK_STAIRS);
        almentraBricks.slab(EBBlocks.ALMENTRA_BRICK_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.ALMENTRA_BRICK_VERTICAL_STAIRS, EBBlocks.ALMENTRA_BRICKS);

        for (DyeColor colors : DyeColor.values()) {
            BlockModelGenerators.BlockFamilyProvider dyedAlmentra = generator.family(EBBlocks.getDyedAlmentra(colors.getId()));
            dyedAlmentra.stairs(EBBlocks.getDyedAlmentraStairs(colors.getId()));
            dyedAlmentra.slab(EBBlocks.getDyedAlmentraSlab(colors.getId()));
            EBModels.registerVerticalStairs(generator, EBBlocks.getDyedAlmentraVerticalStairs(colors.getId()), EBBlocks.getDyedAlmentra(colors.getId()));
        }

        for (DyeColor colors : DyeColor.values()) {
            BlockModelGenerators.BlockFamilyProvider dyedPolishedAlmentra = generator.family(EBBlocks.getDyedPolishedAlmentra(colors.getId()));
            dyedPolishedAlmentra.stairs(EBBlocks.getDyedPolishedAlmentraStairs(colors.getId()));
            dyedPolishedAlmentra.slab(EBBlocks.getDyedPolishedAlmentraSlab(colors.getId()));
            EBModels.registerVerticalStairs(generator, EBBlocks.getDyedPolishedAlmentraVerticalStairs(colors.getId()), EBBlocks.getDyedPolishedAlmentra(colors.getId()));
        }

        for (DyeColor colors : DyeColor.values()) {
            BlockModelGenerators.BlockFamilyProvider dyedAlmentraBricks = generator.family(EBBlocks.getDyedAlmentraBricks(colors.getId()));
            dyedAlmentraBricks.stairs(EBBlocks.getDyedAlmentraBrickStairs(colors.getId()));
            dyedAlmentraBricks.slab(EBBlocks.getDyedAlmentraBrickSlab(colors.getId()));
            EBModels.registerVerticalStairs(generator, EBBlocks.getDyedAlmentraBrickVerticalStairs(colors.getId()), EBBlocks.getDyedAlmentraBricks(colors.getId()));
        }

        generator.createMultiface(EBBlocks.MOSS_PASTE);

//        generator.registerBuiltin(EBModels.getEBNamespacedBlock("spruce_chest"),
//                Blocks.SPRUCE_PLANKS).includeWithoutItem(EBBlocks.SPRUCE_CHEST, EBBlocks.TRAPPED_SPRUCE_CHEST);
//
//        generator.registerBuiltin(EBModels.getEBNamespacedBlock("birch_chest"),
//                Blocks.BIRCH_PLANKS).includeWithoutItem(EBBlocks.BIRCH_CHEST, EBBlocks.TRAPPED_BIRCH_CHEST);
//
//        generator.registerBuiltin(EBModels.getEBNamespacedBlock("jungle_chest"),
//                Blocks.JUNGLE_PLANKS).includeWithoutItem(EBBlocks.JUNGLE_CHEST, EBBlocks.TRAPPED_JUNGLE_CHEST);
//
//        generator.registerBuiltin(EBModels.getEBNamespacedBlock("acacia_chest"),
//                Blocks.ACACIA_PLANKS).includeWithoutItem(EBBlocks.ACACIA_CHEST, EBBlocks.TRAPPED_ACACIA_CHEST);
//
//        generator.registerBuiltin(EBModels.getEBNamespacedBlock("dark_oak_chest"),
//                Blocks.DARK_OAK_PLANKS).includeWithoutItem(EBBlocks.DARK_OAK_CHEST, EBBlocks.TRAPPED_DARK_OAK_CHEST);
//
//        generator.registerBuiltin(EBModels.getEBNamespacedBlock("mangrove_chest"),
//                Blocks.MANGROVE_PLANKS).includeWithoutItem(EBBlocks.MANGROVE_CHEST, EBBlocks.TRAPPED_MANGROVE_CHEST);
//
//        generator.registerBuiltin(EBModels.getEBNamespacedBlock("cherry_chest"),
//                Blocks.CHERRY_PLANKS).includeWithoutItem(EBBlocks.CHERRY_CHEST, EBBlocks.TRAPPED_CHERRY_CHEST);
//
//        generator.registerBuiltin(EBModels.getEBNamespacedBlock("bamboo_chest"),
//                Blocks.BAMBOO_PLANKS).includeWithoutItem(EBBlocks.BAMBOO_CHEST, EBBlocks.TRAPPED_BAMBOO_CHEST);
//
//        generator.registerBuiltin(EBModels.getEBNamespacedBlock("crimson_chest"),
//                Blocks.CRIMSON_PLANKS).includeWithoutItem(EBBlocks.CRIMSON_CHEST, EBBlocks.TRAPPED_CRIMSON_CHEST);
//
//        generator.registerBuiltin(EBModels.getEBNamespacedBlock("warped_chest"),
//                Blocks.WARPED_PLANKS).includeWithoutItem(EBBlocks.WARPED_CHEST, EBBlocks.TRAPPED_WARPED_CHEST);
//
//        generator.registerBuiltin(EBModels.getEBNamespacedBlock("ancient_chest"),
//                EBBlocks.ANCIENT_PLANKS).includeWithoutItem(EBBlocks.ANCIENT_CHEST, EBBlocks.TRAPPED_ANCIENT_CHEST);
//
//        generator.registerBuiltin(EBModels.getEBNamespacedBlock("gloom_chest"),
//                EBBlocks.GLOOM_PLANKS).includeWithoutItem(EBBlocks.GLOOM_CHEST, EBBlocks.TRAPPED_GLOOM_CHEST);

        generator.family(EBBlocks.PAPER_BLOCK);
        
        BlockModelGenerators.BlockFamilyProvider thinPaper = generator.family(EBBlocks.THIN_PAPER_BLOCK);
        thinPaper.stairs(EBBlocks.THIN_PAPER_STAIRS);
        thinPaper.slab(EBBlocks.THIN_PAPER_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.THIN_PAPER_VERTICAL_STAIRS, EBBlocks.THIN_PAPER_BLOCK);
        generator.family(EBBlocks.THIN_DIVIDED_PAPER_BLOCK);

        BlockModelGenerators.BlockFamilyProvider thickPaper = generator.family(EBBlocks.THICK_PAPER_BLOCK);
        thickPaper.stairs(EBBlocks.THICK_PAPER_STAIRS);
        thickPaper.slab(EBBlocks.THICK_PAPER_SLAB);
        EBModels.registerVerticalStairs(generator, EBBlocks.THICK_PAPER_VERTICAL_STAIRS, EBBlocks.THICK_PAPER_BLOCK);
        generator.family(EBBlocks.THICK_DIVIDED_PAPER_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator) {
        generator.generateFlatItem(EBItems.ANCIENT_FRUIT, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.ANCIENT_SIGN, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.GLOOM_SIGN, ModelTemplates.FLAT_ITEM);

        generator.generateFlatItem(EBItems.ROYALTY_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.ANCIENT_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.BITTER_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.BOIN_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.BUSTLING_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.CHECKERED_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.DECAY_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.DESTRUCTION_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.FORWARDS_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.HEXXED_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.KITTEH_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.LIFE_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.MESMERIZE_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.PORTAL_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.POTTERY_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.RING_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.SNOUT_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.SPRITE_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.TWINS_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.WRATHFUL_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.IS_THAT_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.KOKOS_BUG_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.THIEF_POTTERY_SHERD, ModelTemplates.FLAT_ITEM);

        generator.generateFlatItem(EBBlocks.SPRUCE_LADDER.asItem(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBBlocks.BIRCH_LADDER.asItem(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBBlocks.JUNGLE_LADDER.asItem(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBBlocks.ACACIA_LADDER.asItem(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBBlocks.DARK_OAK_LADDER.asItem(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBBlocks.MANGROVE_LADDER.asItem(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBBlocks.CHERRY_LADDER.asItem(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBBlocks.BAMBOO_LADDER.asItem(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBBlocks.CRIMSON_LADDER.asItem(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBBlocks.WARPED_LADDER.asItem(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBBlocks.ANCIENT_LADDER.asItem(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBBlocks.GLOOM_LADDER.asItem(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBBlocks.GLOOM_SEEDS.asItem(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBBlocks.WEEPING_CANDLE.asItem(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBBlocks.TWISTING_CANDLE.asItem(), ModelTemplates.FLAT_ITEM);
    }

    public static class EBModels {
        @Deprecated
        public static ResourceLocation getEBNamespacedBlock(String id) {
            return ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, "block/" + id);
        }
        
        public static final ModelTemplate VERTICAL_STAIRS = new ModelTemplate(Optional.of(ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, "template_vertical_stairs")
                .withPrefix("block/")), Optional.empty(), TextureSlot.TEXTURE, TextureSlot.PARTICLE);

        public static final ModelTemplate SEA_GLASS_PANE = new ModelTemplate(Optional.of(ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, "template_sea_glass_pane")
                .withPrefix("block/")), Optional.empty(), TextureSlot.TEXTURE, TextureSlot.PARTICLE);

        public static final ModelTemplate LADDER = new ModelTemplate(Optional.of(ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, "template_ladder")
                .withPrefix("block/")), Optional.empty(), TextureSlot.TEXTURE, TextureSlot.PARTICLE);

        public static final ModelTemplate MUG = new ModelTemplate(Optional.of(ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, "template_mug")
                .withPrefix("block/")), Optional.empty(), TextureSlot.TEXTURE, TextureSlot.PARTICLE);

        public static final ModelTemplate PARTICLE_CANDLE = new ModelTemplate(Optional.of(ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, "template_particle_candle")
                .withPrefix("block/")), Optional.empty(), TextureSlot.TEXTURE, TextureSlot.PARTICLE);

        public static void registerAlmentraStatueState(BlockModelGenerators generator, Block statue, ResourceLocation model, ResourceLocation diagonalModel) {
            generator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(statue).with(PropertyDispatch.property(AlmentraStatueBlock.ROTATION)
                    .select(0, Variant.variant().with(VariantProperties.MODEL, model).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R0))
                    .select(1, Variant.variant().with(VariantProperties.MODEL, model).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R0))
                    .select(2, Variant.variant().with(VariantProperties.MODEL, diagonalModel).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R0))
                    .select(3, Variant.variant().with(VariantProperties.MODEL, diagonalModel).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R0))
                    .select(4, Variant.variant().with(VariantProperties.MODEL, model).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
                    .select(5, Variant.variant().with(VariantProperties.MODEL, model).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
                    .select(6, Variant.variant().with(VariantProperties.MODEL, diagonalModel).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
                    .select(7, Variant.variant().with(VariantProperties.MODEL, diagonalModel).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
                    .select(8, Variant.variant().with(VariantProperties.MODEL, model).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
                    .select(9, Variant.variant().with(VariantProperties.MODEL, model).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
                    .select(10, Variant.variant().with(VariantProperties.MODEL, diagonalModel).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
                    .select(11, Variant.variant().with(VariantProperties.MODEL, diagonalModel).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
                    .select(12, Variant.variant().with(VariantProperties.MODEL, model).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270))
                    .select(13, Variant.variant().with(VariantProperties.MODEL, model).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270))
                    .select(14, Variant.variant().with(VariantProperties.MODEL, diagonalModel).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270))
                    .select(15, Variant.variant().with(VariantProperties.MODEL, diagonalModel).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270))
            ));
        }

        public static void registerParticleCandle(BlockModelGenerators generator, Block particleCandle) {
            TextureMapping textureMap = TextureMapping.cube(TextureMapping.getBlockTexture(particleCandle));
            TextureMapping textureMapLit = TextureMapping.cube(TextureMapping.getBlockTexture(particleCandle, "_lit"));
            generator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(particleCandle).with(PropertyDispatch.property(BlockStateProperties.LIT)
            .select(Boolean.FALSE, Variant.variant().with(VariantProperties.MODEL, PARTICLE_CANDLE.create(particleCandle, textureMap, generator.modelOutput)))
            .select(Boolean.TRUE, Variant.variant().with(VariantProperties.MODEL, PARTICLE_CANDLE.createWithOverride(particleCandle, "_lit", textureMapLit, generator.modelOutput)))));
        }

        private static void registerEBBookshelf(BlockModelGenerators generator, Block bookshelf, Block planks) {
            TextureMapping textureMap = TextureMapping.column(TextureMapping.getBlockTexture(bookshelf), TextureMapping.getBlockTexture(planks));
            ResourceLocation model = ModelTemplates.CUBE_COLUMN.create(bookshelf, textureMap, generator.modelOutput);
            generator.blockStateOutput.accept(generator.createSimpleBlock(bookshelf, model));
        }

        private static void registerDecorativeShelfModel(BlockModelGenerators generator, Block bookshelf, String variant, Block planks) {
            TextureMapping textureMap = TextureMapping.column(TextureMapping.getBlockTexture(bookshelf, variant), TextureMapping.getBlockTexture(planks));
            ResourceLocation identifier = ModelTemplates.CUBE_COLUMN.createWithSuffix(bookshelf, variant, textureMap, generator.modelOutput);
        }

        public static void registerTintableCrossWithoutItem(BlockModelGenerators generator, Block block, BlockModelGenerators.TintState tintType) {
            generator.createCrossBlock(block, tintType);
        }

        public static void registerVerticalStairs(BlockModelGenerators generator, Block verticalStairs, Block texture) {
            ResourceLocation model = VERTICAL_STAIRS.create(verticalStairs, TextureMapping.defaultTexture(texture), generator.modelOutput);
            generator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(verticalStairs).with(PropertyDispatch.property(BlockStateProperties.HORIZONTAL_FACING)
                    .select(Direction.NORTH, Variant.variant().with(VariantProperties.MODEL, model)
                            .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R0).with(VariantProperties.UV_LOCK, true))
                    .select(Direction.EAST, Variant.variant().with(VariantProperties.MODEL, model)
                            .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true))
                    .select(Direction.WEST, Variant.variant().with(VariantProperties.MODEL, model)
                            .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true))
                    .select(Direction.SOUTH, Variant.variant().with(VariantProperties.MODEL, model)
                            .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true))));
        }

        public static void registerMug(BlockModelGenerators generator, Block mug) {
            ResourceLocation model = MUG.create(mug, TextureMapping.defaultTexture(mug), generator.modelOutput);
            generator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(mug).with(PropertyDispatch.property(BlockStateProperties.HORIZONTAL_FACING)
                    .select(Direction.NORTH, Variant.variant().with(VariantProperties.MODEL, model)
                            .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R0).with(VariantProperties.UV_LOCK, false))
                    .select(Direction.EAST, Variant.variant().with(VariantProperties.MODEL, model)
                            .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, false))
                    .select(Direction.WEST, Variant.variant().with(VariantProperties.MODEL, model)
                            .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, false))
                    .select(Direction.SOUTH, Variant.variant().with(VariantProperties.MODEL, model)
                            .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, false))));
        }

            public static void registerSeaGlassPane(BlockModelGenerators generator, Block seaGlass, Block texture) {
                ResourceLocation model = SEA_GLASS_PANE.create(seaGlass, TextureMapping.defaultTexture(texture), generator.modelOutput);
                generator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(seaGlass).with(PropertyDispatch.property(BlockStateProperties.HORIZONTAL_FACING)
                        .select(Direction.NORTH, Variant.variant().with(VariantProperties.MODEL, model)
                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R0).with(VariantProperties.UV_LOCK, true))
                        .select(Direction.EAST, Variant.variant().with(VariantProperties.MODEL, model)
                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true))
                        .select(Direction.WEST, Variant.variant().with(VariantProperties.MODEL, model)
                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true))
                        .select(Direction.SOUTH, Variant.variant().with(VariantProperties.MODEL, model)
                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true))));
        }

        public static void registerLadder(BlockModelGenerators generator, Block ladder) {
            ResourceLocation model = LADDER.create(ladder, TextureMapping.defaultTexture(ladder), generator.modelOutput);
            generator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(ladder).with(PropertyDispatch.property(BlockStateProperties.HORIZONTAL_FACING)
                    .select(Direction.NORTH, Variant.variant().with(VariantProperties.MODEL, model)
                            .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R0).with(VariantProperties.UV_LOCK, true))
                    .select(Direction.EAST, Variant.variant().with(VariantProperties.MODEL, model)
                            .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true))
                    .select(Direction.WEST, Variant.variant().with(VariantProperties.MODEL, model)
                            .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true))
                    .select(Direction.SOUTH, Variant.variant().with(VariantProperties.MODEL, model)
                            .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true))));
        }
    }
}
