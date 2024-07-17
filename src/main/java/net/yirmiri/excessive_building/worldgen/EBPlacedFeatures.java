package net.yirmiri.excessive_building.worldgen;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBPlacedFeatures {

    public static final RegistryKey<PlacedFeature> ANCIENT_TREE = createKey("ancient_tree");

    public static RegistryKey<PlacedFeature> createKey(String id) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(ExcessiveBuilding.MOD_ID, id));
    }
}
