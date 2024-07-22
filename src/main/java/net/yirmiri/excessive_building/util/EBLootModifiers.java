package net.yirmiri.excessive_building.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;

public class EBLootModifiers {
    //MINECRAFT
    private static final Identifier SNIFFER_DIGGING = Identifier.ofVanilla("gameplay/sniffer_digging");
    private static final Identifier DESERT_PYRAMID = Identifier.ofVanilla("gameplay/archaeology/desert_pyramid");
    private static final Identifier DESERT_WELL = Identifier.ofVanilla("gameplay/archaeology/desert_well");

    public static void modifyLoot() {
        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (SNIFFER_DIGGING.equals(id) && EBConfig.ENABLE_ANCIENT_SAPLINGS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(EBConfig.ANCIENT_SAPLING_CHANCE.get())).with(ItemEntry.builder(EBBlocks.ANCIENT_SAPLING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (DESERT_PYRAMID.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                                (RandomChanceLootCondition.builder(0.125F)).with(ItemEntry.builder(EBItems.THIEF_POTTERY_SHERD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (DESERT_PYRAMID.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.125F)).with(ItemEntry.builder(EBItems.FORWARDS_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (DESERT_PYRAMID.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.125F)).with(ItemEntry.builder(EBItems.DESTRUCTION_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (DESERT_PYRAMID.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.125F)).with(ItemEntry.builder(EBItems.MESMERIZE_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (DESERT_WELL.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.25F)).with(ItemEntry.builder(EBItems.BOIN_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (DESERT_WELL.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.25F)).with(ItemEntry.builder(EBItems.BITTER_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });
    }
}
