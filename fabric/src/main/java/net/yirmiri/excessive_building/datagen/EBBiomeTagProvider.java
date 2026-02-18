package net.yirmiri.excessive_building.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagEntry;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.yirmiri.excessive_building.core.init.EBTags;

import java.util.concurrent.CompletableFuture;

public class EBBiomeTagProvider extends BiomeTagsProvider {
    public EBBiomeTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        appendLavenderGeneratesIn();
        appendSageGeneratesIn();
        appendWintergreenGeneratesIn();
        appendSnowyWintergreenGeneratesIn();
    }

    private void appendLavenderGeneratesIn() {
        tag(EBTags.BiomeT.LAVENDER_GENERATES_IN)
                .add(Biomes.PLAINS)
                .add(Biomes.MEADOW)
                .add(Biomes.FLOWER_FOREST)
        ;
    }

    private void appendSageGeneratesIn() {
        tag(EBTags.BiomeT.SAGE_GENERATES_IN)
                .addOptionalTag(BiomeTags.IS_SAVANNA.location())
                .add(Biomes.MEADOW)
                .add(Biomes.FLOWER_FOREST)
        ;
    }

    private void appendWintergreenGeneratesIn() {
        tag(EBTags.BiomeT.WINTERGREEN_GENERATES_IN)
                .add(Biomes.TAIGA)
        ;
    }

    private void appendSnowyWintergreenGeneratesIn() {
        tag(EBTags.BiomeT.WINTERGREEN_GENERATES_IN)
                .add(Biomes.SNOWY_TAIGA)
                .add(Biomes.SNOWY_PLAINS)
        ;
    }
}
