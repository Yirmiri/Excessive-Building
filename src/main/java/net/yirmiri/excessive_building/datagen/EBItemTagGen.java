package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.util.EBTags;

import java.util.concurrent.CompletableFuture;

public class EBItemTagGen extends FabricTagProvider.ItemTagProvider {
    public EBItemTagGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> future) {
        super(output, future);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapper) {
        getOrCreateTagBuilder(EBTags.Items.MOSAIC)
                .add(Items.BAMBOO_MOSAIC)
                .add(EBBlocks.OAK_MOSAIC.asItem())
                .add(EBBlocks.SPRUCE_MOSAIC.asItem())
                .add(EBBlocks.BIRCH_MOSAIC.asItem())
                .add(EBBlocks.JUNGLE_MOSAIC.asItem())
                .add(EBBlocks.ACACIA_MOSAIC.asItem())
                .add(EBBlocks.DARK_OAK_MOSAIC.asItem())
                .add(EBBlocks.MANGROVE_MOSAIC.asItem())
                .add(EBBlocks.CHERRY_MOSAIC.asItem())
                .add(EBBlocks.CRIMSON_MOSAIC.asItem())
                .add(EBBlocks.WARPED_MOSAIC.asItem());

        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(EBBlocks.ANCIENT_SAPLING.asItem());

        getOrCreateTagBuilder(EBTags.Items.GLOW_REMOVALS)
                .add(Items.PAPER);
    }
}
