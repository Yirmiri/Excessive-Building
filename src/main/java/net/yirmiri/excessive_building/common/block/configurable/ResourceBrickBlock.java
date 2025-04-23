package net.yirmiri.excessive_building.common.block.configurable;

import net.minecraft.block.Block;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.yirmiri.excessive_building.EBConfig;

@Deprecated(forRemoval = true)
public class ResourceBrickBlock extends Block {
    public ResourceBrickBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_RESOURCE_BRICKS.get();
    }
}
