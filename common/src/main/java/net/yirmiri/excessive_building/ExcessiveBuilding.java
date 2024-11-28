package net.yirmiri.excessive_building;

import net.minecraft.resources.ResourceLocation;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExcessiveBuilding {
    public static final String MOD_ID = "excessive_building";
    public static final String MOD_NAME = "Excessive Building";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        EBBlocks.loadBlocks();
        EBItems.loadItems();
    }

    public static ResourceLocation modIDPath(String id) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, id);
    }
}