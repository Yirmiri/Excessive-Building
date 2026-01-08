package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.TexturedModel;
import net.minecraft.world.level.block.Blocks;
import net.yirmiri.excessive_building.core.registry.EBBlocks;

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
        generator.createTrivialBlock(EBBlocks.LAVENDER_BLOCK.get(), TexturedModel.CUBE_TOP_BOTTOM);
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator) {

    }
}
