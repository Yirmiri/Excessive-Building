package net.yirmiri.excessive_building.item;

import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.Item;

public class ConfigurableItem extends Item {

    boolean configValue;

    public ConfigurableItem(boolean configValue, Properties properties) {
        super(properties);
        this.configValue = configValue;
    }

    @Override
    public boolean isEnabled(FeatureFlagSet $$0) {
        return configValue;
    }
}
