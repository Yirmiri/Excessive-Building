package net.yirmiri.excessive_building.item.configurable;

import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.yirmiri.excessive_building.EBConfig;

public class EBCraftingTableBlockItem extends BlockItem {
    public EBCraftingTableBlockItem(Block block, Properties settings) {
        super(block, settings);
    }

    @Override
    public boolean isEnabled(FeatureFlagSet enable) {
        return EBConfig.ENABLE_CRAFTING_TABLE_VARIANTS.get();
    }
}
