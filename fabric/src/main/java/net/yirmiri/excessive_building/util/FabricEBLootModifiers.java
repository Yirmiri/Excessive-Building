package net.yirmiri.excessive_building.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.yirmiri.excessive_building.core.registry.EBBlocks;
import net.yirmiri.excessive_building.core.registry.EBItems;

public class FabricEBLootModifiers {
    private static final ResourceLocation SNIFFER_DIGGING = BuiltInLootTables.SNIFFER_DIGGING;

    public static void loadLootModifiers() {
        LootTableEvents.MODIFY.register((resourceManager, manager, key, builder, source) -> {
            if (SNIFFER_DIGGING.equals(key)) {
                builder.modifyPools(itemEntry -> itemEntry.with((LootItem.lootTableItem(EBBlocks.ANCIENT_SAPLING.get())).build()));
            }
        });
    }
}
