package net.yirmiri.excessive_building.item.configurable;

import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.yirmiri.excessive_building.EBConfig;

public class DecorativeShelfBlockItem extends BlockItem {
    public DecorativeShelfBlockItem(Block block, Properties settings) {
        super(block, settings);
    }

    @Override
    public boolean isEnabled(FeatureFlagSet enable) {
        return EBConfig.ENABLE_DECORATIVE_SHELVES.get();
    }
}
