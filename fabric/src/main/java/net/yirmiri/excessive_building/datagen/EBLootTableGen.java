package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.world.item.DyeColor;
import net.yirmiri.excessive_building.core.registry.EBBlocks;
import net.yirmiri.excessive_building.core.registry.EBItems;

public class EBLootTableGen extends FabricBlockLootTableProvider {
    public EBLootTableGen(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        dropSelf(EBBlocks.ELYERIUM.get());
        dropSelf(EBBlocks.ELYERIUM_STAIRS.get());
        add(EBBlocks.ELYERIUM_SLAB.get(), createSlabItemTable(EBBlocks.ELYERIUM_SLAB.get()));
        dropSelf(EBBlocks.ELYERIUM_WALL.get());

        dropSelf(EBBlocks.POLISHED_ELYERIUM.get());
        dropSelf(EBBlocks.POLISHED_ELYERIUM_STAIRS.get());
        add(EBBlocks.POLISHED_ELYERIUM_SLAB.get(), createSlabItemTable(EBBlocks.POLISHED_ELYERIUM_SLAB.get()));
        dropSelf(EBBlocks.POLISHED_ELYERIUM_WALL.get());

        dropSelf(EBBlocks.ELYERIUM_BRICKS.get());
        dropSelf(EBBlocks.ELYERIUM_BRICK_STAIRS.get());
        add(EBBlocks.ELYERIUM_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.ELYERIUM_BRICK_SLAB.get()));
        dropSelf(EBBlocks.ELYERIUM_BRICK_WALL.get());

        dropSelf(EBBlocks.CHISELED_ELYERIUM.get());

        dropSelf(EBBlocks.HECTALITE.get());
        dropSelf(EBBlocks.HECTALITE_STAIRS.get());
        add(EBBlocks.HECTALITE_SLAB.get(), createSlabItemTable(EBBlocks.HECTALITE_SLAB.get()));
        dropSelf(EBBlocks.HECTALITE_WALL.get());

        dropSelf(EBBlocks.POLISHED_HECTALITE.get());
        dropSelf(EBBlocks.POLISHED_HECTALITE_STAIRS.get());
        add(EBBlocks.POLISHED_HECTALITE_SLAB.get(), createSlabItemTable(EBBlocks.POLISHED_HECTALITE_SLAB.get()));
        dropSelf(EBBlocks.POLISHED_HECTALITE_WALL.get());

        dropSelf(EBBlocks.HECTALITE_BRICKS.get());
        dropSelf(EBBlocks.HECTALITE_BRICK_STAIRS.get());
        add(EBBlocks.HECTALITE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.HECTALITE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.HECTALITE_BRICK_WALL.get());

        dropSelf(EBBlocks.CHISELED_HECTALITE.get());

        dropSelf(EBBlocks.AMETHYST_BRICKS.get());
        dropSelf(EBBlocks.AMETHYST_BRICK_STAIRS.get());
        add(EBBlocks.AMETHYST_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.AMETHYST_BRICK_SLAB.get()));
        dropSelf(EBBlocks.AMETHYST_BRICK_WALL.get());

        addDyedFrostedGlassDrops();
        dropSelf(EBBlocks.FROSTED_GLASS.get());

        dropSelf(EBBlocks.CHLOROSLATE.get());
        dropSelf(EBBlocks.CHLOROSLATE_STAIRS.get());
        add(EBBlocks.CHLOROSLATE_SLAB.get(), createSlabItemTable(EBBlocks.CHLOROSLATE_SLAB.get()));
        dropSelf(EBBlocks.CHLOROSLATE_WALL.get());

        dropSelf(EBBlocks.POLISHED_CHLOROSLATE.get());
        dropSelf(EBBlocks.POLISHED_CHLOROSLATE_STAIRS.get());
        add(EBBlocks.POLISHED_CHLOROSLATE_SLAB.get(), createSlabItemTable(EBBlocks.POLISHED_CHLOROSLATE_SLAB.get()));
        dropSelf(EBBlocks.POLISHED_CHLOROSLATE_WALL.get());

        dropSelf(EBBlocks.CHLOROSLATE_BRICKS.get());
        dropSelf(EBBlocks.CHLOROSLATE_BRICK_STAIRS.get());
        add(EBBlocks.CHLOROSLATE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.CHLOROSLATE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.CHLOROSLATE_BRICK_WALL.get());

        dropSelf(EBBlocks.CHISELED_CHLOROSLATE.get());

        dropSelf(EBBlocks.RADIANCE_BLOCK.get());
        createOreDrop(EBBlocks.RADIANCE_ORE.get(), EBItems.RADIANCE_CRYSTAL.get());
        createOreDrop(EBBlocks.DEEPSLATE_RADIANCE_ORE.get(), EBItems.RADIANCE_CRYSTAL.get());

        dropSelf(EBBlocks.ARIDITE.get());
        dropSelf(EBBlocks.ARIDITE_STAIRS.get());
        add(EBBlocks.ARIDITE_SLAB.get(), createSlabItemTable(EBBlocks.ARIDITE_SLAB.get()));
        dropSelf(EBBlocks.ARIDITE_WALL.get());

        dropSelf(EBBlocks.POLISHED_ARIDITE.get());
        dropSelf(EBBlocks.POLISHED_ARIDITE_STAIRS.get());
        add(EBBlocks.POLISHED_ARIDITE_SLAB.get(), createSlabItemTable(EBBlocks.POLISHED_ARIDITE_SLAB.get()));
        dropSelf(EBBlocks.POLISHED_ARIDITE_WALL.get());

        dropSelf(EBBlocks.ARIDITE_BRICKS.get());
        dropSelf(EBBlocks.ARIDITE_BRICK_STAIRS.get());
        add(EBBlocks.ARIDITE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.ARIDITE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.ARIDITE_BRICK_WALL.get());

        dropSelf(EBBlocks.CHISELED_ARIDITE.get());

        dropSelf(EBBlocks.HECTALITE_PILLAR.get());
        dropSelf(EBBlocks.CHLOROSLATE_PILLAR.get());
        dropSelf(EBBlocks.ARIDITE_PILLAR.get());
        dropSelf(EBBlocks.ELYERIUM_PILLAR.get());

        dropSelf(EBBlocks.CRACKED_COBBLESTONE_BRICKS.get());
        
        dropSelf(EBBlocks.COBBLESTONE_BRICKS.get());
        dropSelf(EBBlocks.COBBLESTONE_BRICK_STAIRS.get());
        add(EBBlocks.COBBLESTONE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.COBBLESTONE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.COBBLESTONE_BRICK_WALL.get());

        dropSelf(EBBlocks.DIORITE_BRICKS.get());
        dropSelf(EBBlocks.DIORITE_BRICK_STAIRS.get());
        add(EBBlocks.DIORITE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.DIORITE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.DIORITE_BRICK_WALL.get());

        dropSelf(EBBlocks.GRANITE_BRICKS.get());
        dropSelf(EBBlocks.GRANITE_BRICK_STAIRS.get());
        add(EBBlocks.GRANITE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.GRANITE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.GRANITE_BRICK_WALL.get());

        dropSelf(EBBlocks.ANDESITE_BRICKS.get());
        dropSelf(EBBlocks.ANDESITE_BRICK_STAIRS.get());
        add(EBBlocks.ANDESITE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.ANDESITE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.ANDESITE_BRICK_WALL.get());

        dropOther(EBBlocks.RADIANCE_ORE.get(), EBItems.RADIANCE_CRYSTAL.get());
        dropOther(EBBlocks.DEEPSLATE_RADIANCE_ORE.get(), EBItems.RADIANCE_CRYSTAL.get());

        dropSelf(EBBlocks.AMETHYST_LANTERN.get());
        add(EBBlocks.AMETHYST_FRAMED_GLASS.get(), createSilkTouchOnlyTable(EBBlocks.AMETHYST_FRAMED_GLASS.get()));
        add(EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get(), createSilkTouchOnlyTable(EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get()));

        dropSelf(EBBlocks.RADIANCE_LANTERN.get());
        add(EBBlocks.RADIANCE_FRAMED_GLASS.get(), createSilkTouchOnlyTable(EBBlocks.RADIANCE_FRAMED_GLASS.get()));
        add(EBBlocks.RADIANCE_FRAMED_GLASS_PANE.get(), createSilkTouchOnlyTable(EBBlocks.RADIANCE_FRAMED_GLASS_PANE.get()));

        dropSelf(EBBlocks.KILN.get());
    }

    private void addDyedFrostedGlassDrops() {
        for (DyeColor colors : DyeColor.values()) {
            dropSelf(EBBlocks.getDyedFrostedGlass(colors.getId()).get());
        }
    }
}
