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
    private static final Identifier TRAIL_RUINS_RARE = Identifier.ofVanilla("gameplay/archaeology/trail_ruins_rare");
    private static final Identifier OCEAN_RUIN_COLD = Identifier.ofVanilla("gameplay/archaeology/ocean_ruin_cold");
    private static final Identifier OCEAN_RUIN_WARM = Identifier.ofVanilla("gameplay/archaeology/ocean_ruin_warm");

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
                            (RandomChanceLootCondition.builder(0.125F)).with(ItemEntry.builder(EBItems.IS_THAT_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (DESERT_PYRAMID.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.125F)).with(ItemEntry.builder(EBItems.ROYALTY_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (DESERT_PYRAMID.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.125F)).with(ItemEntry.builder(EBItems.WRATHFUL_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (DESERT_PYRAMID.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.125F)).with(ItemEntry.builder(EBItems.ANCIENT_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (DESERT_PYRAMID.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.125F)).with(ItemEntry.builder(EBItems.TWINS_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (OCEAN_RUIN_WARM.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.067F)).with(ItemEntry.builder(EBItems.IS_THAT_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (OCEAN_RUIN_COLD.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.067F)).with(ItemEntry.builder(EBItems.IS_THAT_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (OCEAN_RUIN_WARM.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.067F)).with(ItemEntry.builder(EBItems.RING_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (OCEAN_RUIN_COLD.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.067F)).with(ItemEntry.builder(EBItems.SPRITE_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (OCEAN_RUIN_WARM.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.067F)).with(ItemEntry.builder(EBItems.SPRITE_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (OCEAN_RUIN_WARM.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.067F)).with(ItemEntry.builder(EBItems.SNOUT_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (DESERT_WELL.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.25F)).with(ItemEntry.builder(EBItems.DECAY_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (DESERT_WELL.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.25F)).with(ItemEntry.builder(EBItems.IS_THAT_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (DESERT_WELL.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.25F)).with(ItemEntry.builder(EBItems.PORTAL_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (DESERT_WELL.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.25F)).with(ItemEntry.builder(EBItems.CHECKERED_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (DESERT_WELL.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.25F)).with(ItemEntry.builder(EBItems.THIEF_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (OCEAN_RUIN_WARM.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.067F)).with(ItemEntry.builder(EBItems.KOKOS_BUG_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (OCEAN_RUIN_COLD.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.067F)).with(ItemEntry.builder(EBItems.KOKOS_BUG_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (OCEAN_RUIN_COLD.equals(id) && EBConfig.ENABLE_POTTERY_SHERDS.get()) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.067F)).with(ItemEntry.builder(EBItems.BUSTLING_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (TRAIL_RUINS_RARE.equals(id)) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.083F)).with(ItemEntry.builder(EBItems.HEXXED_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (TRAIL_RUINS_RARE.equals(id)) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.083F)).with(ItemEntry.builder(EBItems.IS_THAT_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (TRAIL_RUINS_RARE.equals(id)) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.083F)).with(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (TRAIL_RUINS_RARE.equals(id)) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.083F)).with(ItemEntry.builder(EBItems.LIFE_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (TRAIL_RUINS_RARE.equals(id)) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.083F)).with(ItemEntry.builder(EBItems.ANCIENT_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (TRAIL_RUINS_RARE.equals(id)) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(0.083F)).with(ItemEntry.builder(EBItems.POTTERY_POTTERY_SHERD))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
                builder.pool(poolBuilder.build());
            }
        });

        LootTableEvents.MODIFY.register((resource, builder, id) -> {
            if (TRAIL_RUINS_RARE.equals(id)) { LootPool.Builder poolBuilder = LootPool.builder().conditionally
                            (RandomChanceLootCondition.builder(EBConfig.GLOOM_SEEDS_CHANCE.get())).with(ItemEntry.builder(EBBlocks.GLOOM_SEEDS))
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
