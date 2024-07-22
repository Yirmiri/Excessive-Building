package net.yirmiri.excessive_building.item.configurable;

import net.minecraft.item.Item;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.yirmiri.excessive_building.EBConfig;

public class EBPotterySherdItem extends Item {
    public EBPotterySherdItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_POTTERY_SHERDS.get();
    }
}
