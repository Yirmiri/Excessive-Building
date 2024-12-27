package net.yirmiri.excessive_building.worldgen;
/*
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.registry.EBBlocks;

import java.util.List;

public class EBConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_TREE = createKey("ancient_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GLOOM_TREE = createKey("gloom_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_BRIMSTONE = createKey("ore_brimstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_ROSE = createKey("patch_rose");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_CYAN_ROSE = createKey("patch_cyan_rose");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_WHITE_ROSE = createKey("patch_white_rose");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_ALMENTRA = createKey("ore_almentra");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> ctx) {
        RuleTest overworldReplaceables = new TagMatchTest(BlockTags.BASE_STONE_OVERWORLD);
        RuleTest netherReplaceables = new TagMatchTest(BlockTags.BASE_STONE_NETHER);

        List<OreConfiguration.TargetBlockState> oreAlmentra = List.of(OreConfiguration.target(overworldReplaceables, EBBlocks.ALMENTRA.defaultBlockState()));
        List<OreConfiguration.TargetBlockState> oreBrimstone = List.of(OreConfiguration.target(netherReplaceables, EBBlocks.BRIMSTONE.defaultBlockState()));

        register(ctx, ORE_ALMENTRA, Feature.ORE, new OreConfiguration(oreAlmentra, 48));
        register(ctx, ORE_BRIMSTONE, Feature.ORE, new OreConfiguration(oreBrimstone, 48));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> createKey(String id) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, id));
    }

    public static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> registerable, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC config) {
        registerable.register(key, new ConfiguredFeature<>(feature, config));
    }
}
 */
