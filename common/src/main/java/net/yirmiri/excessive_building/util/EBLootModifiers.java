package net.yirmiri.excessive_building.util;
/*
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;

public class EBLootModifiers {
    //MINECRAFT
    public static final ResourceLocation SNIFFER_DIGGING = ResourceLocation.withDefaultNamespace("gameplay/sniffer_digging");
    public static final ResourceLocation TRAIL_RUINS_RARE = ResourceLocation.withDefaultNamespace("archaeology/trail_ruins_rare");
    public static final ResourceLocation DESERT_PYRAMID = ResourceLocation.withDefaultNamespace("archaeology/desert_pyramid");
    public static final ResourceLocation DESERT_WELL = ResourceLocation.withDefaultNamespace("archaeology/desert_well");
    public static final ResourceLocation OCEAN_RUIN_COLD = ResourceLocation.withDefaultNamespace("archaeology/ocean_ruin_cold");
    public static final ResourceLocation OCEAN_RUIN_WARM = ResourceLocation.withDefaultNamespace("archaeology/ocean_ruin_warm");

    public static void modifyLoot() {
        LootTableEvents.MODIFY.register((key, builder, source) -> {
            if (SNIFFER_DIGGING.equals(key.location()) && EBConfig.ENABLE_ANCIENT_SAPLINGS.get()) {
                builder.modifyPools(itemEntry -> {
                    itemEntry.with((LootItem.lootTableItem(EBBlocks.ANCIENT_SAPLING)).build());
                });
            }

            if (TRAIL_RUINS_RARE.equals(key.location()) && EBConfig.ENABLE_GLOOM_SEEDS.get()) {
                builder.modifyPools(itemEntry -> {
                    itemEntry.with((LootItem.lootTableItem(EBBlocks.GLOOM_SEEDS)).build());
                });
            }

            if (TRAIL_RUINS_RARE.equals(key.location()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                builder.modifyPools(itemEntry -> {
                    itemEntry.with(LootItem.lootTableItem(EBItems.POTTERY_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.TWINS_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.IS_THAT_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.SPRITE_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.RING_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.ANCIENT_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.KITTEH_POTTERY_SHERD).build());
                });
            }

            if (OCEAN_RUIN_COLD.equals(key.location()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                builder.modifyPools(itemEntry -> {
                    itemEntry.with(LootItem.lootTableItem(EBItems.POTTERY_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.FORWARDS_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.IS_THAT_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.KOKOS_BUG_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.KITTEH_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.PORTAL_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.POTTERY_POTTERY_SHERD).build());
                });
            }

            if (OCEAN_RUIN_WARM.equals(key.location()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                builder.modifyPools(itemEntry -> {
                    itemEntry.with(LootItem.lootTableItem(EBItems.POTTERY_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.POTTERY_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.IS_THAT_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.BUSTLING_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.SNOUT_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.KOKOS_BUG_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.KITTEH_POTTERY_SHERD).build());
                });
            }

            if (DESERT_PYRAMID.equals(key.location()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                builder.modifyPools(itemEntry -> {
                    itemEntry.with(LootItem.lootTableItem(EBItems.POTTERY_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.DESTRUCTION_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.WRATHFUL_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.ROYALTY_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.MESMERIZE_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.DECAY_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.LIFE_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.KITTEH_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.THIEF_POTTERY_SHERD).build());
                });
            }

            if (DESERT_WELL.equals(key.location()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                    builder.modifyPools(itemEntry -> {
                        itemEntry.with(LootItem.lootTableItem(EBItems.POTTERY_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.MESMERIZE_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.BITTER_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.TWINS_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.CHECKERED_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.BOIN_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.KITTEH_POTTERY_SHERD).build())
                        .with(LootItem.lootTableItem(EBItems.HEXXED_POTTERY_SHERD).build());
                    });
            }
        });
    }
}
 */
