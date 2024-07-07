package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.client.model.Model;
import net.minecraft.data.client.*;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;

public class EBModelGen extends FabricModelProvider {
    public EBModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool oakMosaic = blockStateModelGenerator.registerCubeAllModelTexturePool(EBBlocks.OAK_MOSAIC);
        oakMosaic.stairs(EBBlocks.OAK_MOSAIC_STAIRS);
        oakMosaic.slab(EBBlocks.OAK_MOSAIC_SLAB);

        BlockStateModelGenerator.BlockTexturePool spruceMosaic = blockStateModelGenerator.registerCubeAllModelTexturePool(EBBlocks.SPRUCE_MOSAIC);
        spruceMosaic.stairs(EBBlocks.SPRUCE_MOSAIC_STAIRS);
        spruceMosaic.slab(EBBlocks.SPRUCE_MOSAIC_SLAB);

        BlockStateModelGenerator.BlockTexturePool birchMosaic = blockStateModelGenerator.registerCubeAllModelTexturePool(EBBlocks.BIRCH_MOSAIC);
        birchMosaic.stairs(EBBlocks.BIRCH_MOSAIC_STAIRS);
        birchMosaic.slab(EBBlocks.BIRCH_MOSAIC_SLAB);

        BlockStateModelGenerator.BlockTexturePool jungleMosaic = blockStateModelGenerator.registerCubeAllModelTexturePool(EBBlocks.JUNGLE_MOSAIC);
        jungleMosaic.stairs(EBBlocks.JUNGLE_MOSAIC_STAIRS);
        jungleMosaic.slab(EBBlocks.JUNGLE_MOSAIC_SLAB);

        BlockStateModelGenerator.BlockTexturePool acaciaMosaic = blockStateModelGenerator.registerCubeAllModelTexturePool(EBBlocks.ACACIA_MOSAIC);
        acaciaMosaic.stairs(EBBlocks.ACACIA_MOSAIC_STAIRS);
        acaciaMosaic.slab(EBBlocks.ACACIA_MOSAIC_SLAB);

        BlockStateModelGenerator.BlockTexturePool darkOakMosaic = blockStateModelGenerator.registerCubeAllModelTexturePool(EBBlocks.DARK_OAK_MOSAIC);
        darkOakMosaic.stairs(EBBlocks.DARK_OAK_MOSAIC_STAIRS);
        darkOakMosaic.slab(EBBlocks.DARK_OAK_MOSAIC_SLAB);

        BlockStateModelGenerator.BlockTexturePool mangroveMosaic = blockStateModelGenerator.registerCubeAllModelTexturePool(EBBlocks.MANGROVE_MOSAIC);
        mangroveMosaic.stairs(EBBlocks.MANGROVE_MOSAIC_STAIRS);
        mangroveMosaic.slab(EBBlocks.MANGROVE_MOSAIC_SLAB);

        BlockStateModelGenerator.BlockTexturePool cherryMosaic = blockStateModelGenerator.registerCubeAllModelTexturePool(EBBlocks.CHERRY_MOSAIC);
        cherryMosaic.stairs(EBBlocks.CHERRY_MOSAIC_STAIRS);
        cherryMosaic.slab(EBBlocks.CHERRY_MOSAIC_SLAB);

        BlockStateModelGenerator.BlockTexturePool crimsonMosaic = blockStateModelGenerator.registerCubeAllModelTexturePool(EBBlocks.CRIMSON_MOSAIC);
        crimsonMosaic.stairs(EBBlocks.CRIMSON_MOSAIC_STAIRS);
        crimsonMosaic.slab(EBBlocks.CRIMSON_MOSAIC_SLAB);

        BlockStateModelGenerator.BlockTexturePool warpedMosaic = blockStateModelGenerator.registerCubeAllModelTexturePool(EBBlocks.WARPED_MOSAIC);
        warpedMosaic.stairs(EBBlocks.WARPED_MOSAIC_STAIRS);
        warpedMosaic.slab(EBBlocks.WARPED_MOSAIC_SLAB);

        BlockStateModelGenerator.BlockTexturePool cobblestoneBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(EBBlocks.COBBLESTONE_BRICKS);
        cobblestoneBricks.stairs(EBBlocks.COBBLESTONE_BRICK_STAIRS);
        cobblestoneBricks.slab(EBBlocks.COBBLESTONE_BRICK_SLAB);
        cobblestoneBricks.wall(EBBlocks.COBBLESTONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool mossyCobblestoneBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(EBBlocks.MOSSY_COBBLESTONE_BRICKS);
        mossyCobblestoneBricks.stairs(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS);
        mossyCobblestoneBricks.slab(EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB);
        mossyCobblestoneBricks.wall(EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool cobbledDeepslateBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(EBBlocks.COBBLED_DEEPSLATE_BRICKS);
        cobbledDeepslateBricks.stairs(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS);
        cobbledDeepslateBricks.slab(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB);
        cobbledDeepslateBricks.wall(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool blackstoneBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(EBBlocks.BLACKSTONE_BRICKS);
        blackstoneBricks.stairs(EBBlocks.BLACKSTONE_BRICK_STAIRS);
        blackstoneBricks.slab(EBBlocks.BLACKSTONE_BRICK_SLAB);
        blackstoneBricks.wall(EBBlocks.BLACKSTONE_BRICK_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(EBBlocks.CRACKED_COBBLESTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(EBBlocks.CRACKED_COBBLED_DEEPSLATE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(EBBlocks.CRACKED_BLACKSTONE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool ancientPlanks = blockStateModelGenerator.registerCubeAllModelTexturePool(EBBlocks.ANCIENT_PLANKS);
        ancientPlanks.stairs(EBBlocks.ANCIENT_STAIRS);
        ancientPlanks.slab(EBBlocks.ANCIENT_SLAB);
        ancientPlanks.fence(EBBlocks.ANCIENT_FENCE);
        ancientPlanks.customFenceGate(EBBlocks.ANCIENT_FENCE_GATE);
        ancientPlanks.button(EBBlocks.ANCIENT_BUTTON);
        ancientPlanks.pressurePlate(EBBlocks.ANCIENT_PRESSURE_PLATE);

        BlockStateModelGenerator.BlockTexturePool ancientMosaic = blockStateModelGenerator.registerCubeAllModelTexturePool(EBBlocks.ANCIENT_MOSAIC);
        ancientMosaic.stairs(EBBlocks.ANCIENT_MOSAIC_STAIRS);
        ancientMosaic.slab(EBBlocks.ANCIENT_MOSAIC_SLAB);

        blockStateModelGenerator.registerSimpleCubeAll(EBBlocks.ANCIENT_LEAVES);
        blockStateModelGenerator.registerDoor(EBBlocks.ANCIENT_DOOR);
        blockStateModelGenerator.registerTrapdoor(EBBlocks.ANCIENT_TRAPDOOR);

        blockStateModelGenerator.registerLog(EBBlocks.ANCIENT_LOG).log(EBBlocks.ANCIENT_LOG).wood(EBBlocks.ANCIENT_WOOD);
        blockStateModelGenerator.registerLog(EBBlocks.STRIPPED_ANCIENT_LOG).log(EBBlocks.STRIPPED_ANCIENT_LOG).wood(EBBlocks.STRIPPED_ANCIENT_WOOD);

        blockStateModelGenerator.registerFlowerPotPlant(EBBlocks.ANCIENT_SAPLING, EBBlocks.POTTED_ANCIENT_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(EBItems.ANCIENT_FRUIT, Models.GENERATED);
        itemModelGenerator.register(EBItems.ANCIENT_SIGN, Models.GENERATED);
        itemModelGenerator.register(EBItems.ANCIENT_HANGING_SIGN, Models.GENERATED);

        itemModelGenerator.register(EBItems.ROYALTY_POTTERY_SHERD, Models.GENERATED);
        itemModelGenerator.register(EBItems.ANCIENT_POTTERY_SHERD, Models.GENERATED);
        itemModelGenerator.register(EBItems.BITTER_POTTERY_SHERD, Models.GENERATED);
        itemModelGenerator.register(EBItems.BOIN_POTTERY_SHERD, Models.GENERATED);
        itemModelGenerator.register(EBItems.BUSTLING_POTTERY_SHERD, Models.GENERATED);
        itemModelGenerator.register(EBItems.CHECKERED_POTTERY_SHERD, Models.GENERATED);
        itemModelGenerator.register(EBItems.DECAY_POTTERY_SHERD, Models.GENERATED);
        itemModelGenerator.register(EBItems.DESTRUCTION_POTTERY_SHERD, Models.GENERATED);
        itemModelGenerator.register(EBItems.FORWARDS_POTTERY_SHERD, Models.GENERATED);
        itemModelGenerator.register(EBItems.HEXXED_POTTERY_SHERD, Models.GENERATED);
        itemModelGenerator.register(EBItems.KITTEH_POTTERY_SHERD, Models.GENERATED);
        itemModelGenerator.register(EBItems.LIFE_POTTERY_SHERD, Models.GENERATED);
        itemModelGenerator.register(EBItems.MESMERIZE_POTTERY_SHERD, Models.GENERATED);
        itemModelGenerator.register(EBItems.PORTAL_POTTERY_SHERD, Models.GENERATED);
        itemModelGenerator.register(EBItems.POTTERY_POTTERY_SHERD, Models.GENERATED);
        itemModelGenerator.register(EBItems.RING_POTTERY_SHERD, Models.GENERATED);
        itemModelGenerator.register(EBItems.SNOUT_POTTERY_SHERD, Models.GENERATED);
        itemModelGenerator.register(EBItems.SPRITE_POTTERY_SHERD, Models.GENERATED);
        itemModelGenerator.register(EBItems.TWINS_POTTERY_SHERD, Models.GENERATED);
        itemModelGenerator.register(EBItems.WRATHFUL_POTTERY_SHERD, Models.GENERATED);
        itemModelGenerator.register(EBItems.IS_THAT_POTTERY_SHERD, Models.GENERATED);
    }
}
