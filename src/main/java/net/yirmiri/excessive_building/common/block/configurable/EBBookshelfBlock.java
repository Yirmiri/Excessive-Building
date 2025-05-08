package net.yirmiri.excessive_building.common.block.configurable;

import net.minecraft.block.Block;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.yirmiri.excessive_building.EBConfig;

@Deprecated
public class EBBookshelfBlock extends Block {
    public EBBookshelfBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_SHELF_VARIANTS.get();
    }
}
