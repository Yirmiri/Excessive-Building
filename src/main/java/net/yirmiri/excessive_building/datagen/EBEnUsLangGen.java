package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.yirmiri.excessive_building.registry.EBBlocks;

import java.util.concurrent.CompletableFuture;

public class EBEnUsLangGen extends FabricLanguageProvider {
    public EBEnUsLangGen(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup lookup, TranslationBuilder builder) {
        //BLOCKS
        builder.add(EBBlocks.OAK_MOSAIC, "Oak Mosaic");
        builder.add(EBBlocks.OAK_MOSAIC_STAIRS, "Oak Mosaic Stairs");
        builder.add(EBBlocks.OAK_MOSAIC_SLAB, "Oak Mosaic Slab");

        //ITEM GROUPS
        builder.add("itemgroup.excessive_building", "Excessive Building");
    }
}
