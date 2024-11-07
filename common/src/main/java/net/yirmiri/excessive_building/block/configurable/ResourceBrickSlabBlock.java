package net.yirmiri.excessive_building.block.configurable;

import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.level.block.SlabBlock;
import net.yirmiri.excessive_building.platform.Services;

public class ResourceBrickSlabBlock extends SlabBlock {
    public ResourceBrickSlabBlock(Properties settings) {
        super(settings);
    }

    @Override
    public boolean isEnabled(FeatureFlagSet enable) {
        return Services.CONFIG.enableResourceBricks();
    }
}
