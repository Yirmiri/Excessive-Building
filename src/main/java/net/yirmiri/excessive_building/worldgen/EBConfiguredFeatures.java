package net.yirmiri.excessive_building.worldgen;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.registry.EBBlocks;

import java.util.List;

public class EBConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_TREE = createKey("ancient_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GLOOM_TREE = createKey("gloom_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_BRIMSTONE = createKey("ore_brimstone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_ROSE = createKey("patch_rose");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_CYAN_ROSE = createKey("patch_cyan_rose");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_WHITE_ROSE = createKey("patch_white_rose");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> ctx) {
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);

        List<OreFeatureConfig.Target> oreBrimstone = List.of(OreFeatureConfig.createTarget(netherReplaceables, EBBlocks.BRIMSTONE.getDefaultState()));

        register(ctx, ORE_BRIMSTONE, Feature.ORE, new OreFeatureConfig(oreBrimstone, 48));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> createKey(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(ExcessiveBuilding.MOD_ID, id));
    }

    public static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> registerable, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC config) {
        registerable.register(key, new ConfiguredFeature<>(feature, config));
    }
}
