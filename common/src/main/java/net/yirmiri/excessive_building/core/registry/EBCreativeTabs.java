package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.RLServices;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.yirmiri.excessive_building.ExcessiveBuilding;

import java.util.function.Supplier;

public class EBCreativeTabs {
    public static final Supplier<CreativeModeTab> EXCESSIVE_BUILDING = RLServices.REGISTRY.registerCreativeModeTab(
            ExcessiveBuilding.MOD_ID, "excessive_building", () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("itemgroup.excessive_building"))
                    .icon(() -> new ItemStack(EBBlocks.COBBLESTONE_BRICKS.get()))
                    .displayItems((displayParameters, entry) -> {
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

                        //NEW BLOCK TYPES
                        entry.accept(EBBlocks.CORALSOIL.get());
                        entry.accept(EBBlocks.CORALSOIL_BRICKS.get());
                        entry.accept(EBBlocks.CORALSOIL_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.CORALSOIL_BRICK_SLAB.get());
                        entry.accept(EBBlocks.CORALSOIL_BRICK_WALL.get());

                        //LAVENDER
                        entry.accept(EBBlocks.LAVENDER.get());
                        entry.accept(EBBlocks.LAVENDER_BLOCK.get());
                        entry.accept(EBBlocks.LAVENDER_CLAY.get());
                        entry.accept(EBBlocks.LAVENDER_BRICKS.get());
                        entry.accept(EBBlocks.MOSSY_LAVENDER_BRICKS.get());
                        entry.accept(EBBlocks.LAVENDER_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.LAVENDER_BRICK_SLAB.get());
                        entry.accept(EBBlocks.LAVENDER_BRICK_WALL.get());

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

                        //VANILLA BLOCK VARIANTS
                        entry.accept(EBBlocks.COBBLESTONE_BRICKS.get());
                        entry.accept(EBBlocks.CRACKED_COBBLESTONE_BRICKS.get());
                        entry.accept(EBBlocks.COBBLESTONE_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.COBBLESTONE_BRICK_SLAB.get());
                        entry.accept(EBBlocks.COBBLESTONE_BRICK_WALL.get());

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
                    }).build());

    public static void load() {
    }
}
