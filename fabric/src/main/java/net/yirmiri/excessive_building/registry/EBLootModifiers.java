package net.yirmiri.excessive_building.registry;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.yirmiri.excessive_building.EBConfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EBLootModifiers {
    //MINECRAFT
    public static final ResourceLocation SNIFFER_DIGGING = new ResourceLocation("gameplay/sniffer_digging");
    public static final ResourceLocation TRAIL_RUINS_RARE = new ResourceLocation("archaeology/trail_ruins_rare");
    public static final ResourceLocation DESERT_PYRAMID = new ResourceLocation("archaeology/desert_pyramid");
    public static final ResourceLocation DESERT_WELL = new ResourceLocation("archaeology/desert_well");
    public static final ResourceLocation OCEAN_RUIN_COLD = new ResourceLocation("archaeology/ocean_ruin_cold");
    public static final ResourceLocation OCEAN_RUIN_WARM = new ResourceLocation("archaeology/ocean_ruin_warm");

    public static void replaceLoot() {
        LootTableEvents.REPLACE.register((resourceManager, lootManager, key, original, source) -> {

            if (SNIFFER_DIGGING.equals(key) && EBConfig.ENABLE_ANCIENT_SAPLINGS.get()) {
                List<LootPoolEntryContainer> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(LootItem.lootTableItem(EBBlocks.ANCIENT_SAPLING).build());

                LootPool.Builder lootPool = LootPool.lootPool().with(entries);
                return LootTable.lootTable().withPool(lootPool).build();
            }

            if (TRAIL_RUINS_RARE.equals(key) && EBConfig.ENABLE_GLOOM_SEEDS.get()) {
                List<LootPoolEntryContainer> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(LootItem.lootTableItem(EBBlocks.GLOOM_SEEDS).build());

                LootPool.Builder lootPool = LootPool.lootPool().with(entries);
                return LootTable.lootTable().withPool(lootPool).build();
            }

            if (TRAIL_RUINS_RARE.equals(key) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                List<LootPoolEntryContainer> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(LootItem.lootTableItem(EBItems.POTTERY_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.TWINS_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.IS_THAT_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.SPRITE_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.RING_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.ANCIENT_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.KITTEH_POTTERY_SHERD).build());

                LootPool.Builder lootPool = LootPool.lootPool().with(entries);
                return LootTable.lootTable().withPool(lootPool).build();
            }

            if (OCEAN_RUIN_COLD.equals(key) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                List<LootPoolEntryContainer> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(LootItem.lootTableItem(EBItems.FORWARDS_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.IS_THAT_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.KOKOS_BUG_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.KITTEH_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.PORTAL_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.POTTERY_POTTERY_SHERD).build());

                LootPool.Builder lootPool = LootPool.lootPool().with(entries);
                return LootTable.lootTable().withPool(lootPool).build();
            }

            if (OCEAN_RUIN_WARM.equals(key) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                List<LootPoolEntryContainer> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(LootItem.lootTableItem(EBItems.POTTERY_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.IS_THAT_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.BUSTLING_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.SNOUT_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.KOKOS_BUG_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.KITTEH_POTTERY_SHERD).build());

                LootPool.Builder lootPool = LootPool.lootPool().with(entries);
                return LootTable.lootTable().withPool(lootPool).build();
            }

            if (DESERT_PYRAMID.equals(key) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                List<LootPoolEntryContainer> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(LootItem.lootTableItem(EBItems.DESTRUCTION_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.WRATHFUL_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.ROYALTY_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.MESMERIZE_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.DECAY_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.LIFE_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.KITTEH_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.THIEF_POTTERY_SHERD).build());

                LootPool.Builder lootPool = LootPool.lootPool().with(entries);
                return LootTable.lootTable().withPool(lootPool).build();
            }

            if (DESERT_WELL.equals(key) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                List<LootPoolEntryContainer> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(LootItem.lootTableItem(EBItems.MESMERIZE_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.BITTER_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.TWINS_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.CHECKERED_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.BOIN_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.KITTEH_POTTERY_SHERD).build());
                entries.add(LootItem.lootTableItem(EBItems.HEXXED_POTTERY_SHERD).build());

                LootPool.Builder lootPool = LootPool.lootPool().with(entries);
                return LootTable.lootTable().withPool(lootPool).build();
            }
            return null;
        });
    }
}
