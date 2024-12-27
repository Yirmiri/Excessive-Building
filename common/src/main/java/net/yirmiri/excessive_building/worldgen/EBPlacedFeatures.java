package net.yirmiri.excessive_building.worldgen;
/*
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.yirmiri.excessive_building.ExcessiveBuilding;

import java.util.List;

public class EBPlacedFeatures {
    public static final ResourceKey<PlacedFeature> ANCIENT_TREE = createKey("ancient_tree"); //ancient trees don't generate but whatever
    public static final ResourceKey<PlacedFeature> GLOOM_TREE = createKey("gloom_tree"); //neither do these
    public static final ResourceKey<PlacedFeature> ORE_BRIMSTONE = createKey("ore_brimstone");
    public static final ResourceKey<PlacedFeature> PATCH_ROSE = createKey("patch_rose");
    public static final ResourceKey<PlacedFeature> PATCH_CYAN_ROSE = createKey("patch_cyan_rose");
    public static final ResourceKey<PlacedFeature> PATCH_WHITE_ROSE = createKey("patch_white_rose");
    public static final ResourceKey<PlacedFeature> ORE_ALMENTRA = createKey("ore_almentra");

    public static void bootstrap(BootstrapContext<PlacedFeature> ctx) {
        var configuredFeatureRegistryEntryLookup = ctx.lookup(Registries.CONFIGURED_FEATURE);

        register(ctx, ORE_ALMENTRA, configuredFeatureRegistryEntryLookup.getOrThrow(EBConfiguredFeatures.ORE_ALMENTRA),
                PlacementModifiers.modifiersWithCount(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(24), VerticalAnchor.absolute(128))));

        register(ctx, ORE_BRIMSTONE, configuredFeatureRegistryEntryLookup.getOrThrow(EBConfiguredFeatures.ORE_BRIMSTONE),
                PlacementModifiers.modifiersWithCount(4, HeightRangePlacement.uniform(VerticalAnchor.absolute(16), VerticalAnchor.absolute(108))));
    }

    public static void addBiomeModifiers() {
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_NETHER), GenerationStep.Decoration.UNDERGROUND_ORES, EBPlacedFeatures.ORE_BRIMSTONE);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_FOREST), GenerationStep.Decoration.VEGETAL_DECORATION, EBPlacedFeatures.PATCH_ROSE);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN), GenerationStep.Decoration.VEGETAL_DECORATION, EBPlacedFeatures.PATCH_WHITE_ROSE);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_JUNGLE), GenerationStep.Decoration.VEGETAL_DECORATION, EBPlacedFeatures.PATCH_CYAN_ROSE);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN), GenerationStep.Decoration.UNDERGROUND_ORES, EBPlacedFeatures.ORE_ALMENTRA);
    }

    public static ResourceKey<PlacedFeature> createKey(String id) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, id));
    }

    private static void register(BootstrapContext<PlacedFeature> ctx, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        ctx.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    public static class PlacementModifiers {
        public static List<PlacementModifier> modifiers(PlacementModifier perChunk, PlacementModifier height) {
            return List.of(perChunk, InSquarePlacement.spread(), height, BiomeFilter.biome());
        }

        public static List<PlacementModifier> modifiersWithCount(int perChunk, PlacementModifier height) {
            return modifiers(CountPlacement.of(perChunk), height);
        }
    }
}
 */