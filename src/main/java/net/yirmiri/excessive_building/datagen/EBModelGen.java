package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
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
        generator.registerTrapdoor(EBBlocks.ANCIENT_TRAPDOOR);

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
        generator.registerTrapdoor(EBBlocks.GLOOM_TRAPDOOR);

        generator.registerLog(EBBlocks.GLOOM_LOG).log(EBBlocks.GLOOM_LOG).wood(EBBlocks.GLOOM_WOOD);
        generator.registerLog(EBBlocks.STRIPPED_GLOOM_LOG).log(EBBlocks.STRIPPED_GLOOM_LOG).wood(EBBlocks.STRIPPED_GLOOM_WOOD);

        generator.registerSingleton(EBBlocks.CHISELED_GLOOM_PLANKS, TexturedModel.CUBE_COLUMN);
        generator.registerHangingSign(EBBlocks.STRIPPED_GLOOM_LOG, EBBlocks.GLOOM_HANGING_SIGN, EBBlocks.GLOOM_WALL_HANGING_SIGN);

        BlockStateModelGenerator.BlockTexturePool copper = generator.registerCubeAllModelTexturePool(Blocks.COPPER_BLOCK);
        copper.pressurePlate(EBBlocks.COPPER_PRESSURE_PLATE);
        copper.parented(EBBlocks.COPPER_PRESSURE_PLATE, EBBlocks.WAXED_COPPER_PRESSURE_PLATE);
        copper.button(EBBlocks.COPPER_BUTTON);
        copper.button(EBBlocks.WAXED_COPPER_BUTTON);

        BlockStateModelGenerator.BlockTexturePool exposedCopper = generator.registerCubeAllModelTexturePool(Blocks.EXPOSED_COPPER);
        exposedCopper.pressurePlate(EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
        exposedCopper.parented(EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE, EBBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
        exposedCopper.button(EBBlocks.EXPOSED_COPPER_BUTTON);
        exposedCopper.button(EBBlocks.WAXED_EXPOSED_COPPER_BUTTON);

        BlockStateModelGenerator.BlockTexturePool weatheredCopper = generator.registerCubeAllModelTexturePool(Blocks.WEATHERED_COPPER);
        weatheredCopper.pressurePlate(EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
        weatheredCopper.parented(EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE, EBBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
        weatheredCopper.button(EBBlocks.WEATHERED_COPPER_BUTTON);
        weatheredCopper.button(EBBlocks.WAXED_WEATHERED_COPPER_BUTTON);

        BlockStateModelGenerator.BlockTexturePool oxidizedCopper = generator.registerCubeAllModelTexturePool(Blocks.OXIDIZED_COPPER);
        oxidizedCopper.pressurePlate(EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
        oxidizedCopper.parented(EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, EBBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
        oxidizedCopper.button(EBBlocks.OXIDIZED_COPPER_BUTTON);
        oxidizedCopper.button(EBBlocks.WAXED_OXIDIZED_COPPER_BUTTON);

        BlockStateModelGenerator.BlockTexturePool copperBricks = generator.registerCubeAllModelTexturePool(EBBlocks.COPPER_BRICKS);
        copperBricks.stairs(EBBlocks.COPPER_BRICK_STAIRS);
        copperBricks.slab(EBBlocks.COPPER_BRICK_SLAB);
        copperBricks.parented(EBBlocks.COPPER_BRICKS, EBBlocks.WAXED_COPPER_BRICKS);
        copperBricks.parented(EBBlocks.COPPER_BRICK_STAIRS, EBBlocks.WAXED_COPPER_BRICK_STAIRS);
        copperBricks.parented(EBBlocks.COPPER_BRICK_SLAB, EBBlocks.WAXED_COPPER_BRICK_SLAB);

        BlockStateModelGenerator.BlockTexturePool exposedCopperBricks = generator.registerCubeAllModelTexturePool(EBBlocks.EXPOSED_COPPER_BRICKS);
        exposedCopperBricks.stairs(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS);
        exposedCopperBricks.slab(EBBlocks.EXPOSED_COPPER_BRICK_SLAB);
        exposedCopperBricks.parented(EBBlocks.EXPOSED_COPPER_BRICKS, EBBlocks.WAXED_EXPOSED_COPPER_BRICKS);
        exposedCopperBricks.parented(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS, EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS);
        exposedCopperBricks.parented(EBBlocks.EXPOSED_COPPER_BRICK_SLAB, EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB);

        BlockStateModelGenerator.BlockTexturePool weatheredCopperBricks = generator.registerCubeAllModelTexturePool(EBBlocks.WEATHERED_COPPER_BRICKS);
        weatheredCopperBricks.stairs(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS);
        weatheredCopperBricks.slab(EBBlocks.WEATHERED_COPPER_BRICK_SLAB);
        weatheredCopperBricks.parented(EBBlocks.WEATHERED_COPPER_BRICKS, EBBlocks.WAXED_WEATHERED_COPPER_BRICKS);
        weatheredCopperBricks.parented(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS, EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS);
        weatheredCopperBricks.parented(EBBlocks.WEATHERED_COPPER_BRICK_SLAB, EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB);

        BlockStateModelGenerator.BlockTexturePool oxidizedCopperBricks = generator.registerCubeAllModelTexturePool(EBBlocks.OXIDIZED_COPPER_BRICKS);
        oxidizedCopperBricks.stairs(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS);
        oxidizedCopperBricks.slab(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB);
        oxidizedCopperBricks.parented(EBBlocks.OXIDIZED_COPPER_BRICKS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS);
        oxidizedCopperBricks.parented(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS);
        oxidizedCopperBricks.parented(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB, EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB);

        EBModels.registerVerticalStairs(generator, EBBlocks.COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.COPPER_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.EXPOSED_COPPER_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WEATHERED_COPPER_BRICKS);
        EBModels.registerVerticalStairs(generator, EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.OXIDIZED_COPPER_BRICKS);

        generator.registerParented(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS);
        generator.registerParented(EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS);
        generator.registerParented(EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS);
        generator.registerParented(EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS);
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
    }

    public static class EBModels {
        public static final Model VERTICAL_STAIRS = new Model(Optional.of(Identifier.of(ExcessiveBuilding.MOD_ID, "template_vertical_stairs")
                .withPrefixedPath("block/")), Optional.empty(), TextureKey.TEXTURE);

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
    }
}
