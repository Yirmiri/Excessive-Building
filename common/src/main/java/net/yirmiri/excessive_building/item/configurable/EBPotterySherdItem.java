package net.yirmiri.excessive_building.item.configurable;

import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.Item;
import net.yirmiri.excessive_building.EBConfig;

public class EBPotterySherdItem extends Item {
    public EBPotterySherdItem(Properties settings) {
        super(settings);
    }

    @Override
    public boolean isEnabled(FeatureFlagSet enable) {
        return EBConfig.ENABLE_EB_POTTERY_SHERDS.get();
    }
}
