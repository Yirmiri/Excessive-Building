package net.yirmiri.excessive_building.block.configurable;

import net.minecraft.world.flag.FeatureFlagSet;
import net.yirmiri.excessive_building.platform.Services;

public class ResourceBrickVerticalStairsBlock extends VerticalStairsBlock {
    public ResourceBrickVerticalStairsBlock(Properties settings) {
        super(settings);
    }

    @Override
    public boolean isEnabled(FeatureFlagSet enable) {
        return Services.CONFIG.enableResourceBricks() && Services.CONFIG.enableVerticalStairs();
    }
}
