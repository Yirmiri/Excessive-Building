package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
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
