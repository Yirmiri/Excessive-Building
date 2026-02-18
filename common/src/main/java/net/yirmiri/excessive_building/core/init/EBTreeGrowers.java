package net.yirmiri.excessive_building.core.init;

import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class EBTreeGrowers {
    public static final TreeGrower ANCIENT = new TreeGrower("ancient", 0F,
            Optional.empty(),
            Optional.empty(),
            Optional.of(EBFeatureKeys.ConfiguredFeatures.ANCIENT),
            Optional.empty(),
            Optional.empty(),
            Optional.empty());

    public static final TreeGrower WINTERGREEN = new TreeGrower("wintergreen", 0F,
            Optional.empty(),
            Optional.empty(),
            Optional.of(EBFeatureKeys.ConfiguredFeatures.WINTERGREEN),
            Optional.empty(),
            Optional.empty(),
            Optional.empty());
}
