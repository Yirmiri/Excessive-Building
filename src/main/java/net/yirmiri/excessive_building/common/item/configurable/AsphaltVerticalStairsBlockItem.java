package net.yirmiri.excessive_building.common.item.configurable;

import net.minecraft.block.Block;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.yirmiri.excessive_building.EBConfig;

@Deprecated(forRemoval = true)
public class AsphaltVerticalStairsBlockItem extends VerticalStairsBlockItem {
    public AsphaltVerticalStairsBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_ASPHALT.get() && EBConfig.ENABLE_VERTICAL_STAIRS.get();
    }
}
