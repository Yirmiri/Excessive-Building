package net.yirmiri.excessive_building.block.configurable;

import net.minecraft.world.flag.FeatureFlagSet;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.block.VerticalStairsBlock;

public class ResourceBrickVerticalStairsBlock extends VerticalStairsBlock {
    public ResourceBrickVerticalStairsBlock(Properties settings) {
        super(settings);
    }

    @Override
    public boolean isEnabled(FeatureFlagSet enable) {
        return EBConfig.ENABLE_RESOURCE_BRICKS.get() && EBConfig.ENABLE_VERTICAL_STAIRS.get();
    }
}
