package net.yirmiri.excessive_building.core.init;

import net.azurune.runiclib.RunicLib;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBFeatureKeys {
    public static class PlacedFeatures {
        public static final ResourceKey<PlacedFeature> PATCH_LAVENDER = createKey("patch_lavender");

        public static ResourceKey<PlacedFeature> createKey(String id) {
            return ResourceKey.create(Registries.PLACED_FEATURE, RunicLib.customid(ExcessiveBuilding.MOD_ID, id));
        }
    }
}
