package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;
import net.yirmiri.excessive_building.util.EBTags;

import java.util.concurrent.CompletableFuture;

public class EBItemTagGen extends FabricTagProvider.ItemTagProvider {
    public EBItemTagGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> future) {
        super(output, future);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapper) {
        appendMosaic();
        appendPlanks();
        appendSaplings();
        appendDecoratedPotSherds();
        appendDecoratedPotIngredients();
        appendGlowRemovals();
        appendAncientLogs();
        appendGloomLogs();
        appendSoulFireBaseBlocks();
        appendSmallFlowers();
        appendPiglinLoved();
        appendSoils();
        appendLeaves();
        appendSnifferFood();
        appendKnittedWools();
        appendKnittedCarpets();
        appendHammerRepairable();
        appendHammerableTooltip();
        appendMiningEnchantable();
        appendVanishingEnchantable();
        appendDurabilityEnchantable();
        appendMiningLootEnchantable();
        appendBookshelfVariants();
        appendWoodenSlabs();
        appendWoodenStairs();
        appendWoodenButtons();
        appendWoodenPressurePlates();
        appendTakesPriorityOverTools();
        appendWrenchRepairable();
    }

    public void appendWrenchRepairable() {
        tag(EBTags.Items.WRENCH_REPAIRABLE)
                .add(Items.COPPER_INGOT)
        ;
    }

    public void appendTakesPriorityOverTools() {
        tag(EBTags.Items.TAKES_PRIORITY_OVER_TOOLS)
                .add(Items.SHIELD)
                .add(Items.BOW)
                .add(Items.CROSSBOW)
                .add(Items.TRIDENT)
        ;
    }

    public void appendWoodenButtons() {
        tag(ItemTags.WOODEN_BUTTONS)
                .add(EBBlocks.ANCIENT_BUTTON.asItem())
                .add(EBBlocks.GLOOM_BUTTON.asItem())
        ;
    }

    public void appendWoodenPressurePlates() {
        tag(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(EBBlocks.ANCIENT_PRESSURE_PLATE.asItem())
                .add(EBBlocks.GLOOM_PRESSURE_PLATE.asItem())
        ;
    }

    public void appendWoodenStairs() {
        tag(ItemTags.WOODEN_STAIRS)
                .add(EBBlocks.ANCIENT_STAIRS.asItem())
                .add(EBBlocks.GLOOM_STAIRS.asItem())
        ;
    }

    public void appendWoodenSlabs() {
        tag(ItemTags.WOODEN_SLABS)
                .add(EBBlocks.ANCIENT_SLAB.asItem())
                .add(EBBlocks.GLOOM_SLAB.asItem())
        ;
    }

    public void appendBookshelfVariants() {
        tag(EBTags.Items.BOOKSHELF_VARIANTS)
                .add(EBBlocks.SPRUCE_BOOKSHELF.asItem())
                .add(EBBlocks.BIRCH_BOOKSHELF.asItem())
                .add(EBBlocks.JUNGLE_BOOKSHELF.asItem())
                .add(EBBlocks.ACACIA_BOOKSHELF.asItem())
                .add(EBBlocks.DARK_OAK_BOOKSHELF.asItem())
                .add(EBBlocks.MANGROVE_BOOKSHELF.asItem())
                .add(EBBlocks.CHERRY_BOOKSHELF.asItem())
                .add(EBBlocks.BAMBOO_BOOKSHELF.asItem())
                .add(EBBlocks.CRIMSON_BOOKSHELF.asItem())
                .add(EBBlocks.WARPED_BOOKSHELF.asItem())
                .add(EBBlocks.ANCIENT_BOOKSHELF.asItem())
                .add(EBBlocks.GLOOM_BOOKSHELF.asItem())
        ;
    }

    public void appendHammerableTooltip() {
        tag(EBTags.Items.HAMMERABLE_TOOLTIP)
                .add(EBBlocks.POLISHED_ALMENTRA.asItem())
                .add(EBBlocks.THICK_PAPER_BLOCK.asItem())
                .add(EBBlocks.THICK_PAPER_STAIRS.asItem())
                .add(EBBlocks.THICK_PAPER_SLAB.asItem())
                .add(EBBlocks.THICK_PAPER_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.THICK_DIAGONAL_PAPER_BLOCK.asItem())
                .add(EBBlocks.THICK_DIVIDED_PAPER_BLOCK.asItem())
                .add(EBBlocks.THIN_PAPER_BLOCK.asItem())
                .add(EBBlocks.THIN_PAPER_STAIRS.asItem())
                .add(EBBlocks.THIN_PAPER_SLAB.asItem())
                .add(EBBlocks.THIN_PAPER_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.THIN_DIAGONAL_PAPER_BLOCK.asItem())
                .add(EBBlocks.THIN_DIVIDED_PAPER_BLOCK.asItem())
                .add(EBBlocks.DECORATED_SANDSTONE_BRICKS.asItem())
                .add(EBBlocks.DECORATED_RED_SANDSTONE_BRICKS.asItem())
                .add(EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS.asItem())
                .add(EBBlocks.OAK_MOSAIC.asItem())
                .add(EBBlocks.OAK_MOSAIC_STAIRS.asItem())
                .add(EBBlocks.OAK_MOSAIC_SLAB.asItem())
                .add(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.SPRUCE_MOSAIC.asItem())
                .add(EBBlocks.SPRUCE_MOSAIC_STAIRS.asItem())
                .add(EBBlocks.SPRUCE_MOSAIC_SLAB.asItem())
                .add(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.BIRCH_MOSAIC.asItem())
                .add(EBBlocks.BIRCH_MOSAIC_STAIRS.asItem())
                .add(EBBlocks.BIRCH_MOSAIC_SLAB.asItem())
                .add(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.JUNGLE_MOSAIC.asItem())
                .add(EBBlocks.JUNGLE_MOSAIC_STAIRS.asItem())
                .add(EBBlocks.JUNGLE_MOSAIC_SLAB.asItem())
                .add(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.ACACIA_MOSAIC.asItem())
                .add(EBBlocks.ACACIA_MOSAIC_STAIRS.asItem())
                .add(EBBlocks.ACACIA_MOSAIC_SLAB.asItem())
                .add(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.DARK_OAK_MOSAIC.asItem())
                .add(EBBlocks.DARK_OAK_MOSAIC_STAIRS.asItem())
                .add(EBBlocks.DARK_OAK_MOSAIC_SLAB.asItem())
                .add(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.MANGROVE_MOSAIC.asItem())
                .add(EBBlocks.MANGROVE_MOSAIC_STAIRS.asItem())
                .add(EBBlocks.MANGROVE_MOSAIC_SLAB.asItem())
                .add(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.CHERRY_MOSAIC.asItem())
                .add(EBBlocks.CHERRY_MOSAIC_STAIRS.asItem())
                .add(EBBlocks.CHERRY_MOSAIC_SLAB.asItem())
                .add(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.CRIMSON_MOSAIC.asItem())
                .add(EBBlocks.CRIMSON_MOSAIC_STAIRS.asItem())
                .add(EBBlocks.CRIMSON_MOSAIC_SLAB.asItem())
                .add(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.WARPED_MOSAIC.asItem())
                .add(EBBlocks.WARPED_MOSAIC_STAIRS.asItem())
                .add(EBBlocks.WARPED_MOSAIC_SLAB.asItem())
                .add(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS.asItem())
                .add(Blocks.BAMBOO_MOSAIC.asItem())
                .add(Blocks.BAMBOO_MOSAIC_STAIRS.asItem())
                .add(Blocks.BAMBOO_MOSAIC_SLAB.asItem())
                .add(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.ANCIENT_MOSAIC.asItem())
                .add(EBBlocks.ANCIENT_MOSAIC_STAIRS.asItem())
                .add(EBBlocks.ANCIENT_MOSAIC_SLAB.asItem())
                .add(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.GLOOM_MOSAIC.asItem())
                .add(EBBlocks.GLOOM_MOSAIC_STAIRS.asItem())
                .add(EBBlocks.GLOOM_MOSAIC_SLAB.asItem())
                .add(EBBlocks.GLOOM_MOSAIC_VERTICAL_STAIRS.asItem())
                .add(Blocks.CARVED_PUMPKIN.asItem())
                .add(Blocks.JACK_O_LANTERN.asItem())
                .add(EBBlocks.CHEERFUL_CARVED_PUMPKIN.asItem())
                .add(EBBlocks.GRUMPY_CARVED_PUMPKIN.asItem())
                .add(EBBlocks.WICKED_CARVED_PUMPKIN.asItem())
                .add(EBBlocks.CHEERFUL_JACK_O_LANTERN.asItem())
                .add(EBBlocks.GRUMPY_JACK_O_LANTERN.asItem())
                .add(EBBlocks.WICKED_JACK_O_LANTERN.asItem())
                .add(EBBlocks.SOUL_JACK_O_LANTERN.asItem())
                .add(EBBlocks.CHEERFUL_SOUL_JACK_O_LANTERN.asItem())
                .add(EBBlocks.GRUMPY_SOUL_JACK_O_LANTERN.asItem())
                .add(EBBlocks.WICKED_SOUL_JACK_O_LANTERN.asItem())
                .add(EBBlocks.ANCIENT_LEAVES.asItem())
                .add(EBBlocks.OAK_BOARDS.asItem())
                .add(EBBlocks.OAK_BOARD_STAIRS.asItem())
                .add(EBBlocks.OAK_BOARD_SLAB.asItem())
                .add(EBBlocks.OAK_BOARD_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.SPRUCE_BOARDS.asItem())
                .add(EBBlocks.SPRUCE_BOARD_STAIRS.asItem())
                .add(EBBlocks.SPRUCE_BOARD_SLAB.asItem())
                .add(EBBlocks.SPRUCE_BOARD_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.BIRCH_BOARDS.asItem())
                .add(EBBlocks.BIRCH_BOARD_STAIRS.asItem())
                .add(EBBlocks.BIRCH_BOARD_SLAB.asItem())
                .add(EBBlocks.BIRCH_BOARD_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.JUNGLE_BOARDS.asItem())
                .add(EBBlocks.JUNGLE_BOARD_STAIRS.asItem())
                .add(EBBlocks.JUNGLE_BOARD_SLAB.asItem())
                .add(EBBlocks.JUNGLE_BOARD_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.ACACIA_BOARDS.asItem())
                .add(EBBlocks.ACACIA_BOARD_STAIRS.asItem())
                .add(EBBlocks.ACACIA_BOARD_SLAB.asItem())
                .add(EBBlocks.ACACIA_BOARD_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.DARK_OAK_BOARDS.asItem())
                .add(EBBlocks.DARK_OAK_BOARD_STAIRS.asItem())
                .add(EBBlocks.DARK_OAK_BOARD_SLAB.asItem())
                .add(EBBlocks.DARK_OAK_BOARD_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.MANGROVE_BOARDS.asItem())
                .add(EBBlocks.MANGROVE_BOARD_STAIRS.asItem())
                .add(EBBlocks.MANGROVE_BOARD_SLAB.asItem())
                .add(EBBlocks.MANGROVE_BOARD_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.CHERRY_BOARDS.asItem())
                .add(EBBlocks.CHERRY_BOARD_STAIRS.asItem())
                .add(EBBlocks.CHERRY_BOARD_SLAB.asItem())
                .add(EBBlocks.CHERRY_BOARD_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.CRIMSON_BOARDS.asItem())
                .add(EBBlocks.CRIMSON_BOARD_STAIRS.asItem())
                .add(EBBlocks.CRIMSON_BOARD_SLAB.asItem())
                .add(EBBlocks.CRIMSON_BOARD_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.WARPED_BOARDS.asItem())
                .add(EBBlocks.WARPED_BOARD_STAIRS.asItem())
                .add(EBBlocks.WARPED_BOARD_SLAB.asItem())
                .add(EBBlocks.WARPED_BOARD_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.BAMBOO_BOARDS.asItem())
                .add(EBBlocks.BAMBOO_BOARD_STAIRS.asItem())
                .add(EBBlocks.BAMBOO_BOARD_SLAB.asItem())
                .add(EBBlocks.BAMBOO_BOARD_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.ANCIENT_BOARDS.asItem())
                .add(EBBlocks.ANCIENT_BOARD_STAIRS.asItem())
                .add(EBBlocks.ANCIENT_BOARD_SLAB.asItem())
                .add(EBBlocks.ANCIENT_BOARD_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.GLOOM_BOARDS.asItem())
                .add(EBBlocks.GLOOM_BOARD_STAIRS.asItem())
                .add(EBBlocks.GLOOM_BOARD_SLAB.asItem())
                .add(EBBlocks.GLOOM_BOARD_VERTICAL_STAIRS.asItem())

                //CRACKED
                .add(Blocks.STONE_BRICKS.asItem())
                .add(Blocks.DEEPSLATE_BRICKS.asItem())
                .add(Blocks.DEEPSLATE_TILES.asItem())
                .add(Blocks.POLISHED_BLACKSTONE_BRICKS.asItem())
                .add(Blocks.NETHER_BRICKS.asItem())
                .add(Blocks.INFESTED_STONE_BRICKS.asItem())
                .add(EBBlocks.COBBLESTONE_BRICKS.asItem())
                .add(EBBlocks.COBBLED_DEEPSLATE_BRICKS.asItem())
                .add(EBBlocks.BLACKSTONE_BRICKS.asItem())
                .add(EBBlocks.SMOOTH_STONE_BRICKS.asItem())
                .add(EBBlocks.GRANITE_BRICKS.asItem())
                .add(EBBlocks.ANDESITE_BRICKS.asItem())
                .add(EBBlocks.DIORITE_BRICKS.asItem())
                .add(Blocks.BRICKS.asItem())
                .add(EBBlocks.SMOOTH_BRICKS.asItem())
                .add(EBBlocks.BRIMSTONE_BRICKS.asItem())
                .add(Blocks.MUD_BRICKS.asItem())
        ;

        for (DyeColor colors : DyeColor.values()) {
            tag(EBTags.Items.HAMMERABLE_TOOLTIP).add(EBBlocks.getDyedPolishedAlmentra(colors.getId()).asItem());
        }
    }

    public void appendMiningLootEnchantable() {
        tag(ItemTags.MINING_LOOT_ENCHANTABLE)
                .add(EBItems.HAMMER)
        ;
    }

    public void appendMiningEnchantable() {
        tag(ItemTags.MINING_ENCHANTABLE)
                .add(EBItems.HAMMER)
        ;
    }

    public void appendDurabilityEnchantable() {
        tag(ItemTags.DURABILITY_ENCHANTABLE)
                .add(EBItems.HAMMER)
        ;
    }

    public void appendVanishingEnchantable() {
        tag(ItemTags.VANISHING_ENCHANTABLE)
                .add(EBItems.HAMMER)
        ;
    }

    public void appendHammerRepairable() {
        tag(EBTags.Items.HAMMER_REPAIRABLE)
                .add(Items.AMETHYST_SHARD)
        ;
    }

    public void appendKnittedWools() {
        tag(EBTags.Items.KNITTED_WOOL)

        ;

        for (DyeColor colors : DyeColor.values()) {
            tag(EBTags.Items.KNITTED_WOOL).add(EBBlocks.getDyedKnittedWools(colors.getId()).asItem());
        }
    }

    public void appendKnittedCarpets() {
        tag(EBTags.Items.KNITTED_CARPET)

        ;

        for (DyeColor colors : DyeColor.values()) {
            tag(EBTags.Items.KNITTED_CARPET).add(EBBlocks.getDyedKnittedCarpets(colors.getId()).asItem());
        }
    }

    public void appendSnifferFood() {
        tag(ItemTags.SNIFFER_FOOD)
                .add(EBBlocks.GLOOM_SEEDS.asItem())
                .add(EBItems.ANCIENT_FRUIT)
        ;
    }

    public void appendLeaves() {
        tag(ItemTags.LEAVES)
                .add(EBBlocks.GLOOM_LEAVES.asItem())
                .add(EBBlocks.ANCIENT_LEAVES.asItem())
        ;
    }

    public void appendSoils() {
        tag(EBTags.Items.SOILS)
                .add(Items.DIRT)
        ;
    }

    public void appendPiglinLoved() {
        tag(ItemTags.PIGLIN_LOVED)
                .add(EBBlocks.GOLD_GRATE.asItem())
                .add(EBBlocks.GOLD_BRICKS.asItem())
                .add(EBBlocks.GOLD_BRICK_STAIRS.asItem())
                .add(EBBlocks.GOLD_BRICK_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.GOLD_BRICK_SLAB.asItem())
        ;
    }

    public void appendSmallFlowers() {
        tag(ItemTags.SMALL_FLOWERS)
                .add(EBBlocks.ROSE.asItem())
                .add(EBBlocks.CYAN_ROSE.asItem())
                .add(EBBlocks.WHITE_ROSE.asItem())
        ;
    }

    public void appendSoulFireBaseBlocks() {
        tag(ItemTags.SOUL_FIRE_BASE_BLOCKS)
                .add(EBBlocks.POLISHED_SOUL_SANDSTONE.asItem())
                .add(EBBlocks.POLISHED_SOUL_SANDSTONE_STAIRS.asItem())
                .add(EBBlocks.POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB.asItem())
                .add(EBBlocks.POLISHED_SOUL_SANDSTONE_WALL.asItem())
                .add(EBBlocks.SOUL_SANDSTONE_BRICKS.asItem())
                .add(EBBlocks.SOUL_SANDSTONE_BRICK_STAIRS.asItem())
                .add(EBBlocks.SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB.asItem())
                .add(EBBlocks.SOUL_SANDSTONE_BRICK_WALL.asItem())
                .add(EBBlocks.SOUL_SANDSTONE_TILES.asItem())
                .add(EBBlocks.SOUL_SANDSTONE_TILE_STAIRS.asItem())
                .add(EBBlocks.SOUL_SANDSTONE_TILE_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.SOUL_SANDSTONE_TILE_SLAB.asItem())
                .add(EBBlocks.SOUL_SANDSTONE_TILE_WALL.asItem())
                .add(EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS.asItem())
                .add(EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS.asItem())
                .add(EBBlocks.ENGRAVED_SOUL_SANDSTONE_BRICKS.asItem())
                .add(EBBlocks.SOUL_SANDSTONE_PILLAR.asItem())
                .add(EBBlocks.SOUL_MAGMA_BLOCK.asItem())
                .add(EBBlocks.SOUL_SANDSTONE.asItem())
                .add(EBBlocks.SOUL_SANDSTONE_STAIRS.asItem())
                .add(EBBlocks.SOUL_SANDSTONE_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.SOUL_SANDSTONE_SLAB.asItem())
                .add(EBBlocks.SOUL_SANDSTONE_WALL.asItem())
                .add(EBBlocks.CUT_SOUL_SANDSTONE_SLAB.asItem())
                .add(EBBlocks.CUT_SOUL_SANDSTONE.asItem())
                .add(EBBlocks.CHISELED_SOUL_SANDSTONE.asItem())
                .add(EBBlocks.SMOOTH_SOUL_SANDSTONE.asItem())
                .add(EBBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS.asItem())
                .add(EBBlocks.SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.SMOOTH_SOUL_SANDSTONE_SLAB.asItem())
        ;
    }

    public void appendMosaic() {
        tag(EBTags.Items.MOSAIC)
                .add(Items.BAMBOO_MOSAIC)
                .add(EBBlocks.OAK_MOSAIC.asItem())
                .add(EBBlocks.SPRUCE_MOSAIC.asItem())
                .add(EBBlocks.BIRCH_MOSAIC.asItem())
                .add(EBBlocks.JUNGLE_MOSAIC.asItem())
                .add(EBBlocks.ACACIA_MOSAIC.asItem())
                .add(EBBlocks.DARK_OAK_MOSAIC.asItem())
                .add(EBBlocks.MANGROVE_MOSAIC.asItem())
                .add(EBBlocks.CHERRY_MOSAIC.asItem())
                .add(EBBlocks.CRIMSON_MOSAIC.asItem())
                .add(EBBlocks.WARPED_MOSAIC.asItem())
                .add(EBBlocks.ANCIENT_MOSAIC.asItem())
                .add(EBBlocks.GLOOM_MOSAIC.asItem())
        ;
    }

    public void appendGloomLogs() {
        tag(EBTags.Items.GLOOM_LOGS)
                .add(EBBlocks.GLOOM_LOG.asItem())
                .add(EBBlocks.GLOOM_WOOD.asItem())
                .add(EBBlocks.STRIPPED_GLOOM_LOG.asItem())
                .add(EBBlocks.STRIPPED_GLOOM_WOOD.asItem())
        ;
    }

    public void appendAncientLogs() {
        tag(EBTags.Items.ANCIENT_LOGS)
                .add(EBBlocks.ANCIENT_LOG.asItem())
                .add(EBBlocks.ANCIENT_WOOD.asItem())
                .add(EBBlocks.STRIPPED_ANCIENT_LOG.asItem())
                .add(EBBlocks.STRIPPED_ANCIENT_WOOD.asItem())
        ;
    }

    public void appendGlowRemovals() {
        tag(EBTags.Items.GLOW_REMOVALS)
                .add(Items.PAPER)
        ;
    }

    public void appendSaplings() {
        tag(ItemTags.SAPLINGS)
                .add(EBBlocks.ANCIENT_SAPLING.asItem())
                .add(EBBlocks.GLOOM_SEEDS.asItem())
                .add(EBBlocks.GLOOM_SAPLING.asItem())
        ;
    }

    public void appendPlanks() {
        tag(ItemTags.PLANKS)
                .add(EBBlocks.ANCIENT_PLANKS.asItem())
                .add(EBBlocks.GLOOM_PLANKS.asItem())
        ;
    }

    public void appendDecoratedPotSherds() {
        tag(ItemTags.DECORATED_POT_SHERDS)
                .add(EBItems.ROYALTY_POTTERY_SHERD)
                .add(EBItems.ANCIENT_POTTERY_SHERD)
                .add(EBItems.BITTER_POTTERY_SHERD)
                .add(EBItems.BOIN_POTTERY_SHERD)
                .add(EBItems.BUSTLING_POTTERY_SHERD)
                .add(EBItems.CHECKERED_POTTERY_SHERD)
                .add(EBItems.DECAY_POTTERY_SHERD)
                .add(EBItems.DESTRUCTION_POTTERY_SHERD)
                .add(EBItems.FORWARDS_POTTERY_SHERD)
                .add(EBItems.HEXXED_POTTERY_SHERD)
                .add(EBItems.KITTEH_POTTERY_SHERD)
                .add(EBItems.LIFE_POTTERY_SHERD)
                .add(EBItems.MESMERIZE_POTTERY_SHERD)
                .add(EBItems.PORTAL_POTTERY_SHERD)
                .add(EBItems.POTTERY_POTTERY_SHERD)
                .add(EBItems.RING_POTTERY_SHERD)
                .add(EBItems.SNOUT_POTTERY_SHERD)
                .add(EBItems.SPRITE_POTTERY_SHERD)
                .add(EBItems.TWINS_POTTERY_SHERD)
                .add(EBItems.WRATHFUL_POTTERY_SHERD)
                .add(EBItems.IS_THAT_POTTERY_SHERD)
                .add(EBItems.KOKOS_BUG_POTTERY_SHERD)
                .add(EBItems.THIEF_POTTERY_SHERD)
        ;
    }

    public void appendDecoratedPotIngredients() {
        tag(ItemTags.DECORATED_POT_INGREDIENTS)
                .add(EBItems.ROYALTY_POTTERY_SHERD)
                .add(EBItems.ANCIENT_POTTERY_SHERD)
                .add(EBItems.BITTER_POTTERY_SHERD)
                .add(EBItems.BOIN_POTTERY_SHERD)
                .add(EBItems.BUSTLING_POTTERY_SHERD)
                .add(EBItems.CHECKERED_POTTERY_SHERD)
                .add(EBItems.DECAY_POTTERY_SHERD)
                .add(EBItems.DESTRUCTION_POTTERY_SHERD)
                .add(EBItems.FORWARDS_POTTERY_SHERD)
                .add(EBItems.HEXXED_POTTERY_SHERD)
                .add(EBItems.KITTEH_POTTERY_SHERD)
                .add(EBItems.LIFE_POTTERY_SHERD)
                .add(EBItems.MESMERIZE_POTTERY_SHERD)
                .add(EBItems.PORTAL_POTTERY_SHERD)
                .add(EBItems.POTTERY_POTTERY_SHERD)
                .add(EBItems.RING_POTTERY_SHERD)
                .add(EBItems.SNOUT_POTTERY_SHERD)
                .add(EBItems.SPRITE_POTTERY_SHERD)
                .add(EBItems.TWINS_POTTERY_SHERD)
                .add(EBItems.WRATHFUL_POTTERY_SHERD)
                .add(EBItems.IS_THAT_POTTERY_SHERD)
                .add(EBItems.KOKOS_BUG_POTTERY_SHERD)
                .add(EBItems.THIEF_POTTERY_SHERD)
        ;
    }
}
