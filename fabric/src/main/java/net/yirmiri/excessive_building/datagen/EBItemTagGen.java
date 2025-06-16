package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.yirmiri.excessive_building.core.registry.EBBlocks;

import java.util.concurrent.CompletableFuture;

public class EBItemTagGen extends FabricTagProvider.ItemTagProvider {
    public EBItemTagGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> future) {
        super(output, future);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        appendWalls();
    }

    private void appendWalls() {
        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(EBBlocks.ELYERIUM_WALL.get().asItem())
                .add(EBBlocks.POLISHED_ELYERIUM_WALL.get().asItem())
                .add(EBBlocks.ELYERIUM_BRICK_WALL.get().asItem())

                .add(EBBlocks.HECTALITE_WALL.get().asItem())
                .add(EBBlocks.POLISHED_HECTALITE_WALL.get().asItem())
                .add(EBBlocks.HECTALITE_BRICK_WALL.get().asItem())

                .add(EBBlocks.CHLOROSLATE_WALL.get().asItem())
                .add(EBBlocks.POLISHED_CHLOROSLATE_WALL.get().asItem())
                .add(EBBlocks.CHLOROSLATE_BRICK_WALL.get().asItem())

                .add(EBBlocks.AMETHYST_BRICK_WALL.get().asItem())
        ;
    }
}
