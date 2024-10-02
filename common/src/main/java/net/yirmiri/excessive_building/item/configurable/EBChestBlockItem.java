package net.yirmiri.excessive_building.item.configurable;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.yirmiri.excessive_building.EBConfig;

public class EBChestBlockItem extends BlockItem {
    public EBChestBlockItem(Block block, Properties settings) {
        super(block, settings);
    }

//    @Override
//    public boolean isEnabled(FeatureSet enable) {
//        return EBConfig.ENABLE_CHEST_VARIANTS.get();
//    }
}
