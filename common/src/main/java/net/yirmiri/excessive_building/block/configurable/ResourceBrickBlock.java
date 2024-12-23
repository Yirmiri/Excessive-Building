package net.yirmiri.excessive_building.block.configurable;

import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.level.block.Block;
import net.yirmiri.excessive_building.EBConfig;

public class ResourceBrickBlock extends Block {
    public ResourceBrickBlock(Properties settings) {
        super(settings);
    }

    @Override
    public boolean isEnabled(FeatureFlagSet enable) {
        return EBConfig.ENABLE_RESOURCE_BRICKS.get();
    }
}
