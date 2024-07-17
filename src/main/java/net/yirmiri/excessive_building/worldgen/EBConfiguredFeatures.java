package net.yirmiri.excessive_building.worldgen;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_TREE = createKey("ancient_tree");

    public static RegistryKey<ConfiguredFeature<?, ?>> createKey(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(ExcessiveBuilding.MOD_ID, id));
    }
}
