package net.yirmiri.excessive_building.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.NbtOps;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.registry.*;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.decoration.Painting;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.block.Blocks;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.util.EBTags;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class EBItemGroups {
    public static ArrayList<DyeColor> COLOR_ORDERING = new ArrayList<DyeColor>();

    public static void addVanillaColorOrdering() {
        COLOR_ORDERING.add(DyeColor.WHITE);
        COLOR_ORDERING.add(DyeColor.LIGHT_GRAY);
        COLOR_ORDERING.add(DyeColor.GRAY);
        COLOR_ORDERING.add(DyeColor.BLACK);
        COLOR_ORDERING.add(DyeColor.BROWN);
        COLOR_ORDERING.add(DyeColor.RED);
        COLOR_ORDERING.add(DyeColor.ORANGE);
        COLOR_ORDERING.add(DyeColor.YELLOW);
        COLOR_ORDERING.add(DyeColor.LIME);
        COLOR_ORDERING.add(DyeColor.GREEN);
        COLOR_ORDERING.add(DyeColor.CYAN);
        COLOR_ORDERING.add(DyeColor.LIGHT_BLUE);
        COLOR_ORDERING.add(DyeColor.BLUE);
        COLOR_ORDERING.add(DyeColor.PURPLE);
        COLOR_ORDERING.add(DyeColor.MAGENTA);
        COLOR_ORDERING.add(DyeColor.PINK);
    }

    public static void addColorOrdering(DyeColor colors, int i) {
        COLOR_ORDERING.add(i, colors);
    }

    public static CreativeModeTab EXCESSIVE_BUILDING = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "excessive_building"),
            FabricItemGroup.builder().icon(() -> new ItemStack(EBBlocks.LOGO_BLOCK)).title(Component.translatable("itemgroup.excessive_building")).displayItems((ctx, entries) -> {
                entries.accept(EBItems.HAMMER);
                entries.accept(EBItems.WRENCH);

                entries.accept(EBBlocks.OAK_MOSAIC);
                entries.accept(EBBlocks.OAK_BOARDS);
                entries.accept(EBBlocks.OAK_MOSAIC_STAIRS);
                entries.accept(EBBlocks.OAK_BOARD_STAIRS);
                entries.accept(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.OAK_BOARD_VERTICAL_STAIRS);
                entries.accept(EBBlocks.OAK_MOSAIC_SLAB);
                entries.accept(EBBlocks.OAK_BOARD_SLAB);
                entries.accept(EBBlocks.CHISELED_OAK_PLANKS);
                entries.accept(Blocks.BOOKSHELF);
                entries.accept(EBBlocks.OAK_DECORATIVE_SHELF);
                entries.accept(Blocks.CRAFTING_TABLE);
                //entries.add(Blocks.CHEST);
                //entries.add(Blocks.TRAPPED_CHEST);
                entries.accept(Blocks.LADDER);

                entries.accept(EBBlocks.SPRUCE_MOSAIC);
                entries.accept(EBBlocks.SPRUCE_BOARDS);
                entries.accept(EBBlocks.SPRUCE_MOSAIC_STAIRS);
                entries.accept(EBBlocks.SPRUCE_BOARD_STAIRS);
                entries.accept(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.SPRUCE_BOARD_VERTICAL_STAIRS);
                entries.accept(EBBlocks.SPRUCE_MOSAIC_SLAB);
                entries.accept(EBBlocks.SPRUCE_BOARD_SLAB);
                entries.accept(EBBlocks.CHISELED_SPRUCE_PLANKS);
                entries.accept(EBBlocks.SPRUCE_BOOKSHELF);
                entries.accept(EBBlocks.SPRUCE_DECORATIVE_SHELF);
                entries.accept(EBBlocks.SPRUCE_CRAFTING_TABLE);
                //entries.add(EBBlocks.SPRUCE_CHEST);
                //entries.add(EBBlocks.TRAPPED_SPRUCE_CHEST);
                entries.accept(EBBlocks.SPRUCE_LADDER);

                entries.accept(EBBlocks.BIRCH_MOSAIC);
                entries.accept(EBBlocks.BIRCH_BOARDS);
                entries.accept(EBBlocks.BIRCH_MOSAIC_STAIRS);
                entries.accept(EBBlocks.BIRCH_BOARD_STAIRS);
                entries.accept(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.BIRCH_BOARD_VERTICAL_STAIRS);
                entries.accept(EBBlocks.BIRCH_MOSAIC_SLAB);
                entries.accept(EBBlocks.BIRCH_BOARD_SLAB);
                entries.accept(EBBlocks.CHISELED_BIRCH_PLANKS);
                entries.accept(EBBlocks.BIRCH_BOOKSHELF);
                entries.accept(EBBlocks.BIRCH_DECORATIVE_SHELF);
                entries.accept(EBBlocks.BIRCH_CRAFTING_TABLE);
                //entries.add(EBBlocks.BIRCH_CHEST);
                //entries.add(EBBlocks.TRAPPED_BIRCH_CHEST);
                entries.accept(EBBlocks.BIRCH_LADDER);

                entries.accept(EBBlocks.JUNGLE_MOSAIC);
                entries.accept(EBBlocks.JUNGLE_BOARDS);
                entries.accept(EBBlocks.JUNGLE_MOSAIC_STAIRS);
                entries.accept(EBBlocks.JUNGLE_BOARD_STAIRS);
                entries.accept(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.JUNGLE_BOARD_VERTICAL_STAIRS);
                entries.accept(EBBlocks.JUNGLE_MOSAIC_SLAB);
                entries.accept(EBBlocks.JUNGLE_BOARD_SLAB);
                entries.accept(EBBlocks.CHISELED_JUNGLE_PLANKS);
                entries.accept(EBBlocks.JUNGLE_BOOKSHELF);
                entries.accept(EBBlocks.JUNGLE_DECORATIVE_SHELF);
                entries.accept(EBBlocks.JUNGLE_CRAFTING_TABLE);
                //entries.add(EBBlocks.JUNGLE_CHEST);
                //entries.add(EBBlocks.TRAPPED_JUNGLE_CHEST);
                entries.accept(EBBlocks.JUNGLE_LADDER);

                entries.accept(EBBlocks.ACACIA_MOSAIC);
                entries.accept(EBBlocks.ACACIA_BOARDS);
                entries.accept(EBBlocks.ACACIA_MOSAIC_STAIRS);
                entries.accept(EBBlocks.ACACIA_BOARD_STAIRS);
                entries.accept(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.ACACIA_BOARD_VERTICAL_STAIRS);
                entries.accept(EBBlocks.ACACIA_MOSAIC_SLAB);
                entries.accept(EBBlocks.ACACIA_BOARD_SLAB);
                entries.accept(EBBlocks.CHISELED_ACACIA_PLANKS);
                entries.accept(EBBlocks.ACACIA_BOOKSHELF);
                entries.accept(EBBlocks.ACACIA_DECORATIVE_SHELF);
                entries.accept(EBBlocks.ACACIA_CRAFTING_TABLE);
                //entries.add(EBBlocks.ACACIA_CHEST);
                //entries.add(EBBlocks.TRAPPED_ACACIA_CHEST);
                entries.accept(EBBlocks.ACACIA_LADDER);

                entries.accept(EBBlocks.DARK_OAK_MOSAIC);
                entries.accept(EBBlocks.DARK_OAK_BOARDS);
                entries.accept(EBBlocks.DARK_OAK_MOSAIC_STAIRS);
                entries.accept(EBBlocks.DARK_OAK_BOARD_STAIRS);
                entries.accept(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.DARK_OAK_BOARD_VERTICAL_STAIRS);
                entries.accept(EBBlocks.DARK_OAK_MOSAIC_SLAB);
                entries.accept(EBBlocks.DARK_OAK_BOARD_SLAB);
                entries.accept(EBBlocks.CHISELED_DARK_OAK_PLANKS);
                entries.accept(EBBlocks.DARK_OAK_BOOKSHELF);
                entries.accept(EBBlocks.DARK_OAK_DECORATIVE_SHELF);
                entries.accept(EBBlocks.DARK_OAK_CRAFTING_TABLE);
                //entries.add(EBBlocks.DARK_OAK_CHEST);
                //entries.add(EBBlocks.TRAPPED_DARK_OAK_CHEST);
                entries.accept(EBBlocks.DARK_OAK_LADDER);

                entries.accept(EBBlocks.MANGROVE_MOSAIC);
                entries.accept(EBBlocks.MANGROVE_BOARDS);
                entries.accept(EBBlocks.MANGROVE_MOSAIC_STAIRS);
                entries.accept(EBBlocks.MANGROVE_BOARD_STAIRS);
                entries.accept(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.MANGROVE_BOARD_VERTICAL_STAIRS);
                entries.accept(EBBlocks.MANGROVE_MOSAIC_SLAB);
                entries.accept(EBBlocks.MANGROVE_BOARD_SLAB);
                entries.accept(EBBlocks.CHISELED_MANGROVE_PLANKS);
                entries.accept(EBBlocks.MANGROVE_BOOKSHELF);
                entries.accept(EBBlocks.MANGROVE_DECORATIVE_SHELF);
                entries.accept(EBBlocks.MANGROVE_CRAFTING_TABLE);
                //entries.add(EBBlocks.MANGROVE_CHEST);
                //entries.add(EBBlocks.TRAPPED_MANGROVE_CHEST);
                entries.accept(EBBlocks.MANGROVE_LADDER);

                entries.accept(EBBlocks.CHERRY_MOSAIC);
                entries.accept(EBBlocks.CHERRY_BOARDS);
                entries.accept(EBBlocks.CHERRY_MOSAIC_STAIRS);
                entries.accept(EBBlocks.CHERRY_BOARD_STAIRS);
                entries.accept(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.CHERRY_BOARD_VERTICAL_STAIRS);
                entries.accept(EBBlocks.CHERRY_MOSAIC_SLAB);
                entries.accept(EBBlocks.CHERRY_BOARD_SLAB);
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
                entries.accept(EBBlocks.ANCIENT_BOARDS);
                entries.accept(EBBlocks.ANCIENT_STAIRS);
                entries.accept(EBBlocks.ANCIENT_MOSAIC_STAIRS);
                entries.accept(EBBlocks.ANCIENT_BOARD_STAIRS);
                entries.accept(EBBlocks.ANCIENT_VERTICAL_STAIRS);
                entries.accept(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.ANCIENT_BOARD_VERTICAL_STAIRS);
                entries.accept(EBBlocks.ANCIENT_SLAB);
                entries.accept(EBBlocks.ANCIENT_MOSAIC_SLAB);
                entries.accept(EBBlocks.ANCIENT_BOARD_SLAB);
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
                entries.accept(EBBlocks.GLOOM_BOARDS);
                entries.accept(EBBlocks.GLOOM_STAIRS);
                entries.accept(EBBlocks.GLOOM_MOSAIC_STAIRS);
                entries.accept(EBBlocks.GLOOM_BOARD_STAIRS);
                entries.accept(EBBlocks.GLOOM_VERTICAL_STAIRS);
                entries.accept(EBBlocks.GLOOM_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.GLOOM_BOARD_VERTICAL_STAIRS);
                entries.accept(EBBlocks.GLOOM_SLAB);
                entries.accept(EBBlocks.GLOOM_MOSAIC_SLAB);
                entries.accept(EBBlocks.GLOOM_BOARD_SLAB);
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
                
                entries.accept(EBBlocks.BAMBOO_BOARDS);
                entries.accept(EBBlocks.BAMBOO_BOARD_STAIRS);
                entries.accept(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.BAMBOO_BOARD_VERTICAL_STAIRS);
                entries.accept(EBBlocks.BAMBOO_BOARD_SLAB);
                entries.accept(EBBlocks.CHISELED_BAMBOO_PLANKS);
                entries.accept(EBBlocks.BAMBOO_BOOKSHELF);
                entries.accept(EBBlocks.BAMBOO_DECORATIVE_SHELF);
                entries.accept(EBBlocks.BAMBOO_CRAFTING_TABLE);
                //entries.add(EBBlocks.BAMBOO_CHEST);
                //entries.add(EBBlocks.TRAPPED_BAMBOO_CHEST);
                entries.accept(EBBlocks.BAMBOO_LADDER);

                entries.accept(EBBlocks.CRIMSON_MOSAIC);
                entries.accept(EBBlocks.CRIMSON_BOARDS);
                entries.accept(EBBlocks.CRIMSON_MOSAIC_STAIRS);
                entries.accept(EBBlocks.CRIMSON_BOARD_STAIRS);
                entries.accept(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.CRIMSON_BOARD_VERTICAL_STAIRS);
                entries.accept(EBBlocks.CRIMSON_MOSAIC_SLAB);
                entries.accept(EBBlocks.CRIMSON_BOARD_SLAB);
                entries.accept(EBBlocks.CHISELED_CRIMSON_PLANKS);
                entries.accept(EBBlocks.CRIMSON_BOOKSHELF);
                entries.accept(EBBlocks.CRIMSON_DECORATIVE_SHELF);
                entries.accept(EBBlocks.CRIMSON_CRAFTING_TABLE);
                //entries.add(EBBlocks.CRIMSON_CHEST);
                //entries.add(EBBlocks.TRAPPED_CRIMSON_CHEST);
                entries.accept(EBBlocks.CRIMSON_LADDER);

                entries.accept(EBBlocks.WARPED_MOSAIC);
                entries.accept(EBBlocks.WARPED_BOARDS);
                entries.accept(EBBlocks.WARPED_MOSAIC_STAIRS);
                entries.accept(EBBlocks.WARPED_BOARD_STAIRS);
                entries.accept(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WARPED_BOARD_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WARPED_MOSAIC_SLAB);
                entries.accept(EBBlocks.WARPED_BOARD_SLAB);
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

                entries.accept(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS);
                entries.accept(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_STAIRS);
                entries.accept(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_SLAB);
                entries.accept(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_WALL);

                entries.accept(EBBlocks.MOSSY_DEEPSLATE_BRICKS);
                entries.accept(EBBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
                entries.accept(EBBlocks.MOSSY_DEEPSLATE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.MOSSY_DEEPSLATE_BRICK_SLAB);
                entries.accept(EBBlocks.MOSSY_DEEPSLATE_BRICK_WALL);

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

                entries.accept(EBBlocks.WEEPING_BLACKSTONE_BRICKS);
                entries.accept(EBBlocks.WEEPING_BLACKSTONE_BRICK_STAIRS);
                entries.accept(EBBlocks.WEEPING_BLACKSTONE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WEEPING_BLACKSTONE_BRICK_SLAB);
                entries.accept(EBBlocks.WEEPING_BLACKSTONE_BRICK_WALL);

                entries.accept(EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS);
                entries.accept(EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS);
                entries.accept(EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB);
                entries.accept(EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_WALL);

                entries.accept(EBBlocks.TWISTING_BLACKSTONE_BRICKS);
                entries.accept(EBBlocks.TWISTING_BLACKSTONE_BRICK_STAIRS);
                entries.accept(EBBlocks.TWISTING_BLACKSTONE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.TWISTING_BLACKSTONE_BRICK_SLAB);
                entries.accept(EBBlocks.TWISTING_BLACKSTONE_BRICK_WALL);

                entries.accept(EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS);
                entries.accept(EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS);
                entries.accept(EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB);
                entries.accept(EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_WALL);

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

                entries.accept(EBBlocks.TUFF_TILES);
                entries.accept(EBBlocks.TUFF_TILE_STAIRS);
                entries.accept(EBBlocks.TUFF_TILE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.TUFF_TILE_SLAB);
                entries.accept(EBBlocks.TUFF_TILE_WALL);

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

                for (DyeColor colors : COLOR_ORDERING) {
                    entries.accept(EBBlocks.getDyedKnittedWools(colors.getId()));
                    entries.accept(EBBlocks.getDyedKnittedCarpets(colors.getId()));
                }

                entries.accept(EBBlocks.TERRACOTTA_TILES);
                entries.accept(EBBlocks.TERRACOTTA_TILE_STAIRS);
                entries.accept(EBBlocks.TERRACOTTA_TILE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.TERRACOTTA_TILE_SLAB);

                for (DyeColor colors : COLOR_ORDERING) {
                    entries.accept(EBBlocks.getDyedTerracottaTiles(colors.getId()));
                    entries.accept(EBBlocks.getDyedTerracottaTileStairs(colors.getId()));
                    entries.accept(EBBlocks.getDyedTerracottaTileVerticalStairs(colors.getId()));
                    entries.accept(EBBlocks.getDyedTerracottaTileSlab(colors.getId()));
                }

                entries.accept(EBBlocks.ALMENTRA);
                entries.accept(EBBlocks.ALMENTRA_STAIRS);
                entries.accept(EBBlocks.ALMENTRA_VERTICAL_STAIRS);
                entries.accept(EBBlocks.ALMENTRA_SLAB);

                for (DyeColor colors : COLOR_ORDERING) {
                    entries.accept(EBBlocks.getDyedAlmentra(colors.getId()));
                    entries.accept(EBBlocks.getDyedAlmentraStairs(colors.getId()));
                    entries.accept(EBBlocks.getDyedAlmentraVerticalStairs(colors.getId()));
                    entries.accept(EBBlocks.getDyedAlmentraSlab(colors.getId()));
                }

                entries.accept(EBBlocks.POLISHED_ALMENTRA);
                entries.accept(EBBlocks.POLISHED_ALMENTRA_STAIRS);
                entries.accept(EBBlocks.POLISHED_ALMENTRA_VERTICAL_STAIRS);
                entries.accept(EBBlocks.POLISHED_ALMENTRA_SLAB);

                for (DyeColor colors : COLOR_ORDERING) {
                    entries.accept(EBBlocks.getDyedPolishedAlmentra(colors.getId()));
                    entries.accept(EBBlocks.getDyedPolishedAlmentraStairs(colors.getId()));
                    entries.accept(EBBlocks.getDyedPolishedAlmentraVerticalStairs(colors.getId()));
                    entries.accept(EBBlocks.getDyedPolishedAlmentraSlab(colors.getId()));
                }

                entries.accept(EBBlocks.ALMENTRA_BRICKS);
                entries.accept(EBBlocks.ALMENTRA_BRICK_STAIRS);
                entries.accept(EBBlocks.ALMENTRA_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.ALMENTRA_BRICK_SLAB);

                for (DyeColor colors : COLOR_ORDERING) {
                    entries.accept(EBBlocks.getDyedAlmentraBricks(colors.getId()));
                    entries.accept(EBBlocks.getDyedAlmentraBrickStairs(colors.getId()));
                    entries.accept(EBBlocks.getDyedAlmentraBrickVerticalStairs(colors.getId()));
                    entries.accept(EBBlocks.getDyedAlmentraBrickSlab(colors.getId()));
                }
                
                entries.accept(EBBlocks.ALMENTRA_STATUE);

                for (DyeColor colors : COLOR_ORDERING) {
                    entries.accept(EBBlocks.getDyedAlmentraStatues(colors.getId()));
                }

                entries.accept(EBBlocks.TERRACOTTA_POT);
//                for (DyeColor colors : colorOrder) {
//                    entries.add(EBBlocks.getDyedTerracottaPots(colors.getId()));
//                }

                entries.accept(EBBlocks.ARMADILLO_SCUTE_BLOCK);
                entries.accept(EBBlocks.ARMADILLO_SCUTE_STAIRS);
                entries.accept(EBBlocks.ARMADILLO_SCUTE_VERTICAL_STAIRS);
                entries.accept(EBBlocks.ARMADILLO_SCUTE_SLAB);

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

                entries.accept(EBBlocks.IRON_GRATE);

                entries.accept(EBBlocks.GOLD_BRICKS);
                entries.accept(EBBlocks.GOLD_BRICK_STAIRS);
                entries.accept(EBBlocks.GOLD_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.GOLD_BRICK_SLAB);

                entries.accept(EBBlocks.GOLD_GRATE);

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
                entries.accept(EBBlocks.COPPER_PRESSURE_PLATE);
                entries.accept(EBBlocks.COPPER_BUTTON);

                entries.accept(EBBlocks.EXPOSED_COPPER_BRICKS);
                entries.accept(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS);
                entries.accept(EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.EXPOSED_COPPER_BRICK_SLAB);
                entries.accept(EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
                entries.accept(EBBlocks.EXPOSED_COPPER_BUTTON);

                entries.accept(EBBlocks.WEATHERED_COPPER_BRICKS);
                entries.accept(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS);
                entries.accept(EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WEATHERED_COPPER_BRICK_SLAB);
                entries.accept(EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
                entries.accept(EBBlocks.WEATHERED_COPPER_BUTTON);

                entries.accept(EBBlocks.OXIDIZED_COPPER_BRICKS);
                entries.accept(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS);
                entries.accept(EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB);
                entries.accept(EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
                entries.accept(EBBlocks.OXIDIZED_COPPER_BUTTON);

                entries.accept(EBBlocks.WAXED_COPPER_BRICKS);
                entries.accept(EBBlocks.WAXED_COPPER_BRICK_STAIRS);
                entries.accept(EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WAXED_COPPER_BRICK_SLAB);
                entries.accept(EBBlocks.WAXED_COPPER_PRESSURE_PLATE);
                entries.accept(EBBlocks.WAXED_COPPER_BUTTON);

                entries.accept(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS);
                entries.accept(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS);
                entries.accept(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB);
                entries.accept(EBBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
                entries.accept(EBBlocks.WAXED_EXPOSED_COPPER_BUTTON);

                entries.accept(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS);
                entries.accept(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS);
                entries.accept(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB);
                entries.accept(EBBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
                entries.accept(EBBlocks.WAXED_WEATHERED_COPPER_BUTTON);

                entries.accept(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS);
                entries.accept(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS);
                entries.accept(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.accept(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB);
                entries.accept(EBBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
                entries.accept(EBBlocks.WAXED_OXIDIZED_COPPER_BUTTON);

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

                entries.accept(Blocks.PUMPKIN);

                entries.accept(Blocks.CARVED_PUMPKIN);
                entries.accept(EBBlocks.WICKED_CARVED_PUMPKIN);
                entries.accept(EBBlocks.CHEERFUL_CARVED_PUMPKIN);
                entries.accept(EBBlocks.GRUMPY_CARVED_PUMPKIN);

                entries.accept(Blocks.JACK_O_LANTERN);
                entries.accept(EBBlocks.WICKED_JACK_O_LANTERN);
                entries.accept(EBBlocks.CHEERFUL_JACK_O_LANTERN);
                entries.accept(EBBlocks.GRUMPY_JACK_O_LANTERN);

                entries.accept(EBBlocks.SOUL_JACK_O_LANTERN);
                entries.accept(EBBlocks.WICKED_SOUL_JACK_O_LANTERN);
                entries.accept(EBBlocks.CHEERFUL_SOUL_JACK_O_LANTERN);
                entries.accept(EBBlocks.GRUMPY_SOUL_JACK_O_LANTERN);

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
                entries.accept(EBBlocks.TUFF_VERTICAL_STAIRS);
                entries.accept(EBBlocks.POLISHED_TUFF_VERTICAL_STAIRS);
                entries.accept(EBBlocks.TUFF_BRICK_VERTICAL_STAIRS);
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

                entries.accept(Items.PAINTING);
                ctx.holders().lookup(Registries.PAINTING_VARIANT).ifPresent(registryWrapper -> addPaintings(entries, ctx.holders(), registryWrapper,
                        registryEntry -> registryEntry.is(EBTags.PaintingVariants.EB_PAINTINGS), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS));
            }).build());

    private static final Comparator<Holder<PaintingVariant>> PAINTING_VARIANT_COMPARATOR = Comparator.comparing(
            Holder::value, Comparator.comparingInt(PaintingVariant::area).thenComparing(PaintingVariant::width)
    );

    private static void addPaintings(CreativeModeTab.Output entries, HolderLookup.Provider registryLookup, HolderLookup.RegistryLookup<PaintingVariant> registryWrapper, Predicate<Holder<PaintingVariant>> filter, CreativeModeTab.TabVisibility stackVisibility) {
        RegistryOps<Tag> registryOps = registryLookup.createSerializationContext(NbtOps.INSTANCE);
        registryWrapper.listElements().filter(filter).sorted(PAINTING_VARIANT_COMPARATOR).forEach(paintingVariantEntry -> {
                    CustomData nbtComponent = CustomData.EMPTY.update(registryOps, Painting.VARIANT_MAP_CODEC, paintingVariantEntry).getOrThrow().update(nbt -> nbt.putString("id", "minecraft:painting"));
                    ItemStack itemStack = new ItemStack(Items.PAINTING);
                    itemStack.set(DataComponents.ENTITY_DATA, nbtComponent);
                    entries.accept(itemStack, stackVisibility);
                });
        }

    public static void loadItemGroups() {
        addVanillaColorOrdering();
    }
}
