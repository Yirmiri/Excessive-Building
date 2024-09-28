package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.DyeColor;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;
import net.yirmiri.excessive_building.util.EBTags;

import java.util.concurrent.CompletableFuture;

public class EBItemTagGen extends FabricTagProvider.ItemTagProvider {
    public EBItemTagGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> future) {
        super(output, future);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapper) {
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
        appendEBHammers();
        appendHammerableTooltip();
        appendMiningEnchantable();
        appendVanishingEnchantable();
        appendDurabilityEnchantable();
        appendMiningLootEnchantable();
    }

    public void appendHammerableTooltip() {
        getOrCreateTagBuilder(EBTags.Items.HAMMERABLE_TOOLTIP)
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
            getOrCreateTagBuilder(EBTags.Items.HAMMERABLE_TOOLTIP).add(EBBlocks.getDyedPolishedAlmentra(colors.getId()).asItem());
        }
    }

    public void appendMiningLootEnchantable() {
        getOrCreateTagBuilder(ItemTags.MINING_LOOT_ENCHANTABLE)
                .add(EBItems.HAMMER)
        ;
    }

    public void appendMiningEnchantable() {
        getOrCreateTagBuilder(ItemTags.MINING_ENCHANTABLE)
                .add(EBItems.HAMMER)
        ;
    }

    public void appendDurabilityEnchantable() {
        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(EBItems.HAMMER)
        ;
    }

    public void appendVanishingEnchantable() {
        getOrCreateTagBuilder(ItemTags.VANISHING_ENCHANTABLE)
                .add(EBItems.HAMMER)
        ;
    }

    public void appendEBHammers() {
        getOrCreateTagBuilder(EBTags.Items.EB_HAMMERS)
                .add(EBItems.HAMMER)
        ;
    }

    public void appendHammerRepairable() {
        getOrCreateTagBuilder(EBTags.Items.HAMMER_REPAIRABLE)
                .add(Items.AMETHYST_SHARD)
        ;
    }

    public void appendKnittedWools() {
        getOrCreateTagBuilder(EBTags.Items.KNITTED_WOOL)

        ;

        for (DyeColor colors : DyeColor.values()) {
            getOrCreateTagBuilder(EBTags.Items.KNITTED_WOOL).add(EBBlocks.getDyedKnittedWools(colors.getId()).asItem());
        }
    }

    public void appendKnittedCarpets() {
        getOrCreateTagBuilder(EBTags.Items.KNITTED_CARPET)

        ;

        for (DyeColor colors : DyeColor.values()) {
            getOrCreateTagBuilder(EBTags.Items.KNITTED_CARPET).add(EBBlocks.getDyedKnittedCarpets(colors.getId()).asItem());
        }
    }

    public void appendSnifferFood() {
        getOrCreateTagBuilder(ItemTags.SNIFFER_FOOD)
                .add(EBBlocks.GLOOM_SEEDS.asItem())
                .add(EBItems.ANCIENT_FRUIT)
        ;
    }

    public void appendLeaves() {
        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(EBBlocks.GLOOM_LEAVES.asItem())
                .add(EBBlocks.ANCIENT_LEAVES.asItem())
        ;
    }

    public void appendSoils() {
        getOrCreateTagBuilder(EBTags.Items.SOILS)
                .add(Items.DIRT)
                .add(Items.ROOTED_DIRT)
                .add(Items.COARSE_DIRT)
        ;
    }

    public void appendPiglinLoved() {
        getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED)
                .add(EBBlocks.GOLD_GRATE.asItem())
                .add(EBBlocks.GOLD_BRICKS.asItem())
                .add(EBBlocks.GOLD_BRICK_STAIRS.asItem())
                .add(EBBlocks.GOLD_BRICK_VERTICAL_STAIRS.asItem())
                .add(EBBlocks.GOLD_BRICK_SLAB.asItem())
        ;
    }

    public void appendSmallFlowers() {
        getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS)
                .add(EBBlocks.ROSE.asItem())
                .add(EBBlocks.CYAN_ROSE.asItem())
                .add(EBBlocks.WHITE_ROSE.asItem())
        ;
    }

    public void appendSoulFireBaseBlocks() {
        getOrCreateTagBuilder(ItemTags.SOUL_FIRE_BASE_BLOCKS)
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
        getOrCreateTagBuilder(EBTags.Items.MOSAIC)
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
        getOrCreateTagBuilder(EBTags.Items.GLOOM_LOGS)
                .add(EBBlocks.GLOOM_LOG.asItem())
                .add(EBBlocks.GLOOM_WOOD.asItem())
                .add(EBBlocks.STRIPPED_GLOOM_LOG.asItem())
                .add(EBBlocks.STRIPPED_GLOOM_WOOD.asItem())
        ;
    }

    public void appendAncientLogs() {
        getOrCreateTagBuilder(EBTags.Items.ANCIENT_LOGS)
                .add(EBBlocks.ANCIENT_LOG.asItem())
                .add(EBBlocks.ANCIENT_WOOD.asItem())
                .add(EBBlocks.STRIPPED_ANCIENT_LOG.asItem())
                .add(EBBlocks.STRIPPED_ANCIENT_WOOD.asItem())
        ;
    }

    public void appendGlowRemovals() {
        getOrCreateTagBuilder(EBTags.Items.GLOW_REMOVALS)
                .add(Items.PAPER)
        ;
    }

    public void appendSaplings() {
        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(EBBlocks.ANCIENT_SAPLING.asItem())
                .add(EBBlocks.GLOOM_SEEDS.asItem())
                .add(EBBlocks.GLOOM_SAPLING.asItem())
        ;
    }

    public void appendPlanks() {
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(EBBlocks.ANCIENT_PLANKS.asItem())
                .add(EBBlocks.GLOOM_PLANKS.asItem())
        ;
    }

    public void appendDecoratedPotSherds() {
        getOrCreateTagBuilder(ItemTags.DECORATED_POT_SHERDS)
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
        getOrCreateTagBuilder(ItemTags.DECORATED_POT_INGREDIENTS)
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
