package net.yirmiri.excessive_building.item;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.yirmiri.excessive_building.EBConfig;

public class AncientSaplingBlockItem extends BlockItem {
    public AncientSaplingBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_ANCIENT_SAPLINGS.get();
    }
}
