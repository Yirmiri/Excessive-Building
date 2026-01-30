package net.yirmiri.excessive_building.datagen;

import net.azurune.runiclib.RunicLib;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.yirmiri.excessive_building.common.util.EBIntegrationIds;
import net.yirmiri.excessive_building.core.init.EBTags;
import net.yirmiri.excessive_building.core.registry.EBBlocks;

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
    }

    private void appendWalls() {
        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(EBBlocks.COBBLESTONE_BRICK_WALL.get().asItem())
                .add(EBBlocks.CORALSOIL_BRICK_WALL.get().asItem())
                .add(EBBlocks.LAVENDER_BRICK_WALL.get().asItem())
                .add(EBBlocks.CONGLOMERATE_WALL.get().asItem())
                .add(EBBlocks.CONGLOMERATE_BRICK_WALL.get().asItem())
        ;
    }

    private void appendSmallFlowers() {
        getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS)
                .add(EBBlocks.LAVENDER.get().asItem())
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
}
