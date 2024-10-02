package net.yirmiri.excessive_building.worldgen.sapling;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.yirmiri.excessive_building.worldgen.EBConfiguredFeatures;

public class AncientSaplingGenerator extends AbstractTreeGrower {
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean bees) {
        return EBConfiguredFeatures.ANCIENT_TREE;
    }
}
