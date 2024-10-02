package net.yirmiri.excessive_building.worldgen.sapling;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.yirmiri.excessive_building.worldgen.EBConfiguredFeatures;

public class GloomSaplingGenerator extends SaplingGenerator {
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return EBConfiguredFeatures.GLOOM_TREE;
    }
}
