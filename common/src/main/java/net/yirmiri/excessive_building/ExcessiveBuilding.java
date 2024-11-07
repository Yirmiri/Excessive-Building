package net.yirmiri.excessive_building;

import net.minecraft.resources.ResourceLocation;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExcessiveBuilding {

    public static final String MOD_ID = "excessive_building";
    public static final String MOD_NAME = "Excessive Building";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);


    public static void init() {
        EBItems.register();
        EBBlocks.register();
    }

    public static ResourceLocation id(String name) {
        return new ResourceLocation(MOD_ID, name);
    }
}