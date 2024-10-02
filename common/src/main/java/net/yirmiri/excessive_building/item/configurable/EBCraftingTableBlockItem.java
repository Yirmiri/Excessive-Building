package net.yirmiri.excessive_building.item.configurable;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.yirmiri.excessive_building.EBConfig;

public class EBCraftingTableBlockItem extends BlockItem {
    public EBCraftingTableBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_CRAFTING_TABLE_VARIANTS.get();
    }
}
