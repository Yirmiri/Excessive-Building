package net.yirmiri.excessive_building.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;

public class EBLootModifiers {
    //MINECRAFT
    public static final Identifier SNIFFER_DIGGING = Identifier.ofVanilla("gameplay/sniffer_digging");
    public static final Identifier TRAIL_RUINS_RARE = Identifier.ofVanilla("archaeology/trail_ruins_rare");
    public static final Identifier DESERT_PYRAMID = Identifier.ofVanilla("archaeology/desert_pyramid");
    public static final Identifier DESERT_WELL = Identifier.ofVanilla("archaeology/desert_well");
    public static final Identifier OCEAN_RUIN_COLD = Identifier.ofVanilla("archaeology/ocean_ruin_cold");
    public static final Identifier OCEAN_RUIN_WARM = Identifier.ofVanilla("archaeology/ocean_ruin_warm");

    public static void modifyLoot() {
        LootTableEvents.MODIFY.register((key, builder, source) -> {
            if (SNIFFER_DIGGING.equals(key.getValue()) && EBConfig.ENABLE_ANCIENT_SAPLINGS.get()) {
                builder.modifyPools(itemEntry -> {
                    itemEntry.with((ItemEntry.builder(EBBlocks.ANCIENT_SAPLING)).build());
                });
            }

            if (TRAIL_RUINS_RARE.equals(key.getValue()) && EBConfig.ENABLE_GLOOM_SEEDS.get()) {
                builder.modifyPools(itemEntry -> {
                    itemEntry.with((ItemEntry.builder(EBBlocks.GLOOM_SEEDS)).build());
                });
            }

            if (TRAIL_RUINS_RARE.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                builder.modifyPools(itemEntry -> {
                    itemEntry.with(ItemEntry.builder(EBItems.POTTERY_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.TWINS_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.IS_THAT_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.SPRITE_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.RING_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.ANCIENT_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD).build());
                });
            }

            if (OCEAN_RUIN_COLD.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                builder.modifyPools(itemEntry -> {
                    itemEntry.with(ItemEntry.builder(EBItems.POTTERY_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.FORWARDS_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.IS_THAT_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.KOKOS_BUG_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.PORTAL_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.POTTERY_POTTERY_SHERD).build());
                });
            }

            if (OCEAN_RUIN_WARM.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                builder.modifyPools(itemEntry -> {
                    itemEntry.with(ItemEntry.builder(EBItems.POTTERY_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.POTTERY_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.IS_THAT_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.BUSTLING_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.SNOUT_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.KOKOS_BUG_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD).build());
                });
            }

            if (DESERT_PYRAMID.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                builder.modifyPools(itemEntry -> {
                    itemEntry.with(ItemEntry.builder(EBItems.POTTERY_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.DESTRUCTION_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.WRATHFUL_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.ROYALTY_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.MESMERIZE_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.DECAY_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.LIFE_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.THIEF_POTTERY_SHERD).build());
                });
            }

            if (DESERT_WELL.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                    builder.modifyPools(itemEntry -> {
                        itemEntry.with(ItemEntry.builder(EBItems.POTTERY_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.MESMERIZE_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.BITTER_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.TWINS_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.CHECKERED_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.BOIN_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD).build())
                        .with(ItemEntry.builder(EBItems.HEXXED_POTTERY_SHERD).build());
                    });
            }
        });
    }
}
