package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.Services;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.yirmiri.excessive_building.ExcessiveBuilding;

import java.util.function.Supplier;

public class EBCreativeTabs {
    public static final Supplier<CreativeModeTab> EXCESSIVE_BUILDING = Services.REGISTRY.registerCreativeModeTab(
            ExcessiveBuilding.MOD_ID, "excessive_building", () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("itemgroup.excessive_building"))
                    .icon(() -> new ItemStack(EBItems.RADIANCE_GAUNTLET.get()))
                    .displayItems((displayParameters, entry) -> {
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

                        entry.accept(EBBlocks.ELYERIUM.get());
                        entry.accept(EBBlocks.ELYERIUM_STAIRS.get());
                        entry.accept(EBBlocks.ELYERIUM_SLAB.get());
                        entry.accept(EBBlocks.ELYERIUM_WALL.get());
                        entry.accept(EBBlocks.POLISHED_ELYERIUM.get());
                        entry.accept(EBBlocks.POLISHED_ELYERIUM_STAIRS.get());
                        entry.accept(EBBlocks.POLISHED_ELYERIUM_SLAB.get());
                        entry.accept(EBBlocks.POLISHED_ELYERIUM_WALL.get());
                        entry.accept(EBBlocks.ELYERIUM_BRICKS.get());
                        entry.accept(EBBlocks.ELYERIUM_BRICK_STAIRS.get());
                        entry.accept(EBBlocks.ELYERIUM_BRICK_SLAB.get());
                        entry.accept(EBBlocks.ELYERIUM_BRICK_WALL.get());
                        entry.accept(EBBlocks.CHISELED_ELYERIUM.get());
                        entry.accept(EBBlocks.ELYERIUM_PILLAR.get());

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

                        //RADIANCE
                        entry.accept(EBBlocks.RADIANCE_ORE.get());
                        entry.accept(EBBlocks.DEEPSLATE_RADIANCE_ORE.get());
                        entry.accept(EBBlocks.RADIANCE_BLOCK.get());
                        entry.accept(EBItems.RADIANCE_CRYSTAL.get());
                        entry.accept(EBItems.RADIANCE_INGOT.get());
                        //entry.accept(EBItems.RADIANCE_POWERCELL.get());
                        entry.accept(EBItems.RADIANCE_GAUNTLET.get());
                    }).build());

    public static void loadCreativeTabs() {
    }
}
