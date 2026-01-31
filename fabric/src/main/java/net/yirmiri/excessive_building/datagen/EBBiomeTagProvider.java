package net.yirmiri.excessive_building.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.TagEntry;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.yirmiri.excessive_building.core.init.EBTags;

import java.util.concurrent.CompletableFuture;

public class EBBiomeTagProvider extends TagsProvider<Biome> {
    public EBBiomeTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, Registries.BIOME, lookupProvider);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        appendLavenderGeneratesIn();
        appendSageGeneratesIn();
    }

    private void appendLavenderGeneratesIn() {
        getOrCreateRawBuilder(EBTags.BiomeT.LAVENDER_GENERATES_IN)
                .add(TagEntry.element(Biomes.PLAINS.location()))
                .add(TagEntry.element(Biomes.SNOWY_PLAINS.location()))
                .add(TagEntry.element(Biomes.FLOWER_FOREST.location()))
        ;
    }

    private void appendSageGeneratesIn() {
        getOrCreateRawBuilder(EBTags.BiomeT.SAGE_GENERATES_IN)
                .add(TagEntry.element(Biomes.SAVANNA.location()))
                .add(TagEntry.element(Biomes.SAVANNA_PLATEAU.location()))
                .add(TagEntry.element(Biomes.FLOWER_FOREST.location()))
        ;
    }
}
