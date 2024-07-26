package net.yirmiri.excessive_building.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.yirmiri.excessive_building.ExcessiveBuilding;

import java.util.List;

public class EBPlacedFeatures {
    public static final RegistryKey<PlacedFeature> ANCIENT_TREE = createKey("ancient_tree"); //ancient trees don't generate but whatever
    public static final RegistryKey<PlacedFeature> GLOOM_TREE = createKey("gloom_tree"); //neither do these
    public static final RegistryKey<PlacedFeature> ORE_BRIMSTONE = createKey("ore_brimstone");

    public static void bootstrap(Registerable<PlacedFeature> ctx) {
        var configuredFeatureRegistryEntryLookup = ctx.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(ctx, ORE_BRIMSTONE, configuredFeatureRegistryEntryLookup.getOrThrow(EBConfiguredFeatures.ORE_BRIMSTONE),
                PlacementModifiers.modifiersWithCount(4, HeightRangePlacementModifier.uniform(YOffset.fixed(16), YOffset.fixed(108))));
    }

    public static void addBiomeModifiers() {
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_NETHER), GenerationStep.Feature.UNDERGROUND_ORES, EBPlacedFeatures.ORE_BRIMSTONE);
    }

    public static RegistryKey<PlacedFeature> createKey(String id) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(ExcessiveBuilding.MOD_ID, id));
    }

    private static void register(Registerable<PlacedFeature> ctx, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        ctx.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    public static class PlacementModifiers {
        public static List<PlacementModifier> modifiers(PlacementModifier perChunk, PlacementModifier height) {
            return List.of(perChunk, SquarePlacementModifier.of(), height, BiomePlacementModifier.of());
        }

        public static List<PlacementModifier> modifiersWithCount(int perChunk, PlacementModifier height) {
            return modifiers(CountPlacementModifier.of(perChunk), height);
        }
    }
}