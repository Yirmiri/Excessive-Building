package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;

import java.util.concurrent.CompletableFuture;

public class EBLootTableGen extends FabricBlockLootTableProvider {
    public EBLootTableGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> future) {
        super(output);
    }

    @Override
    public void generate() {
        dropSelf(EBBlocks.OAK_MOSAIC);
        dropSelf(EBBlocks.OAK_MOSAIC_STAIRS);
        add(EBBlocks.OAK_MOSAIC_SLAB, createSlabItemTable(EBBlocks.OAK_MOSAIC_SLAB));
        dropSelf(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS);
        dropSelf(EBBlocks.SPRUCE_MOSAIC);
        dropSelf(EBBlocks.SPRUCE_MOSAIC_STAIRS);
        add(EBBlocks.SPRUCE_MOSAIC_SLAB, createSlabItemTable(EBBlocks.SPRUCE_MOSAIC_SLAB));
        dropSelf(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS);
        dropSelf(EBBlocks.BIRCH_MOSAIC);
        dropSelf(EBBlocks.BIRCH_MOSAIC_STAIRS);
        add(EBBlocks.BIRCH_MOSAIC_SLAB, createSlabItemTable(EBBlocks.BIRCH_MOSAIC_SLAB));
        dropSelf(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS);
        dropSelf(EBBlocks.JUNGLE_MOSAIC);
        dropSelf(EBBlocks.JUNGLE_MOSAIC_STAIRS);
        add(EBBlocks.JUNGLE_MOSAIC_SLAB, createSlabItemTable(EBBlocks.JUNGLE_MOSAIC_SLAB));
        dropSelf(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS);
        dropSelf(EBBlocks.ACACIA_MOSAIC);
        dropSelf(EBBlocks.ACACIA_MOSAIC_STAIRS);
        add(EBBlocks.ACACIA_MOSAIC_SLAB, createSlabItemTable(EBBlocks.ACACIA_MOSAIC_SLAB));
        dropSelf(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS);
        dropSelf(EBBlocks.DARK_OAK_MOSAIC);
        dropSelf(EBBlocks.DARK_OAK_MOSAIC_STAIRS);
        add(EBBlocks.DARK_OAK_MOSAIC_SLAB, createSlabItemTable(EBBlocks.DARK_OAK_MOSAIC_SLAB));
        dropSelf(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS);
        dropSelf(EBBlocks.MANGROVE_MOSAIC);
        dropSelf(EBBlocks.MANGROVE_MOSAIC_STAIRS);
        add(EBBlocks.MANGROVE_MOSAIC_SLAB, createSlabItemTable(EBBlocks.MANGROVE_MOSAIC_SLAB));
        dropSelf(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS);
        dropSelf(EBBlocks.CHERRY_MOSAIC);
        dropSelf(EBBlocks.CHERRY_MOSAIC_STAIRS);
        add(EBBlocks.CHERRY_MOSAIC_SLAB, createSlabItemTable(EBBlocks.CHERRY_MOSAIC_SLAB));
        dropSelf(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS);
        dropSelf(EBBlocks.CRIMSON_MOSAIC);
        dropSelf(EBBlocks.CRIMSON_MOSAIC_STAIRS);
        add(EBBlocks.CRIMSON_MOSAIC_SLAB, createSlabItemTable(EBBlocks.CRIMSON_MOSAIC_SLAB));
        dropSelf(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS);
        dropSelf(EBBlocks.WARPED_MOSAIC);
        dropSelf(EBBlocks.WARPED_MOSAIC_STAIRS);
        add(EBBlocks.WARPED_MOSAIC_SLAB, createSlabItemTable(EBBlocks.WARPED_MOSAIC_SLAB));
        dropSelf(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS);
        dropSelf(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS);
        dropSelf(EBBlocks.COBBLESTONE_BRICKS);
        dropSelf(EBBlocks.COBBLESTONE_BRICK_STAIRS);
        dropSelf(EBBlocks.COBBLESTONE_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.COBBLESTONE_BRICK_SLAB, createSlabItemTable(EBBlocks.COBBLESTONE_BRICK_SLAB));
        dropSelf(EBBlocks.CRACKED_COBBLESTONE_BRICKS);
        dropSelf(EBBlocks.MOSSY_COBBLESTONE_BRICKS);
        dropSelf(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS);
        dropSelf(EBBlocks.MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB, createSlabItemTable(EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB));
        dropSelf(EBBlocks.COBBLED_DEEPSLATE_BRICKS);
        dropSelf(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS);
        dropSelf(EBBlocks.COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB, createSlabItemTable(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB));
        dropSelf(EBBlocks.CRACKED_COBBLED_DEEPSLATE_BRICKS);
        dropSelf(EBBlocks.BLACKSTONE_BRICKS);
        dropSelf(EBBlocks.BLACKSTONE_BRICK_STAIRS);
        dropSelf(EBBlocks.BLACKSTONE_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.BLACKSTONE_BRICK_SLAB, createSlabItemTable(EBBlocks.BLACKSTONE_BRICK_SLAB));
        dropSelf(EBBlocks.CRACKED_BLACKSTONE_BRICKS);
        dropSelf(EBBlocks.BLACKSTONE_BRICK_WALL);
        dropSelf(EBBlocks.COBBLESTONE_BRICK_WALL);
        dropSelf(EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL);
        dropSelf(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL);
        dropSelf(EBBlocks.ANCIENT_PLANKS);
        dropSelf(EBBlocks.ANCIENT_STAIRS);
        dropSelf(EBBlocks.ANCIENT_VERTICAL_STAIRS);
        add(EBBlocks.ANCIENT_SLAB, createSlabItemTable(EBBlocks.ANCIENT_SLAB));
        dropSelf(EBBlocks.ANCIENT_MOSAIC);
        dropSelf(EBBlocks.ANCIENT_MOSAIC_STAIRS);
        dropSelf(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS);
        add(EBBlocks.ANCIENT_MOSAIC_SLAB, createSlabItemTable(EBBlocks.ANCIENT_MOSAIC_SLAB));
        dropSelf(EBBlocks.ANCIENT_FENCE);
        dropSelf(EBBlocks.ANCIENT_FENCE_GATE);
        dropSelf(EBBlocks.ANCIENT_BUTTON);
        dropSelf(EBBlocks.ANCIENT_PRESSURE_PLATE);
        createDoorTable(EBBlocks.ANCIENT_DOOR);
        dropSelf(EBBlocks.ANCIENT_TRAPDOOR);
        dropSelf(EBBlocks.ANCIENT_LOG);
        dropSelf(EBBlocks.ANCIENT_WOOD);
        dropSelf(EBBlocks.STRIPPED_ANCIENT_LOG);
        dropSelf(EBBlocks.STRIPPED_ANCIENT_WOOD);
        dropSelf(EBBlocks.ANCIENT_SAPLING);
        dropPottedContents(EBBlocks.POTTED_ANCIENT_SAPLING);
        dropSelf(EBBlocks.CHISELED_ANCIENT_PLANKS);
        dropSelf(EBBlocks.CHISELED_OAK_PLANKS);
        dropSelf(EBBlocks.CHISELED_SPRUCE_PLANKS);
        dropSelf(EBBlocks.CHISELED_BIRCH_PLANKS);
        dropSelf(EBBlocks.CHISELED_JUNGLE_PLANKS);
        dropSelf(EBBlocks.CHISELED_ACACIA_PLANKS);
        dropSelf(EBBlocks.CHISELED_DARK_OAK_PLANKS);
        dropSelf(EBBlocks.CHISELED_MANGROVE_PLANKS);
        dropSelf(EBBlocks.CHISELED_CHERRY_PLANKS);
        dropSelf(EBBlocks.CHISELED_BAMBOO_PLANKS);
        dropSelf(EBBlocks.CHISELED_CRIMSON_PLANKS);
        dropSelf(EBBlocks.CHISELED_WARPED_PLANKS);
        dropSelf(EBBlocks.GLOOM_PLANKS);
        dropSelf(EBBlocks.GLOOM_STAIRS);
        dropSelf(EBBlocks.GLOOM_MOSAIC_STAIRS);
        dropSelf(EBBlocks.GLOOM_MOSAIC_VERTICAL_STAIRS);
        add(EBBlocks.GLOOM_SLAB, createSlabItemTable(EBBlocks.GLOOM_SLAB));
        dropSelf(EBBlocks.GLOOM_MOSAIC);
        dropSelf(EBBlocks.GLOOM_MOSAIC_STAIRS);
        add(EBBlocks.GLOOM_MOSAIC_SLAB, createSlabItemTable(EBBlocks.GLOOM_MOSAIC_SLAB));
        dropSelf(EBBlocks.GLOOM_FENCE);
        dropSelf(EBBlocks.GLOOM_FENCE_GATE);
        dropSelf(EBBlocks.GLOOM_BUTTON);
        dropSelf(EBBlocks.GLOOM_PRESSURE_PLATE);
        createDoorTable(EBBlocks.GLOOM_DOOR);
        dropSelf(EBBlocks.GLOOM_TRAPDOOR);
        dropSelf(EBBlocks.GLOOM_LOG);
        dropSelf(EBBlocks.GLOOM_WOOD);
        dropSelf(EBBlocks.STRIPPED_GLOOM_LOG);
        dropSelf(EBBlocks.STRIPPED_GLOOM_WOOD);
        dropSelf(EBBlocks.CHISELED_GLOOM_PLANKS);
        dropSelf(EBBlocks.COPPER_BRICKS);
        dropSelf(EBBlocks.COPPER_BRICK_STAIRS);
        dropSelf(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.COPPER_BRICK_SLAB, createSlabItemTable(EBBlocks.COPPER_BRICK_SLAB));
        dropSelf(EBBlocks.EXPOSED_COPPER_BRICKS);
        dropSelf(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS);
        dropSelf(EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.EXPOSED_COPPER_BRICK_SLAB, createSlabItemTable(EBBlocks.EXPOSED_COPPER_BRICK_SLAB));
        dropSelf(EBBlocks.WEATHERED_COPPER_BRICKS);
        dropSelf(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS);
        dropSelf(EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.WEATHERED_COPPER_BRICK_SLAB, createSlabItemTable(EBBlocks.WEATHERED_COPPER_BRICK_SLAB));
        dropSelf(EBBlocks.OXIDIZED_COPPER_BRICKS);
        dropSelf(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS);
        dropSelf(EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB, createSlabItemTable(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB));
        dropSelf(EBBlocks.WAXED_COPPER_BRICKS);
        dropSelf(EBBlocks.WAXED_COPPER_BRICK_STAIRS);
        dropSelf(EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.WAXED_COPPER_BRICK_SLAB, createSlabItemTable(EBBlocks.WAXED_COPPER_BRICK_SLAB));
        dropSelf(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS);
        dropSelf(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS);
        dropSelf(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB, createSlabItemTable(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB));
        dropSelf(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS);
        dropSelf(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS);
        dropSelf(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB, createSlabItemTable(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB));
        dropSelf(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS);
        dropSelf(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS);
        dropSelf(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB, createSlabItemTable(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB));
        dropSelf(EBBlocks.IRON_BRICKS);
        dropSelf(EBBlocks.IRON_BRICK_STAIRS);
        dropSelf(EBBlocks.IRON_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.IRON_BRICK_SLAB, createSlabItemTable(EBBlocks.IRON_BRICK_SLAB));
        dropSelf(EBBlocks.GOLD_BRICKS);
        dropSelf(EBBlocks.GOLD_BRICK_STAIRS);
        dropSelf(EBBlocks.GOLD_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.GOLD_BRICK_SLAB, createSlabItemTable(EBBlocks.GOLD_BRICK_SLAB));
        dropSelf(EBBlocks.LAPIS_BRICKS);
        dropSelf(EBBlocks.LAPIS_BRICK_STAIRS);
        dropSelf(EBBlocks.LAPIS_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.LAPIS_BRICK_SLAB, createSlabItemTable(EBBlocks.LAPIS_BRICK_SLAB));
        dropSelf(EBBlocks.EMERALD_BRICKS);
        dropSelf(EBBlocks.EMERALD_BRICK_STAIRS);
        dropSelf(EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.EMERALD_BRICK_SLAB, createSlabItemTable(EBBlocks.EMERALD_BRICK_SLAB));
        dropSelf(EBBlocks.DIAMOND_BRICKS);
        dropSelf(EBBlocks.DIAMOND_BRICK_STAIRS);
        dropSelf(EBBlocks.DIAMOND_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.DIAMOND_BRICK_SLAB, createSlabItemTable(EBBlocks.DIAMOND_BRICK_SLAB));
        dropSelf(EBBlocks.NETHERITE_BRICKS);
        dropSelf(EBBlocks.NETHERITE_BRICK_STAIRS);
        dropSelf(EBBlocks.NETHERITE_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.NETHERITE_BRICK_SLAB, createSlabItemTable(EBBlocks.NETHERITE_BRICK_SLAB));
        dropWhenSilkTouch(EBBlocks.SEA_GLASS);
        dropWhenSilkTouch(EBBlocks.VERDANT_SEA_GLASS);
        dropWhenSilkTouch(EBBlocks.ROSE_SEA_GLASS);
        dropWhenSilkTouch(EBBlocks.AQUA_SEA_GLASS);
        dropWhenSilkTouch(EBBlocks.SCARLET_SEA_GLASS);
        dropWhenSilkTouch(EBBlocks.FUCHSIA_SEA_GLASS);
        dropWhenSilkTouch(EBBlocks.SEA_GLASS_PANE);
        dropWhenSilkTouch(EBBlocks.VERDANT_SEA_GLASS_PANE);
        dropWhenSilkTouch(EBBlocks.ROSE_SEA_GLASS_PANE);
        dropWhenSilkTouch(EBBlocks.AQUA_SEA_GLASS_PANE);
        dropWhenSilkTouch(EBBlocks.SCARLET_SEA_GLASS_PANE);
        dropWhenSilkTouch(EBBlocks.FUCHSIA_SEA_GLASS_PANE);
        dropSelf(EBBlocks.BONE_BRICKS);
        dropSelf(EBBlocks.BONE_BRICK_STAIRS);
        dropSelf(EBBlocks.BONE_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.BONE_BRICK_SLAB, createSlabItemTable(EBBlocks.BONE_BRICK_SLAB));
        dropSelf(EBBlocks.BONE_BRICK_WALL);
        dropSelf(EBBlocks.SOUL_MAGMA_BLOCK);
        dropSelf(EBBlocks.SOUL_SANDSTONE);
        dropSelf(EBBlocks.SOUL_SANDSTONE_STAIRS);
        dropSelf(EBBlocks.SOUL_SANDSTONE_VERTICAL_STAIRS);
        add(EBBlocks.SOUL_SANDSTONE_SLAB, createSlabItemTable(EBBlocks.SOUL_SANDSTONE_SLAB));
        dropSelf(EBBlocks.SOUL_SANDSTONE_WALL);
        dropSelf(EBBlocks.CHISELED_SOUL_SANDSTONE);
        dropSelf(EBBlocks.CUT_SOUL_SANDSTONE);
        dropSelf(EBBlocks.CUT_SOUL_SANDSTONE_SLAB);
        dropSelf(EBBlocks.SMOOTH_SOUL_SANDSTONE);
        dropSelf(EBBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS);
        dropSelf(EBBlocks.SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS);
        add(EBBlocks.SMOOTH_SOUL_SANDSTONE_SLAB, createSlabItemTable(EBBlocks.SMOOTH_SOUL_SANDSTONE_SLAB));
        dropSelf(EBBlocks.POLISHED_SANDSTONE);
        dropSelf(EBBlocks.POLISHED_SANDSTONE_STAIRS);
        dropSelf(EBBlocks.POLISHED_SANDSTONE_VERTICAL_STAIRS);
        add(EBBlocks.POLISHED_SANDSTONE_SLAB, createSlabItemTable(EBBlocks.POLISHED_SANDSTONE_SLAB));
        dropSelf(EBBlocks.POLISHED_SANDSTONE_WALL);
        dropSelf(EBBlocks.SANDSTONE_BRICKS);
        dropSelf(EBBlocks.SANDSTONE_BRICK_STAIRS);
        dropSelf(EBBlocks.SANDSTONE_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.SANDSTONE_BRICK_SLAB, createSlabItemTable(EBBlocks.SANDSTONE_BRICK_SLAB));
        dropSelf(EBBlocks.SANDSTONE_BRICK_WALL);
        dropSelf(EBBlocks.SANDSTONE_TILES);
        dropSelf(EBBlocks.SANDSTONE_TILE_STAIRS);
        dropSelf(EBBlocks.SANDSTONE_TILE_VERTICAL_STAIRS);
        add(EBBlocks.SANDSTONE_TILE_SLAB, createSlabItemTable(EBBlocks.SANDSTONE_TILE_SLAB));
        dropSelf(EBBlocks.SANDSTONE_TILE_WALL);
        dropSelf(EBBlocks.CHISELED_SANDSTONE_BRICKS);
        dropSelf(EBBlocks.DECORATED_SANDSTONE_BRICKS);
        dropSelf(EBBlocks.ENGRAVED_SANDSTONE_BRICKS);
        dropSelf(EBBlocks.SANDSTONE_PILLAR);
        dropSelf(EBBlocks.POLISHED_RED_SANDSTONE);
        dropSelf(EBBlocks.POLISHED_RED_SANDSTONE_STAIRS);
        dropSelf(EBBlocks.POLISHED_RED_SANDSTONE_VERTICAL_STAIRS);
        add(EBBlocks.POLISHED_RED_SANDSTONE_SLAB, createSlabItemTable(EBBlocks.POLISHED_RED_SANDSTONE_SLAB));
        dropSelf(EBBlocks.POLISHED_RED_SANDSTONE_WALL);
        dropSelf(EBBlocks.RED_SANDSTONE_BRICKS);
        dropSelf(EBBlocks.RED_SANDSTONE_BRICK_STAIRS);
        dropSelf(EBBlocks.RED_SANDSTONE_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.RED_SANDSTONE_BRICK_SLAB, createSlabItemTable(EBBlocks.RED_SANDSTONE_BRICK_SLAB));
        dropSelf(EBBlocks.RED_SANDSTONE_BRICK_WALL);
        dropSelf(EBBlocks.RED_SANDSTONE_TILES);
        dropSelf(EBBlocks.RED_SANDSTONE_TILE_STAIRS);
        dropSelf(EBBlocks.RED_SANDSTONE_TILE_VERTICAL_STAIRS);
        add(EBBlocks.RED_SANDSTONE_TILE_SLAB, createSlabItemTable(EBBlocks.RED_SANDSTONE_TILE_SLAB));
        dropSelf(EBBlocks.RED_SANDSTONE_TILE_WALL);
        dropSelf(EBBlocks.CHISELED_RED_SANDSTONE_BRICKS);
        dropSelf(EBBlocks.DECORATED_RED_SANDSTONE_BRICKS);
        dropSelf(EBBlocks.ENGRAVED_RED_SANDSTONE_BRICKS);
        dropSelf(EBBlocks.RED_SANDSTONE_PILLAR);
        dropSelf(EBBlocks.POLISHED_SOUL_SANDSTONE);
        dropSelf(EBBlocks.POLISHED_SOUL_SANDSTONE_STAIRS);
        dropSelf(EBBlocks.POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS);
        add(EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB, createSlabItemTable(EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB));
        dropSelf(EBBlocks.POLISHED_SOUL_SANDSTONE_WALL);
        dropSelf(EBBlocks.SOUL_SANDSTONE_BRICKS);
        dropSelf(EBBlocks.SOUL_SANDSTONE_BRICK_STAIRS);
        dropSelf(EBBlocks.SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB, createSlabItemTable(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB));
        dropSelf(EBBlocks.SOUL_SANDSTONE_BRICK_WALL);
        dropSelf(EBBlocks.SOUL_SANDSTONE_TILES);
        dropSelf(EBBlocks.SOUL_SANDSTONE_TILE_STAIRS);
        dropSelf(EBBlocks.SOUL_SANDSTONE_TILE_VERTICAL_STAIRS);
        add(EBBlocks.SOUL_SANDSTONE_TILE_SLAB, createSlabItemTable(EBBlocks.SOUL_SANDSTONE_TILE_SLAB));
        dropSelf(EBBlocks.SOUL_SANDSTONE_TILE_WALL);
        dropSelf(EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS);
        dropSelf(EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS);
        dropSelf(EBBlocks.ENGRAVED_SOUL_SANDSTONE_BRICKS);
        dropSelf(EBBlocks.SOUL_SANDSTONE_PILLAR);
        dropSelf(EBBlocks.SPRUCE_LADDER);
        dropSelf(EBBlocks.BIRCH_LADDER);
        dropSelf(EBBlocks.JUNGLE_LADDER);
        dropSelf(EBBlocks.ACACIA_LADDER);
        dropSelf(EBBlocks.DARK_OAK_LADDER);
        dropSelf(EBBlocks.MANGROVE_LADDER);
        dropSelf(EBBlocks.BAMBOO_LADDER);
        dropSelf(EBBlocks.CRIMSON_LADDER);
        dropSelf(EBBlocks.WARPED_LADDER);
        dropSelf(EBBlocks.CHERRY_LADDER);
        dropSelf(EBBlocks.GLOOM_LADDER);
        dropSelf(EBBlocks.ANCIENT_LADDER);
        dropSelf(EBBlocks.SPRUCE_CRAFTING_TABLE);
        dropSelf(EBBlocks.BIRCH_CRAFTING_TABLE);
        dropSelf(EBBlocks.JUNGLE_CRAFTING_TABLE);
        dropSelf(EBBlocks.ACACIA_CRAFTING_TABLE);
        dropSelf(EBBlocks.DARK_OAK_CRAFTING_TABLE);
        dropSelf(EBBlocks.MANGROVE_CRAFTING_TABLE);
        dropSelf(EBBlocks.BAMBOO_CRAFTING_TABLE);
        dropSelf(EBBlocks.CRIMSON_CRAFTING_TABLE);
        dropSelf(EBBlocks.WARPED_CRAFTING_TABLE);
        dropSelf(EBBlocks.CHERRY_CRAFTING_TABLE);
        dropSelf(EBBlocks.GLOOM_CRAFTING_TABLE);
        dropSelf(EBBlocks.ANCIENT_CRAFTING_TABLE);
        dropSelf(EBBlocks.WOODEN_MUG);
        dropSelf(EBBlocks.GLASS_JAR);
        dropSelf(EBBlocks.GLASS_JAR_OF_FIRE);
        dropSelf(EBBlocks.GLASS_JAR_OF_SOUL_FIRE);
        dropSelf(EBBlocks.QUARTZ_BRICK_STAIRS);
        dropSelf(EBBlocks.QUARTZ_BRICK_VERTICAL_STAIRS);
        add(EBBlocks.QUARTZ_BRICK_SLAB, createSlabItemTable(EBBlocks.QUARTZ_BRICK_SLAB));
        dropSelf(EBBlocks.QUARTZ_BRICK_WALL);
        dropSelf(EBBlocks.TERRACOTTA_TILES);
        dropSelf(EBBlocks.TERRACOTTA_TILE_STAIRS);
        dropSelf(EBBlocks.TERRACOTTA_TILE_VERTICAL_STAIRS);
        add(EBBlocks.TERRACOTTA_TILE_SLAB, createSlabItemTable(EBBlocks.TERRACOTTA_TILE_SLAB));
        dropSelf(EBBlocks.OAK_VERTICAL_STAIRS);
        dropSelf(EBBlocks.SPRUCE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.BIRCH_VERTICAL_STAIRS);
        dropSelf(EBBlocks.JUNGLE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.ACACIA_VERTICAL_STAIRS);
        dropSelf(EBBlocks.DARK_OAK_VERTICAL_STAIRS);
        dropSelf(EBBlocks.MANGROVE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.CHERRY_VERTICAL_STAIRS);
        dropSelf(EBBlocks.BAMBOO_VERTICAL_STAIRS);
        dropSelf(EBBlocks.CRIMSON_VERTICAL_STAIRS);
        dropSelf(EBBlocks.WARPED_VERTICAL_STAIRS);
        dropSelf(EBBlocks.STONE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.COBBLESTONE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.STONE_BRICK_VERTICAL_STAIRS);
        dropSelf(EBBlocks.MOSSY_STONE_BRICK_VERTICAL_STAIRS);
        dropSelf(EBBlocks.MOSSY_COBBLESTONE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.DEEPSLATE_BRICK_VERTICAL_STAIRS);
        dropSelf(EBBlocks.COBBLED_DEEPSLATE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.DEEPSLATE_TILE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.POLISHED_DEEPSLATE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.QUARTZ_VERTICAL_STAIRS);
        dropSelf(EBBlocks.SMOOTH_QUARTZ_VERTICAL_STAIRS);
        dropSelf(EBBlocks.BRICK_VERTICAL_STAIRS);
        dropSelf(EBBlocks.SANDSTONE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.SMOOTH_SANDSTONE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.RED_SANDSTONE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.BLACKSTONE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS);
        dropSelf(EBBlocks.POLISHED_BLACKSTONE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.PRISMARINE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.PRISMARINE_BRICK_VERTICAL_STAIRS);
        dropSelf(EBBlocks.DARK_PRISMARINE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.ANDESITE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.POLISHED_ANDESITE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.GRANITE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.POLISHED_GRANITE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.DIORITE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.POLISHED_DIORITE_VERTICAL_STAIRS);
        dropSelf(EBBlocks.END_STONE_BRICK_VERTICAL_STAIRS);
        dropSelf(EBBlocks.PURPUR_VERTICAL_STAIRS);
        dropSelf(EBBlocks.NETHER_BRICK_VERTICAL_STAIRS);
        dropSelf(EBBlocks.RED_NETHER_BRICK_VERTICAL_STAIRS);
        dropSelf(EBBlocks.CUT_COPPER_VERTICAL_STAIRS);
        dropSelf(EBBlocks.EXPOSED_CUT_COPPER_VERTICAL_STAIRS);
        dropSelf(EBBlocks.WEATHERED_CUT_COPPER_VERTICAL_STAIRS);
        dropSelf(EBBlocks.OXIDIZED_CUT_COPPER_VERTICAL_STAIRS);
        dropSelf(EBBlocks.WAXED_CUT_COPPER_VERTICAL_STAIRS);
        dropSelf(EBBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_STAIRS);
        dropSelf(EBBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_STAIRS);
        dropSelf(EBBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_STAIRS);
        dropSelf(EBBlocks.GLOOM_SEEDS);
        dropSelf(EBBlocks.GRANITE_BRICKS);
        dropSelf(EBBlocks.GRANITE_BRICK_STAIRS);
        dropSelf(EBBlocks.GRANITE_BRICK_VERTICAL_STAIRS);
        dropOther(EBBlocks.GRANITE_BRICK_SLAB, EBBlocks.GRANITE_BRICK_SLAB);
        dropSelf(EBBlocks.GRANITE_BRICK_WALL);
        dropSelf(EBBlocks.ANDESITE_BRICKS);
        dropSelf(EBBlocks.ANDESITE_BRICK_STAIRS);
        dropSelf(EBBlocks.ANDESITE_BRICK_VERTICAL_STAIRS);
        dropOther(EBBlocks.ANDESITE_BRICK_SLAB, EBBlocks.ANDESITE_BRICK_SLAB);
        dropSelf(EBBlocks.ANDESITE_BRICK_WALL);
        dropSelf(EBBlocks.DIORITE_BRICKS);
        dropSelf(EBBlocks.DIORITE_BRICK_STAIRS);
        dropSelf(EBBlocks.DIORITE_BRICK_VERTICAL_STAIRS);
        dropOther(EBBlocks.DIORITE_BRICK_SLAB, EBBlocks.DIORITE_BRICK_SLAB);
        dropSelf(EBBlocks.DIORITE_BRICK_WALL);
        dropSelf(EBBlocks.SMOOTH_BRICKS);
        dropSelf(EBBlocks.SMOOTH_BRICK_STAIRS);
        dropSelf(EBBlocks.SMOOTH_BRICK_VERTICAL_STAIRS);
        dropOther(EBBlocks.SMOOTH_BRICK_SLAB, EBBlocks.SMOOTH_BRICK_SLAB);
        dropSelf(EBBlocks.SMOOTH_BRICK_WALL);
        dropSelf(EBBlocks.CRACKED_BRICKS);
        dropSelf(EBBlocks.CRACKED_SMOOTH_BRICKS);
        dropSelf(EBBlocks.HERRINGBONE_BRICKS);
        dropSelf(EBBlocks.SMOOTH_HERRINGBONE_BRICKS);
        dropSelf(EBBlocks.REACHING_LANTERN);
        this.add(EBBlocks.SPRUCE_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        this.add(EBBlocks.BIRCH_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        this.add(EBBlocks.JUNGLE_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        this.add(EBBlocks.ACACIA_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        this.add(EBBlocks.DARK_OAK_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        this.add(EBBlocks.MANGROVE_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        this.add(EBBlocks.CHERRY_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        this.add(EBBlocks.BAMBOO_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        this.add(EBBlocks.CRIMSON_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        this.add(EBBlocks.WARPED_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        this.add(EBBlocks.ANCIENT_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        this.add(EBBlocks.GLOOM_BOOKSHELF, block -> this.createSingleItemTableWithSilkTouch(block, Items.BOOK, ConstantValue.exactly(3.0F)));
        dropSelf(EBBlocks.BRIMSTONE);
        dropSelf(EBBlocks.BRIMSTONE_STAIRS);
        dropSelf(EBBlocks.BRIMSTONE_VERTICAL_STAIRS);
        dropOther(EBBlocks.BRIMSTONE_SLAB, EBBlocks.BRIMSTONE_SLAB);
        dropSelf(EBBlocks.BRIMSTONE_WALL);
        dropSelf(EBBlocks.POLISHED_BRIMSTONE);
        dropSelf(EBBlocks.POLISHED_BRIMSTONE_STAIRS);
        dropSelf(EBBlocks.POLISHED_BRIMSTONE_VERTICAL_STAIRS);
        dropOther(EBBlocks.POLISHED_BRIMSTONE_SLAB, EBBlocks.POLISHED_BRIMSTONE_SLAB);
        dropSelf(EBBlocks.BRIMSTONE_BRICKS);
        dropSelf(EBBlocks.BRIMSTONE_BRICK_STAIRS);
        dropSelf(EBBlocks.BRIMSTONE_BRICK_VERTICAL_STAIRS);
        dropOther(EBBlocks.BRIMSTONE_BRICK_SLAB, EBBlocks.BRIMSTONE_BRICK_SLAB);
        dropSelf(EBBlocks.BRIMSTONE_TILES);
        dropSelf(EBBlocks.BRIMSTONE_TILE_STAIRS);
        dropSelf(EBBlocks.BRIMSTONE_TILE_VERTICAL_STAIRS);
        dropOther(EBBlocks.BRIMSTONE_TILE_SLAB, EBBlocks.BRIMSTONE_TILE_SLAB);
        dropSelf(EBBlocks.BRIMSTONE_PILLAR);
        dropSelf(EBBlocks.BRIMSTONE_WINDOW);
        dropSelf(EBBlocks.BRIMSTONE_LAMP);
        dropSelf(EBBlocks.ASPHALT);
        dropSelf(EBBlocks.ASPHALT_STAIRS);
        dropSelf(EBBlocks.ASPHALT_VERTICAL_STAIRS);
        dropOther(EBBlocks.ASPHALT_SLAB, EBBlocks.ASPHALT_SLAB);
        dropSelf(EBBlocks.ROSE);
        dropSelf(EBBlocks.CYAN_ROSE);
        dropSelf(EBBlocks.WHITE_ROSE);
        dropPottedContents(EBBlocks.POTTED_ROSE);
        dropPottedContents(EBBlocks.POTTED_CYAN_ROSE);
        dropPottedContents(EBBlocks.POTTED_WHITE_ROSE);
        dropSelf(EBBlocks.CRACKED_BRIMSTONE_BRICKS);
        dropSelf(EBBlocks.CRACKED_GRANITE_BRICKS);
        dropSelf(EBBlocks.CRACKED_ANDESITE_BRICKS);
        dropSelf(EBBlocks.CRACKED_DIORITE_BRICKS);
        dropSelf(EBBlocks.CRACKED_MUD_BRICKS);
        dropSelf(EBBlocks.POLISHED_STONE);
        dropSelf(EBBlocks.POLISHED_STONE_STAIRS);
        dropSelf(EBBlocks.POLISHED_STONE_VERTICAL_STAIRS);
        dropOther(EBBlocks.POLISHED_STONE_SLAB, EBBlocks.POLISHED_STONE_SLAB);
        dropSelf(EBBlocks.SMOOTH_STONE_BRICKS);
        dropSelf(EBBlocks.CRACKED_SMOOTH_STONE_BRICKS);
        dropSelf(EBBlocks.SMOOTH_STONE_BRICK_STAIRS);
        dropSelf(EBBlocks.SMOOTH_STONE_BRICK_VERTICAL_STAIRS);
        dropOther(EBBlocks.SMOOTH_STONE_BRICK_SLAB, EBBlocks.SMOOTH_STONE_BRICK_SLAB);
        dropSelf(EBBlocks.SMOOTH_STONE_TILES);
        dropSelf(EBBlocks.CRACKED_SMOOTH_STONE_TILES);
        dropSelf(EBBlocks.SMOOTH_STONE_TILE_STAIRS);
        dropSelf(EBBlocks.SMOOTH_STONE_TILE_VERTICAL_STAIRS);
        dropOther(EBBlocks.SMOOTH_STONE_TILE_SLAB, EBBlocks.SMOOTH_STONE_TILE_SLAB);
        dropSelf(EBBlocks.SMOOTH_STONE_PILLAR);
        dropSelf(EBBlocks.CHISELED_SMOOTH_STONE_BRICKS);
        dropSelf(EBBlocks.REDSTONE_BRICKS);
        dropSelf(EBBlocks.REDSTONE_BRICK_STAIRS);
        dropSelf(EBBlocks.REDSTONE_BRICK_VERTICAL_STAIRS);
        dropOther(EBBlocks.REDSTONE_BRICK_SLAB, EBBlocks.REDSTONE_BRICK_SLAB);
        dropSelf(EBBlocks.OAK_DECORATIVE_SHELF);
        dropSelf(EBBlocks.SPRUCE_DECORATIVE_SHELF);
        dropSelf(EBBlocks.BIRCH_DECORATIVE_SHELF);
        dropSelf(EBBlocks.JUNGLE_DECORATIVE_SHELF);
        dropSelf(EBBlocks.ACACIA_DECORATIVE_SHELF);
        dropSelf(EBBlocks.DARK_OAK_DECORATIVE_SHELF);
        dropSelf(EBBlocks.MANGROVE_DECORATIVE_SHELF);
        dropSelf(EBBlocks.BAMBOO_DECORATIVE_SHELF);
        dropSelf(EBBlocks.CHERRY_DECORATIVE_SHELF);
        dropSelf(EBBlocks.CRIMSON_DECORATIVE_SHELF);
        dropSelf(EBBlocks.WARPED_DECORATIVE_SHELF);
        dropSelf(EBBlocks.ANCIENT_DECORATIVE_SHELF);
        dropSelf(EBBlocks.GLOOM_DECORATIVE_SHELF);
        dropSelf(EBBlocks.WEEPING_CANDLE);
        dropSelf(EBBlocks.TWISTING_CANDLE);
        createLeavesDrops(EBBlocks.GLOOM_LEAVES, EBBlocks.GLOOM_SAPLING);
        dropSelf(EBBlocks.ALMENTRA_STATUE);
        addDyedBlockDrops();
        add(EBBlocks.MOSS_PASTE, block -> createMultifaceBlockDrops(block, HAS_SHEARS));
        dropSelf(EBBlocks.ALMENTRA);
        dropSelf(EBBlocks.ALMENTRA_STAIRS);
        dropSelf(EBBlocks.ALMENTRA_VERTICAL_STAIRS);
        dropSelf(EBBlocks.ALMENTRA_SLAB);
        dropSelf(EBBlocks.ALMENTRA_BRICKS);
        dropSelf(EBBlocks.ALMENTRA_BRICK_STAIRS);
        dropSelf(EBBlocks.ALMENTRA_BRICK_VERTICAL_STAIRS);
        dropSelf(EBBlocks.ALMENTRA_BRICK_SLAB);
        dropSelf(EBBlocks.POLISHED_ALMENTRA);
        dropSelf(EBBlocks.POLISHED_ALMENTRA_STAIRS);
        dropSelf(EBBlocks.POLISHED_ALMENTRA_VERTICAL_STAIRS);
        dropSelf(EBBlocks.POLISHED_ALMENTRA_SLAB);
        ancientLeavesDrops(EBBlocks.ANCIENT_LEAVES, EBBlocks.ANCIENT_SAPLING);
//        addDrop(EBBlocks.SPRUCE_CHEST);
//        addDrop(EBBlocks.BIRCH_CHEST);
//        addDrop(EBBlocks.JUNGLE_CHEST);
//        addDrop(EBBlocks.ACACIA_CHEST);
//        addDrop(EBBlocks.DARK_OAK_CHEST);
//        addDrop(EBBlocks.MANGROVE_CHEST);
//        addDrop(EBBlocks.CHERRY_CHEST);
//        addDrop(EBBlocks.BAMBOO_CHEST);
//        addDrop(EBBlocks.CRIMSON_CHEST);
//        addDrop(EBBlocks.WARPED_CHEST);
//        addDrop(EBBlocks.ANCIENT_CHEST);
//        addDrop(EBBlocks.GLOOM_CHEST);
//        addDrop(EBBlocks.TRAPPED_SPRUCE_CHEST);
//        addDrop(EBBlocks.TRAPPED_BIRCH_CHEST);
//        addDrop(EBBlocks.TRAPPED_JUNGLE_CHEST);
//        addDrop(EBBlocks.TRAPPED_ACACIA_CHEST);
//        addDrop(EBBlocks.TRAPPED_DARK_OAK_CHEST);
//        addDrop(EBBlocks.TRAPPED_MANGROVE_CHEST);
//        addDrop(EBBlocks.TRAPPED_CHERRY_CHEST);
//        addDrop(EBBlocks.TRAPPED_BAMBOO_CHEST);
//        addDrop(EBBlocks.TRAPPED_CRIMSON_CHEST);
//        addDrop(EBBlocks.TRAPPED_WARPED_CHEST);
//        addDrop(EBBlocks.TRAPPED_ANCIENT_CHEST);
//        addDrop(EBBlocks.TRAPPED_GLOOM_CHEST);
        dropSelf(EBBlocks.PAPER_BLOCK);
        dropSelf(EBBlocks.THIN_PAPER_BLOCK);
        dropSelf(EBBlocks.THIN_DIAGONAL_PAPER_BLOCK);
        dropSelf(EBBlocks.THIN_DIVIDED_PAPER_BLOCK);
        dropSelf(EBBlocks.THIN_PAPER_STAIRS);
        dropSelf(EBBlocks.THIN_PAPER_VERTICAL_STAIRS);
        dropOther(EBBlocks.THIN_PAPER_SLAB, EBBlocks.THIN_PAPER_SLAB);
        dropSelf(EBBlocks.THICK_PAPER_BLOCK);
        dropSelf(EBBlocks.THICK_DIAGONAL_PAPER_BLOCK);
        dropSelf(EBBlocks.THICK_DIVIDED_PAPER_BLOCK);
        dropSelf(EBBlocks.THICK_PAPER_STAIRS);
        dropSelf(EBBlocks.THICK_PAPER_VERTICAL_STAIRS);
        dropOther(EBBlocks.THICK_PAPER_SLAB, EBBlocks.THICK_PAPER_SLAB);
        dropSelf(EBBlocks.AMETHYST_LAMP);
        dropSelf(EBBlocks.MUD_BRICK_VERTICAL_STAIRS);
    }

    private void addDyedBlockDrops() {
        for (DyeColor colors : DyeColor.values()) {
            dropSelf(EBBlocks.getDyedAlmentra(colors.getId()));
            dropSelf(EBBlocks.getDyedAlmentraStairs(colors.getId()));
            dropSelf(EBBlocks.getDyedAlmentraVerticalStairs(colors.getId()));
            dropSelf(EBBlocks.getDyedAlmentraSlab(colors.getId()));
            dropSelf(EBBlocks.getDyedPolishedAlmentra(colors.getId()));
            dropSelf(EBBlocks.getDyedPolishedAlmentraStairs(colors.getId()));
            dropSelf(EBBlocks.getDyedPolishedAlmentraVerticalStairs(colors.getId()));
            dropSelf(EBBlocks.getDyedPolishedAlmentraSlab(colors.getId()));
            dropSelf(EBBlocks.getDyedAlmentraBricks(colors.getId()));
            dropSelf(EBBlocks.getDyedAlmentraBrickStairs(colors.getId()));
            dropSelf(EBBlocks.getDyedAlmentraBrickVerticalStairs(colors.getId()));
            dropSelf(EBBlocks.getDyedAlmentraBrickSlab(colors.getId()));
            dropSelf(EBBlocks.getDyedAlmentraStatues(colors.getId()));
            dropSelf(EBBlocks.getDyedKnittedWools(colors.getId()));
            dropSelf(EBBlocks.getDyedKnittedCarpets(colors.getId()));
            dropSelf(EBBlocks.getDyedTerracottaTiles(colors.getId()));
            dropSelf(EBBlocks.getDyedTerracottaTileStairs(colors.getId()));
            dropSelf(EBBlocks.getDyedTerracottaTileVerticalStairs(colors.getId()));
            dropSelf(EBBlocks.getDyedTerracottaTileSlab(colors.getId()));
        }
    }

    public LootTable.Builder ancientLeavesDrops(Block leaves, Block drop, float... chance) {
        return this.createLeavesDrops(leaves, drop, chance).withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).when(HAS_NO_SHEARS_OR_SILK_TOUCH).add(((LootPoolSingletonContainer.Builder)this.applyExplosionCondition(leaves, LootItem.lootTableItem(EBItems.ANCIENT_FRUIT))).when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, new float[]{0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F}))));
    }
}
