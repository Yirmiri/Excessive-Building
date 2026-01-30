package net.yirmiri.excessive_building.datagen;

import net.azurune.runiclib.RunicLib;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.yirmiri.excessive_building.common.util.EBIntegrationIds;
import net.yirmiri.excessive_building.core.init.EBTags;
import net.yirmiri.excessive_building.core.registry.EBBlocks;
import net.yirmiri.excessive_building.core.registry.EBItems;

import java.util.concurrent.CompletableFuture;

public class EBItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public EBItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> future) {
        super(output, future);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        appendWalls();
        appendDeadCoralBlocks();
        appendSmallFlowers();
        appendSigns();
        appendHangingSigns();
        appendWoodenButtons();
        appendWoodenDoors();
        appendWoodenFenceGates();
        appendWoodenFences();
        appendWoodenPressurePlates();
        appendWoodenSlabs();
        appendWoodenStairs();
        appendWoodenTrapdoors();
        appendAncientLogs();
        appendMiningEnchantable();
        appendDurabilityEnchantable();
    }

    private void appendWalls() {
        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(EBBlocks.COBBLESTONE_BRICK_WALL.get().asItem())
                .add(EBBlocks.CORALSOIL_BRICK_WALL.get().asItem())
                .add(EBBlocks.LAVENDER_BRICK_WALL.get().asItem())
                .add(EBBlocks.CONGLOMERATE_WALL.get().asItem())
                .add(EBBlocks.CONGLOMERATE_BRICK_WALL.get().asItem())
                .add(EBBlocks.BRIMSTONE_WALL.get().asItem())
                .add(EBBlocks.BRIMSTONE_BRICK_WALL.get().asItem())
                .add(EBBlocks.DIORITE_BRICK_WALL.get().asItem())
                .add(EBBlocks.GRANITE_BRICK_WALL.get().asItem())
                .add(EBBlocks.ANDESITE_BRICK_WALL.get().asItem())
                .add(EBBlocks.HECTALITE_WALL.get().asItem())
                .add(EBBlocks.POLISHED_HECTALITE_WALL.get().asItem())
                .add(EBBlocks.HECTALITE_BRICK_WALL.get().asItem())
                .add(EBBlocks.ARIDITE_WALL.get().asItem())
                .add(EBBlocks.POLISHED_ARIDITE_WALL.get().asItem())
                .add(EBBlocks.ARIDITE_BRICK_WALL.get().asItem())
                .add(EBBlocks.CHLOROSLATE_WALL.get().asItem())
                .add(EBBlocks.POLISHED_CHLOROSLATE_WALL.get().asItem())
                .add(EBBlocks.CHLOROSLATE_BRICK_WALL.get().asItem())
        ;
    }

    private void appendSmallFlowers() {
        getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS)
                .add(EBBlocks.LAVENDER.get().asItem())
        ;
    }

    private void appendAncientLogs() {
        getOrCreateTagBuilder(EBTags.ItemT.ANCIENT_LOGS)
                .add(EBBlocks.ANCIENT_LOG.get().asItem())
                .add(EBBlocks.ANCIENT_WOOD.get().asItem())
                .add(EBBlocks.STRIPPED_ANCIENT_LOG.get().asItem())
                .add(EBBlocks.STRIPPED_ANCIENT_WOOD.get().asItem())
        ;
    }

    private void appendDeadCoralBlocks() {
        getOrCreateTagBuilder(EBTags.ItemT.DEAD_CORAL_BLOCKS)
                .add(Items.DEAD_BRAIN_CORAL_BLOCK)
                .add(Items.DEAD_BUBBLE_CORAL_BLOCK)
                .add(Items.DEAD_FIRE_CORAL_BLOCK)
                .add(Items.DEAD_HORN_CORAL_BLOCK)
                .add(Items.DEAD_TUBE_CORAL_BLOCK)
                .addOptional(RunicLib.customid(EBIntegrationIds.FF_ID, "dead_flower_coral_block"))
                .addOptional(RunicLib.customid(EBIntegrationIds.FF_ID, "dead_hammer_coral_block"))
                .addOptional(RunicLib.customid(EBIntegrationIds.FF_ID, "dead_leaf_coral_block"))
                .addOptional(RunicLib.customid(EBIntegrationIds.FF_ID, "dead_pillar_coral_block"))
                .addOptional(RunicLib.customid(EBIntegrationIds.FF_ID, "dead_sun_coral_block"))
        ;
    }

    private void appendSigns() {
        getOrCreateTagBuilder(ItemTags.SIGNS)
                .add(EBBlocks.ANCIENT_SIGN.get().asItem())
        ;
    }

    private void appendHangingSigns() {
        getOrCreateTagBuilder(ItemTags.HANGING_SIGNS)
                .add(EBBlocks.ANCIENT_WALL_HANGING_SIGN.get().asItem())
        ;
    }

    private void appendWoodenButtons() {
        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(EBBlocks.ANCIENT_BUTTON.get().asItem())
        ;
    }

    private void appendWoodenPressurePlates() {
        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(EBBlocks.ANCIENT_PRESSURE_PLATE.get().asItem())
        ;
    }

    private void appendWoodenSlabs() {
        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(EBBlocks.ANCIENT_SLAB.get().asItem())
        ;
    }

    private void appendWoodenStairs() {
        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(EBBlocks.ANCIENT_STAIRS.get().asItem())
        ;
    }

    private void appendWoodenFences() {
        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(EBBlocks.ANCIENT_FENCE.get().asItem())
        ;
    }

    private void appendWoodenFenceGates() {
        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(EBBlocks.ANCIENT_FENCE_GATE.get().asItem())
        ;
    }

    private void appendWoodenDoors() {
        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(EBBlocks.ANCIENT_DOOR.get().asItem())
        ;
    }

    private void appendWoodenTrapdoors() {
        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(EBBlocks.ANCIENT_TRAPDOOR.get().asItem())
        ;
    }

    private void appendDurabilityEnchantable() {
        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(EBItems.GAUNTLET.get().asItem())
        ;
    }

    private void appendMiningEnchantable() {
        getOrCreateTagBuilder(ItemTags.MINING_ENCHANTABLE)
                .add(EBItems.GAUNTLET.get().asItem())
        ;
    }
}
