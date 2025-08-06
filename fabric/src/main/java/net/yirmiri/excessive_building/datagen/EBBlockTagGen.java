package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Blocks;
import net.yirmiri.excessive_building.core.init.EBTags;
import net.yirmiri.excessive_building.core.registry.EBBlocks;

import java.util.concurrent.CompletableFuture;

public class EBBlockTagGen extends FabricTagProvider.BlockTagProvider {
    public EBBlockTagGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> future) {
        super(output, future);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        appendMineableWithPickaxe();
        appendWalls();
        appendMineableWithMallet();
        appendNeedsIronTool();
        appendBeaconBaseBlocks();
    }

    private void appendMineableWithMallet() {
        getOrCreateTagBuilder(EBTags.Blocks.MINEABLE_WITH_MALLET)
                .add(EBBlocks.RADIANCE_FRAMED_GLASS.get())
                .add(EBBlocks.RADIANCE_FRAMED_GLASS_PANE.get())
                .add(Blocks.SEA_LANTERN)
                .add(Blocks.GLOWSTONE)
                .add(Blocks.REDSTONE_LAMP)
                .add(EBBlocks.AMETHYST_FRAMED_GLASS.get())
                .add(EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get())
                .add(EBBlocks.AMETHYST_LANTERN.get())
                .add(EBBlocks.RADIANCE_LANTERN.get())
                .add(Blocks.TINTED_GLASS)
                .add(Blocks.GLASS)
                .add(Blocks.GLASS_PANE)
                .add(Blocks.WHITE_STAINED_GLASS)
                .add(Blocks.WHITE_STAINED_GLASS_PANE)
                .add(Blocks.LIGHT_GRAY_STAINED_GLASS)
                .add(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)
                .add(Blocks.GRAY_STAINED_GLASS)
                .add(Blocks.GRAY_STAINED_GLASS_PANE)
                .add(Blocks.BROWN_STAINED_GLASS)
                .add(Blocks.BROWN_STAINED_GLASS_PANE)
                .add(Blocks.BLACK_STAINED_GLASS)
                .add(Blocks.BLACK_STAINED_GLASS_PANE)
                .add(Blocks.RED_STAINED_GLASS)
                .add(Blocks.RED_STAINED_GLASS_PANE)
                .add(Blocks.ORANGE_STAINED_GLASS)
                .add(Blocks.ORANGE_STAINED_GLASS_PANE)
                .add(Blocks.YELLOW_STAINED_GLASS)
                .add(Blocks.YELLOW_STAINED_GLASS_PANE)
                .add(Blocks.LIME_STAINED_GLASS)
                .add(Blocks.LIME_STAINED_GLASS_PANE)
                .add(Blocks.GREEN_STAINED_GLASS)
                .add(Blocks.GREEN_STAINED_GLASS_PANE)
                .add(Blocks.CYAN_STAINED_GLASS)
                .add(Blocks.CYAN_STAINED_GLASS_PANE)
                .add(Blocks.LIGHT_BLUE_STAINED_GLASS)
                .add(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)
                .add(Blocks.BLUE_STAINED_GLASS)
                .add(Blocks.BLUE_STAINED_GLASS_PANE)
                .add(Blocks.PURPLE_STAINED_GLASS)
                .add(Blocks.PURPLE_STAINED_GLASS_PANE)
                .add(Blocks.MAGENTA_STAINED_GLASS)
                .add(Blocks.MAGENTA_STAINED_GLASS_PANE)
                .add(Blocks.PINK_STAINED_GLASS)
                .add(Blocks.PINK_STAINED_GLASS_PANE)
                .add(Blocks.ICE)
                .add(Blocks.BLUE_ICE)
                .add(Blocks.FROSTED_ICE)
                .add(Blocks.PACKED_ICE)
                .add(EBBlocks.FROSTED_GLASS.get())
        ;

        for (DyeColor colors : DyeColor.values()) {
            getOrCreateTagBuilder(EBTags.Blocks.MINEABLE_WITH_MALLET)
                    .add(EBBlocks.getDyedFrostedGlass(colors.getId()).get())
            ;
        }
    }

    private void appendNeedsIronTool() {
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(EBBlocks.RADIANCE_ORE.get())
                .add(EBBlocks.DEEPSLATE_RADIANCE_ORE.get())
                .add(EBBlocks.RADIANCE_BLOCK.get())
        ;
    }

    private void appendMineableWithPickaxe() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(EBBlocks.ELYERIUM_PILLAR.get())
                .add(EBBlocks.HECTALITE_PILLAR.get())
                .add(EBBlocks.CHLOROSLATE_PILLAR.get())
                .add(EBBlocks.ARIDITE_PILLAR.get())

                .add(EBBlocks.ELYERIUM.get())
                .add(EBBlocks.ELYERIUM_STAIRS.get())
                .add(EBBlocks.ELYERIUM_SLAB.get())
                .add(EBBlocks.ELYERIUM_WALL.get())
                .add(EBBlocks.POLISHED_ELYERIUM.get())
                .add(EBBlocks.POLISHED_ELYERIUM_STAIRS.get())
                .add(EBBlocks.POLISHED_ELYERIUM_SLAB.get())
                .add(EBBlocks.POLISHED_ELYERIUM_WALL.get())
                .add(EBBlocks.ELYERIUM_BRICKS.get())
                .add(EBBlocks.ELYERIUM_BRICK_STAIRS.get())
                .add(EBBlocks.ELYERIUM_BRICK_SLAB.get())
                .add(EBBlocks.ELYERIUM_BRICK_WALL.get())
                .add(EBBlocks.CHISELED_ELYERIUM.get())

                .add(EBBlocks.CHLOROSLATE.get())
                .add(EBBlocks.CHLOROSLATE_STAIRS.get())
                .add(EBBlocks.CHLOROSLATE_SLAB.get())
                .add(EBBlocks.CHLOROSLATE_WALL.get())
                .add(EBBlocks.POLISHED_CHLOROSLATE.get())
                .add(EBBlocks.POLISHED_CHLOROSLATE_STAIRS.get())
                .add(EBBlocks.POLISHED_CHLOROSLATE_SLAB.get())
                .add(EBBlocks.POLISHED_CHLOROSLATE_WALL.get())
                .add(EBBlocks.CHLOROSLATE_BRICKS.get())
                .add(EBBlocks.CHLOROSLATE_BRICK_STAIRS.get())
                .add(EBBlocks.CHLOROSLATE_BRICK_SLAB.get())
                .add(EBBlocks.CHLOROSLATE_BRICK_WALL.get())
                .add(EBBlocks.CHISELED_CHLOROSLATE.get())

                .add(EBBlocks.HECTALITE.get())
                .add(EBBlocks.HECTALITE_STAIRS.get())
                .add(EBBlocks.HECTALITE_SLAB.get())
                .add(EBBlocks.HECTALITE_WALL.get())
                .add(EBBlocks.POLISHED_HECTALITE.get())
                .add(EBBlocks.POLISHED_HECTALITE_STAIRS.get())
                .add(EBBlocks.POLISHED_HECTALITE_SLAB.get())
                .add(EBBlocks.POLISHED_HECTALITE_WALL.get())
                .add(EBBlocks.HECTALITE_BRICKS.get())
                .add(EBBlocks.HECTALITE_BRICK_STAIRS.get())
                .add(EBBlocks.HECTALITE_BRICK_SLAB.get())
                .add(EBBlocks.HECTALITE_BRICK_WALL.get())
                .add(EBBlocks.CHISELED_HECTALITE.get())

                .add(EBBlocks.ARIDITE.get())
                .add(EBBlocks.ARIDITE_STAIRS.get())
                .add(EBBlocks.ARIDITE_SLAB.get())
                .add(EBBlocks.ARIDITE_WALL.get())
                .add(EBBlocks.POLISHED_ARIDITE.get())
                .add(EBBlocks.POLISHED_ARIDITE_STAIRS.get())
                .add(EBBlocks.POLISHED_ARIDITE_SLAB.get())
                .add(EBBlocks.POLISHED_ARIDITE_WALL.get())
                .add(EBBlocks.ARIDITE_BRICKS.get())
                .add(EBBlocks.ARIDITE_BRICK_STAIRS.get())
                .add(EBBlocks.ARIDITE_BRICK_SLAB.get())
                .add(EBBlocks.ARIDITE_BRICK_WALL.get())
                .add(EBBlocks.CHISELED_ARIDITE.get())

                .add(EBBlocks.AMETHYST_BRICKS.get())
                .add(EBBlocks.AMETHYST_BRICK_STAIRS.get())
                .add(EBBlocks.AMETHYST_BRICK_SLAB.get())
                .add(EBBlocks.AMETHYST_BRICK_WALL.get())

                .add(EBBlocks.RADIANCE_BLOCK.get())
                .add(EBBlocks.RADIANCE_ORE.get())
                .add(EBBlocks.DEEPSLATE_RADIANCE_ORE.get())

                .add(EBBlocks.CRACKED_COBBLESTONE_BRICKS.get())
                .add(EBBlocks.COBBLESTONE_BRICKS.get())
                .add(EBBlocks.COBBLESTONE_BRICK_STAIRS.get())
                .add(EBBlocks.COBBLESTONE_BRICK_SLAB.get())
                .add(EBBlocks.COBBLESTONE_BRICK_WALL.get())

                .add(EBBlocks.ANDESITE_BRICKS.get())
                .add(EBBlocks.ANDESITE_BRICK_STAIRS.get())
                .add(EBBlocks.ANDESITE_BRICK_SLAB.get())
                .add(EBBlocks.ANDESITE_BRICK_WALL.get())

                .add(EBBlocks.GRANITE_BRICKS.get())
                .add(EBBlocks.GRANITE_BRICK_STAIRS.get())
                .add(EBBlocks.GRANITE_BRICK_SLAB.get())
                .add(EBBlocks.GRANITE_BRICK_WALL.get())

                .add(EBBlocks.ANDESITE_BRICKS.get())
                .add(EBBlocks.ANDESITE_BRICK_STAIRS.get())
                .add(EBBlocks.ANDESITE_BRICK_SLAB.get())
                .add(EBBlocks.ANDESITE_BRICK_WALL.get())
        ;
    }

    private void appendWalls() {
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(EBBlocks.ELYERIUM_WALL.get())
                .add(EBBlocks.POLISHED_ELYERIUM_WALL.get())
                .add(EBBlocks.ELYERIUM_BRICK_WALL.get())

                .add(EBBlocks.HECTALITE_WALL.get())
                .add(EBBlocks.POLISHED_HECTALITE_WALL.get())
                .add(EBBlocks.HECTALITE_BRICK_WALL.get())

                .add(EBBlocks.ARIDITE_WALL.get())
                .add(EBBlocks.POLISHED_ARIDITE_WALL.get())
                .add(EBBlocks.ARIDITE_BRICK_WALL.get())

                .add(EBBlocks.CHLOROSLATE_WALL.get())
                .add(EBBlocks.POLISHED_CHLOROSLATE_WALL.get())
                .add(EBBlocks.CHLOROSLATE_BRICK_WALL.get())

                .add(EBBlocks.AMETHYST_BRICK_WALL.get())

                .add(EBBlocks.COBBLESTONE_BRICK_WALL.get())
                .add(EBBlocks.GRANITE_BRICK_WALL.get())
                .add(EBBlocks.DIORITE_BRICK_WALL.get())
                .add(EBBlocks.ANDESITE_BRICK_WALL.get())
        ;
    }

    private void appendBeaconBaseBlocks() {
        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(EBBlocks.RADIANCE_BLOCK.get())
        ;
    }
}
