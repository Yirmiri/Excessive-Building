package net.yirmiri.excessive_building.worldgen;

import net.minecraft.block.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.yirmiri.excessive_building.ExcessiveBuilding;

import java.util.Optional;

public class EBSaplingGenerators {
    public static final SaplingGenerator ANCIENT = register("ancient", Optional.of(EBConfiguredFeatures.ANCIENT_TREE), Optional.empty());
    public static final SaplingGenerator GLOOM = register("gloom", Optional.of(EBConfiguredFeatures.GLOOM_TREE), Optional.empty());

    private static SaplingGenerator register(String id, float secondaryChance, Optional<RegistryKey<ConfiguredFeature<?, ?>>> megaTree, Optional<RegistryKey<ConfiguredFeature<?, ?>>> secondaryMegaTree, Optional<RegistryKey<ConfiguredFeature<?, ?>>> tree, Optional<RegistryKey<ConfiguredFeature<?, ?>>> secondaryTree, Optional<RegistryKey<ConfiguredFeature<?, ?>>> flowers, Optional<RegistryKey<ConfiguredFeature<?, ?>>> secondaryFlowers) {
        return new SaplingGenerator(String.format("%s:%s", ExcessiveBuilding.MOD_ID, id), secondaryChance, megaTree, secondaryMegaTree, tree, secondaryTree, flowers, secondaryFlowers);
    }

    private static SaplingGenerator register(String id, Optional<RegistryKey<ConfiguredFeature<?, ?>>> tree, Optional<RegistryKey<ConfiguredFeature<?, ?>>> secondaryTree) {
        return register(id, 0, Optional.empty(), Optional.empty(), tree, secondaryTree, Optional.empty(), Optional.empty());
    }
}
