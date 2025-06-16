package net.yirmiri.excessive_building;

import net.minecraft.resources.ResourceLocation;
import net.yirmiri.excessive_building.core.registry.EBBlocks;
import net.yirmiri.excessive_building.core.registry.EBCreativeTabs;
import net.yirmiri.excessive_building.core.registry.EBItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExcessiveBuilding {
    public static final String MOD_ID = "excessive_building";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        EBBlocks.loadBlocks();
        EBItems.loadItems();
        EBCreativeTabs.loadCreativeTabs();
    }

    public static ResourceLocation modid(String id) {
        return new ResourceLocation(MOD_ID, id);
    }
}