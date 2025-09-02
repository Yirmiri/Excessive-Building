package net.yirmiri.excessive_building.common.worldgen.tree;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.yirmiri.excessive_building.core.init.EBConfiguredFeatures;

public class AncientTreeGrower extends AbstractTreeGrower {
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource source, boolean b) {
        return EBConfiguredFeatures.ANCIENT;
    }
}
