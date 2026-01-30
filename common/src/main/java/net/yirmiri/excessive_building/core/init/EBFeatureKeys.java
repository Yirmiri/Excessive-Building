package net.yirmiri.excessive_building.core.init;

import net.azurune.runiclib.RunicLib;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBFeatureKeys {
    public static class ConfiguredFeatures {
        public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT = create("ancient");

        public static ResourceKey<ConfiguredFeature<?, ?>> create(String id) {
            return ResourceKey.create(Registries.CONFIGURED_FEATURE, RunicLib.customid(ExcessiveBuilding.MOD_ID, id));
        }
    }

    public static class PlacedFeatures {
        //NATURE
        public static final ResourceKey<PlacedFeature> PATCH_LAVENDER = create("patch_lavender");

        //ROCK
        public static final ResourceKey<PlacedFeature> ORE_BRIMSTONE = create("ore_brimstone");

        public static ResourceKey<PlacedFeature> create(String id) {
            return ResourceKey.create(Registries.PLACED_FEATURE, RunicLib.customid(ExcessiveBuilding.MOD_ID, id));
        }
    }
}
