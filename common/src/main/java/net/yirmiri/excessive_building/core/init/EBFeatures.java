package net.yirmiri.excessive_building.core.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBFeatures {
    public static class ConfiguredFeatures {
        //STONES
        public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_CHLOROSLATE = createKey("ore_chloroslate");
        public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_HECTALITE = createKey("ore_hectalite");
        public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_ARIDITE = createKey("ore_aridite");

        public static ResourceKey<ConfiguredFeature<?, ?>> createKey(String id) {
            return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(ExcessiveBuilding.MOD_ID, id));
        }
    }

    public static class PlacedFeatures {
        //STONES
        public static final ResourceKey<PlacedFeature> ORE_CHLOROSLATE = createKey("ore_chloroslate");
        public static final ResourceKey<PlacedFeature> ORE_HECTALITE = createKey("ore_hectalite");
        public static final ResourceKey<PlacedFeature> ORE_ARIDITE = createKey("ore_aridite");

        public static ResourceKey<PlacedFeature> createKey(String id) {
            return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(ExcessiveBuilding.MOD_ID, id));
        }
    }
}
