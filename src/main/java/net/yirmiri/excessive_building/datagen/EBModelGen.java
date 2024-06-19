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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
