package net.yirmiri.excessive_building.core.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT = registerKey("ancient");

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String id) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, id));
    }
}
