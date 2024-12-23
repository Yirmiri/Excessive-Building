package net.yirmiri.excessive_building.util;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.stats.StatFormatter;
import net.minecraft.stats.Stats;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBStats {
    public static final ResourceLocation BLOCKS_HAMMERED = register("blocks_hammered", StatFormatter.DEFAULT);
    public static final ResourceLocation BLOCKS_WRENCHED = register("blocks_wrenched", StatFormatter.DEFAULT);

    private static ResourceLocation register(String id, StatFormatter formatter) {
        ResourceLocation identifier = ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, id);
        Registry.register(BuiltInRegistries.CUSTOM_STAT, id, identifier);
        Stats.CUSTOM.get(identifier, formatter);
        return identifier;
    }

    public static void loadStats() {
    }
}
