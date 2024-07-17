package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;

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
        generator.registerSingleton(EBBlocks.CHISELED_ANCIENT_PLANKS, TexturedModel.CUBE_COLUMN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator generator) {
        generator.register(EBItems.ANCIENT_FRUIT, Models.GENERATED);
        generator.register(EBItems.ANCIENT_SIGN, Models.GENERATED);
        generator.register(EBItems.ANCIENT_HANGING_SIGN, Models.GENERATED);

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
}
