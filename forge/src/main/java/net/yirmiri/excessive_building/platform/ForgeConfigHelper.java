package net.yirmiri.excessive_building.platform;

import net.yirmiri.excessive_building.EBForgeConfig;
import net.yirmiri.excessive_building.platform.services.ConfigHelper;

public class ForgeConfigHelper implements ConfigHelper {
    @Override
    public boolean enableCustomTooltips() {
        return EBForgeConfig.ENABLE_CUSTOM_TOOLTIPS.get();
    }

    @Override
    public boolean enableDecorativeShelves() {
        return EBForgeConfig.ENABLE_DECORATIVE_SHELVES.get();
    }

    @Override
    public boolean enableDecoratives() {
        return EBForgeConfig.ENABLE_DECORATIVES.get();
    }

    @Override
    public boolean enableCraftingTableVariants() {
        return EBForgeConfig.ENABLE_CRAFTING_TABLE_VARIANTS.get();
    }

    @Override
    public boolean enableVerticalStairs() {
        return EBForgeConfig.ENABLE_VERTICAL_STAIRS.get();
    }

    @Override
    public boolean enableAncientSapling() {
        return EBForgeConfig.ENABLE_ANCIENT_SAPLINGS.get();
    }

    @Override
    public boolean enableGloomSeeds() {
        return EBForgeConfig.ENABLE_GLOOM_SEEDS.get();
    }

    @Override
    public boolean enableAsphalt() {
        return EBForgeConfig.ENABLE_ASPHALT.get();
    }

    @Override
    public boolean enableShelfVariants() {
        return EBForgeConfig.ENABLE_SHELF_VARIANTS.get();
    }

    @Override
    public boolean enableLadderVariants() {
        return EBForgeConfig.ENABLE_LADDER_VARIANTS.get();
    }

    @Override
    public boolean enableResourceBricks() {
        return EBForgeConfig.ENABLE_RESOURCE_BRICKS.get();
    }

    @Override
    public boolean enableExcessiveBuildingPotterySherds() {
        return EBForgeConfig.ENABLE_EB_POTTERY_SHERDS.get();
    }
}
