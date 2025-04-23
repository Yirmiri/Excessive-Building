package net.yirmiri.excessive_building.common.item.configurable;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.yirmiri.excessive_building.EBConfig;

@Deprecated(forRemoval = true)
public class BloodrootSaplingItem extends BlockItem {
    public BloodrootSaplingItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_BLOODROOT_SAPLINGS.get();
    }
}
