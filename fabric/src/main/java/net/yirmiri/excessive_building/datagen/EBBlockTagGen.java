package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.util.blockfamilycreator.BlockFamilyCreator;
import net.yirmiri.excessive_building.core.init.EBTags;
import net.yirmiri.excessive_building.core.registry.EBBlocks;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

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
        appendEnchantmentPowerProvider();
        appendMineableWithAxe();
        appendReplaceable();
        generateBlockFamilyBlockTags();
        appendSapling();
        appendFlowerPots();
        appendChairs();
        appendClimbable();
    }

    private void appendMineableWithMallet() {
        getOrCreateTagBuilder(EBTags.BlockT.MINEABLE_WITH_MALLET)
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
            getOrCreateTagBuilder(EBTags.BlockT.MINEABLE_WITH_MALLET)
                    .add(EBBlocks.getDyedFrostedGlass(colors.getId()).get())
            ;
        }
    }

    private void appendChairs() {
        getOrCreateTagBuilder(EBTags.BlockT.CHAIRS)

        ;

        for (DyeColor colors : DyeColor.values()) {
            getOrCreateTagBuilder(EBTags.BlockT.CHAIRS)
                    .add(EBBlocks.getDyedChairs(colors.getId()).get())
            ;
        }
    }

    private void appendEnchantmentPowerProvider() {
        getOrCreateTagBuilder(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                .add(EBBlocks.ALCHEMY_SHELF.get())
                .add(EBBlocks.ALCHEMY_SHELF_VARIANT1.get())
                .add(EBBlocks.ALCHEMY_SHELF_VARIANT2.get())
                .add(EBBlocks.ALCHEMY_SHELF_VARIANT3.get())
                .add(EBBlocks.ALCHEMY_SHELF_VARIANT4.get())
                .add(EBBlocks.ALCHEMY_SHELF_VARIANT5.get())

                .add(EBBlocks.BOOKSHELF_VARIANT1.get())
                .add(EBBlocks.BOOKSHELF_VARIANT2.get())
                .add(EBBlocks.BOOKSHELF_VARIANT3.get())
                .add(EBBlocks.BOOKSHELF_VARIANT4.get())
                .add(EBBlocks.BOOKSHELF_VARIANT5.get())
        ;
    }

    private void appendClimbable() {
        getOrCreateTagBuilder(BlockTags.CLIMBABLE)
                .add(EBBlocks.ANCIENT_VINES.get())
                .add(EBBlocks.ANCIENT_VINES_PLANT.get())
        ;
    }

    private void appendSapling() {
        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(EBBlocks.ANCIENT_SAPLING.get())
        ;
    }

    private void appendFlowerPots() {
        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(EBBlocks.POTTED_ANCIENT_SAPLING.get())
        ;
    }

    private void appendNeedsIronTool() {
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(EBBlocks.RADIANCE_ORE.get())
                .add(EBBlocks.DEEPSLATE_RADIANCE_ORE.get())
                .add(EBBlocks.RADIANCE_BLOCK.get())
        ;
    }

    private void appendMineableWithAxe() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE)
                .add(EBBlocks.ANCIENT_WOODSET.getBlock("ancient_stairs").get())
                .add(EBBlocks.ANCIENT_WOODSET.getBlock("ancient_slab").get())

                .add(EBBlocks.ALCHEMY_SHELF.get())
                .add(EBBlocks.ALCHEMY_SHELF_VARIANT1.get())
                .add(EBBlocks.ALCHEMY_SHELF_VARIANT2.get())
                .add(EBBlocks.ALCHEMY_SHELF_VARIANT3.get())
                .add(EBBlocks.ALCHEMY_SHELF_VARIANT4.get())
                .add(EBBlocks.ALCHEMY_SHELF_VARIANT5.get())

                .add(EBBlocks.BOOKSHELF_VARIANT1.get())
                .add(EBBlocks.BOOKSHELF_VARIANT2.get())
                .add(EBBlocks.BOOKSHELF_VARIANT3.get())
                .add(EBBlocks.BOOKSHELF_VARIANT4.get())
                .add(EBBlocks.BOOKSHELF_VARIANT5.get())
        ;
    }

    private void appendMineableWithPickaxe() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(EBBlocks.ZEUS_EPIC_BLOCK.get())
                .add(EBBlocks.ICE_PILLAR.get())

                .add(EBBlocks.PRISMARINE_CLUSTER.get())
                .add(EBBlocks.LARGE_PRISMARINE_BUD.get())
                .add(EBBlocks.SMALL_PRISMARINE_BUD.get())
                .add(EBBlocks.MEDIUM_PRISMARINE_BUD.get())

                .add(EBBlocks.POLISHED_PRISMARINE.get())
                .add(EBBlocks.POLISHED_PRISMARINE_STAIRS.get())
                .add(EBBlocks.POLISHED_PRISMARINE_SLAB.get())

                .add(EBBlocks.PRISMARINE_TILES.get())
                .add(EBBlocks.PRISMARINE_TILE_STAIRS.get())
                .add(EBBlocks.PRISMARINE_TILE_SLAB.get())

                .add(EBBlocks.POLISHED_DARK_PRISMARINE.get())
                .add(EBBlocks.POLISHED_DARK_PRISMARINE_STAIRS.get())
                .add(EBBlocks.POLISHED_DARK_PRISMARINE_SLAB.get())

                .add(EBBlocks.DARK_PRISMARINE_TILES.get())
                .add(EBBlocks.DARK_PRISMARINE_TILE_STAIRS.get())
                .add(EBBlocks.DARK_PRISMARINE_TILE_SLAB.get())

                .add(EBBlocks.DARK_PRISMARINE_TILES.get())
                .add(EBBlocks.DARK_PRISMARINE_TILE_STAIRS.get())
                .add(EBBlocks.DARK_PRISMARINE_TILE_SLAB.get())

                .add(EBBlocks.KILN.get())

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

    private void appendReplaceable() {
        getOrCreateTagBuilder(BlockTags.REPLACEABLE)
                .add(EBBlocks.ICE_PILLAR.get())
        ;
    }

    private void appendBeaconBaseBlocks() {
        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(EBBlocks.RADIANCE_BLOCK.get())
        ;
    }

    public void generateBlockFamilyBlockTags() {
        for (BlockFamilyCreator blockFamily : BlockFamilyCreator.BLOCK_FAMILIES.values()) {
            if (blockFamily.isOfMod(ExcessiveBuilding.MOD_ID)) {
                for (Supplier<Block> block : blockFamily.WALLS) {
                    getOrCreateTagBuilder(BlockTags.WALLS).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.STAIRS) {
                    getOrCreateTagBuilder(BlockTags.STAIRS).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.SLABS) {
                    getOrCreateTagBuilder(BlockTags.SLABS).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.WOODEN_SLABS) {
                    getOrCreateTagBuilder(BlockTags.SLABS).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.FENCES) {
                    getOrCreateTagBuilder(BlockTags.FENCES).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.WOODEN_FENCES) {
                    getOrCreateTagBuilder(BlockTags.WOODEN_FENCES).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.FENCE_GATES) {
                    getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.WOODEN_DOORS) {
                    getOrCreateTagBuilder(BlockTags.WOODEN_DOORS).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.DOORS) {
                    getOrCreateTagBuilder(BlockTags.DOORS).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.WOODEN_TRAPDOORS) {
                    getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.TRAPDOORS) {
                    getOrCreateTagBuilder(BlockTags.TRAPDOORS).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.WOODEN_PRESSURE_PLATES) {
                    getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.STONE_PRESSURE_PLATES) {
                    getOrCreateTagBuilder(BlockTags.STONE_PRESSURE_PLATES).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.PRESSURE_PLATES) {
                    getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.WOODEN_BUTTONS) {
                    getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.STONE_BUTTONS) {
                    getOrCreateTagBuilder(BlockTags.STONE_BUTTONS).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.PLANKS) {
                    getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.BUTTONS) {
                    getOrCreateTagBuilder(BlockTags.BUTTONS).add(block.get());
                }
                for (TagKey<Block> tag : blockFamily.FLAMMABLE_LOG_TAGS) {
                    String name = tag.location().getPath().replace("_logs", "");
                    getOrCreateTagBuilder(tag)
                            .add(blockFamily.getBlock(name + "_log").get())
                            .add(blockFamily.getBlock(name + "_wood").get())
                            .add(blockFamily.getBlock("stripped_" + name + "_log").get())
                            .add(blockFamily.getBlock("stripped_" + name + "_wood").get())
                    ;
                    getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN).addTag(tag);
                }
                for (TagKey<Block> tag : blockFamily.LOG_TAGS) {
                    String name = tag.location().getPath().replace("_logs", "");
                    getOrCreateTagBuilder(tag)
                            .add(blockFamily.getBlock(name + "_log").get())
                            .add(blockFamily.getBlock(name + "_wood").get())
                            .add(blockFamily.getBlock("stripped_" + name + "_log").get())
                            .add(blockFamily.getBlock("stripped_" + name + "_wood").get())
                    ;
                    getOrCreateTagBuilder(BlockTags.LOGS).addTag(tag);
                }
                for (Supplier<Block> block : blockFamily.OVERWORLD_NATURAL_LOGS) {
                    getOrCreateTagBuilder(BlockTags.OVERWORLD_NATURAL_LOGS).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.LEAVES) {
                    getOrCreateTagBuilder(BlockTags.LEAVES).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.FLOWERS) {
                    getOrCreateTagBuilder(BlockTags.FLOWERS).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.SAPLINGS) {
                    getOrCreateTagBuilder(BlockTags.SAPLINGS).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.FLOWER_POTS) {
                    getOrCreateTagBuilder(BlockTags.FLOWER_POTS).add(block.get());
                }


                for (Supplier<Block> block : blockFamily.PICKAXE_MINEABLE) {
                    getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.AXE_MINEABLE) {
                    getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.SHOVEL_MINEABLE) {
                    getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_SHOVEL).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.HOE_MINEABLE) {
                    getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_HOE).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.NEEDS_STONE_TOOL) {
                    getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.NEEDS_IRON_TOOL) {
                    getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL).add(block.get());
                }
                for (Supplier<Block> block : blockFamily.NEEDS_DIAMOND_TOOL) {
                    getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL).add(block.get());
                }
            }
        }
    }
}
