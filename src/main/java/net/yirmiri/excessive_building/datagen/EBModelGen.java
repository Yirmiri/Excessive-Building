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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
