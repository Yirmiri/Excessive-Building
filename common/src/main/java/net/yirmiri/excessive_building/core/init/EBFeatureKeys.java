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
        public static final ResourceKey<ConfiguredFeature<?, ?>> WINTERGREEN = create("wintergreen");

        public static ResourceKey<ConfiguredFeature<?, ?>> create(String id) {
            return ResourceKey.create(Registries.CONFIGURED_FEATURE, RunicLib.customid(ExcessiveBuilding.MOD_ID, id));
        }
    }

    public static class PlacedFeatures {
        //NATURE
        public static final ResourceKey<PlacedFeature> PATCH_LAVENDER = create("patch_lavender");
        public static final ResourceKey<PlacedFeature> PATCH_SAGE = create("patch_sage");
        public static final ResourceKey<PlacedFeature> WINTERGREEN = create("wintergreen");
        public static final ResourceKey<PlacedFeature> SNOWY_WINTERGREEN = create("snowy_wintergreen");

        //ORE
        public static final ResourceKey<PlacedFeature> ORE_ALMENTRA = create("ore_almentra");
        public static final ResourceKey<PlacedFeature> ORE_BRIMSTONE = create("ore_brimstone");
        public static final ResourceKey<PlacedFeature> ORE_CHLOROSLATE = create("ore_chloroslate");
        public static final ResourceKey<PlacedFeature> ORE_HECTALITE = create("ore_hectalite");
        public static final ResourceKey<PlacedFeature> ORE_ARIDITE = create("ore_aridite");
        public static final ResourceKey<PlacedFeature> ORE_SITRITE = create("ore_sitrite");

        public static ResourceKey<PlacedFeature> create(String id) {
            return ResourceKey.create(Registries.PLACED_FEATURE, RunicLib.customid(ExcessiveBuilding.MOD_ID, id));
        }
    }
}
