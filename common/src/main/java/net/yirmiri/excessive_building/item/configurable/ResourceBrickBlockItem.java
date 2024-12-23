package net.yirmiri.excessive_building.item.configurable;

import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.yirmiri.excessive_building.EBConfig;

public class ResourceBrickBlockItem extends BlockItem {
    public ResourceBrickBlockItem(Block block, Item.Properties settings) {
        super(block, settings);
    }

    @Override
    public boolean isEnabled(FeatureFlagSet enable) {
        return EBConfig.ENABLE_RESOURCE_BRICKS.get();
    }
}
