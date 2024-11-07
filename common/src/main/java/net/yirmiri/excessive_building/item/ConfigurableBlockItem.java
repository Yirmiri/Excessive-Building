package net.yirmiri.excessive_building.item;

import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

import java.util.Optional;

public class ConfigurableBlockItem extends BlockItem {
    boolean configValue;
    Optional<Boolean> optionalConfigValue;

    public ConfigurableBlockItem(boolean configValue, Optional<Boolean> optionalConfigValue,  Block block, Properties properties) {
        super(block, properties);
        this.configValue = configValue;
        this.optionalConfigValue = optionalConfigValue;
    }

    @Override
    public boolean isEnabled(FeatureFlagSet $$0) {
        if (optionalConfigValue.isEmpty()) {
            return configValue;
        } else {
            return configValue && optionalConfigValue.get();
        }
    }
}
