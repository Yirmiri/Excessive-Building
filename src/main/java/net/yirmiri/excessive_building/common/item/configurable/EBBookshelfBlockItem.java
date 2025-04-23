package net.yirmiri.excessive_building.common.item.configurable;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.yirmiri.excessive_building.EBConfig;

@Deprecated(forRemoval = true)
public class EBBookshelfBlockItem extends BlockItem {
    public EBBookshelfBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_SHELF_VARIANTS.get();
    }
}
