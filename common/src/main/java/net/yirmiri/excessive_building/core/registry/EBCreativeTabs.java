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

    public static void loadItemGroups() {
    }
}
