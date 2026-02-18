package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TexturedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.yirmiri.excessive_building.core.registry.EBBlocks;
import net.yirmiri.excessive_building.core.registry.EBItems;

public class EBModelProvider extends FabricModelProvider {
    public EBModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {
        BlockModelGenerators.BlockFamilyProvider copperBricks = generator.family(EBBlocks.COPPER_BRICKS.get());
        copperBricks.stairs(EBBlocks.COPPER_BRICK_STAIRS.get());
        copperBricks.slab(EBBlocks.COPPER_BRICK_SLAB.get());
        BlockModelGenerators.BlockFamilyProvider copperBricksWax = copperBricks.donateModelTo(EBBlocks.COPPER_BRICKS.get(), EBBlocks.WAXED_COPPER_BRICKS.get());
        copperBricksWax.stairs(EBBlocks.WAXED_COPPER_BRICK_STAIRS.get());
        copperBricksWax.slab(EBBlocks.WAXED_COPPER_BRICK_SLAB.get());

        BlockModelGenerators.BlockFamilyProvider exposedCopperBricks = generator.family(EBBlocks.EXPOSED_COPPER_BRICKS.get());
        exposedCopperBricks.stairs(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS.get());
        exposedCopperBricks.slab(EBBlocks.EXPOSED_COPPER_BRICK_SLAB.get());
        BlockModelGenerators.BlockFamilyProvider exposedCopperBricksWax = exposedCopperBricks.donateModelTo(EBBlocks.EXPOSED_COPPER_BRICKS.get(), EBBlocks.WAXED_EXPOSED_COPPER_BRICKS.get());
        exposedCopperBricksWax.stairs(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS.get());
        exposedCopperBricksWax.slab(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB.get());

        BlockModelGenerators.BlockFamilyProvider weatheredCopperBricks = generator.family(EBBlocks.WEATHERED_COPPER_BRICKS.get());
        weatheredCopperBricks.stairs(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS.get());
        weatheredCopperBricks.slab(EBBlocks.WEATHERED_COPPER_BRICK_SLAB.get());
        BlockModelGenerators.BlockFamilyProvider weatheredCopperBricksWax = weatheredCopperBricks.donateModelTo(EBBlocks.WEATHERED_COPPER_BRICKS.get(), EBBlocks.WAXED_WEATHERED_COPPER_BRICKS.get());
        weatheredCopperBricksWax.stairs(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS.get());
        weatheredCopperBricksWax.slab(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB.get());

        BlockModelGenerators.BlockFamilyProvider oxidizedCopperBricks = generator.family(EBBlocks.OXIDIZED_COPPER_BRICKS.get());
        oxidizedCopperBricks.stairs(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS.get());
        oxidizedCopperBricks.slab(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB.get());
        BlockModelGenerators.BlockFamilyProvider oxidizedCopperBricksWax = oxidizedCopperBricks.donateModelTo(EBBlocks.OXIDIZED_COPPER_BRICKS.get(), EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS.get());
        oxidizedCopperBricksWax.stairs(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS.get());
        oxidizedCopperBricksWax.slab(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB.get());

        BlockModelGenerators.BlockFamilyProvider cobblestoneBricks = generator.family(EBBlocks.COBBLESTONE_BRICKS.get());
        cobblestoneBricks.stairs(EBBlocks.COBBLESTONE_BRICK_STAIRS.get());
        cobblestoneBricks.slab(EBBlocks.COBBLESTONE_BRICK_SLAB.get());
        cobblestoneBricks.wall(EBBlocks.COBBLESTONE_BRICK_WALL.get());

        generator.createTrivialCube(EBBlocks.CRACKED_COBBLESTONE_BRICKS.get());

        BlockModelGenerators.BlockFamilyProvider coralsoilBricks = generator.family(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICKS.get());
        coralsoilBricks.stairs(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICK_STAIRS.get());
        coralsoilBricks.slab(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICK_SLAB.get());
        coralsoilBricks.wall(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICK_WALL.get());

        generator.createTrivialCube(EBBlocks.CORALSOIL_CLAY.get());

        BlockModelGenerators.BlockFamilyProvider lavenderBricks = generator.family(EBBlocks.LAVENDER_HARDENED_CLAY_BRICKS.get());
        lavenderBricks.stairs(EBBlocks.LAVENDER_HARDENED_CLAY_BRICK_STAIRS.get());
        lavenderBricks.slab(EBBlocks.LAVENDER_HARDENED_CLAY_BRICK_SLAB.get());
        lavenderBricks.wall(EBBlocks.LAVENDER_HARDENED_CLAY_BRICK_WALL.get());

        generator.createTrivialCube(EBBlocks.MOSSY_LAVENDER_HARDENED_CLAY_BRICKS.get());
        generator.createTrivialCube(EBBlocks.LAVENDER_CLAY.get());

        generator.createPlant(EBBlocks.LAVENDER.get(), EBBlocks.POTTED_LAVENDER.get(), BlockModelGenerators.TintState.NOT_TINTED);
        //generator.createTrivialBlock(EBBlocks.LAVENDER_BLOCK.get(), TexturedModel.CUBE_TOP_BOTTOM);

        generator.createTrivialCube(EBBlocks.PEBBLESTONE.get());

        generator.family(EBBlocks.CONGLOMERATE.get())
                .stairs(EBBlocks.CONGLOMERATE_STAIRS.get())
                .slab(EBBlocks.CONGLOMERATE_SLAB.get())
                .wall(EBBlocks.CONGLOMERATE_WALL.get())
        ;

        generator.family(EBBlocks.CONGLOMERATE_BRICKS.get())
                .stairs(EBBlocks.CONGLOMERATE_BRICK_STAIRS.get())
                .slab(EBBlocks.CONGLOMERATE_BRICK_SLAB.get())
                .wall(EBBlocks.CONGLOMERATE_BRICK_WALL.get())
        ;

        generator.createPlant(EBBlocks.ANCIENT_SAPLING.get(), EBBlocks.POTTED_ANCIENT_SAPLING.get(), BlockModelGenerators.TintState.NOT_TINTED);

        generator.createGrowingPlant(EBBlocks.ANCIENT_VINES.get(), EBBlocks.ANCIENT_VINES_PLANT.get(), BlockModelGenerators.TintState.NOT_TINTED);
        generator.skipAutoItemBlock(EBBlocks.ANCIENT_VINES_PLANT.get());

        generator.family(EBBlocks.ANCIENT_PLANKS.get())
                .stairs(EBBlocks.ANCIENT_STAIRS.get())
                .slab(EBBlocks.ANCIENT_SLAB.get())
                .fence(EBBlocks.ANCIENT_FENCE.get())
                .fenceGate(EBBlocks.ANCIENT_FENCE_GATE.get())
                .pressurePlate(EBBlocks.ANCIENT_PRESSURE_PLATE.get())
                .button(EBBlocks.ANCIENT_BUTTON.get())
        ;

        generator.createDoor(EBBlocks.ANCIENT_DOOR.get());
        generator.createOrientableTrapdoor(EBBlocks.ANCIENT_TRAPDOOR.get());

        generator.createHangingSign(EBBlocks.ANCIENT_PLANKS.get(), EBBlocks.ANCIENT_HANGING_SIGN.get(), EBBlocks.ANCIENT_WALL_HANGING_SIGN.get());
        generator.createTrivialCube(EBBlocks.ANCIENT_LEAVES.get());

        generator.woodProvider(EBBlocks.ANCIENT_LOG.get()).logWithHorizontal(EBBlocks.ANCIENT_LOG.get()).wood(EBBlocks.ANCIENT_WOOD.get());
        generator.woodProvider(EBBlocks.STRIPPED_ANCIENT_LOG.get()).logWithHorizontal(EBBlocks.STRIPPED_ANCIENT_LOG.get()).wood(EBBlocks.STRIPPED_ANCIENT_WOOD.get());

        generator.family(EBBlocks.BRIMSTONE.get())
                .stairs(EBBlocks.BRIMSTONE_STAIRS.get())
                .slab(EBBlocks.BRIMSTONE_SLAB.get())
                .wall(EBBlocks.BRIMSTONE_WALL.get())
        ;

        generator.family(EBBlocks.POLISHED_BRIMSTONE.get())
                .stairs(EBBlocks.POLISHED_BRIMSTONE_STAIRS.get())
                .slab(EBBlocks.POLISHED_BRIMSTONE_SLAB.get())
        ;

        generator.family(EBBlocks.BRIMSTONE_BRICKS.get())
                .stairs(EBBlocks.BRIMSTONE_BRICK_STAIRS.get())
                .slab(EBBlocks.BRIMSTONE_BRICK_SLAB.get())
                .wall(EBBlocks.BRIMSTONE_BRICK_WALL.get())
        ;

        generator.family(EBBlocks.BRIMSTONE_TILES.get())
                .stairs(EBBlocks.BRIMSTONE_TILE_STAIRS.get())
                .slab(EBBlocks.BRIMSTONE_TILE_SLAB.get())
        ;

        generator.woodProvider(EBBlocks.BRIMSTONE_PILLAR.get()).logWithHorizontal(EBBlocks.BRIMSTONE_PILLAR.get());
        generator.createCopperBulb(EBBlocks.BRIMSTONE_LAMP.get());

        BlockModelGenerators.BlockFamilyProvider andesiteBricks = generator.family(EBBlocks.ANDESITE_BRICKS.get());
        andesiteBricks.stairs(EBBlocks.ANDESITE_BRICK_STAIRS.get());
        andesiteBricks.slab(EBBlocks.ANDESITE_BRICK_SLAB.get());
        andesiteBricks.wall(EBBlocks.ANDESITE_BRICK_WALL.get());

        BlockModelGenerators.BlockFamilyProvider graniteBricks = generator.family(EBBlocks.GRANITE_BRICKS.get());
        graniteBricks.stairs(EBBlocks.GRANITE_BRICK_STAIRS.get());
        graniteBricks.slab(EBBlocks.GRANITE_BRICK_SLAB.get());
        graniteBricks.wall(EBBlocks.GRANITE_BRICK_WALL.get());

        BlockModelGenerators.BlockFamilyProvider dioriteBricks = generator.family(EBBlocks.DIORITE_BRICKS.get());
        dioriteBricks.stairs(EBBlocks.DIORITE_BRICK_STAIRS.get());
        dioriteBricks.slab(EBBlocks.DIORITE_BRICK_SLAB.get());
        dioriteBricks.wall(EBBlocks.DIORITE_BRICK_WALL.get());

        BlockModelGenerators.BlockFamilyProvider chloroslate = generator.family(EBBlocks.CHLOROSLATE.get());
        chloroslate.stairs(EBBlocks.CHLOROSLATE_STAIRS.get());
        chloroslate.slab(EBBlocks.CHLOROSLATE_SLAB.get());
        chloroslate.wall(EBBlocks.CHLOROSLATE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider polishedChloroslate = generator.family(EBBlocks.POLISHED_CHLOROSLATE.get());
        polishedChloroslate.stairs(EBBlocks.POLISHED_CHLOROSLATE_STAIRS.get());
        polishedChloroslate.slab(EBBlocks.POLISHED_CHLOROSLATE_SLAB.get());
        polishedChloroslate.wall(EBBlocks.POLISHED_CHLOROSLATE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider chloroslatebricks = generator.family(EBBlocks.CHLOROSLATE_BRICKS.get());
        chloroslatebricks.stairs(EBBlocks.CHLOROSLATE_BRICK_STAIRS.get());
        chloroslatebricks.slab(EBBlocks.CHLOROSLATE_BRICK_SLAB.get());
        chloroslatebricks.wall(EBBlocks.CHLOROSLATE_BRICK_WALL.get());

        generator.createTrivialCube(EBBlocks.CHISELED_CHLOROSLATE.get());

        BlockModelGenerators.BlockFamilyProvider carmatite = generator.family(EBBlocks.ARIDITE.get());
        carmatite.stairs(EBBlocks.ARIDITE_STAIRS.get());
        carmatite.slab(EBBlocks.ARIDITE_SLAB.get());
        carmatite.wall(EBBlocks.ARIDITE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider polishedCarmatite = generator.family(EBBlocks.POLISHED_ARIDITE.get());
        polishedCarmatite.stairs(EBBlocks.POLISHED_ARIDITE_STAIRS.get());
        polishedCarmatite.slab(EBBlocks.POLISHED_ARIDITE_SLAB.get());
        polishedCarmatite.wall(EBBlocks.POLISHED_ARIDITE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider carmatitebricks = generator.family(EBBlocks.ARIDITE_BRICKS.get());
        carmatitebricks.stairs(EBBlocks.ARIDITE_BRICK_STAIRS.get());
        carmatitebricks.slab(EBBlocks.ARIDITE_BRICK_SLAB.get());
        carmatitebricks.wall(EBBlocks.ARIDITE_BRICK_WALL.get());

        generator.createTrivialCube(EBBlocks.CHISELED_ARIDITE.get());

        generator.createRotatedPillarWithHorizontalVariant(EBBlocks.HECTALITE_PILLAR.get(), TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL_ALT);
        generator.createRotatedPillarWithHorizontalVariant(EBBlocks.CHLOROSLATE_PILLAR.get(), TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL_ALT);
        generator.createRotatedPillarWithHorizontalVariant(EBBlocks.ARIDITE_PILLAR.get(), TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL_ALT);

        BlockModelGenerators.BlockFamilyProvider hectalite = generator.family(EBBlocks.HECTALITE.get());
        hectalite.stairs(EBBlocks.HECTALITE_STAIRS.get());
        hectalite.slab(EBBlocks.HECTALITE_SLAB.get());
        hectalite.wall(EBBlocks.HECTALITE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider polishedHectalite = generator.family(EBBlocks.POLISHED_HECTALITE.get());
        polishedHectalite.stairs(EBBlocks.POLISHED_HECTALITE_STAIRS.get());
        polishedHectalite.slab(EBBlocks.POLISHED_HECTALITE_SLAB.get());
        polishedHectalite.wall(EBBlocks.POLISHED_HECTALITE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider hectalitebricks = generator.family(EBBlocks.HECTALITE_BRICKS.get());
        hectalitebricks.stairs(EBBlocks.HECTALITE_BRICK_STAIRS.get());
        hectalitebricks.slab(EBBlocks.HECTALITE_BRICK_SLAB.get());
        hectalitebricks.wall(EBBlocks.HECTALITE_BRICK_WALL.get());

        generator.createTrivialCube(EBBlocks.CHISELED_HECTALITE.get());

        BlockModelGenerators.BlockFamilyProvider sageBricks = generator.family(EBBlocks.SAGE_HARDENED_CLAY_BRICKS.get());
        sageBricks.stairs(EBBlocks.SAGE_HARDENED_CLAY_BRICK_STAIRS.get());
        sageBricks.slab(EBBlocks.SAGE_HARDENED_CLAY_BRICK_SLAB.get());
        sageBricks.wall(EBBlocks.SAGE_HARDENED_CLAY_BRICK_WALL.get());

        generator.createTrivialCube(EBBlocks.MOSSY_SAGE_HARDENED_CLAY_BRICKS.get());
        generator.createTrivialCube(EBBlocks.SAGE_CLAY.get());

        generator.createPlant(EBBlocks.SAGE.get(), EBBlocks.POTTED_SAGE.get(), BlockModelGenerators.TintState.NOT_TINTED);

        generator.family(EBBlocks.SITRITE.get())
                .stairs(EBBlocks.SITRITE_STAIRS.get())
                .slab(EBBlocks.SITRITE_SLAB.get())
                .wall(EBBlocks.SITRITE_WALL.get())
        ;

        generator.family(EBBlocks.POLISHED_SITRITE.get())
                .stairs(EBBlocks.POLISHED_SITRITE_STAIRS.get())
                .slab(EBBlocks.POLISHED_SITRITE_SLAB.get())
        ;

        generator.family(EBBlocks.SITRITE_BRICKS.get())
                .stairs(EBBlocks.SITRITE_BRICK_STAIRS.get())
                .slab(EBBlocks.SITRITE_BRICK_SLAB.get())
                .wall(EBBlocks.SITRITE_BRICK_WALL.get())
        ;

        generator.family(EBBlocks.SITRITE_TILES.get())
                .stairs(EBBlocks.SITRITE_TILE_STAIRS.get())
                .slab(EBBlocks.SITRITE_TILE_SLAB.get())
        ;

        generator.woodProvider(EBBlocks.SITRITE_PILLAR.get()).logWithHorizontal(EBBlocks.SITRITE_PILLAR.get());
        generator.createTrivialCube(EBBlocks.CHISELED_SITRITE.get());

        BlockModelGenerators.BlockFamilyProvider amethystbricks = generator.family(EBBlocks.AMETHYST_BRICKS.get());
        amethystbricks.stairs(EBBlocks.AMETHYST_BRICK_STAIRS.get());
        amethystbricks.slab(EBBlocks.AMETHYST_BRICK_SLAB.get());
        amethystbricks.wall(EBBlocks.AMETHYST_BRICK_WALL.get());

        generator.createGlassBlocks(EBBlocks.AMETHYST_FRAMED_GLASS.get(), EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get());
        createCrystalLantern(generator, EBBlocks.AMETHYST_LAMP.get());

        generator.createTrivialCube(EBBlocks.CORALSOIL_HARDENED_CLAY.get());
        generator.createColoredBlockWithStateRotations(TexturedModel.GLAZED_TERRACOTTA, EBBlocks.CORALSOIL_GLAZED_CLAY.get());

        BlockModelGenerators.BlockFamilyProvider coralsoilBricks2 = generator.family(EBBlocks.CORALSOIL_BRICKS.get());
        coralsoilBricks2.stairs(EBBlocks.CORALSOIL_BRICK_STAIRS.get());
        coralsoilBricks2.slab(EBBlocks.CORALSOIL_BRICK_SLAB.get());
        coralsoilBricks2.wall(EBBlocks.CORALSOIL_BRICK_WALL.get());

        BlockModelGenerators.BlockFamilyProvider smoothCoralsoilBricks2 = generator.family(EBBlocks.SMOOTH_CORALSOIL_BRICKS.get());
        smoothCoralsoilBricks2.stairs(EBBlocks.SMOOTH_CORALSOIL_BRICK_STAIRS.get());
        smoothCoralsoilBricks2.slab(EBBlocks.SMOOTH_CORALSOIL_BRICK_SLAB.get());
        smoothCoralsoilBricks2.wall(EBBlocks.SMOOTH_CORALSOIL_BRICK_WALL.get());

        generator.createTrivialCube(EBBlocks.LAVENDER_HARDENED_CLAY.get());
        generator.createColoredBlockWithStateRotations(TexturedModel.GLAZED_TERRACOTTA, EBBlocks.LAVENDER_GLAZED_CLAY.get());

        BlockModelGenerators.BlockFamilyProvider lavenderBricks2 = generator.family(EBBlocks.LAVENDER_BRICKS.get());
        lavenderBricks2.stairs(EBBlocks.LAVENDER_BRICK_STAIRS.get());
        lavenderBricks2.slab(EBBlocks.LAVENDER_BRICK_SLAB.get());
        lavenderBricks2.wall(EBBlocks.LAVENDER_BRICK_WALL.get());

        BlockModelGenerators.BlockFamilyProvider smoothLavenderBricks2 = generator.family(EBBlocks.SMOOTH_LAVENDER_BRICKS.get());
        smoothLavenderBricks2.stairs(EBBlocks.SMOOTH_LAVENDER_BRICK_STAIRS.get());
        smoothLavenderBricks2.slab(EBBlocks.SMOOTH_LAVENDER_BRICK_SLAB.get());
        smoothLavenderBricks2.wall(EBBlocks.SMOOTH_LAVENDER_BRICK_WALL.get());

        generator.createTrivialCube(EBBlocks.SAGE_HARDENED_CLAY.get());
        generator.createColoredBlockWithStateRotations(TexturedModel.GLAZED_TERRACOTTA, EBBlocks.SAGE_GLAZED_CLAY.get());

        BlockModelGenerators.BlockFamilyProvider sageBricks2 = generator.family(EBBlocks.SAGE_BRICKS.get());
        sageBricks2.stairs(EBBlocks.SAGE_BRICK_STAIRS.get());
        sageBricks2.slab(EBBlocks.SAGE_BRICK_SLAB.get());
        sageBricks2.wall(EBBlocks.SAGE_BRICK_WALL.get());

        BlockModelGenerators.BlockFamilyProvider smoothSageBricks2 = generator.family(EBBlocks.SMOOTH_SAGE_BRICKS.get());
        smoothSageBricks2.stairs(EBBlocks.SMOOTH_SAGE_BRICK_STAIRS.get());
        smoothSageBricks2.slab(EBBlocks.SMOOTH_SAGE_BRICK_SLAB.get());
        smoothSageBricks2.wall(EBBlocks.SMOOTH_SAGE_BRICK_WALL.get());

        BlockModelGenerators.BlockFamilyProvider smoothBricks2 = generator.family(EBBlocks.SMOOTH_BRICKS.get());
        smoothBricks2.stairs(EBBlocks.SMOOTH_BRICK_STAIRS.get());
        smoothBricks2.slab(EBBlocks.SMOOTH_BRICK_SLAB.get());
        smoothBricks2.wall(EBBlocks.SMOOTH_BRICK_WALL.get());

        generator.createPlant(EBBlocks.WINTERGREEN_SAPLING.get(), EBBlocks.POTTED_WINTERGREEN_SAPLING.get(), BlockModelGenerators.TintState.NOT_TINTED);

        generator.family(EBBlocks.WINTERGREEN_PLANKS.get())
                .stairs(EBBlocks.WINTERGREEN_STAIRS.get())
                .slab(EBBlocks.WINTERGREEN_SLAB.get())
                .fence(EBBlocks.WINTERGREEN_FENCE.get())
                .fenceGate(EBBlocks.WINTERGREEN_FENCE_GATE.get())
                .pressurePlate(EBBlocks.WINTERGREEN_PRESSURE_PLATE.get())
                .button(EBBlocks.WINTERGREEN_BUTTON.get())
        ;

        generator.family(EBBlocks.ALMENTRA_BRICKS.get())
                .wall(EBBlocks.ALMENTRA_BRICK_WALL.get())
        ;

        generator.createDoor(EBBlocks.WINTERGREEN_DOOR.get());
        generator.createOrientableTrapdoor(EBBlocks.WINTERGREEN_TRAPDOOR.get());

        generator.createHangingSign(EBBlocks.WINTERGREEN_PLANKS.get(), EBBlocks.WINTERGREEN_HANGING_SIGN.get(), EBBlocks.WINTERGREEN_WALL_HANGING_SIGN.get());
        generator.createTrivialCube(EBBlocks.WINTERGREEN_LEAVES.get());

        generator.woodProvider(EBBlocks.WINTERGREEN_LOG.get()).logWithHorizontal(EBBlocks.WINTERGREEN_LOG.get()).wood(EBBlocks.WINTERGREEN_WOOD.get());
        generator.woodProvider(EBBlocks.STRIPPED_WINTERGREEN_LOG.get()).logWithHorizontal(EBBlocks.STRIPPED_WINTERGREEN_LOG.get()).wood(EBBlocks.STRIPPED_WINTERGREEN_WOOD.get());

        generator.createTrivialCube(EBBlocks.ZEUS_EPIC_BLOCK.get());

        //DYED
        for (DyeColor colors : DyeColor.values()) {
            generator.createRotatedPillarWithHorizontalVariant(EBBlocks.getDyedCorrugatedIron(colors.getId()).get(), TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL_ALT);
            generator.createTrivialCube(EBBlocks.getDyedFrostedGlass(colors.getId()).get());

            generator.family(EBBlocks.getDyedAlmentraBricks(colors.getId()).get())
                    .wall(EBBlocks.getDyedAlmentraBrickWall(colors.getId()).get())
            ;
        }
        generator.createTrivialCube(EBBlocks.FROSTED_GLASS.get());
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator) {
        generator.generateFlatItem(EBItems.ANCIENT_BOAT.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.ANCIENT_CHEST_BOAT.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.ANCIENT_FRUIT.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.ANCIENT_SIGN.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBBlocks.ANCIENT_VINES.get().asItem(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.CORALSOIL_CLAY_BALL.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.SAGE_CLAY_BALL.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.LAVENDER_CLAY_BALL.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.WINTERGREEN_BOAT.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.WINTERGREEN_CHEST_BOAT.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.WINTER_BERRIES.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.WINTERGREEN_SIGN.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.MALLET.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
    }

    public void createCrystalLantern(BlockModelGenerators generator, Block block) {
        TextureMapping textureMapping = TextureMapping.column(TextureMapping.getBlockTexture(block), TextureMapping.getBlockTexture(block, "_top"));
        ResourceLocation resourceLocation = ModelTemplates.CUBE_COLUMN.create(block, textureMapping, generator.modelOutput);
        generator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, resourceLocation));
    }
}
