package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.yirmiri.excessive_building.registry.EBBlocks;

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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
