package net.yirmiri.excessive_building.registry;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.yirmiri.excessive_building.core.registry.EBBlocks;

public class EBFabricLootModifiers {
    private static final ResourceKey<LootTable> SNIFFER_DIGGING_ID = BuiltInLootTables.SNIFFER_DIGGING;

    public static void load() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, wrapperLookup) -> {
            if (SNIFFER_DIGGING_ID.equals(key)) {
                tableBuilder.modifyPools(entry -> entry.with((LootItem.lootTableItem(EBBlocks.ANCIENT_SAPLING.get())).build()));
            }
        });
    }
}
