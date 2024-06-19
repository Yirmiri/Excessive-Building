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
        addDrop(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.SPRUCE_MOSAIC);
        addDrop(EBBlocks.SPRUCE_MOSAIC_STAIRS);
        addDrop(EBBlocks.SPRUCE_MOSAIC_SLAB, slabDrops(EBBlocks.SPRUCE_MOSAIC_SLAB));
        addDrop(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.BIRCH_MOSAIC);
        addDrop(EBBlocks.BIRCH_MOSAIC_STAIRS);
        addDrop(EBBlocks.BIRCH_MOSAIC_SLAB, slabDrops(EBBlocks.BIRCH_MOSAIC_SLAB));
        addDrop(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.JUNGLE_MOSAIC);
        addDrop(EBBlocks.JUNGLE_MOSAIC_STAIRS);
        addDrop(EBBlocks.JUNGLE_MOSAIC_SLAB, slabDrops(EBBlocks.JUNGLE_MOSAIC_SLAB));
        addDrop(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.ACACIA_MOSAIC);
        addDrop(EBBlocks.ACACIA_MOSAIC_STAIRS);
        addDrop(EBBlocks.ACACIA_MOSAIC_SLAB, slabDrops(EBBlocks.ACACIA_MOSAIC_SLAB));
        addDrop(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.DARK_OAK_MOSAIC);
        addDrop(EBBlocks.DARK_OAK_MOSAIC_STAIRS);
        addDrop(EBBlocks.DARK_OAK_MOSAIC_SLAB, slabDrops(EBBlocks.DARK_OAK_MOSAIC_SLAB));
        addDrop(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.MANGROVE_MOSAIC);
        addDrop(EBBlocks.MANGROVE_MOSAIC_STAIRS);
        addDrop(EBBlocks.MANGROVE_MOSAIC_SLAB, slabDrops(EBBlocks.MANGROVE_MOSAIC_SLAB));
        addDrop(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.CHERRY_MOSAIC);
        addDrop(EBBlocks.CHERRY_MOSAIC_STAIRS);
        addDrop(EBBlocks.CHERRY_MOSAIC_SLAB, slabDrops(EBBlocks.CHERRY_MOSAIC_SLAB));
        addDrop(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.CRIMSON_MOSAIC);
        addDrop(EBBlocks.CRIMSON_MOSAIC_STAIRS);
        addDrop(EBBlocks.CRIMSON_MOSAIC_SLAB, slabDrops(EBBlocks.CRIMSON_MOSAIC_SLAB));
        addDrop(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.WARPED_MOSAIC);
        addDrop(EBBlocks.WARPED_MOSAIC_STAIRS);
        addDrop(EBBlocks.WARPED_MOSAIC_SLAB, slabDrops(EBBlocks.WARPED_MOSAIC_SLAB));
        addDrop(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS);
    }
}
