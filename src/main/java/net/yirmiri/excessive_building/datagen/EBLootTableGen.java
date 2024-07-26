package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.DyeColor;
import net.yirmiri.excessive_building.block.configurable.EBBookshelfBlock;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;

import java.util.concurrent.CompletableFuture;

public class EBLootTableGen extends FabricBlockLootTableProvider {
    public EBLootTableGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> future) {
        super(output, future);
    }

    @Override
    public void generate() {
        addDrop(EBBlocks.OAK_MOSAIC);
        addDrop(EBBlocks.OAK_MOSAIC_STAIRS);
        addDrop(EBBlocks.OAK_MOSAIC_SLAB, slabDrops(EBBlocks.OAK_MOSAIC_SLAB));
        addDrop(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.SPRUCE_MOSAIC);
        addDrop(EBBlocks.SPRUCE_MOSAIC_STAIRS);
        addDrop(EBBlocks.SPRUCE_MOSAIC_SLAB, slabDrops(EBBlocks.SPRUCE_MOSAIC_SLAB));
        addDrop(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.BIRCH_MOSAIC);
        addDrop(EBBlocks.BIRCH_MOSAIC_STAIRS);
        addDrop(EBBlocks.BIRCH_MOSAIC_SLAB, slabDrops(EBBlocks.BIRCH_MOSAIC_SLAB));
        addDrop(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.JUNGLE_MOSAIC);
        addDrop(EBBlocks.JUNGLE_MOSAIC_STAIRS);
        addDrop(EBBlocks.JUNGLE_MOSAIC_SLAB, slabDrops(EBBlocks.JUNGLE_MOSAIC_SLAB));
        addDrop(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.ACACIA_MOSAIC);
        addDrop(EBBlocks.ACACIA_MOSAIC_STAIRS);
        addDrop(EBBlocks.ACACIA_MOSAIC_SLAB, slabDrops(EBBlocks.ACACIA_MOSAIC_SLAB));
        addDrop(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.DARK_OAK_MOSAIC);
        addDrop(EBBlocks.DARK_OAK_MOSAIC_STAIRS);
        addDrop(EBBlocks.DARK_OAK_MOSAIC_SLAB, slabDrops(EBBlocks.DARK_OAK_MOSAIC_SLAB));
        addDrop(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.MANGROVE_MOSAIC);
        addDrop(EBBlocks.MANGROVE_MOSAIC_STAIRS);
        addDrop(EBBlocks.MANGROVE_MOSAIC_SLAB, slabDrops(EBBlocks.MANGROVE_MOSAIC_SLAB));
        addDrop(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.CHERRY_MOSAIC);
        addDrop(EBBlocks.CHERRY_MOSAIC_STAIRS);
        addDrop(EBBlocks.CHERRY_MOSAIC_SLAB, slabDrops(EBBlocks.CHERRY_MOSAIC_SLAB));
        addDrop(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.CRIMSON_MOSAIC);
        addDrop(EBBlocks.CRIMSON_MOSAIC_STAIRS);
        addDrop(EBBlocks.CRIMSON_MOSAIC_SLAB, slabDrops(EBBlocks.CRIMSON_MOSAIC_SLAB));
        addDrop(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.WARPED_MOSAIC);
        addDrop(EBBlocks.WARPED_MOSAIC_STAIRS);
        addDrop(EBBlocks.WARPED_MOSAIC_SLAB, slabDrops(EBBlocks.WARPED_MOSAIC_SLAB));
        addDrop(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.COBBLESTONE_BRICKS);
        addDrop(EBBlocks.COBBLESTONE_BRICK_STAIRS);
        addDrop(EBBlocks.COBBLESTONE_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.COBBLESTONE_BRICK_SLAB, slabDrops(EBBlocks.COBBLESTONE_BRICK_SLAB));
        addDrop(EBBlocks.CRACKED_COBBLESTONE_BRICKS);
        addDrop(EBBlocks.MOSSY_COBBLESTONE_BRICKS);
        addDrop(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS);
        addDrop(EBBlocks.MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB, slabDrops(EBBlocks.COBBLESTONE_BRICK_SLAB));
        addDrop(EBBlocks.COBBLED_DEEPSLATE_BRICKS);
        addDrop(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS);
        addDrop(EBBlocks.COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB, slabDrops(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB));
        addDrop(EBBlocks.CRACKED_COBBLED_DEEPSLATE_BRICKS);
        addDrop(EBBlocks.BLACKSTONE_BRICKS);
        addDrop(EBBlocks.BLACKSTONE_BRICK_STAIRS);
        addDrop(EBBlocks.BLACKSTONE_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.BLACKSTONE_BRICK_SLAB, slabDrops(EBBlocks.BLACKSTONE_BRICK_SLAB));
        addDrop(EBBlocks.CRACKED_BLACKSTONE_BRICKS);
        addDrop(EBBlocks.BLACKSTONE_BRICK_WALL);
        addDrop(EBBlocks.COBBLESTONE_BRICK_WALL);
        addDrop(EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL);
        addDrop(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL);
        addDrop(EBBlocks.ANCIENT_PLANKS);
        addDrop(EBBlocks.ANCIENT_STAIRS);
        addDrop(EBBlocks.ANCIENT_VERTICAL_STAIRS);
        addDrop(EBBlocks.ANCIENT_SLAB, slabDrops(EBBlocks.ANCIENT_SLAB));
        addDrop(EBBlocks.ANCIENT_MOSAIC);
        addDrop(EBBlocks.ANCIENT_MOSAIC_STAIRS);
        addDrop(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.ANCIENT_MOSAIC_SLAB, slabDrops(EBBlocks.ANCIENT_MOSAIC_SLAB));
        addDrop(EBBlocks.ANCIENT_FENCE);
        addDrop(EBBlocks.ANCIENT_FENCE_GATE);
        addDrop(EBBlocks.ANCIENT_BUTTON);
        addDrop(EBBlocks.ANCIENT_PRESSURE_PLATE);
        doorDrops(EBBlocks.ANCIENT_DOOR);
        addDrop(EBBlocks.ANCIENT_TRAPDOOR);
        addDrop(EBBlocks.ANCIENT_LOG);
        addDrop(EBBlocks.ANCIENT_WOOD);
        addDrop(EBBlocks.STRIPPED_ANCIENT_LOG);
        addDrop(EBBlocks.STRIPPED_ANCIENT_WOOD);
        ancientLeavesDrops(EBBlocks.ANCIENT_LEAVES, EBBlocks.ANCIENT_SAPLING);
        addDrop(EBBlocks.ANCIENT_SAPLING);
        addPottedPlantDrops(EBBlocks.POTTED_ANCIENT_SAPLING);
        addDrop(EBBlocks.CHISELED_ANCIENT_PLANKS);
        addDrop(EBBlocks.CHISELED_OAK_PLANKS);
        addDrop(EBBlocks.CHISELED_SPRUCE_PLANKS);
        addDrop(EBBlocks.CHISELED_BIRCH_PLANKS);
        addDrop(EBBlocks.CHISELED_JUNGLE_PLANKS);
        addDrop(EBBlocks.CHISELED_ACACIA_PLANKS);
        addDrop(EBBlocks.CHISELED_DARK_OAK_PLANKS);
        addDrop(EBBlocks.CHISELED_MANGROVE_PLANKS);
        addDrop(EBBlocks.CHISELED_CHERRY_PLANKS);
        addDrop(EBBlocks.CHISELED_BAMBOO_PLANKS);
        addDrop(EBBlocks.CHISELED_CRIMSON_PLANKS);
        addDrop(EBBlocks.CHISELED_WARPED_PLANKS);
        addDrop(EBBlocks.GLOOM_PLANKS);
        addDrop(EBBlocks.GLOOM_STAIRS);
        addDrop(EBBlocks.GLOOM_MOSAIC_STAIRS);
        addDrop(EBBlocks.GLOOM_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.GLOOM_SLAB, slabDrops(EBBlocks.GLOOM_SLAB));
        addDrop(EBBlocks.GLOOM_MOSAIC);
        addDrop(EBBlocks.GLOOM_MOSAIC_STAIRS);
        addDrop(EBBlocks.GLOOM_MOSAIC_SLAB, slabDrops(EBBlocks.GLOOM_MOSAIC_SLAB));
        addDrop(EBBlocks.GLOOM_FENCE);
        addDrop(EBBlocks.GLOOM_FENCE_GATE);
        addDrop(EBBlocks.GLOOM_BUTTON);
        addDrop(EBBlocks.GLOOM_PRESSURE_PLATE);
        doorDrops(EBBlocks.GLOOM_DOOR);
        addDrop(EBBlocks.GLOOM_TRAPDOOR);
        addDrop(EBBlocks.GLOOM_LOG);
        addDrop(EBBlocks.GLOOM_WOOD);
        addDrop(EBBlocks.STRIPPED_GLOOM_LOG);
        addDrop(EBBlocks.STRIPPED_GLOOM_WOOD);
        addDrop(EBBlocks.CHISELED_GLOOM_PLANKS);
        addDrop(EBBlocks.COPPER_BRICKS);
        addDrop(EBBlocks.COPPER_BRICK_STAIRS);
        addDrop(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.COPPER_BRICK_SLAB, slabDrops(EBBlocks.COPPER_BRICK_SLAB));
        addDrop(EBBlocks.COPPER_PRESSURE_PLATE);
        addDrop(EBBlocks.EXPOSED_COPPER_BRICKS);
        addDrop(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS);
        addDrop(EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.EXPOSED_COPPER_BRICK_SLAB, slabDrops(EBBlocks.EXPOSED_COPPER_BRICK_SLAB));
        addDrop(EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
        addDrop(EBBlocks.WEATHERED_COPPER_BRICKS);
        addDrop(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS);
        addDrop(EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.WEATHERED_COPPER_BRICK_SLAB, slabDrops(EBBlocks.WEATHERED_COPPER_BRICK_SLAB));
        addDrop(EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
        addDrop(EBBlocks.OXIDIZED_COPPER_BRICKS);
        addDrop(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS);
        addDrop(EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB, slabDrops(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB));
        addDrop(EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
        addDrop(EBBlocks.WAXED_COPPER_BRICKS);
        addDrop(EBBlocks.WAXED_COPPER_BRICK_STAIRS);
        addDrop(EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.WAXED_COPPER_BRICK_SLAB, slabDrops(EBBlocks.WAXED_COPPER_BRICK_SLAB));
        addDrop(EBBlocks.WAXED_COPPER_PRESSURE_PLATE);
        addDrop(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS);
        addDrop(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS);
        addDrop(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB, slabDrops(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB));
        addDrop(EBBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
        addDrop(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS);
        addDrop(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS);
        addDrop(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB, slabDrops(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB));
        addDrop(EBBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
        addDrop(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS);
        addDrop(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS);
        addDrop(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB, slabDrops(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB));
        addDrop(EBBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
        addDrop(EBBlocks.COPPER_BUTTON);
        addDrop(EBBlocks.EXPOSED_COPPER_BUTTON);
        addDrop(EBBlocks.WEATHERED_COPPER_BUTTON);
        addDrop(EBBlocks.OXIDIZED_COPPER_BUTTON);
        addDrop(EBBlocks.WAXED_COPPER_BUTTON);
        addDrop(EBBlocks.WAXED_EXPOSED_COPPER_BUTTON);
        addDrop(EBBlocks.WAXED_WEATHERED_COPPER_BUTTON);
        addDrop(EBBlocks.WAXED_OXIDIZED_COPPER_BUTTON);
        addDrop(EBBlocks.IRON_BRICKS);
        addDrop(EBBlocks.IRON_BRICK_STAIRS);
        addDrop(EBBlocks.IRON_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.IRON_BRICK_SLAB, slabDrops(EBBlocks.IRON_BRICK_SLAB));
        addDrop(EBBlocks.GOLD_BRICKS);
        addDrop(EBBlocks.GOLD_BRICK_STAIRS);
        addDrop(EBBlocks.GOLD_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.GOLD_BRICK_SLAB, slabDrops(EBBlocks.GOLD_BRICK_SLAB));
        addDrop(EBBlocks.LAPIS_BRICKS);
        addDrop(EBBlocks.LAPIS_BRICK_STAIRS);
        addDrop(EBBlocks.LAPIS_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.LAPIS_BRICK_SLAB, slabDrops(EBBlocks.LAPIS_BRICK_SLAB));
        addDrop(EBBlocks.EMERALD_BRICKS);
        addDrop(EBBlocks.EMERALD_BRICK_STAIRS);
        addDrop(EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.EMERALD_BRICK_SLAB, slabDrops(EBBlocks.EMERALD_BRICK_SLAB));
        addDrop(EBBlocks.DIAMOND_BRICKS);
        addDrop(EBBlocks.DIAMOND_BRICK_STAIRS);
        addDrop(EBBlocks.DIAMOND_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.DIAMOND_BRICK_SLAB, slabDrops(EBBlocks.DIAMOND_BRICK_SLAB));
        addDrop(EBBlocks.NETHERITE_BRICKS);
        addDrop(EBBlocks.NETHERITE_BRICK_STAIRS);
        addDrop(EBBlocks.NETHERITE_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.NETHERITE_BRICK_SLAB, slabDrops(EBBlocks.NETHERITE_BRICK_SLAB));
        addDropWithSilkTouch(EBBlocks.SEA_GLASS);
        addDropWithSilkTouch(EBBlocks.VERDANT_SEA_GLASS);
        addDropWithSilkTouch(EBBlocks.ROSE_SEA_GLASS);
        addDropWithSilkTouch(EBBlocks.AQUA_SEA_GLASS);
        addDropWithSilkTouch(EBBlocks.SCARLET_SEA_GLASS);
        addDropWithSilkTouch(EBBlocks.FUCHSIA_SEA_GLASS);
        addDropWithSilkTouch(EBBlocks.SEA_GLASS_PANE);
        addDropWithSilkTouch(EBBlocks.VERDANT_SEA_GLASS_PANE);
        addDropWithSilkTouch(EBBlocks.ROSE_SEA_GLASS_PANE);
        addDropWithSilkTouch(EBBlocks.AQUA_SEA_GLASS_PANE);
        addDropWithSilkTouch(EBBlocks.SCARLET_SEA_GLASS_PANE);
        addDropWithSilkTouch(EBBlocks.FUCHSIA_SEA_GLASS_PANE);
        addDrop(EBBlocks.BONE_BRICKS);
        addDrop(EBBlocks.BONE_BRICK_STAIRS);
        addDrop(EBBlocks.BONE_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.BONE_BRICK_SLAB, slabDrops(EBBlocks.BONE_BRICK_SLAB));
        addDrop(EBBlocks.BONE_BRICK_WALL);
        addDyedKnittedWoolDrops();
        addDyedKnittedCarpetDrops();
        addDrop(EBBlocks.SOUL_MAGMA_BLOCK);
        addDrop(EBBlocks.SOUL_SANDSTONE);
        addDrop(EBBlocks.SOUL_SANDSTONE_STAIRS);
        addDrop(EBBlocks.SOUL_SANDSTONE_VERTICAL_STAIRS);
        addDrop(EBBlocks.SOUL_SANDSTONE_SLAB, slabDrops(EBBlocks.SOUL_SANDSTONE_SLAB));
        addDrop(EBBlocks.SOUL_SANDSTONE_WALL);
        addDrop(EBBlocks.CHISELED_SOUL_SANDSTONE);
        addDrop(EBBlocks.CUT_SOUL_SANDSTONE);
        addDrop(EBBlocks.CUT_SOUL_SANDSTONE_SLAB);
        addDrop(EBBlocks.SMOOTH_SOUL_SANDSTONE);
        addDrop(EBBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS);
        addDrop(EBBlocks.SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS);
        addDrop(EBBlocks.SMOOTH_SOUL_SANDSTONE_SLAB, slabDrops(EBBlocks.SMOOTH_SOUL_SANDSTONE_SLAB));
        addDrop(EBBlocks.POLISHED_SANDSTONE);
        addDrop(EBBlocks.POLISHED_SANDSTONE_STAIRS);
        addDrop(EBBlocks.POLISHED_SANDSTONE_VERTICAL_STAIRS);
        addDrop(EBBlocks.POLISHED_SANDSTONE_SLAB, slabDrops(EBBlocks.POLISHED_SANDSTONE_SLAB));
        addDrop(EBBlocks.POLISHED_SANDSTONE_WALL);
        addDrop(EBBlocks.SANDSTONE_BRICKS);
        addDrop(EBBlocks.SANDSTONE_BRICK_STAIRS);
        addDrop(EBBlocks.SANDSTONE_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.SANDSTONE_BRICK_SLAB, slabDrops(EBBlocks.SANDSTONE_BRICK_SLAB));
        addDrop(EBBlocks.SANDSTONE_BRICK_WALL);
        addDrop(EBBlocks.SANDSTONE_TILES);
        addDrop(EBBlocks.SANDSTONE_TILE_STAIRS);
        addDrop(EBBlocks.SANDSTONE_TILE_VERTICAL_STAIRS);
        addDrop(EBBlocks.SANDSTONE_TILE_SLAB, slabDrops(EBBlocks.SANDSTONE_TILE_SLAB));
        addDrop(EBBlocks.SANDSTONE_TILE_WALL);
        addDrop(EBBlocks.CHISELED_SANDSTONE_BRICKS);
        addDrop(EBBlocks.DECORATED_SANDSTONE_BRICKS);
        addDrop(EBBlocks.ENGRAVED_SANDSTONE_BRICKS);
        addDrop(EBBlocks.SANDSTONE_PILLAR);
        addDrop(EBBlocks.POLISHED_RED_SANDSTONE);
        addDrop(EBBlocks.POLISHED_RED_SANDSTONE_STAIRS);
        addDrop(EBBlocks.POLISHED_RED_SANDSTONE_VERTICAL_STAIRS);
        addDrop(EBBlocks.POLISHED_RED_SANDSTONE_SLAB, slabDrops(EBBlocks.POLISHED_RED_SANDSTONE_SLAB));
        addDrop(EBBlocks.POLISHED_RED_SANDSTONE_WALL);
        addDrop(EBBlocks.RED_SANDSTONE_BRICKS);
        addDrop(EBBlocks.RED_SANDSTONE_BRICK_STAIRS);
        addDrop(EBBlocks.RED_SANDSTONE_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.RED_SANDSTONE_BRICK_SLAB, slabDrops(EBBlocks.RED_SANDSTONE_BRICK_SLAB));
        addDrop(EBBlocks.RED_SANDSTONE_BRICK_WALL);
        addDrop(EBBlocks.RED_SANDSTONE_TILES);
        addDrop(EBBlocks.RED_SANDSTONE_TILE_STAIRS);
        addDrop(EBBlocks.RED_SANDSTONE_TILE_VERTICAL_STAIRS);
        addDrop(EBBlocks.RED_SANDSTONE_TILE_SLAB, slabDrops(EBBlocks.RED_SANDSTONE_TILE_SLAB));
        addDrop(EBBlocks.RED_SANDSTONE_TILE_WALL);
        addDrop(EBBlocks.CHISELED_RED_SANDSTONE_BRICKS);
        addDrop(EBBlocks.DECORATED_RED_SANDSTONE_BRICKS);
        addDrop(EBBlocks.ENGRAVED_RED_SANDSTONE_BRICKS);
        addDrop(EBBlocks.RED_SANDSTONE_PILLAR);
        addDrop(EBBlocks.POLISHED_SOUL_SANDSTONE);
        addDrop(EBBlocks.POLISHED_SOUL_SANDSTONE_STAIRS);
        addDrop(EBBlocks.POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS);
        addDrop(EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB, slabDrops(EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB));
        addDrop(EBBlocks.POLISHED_SOUL_SANDSTONE_WALL);
        addDrop(EBBlocks.SOUL_SANDSTONE_BRICKS);
        addDrop(EBBlocks.SOUL_SANDSTONE_BRICK_STAIRS);
        addDrop(EBBlocks.SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB, slabDrops(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB));
        addDrop(EBBlocks.SOUL_SANDSTONE_BRICK_WALL);
        addDrop(EBBlocks.SOUL_SANDSTONE_TILES);
        addDrop(EBBlocks.SOUL_SANDSTONE_TILE_STAIRS);
        addDrop(EBBlocks.SOUL_SANDSTONE_TILE_VERTICAL_STAIRS);
        addDrop(EBBlocks.SOUL_SANDSTONE_TILE_SLAB, slabDrops(EBBlocks.SOUL_SANDSTONE_TILE_SLAB));
        addDrop(EBBlocks.SOUL_SANDSTONE_TILE_WALL);
        addDrop(EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS);
        addDrop(EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS);
        addDrop(EBBlocks.ENGRAVED_SOUL_SANDSTONE_BRICKS);
        addDrop(EBBlocks.SOUL_SANDSTONE_PILLAR);
        addDrop(EBBlocks.SPRUCE_LADDER);
        addDrop(EBBlocks.BIRCH_LADDER);
        addDrop(EBBlocks.JUNGLE_LADDER);
        addDrop(EBBlocks.ACACIA_LADDER);
        addDrop(EBBlocks.DARK_OAK_LADDER);
        addDrop(EBBlocks.MANGROVE_LADDER);
        addDrop(EBBlocks.BAMBOO_LADDER);
        addDrop(EBBlocks.CRIMSON_LADDER);
        addDrop(EBBlocks.WARPED_LADDER);
        addDrop(EBBlocks.CHERRY_LADDER);
        addDrop(EBBlocks.GLOOM_LADDER);
        addDrop(EBBlocks.ANCIENT_LADDER);
        addDrop(EBBlocks.SPRUCE_CRAFTING_TABLE);
        addDrop(EBBlocks.BIRCH_CRAFTING_TABLE);
        addDrop(EBBlocks.JUNGLE_CRAFTING_TABLE);
        addDrop(EBBlocks.ACACIA_CRAFTING_TABLE);
        addDrop(EBBlocks.DARK_OAK_CRAFTING_TABLE);
        addDrop(EBBlocks.MANGROVE_CRAFTING_TABLE);
        addDrop(EBBlocks.BAMBOO_CRAFTING_TABLE);
        addDrop(EBBlocks.CRIMSON_CRAFTING_TABLE);
        addDrop(EBBlocks.WARPED_CRAFTING_TABLE);
        addDrop(EBBlocks.CHERRY_CRAFTING_TABLE);
        addDrop(EBBlocks.GLOOM_CRAFTING_TABLE);
        addDrop(EBBlocks.ANCIENT_CRAFTING_TABLE);
        addDrop(EBBlocks.WOODEN_MUG);
        addDrop(EBBlocks.GLASS_JAR);
        addDrop(EBBlocks.GLASS_JAR_OF_FIRE);
        addDrop(EBBlocks.GLASS_JAR_OF_SOUL_FIRE);
        addDrop(EBBlocks.QUARTZ_BRICK_STAIRS);
        addDrop(EBBlocks.QUARTZ_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.QUARTZ_BRICK_SLAB, slabDrops(EBBlocks.QUARTZ_BRICK_SLAB));
        addDrop(EBBlocks.QUARTZ_BRICK_WALL);
        addTerracottaTileSlabDrops();
        addTerracottaTileVerticalStairsDrops();
        addTerracottaTilesDrops();
        addTerracottaTileStairsDrops();
        addDrop(EBBlocks.TERRACOTTA_TILES);
        addDrop(EBBlocks.TERRACOTTA_TILE_STAIRS);
        addDrop(EBBlocks.TERRACOTTA_TILE_VERTICAL_STAIRS);
        addDrop(EBBlocks.TERRACOTTA_TILE_SLAB, slabDrops(EBBlocks.TERRACOTTA_TILE_SLAB));
        addDrop(EBBlocks.OAK_VERTICAL_STAIRS);
        addDrop(EBBlocks.SPRUCE_VERTICAL_STAIRS);
        addDrop(EBBlocks.BIRCH_VERTICAL_STAIRS);
        addDrop(EBBlocks.JUNGLE_VERTICAL_STAIRS);
        addDrop(EBBlocks.ACACIA_VERTICAL_STAIRS);
        addDrop(EBBlocks.DARK_OAK_VERTICAL_STAIRS);
        addDrop(EBBlocks.MANGROVE_VERTICAL_STAIRS);
        addDrop(EBBlocks.CHERRY_VERTICAL_STAIRS);
        addDrop(EBBlocks.BAMBOO_VERTICAL_STAIRS);
        addDrop(EBBlocks.CRIMSON_VERTICAL_STAIRS);
        addDrop(EBBlocks.WARPED_VERTICAL_STAIRS);
        addDrop(EBBlocks.STONE_VERTICAL_STAIRS);
        addDrop(EBBlocks.COBBLESTONE_VERTICAL_STAIRS);
        addDrop(EBBlocks.STONE_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.MOSSY_STONE_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.MOSSY_COBBLESTONE_VERTICAL_STAIRS);
        addDrop(EBBlocks.DEEPSLATE_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.COBBLED_DEEPSLATE_VERTICAL_STAIRS);
        addDrop(EBBlocks.DEEPSLATE_TILE_VERTICAL_STAIRS);
        addDrop(EBBlocks.POLISHED_DEEPSLATE_VERTICAL_STAIRS);
        addDrop(EBBlocks.QUARTZ_VERTICAL_STAIRS);
        addDrop(EBBlocks.SMOOTH_QUARTZ_VERTICAL_STAIRS);
        addDrop(EBBlocks.BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.SANDSTONE_VERTICAL_STAIRS);
        addDrop(EBBlocks.SMOOTH_SANDSTONE_VERTICAL_STAIRS);
        addDrop(EBBlocks.RED_SANDSTONE_VERTICAL_STAIRS);
        addDrop(EBBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS);
        addDrop(EBBlocks.BLACKSTONE_VERTICAL_STAIRS);
        addDrop(EBBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.POLISHED_BLACKSTONE_VERTICAL_STAIRS);
        addDrop(EBBlocks.PRISMARINE_VERTICAL_STAIRS);
        addDrop(EBBlocks.PRISMARINE_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.DARK_PRISMARINE_VERTICAL_STAIRS);
        addDrop(EBBlocks.ANDESITE_VERTICAL_STAIRS);
        addDrop(EBBlocks.POLISHED_ANDESITE_VERTICAL_STAIRS);
        addDrop(EBBlocks.GRANITE_VERTICAL_STAIRS);
        addDrop(EBBlocks.POLISHED_GRANITE_VERTICAL_STAIRS);
        addDrop(EBBlocks.DIORITE_VERTICAL_STAIRS);
        addDrop(EBBlocks.POLISHED_DIORITE_VERTICAL_STAIRS);
        addDrop(EBBlocks.END_STONE_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.PURPUR_VERTICAL_STAIRS);
        addDrop(EBBlocks.NETHER_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.RED_NETHER_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.CUT_COPPER_VERTICAL_STAIRS);
        addDrop(EBBlocks.EXPOSED_CUT_COPPER_VERTICAL_STAIRS);
        addDrop(EBBlocks.WEATHERED_CUT_COPPER_VERTICAL_STAIRS);
        addDrop(EBBlocks.OXIDIZED_CUT_COPPER_VERTICAL_STAIRS);
        addDrop(EBBlocks.WAXED_CUT_COPPER_VERTICAL_STAIRS);
        addDrop(EBBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_STAIRS);
        addDrop(EBBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_STAIRS);
        addDrop(EBBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_STAIRS);
        addDrop(EBBlocks.TUFF_VERTICAL_STAIRS);
        addDrop(EBBlocks.POLISHED_TUFF_VERTICAL_STAIRS);
        addDrop(EBBlocks.TUFF_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.GLOOM_SEEDS);
        addDrop(EBBlocks.GRANITE_BRICKS);
        addDrop(EBBlocks.GRANITE_BRICK_STAIRS);
        addDrop(EBBlocks.GRANITE_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.GRANITE_BRICK_SLAB);
        addDrop(EBBlocks.GRANITE_BRICK_WALL);
        addDrop(EBBlocks.ANDESITE_BRICKS);
        addDrop(EBBlocks.ANDESITE_BRICK_STAIRS);
        addDrop(EBBlocks.ANDESITE_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.ANDESITE_BRICK_SLAB);
        addDrop(EBBlocks.ANDESITE_BRICK_WALL);
        addDrop(EBBlocks.DIORITE_BRICKS);
        addDrop(EBBlocks.DIORITE_BRICK_STAIRS);
        addDrop(EBBlocks.DIORITE_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.DIORITE_BRICK_SLAB);
        addDrop(EBBlocks.DIORITE_BRICK_WALL);
        addDrop(EBBlocks.SMOOTH_BRICKS);
        addDrop(EBBlocks.SMOOTH_BRICK_STAIRS);
        addDrop(EBBlocks.SMOOTH_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.SMOOTH_BRICK_SLAB);
        addDrop(EBBlocks.SMOOTH_BRICK_WALL);
        addDrop(EBBlocks.CRACKED_BRICKS);
        addDrop(EBBlocks.CRACKED_SMOOTH_BRICKS);
        addDrop(EBBlocks.HERRINGBONE_BRICKS);
        addDrop(EBBlocks.SMOOTH_HERRINGBONE_BRICKS);
        addDrop(EBBlocks.REACHING_LANTERN);
        this.addDrop(EBBlocks.SPRUCE_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        this.addDrop(EBBlocks.BIRCH_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        this.addDrop(EBBlocks.JUNGLE_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        this.addDrop(EBBlocks.ACACIA_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        this.addDrop(EBBlocks.DARK_OAK_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        this.addDrop(EBBlocks.MANGROVE_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        this.addDrop(EBBlocks.CHERRY_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        this.addDrop(EBBlocks.BAMBOO_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        this.addDrop(EBBlocks.CRIMSON_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        this.addDrop(EBBlocks.WARPED_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        this.addDrop(EBBlocks.ANCIENT_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        this.addDrop(EBBlocks.GLOOM_BOOKSHELF, block -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDrop(EBBlocks.BRIMSTONE);
        addDrop(EBBlocks.BRIMSTONE_STAIRS);
        addDrop(EBBlocks.BRIMSTONE_VERTICAL_STAIRS);
        addDrop(EBBlocks.BRIMSTONE_SLAB);
        addDrop(EBBlocks.BRIMSTONE_WALL);
        addDrop(EBBlocks.POLISHED_BRIMSTONE);
        addDrop(EBBlocks.POLISHED_BRIMSTONE_STAIRS);
        addDrop(EBBlocks.POLISHED_BRIMSTONE_VERTICAL_STAIRS);
        addDrop(EBBlocks.POLISHED_BRIMSTONE_SLAB);
        addDrop(EBBlocks.BRIMSTONE_BRICKS);
        addDrop(EBBlocks.BRIMSTONE_BRICK_STAIRS);
        addDrop(EBBlocks.BRIMSTONE_BRICK_VERTICAL_STAIRS);
        addDrop(EBBlocks.BRIMSTONE_BRICK_SLAB);
        addDrop(EBBlocks.BRIMSTONE_TILES);
        addDrop(EBBlocks.BRIMSTONE_TILE_STAIRS);
        addDrop(EBBlocks.BRIMSTONE_TILE_VERTICAL_STAIRS);
        addDrop(EBBlocks.BRIMSTONE_TILE_SLAB);
        addDrop(EBBlocks.BRIMSTONE_PILLAR);
        addDrop(EBBlocks.BRIMSTONE_WINDOW);
        addDrop(EBBlocks.BRIMSTONE_LAMP);
    }

    private void addDyedKnittedWoolDrops() {
        for (DyeColor colors : DyeColor.values()) {
            addDrop(EBBlocks.getDyedKnittedWools(colors.getId()));
        }
    }

    private void addDyedKnittedCarpetDrops() {
        for (DyeColor colors : DyeColor.values()) {
            addDrop(EBBlocks.getDyedKnittedCarpets(colors.getId()));
        }
    }

    private void addTerracottaTilesDrops() {
        for (DyeColor colors : DyeColor.values()) {
            addDrop(EBBlocks.getDyedTerracottaTiles(colors.getId()));
        }
    }

    private void addTerracottaTileStairsDrops() {
        for (DyeColor colors : DyeColor.values()) {
            addDrop(EBBlocks.getDyedTerracottaTileStairs(colors.getId()));
        }
    }

    private void addTerracottaTileVerticalStairsDrops() {
        for (DyeColor colors : DyeColor.values()) {
            addDrop(EBBlocks.getDyedTerracottaTileVerticalStairs(colors.getId()));
        }
    }

    private void addTerracottaTileSlabDrops() {
        for (DyeColor colors : DyeColor.values()) {
            addDrop(EBBlocks.getDyedTerracottaTileSlab(colors.getId()));
        }
    }

    public LootTable.Builder ancientLeavesDrops(Block leaves, Block sapling, float... saplingChance) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.leavesDrops(leaves, sapling, saplingChance)
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0F))
                        .conditionally(this.createWithoutShearsOrSilkTouchCondition()).with(
                                ((LeafEntry.Builder) this.addSurvivesExplosionCondition(leaves, ItemEntry.builder(EBItems.ANCIENT_FRUIT)))
                                        .conditionally(TableBonusLootCondition.builder(impl.getOrThrow(Enchantments.FORTUNE), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))
                        )
                );
    }
}
