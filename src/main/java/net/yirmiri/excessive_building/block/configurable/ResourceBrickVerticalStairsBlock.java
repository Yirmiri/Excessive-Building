package net.yirmiri.excessive_building.block.configurable;

import net.minecraft.resource.featuretoggle.FeatureSet;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.block.VerticalStairsBlock;

public class ResourceBrickVerticalStairsBlock extends VerticalStairsBlock {
    public ResourceBrickVerticalStairsBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_RESOURCE_BRICKS.get();
    }
}
