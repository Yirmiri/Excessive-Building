package net.yirmiri.excessive_building.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.registry.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBItemGroups {
    public static CreativeModeTab EXCESSIVE_BUILDING = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, "excessive_building"),
            FabricItemGroup.builder().icon(() -> new ItemStack(EBBlocks.LOGO_BLOCK)).title(Component.translatable("itemgroup.excessive_building")).displayItems((ctx, entries) -> {
                entries.accept(EBBlocks.OAK_MOSAIC);
                entries.accept(EBBlocks.OAK_MOSAIC_STAIRS);
                entries.accept(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.OAK_MOSAIC_SLAB);
                entries.accept(EBBlocks.CHISELED_OAK_PLANKS);
                entries.accept(Blocks.BOOKSHELF);
                entries.accept(EBBlocks.OAK_DECORATIVE_SHELF);
                entries.accept(Blocks.CRAFTING_TABLE);
                entries.accept(Blocks.CHEST);
                entries.accept(Blocks.TRAPPED_CHEST);
                entries.accept(Blocks.LADDER);

                entries.accept(EBBlocks.SPRUCE_MOSAIC);
                entries.accept(EBBlocks.SPRUCE_MOSAIC_STAIRS);
                entries.accept(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.SPRUCE_MOSAIC_SLAB);
                entries.accept(EBBlocks.CHISELED_SPRUCE_PLANKS);
                entries.accept(EBBlocks.SPRUCE_BOOKSHELF);
                entries.accept(EBBlocks.SPRUCE_DECORATIVE_SHELF);
                entries.accept(EBBlocks.SPRUCE_CRAFTING_TABLE);
                //entries.add(EBBlocks.SPRUCE_CHEST);
                //entries.add(EBBlocks.TRAPPED_SPRUCE_CHEST);
                entries.accept(EBBlocks.SPRUCE_LADDER);

                entries.accept(EBBlocks.BIRCH_MOSAIC);
                entries.accept(EBBlocks.BIRCH_MOSAIC_STAIRS);
                entries.accept(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.BIRCH_MOSAIC_SLAB);
                entries.accept(EBBlocks.CHISELED_BIRCH_PLANKS);
                entries.accept(EBBlocks.BIRCH_BOOKSHELF);
                entries.accept(EBBlocks.BIRCH_DECORATIVE_SHELF);
                entries.accept(EBBlocks.BIRCH_CRAFTING_TABLE);
                //entries.add(EBBlocks.BIRCH_CHEST);
                //entries.add(EBBlocks.TRAPPED_BIRCH_CHEST);
                entries.accept(EBBlocks.BIRCH_LADDER);

                entries.accept(EBBlocks.JUNGLE_MOSAIC);
                entries.accept(EBBlocks.JUNGLE_MOSAIC_STAIRS);
                entries.accept(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.JUNGLE_MOSAIC_SLAB);
                entries.accept(EBBlocks.CHISELED_JUNGLE_PLANKS);
                entries.accept(EBBlocks.JUNGLE_BOOKSHELF);
                entries.accept(EBBlocks.JUNGLE_DECORATIVE_SHELF);
                entries.accept(EBBlocks.JUNGLE_CRAFTING_TABLE);
                //entries.add(EBBlocks.JUNGLE_CHEST);
                //entries.add(EBBlocks.TRAPPED_JUNGLE_CHEST);
                entries.accept(EBBlocks.JUNGLE_LADDER);

                entries.accept(EBBlocks.ACACIA_MOSAIC);
                entries.accept(EBBlocks.ACACIA_MOSAIC_STAIRS);
                entries.accept(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.ACACIA_MOSAIC_SLAB);
                entries.accept(EBBlocks.CHISELED_ACACIA_PLANKS);
                entries.accept(EBBlocks.ACACIA_BOOKSHELF);
                entries.accept(EBBlocks.ACACIA_DECORATIVE_SHELF);
                entries.accept(EBBlocks.ACACIA_CRAFTING_TABLE);
                //entries.add(EBBlocks.ACACIA_CHEST);
                //entries.add(EBBlocks.TRAPPED_ACACIA_CHEST);
                entries.accept(EBBlocks.ACACIA_LADDER);

                entries.accept(EBBlocks.DARK_OAK_MOSAIC);
                entries.accept(EBBlocks.DARK_OAK_MOSAIC_STAIRS);
                entries.accept(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.DARK_OAK_MOSAIC_SLAB);
                entries.accept(EBBlocks.CHISELED_DARK_OAK_PLANKS);
                entries.accept(EBBlocks.DARK_OAK_BOOKSHELF);
                entries.accept(EBBlocks.DARK_OAK_DECORATIVE_SHELF);
                entries.accept(EBBlocks.DARK_OAK_CRAFTING_TABLE);
                //entries.add(EBBlocks.DARK_OAK_CHEST);
                //entries.add(EBBlocks.TRAPPED_DARK_OAK_CHEST);
                entries.accept(EBBlocks.DARK_OAK_LADDER);

                entries.accept(EBBlocks.MANGROVE_MOSAIC);
                entries.accept(EBBlocks.MANGROVE_MOSAIC_STAIRS);
                entries.accept(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.MANGROVE_MOSAIC_SLAB);
                entries.accept(EBBlocks.CHISELED_MANGROVE_PLANKS);
                entries.accept(EBBlocks.MANGROVE_BOOKSHELF);
                entries.accept(EBBlocks.MANGROVE_DECORATIVE_SHELF);
                entries.accept(EBBlocks.MANGROVE_CRAFTING_TABLE);
                //entries.add(EBBlocks.MANGROVE_CHEST);
                //entries.add(EBBlocks.TRAPPED_MANGROVE_CHEST);
                entries.accept(EBBlocks.MANGROVE_LADDER);

                entries.accept(EBBlocks.CHERRY_MOSAIC);
                entries.accept(EBBlocks.CHERRY_MOSAIC_STAIRS);
                entries.accept(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.CHERRY_MOSAIC_SLAB);
                entries.accept(EBBlocks.CHISELED_CHERRY_PLANKS);
                entries.accept(EBBlocks.CHERRY_BOOKSHELF);
                entries.accept(EBBlocks.CHERRY_DECORATIVE_SHELF);
                entries.accept(EBBlocks.CHERRY_CRAFTING_TABLE);
                //entries.add(EBBlocks.CHERRY_CHEST);
                //entries.add(EBBlocks.TRAPPED_CHERRY_CHEST);
                entries.accept(EBBlocks.CHERRY_LADDER);

                entries.accept(EBBlocks.ANCIENT_LOG);
                entries.accept(EBBlocks.STRIPPED_ANCIENT_LOG);
                entries.accept(EBBlocks.ANCIENT_WOOD);
                entries.accept(EBBlocks.STRIPPED_ANCIENT_WOOD);
                entries.accept(EBBlocks.ANCIENT_PLANKS);
                entries.accept(EBBlocks.ANCIENT_MOSAIC);
                entries.accept(EBBlocks.ANCIENT_STAIRS);
                entries.accept(EBBlocks.ANCIENT_MOSAIC_STAIRS);
                entries.accept(EBBlocks.ANCIENT_VERTICAL_STAIRS);
                entries.accept(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.ANCIENT_SLAB);
                entries.accept(EBBlocks.ANCIENT_MOSAIC_SLAB);
                entries.accept(EBBlocks.CHISELED_ANCIENT_PLANKS);
                entries.accept(EBBlocks.ANCIENT_FENCE);
                entries.accept(EBBlocks.ANCIENT_FENCE_GATE);
                entries.accept(EBBlocks.ANCIENT_DOOR);
                entries.accept(EBBlocks.ANCIENT_TRAPDOOR);
                entries.accept(EBBlocks.ANCIENT_PRESSURE_PLATE);
                entries.accept(EBBlocks.ANCIENT_BUTTON);
                entries.accept(EBBlocks.ANCIENT_BOOKSHELF);
                entries.accept(EBBlocks.ANCIENT_DECORATIVE_SHELF);
                entries.accept(EBBlocks.ANCIENT_CRAFTING_TABLE);
                //entries.add(EBBlocks.ANCIENT_CHEST);
                //entries.add(EBBlocks.TRAPPED_ANCIENT_CHEST);
                entries.accept(EBBlocks.ANCIENT_LADDER);

                entries.accept(EBBlocks.GLOOM_LOG);
                entries.accept(EBBlocks.STRIPPED_GLOOM_LOG);
                entries.accept(EBBlocks.GLOOM_WOOD);
                entries.accept(EBBlocks.STRIPPED_GLOOM_WOOD);
                entries.accept(EBBlocks.GLOOM_PLANKS);
                entries.accept(EBBlocks.GLOOM_MOSAIC);
                entries.accept(EBBlocks.GLOOM_STAIRS);
                entries.accept(EBBlocks.GLOOM_MOSAIC_STAIRS);
                entries.accept(EBBlocks.GLOOM_VERTICAL_STAIRS);
                entries.accept(EBBlocks.GLOOM_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.GLOOM_SLAB);
                entries.accept(EBBlocks.GLOOM_MOSAIC_SLAB);
                entries.accept(EBBlocks.CHISELED_GLOOM_PLANKS);
                entries.accept(EBBlocks.GLOOM_FENCE);
                entries.accept(EBBlocks.GLOOM_FENCE_GATE);
                entries.accept(EBBlocks.GLOOM_DOOR);
                entries.accept(EBBlocks.GLOOM_TRAPDOOR);
                entries.accept(EBBlocks.GLOOM_PRESSURE_PLATE);
                entries.accept(EBBlocks.GLOOM_BUTTON);
                entries.accept(EBBlocks.GLOOM_BOOKSHELF);
                entries.accept(EBBlocks.GLOOM_DECORATIVE_SHELF);
                entries.accept(EBBlocks.GLOOM_CRAFTING_TABLE);
                //entries.add(EBBlocks.GLOOM_CHEST);
                //entries.add(EBBlocks.TRAPPED_GLOOM_CHEST);
                entries.accept(EBBlocks.GLOOM_LADDER);

                entries.accept(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.CHISELED_BAMBOO_PLANKS);
                entries.accept(EBBlocks.BAMBOO_BOOKSHELF);
                entries.accept(EBBlocks.BAMBOO_DECORATIVE_SHELF);
                entries.accept(EBBlocks.BAMBOO_CRAFTING_TABLE);
                //entries.add(EBBlocks.BAMBOO_CHEST);
                //entries.add(EBBlocks.TRAPPED_BAMBOO_CHEST);
                entries.accept(EBBlocks.BAMBOO_LADDER);

                entries.accept(EBBlocks.CRIMSON_MOSAIC);
                entries.accept(EBBlocks.CRIMSON_MOSAIC_STAIRS);
                entries.accept(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.CRIMSON_MOSAIC_SLAB);
                entries.accept(EBBlocks.CHISELED_CRIMSON_PLANKS);
                entries.accept(EBBlocks.CRIMSON_BOOKSHELF);
                entries.accept(EBBlocks.CRIMSON_DECORATIVE_SHELF);
                entries.accept(EBBlocks.CRIMSON_CRAFTING_TABLE);
                //entries.add(EBBlocks.CRIMSON_CHEST);
                //entries.add(EBBlocks.TRAPPED_CRIMSON_CHEST);
                entries.accept(EBBlocks.CRIMSON_LADDER);

                entries.accept(EBBlocks.WARPED_MOSAIC);
                entries.accept(EBBlocks.WARPED_MOSAIC_STAIRS);
                entries.accept(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WARPED_MOSAIC_SLAB);
                entries.accept(EBBlocks.CHISELED_WARPED_PLANKS);
                entries.accept(EBBlocks.WARPED_BOOKSHELF);
                entries.accept(EBBlocks.WARPED_DECORATIVE_SHELF);
                entries.accept(EBBlocks.WARPED_CRAFTING_TABLE);
                //entries.add(EBBlocks.WARPED_CHEST);
                //entries.add(EBBlocks.TRAPPED_WARPED_CHEST);
                entries.accept(EBBlocks.WARPED_LADDER);

                entries.accept(EBBlocks.PAPER_BLOCK);
                entries.accept(EBBlocks.THIN_PAPER_BLOCK);
                entries.accept(EBBlocks.THIN_DIAGONAL_PAPER_BLOCK);
                entries.accept(EBBlocks.THIN_DIVIDED_PAPER_BLOCK);
                entries.accept(EBBlocks.THIN_PAPER_STAIRS);
                entries.accept(EBBlocks.THIN_PAPER_VERTICAL_STAIRS);
                entries.accept(EBBlocks.THIN_PAPER_SLAB);
                entries.accept(EBBlocks.THICK_PAPER_BLOCK);
                entries.accept(EBBlocks.THICK_DIAGONAL_PAPER_BLOCK);
                entries.accept(EBBlocks.THICK_DIVIDED_PAPER_BLOCK);
                entries.accept(EBBlocks.THICK_PAPER_STAIRS);
                entries.accept(EBBlocks.THICK_PAPER_VERTICAL_STAIRS);
                entries.accept(EBBlocks.THICK_PAPER_SLAB);

                entries.accept(EBBlocks.POLISHED_STONE);
                entries.accept(EBBlocks.POLISHED_STONE_STAIRS);
                entries.accept(EBBlocks.POLISHED_STONE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.POLISHED_STONE_SLAB);

                entries.accept(EBBlocks.COBBLESTONE_BRICKS);
                entries.accept(EBBlocks.CRACKED_COBBLESTONE_BRICKS);
                entries.accept(EBBlocks.COBBLESTONE_BRICK_STAIRS);
                entries.accept(EBBlocks.COBBLESTONE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.COBBLESTONE_BRICK_SLAB);
                entries.accept(EBBlocks.COBBLESTONE_BRICK_WALL);

                entries.accept(EBBlocks.MOSSY_COBBLESTONE_BRICKS);
                entries.accept(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS);
                entries.accept(EBBlocks.MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB);
                entries.accept(EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL);

                entries.accept(EBBlocks.SMOOTH_STONE_BRICKS);
                entries.accept(EBBlocks.CRACKED_SMOOTH_STONE_BRICKS);
                entries.accept(EBBlocks.SMOOTH_STONE_BRICK_STAIRS);
                entries.accept(EBBlocks.SMOOTH_STONE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.SMOOTH_STONE_BRICK_SLAB);
                entries.accept(EBBlocks.SMOOTH_STONE_PILLAR);

                entries.accept(EBBlocks.GRANITE_BRICKS);
                entries.accept(EBBlocks.CRACKED_GRANITE_BRICKS);
                entries.accept(EBBlocks.GRANITE_BRICK_STAIRS);
                entries.accept(EBBlocks.GRANITE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.GRANITE_BRICK_SLAB);
                entries.accept(EBBlocks.GRANITE_BRICK_WALL);

                entries.accept(EBBlocks.DIORITE_BRICKS);
                entries.accept(EBBlocks.CRACKED_DIORITE_BRICKS);
                entries.accept(EBBlocks.DIORITE_BRICK_STAIRS);
                entries.accept(EBBlocks.DIORITE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.DIORITE_BRICK_SLAB);
                entries.accept(EBBlocks.DIORITE_BRICK_WALL);

                entries.accept(EBBlocks.ANDESITE_BRICKS);
                entries.accept(EBBlocks.CRACKED_ANDESITE_BRICKS);
                entries.accept(EBBlocks.ANDESITE_BRICK_STAIRS);
                entries.accept(EBBlocks.ANDESITE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.ANDESITE_BRICK_SLAB);
                entries.accept(EBBlocks.ANDESITE_BRICK_WALL);

                entries.accept(EBBlocks.COBBLED_DEEPSLATE_BRICKS);
                entries.accept(EBBlocks.CRACKED_COBBLED_DEEPSLATE_BRICKS);
                entries.accept(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS);
                entries.accept(EBBlocks.COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB);
                entries.accept(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL);

                entries.accept(EBBlocks.CRACKED_BRICKS);
                entries.accept(EBBlocks.HERRINGBONE_BRICKS);
                entries.accept(EBBlocks.SMOOTH_BRICKS);
                entries.accept(EBBlocks.CRACKED_SMOOTH_BRICKS);
                entries.accept(EBBlocks.SMOOTH_BRICK_STAIRS);
                entries.accept(EBBlocks.SMOOTH_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.SMOOTH_BRICK_SLAB);
                entries.accept(EBBlocks.SMOOTH_BRICK_WALL);
                entries.accept(EBBlocks.SMOOTH_HERRINGBONE_BRICKS);

                entries.accept(EBBlocks.BLACKSTONE_BRICKS);
                entries.accept(EBBlocks.CRACKED_BLACKSTONE_BRICKS);
                entries.accept(EBBlocks.BLACKSTONE_BRICK_STAIRS);
                entries.accept(EBBlocks.BLACKSTONE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.BLACKSTONE_BRICK_SLAB);
                entries.accept(EBBlocks.BLACKSTONE_BRICK_WALL);

                entries.accept(EBBlocks.BRIMSTONE);
                entries.accept(EBBlocks.BRIMSTONE_STAIRS);
                entries.accept(EBBlocks.BRIMSTONE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.BRIMSTONE_SLAB);
                entries.accept(EBBlocks.BRIMSTONE_WALL);

                entries.accept(EBBlocks.POLISHED_BRIMSTONE);
                entries.accept(EBBlocks.POLISHED_BRIMSTONE_STAIRS);
                entries.accept(EBBlocks.POLISHED_BRIMSTONE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.POLISHED_BRIMSTONE_SLAB);

                entries.accept(EBBlocks.BRIMSTONE_BRICKS);
                entries.accept(EBBlocks.CRACKED_BRIMSTONE_BRICKS);
                entries.accept(EBBlocks.BRIMSTONE_BRICK_STAIRS);
                entries.accept(EBBlocks.BRIMSTONE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.BRIMSTONE_BRICK_SLAB);

                entries.accept(EBBlocks.BRIMSTONE_TILES);
                entries.accept(EBBlocks.BRIMSTONE_TILE_STAIRS);
                entries.accept(EBBlocks.BRIMSTONE_TILE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.BRIMSTONE_TILE_SLAB);

                entries.accept(EBBlocks.BRIMSTONE_PILLAR);
                entries.accept(EBBlocks.BRIMSTONE_LAMP);
                entries.accept(EBBlocks.BRIMSTONE_WINDOW);

                entries.accept(EBBlocks.ASPHALT);
                entries.accept(EBBlocks.ASPHALT_STAIRS);
                entries.accept(EBBlocks.ASPHALT_VERTICAL_STAIRS);
                entries.accept(EBBlocks.ASPHALT_SLAB);

                entries.accept(EBItems.ANCIENT_SIGN);
                entries.accept(EBItems.ANCIENT_HANGING_SIGN);
                entries.accept(EBItems.GLOOM_SIGN);
                entries.accept(EBItems.GLOOM_HANGING_SIGN);

                entries.accept(EBBlocks.ANCIENT_LEAVES);
                entries.accept(EBBlocks.GLOOM_LEAVES);

                entries.accept(EBBlocks.ANCIENT_SAPLING);
                entries.accept(EBBlocks.GLOOM_SAPLING);
                entries.accept(EBBlocks.GLOOM_SEEDS);

                entries.accept(EBItems.ANCIENT_FRUIT);

                entries.accept(EBBlocks.SEA_GLASS);
                entries.accept(EBBlocks.SCARLET_SEA_GLASS);
                entries.accept(EBBlocks.VERDANT_SEA_GLASS);
                entries.accept(EBBlocks.AQUA_SEA_GLASS);
                entries.accept(EBBlocks.FUCHSIA_SEA_GLASS);
                entries.accept(EBBlocks.ROSE_SEA_GLASS);

                entries.accept(EBBlocks.SEA_GLASS_PANE);
                entries.accept(EBBlocks.SCARLET_SEA_GLASS_PANE);
                entries.accept(EBBlocks.VERDANT_SEA_GLASS_PANE);
                entries.accept(EBBlocks.AQUA_SEA_GLASS_PANE);
                entries.accept(EBBlocks.FUCHSIA_SEA_GLASS_PANE);
                entries.accept(EBBlocks.ROSE_SEA_GLASS_PANE);

                entries.accept(EBBlocks.getDyedKnittedWools(DyeColor.WHITE.getId()));
                entries.accept(EBBlocks.getDyedKnittedWools(DyeColor.LIGHT_GRAY.getId()));
                entries.accept(EBBlocks.getDyedKnittedWools(DyeColor.GRAY.getId()));
                entries.accept(EBBlocks.getDyedKnittedWools(DyeColor.BLACK.getId()));
                entries.accept(EBBlocks.getDyedKnittedWools(DyeColor.BROWN.getId()));
                entries.accept(EBBlocks.getDyedKnittedWools(DyeColor.RED.getId()));
                entries.accept(EBBlocks.getDyedKnittedWools(DyeColor.ORANGE.getId()));
                entries.accept(EBBlocks.getDyedKnittedWools(DyeColor.YELLOW.getId()));
                entries.accept(EBBlocks.getDyedKnittedWools(DyeColor.LIME.getId()));
                entries.accept(EBBlocks.getDyedKnittedWools(DyeColor.GREEN.getId()));
                entries.accept(EBBlocks.getDyedKnittedWools(DyeColor.CYAN.getId()));
                entries.accept(EBBlocks.getDyedKnittedWools(DyeColor.LIGHT_BLUE.getId()));
                entries.accept(EBBlocks.getDyedKnittedWools(DyeColor.BLUE.getId()));
                entries.accept(EBBlocks.getDyedKnittedWools(DyeColor.PURPLE.getId()));
                entries.accept(EBBlocks.getDyedKnittedWools(DyeColor.MAGENTA.getId()));
                entries.accept(EBBlocks.getDyedKnittedWools(DyeColor.PINK.getId()));

                entries.accept(EBBlocks.getDyedKnittedCarpets(DyeColor.WHITE.getId()));
                entries.accept(EBBlocks.getDyedKnittedCarpets(DyeColor.LIGHT_GRAY.getId()));
                entries.accept(EBBlocks.getDyedKnittedCarpets(DyeColor.GRAY.getId()));
                entries.accept(EBBlocks.getDyedKnittedCarpets(DyeColor.BLACK.getId()));
                entries.accept(EBBlocks.getDyedKnittedCarpets(DyeColor.BROWN.getId()));
                entries.accept(EBBlocks.getDyedKnittedCarpets(DyeColor.RED.getId()));
                entries.accept(EBBlocks.getDyedKnittedCarpets(DyeColor.ORANGE.getId()));
                entries.accept(EBBlocks.getDyedKnittedCarpets(DyeColor.YELLOW.getId()));
                entries.accept(EBBlocks.getDyedKnittedCarpets(DyeColor.LIME.getId()));
                entries.accept(EBBlocks.getDyedKnittedCarpets(DyeColor.GREEN.getId()));
                entries.accept(EBBlocks.getDyedKnittedCarpets(DyeColor.CYAN.getId()));
                entries.accept(EBBlocks.getDyedKnittedCarpets(DyeColor.LIGHT_BLUE.getId()));
                entries.accept(EBBlocks.getDyedKnittedCarpets(DyeColor.BLUE.getId()));
                entries.accept(EBBlocks.getDyedKnittedCarpets(DyeColor.PURPLE.getId()));
                entries.accept(EBBlocks.getDyedKnittedCarpets(DyeColor.MAGENTA.getId()));
                entries.accept(EBBlocks.getDyedKnittedCarpets(DyeColor.PINK.getId()));

                entries.accept(EBBlocks.TERRACOTTA_TILES);
                entries.accept(EBBlocks.TERRACOTTA_TILE_STAIRS);
                entries.accept(EBBlocks.TERRACOTTA_TILE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.TERRACOTTA_TILE_SLAB);

                entries.accept(EBBlocks.getDyedTerracottaTiles(DyeColor.WHITE.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileStairs(DyeColor.WHITE.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.WHITE.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileSlab(DyeColor.WHITE.getId()));

                entries.accept(EBBlocks.getDyedTerracottaTiles(DyeColor.LIGHT_GRAY.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileStairs(DyeColor.LIGHT_GRAY.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.LIGHT_GRAY.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileSlab(DyeColor.LIGHT_GRAY.getId()));

                entries.accept(EBBlocks.getDyedTerracottaTiles(DyeColor.GRAY.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileStairs(DyeColor.GRAY.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.GRAY.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileSlab(DyeColor.GRAY.getId()));

                entries.accept(EBBlocks.getDyedTerracottaTiles(DyeColor.BLACK.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileStairs(DyeColor.BLACK.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.BLACK.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileSlab(DyeColor.BLACK.getId()));

                entries.accept(EBBlocks.getDyedTerracottaTiles(DyeColor.BROWN.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileStairs(DyeColor.BROWN.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.BROWN.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileSlab(DyeColor.BROWN.getId()));

                entries.accept(EBBlocks.getDyedTerracottaTiles(DyeColor.RED.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileStairs(DyeColor.RED.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.RED.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileSlab(DyeColor.RED.getId()));

                entries.accept(EBBlocks.getDyedTerracottaTiles(DyeColor.ORANGE.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileStairs(DyeColor.ORANGE.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.ORANGE.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileSlab(DyeColor.ORANGE.getId()));

                entries.accept(EBBlocks.getDyedTerracottaTiles(DyeColor.YELLOW.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileStairs(DyeColor.YELLOW.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.YELLOW.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileSlab(DyeColor.YELLOW.getId()));

                entries.accept(EBBlocks.getDyedTerracottaTiles(DyeColor.LIME.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileStairs(DyeColor.LIME.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.LIME.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileSlab(DyeColor.LIME.getId()));

                entries.accept(EBBlocks.getDyedTerracottaTiles(DyeColor.GREEN.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileStairs(DyeColor.GREEN.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.GREEN.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileSlab(DyeColor.GREEN.getId()));

                entries.accept(EBBlocks.getDyedTerracottaTiles(DyeColor.CYAN.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileStairs(DyeColor.CYAN.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.CYAN.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileSlab(DyeColor.CYAN.getId()));

                entries.accept(EBBlocks.getDyedTerracottaTiles(DyeColor.LIGHT_BLUE.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileStairs(DyeColor.LIGHT_BLUE.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.LIGHT_BLUE.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileSlab(DyeColor.LIGHT_BLUE.getId()));

                entries.accept(EBBlocks.getDyedTerracottaTiles(DyeColor.BLUE.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileStairs(DyeColor.BLUE.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.BLUE.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileSlab(DyeColor.BLUE.getId()));

                entries.accept(EBBlocks.getDyedTerracottaTiles(DyeColor.PURPLE.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileStairs(DyeColor.PURPLE.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.PURPLE.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileSlab(DyeColor.PURPLE.getId()));

                entries.accept(EBBlocks.getDyedTerracottaTiles(DyeColor.MAGENTA.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileStairs(DyeColor.MAGENTA.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.MAGENTA.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileSlab(DyeColor.MAGENTA.getId()));

                entries.accept(EBBlocks.getDyedTerracottaTiles(DyeColor.PINK.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileStairs(DyeColor.PINK.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileVerticalStairs(DyeColor.PINK.getId()));
                entries.accept(EBBlocks.getDyedTerracottaTileSlab(DyeColor.PINK.getId()));

                entries.accept(EBBlocks.ALMENTRA);
                entries.accept(EBBlocks.ALMENTRA_STAIRS);
                entries.accept(EBBlocks.ALMENTRA_VERTICAL_STAIRS);
                entries.accept(EBBlocks.ALMENTRA_SLAB);

                entries.accept(EBBlocks.getDyedAlmentra(DyeColor.WHITE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStairs(DyeColor.WHITE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.WHITE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraSlab(DyeColor.WHITE.getId()));

                entries.accept(EBBlocks.getDyedAlmentra(DyeColor.LIGHT_GRAY.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStairs(DyeColor.LIGHT_GRAY.getId()));
                entries.accept(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.LIGHT_GRAY.getId()));
                entries.accept(EBBlocks.getDyedAlmentraSlab(DyeColor.LIGHT_GRAY.getId()));

                entries.accept(EBBlocks.getDyedAlmentra(DyeColor.GRAY.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStairs(DyeColor.GRAY.getId()));
                entries.accept(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.GRAY.getId()));
                entries.accept(EBBlocks.getDyedAlmentraSlab(DyeColor.GRAY.getId()));

                entries.accept(EBBlocks.getDyedAlmentra(DyeColor.BLACK.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStairs(DyeColor.BLACK.getId()));
                entries.accept(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.BLACK.getId()));
                entries.accept(EBBlocks.getDyedAlmentraSlab(DyeColor.BLACK.getId()));

                entries.accept(EBBlocks.getDyedAlmentra(DyeColor.BROWN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStairs(DyeColor.BROWN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.BROWN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraSlab(DyeColor.BROWN.getId()));

                entries.accept(EBBlocks.getDyedAlmentra(DyeColor.RED.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStairs(DyeColor.RED.getId()));
                entries.accept(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.RED.getId()));
                entries.accept(EBBlocks.getDyedAlmentraSlab(DyeColor.RED.getId()));

                entries.accept(EBBlocks.getDyedAlmentra(DyeColor.ORANGE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStairs(DyeColor.ORANGE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.ORANGE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraSlab(DyeColor.ORANGE.getId()));

                entries.accept(EBBlocks.getDyedAlmentra(DyeColor.YELLOW.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStairs(DyeColor.YELLOW.getId()));
                entries.accept(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.YELLOW.getId()));
                entries.accept(EBBlocks.getDyedAlmentraSlab(DyeColor.YELLOW.getId()));

                entries.accept(EBBlocks.getDyedAlmentra(DyeColor.LIME.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStairs(DyeColor.LIME.getId()));
                entries.accept(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.LIME.getId()));
                entries.accept(EBBlocks.getDyedAlmentraSlab(DyeColor.LIME.getId()));

                entries.accept(EBBlocks.getDyedAlmentra(DyeColor.GREEN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStairs(DyeColor.GREEN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.GREEN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraSlab(DyeColor.GREEN.getId()));

                entries.accept(EBBlocks.getDyedAlmentra(DyeColor.CYAN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStairs(DyeColor.CYAN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.CYAN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraSlab(DyeColor.CYAN.getId()));

                entries.accept(EBBlocks.getDyedAlmentra(DyeColor.LIGHT_BLUE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStairs(DyeColor.LIGHT_BLUE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.LIGHT_BLUE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraSlab(DyeColor.LIGHT_BLUE.getId()));

                entries.accept(EBBlocks.getDyedAlmentra(DyeColor.BLUE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStairs(DyeColor.BLUE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.BLUE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraSlab(DyeColor.BLUE.getId()));

                entries.accept(EBBlocks.getDyedAlmentra(DyeColor.PURPLE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStairs(DyeColor.PURPLE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.PURPLE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraSlab(DyeColor.PURPLE.getId()));

                entries.accept(EBBlocks.getDyedAlmentra(DyeColor.MAGENTA.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStairs(DyeColor.MAGENTA.getId()));
                entries.accept(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.MAGENTA.getId()));
                entries.accept(EBBlocks.getDyedAlmentraSlab(DyeColor.MAGENTA.getId()));

                entries.accept(EBBlocks.getDyedAlmentra(DyeColor.PINK.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStairs(DyeColor.PINK.getId()));
                entries.accept(EBBlocks.getDyedAlmentraVerticalStairs(DyeColor.PINK.getId()));
                entries.accept(EBBlocks.getDyedAlmentraSlab(DyeColor.PINK.getId()));

                entries.accept(EBBlocks.POLISHED_ALMENTRA);
                entries.accept(EBBlocks.POLISHED_ALMENTRA_STAIRS);
                entries.accept(EBBlocks.POLISHED_ALMENTRA_VERTICAL_STAIRS);
                entries.accept(EBBlocks.POLISHED_ALMENTRA_SLAB);

                entries.accept(EBBlocks.getDyedPolishedAlmentra(DyeColor.WHITE.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.WHITE.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.WHITE.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.WHITE.getId()));

                entries.accept(EBBlocks.getDyedPolishedAlmentra(DyeColor.LIGHT_GRAY.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.LIGHT_GRAY.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.LIGHT_GRAY.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.LIGHT_GRAY.getId()));

                entries.accept(EBBlocks.getDyedPolishedAlmentra(DyeColor.GRAY.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.GRAY.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.GRAY.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.GRAY.getId()));

                entries.accept(EBBlocks.getDyedPolishedAlmentra(DyeColor.BLACK.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.BLACK.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.BLACK.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.BLACK.getId()));

                entries.accept(EBBlocks.getDyedPolishedAlmentra(DyeColor.BROWN.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.BROWN.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.BROWN.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.BROWN.getId()));

                entries.accept(EBBlocks.getDyedPolishedAlmentra(DyeColor.RED.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.RED.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.RED.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.RED.getId()));

                entries.accept(EBBlocks.getDyedPolishedAlmentra(DyeColor.ORANGE.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.ORANGE.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.ORANGE.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.ORANGE.getId()));

                entries.accept(EBBlocks.getDyedPolishedAlmentra(DyeColor.YELLOW.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.YELLOW.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.YELLOW.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.YELLOW.getId()));

                entries.accept(EBBlocks.getDyedPolishedAlmentra(DyeColor.LIME.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.LIME.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.LIME.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.LIME.getId()));

                entries.accept(EBBlocks.getDyedPolishedAlmentra(DyeColor.GREEN.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.GREEN.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.GREEN.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.GREEN.getId()));

                entries.accept(EBBlocks.getDyedPolishedAlmentra(DyeColor.CYAN.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.CYAN.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.CYAN.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.CYAN.getId()));

                entries.accept(EBBlocks.getDyedPolishedAlmentra(DyeColor.LIGHT_BLUE.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.LIGHT_BLUE.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.LIGHT_BLUE.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.LIGHT_BLUE.getId()));

                entries.accept(EBBlocks.getDyedPolishedAlmentra(DyeColor.BLUE.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.BLUE.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.BLUE.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.BLUE.getId()));

                entries.accept(EBBlocks.getDyedPolishedAlmentra(DyeColor.PURPLE.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.PURPLE.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.PURPLE.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.PURPLE.getId()));

                entries.accept(EBBlocks.getDyedPolishedAlmentra(DyeColor.MAGENTA.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.MAGENTA.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.MAGENTA.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.MAGENTA.getId()));

                entries.accept(EBBlocks.getDyedPolishedAlmentra(DyeColor.PINK.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraStairs(DyeColor.PINK.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraVerticalStairs(DyeColor.PINK.getId()));
                entries.accept(EBBlocks.getDyedPolishedAlmentraSlab(DyeColor.PINK.getId()));

                entries.accept(EBBlocks.ALMENTRA_BRICKS);
                entries.accept(EBBlocks.ALMENTRA_BRICK_STAIRS);
                entries.accept(EBBlocks.ALMENTRA_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.ALMENTRA_BRICK_SLAB);

                entries.accept(EBBlocks.getDyedAlmentraBricks(DyeColor.WHITE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.WHITE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.WHITE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.WHITE.getId()));

                entries.accept(EBBlocks.getDyedAlmentraBricks(DyeColor.LIGHT_GRAY.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.LIGHT_GRAY.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.LIGHT_GRAY.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.LIGHT_GRAY.getId()));

                entries.accept(EBBlocks.getDyedAlmentraBricks(DyeColor.GRAY.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.GRAY.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.GRAY.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.GRAY.getId()));

                entries.accept(EBBlocks.getDyedAlmentraBricks(DyeColor.BLACK.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.BLACK.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.BLACK.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.BLACK.getId()));

                entries.accept(EBBlocks.getDyedAlmentraBricks(DyeColor.BROWN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.BROWN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.BROWN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.BROWN.getId()));

                entries.accept(EBBlocks.getDyedAlmentraBricks(DyeColor.RED.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.RED.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.RED.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.RED.getId()));

                entries.accept(EBBlocks.getDyedAlmentraBricks(DyeColor.ORANGE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.ORANGE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.ORANGE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.ORANGE.getId()));

                entries.accept(EBBlocks.getDyedAlmentraBricks(DyeColor.YELLOW.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.YELLOW.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.YELLOW.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.YELLOW.getId()));

                entries.accept(EBBlocks.getDyedAlmentraBricks(DyeColor.LIME.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.LIME.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.LIME.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.LIME.getId()));

                entries.accept(EBBlocks.getDyedAlmentraBricks(DyeColor.GREEN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.GREEN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.GREEN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.GREEN.getId()));

                entries.accept(EBBlocks.getDyedAlmentraBricks(DyeColor.CYAN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.CYAN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.CYAN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.CYAN.getId()));

                entries.accept(EBBlocks.getDyedAlmentraBricks(DyeColor.LIGHT_BLUE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.LIGHT_BLUE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.LIGHT_BLUE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.LIGHT_BLUE.getId()));

                entries.accept(EBBlocks.getDyedAlmentraBricks(DyeColor.BLUE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.BLUE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.BLUE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.BLUE.getId()));

                entries.accept(EBBlocks.getDyedAlmentraBricks(DyeColor.PURPLE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.PURPLE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.PURPLE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.PURPLE.getId()));

                entries.accept(EBBlocks.getDyedAlmentraBricks(DyeColor.MAGENTA.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.MAGENTA.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.MAGENTA.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.MAGENTA.getId()));

                entries.accept(EBBlocks.getDyedAlmentraBricks(DyeColor.PINK.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickStairs(DyeColor.PINK.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickVerticalStairs(DyeColor.PINK.getId()));
                entries.accept(EBBlocks.getDyedAlmentraBrickSlab(DyeColor.PINK.getId()));
                
                entries.accept(EBBlocks.ALMENTRA_STATUE);
                entries.accept(EBBlocks.getDyedAlmentraStatues(DyeColor.WHITE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStatues(DyeColor.LIGHT_GRAY.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStatues(DyeColor.GRAY.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStatues(DyeColor.BLACK.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStatues(DyeColor.BROWN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStatues(DyeColor.RED.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStatues(DyeColor.ORANGE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStatues(DyeColor.YELLOW.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStatues(DyeColor.LIME.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStatues(DyeColor.GREEN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStatues(DyeColor.CYAN.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStatues(DyeColor.LIGHT_BLUE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStatues(DyeColor.BLUE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStatues(DyeColor.PURPLE.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStatues(DyeColor.MAGENTA.getId()));
                entries.accept(EBBlocks.getDyedAlmentraStatues(DyeColor.PINK.getId()));

                entries.accept(EBBlocks.POLISHED_SANDSTONE);
                entries.accept(EBBlocks.POLISHED_SANDSTONE_STAIRS);
                entries.accept(EBBlocks.POLISHED_SANDSTONE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.POLISHED_SANDSTONE_SLAB);
                entries.accept(EBBlocks.POLISHED_SANDSTONE_WALL);
                entries.accept(EBBlocks.SANDSTONE_BRICKS);
                entries.accept(EBBlocks.SANDSTONE_BRICK_STAIRS);
                entries.accept(EBBlocks.SANDSTONE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.SANDSTONE_BRICK_SLAB);
                entries.accept(EBBlocks.SANDSTONE_BRICK_WALL);
                entries.accept(EBBlocks.SANDSTONE_TILES);
                entries.accept(EBBlocks.SANDSTONE_TILE_STAIRS);
                entries.accept(EBBlocks.SANDSTONE_TILE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.SANDSTONE_TILE_SLAB);
                entries.accept(EBBlocks.SANDSTONE_TILE_WALL);
                entries.accept(EBBlocks.CHISELED_SANDSTONE_BRICKS);
                entries.accept(EBBlocks.DECORATED_SANDSTONE_BRICKS);
                entries.accept(EBBlocks.ENGRAVED_SANDSTONE_BRICKS);
                entries.accept(EBBlocks.SANDSTONE_PILLAR);

                entries.accept(EBBlocks.POLISHED_RED_SANDSTONE);
                entries.accept(EBBlocks.POLISHED_RED_SANDSTONE_STAIRS);
                entries.accept(EBBlocks.POLISHED_RED_SANDSTONE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.POLISHED_RED_SANDSTONE_SLAB);
                entries.accept(EBBlocks.POLISHED_RED_SANDSTONE_WALL);
                entries.accept(EBBlocks.RED_SANDSTONE_BRICKS);
                entries.accept(EBBlocks.RED_SANDSTONE_BRICK_STAIRS);
                entries.accept(EBBlocks.RED_SANDSTONE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.RED_SANDSTONE_BRICK_SLAB);
                entries.accept(EBBlocks.RED_SANDSTONE_BRICK_WALL);
                entries.accept(EBBlocks.RED_SANDSTONE_TILES);
                entries.accept(EBBlocks.RED_SANDSTONE_TILE_STAIRS);
                entries.accept(EBBlocks.RED_SANDSTONE_TILE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.RED_SANDSTONE_TILE_SLAB);
                entries.accept(EBBlocks.RED_SANDSTONE_TILE_WALL);
                entries.accept(EBBlocks.CHISELED_RED_SANDSTONE_BRICKS);
                entries.accept(EBBlocks.DECORATED_RED_SANDSTONE_BRICKS);
                entries.accept(EBBlocks.ENGRAVED_RED_SANDSTONE_BRICKS);
                entries.accept(EBBlocks.RED_SANDSTONE_PILLAR);

                entries.accept(EBBlocks.SOUL_SANDSTONE);
                entries.accept(EBBlocks.SOUL_SANDSTONE_STAIRS);
                entries.accept(EBBlocks.SOUL_SANDSTONE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.SOUL_SANDSTONE_SLAB);
                entries.accept(EBBlocks.SOUL_SANDSTONE_WALL);
                entries.accept(EBBlocks.CHISELED_SOUL_SANDSTONE);
                entries.accept(EBBlocks.SMOOTH_SOUL_SANDSTONE);
                entries.accept(EBBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS);
                entries.accept(EBBlocks.SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.SMOOTH_SOUL_SANDSTONE_SLAB);
                entries.accept(EBBlocks.CUT_SOUL_SANDSTONE);
                entries.accept(EBBlocks.CUT_SOUL_SANDSTONE_SLAB);

                entries.accept(EBBlocks.POLISHED_SOUL_SANDSTONE);
                entries.accept(EBBlocks.POLISHED_SOUL_SANDSTONE_STAIRS);
                entries.accept(EBBlocks.POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB);
                entries.accept(EBBlocks.POLISHED_SOUL_SANDSTONE_WALL);
                entries.accept(EBBlocks.SOUL_SANDSTONE_BRICKS);
                entries.accept(EBBlocks.SOUL_SANDSTONE_BRICK_STAIRS);
                entries.accept(EBBlocks.SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB);
                entries.accept(EBBlocks.SOUL_SANDSTONE_BRICK_WALL);
                entries.accept(EBBlocks.SOUL_SANDSTONE_TILES);
                entries.accept(EBBlocks.SOUL_SANDSTONE_TILE_STAIRS);
                entries.accept(EBBlocks.SOUL_SANDSTONE_TILE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.SOUL_SANDSTONE_TILE_SLAB);
                entries.accept(EBBlocks.SOUL_SANDSTONE_TILE_WALL);
                entries.accept(EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS);
                entries.accept(EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS);
                entries.accept(EBBlocks.ENGRAVED_SOUL_SANDSTONE_BRICKS);
                entries.accept(EBBlocks.SOUL_SANDSTONE_PILLAR);
                
                entries.accept(EBBlocks.SOUL_MAGMA_BLOCK);

                entries.accept(EBBlocks.CRACKED_MUD_BRICKS);

                entries.accept(EBBlocks.BONE_BRICKS);
                entries.accept(EBBlocks.BONE_BRICK_STAIRS);
                entries.accept(EBBlocks.BONE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.BONE_BRICK_SLAB);
                entries.accept(EBBlocks.BONE_BRICK_WALL);

                entries.accept(Blocks.QUARTZ_BRICKS);
                entries.accept(EBBlocks.QUARTZ_BRICK_STAIRS);
                entries.accept(EBBlocks.QUARTZ_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.QUARTZ_BRICK_SLAB);
                entries.accept(EBBlocks.QUARTZ_BRICK_WALL);
                
                entries.accept(EBBlocks.IRON_BRICKS);
                entries.accept(EBBlocks.IRON_BRICK_STAIRS);
                entries.accept(EBBlocks.IRON_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.IRON_BRICK_SLAB);

                entries.accept(EBBlocks.GOLD_BRICKS);
                entries.accept(EBBlocks.GOLD_BRICK_STAIRS);
                entries.accept(EBBlocks.GOLD_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.GOLD_BRICK_SLAB);

                entries.accept(EBBlocks.REDSTONE_BRICKS);
                entries.accept(EBBlocks.REDSTONE_BRICK_STAIRS);
                entries.accept(EBBlocks.REDSTONE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.REDSTONE_BRICK_SLAB);

                entries.accept(EBBlocks.EMERALD_BRICKS);
                entries.accept(EBBlocks.EMERALD_BRICK_STAIRS);
                entries.accept(EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.EMERALD_BRICK_SLAB);

                entries.accept(EBBlocks.LAPIS_BRICKS);
                entries.accept(EBBlocks.LAPIS_BRICK_STAIRS);
                entries.accept(EBBlocks.LAPIS_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.LAPIS_BRICK_SLAB);

                entries.accept(EBBlocks.DIAMOND_BRICKS);
                entries.accept(EBBlocks.DIAMOND_BRICK_STAIRS);
                entries.accept(EBBlocks.DIAMOND_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.DIAMOND_BRICK_SLAB);

                entries.accept(EBItems.NETHERITE_BRICKS);
                entries.accept(EBItems.NETHERITE_BRICK_STAIRS);
                entries.accept(EBItems.NETHERITE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBItems.NETHERITE_BRICK_SLAB);

                entries.accept(EBBlocks.COPPER_BRICKS);
                entries.accept(EBBlocks.COPPER_BRICK_STAIRS);
                entries.accept(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.COPPER_BRICK_SLAB);

                entries.accept(EBBlocks.EXPOSED_COPPER_BRICKS);
                entries.accept(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS);
                entries.accept(EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.EXPOSED_COPPER_BRICK_SLAB);

                entries.accept(EBBlocks.WEATHERED_COPPER_BRICKS);
                entries.accept(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS);
                entries.accept(EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WEATHERED_COPPER_BRICK_SLAB);

                entries.accept(EBBlocks.OXIDIZED_COPPER_BRICKS);
                entries.accept(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS);
                entries.accept(EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB);

                entries.accept(EBBlocks.WAXED_COPPER_BRICKS);
                entries.accept(EBBlocks.WAXED_COPPER_BRICK_STAIRS);
                entries.accept(EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WAXED_COPPER_BRICK_SLAB);

                entries.accept(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS);
                entries.accept(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS);
                entries.accept(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB);

                entries.accept(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS);
                entries.accept(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS);
                entries.accept(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB);

                entries.accept(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS);
                entries.accept(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS);
                entries.accept(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB);

                entries.accept(EBBlocks.ROSE);
                entries.accept(EBBlocks.CYAN_ROSE);
                entries.accept(EBBlocks.WHITE_ROSE);
                entries.accept(EBBlocks.MOSS_PASTE);

                entries.accept(EBBlocks.AMETHYST_LAMP);
                entries.accept(EBBlocks.REACHING_LANTERN);
                entries.accept(EBBlocks.WEEPING_CANDLE);
                entries.accept(EBBlocks.TWISTING_CANDLE);

                entries.accept(EBBlocks.WOODEN_MUG);
                entries.accept(EBBlocks.GLASS_JAR);
                entries.accept(EBBlocks.GLASS_JAR_OF_FIRE);
                entries.accept(EBBlocks.GLASS_JAR_OF_SOUL_FIRE);

                entries.accept(EBItems.ANCIENT_POTTERY_SHERD);
                entries.accept(EBItems.BITTER_POTTERY_SHERD);
                entries.accept(EBItems.BOIN_POTTERY_SHERD);
                entries.accept(EBItems.BUSTLING_POTTERY_SHERD);
                entries.accept(EBItems.CHECKERED_POTTERY_SHERD);
                entries.accept(EBItems.DECAY_POTTERY_SHERD);
                entries.accept(EBItems.DESTRUCTION_POTTERY_SHERD);
                entries.accept(EBItems.FORWARDS_POTTERY_SHERD);
                entries.accept(EBItems.HEXXED_POTTERY_SHERD);
                entries.accept(EBItems.IS_THAT_POTTERY_SHERD);
                entries.accept(EBItems.KITTEH_POTTERY_SHERD);
                entries.accept(EBItems.KOKOS_BUG_POTTERY_SHERD);
                entries.accept(EBItems.LIFE_POTTERY_SHERD);
                entries.accept(EBItems.MESMERIZE_POTTERY_SHERD);
                entries.accept(EBItems.PORTAL_POTTERY_SHERD);
                entries.accept(EBItems.POTTERY_POTTERY_SHERD);
                entries.accept(EBItems.RING_POTTERY_SHERD);
                entries.accept(EBItems.ROYALTY_POTTERY_SHERD);
                entries.accept(EBItems.SNOUT_POTTERY_SHERD);
                entries.accept(EBItems.SPRITE_POTTERY_SHERD);
                entries.accept(EBItems.THIEF_POTTERY_SHERD);
                entries.accept(EBItems.TWINS_POTTERY_SHERD);
                entries.accept(EBItems.WRATHFUL_POTTERY_SHERD);

                entries.accept(EBBlocks.OAK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.SPRUCE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.BIRCH_VERTICAL_STAIRS);
                entries.accept(EBBlocks.JUNGLE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.ACACIA_VERTICAL_STAIRS);
                entries.accept(EBBlocks.DARK_OAK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.MANGROVE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.CHERRY_VERTICAL_STAIRS);
                entries.accept(EBBlocks.BAMBOO_VERTICAL_STAIRS);
                entries.accept(EBBlocks.CRIMSON_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WARPED_VERTICAL_STAIRS);
                entries.accept(EBBlocks.STONE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.COBBLESTONE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.MOSSY_COBBLESTONE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.STONE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.MOSSY_STONE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.GRANITE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.POLISHED_GRANITE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.DIORITE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.POLISHED_DIORITE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.ANDESITE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.POLISHED_ANDESITE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.COBBLED_DEEPSLATE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.POLISHED_DEEPSLATE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.DEEPSLATE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.DEEPSLATE_TILE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.MUD_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.SANDSTONE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.SMOOTH_SANDSTONE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.RED_SANDSTONE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.PRISMARINE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.PRISMARINE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.DARK_PRISMARINE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.NETHER_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.RED_NETHER_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.BLACKSTONE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.POLISHED_BLACKSTONE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.END_STONE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.PURPUR_VERTICAL_STAIRS);
                entries.accept(EBBlocks.QUARTZ_VERTICAL_STAIRS);
                entries.accept(EBBlocks.SMOOTH_QUARTZ_VERTICAL_STAIRS);
                entries.accept(EBBlocks.CUT_COPPER_VERTICAL_STAIRS);
                entries.accept(EBBlocks.EXPOSED_CUT_COPPER_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WEATHERED_CUT_COPPER_VERTICAL_STAIRS);
                entries.accept(EBBlocks.OXIDIZED_CUT_COPPER_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WAXED_CUT_COPPER_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_STAIRS);
            }).build());

    public static void loadItemGroups() {
    }
}
