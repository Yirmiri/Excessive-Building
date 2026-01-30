package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TexturedModel;
import net.minecraft.world.level.block.Blocks;
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
        copperBricks.donateModelTo(EBBlocks.COPPER_BRICKS.get(), EBBlocks.WAXED_COPPER_BRICKS.get());
        copperBricks.donateModelTo(EBBlocks.COPPER_BRICK_STAIRS.get(), EBBlocks.WAXED_COPPER_BRICK_STAIRS.get());
        copperBricks.donateModelTo(EBBlocks.COPPER_BRICK_SLAB.get(), EBBlocks.WAXED_COPPER_BRICK_SLAB.get());

        BlockModelGenerators.BlockFamilyProvider exposedCopperBricks = generator.family(EBBlocks.EXPOSED_COPPER_BRICKS.get());
        exposedCopperBricks.stairs(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS.get());
        exposedCopperBricks.slab(EBBlocks.EXPOSED_COPPER_BRICK_SLAB.get());
        copperBricks.donateModelTo(EBBlocks.EXPOSED_COPPER_BRICKS.get(), EBBlocks.WAXED_EXPOSED_COPPER_BRICKS.get());
        copperBricks.donateModelTo(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS.get(), EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS.get());
        copperBricks.donateModelTo(EBBlocks.EXPOSED_COPPER_BRICK_SLAB.get(), EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB.get());

        BlockModelGenerators.BlockFamilyProvider weatheredCopperBricks = generator.family(EBBlocks.WEATHERED_COPPER_BRICKS.get());
        weatheredCopperBricks.stairs(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS.get());
        weatheredCopperBricks.slab(EBBlocks.WEATHERED_COPPER_BRICK_SLAB.get());
        copperBricks.donateModelTo(EBBlocks.WEATHERED_COPPER_BRICKS.get(), EBBlocks.WAXED_WEATHERED_COPPER_BRICKS.get());
        copperBricks.donateModelTo(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS.get(), EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS.get());
        copperBricks.donateModelTo(EBBlocks.WEATHERED_COPPER_BRICK_SLAB.get(), EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB.get());

        BlockModelGenerators.BlockFamilyProvider oxidizedCopperBricks = generator.family(EBBlocks.OXIDIZED_COPPER_BRICKS.get());
        oxidizedCopperBricks.stairs(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS.get());
        oxidizedCopperBricks.slab(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB.get());
        copperBricks.donateModelTo(EBBlocks.OXIDIZED_COPPER_BRICKS.get(), EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS.get());
        copperBricks.donateModelTo(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS.get(), EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS.get());
        copperBricks.donateModelTo(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB.get(), EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB.get());

        BlockModelGenerators.BlockFamilyProvider cobblestoneBricks = generator.family(EBBlocks.COBBLESTONE_BRICKS.get());
        cobblestoneBricks.stairs(EBBlocks.COBBLESTONE_BRICK_STAIRS.get());
        cobblestoneBricks.slab(EBBlocks.COBBLESTONE_BRICK_SLAB.get());
        cobblestoneBricks.wall(EBBlocks.COBBLESTONE_BRICK_WALL.get());

        generator.createTrivialCube(EBBlocks.CRACKED_COBBLESTONE_BRICKS.get());

        BlockModelGenerators.BlockFamilyProvider coralsoilBricks = generator.family(EBBlocks.CORALSOIL_BRICKS.get());
        coralsoilBricks.stairs(EBBlocks.CORALSOIL_BRICK_STAIRS.get());
        coralsoilBricks.slab(EBBlocks.CORALSOIL_BRICK_SLAB.get());
        coralsoilBricks.wall(EBBlocks.CORALSOIL_BRICK_WALL.get());

        generator.createTrivialCube(EBBlocks.CORALSOIL.get());

        BlockModelGenerators.BlockFamilyProvider lavenderBricks = generator.family(EBBlocks.LAVENDER_BRICKS.get());
        lavenderBricks.stairs(EBBlocks.LAVENDER_BRICK_STAIRS.get());
        lavenderBricks.slab(EBBlocks.LAVENDER_BRICK_SLAB.get());
        lavenderBricks.wall(EBBlocks.LAVENDER_BRICK_WALL.get());

        generator.createTrivialCube(EBBlocks.MOSSY_LAVENDER_BRICKS.get());
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
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator) {
        generator.generateFlatItem(EBItems.ANCIENT_BOAT.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.ANCIENT_CHEST_BOAT.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.ANCIENT_FRUIT.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.ANCIENT_SIGN.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBBlocks.ANCIENT_VINES.get().asItem(), ModelTemplates.FLAT_ITEM);
    }
}
