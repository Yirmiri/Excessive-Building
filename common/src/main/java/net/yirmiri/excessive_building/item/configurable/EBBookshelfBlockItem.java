package net.yirmiri.excessive_building.item.configurable;

import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.yirmiri.excessive_building.EBConfig;

public class EBBookshelfBlockItem extends BlockItem {
    public EBBookshelfBlockItem(Block block, Properties settings) {
        super(block, settings);
    }

    @Override
    public boolean isEnabled(FeatureFlagSet enable) {
        return EBConfig.ENABLE_SHELF_VARIANTS.get();
    }
}
