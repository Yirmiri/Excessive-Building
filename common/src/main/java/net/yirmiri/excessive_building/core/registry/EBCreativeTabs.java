package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.Services;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.yirmiri.excessive_building.ExcessiveBuilding;

import java.util.function.Supplier;

public class EBCreativeTabs {
    public static final Supplier<CreativeModeTab> EXCESSIVE_BUILDING = Services.REGISTRY.registerCreativeModeTab(
            ExcessiveBuilding.MOD_ID, "excessive_building", () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("itemgroup.excessive_building"))
                    .icon(() -> new ItemStack(EBItems.GAUNTLET.get()))
                    .displayItems((displayParameters, entry) -> {
                        //TOOLS
                        entry.accept(EBItems.MALLET.get());
                        entry.accept(EBItems.GAUNTLET.get());

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

                        //VANILLA STONES
                        entry.accept(EBBlocks.COBBLESTONE_BRICKS.get());
                        entry.accept(EBBlocks.COBBLESTONE_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.COBBLESTONE_BRICK_SLAB.get());
                        entry.accept(EBBlocks.COBBLESTONE_BRICK_WALL.get());
                        entry.accept(EBBlocks.CRACKED_COBBLESTONE_BRICKS.get());

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

                        //PRISMARINE
                        entry.accept(EBBlocks.POLISHED_PRISMARINE.get());
                        entry.accept(EBBlocks.POLISHED_PRISMARINE_STAIRS.get());
                        entry.accept(EBBlocks.POLISHED_PRISMARINE_SLAB.get());

                        entry.accept(EBBlocks.POLISHED_DARK_PRISMARINE.get());
                        entry.accept(EBBlocks.POLISHED_DARK_PRISMARINE_STAIRS.get());
                        entry.accept(EBBlocks.POLISHED_DARK_PRISMARINE_SLAB.get());
                        
                        //OAK WOOD
                        entry.accept(EBBlocks.ALCHEMY_SHELF.get());

                        //ANCIENT WOOD
                        entry.accept(EBBlocks.ANCIENT_WOODSET.getBlockItem("ancient_log"));
                        entry.accept(EBBlocks.ANCIENT_WOODSET.getBlockItem("ancient_wood"));
                        entry.accept(EBBlocks.ANCIENT_WOODSET.getBlockItem("stripped_ancient_log"));
                        entry.accept(EBBlocks.ANCIENT_WOODSET.getBlockItem("stripped_ancient_wood"));
                        entry.accept(EBBlocks.ANCIENT_WOODSET.getBlockItem("ancient_planks"));
                        entry.accept(EBBlocks.ANCIENT_WOODSET.getBlockItem("ancient_stairs"));
                        entry.accept(EBBlocks.ANCIENT_WOODSET.getBlockItem("ancient_slab"));
                        entry.accept(EBBlocks.ANCIENT_WOODSET.getBlockItem("ancient_fence"));
                        entry.accept(EBBlocks.ANCIENT_WOODSET.getBlockItem("ancient_fence_gate"));
                        entry.accept(EBBlocks.ANCIENT_WOODSET.getBlockItem("ancient_door"));
                        entry.accept(EBBlocks.ANCIENT_WOODSET.getBlockItem("ancient_trapdoor"));
                        entry.accept(EBBlocks.ANCIENT_WOODSET.getBlockItem("ancient_pressure_plate"));
                        entry.accept(EBBlocks.ANCIENT_WOODSET.getBlockItem("ancient_button"));
                        entry.accept(EBItems.ANCIENT_SIGN.get());
                        entry.accept(EBItems.ANCIENT_HANGING_SIGN.get());
                        entry.accept(EBItems.ANCIENT_BOAT.get());
                        entry.accept(EBItems.ANCIENT_CHEST_BOAT.get());

                        entry.accept(EBBlocks.ANCIENT_WOODSET.getBlockItem("ancient_leaves"));
                        entry.accept(EBBlocks.ANCIENT_VINES.get());
                        entry.accept(EBBlocks.ANCIENT_SAPLING.get());
                        entry.accept(EBItems.ANCIENT_FRUIT.get());

                        //CHAIRS
                        entry.accept(EBBlocks.getDyedChairs(DyeColor.WHITE.getId()).get());
                        entry.accept(EBBlocks.getDyedChairs(DyeColor.LIGHT_GRAY.getId()).get());
                        entry.accept(EBBlocks.getDyedChairs(DyeColor.GRAY.getId()).get());
                        entry.accept(EBBlocks.getDyedChairs(DyeColor.BLACK.getId()).get());
                        entry.accept(EBBlocks.getDyedChairs(DyeColor.BROWN.getId()).get());
                        entry.accept(EBBlocks.getDyedChairs(DyeColor.RED.getId()).get());
                        entry.accept(EBBlocks.getDyedChairs(DyeColor.ORANGE.getId()).get());
                        entry.accept(EBBlocks.getDyedChairs(DyeColor.YELLOW.getId()).get());
                        entry.accept(EBBlocks.getDyedChairs(DyeColor.LIME.getId()).get());
                        entry.accept(EBBlocks.getDyedChairs(DyeColor.GREEN.getId()).get());
                        entry.accept(EBBlocks.getDyedChairs(DyeColor.CYAN.getId()).get());
                        entry.accept(EBBlocks.getDyedChairs(DyeColor.LIGHT_BLUE.getId()).get());
                        entry.accept(EBBlocks.getDyedChairs(DyeColor.BLUE.getId()).get());
                        entry.accept(EBBlocks.getDyedChairs(DyeColor.PURPLE.getId()).get());
                        entry.accept(EBBlocks.getDyedChairs(DyeColor.MAGENTA.getId()).get());
                        entry.accept(EBBlocks.getDyedChairs(DyeColor.PINK.getId()).get());

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

                        //CRYSTALS
                        entry.accept(EBBlocks.AMETHYST_BRICKS.get());
                        entry.accept(EBBlocks.AMETHYST_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.AMETHYST_BRICK_SLAB.get());
                        entry.accept(EBBlocks.AMETHYST_BRICK_WALL.get());

                        entry.accept(EBBlocks.AMETHYST_LANTERN.get());
                        entry.accept(EBBlocks.AMETHYST_FRAMED_GLASS.get());
                        entry.accept(EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get());

                        //FUNCTION
                        //entry.accept(EBBlocks.KILN.get());

                        //VERTICAL STAIRS
                        //EBBlocks.VERTICAL_STAIRS.forEach(blockSupplier -> entry.accept(blockSupplier.get()));
                    }).build());

    public static void loadCreativeTabs() {
    }
}
