package net.yirmiri.excessive_building.item.configurable;

import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.level.block.Block;
import net.yirmiri.excessive_building.EBConfig;

public class AsphaltVerticalStairsBlockItem extends VerticalStairsBlockItem {
    public AsphaltVerticalStairsBlockItem(Block block, Properties settings) {
        super(block, settings);
    }

    @Override
    public boolean isEnabled(FeatureFlagSet enable) {
        return EBConfig.ENABLE_ASPHALT.get() && EBConfig.ENABLE_VERTICAL_STAIRS.get();
    }
}
