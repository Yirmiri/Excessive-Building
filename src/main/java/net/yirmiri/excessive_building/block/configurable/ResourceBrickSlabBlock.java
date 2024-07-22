package net.yirmiri.excessive_building.block.configurable;

import net.minecraft.block.SlabBlock;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.yirmiri.excessive_building.EBConfig;

public class ResourceBrickSlabBlock extends SlabBlock {
    public ResourceBrickSlabBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_RESOURCE_BRICKS.get();
    }
}
