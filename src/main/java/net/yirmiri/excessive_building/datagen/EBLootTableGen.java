package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.yirmiri.excessive_building.registry.EBBlocks;

import java.util.concurrent.CompletableFuture;

public class EBLootTableGen extends FabricBlockLootTableProvider {
    public EBLootTableGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> future) {
        super(output, future);
    }

    @Override
    public void generate() {
        addDrop(EBBlocks.OAK_MOSAIC);
        addDrop(EBBlocks.OAK_MOSAIC_STAIRS);
        addDrop(EBBlocks.OAK_MOSAIC_SLAB, slabDrops(EBBlocks.OAK_MOSAIC_SLAB));
    }
}
