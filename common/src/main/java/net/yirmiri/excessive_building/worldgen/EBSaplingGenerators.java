package net.yirmiri.excessive_building.worldgen;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.yirmiri.excessive_building.ExcessiveBuilding;

import java.util.Optional;

public class EBSaplingGenerators {
    public static final TreeGrower ANCIENT = register("ancient", Optional.of(EBConfiguredFeatures.ANCIENT_TREE), Optional.empty());
    public static final TreeGrower GLOOM = register("gloom", Optional.of(EBConfiguredFeatures.GLOOM_TREE), Optional.empty());

    private static TreeGrower register(String id, float secondaryChance, Optional<ResourceKey<ConfiguredFeature<?, ?>>> megaTree, Optional<ResourceKey<ConfiguredFeature<?, ?>>> secondaryMegaTree, Optional<ResourceKey<ConfiguredFeature<?, ?>>> tree, Optional<ResourceKey<ConfiguredFeature<?, ?>>> secondaryTree, Optional<ResourceKey<ConfiguredFeature<?, ?>>> flowers, Optional<ResourceKey<ConfiguredFeature<?, ?>>> secondaryFlowers) {
        return new TreeGrower(String.format("%s:%s", ExcessiveBuilding.MOD_ID, id), secondaryChance, megaTree, secondaryMegaTree, tree, secondaryTree, flowers, secondaryFlowers);
    }

    private static TreeGrower register(String id, Optional<ResourceKey<ConfiguredFeature<?, ?>>> tree, Optional<ResourceKey<ConfiguredFeature<?, ?>>> secondaryTree) {
        return register(id, 0, Optional.empty(), Optional.empty(), tree, secondaryTree, Optional.empty(), Optional.empty());
    }
}
