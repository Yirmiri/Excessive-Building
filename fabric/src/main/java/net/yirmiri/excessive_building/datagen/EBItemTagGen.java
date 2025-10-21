package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.util.blockfamilycreator.BlockFamilyCreator;
import net.yirmiri.excessive_building.core.init.EBTags;
import net.yirmiri.excessive_building.core.registry.EBBlocks;
import net.yirmiri.excessive_building.core.registry.EBItems;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class EBItemTagGen extends FabricTagProvider.ItemTagProvider {
    public EBItemTagGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> future) {
        super(output, future);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        appendWalls();
        appendHasMalletVariants();
        appendBoats();
        generateBlockFamilyItemTags();
        appendSigns();
        appendHangingSigns();
    }

    private void appendHasMalletVariants() {
        getOrCreateTagBuilder(EBTags.ItemT.HAS_MALLET_VARIANTS)
                .add(Blocks.BOOKSHELF.asItem())
                .add(EBBlocks.ALCHEMY_SHELF.get().asItem())
        ;
    }

    private void appendWalls() {
        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(EBBlocks.HECTALITE_WALL.get().asItem())
                .add(EBBlocks.POLISHED_HECTALITE_WALL.get().asItem())
                .add(EBBlocks.HECTALITE_BRICK_WALL.get().asItem())

                .add(EBBlocks.CHLOROSLATE_WALL.get().asItem())
                .add(EBBlocks.POLISHED_CHLOROSLATE_WALL.get().asItem())
                .add(EBBlocks.CHLOROSLATE_BRICK_WALL.get().asItem())

                .add(EBBlocks.AMETHYST_BRICK_WALL.get().asItem())

                .add(EBBlocks.COBBLESTONE_BRICK_WALL.get().asItem())
                .add(EBBlocks.GRANITE_BRICK_WALL.get().asItem())
                .add(EBBlocks.DIORITE_BRICK_WALL.get().asItem())
                .add(EBBlocks.ANDESITE_BRICK_WALL.get().asItem())
        ;
    }

    private void appendSigns() {
        getOrCreateTagBuilder(ItemTags.SIGNS)
                .add(EBItems.ANCIENT_SIGN.get())
        ;
    }

    private void appendHangingSigns() {
        getOrCreateTagBuilder(ItemTags.HANGING_SIGNS)
                .add(EBItems.ANCIENT_HANGING_SIGN.get())
        ;
    }

    private void appendBoats() {
        getOrCreateTagBuilder(ItemTags.BOATS)
                .add(EBItems.ANCIENT_BOAT.get())
                .add(EBItems.ANCIENT_CHEST_BOAT.get())
        ;
    }

    public void generateBlockFamilyItemTags() {
        for (BlockFamilyCreator blockFamily : BlockFamilyCreator.BLOCK_FAMILIES.values()) {
            if (blockFamily.isOfMod(ExcessiveBuilding.MOD_ID)) {
                for (Supplier<Block> block : blockFamily.PLANKS) {
                    getOrCreateTagBuilder(ItemTags.PLANKS).add(block.get().asItem());
                }
                for (Supplier<Block> block : blockFamily.WALLS) {
                    getOrCreateTagBuilder(ItemTags.WALLS).add(block.get().asItem());
                }
                for (Supplier<Block> block : blockFamily.STAIRS) {
                    getOrCreateTagBuilder(ItemTags.STAIRS).add(block.get().asItem());
                }
                for (Supplier<Block> block : blockFamily.SLABS) {
                    getOrCreateTagBuilder(ItemTags.SLABS).add(block.get().asItem());
                }
                for (Supplier<Block> block : blockFamily.WOODEN_SLABS) {
                    getOrCreateTagBuilder(ItemTags.WOODEN_SLABS).add(block.get().asItem());
                    getOrCreateTagBuilder(ItemTags.SLABS).add(block.get().asItem());
                }
                for (Supplier<Block> block : blockFamily.FENCES) {
                    getOrCreateTagBuilder(ItemTags.FENCES).add(block.get().asItem());
                }
                for (Supplier<Block> block : blockFamily.WOODEN_FENCES) {
                    getOrCreateTagBuilder(ItemTags.WOODEN_FENCES).add(block.get().asItem());
                }
                for (Supplier<Block> block : blockFamily.FENCE_GATES) {
                    getOrCreateTagBuilder(ItemTags.FENCE_GATES).add(block.get().asItem());
                }
                for (Supplier<Block> block : blockFamily.WOODEN_DOORS) {
                    getOrCreateTagBuilder(ItemTags.WOODEN_DOORS).add(block.get().asItem());
                }
                for (Supplier<Block> block : blockFamily.DOORS) {
                    getOrCreateTagBuilder(ItemTags.DOORS).add(block.get().asItem());
                }
                for (Supplier<Block> block : blockFamily.WOODEN_TRAPDOORS) {
                    getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS).add(block.get().asItem());
                }
                for (Supplier<Block> block : blockFamily.TRAPDOORS) {
                    getOrCreateTagBuilder(ItemTags.TRAPDOORS).add(block.get().asItem());
                }
                for (Supplier<Block> block : blockFamily.WOODEN_PRESSURE_PLATES) {
                    getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES).add(block.get().asItem());
                }
                for (Supplier<Block> block : blockFamily.WOODEN_BUTTONS) {
                    getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS).add(block.get().asItem());
                }
                for (Supplier<Block> block : blockFamily.STONE_BUTTONS) {
                    getOrCreateTagBuilder(ItemTags.STONE_BUTTONS).add(block.get().asItem());
                }
                for (Supplier<Block> block : blockFamily.BUTTONS) {
                    getOrCreateTagBuilder(ItemTags.BUTTONS).add(block.get().asItem());
                }
                for (TagKey<Item> tag : blockFamily.FLAMMABLE_LOG_ITEM_TAGS) {
                    String name = tag.location().getPath().replace("_logs", "");
                    getOrCreateTagBuilder(tag)
                            .add(blockFamily.getBlock(name + "_log").get().asItem())
                            .add(blockFamily.getBlock(name + "_wood").get().asItem())
                            .add(blockFamily.getBlock("stripped_" + name + "_log").get().asItem())
                            .add(blockFamily.getBlock("stripped_" + name + "_wood").get().asItem())
                    ;
                    getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN).addTag(tag);
                }
                for (TagKey<Item> tag : blockFamily.LOG_ITEM_TAGS) {
                    String name = tag.location().getPath().replace("_logs", "");
                    getOrCreateTagBuilder(tag)
                            .add(blockFamily.getBlock(name + "_log").get().asItem())
                            .add(blockFamily.getBlock(name + "_wood").get().asItem())
                            .add(blockFamily.getBlock("stripped_" + name + "_log").get().asItem())
                            .add(blockFamily.getBlock("stripped_" + name + "_wood").get().asItem())
                    ;
                    getOrCreateTagBuilder(ItemTags.LOGS).addTag(tag);
                }
                for (Supplier<Block> block : blockFamily.LEAVES) {
                    getOrCreateTagBuilder(ItemTags.LEAVES).add(block.get().asItem());
                }
                for (Supplier<Block> block : blockFamily.FLOWERS) {
                    getOrCreateTagBuilder(ItemTags.FLOWERS).add(block.get().asItem());
                }
                for (Supplier<Block> block : blockFamily.SAPLINGS) {
                    getOrCreateTagBuilder(ItemTags.SAPLINGS).add(block.get().asItem());
                }
            }
        }
    }
}
