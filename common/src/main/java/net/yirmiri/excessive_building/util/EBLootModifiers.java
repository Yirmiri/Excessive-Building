package net.yirmiri.excessive_building.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EBLootModifiers {
    //MINECRAFT
    public static final Identifier SNIFFER_DIGGING = new Identifier("gameplay/sniffer_digging");
    public static final Identifier TRAIL_RUINS_RARE = new Identifier("archaeology/trail_ruins_rare");
    public static final Identifier DESERT_PYRAMID = new Identifier("archaeology/desert_pyramid");
    public static final Identifier DESERT_WELL = new Identifier("archaeology/desert_well");
    public static final Identifier OCEAN_RUIN_COLD = new Identifier("archaeology/ocean_ruin_cold");
    public static final Identifier OCEAN_RUIN_WARM = new Identifier("archaeology/ocean_ruin_warm");

    public static void replaceLoot() {
        LootTableEvents.REPLACE.register((resourceManager, lootManager, key, original, source) -> {

            if (SNIFFER_DIGGING.equals(key) && EBConfig.ENABLE_ANCIENT_SAPLINGS.get()) {
                List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(ItemEntry.builder(EBBlocks.ANCIENT_SAPLING).build());

                LootPool.Builder lootPool = LootPool.builder().with(entries);
                return LootTable.builder().pool(lootPool).build();
            }

            if (TRAIL_RUINS_RARE.equals(key) && EBConfig.ENABLE_GLOOM_SEEDS.get()) {
                List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(ItemEntry.builder(EBBlocks.GLOOM_SEEDS).build());

                LootPool.Builder lootPool = LootPool.builder().with(entries);
                return LootTable.builder().pool(lootPool).build();
            }

            if (TRAIL_RUINS_RARE.equals(key) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(ItemEntry.builder(EBItems.POTTERY_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.TWINS_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.IS_THAT_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.SPRITE_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.RING_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.ANCIENT_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD).build());

                LootPool.Builder lootPool = LootPool.builder().with(entries);
                return LootTable.builder().pool(lootPool).build();
            }

            if (OCEAN_RUIN_COLD.equals(key) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(ItemEntry.builder(EBItems.FORWARDS_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.IS_THAT_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.KOKOS_BUG_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.PORTAL_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.POTTERY_POTTERY_SHERD).build());

                LootPool.Builder lootPool = LootPool.builder().with(entries);
                return LootTable.builder().pool(lootPool).build();
            }

            if (OCEAN_RUIN_WARM.equals(key) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(ItemEntry.builder(EBItems.POTTERY_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.IS_THAT_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.BUSTLING_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.SNOUT_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.KOKOS_BUG_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD).build());

                LootPool.Builder lootPool = LootPool.builder().with(entries);
                return LootTable.builder().pool(lootPool).build();
            }

            if (DESERT_PYRAMID.equals(key) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(ItemEntry.builder(EBItems.DESTRUCTION_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.WRATHFUL_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.ROYALTY_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.MESMERIZE_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.DECAY_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.LIFE_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.THIEF_POTTERY_SHERD).build());

                LootPool.Builder lootPool = LootPool.builder().with(entries);
                return LootTable.builder().pool(lootPool).build();
            }

            if (DESERT_WELL.equals(key) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(ItemEntry.builder(EBItems.MESMERIZE_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.BITTER_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.TWINS_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.CHECKERED_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.BOIN_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD).build());
                entries.add(ItemEntry.builder(EBItems.HEXXED_POTTERY_SHERD).build());

                LootPool.Builder lootPool = LootPool.builder().with(entries);
                return LootTable.builder().pool(lootPool).build();
            }
            return null;
        });
    }
}
