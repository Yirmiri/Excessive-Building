package net.yirmiri.excessive_building.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBItemGroups {
    public static ItemGroup EXCESSIVE_BUILDING = Registry.register(Registries.ITEM_GROUP, Identifier.of(ExcessiveBuilding.MOD_ID, "excessive_building"),
            FabricItemGroup.builder().icon(() -> new ItemStack(EBBlocks.LOGO)).displayName(Text.translatable("itemgroup.excessive_building")).entries((ctx, entries) -> {
                entries.add(EBBlocks.OAK_MOSAIC);
                entries.add(EBBlocks.OAK_MOSAIC_STAIRS);
                entries.add(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.OAK_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_OAK_PLANKS);
                entries.add(Blocks.CRAFTING_TABLE);
                entries.add(Blocks.LADDER);

                entries.add(EBBlocks.SPRUCE_MOSAIC);
                entries.add(EBBlocks.SPRUCE_MOSAIC_STAIRS);
                entries.add(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.SPRUCE_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_SPRUCE_PLANKS);
                entries.add(EBBlocks.SPRUCE_CRAFTING_TABLE);
                entries.add(EBBlocks.SPRUCE_LADDER);

                entries.add(EBBlocks.BIRCH_MOSAIC);
                entries.add(EBBlocks.BIRCH_MOSAIC_STAIRS);
                entries.add(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.BIRCH_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_BIRCH_PLANKS);
                entries.add(EBBlocks.BIRCH_CRAFTING_TABLE);
                entries.add(EBBlocks.BIRCH_LADDER);

                entries.add(EBBlocks.JUNGLE_MOSAIC);
                entries.add(EBBlocks.JUNGLE_MOSAIC_STAIRS);
                entries.add(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.JUNGLE_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_JUNGLE_PLANKS);
                entries.add(EBBlocks.JUNGLE_CRAFTING_TABLE);
                entries.add(EBBlocks.JUNGLE_LADDER);

                entries.add(EBBlocks.ACACIA_MOSAIC);
                entries.add(EBBlocks.ACACIA_MOSAIC_STAIRS);
                entries.add(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.ACACIA_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_ACACIA_PLANKS);
                entries.add(EBBlocks.ACACIA_CRAFTING_TABLE);
                entries.add(EBBlocks.ACACIA_LADDER);

                entries.add(EBBlocks.DARK_OAK_MOSAIC);
                entries.add(EBBlocks.DARK_OAK_MOSAIC_STAIRS);
                entries.add(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.DARK_OAK_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_DARK_OAK_PLANKS);
                entries.add(EBBlocks.DARK_OAK_CRAFTING_TABLE);
                entries.add(EBBlocks.DARK_OAK_LADDER);

                entries.add(EBBlocks.MANGROVE_MOSAIC);
                entries.add(EBBlocks.MANGROVE_MOSAIC_STAIRS);
                entries.add(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.MANGROVE_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_MANGROVE_PLANKS);
                entries.add(EBBlocks.MANGROVE_CRAFTING_TABLE);
                entries.add(EBBlocks.MANGROVE_LADDER);

                entries.add(EBBlocks.CHERRY_MOSAIC);
                entries.add(EBBlocks.CHERRY_MOSAIC_STAIRS);
                entries.add(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.CHERRY_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_CHERRY_PLANKS);
                entries.add(EBBlocks.CHERRY_CRAFTING_TABLE);
                entries.add(EBBlocks.CHERRY_LADDER);

                entries.add(EBBlocks.ANCIENT_LOG);
                entries.add(EBBlocks.STRIPPED_ANCIENT_LOG);
                entries.add(EBBlocks.ANCIENT_WOOD);
                entries.add(EBBlocks.STRIPPED_ANCIENT_WOOD);
                entries.add(EBBlocks.ANCIENT_PLANKS);
                entries.add(EBBlocks.ANCIENT_MOSAIC);
                entries.add(EBBlocks.ANCIENT_STAIRS);
                entries.add(EBBlocks.ANCIENT_MOSAIC_STAIRS);
                entries.add(EBBlocks.ANCIENT_VERTICAL_STAIRS);
                entries.add(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.ANCIENT_SLAB);
                entries.add(EBBlocks.ANCIENT_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_ANCIENT_PLANKS);
                entries.add(EBBlocks.ANCIENT_FENCE);
                entries.add(EBBlocks.ANCIENT_FENCE_GATE);
                entries.add(EBBlocks.ANCIENT_DOOR);
                entries.add(EBBlocks.ANCIENT_TRAPDOOR);
                entries.add(EBBlocks.ANCIENT_PRESSURE_PLATE);
                entries.add(EBBlocks.ANCIENT_BUTTON);
                entries.add(EBBlocks.ANCIENT_CRAFTING_TABLE);
                entries.add(EBBlocks.ANCIENT_LADDER);

                entries.add(EBBlocks.GLOOM_LOG);
                entries.add(EBBlocks.STRIPPED_GLOOM_LOG);
                entries.add(EBBlocks.GLOOM_WOOD);
                entries.add(EBBlocks.STRIPPED_GLOOM_WOOD);
                entries.add(EBBlocks.GLOOM_PLANKS);
                entries.add(EBBlocks.GLOOM_MOSAIC);
                entries.add(EBBlocks.GLOOM_STAIRS);
                entries.add(EBBlocks.GLOOM_MOSAIC_STAIRS);
                entries.add(EBBlocks.GLOOM_VERTICAL_STAIRS);
                entries.add(EBBlocks.GLOOM_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.GLOOM_SLAB);
                entries.add(EBBlocks.GLOOM_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_GLOOM_PLANKS);
                entries.add(EBBlocks.GLOOM_FENCE);
                entries.add(EBBlocks.GLOOM_FENCE_GATE);
                entries.add(EBBlocks.GLOOM_DOOR);
                entries.add(EBBlocks.GLOOM_TRAPDOOR);
                entries.add(EBBlocks.GLOOM_PRESSURE_PLATE);
                entries.add(EBBlocks.GLOOM_BUTTON);
                entries.add(EBBlocks.GLOOM_CRAFTING_TABLE);
                entries.add(EBBlocks.GLOOM_LADDER);

                entries.add(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.CHISELED_BAMBOO_PLANKS);
                entries.add(EBBlocks.BAMBOO_CRAFTING_TABLE);
                entries.add(EBBlocks.BAMBOO_LADDER);

                entries.add(EBBlocks.CRIMSON_MOSAIC);
                entries.add(EBBlocks.CRIMSON_MOSAIC_STAIRS);
                entries.add(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.CRIMSON_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_CRIMSON_PLANKS);
                entries.add(EBBlocks.CRIMSON_CRAFTING_TABLE);
                entries.add(EBBlocks.CRIMSON_LADDER);

                entries.add(EBBlocks.WARPED_MOSAIC);
                entries.add(EBBlocks.WARPED_MOSAIC_STAIRS);
                entries.add(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.WARPED_MOSAIC_SLAB);
                entries.add(EBBlocks.CHISELED_WARPED_PLANKS);
                entries.add(EBBlocks.WARPED_CRAFTING_TABLE);
                entries.add(EBBlocks.WARPED_LADDER);

                entries.add(EBBlocks.COBBLESTONE_BRICKS);
                entries.add(EBBlocks.CRACKED_COBBLESTONE_BRICKS);
                entries.add(EBBlocks.COBBLESTONE_BRICK_STAIRS);
                entries.add(EBBlocks.COBBLESTONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.COBBLESTONE_BRICK_SLAB);
                entries.add(EBBlocks.COBBLESTONE_BRICK_WALL);

                entries.add(EBBlocks.MOSSY_COBBLESTONE_BRICKS);
                entries.add(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS);
                entries.add(EBBlocks.MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB);
                entries.add(EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL);

                entries.add(EBBlocks.COBBLED_DEEPSLATE_BRICKS);
                entries.add(EBBlocks.CRACKED_COBBLED_DEEPSLATE_BRICKS);
                entries.add(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS);
                entries.add(EBBlocks.COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB);
                entries.add(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL);

                entries.add(EBBlocks.BLACKSTONE_BRICKS);
                entries.add(EBBlocks.CRACKED_BLACKSTONE_BRICKS);
                entries.add(EBBlocks.BLACKSTONE_BRICK_STAIRS);
                entries.add(EBBlocks.BLACKSTONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.BLACKSTONE_BRICK_SLAB);
                entries.add(EBBlocks.BLACKSTONE_BRICK_WALL);

                entries.add(EBItems.ANCIENT_SIGN);
                entries.add(EBItems.ANCIENT_HANGING_SIGN);
                entries.add(EBItems.GLOOM_SIGN);
                entries.add(EBItems.GLOOM_HANGING_SIGN);

                entries.add(EBBlocks.ANCIENT_LEAVES);
                entries.add(EBBlocks.ANCIENT_SAPLING);

                entries.add(EBItems.ANCIENT_FRUIT);

                entries.add(EBBlocks.SEA_GLASS);
                entries.add(EBBlocks.SCARLET_SEA_GLASS);
                entries.add(EBBlocks.VERDANT_SEA_GLASS);
                entries.add(EBBlocks.AQUA_SEA_GLASS);
                entries.add(EBBlocks.FUCHSIA_SEA_GLASS);
                entries.add(EBBlocks.ROSE_SEA_GLASS);

                entries.add(EBBlocks.SEA_GLASS_PANE);
                entries.add(EBBlocks.SCARLET_SEA_GLASS_PANE);
                entries.add(EBBlocks.VERDANT_SEA_GLASS_PANE);
                entries.add(EBBlocks.AQUA_SEA_GLASS_PANE);
                entries.add(EBBlocks.FUCHSIA_SEA_GLASS_PANE);
                entries.add(EBBlocks.ROSE_SEA_GLASS_PANE);

                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.WHITE.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.LIGHT_GRAY.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.GRAY.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.BLACK.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.BROWN.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.RED.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.ORANGE.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.YELLOW.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.LIME.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.GREEN.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.CYAN.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.LIGHT_BLUE.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.BLUE.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.PURPLE.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.MAGENTA.getId()));
                entries.add(EBBlocks.getDyedKnittedWools(DyeColor.PINK.getId()));

                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.WHITE.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.LIGHT_GRAY.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.GRAY.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.BLACK.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.BROWN.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.RED.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.ORANGE.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.YELLOW.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.LIME.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.GREEN.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.CYAN.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.LIGHT_BLUE.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.BLUE.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.PURPLE.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.MAGENTA.getId()));
                entries.add(EBBlocks.getDyedKnittedCarpets(DyeColor.PINK.getId()));

                entries.add(EBBlocks.POLISHED_SANDSTONE);
                entries.add(EBBlocks.POLISHED_SANDSTONE_STAIRS);
                entries.add(EBBlocks.POLISHED_SANDSTONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.POLISHED_SANDSTONE_SLAB);
                entries.add(EBBlocks.POLISHED_SANDSTONE_WALL);
                entries.add(EBBlocks.SANDSTONE_BRICKS);
                entries.add(EBBlocks.SANDSTONE_BRICK_STAIRS);
                entries.add(EBBlocks.SANDSTONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.SANDSTONE_BRICK_SLAB);
                entries.add(EBBlocks.SANDSTONE_BRICK_WALL);
                entries.add(EBBlocks.SANDSTONE_TILES);
                entries.add(EBBlocks.SANDSTONE_TILE_STAIRS);
                entries.add(EBBlocks.SANDSTONE_TILE_VERTICAL_STAIRS);
                entries.add(EBBlocks.SANDSTONE_TILE_SLAB);
                entries.add(EBBlocks.SANDSTONE_TILE_WALL);
                entries.add(EBBlocks.CHISELED_SANDSTONE_BRICKS);
                entries.add(EBBlocks.DECORATED_SANDSTONE_BRICKS);
                entries.add(EBBlocks.ENGRAVED_SANDSTONE_BRICKS);
                entries.add(EBBlocks.SANDSTONE_PILLAR);

                entries.add(EBBlocks.POLISHED_RED_SANDSTONE);
                entries.add(EBBlocks.POLISHED_RED_SANDSTONE_STAIRS);
                entries.add(EBBlocks.POLISHED_RED_SANDSTONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.POLISHED_RED_SANDSTONE_SLAB);
                entries.add(EBBlocks.POLISHED_RED_SANDSTONE_WALL);
                entries.add(EBBlocks.RED_SANDSTONE_BRICKS);
                entries.add(EBBlocks.RED_SANDSTONE_BRICK_STAIRS);
                entries.add(EBBlocks.RED_SANDSTONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.RED_SANDSTONE_BRICK_SLAB);
                entries.add(EBBlocks.RED_SANDSTONE_BRICK_WALL);
                entries.add(EBBlocks.RED_SANDSTONE_TILES);
                entries.add(EBBlocks.RED_SANDSTONE_TILE_STAIRS);
                entries.add(EBBlocks.RED_SANDSTONE_TILE_VERTICAL_STAIRS);
                entries.add(EBBlocks.RED_SANDSTONE_TILE_SLAB);
                entries.add(EBBlocks.RED_SANDSTONE_TILE_WALL);
                entries.add(EBBlocks.CHISELED_RED_SANDSTONE_BRICKS);
                entries.add(EBBlocks.DECORATED_RED_SANDSTONE_BRICKS);
                entries.add(EBBlocks.ENGRAVED_RED_SANDSTONE_BRICKS);
                entries.add(EBBlocks.RED_SANDSTONE_PILLAR);

                entries.add(EBBlocks.SOUL_SANDSTONE);
                entries.add(EBBlocks.SOUL_SANDSTONE_STAIRS);
                entries.add(EBBlocks.SOUL_SANDSTONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.SOUL_SANDSTONE_SLAB);
                entries.add(EBBlocks.SOUL_SANDSTONE_WALL);
                entries.add(EBBlocks.CHISELED_SOUL_SANDSTONE);
                entries.add(EBBlocks.SMOOTH_SOUL_SANDSTONE);
                entries.add(EBBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS);
                entries.add(EBBlocks.SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.SMOOTH_SOUL_SANDSTONE_SLAB);
                entries.add(EBBlocks.CUT_SOUL_SANDSTONE);
                entries.add(EBBlocks.CUT_SOUL_SANDSTONE_SLAB);

                entries.add(EBBlocks.POLISHED_SOUL_SANDSTONE);
                entries.add(EBBlocks.POLISHED_SOUL_SANDSTONE_STAIRS);
                entries.add(EBBlocks.POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS);
                entries.add(EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB);
                entries.add(EBBlocks.POLISHED_SOUL_SANDSTONE_WALL);
                entries.add(EBBlocks.SOUL_SANDSTONE_BRICKS);
                entries.add(EBBlocks.SOUL_SANDSTONE_BRICK_STAIRS);
                entries.add(EBBlocks.SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB);
                entries.add(EBBlocks.SOUL_SANDSTONE_BRICK_WALL);
                entries.add(EBBlocks.SOUL_SANDSTONE_TILES);
                entries.add(EBBlocks.SOUL_SANDSTONE_TILE_STAIRS);
                entries.add(EBBlocks.SOUL_SANDSTONE_TILE_VERTICAL_STAIRS);
                entries.add(EBBlocks.SOUL_SANDSTONE_TILE_SLAB);
                entries.add(EBBlocks.SOUL_SANDSTONE_TILE_WALL);
                entries.add(EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS);
                entries.add(EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS);
                entries.add(EBBlocks.ENGRAVED_SOUL_SANDSTONE_BRICKS);
                entries.add(EBBlocks.SOUL_SANDSTONE_PILLAR);
                
                entries.add(EBBlocks.SOUL_MAGMA_BLOCK);

                //TODO: MAKE PRETTY ;W;
//                entries.add(EBBlocks.BONE_BRICKS);
//                entries.add(EBBlocks.BONE_BRICK_STAIRS);
//                entries.add(EBBlocks.BONE_BRICK_VERTICAL_STAIRS);
//                entries.add(EBBlocks.BONE_BRICK_SLAB);
//                entries.add(EBBlocks.BONE_BRICK_WALL);
                
                entries.add(EBBlocks.IRON_BRICKS);
                entries.add(EBBlocks.IRON_BRICK_STAIRS);
                entries.add(EBBlocks.IRON_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.IRON_BRICK_SLAB);

                entries.add(EBBlocks.GOLD_BRICKS);
                entries.add(EBBlocks.GOLD_BRICK_STAIRS);
                entries.add(EBBlocks.GOLD_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.GOLD_BRICK_SLAB);

                entries.add(EBBlocks.LAPIS_BRICKS);
                entries.add(EBBlocks.LAPIS_BRICK_STAIRS);
                entries.add(EBBlocks.LAPIS_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.LAPIS_BRICK_SLAB);

                entries.add(EBBlocks.EMERALD_BRICKS);
                entries.add(EBBlocks.EMERALD_BRICK_STAIRS);
                entries.add(EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.EMERALD_BRICK_SLAB);

                entries.add(EBBlocks.DIAMOND_BRICKS);
                entries.add(EBBlocks.DIAMOND_BRICK_STAIRS);
                entries.add(EBBlocks.DIAMOND_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.DIAMOND_BRICK_SLAB);

                entries.add(EBItems.NETHERITE_BRICKS);
                entries.add(EBItems.NETHERITE_BRICK_STAIRS);
                entries.add(EBItems.NETHERITE_BRICK_VERTICAL_STAIRS);
                entries.add(EBItems.NETHERITE_BRICK_SLAB);

                entries.add(EBBlocks.COPPER_BRICKS);
                entries.add(EBBlocks.COPPER_BRICK_STAIRS);
                entries.add(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.COPPER_BRICK_SLAB);
                entries.add(EBBlocks.COPPER_PRESSURE_PLATE);
                entries.add(EBBlocks.COPPER_BUTTON);

                entries.add(EBBlocks.EXPOSED_COPPER_BRICKS);
                entries.add(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS);
                entries.add(EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.EXPOSED_COPPER_BRICK_SLAB);
                entries.add(EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
                entries.add(EBBlocks.EXPOSED_COPPER_BUTTON);

                entries.add(EBBlocks.WEATHERED_COPPER_BRICKS);
                entries.add(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS);
                entries.add(EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.WEATHERED_COPPER_BRICK_SLAB);
                entries.add(EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
                entries.add(EBBlocks.WEATHERED_COPPER_BUTTON);

                entries.add(EBBlocks.OXIDIZED_COPPER_BRICKS);
                entries.add(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS);
                entries.add(EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB);
                entries.add(EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
                entries.add(EBBlocks.OXIDIZED_COPPER_BUTTON);

                entries.add(EBBlocks.WAXED_COPPER_BRICKS);
                entries.add(EBBlocks.WAXED_COPPER_BRICK_STAIRS);
                entries.add(EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.WAXED_COPPER_BRICK_SLAB);
                entries.add(EBBlocks.WAXED_COPPER_PRESSURE_PLATE);
                entries.add(EBBlocks.WAXED_COPPER_BUTTON);

                entries.add(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS);
                entries.add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS);
                entries.add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB);
                entries.add(EBBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
                entries.add(EBBlocks.WAXED_EXPOSED_COPPER_BUTTON);

                entries.add(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS);
                entries.add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS);
                entries.add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB);
                entries.add(EBBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
                entries.add(EBBlocks.WAXED_WEATHERED_COPPER_BUTTON);

                entries.add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS);
                entries.add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS);
                entries.add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB);
                entries.add(EBBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
                entries.add(EBBlocks.WAXED_OXIDIZED_COPPER_BUTTON);

                entries.add(EBBlocks.WOODEN_MUG);
                entries.add(EBBlocks.GLASS_JAR);
                entries.add(EBBlocks.GLASS_JAR_OF_FIRE);
                entries.add(EBBlocks.GLASS_JAR_OF_SOUL_FIRE);

                entries.add(EBItems.ANCIENT_POTTERY_SHERD);
                entries.add(EBItems.BITTER_POTTERY_SHERD);
                entries.add(EBItems.BOIN_POTTERY_SHERD);
                entries.add(EBItems.BUSTLING_POTTERY_SHERD);
                entries.add(EBItems.CHECKERED_POTTERY_SHERD);
                entries.add(EBItems.DECAY_POTTERY_SHERD);
                entries.add(EBItems.DESTRUCTION_POTTERY_SHERD);
                entries.add(EBItems.FORWARDS_POTTERY_SHERD);
                entries.add(EBItems.HEXXED_POTTERY_SHERD);
                entries.add(EBItems.IS_THAT_POTTERY_SHERD);
                entries.add(EBItems.KITTEH_POTTERY_SHERD);
                entries.add(EBItems.KOKOS_BUG_POTTERY_SHERD);
                entries.add(EBItems.LIFE_POTTERY_SHERD);
                entries.add(EBItems.MESMERIZE_POTTERY_SHERD);
                entries.add(EBItems.PORTAL_POTTERY_SHERD);
                entries.add(EBItems.POTTERY_POTTERY_SHERD);
                entries.add(EBItems.RING_POTTERY_SHERD);
                entries.add(EBItems.ROYALTY_POTTERY_SHERD);
                entries.add(EBItems.SNOUT_POTTERY_SHERD);
                entries.add(EBItems.SPRITE_POTTERY_SHERD);
                entries.add(EBItems.THIEF_POTTERY_SHERD);
                entries.add(EBItems.TWINS_POTTERY_SHERD);
                entries.add(EBItems.WRATHFUL_POTTERY_SHERD);

                //TODO: All EB painting variants at the bottom
            }).build());

    public static void registerEBItemGroups() {
    }
}
