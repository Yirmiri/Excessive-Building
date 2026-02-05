package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.RLServices;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.yirmiri.excessive_building.ExcessiveBuilding;

import java.util.function.Supplier;

public class EBCreativeTabs {
    public static final Supplier<CreativeModeTab> EXCESSIVE_BUILDING = RLServices.REGISTRY.registerCreativeModeTab(
            ExcessiveBuilding.MOD_ID, "excessive_building", () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("itemgroup.excessive_building"))
                    .icon(() -> new ItemStack(EBItems.GAUNTLET.get()))
                    .displayItems((displayParameters, entry) -> {
                        //TOOLS
                        entry.accept(EBItems.GAUNTLET.get());

                        //ANCIENT
                        entry.accept(EBBlocks.ANCIENT_LOG.get());
                        entry.accept(EBBlocks.ANCIENT_WOOD.get());
                        entry.accept(EBBlocks.STRIPPED_ANCIENT_LOG.get());
                        entry.accept(EBBlocks.STRIPPED_ANCIENT_WOOD.get());
                        entry.accept(EBBlocks.ANCIENT_PLANKS.get());
                        entry.accept(EBBlocks.ANCIENT_STAIRS.get());
                        entry.accept(EBBlocks.ANCIENT_SLAB.get());
                        entry.accept(EBBlocks.ANCIENT_FENCE.get());
                        entry.accept(EBBlocks.ANCIENT_FENCE_GATE.get());
                        entry.accept(EBBlocks.ANCIENT_PRESSURE_PLATE.get());
                        entry.accept(EBBlocks.ANCIENT_BUTTON.get());
                        entry.accept(EBBlocks.ANCIENT_DOOR.get());
                        entry.accept(EBBlocks.ANCIENT_TRAPDOOR.get());
                        entry.accept(EBItems.ANCIENT_SIGN.get());
                        entry.accept(EBItems.ANCIENT_HANGING_SIGN.get());
                        entry.accept(EBItems.ANCIENT_BOAT.get());
                        entry.accept(EBItems.ANCIENT_CHEST_BOAT.get());
                        entry.accept(EBBlocks.ANCIENT_LEAVES.get());
                        entry.accept(EBBlocks.ANCIENT_SAPLING.get());
                        entry.accept(EBBlocks.ANCIENT_VINES.get());
                        entry.accept(EBItems.ANCIENT_FRUIT.get());

                        //STONES
                        entry.accept(EBBlocks.ARIDITE.get());
                        entry.accept(EBBlocks.ARIDITE_STAIRS.get());
                        entry.accept(EBBlocks.ARIDITE_SLAB.get());
                        entry.accept(EBBlocks.ARIDITE_WALL.get());
                        entry.accept(EBBlocks.POLISHED_ARIDITE.get());
                        entry.accept(EBBlocks.POLISHED_ARIDITE_STAIRS.get());
                        entry.accept(EBBlocks.POLISHED_ARIDITE_SLAB.get());
                        entry.accept(EBBlocks.POLISHED_ARIDITE_WALL.get());
                        entry.accept(EBBlocks.ARIDITE_BRICKS.get());
                        entry.accept(EBBlocks.ARIDITE_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.ARIDITE_BRICK_SLAB.get());
                        entry.accept(EBBlocks.ARIDITE_BRICK_WALL.get());
                        entry.accept(EBBlocks.CHISELED_ARIDITE.get());
                        entry.accept(EBBlocks.ARIDITE_PILLAR.get());

                        entry.accept(EBBlocks.CHLOROSLATE.get());
                        entry.accept(EBBlocks.CHLOROSLATE_STAIRS.get());
                        entry.accept(EBBlocks.CHLOROSLATE_SLAB.get());
                        entry.accept(EBBlocks.CHLOROSLATE_WALL.get());
                        entry.accept(EBBlocks.POLISHED_CHLOROSLATE.get());
                        entry.accept(EBBlocks.POLISHED_CHLOROSLATE_STAIRS.get());
                        entry.accept(EBBlocks.POLISHED_CHLOROSLATE_SLAB.get());
                        entry.accept(EBBlocks.POLISHED_CHLOROSLATE_WALL.get());
                        entry.accept(EBBlocks.CHLOROSLATE_BRICKS.get());
                        entry.accept(EBBlocks.CHLOROSLATE_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.CHLOROSLATE_BRICK_SLAB.get());
                        entry.accept(EBBlocks.CHLOROSLATE_BRICK_WALL.get());
                        entry.accept(EBBlocks.CHISELED_CHLOROSLATE.get());
                        entry.accept(EBBlocks.CHLOROSLATE_PILLAR.get());

                        entry.accept(EBBlocks.HECTALITE.get());
                        entry.accept(EBBlocks.HECTALITE_STAIRS.get());
                        entry.accept(EBBlocks.HECTALITE_SLAB.get());
                        entry.accept(EBBlocks.HECTALITE_WALL.get());
                        entry.accept(EBBlocks.POLISHED_HECTALITE.get());
                        entry.accept(EBBlocks.POLISHED_HECTALITE_STAIRS.get());
                        entry.accept(EBBlocks.POLISHED_HECTALITE_SLAB.get());
                        entry.accept(EBBlocks.POLISHED_HECTALITE_WALL.get());
                        entry.accept(EBBlocks.HECTALITE_BRICKS.get());
                        entry.accept(EBBlocks.HECTALITE_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.HECTALITE_BRICK_SLAB.get());
                        entry.accept(EBBlocks.HECTALITE_BRICK_WALL.get());
                        entry.accept(EBBlocks.CHISELED_HECTALITE.get());
                        entry.accept(EBBlocks.HECTALITE_PILLAR.get());

                        //CONGLOMERATE
                        entry.accept(EBBlocks.PEBBLESTONE.get());

                        entry.accept(EBBlocks.CONGLOMERATE.get());
                        entry.accept(EBBlocks.CONGLOMERATE_STAIRS.get());
                        entry.accept(EBBlocks.CONGLOMERATE_SLAB.get());
                        entry.accept(EBBlocks.CONGLOMERATE_WALL.get());

                        entry.accept(EBBlocks.CONGLOMERATE_BRICKS.get());
                        entry.accept(EBBlocks.CONGLOMERATE_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.CONGLOMERATE_BRICK_SLAB.get());
                        entry.accept(EBBlocks.CONGLOMERATE_BRICK_WALL.get());

                        //SITRITE
                        entry.accept(EBBlocks.SITRITE.get());
                        entry.accept(EBBlocks.SITRITE_STAIRS.get());
                        entry.accept(EBBlocks.SITRITE_SLAB.get());
                        entry.accept(EBBlocks.SITRITE_WALL.get());

                        entry.accept(EBBlocks.POLISHED_SITRITE.get());
                        entry.accept(EBBlocks.POLISHED_SITRITE_STAIRS.get());
                        entry.accept(EBBlocks.POLISHED_SITRITE_SLAB.get());

                        entry.accept(EBBlocks.SITRITE_BRICKS.get());
                        entry.accept(EBBlocks.SITRITE_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.SITRITE_BRICK_SLAB.get());
                        entry.accept(EBBlocks.SITRITE_BRICK_WALL.get());

                        entry.accept(EBBlocks.SITRITE_TILES.get());
                        entry.accept(EBBlocks.SITRITE_TILE_STAIRS.get());
                        entry.accept(EBBlocks.SITRITE_TILE_SLAB.get());

                        entry.accept(EBBlocks.CHISELED_SITRITE.get());
                        entry.accept(EBBlocks.SITRITE_PILLAR.get());

                        //BRIMSTONE
                        entry.accept(EBBlocks.BRIMSTONE.get());
                        entry.accept(EBBlocks.BRIMSTONE_STAIRS.get());
                        entry.accept(EBBlocks.BRIMSTONE_SLAB.get());
                        entry.accept(EBBlocks.BRIMSTONE_WALL.get());

                        entry.accept(EBBlocks.POLISHED_BRIMSTONE.get());
                        entry.accept(EBBlocks.POLISHED_BRIMSTONE_STAIRS.get());
                        entry.accept(EBBlocks.POLISHED_BRIMSTONE_SLAB.get());

                        entry.accept(EBBlocks.BRIMSTONE_BRICKS.get());
                        entry.accept(EBBlocks.BRIMSTONE_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.BRIMSTONE_BRICK_SLAB.get());
                        entry.accept(EBBlocks.BRIMSTONE_BRICK_WALL.get());

                        entry.accept(EBBlocks.BRIMSTONE_TILES.get());
                        entry.accept(EBBlocks.BRIMSTONE_TILE_STAIRS.get());
                        entry.accept(EBBlocks.BRIMSTONE_TILE_SLAB.get());

                        entry.accept(EBBlocks.BRIMSTONE_PILLAR.get());
                        entry.accept(EBBlocks.BRIMSTONE_LAMP.get());

                        //CORALSOIL
                        entry.accept(EBBlocks.CORALSOIL.get());
                        entry.accept(EBBlocks.CORALSOIL_BRICKS.get());
                        entry.accept(EBBlocks.CORALSOIL_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.CORALSOIL_BRICK_SLAB.get());
                        entry.accept(EBBlocks.CORALSOIL_BRICK_WALL.get());

                        //SAGE
                        entry.accept(EBBlocks.SAGE.get());
                        entry.accept(EBBlocks.SAGE_BLOCK.get());
                        entry.accept(EBBlocks.SAGE_CLAY.get());
                        entry.accept(EBBlocks.SAGE_BRICKS.get());
                        entry.accept(EBBlocks.MOSSY_SAGE_BRICKS.get());
                        entry.accept(EBBlocks.SAGE_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.SAGE_BRICK_SLAB.get());
                        entry.accept(EBBlocks.SAGE_BRICK_WALL.get());

                        //LAVENDER
                        entry.accept(EBBlocks.LAVENDER.get());
                        entry.accept(EBBlocks.LAVENDER_BLOCK.get());
                        entry.accept(EBBlocks.LAVENDER_CLAY.get());
                        entry.accept(EBBlocks.LAVENDER_BRICKS.get());
                        entry.accept(EBBlocks.MOSSY_LAVENDER_BRICKS.get());
                        entry.accept(EBBlocks.LAVENDER_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.LAVENDER_BRICK_SLAB.get());
                        entry.accept(EBBlocks.LAVENDER_BRICK_WALL.get());

                        //CORRUGATED IRON
                        entry.accept(EBBlocks.getDyedCorrugatedIron(DyeColor.WHITE.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronStairs(DyeColor.WHITE.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronSlab(DyeColor.WHITE.getId()).get());

                        entry.accept(EBBlocks.getDyedCorrugatedIron(DyeColor.LIGHT_GRAY.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronStairs(DyeColor.LIGHT_GRAY.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronSlab(DyeColor.LIGHT_GRAY.getId()).get());

                        entry.accept(EBBlocks.getDyedCorrugatedIron(DyeColor.GRAY.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronStairs(DyeColor.GRAY.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronSlab(DyeColor.GRAY.getId()).get());

                        entry.accept(EBBlocks.getDyedCorrugatedIron(DyeColor.BLACK.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronStairs(DyeColor.BLACK.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronSlab(DyeColor.BLACK.getId()).get());

                        entry.accept(EBBlocks.getDyedCorrugatedIron(DyeColor.BROWN.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronStairs(DyeColor.BROWN.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronSlab(DyeColor.BROWN.getId()).get());

                        entry.accept(EBBlocks.getDyedCorrugatedIron(DyeColor.RED.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronStairs(DyeColor.RED.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronSlab(DyeColor.RED.getId()).get());

                        entry.accept(EBBlocks.getDyedCorrugatedIron(DyeColor.ORANGE.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronStairs(DyeColor.ORANGE.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronSlab(DyeColor.ORANGE.getId()).get());

                        entry.accept(EBBlocks.getDyedCorrugatedIron(DyeColor.YELLOW.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronStairs(DyeColor.YELLOW.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronSlab(DyeColor.YELLOW.getId()).get());

                        entry.accept(EBBlocks.getDyedCorrugatedIron(DyeColor.LIME.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronStairs(DyeColor.LIME.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronSlab(DyeColor.LIME.getId()).get());

                        entry.accept(EBBlocks.getDyedCorrugatedIron(DyeColor.GREEN.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronStairs(DyeColor.GREEN.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronSlab(DyeColor.GREEN.getId()).get());

                        entry.accept(EBBlocks.getDyedCorrugatedIron(DyeColor.CYAN.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronStairs(DyeColor.CYAN.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronSlab(DyeColor.CYAN.getId()).get());

                        entry.accept(EBBlocks.getDyedCorrugatedIron(DyeColor.LIGHT_BLUE.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronStairs(DyeColor.LIGHT_BLUE.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronSlab(DyeColor.LIGHT_BLUE.getId()).get());

                        entry.accept(EBBlocks.getDyedCorrugatedIron(DyeColor.BLUE.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronStairs(DyeColor.BLUE.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronSlab(DyeColor.BLUE.getId()).get());

                        entry.accept(EBBlocks.getDyedCorrugatedIron(DyeColor.PURPLE.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronStairs(DyeColor.PURPLE.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronSlab(DyeColor.PURPLE.getId()).get());

                        entry.accept(EBBlocks.getDyedCorrugatedIron(DyeColor.MAGENTA.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronStairs(DyeColor.MAGENTA.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronSlab(DyeColor.MAGENTA.getId()).get());

                        entry.accept(EBBlocks.getDyedCorrugatedIron(DyeColor.PINK.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronStairs(DyeColor.PINK.getId()).get());
                        entry.accept(EBBlocks.getDyedCorrugatedIronSlab(DyeColor.PINK.getId()).get());

                        //FROSTED GLASS
                        entry.accept(EBBlocks.FROSTED_GLASS.get());
                        entry.accept(EBBlocks.getDyedFrostedGlass(DyeColor.WHITE.getId()).get());
                        entry.accept(EBBlocks.getDyedFrostedGlass(DyeColor.LIGHT_GRAY.getId()).get());
                        entry.accept(EBBlocks.getDyedFrostedGlass(DyeColor.GRAY.getId()).get());
                        entry.accept(EBBlocks.getDyedFrostedGlass(DyeColor.BLACK.getId()).get());
                        entry.accept(EBBlocks.getDyedFrostedGlass(DyeColor.BROWN.getId()).get());
                        entry.accept(EBBlocks.getDyedFrostedGlass(DyeColor.RED.getId()).get());
                        entry.accept(EBBlocks.getDyedFrostedGlass(DyeColor.ORANGE.getId()).get());
                        entry.accept(EBBlocks.getDyedFrostedGlass(DyeColor.YELLOW.getId()).get());
                        entry.accept(EBBlocks.getDyedFrostedGlass(DyeColor.LIME.getId()).get());
                        entry.accept(EBBlocks.getDyedFrostedGlass(DyeColor.GREEN.getId()).get());
                        entry.accept(EBBlocks.getDyedFrostedGlass(DyeColor.CYAN.getId()).get());
                        entry.accept(EBBlocks.getDyedFrostedGlass(DyeColor.LIGHT_BLUE.getId()).get());
                        entry.accept(EBBlocks.getDyedFrostedGlass(DyeColor.BLUE.getId()).get());
                        entry.accept(EBBlocks.getDyedFrostedGlass(DyeColor.PURPLE.getId()).get());
                        entry.accept(EBBlocks.getDyedFrostedGlass(DyeColor.MAGENTA.getId()).get());
                        entry.accept(EBBlocks.getDyedFrostedGlass(DyeColor.PINK.getId()).get());

                        //VANILLA BLOCK VARIANTS
                        entry.accept(EBBlocks.COBBLESTONE_BRICKS.get());
                        entry.accept(EBBlocks.CRACKED_COBBLESTONE_BRICKS.get());
                        entry.accept(EBBlocks.COBBLESTONE_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.COBBLESTONE_BRICK_SLAB.get());
                        entry.accept(EBBlocks.COBBLESTONE_BRICK_WALL.get());

                        entry.accept(EBBlocks.GRANITE_BRICKS.get());
                        entry.accept(EBBlocks.GRANITE_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.GRANITE_BRICK_SLAB.get());
                        entry.accept(EBBlocks.GRANITE_BRICK_WALL.get());

                        entry.accept(EBBlocks.DIORITE_BRICKS.get());
                        entry.accept(EBBlocks.DIORITE_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.DIORITE_BRICK_SLAB.get());
                        entry.accept(EBBlocks.DIORITE_BRICK_WALL.get());

                        entry.accept(EBBlocks.ANDESITE_BRICKS.get());
                        entry.accept(EBBlocks.ANDESITE_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.ANDESITE_BRICK_SLAB.get());
                        entry.accept(EBBlocks.ANDESITE_BRICK_WALL.get());

                        entry.accept(EBBlocks.COPPER_BRICKS.get());
                        entry.accept(EBBlocks.COPPER_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.COPPER_BRICK_SLAB.get());

                        entry.accept(EBBlocks.EXPOSED_COPPER_BRICKS.get());
                        entry.accept(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.EXPOSED_COPPER_BRICK_SLAB.get());

                        entry.accept(EBBlocks.WEATHERED_COPPER_BRICKS.get());
                        entry.accept(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.WEATHERED_COPPER_BRICK_SLAB.get());

                        entry.accept(EBBlocks.OXIDIZED_COPPER_BRICKS.get());
                        entry.accept(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB.get());

                        entry.accept(EBBlocks.WAXED_COPPER_BRICKS.get());
                        entry.accept(EBBlocks.WAXED_COPPER_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.WAXED_COPPER_BRICK_SLAB.get());

                        entry.accept(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS.get());
                        entry.accept(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB.get());

                        entry.accept(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS.get());
                        entry.accept(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB.get());

                        entry.accept(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS.get());
                        entry.accept(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB.get());

                        entry.accept(EBBlocks.AMETHYST_BRICKS.get());
                        entry.accept(EBBlocks.AMETHYST_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.AMETHYST_BRICK_SLAB.get());
                        entry.accept(EBBlocks.AMETHYST_BRICK_WALL.get());

                        entry.accept(EBBlocks.AMETHYST_LAMP.get());
                        entry.accept(EBBlocks.AMETHYST_FRAMED_GLASS.get());
                        entry.accept(EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get());
                    }).build());

    public static void load() {
    }
}
