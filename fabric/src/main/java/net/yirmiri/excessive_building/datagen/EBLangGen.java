package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.world.item.DyeColor;
import net.yirmiri.excessive_building.core.registry.EBBlocks;
import net.yirmiri.excessive_building.core.registry.EBItems;
import org.apache.commons.lang3.StringUtils;

public class EBLangGen extends FabricLanguageProvider {
    public EBLangGen(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    public static final String NA_DESC = "Blame Yirmiri for the lack of a Yapping Tooltip";

    @Override
    public void generateTranslations(TranslationBuilder build) {
        for (DyeColor colors : DyeColor.values()) {
            String dyeString = StringUtils.capitalize(StringUtils.replace(StringUtils.replace(StringUtils.replace(colors.getName(),
                    "_", " "), "gray", "Gray"), "blue", "Blue"));

            build.add(EBBlocks.getDyedFrostedGlass(colors.getId()).get(), dyeString + " Stained Frosted Glass");
        }

        //MISC
        build.add("itemgroup.excessive_building", "Excessive Building");
        build.add("tooltip.item.radiance_gauntlet", "Reduces the delay of placing blocks");
        build.add("message.item.radiance_gauntlet", "Gauntlet power level:");

        //BLOCKS
        build.add(EBBlocks.ELYERIUM.get(), "Elyerium");
        build.add(EBBlocks.ELYERIUM_STAIRS.get(), "Elyerium Stairs");
        build.add(EBBlocks.ELYERIUM_SLAB.get(), "Elyerium Slab");
        build.add(EBBlocks.ELYERIUM_WALL.get(), "Elyerium Wall");
        build.add(EBBlocks.POLISHED_ELYERIUM.get(), "Polished Elyerium");
        build.add(EBBlocks.POLISHED_ELYERIUM_STAIRS.get(), "Polished Elyerium Stairs");
        build.add(EBBlocks.POLISHED_ELYERIUM_SLAB.get(), "Polished Elyerium Slab");
        build.add(EBBlocks.POLISHED_ELYERIUM_WALL.get(), "Polished Elyerium Wall");
        build.add(EBBlocks.ELYERIUM_BRICKS.get(), "Elyerium Bricks");
        build.add(EBBlocks.ELYERIUM_BRICK_STAIRS.get(), "Elyerium Brick Stairs");
        build.add(EBBlocks.ELYERIUM_BRICK_SLAB.get(), "Elyerium Brick Slab");
        build.add(EBBlocks.ELYERIUM_BRICK_WALL.get(), "Elyerium Brick Wall");
        build.add(EBBlocks.CHISELED_ELYERIUM.get(), "Chiseled Elyerium");

        build.add(EBBlocks.HECTALITE.get(), "Hectalite");
        build.add(EBBlocks.HECTALITE_STAIRS.get(), "Hectalite Stairs");
        build.add(EBBlocks.HECTALITE_SLAB.get(), "Hectalite Slab");
        build.add(EBBlocks.HECTALITE_WALL.get(), "Hectalite Wall");
        build.add(EBBlocks.POLISHED_HECTALITE.get(), "Polished Hectalite");
        build.add(EBBlocks.POLISHED_HECTALITE_STAIRS.get(), "Polished Hectalite Stairs");
        build.add(EBBlocks.POLISHED_HECTALITE_SLAB.get(), "Polished Hectalite Slab");
        build.add(EBBlocks.POLISHED_HECTALITE_WALL.get(), "Polished Hectalite Wall");
        build.add(EBBlocks.HECTALITE_BRICKS.get(), "Hectalite Bricks");
        build.add(EBBlocks.HECTALITE_BRICK_STAIRS.get(), "Hectalite Brick Stairs");
        build.add(EBBlocks.HECTALITE_BRICK_SLAB.get(), "Hectalite Brick Slab");
        build.add(EBBlocks.HECTALITE_BRICK_WALL.get(), "Hectalite Brick Wall");
        build.add(EBBlocks.CHISELED_HECTALITE.get(), "Chiseled Hectalite");

        build.add(EBBlocks.CHLOROSLATE.get(), "Chloroslate");
        build.add(EBBlocks.CHLOROSLATE_STAIRS.get(), "Chloroslate Stairs");
        build.add(EBBlocks.CHLOROSLATE_SLAB.get(), "Chloroslate Slab");
        build.add(EBBlocks.CHLOROSLATE_WALL.get(), "Chloroslate Wall");
        build.add(EBBlocks.POLISHED_CHLOROSLATE.get(), "Polished Chloroslate");
        build.add(EBBlocks.POLISHED_CHLOROSLATE_STAIRS.get(), "Polished Chloroslate Stairs");
        build.add(EBBlocks.POLISHED_CHLOROSLATE_SLAB.get(), "Polished Chloroslate Slab");
        build.add(EBBlocks.POLISHED_CHLOROSLATE_WALL.get(), "Polished Chloroslate Wall");
        build.add(EBBlocks.CHLOROSLATE_BRICKS.get(), "Chloroslate Bricks");
        build.add(EBBlocks.CHLOROSLATE_BRICK_STAIRS.get(), "Chloroslate Brick Stairs");
        build.add(EBBlocks.CHLOROSLATE_BRICK_SLAB.get(), "Chloroslate Brick Slab");
        build.add(EBBlocks.CHLOROSLATE_BRICK_WALL.get(), "Chloroslate Brick Wall");
        build.add(EBBlocks.CHISELED_CHLOROSLATE.get(), "Chiseled Chloroslate");

        build.add(EBBlocks.ARIDITE.get(), "Aridite");
        build.add(EBBlocks.ARIDITE_STAIRS.get(), "Aridite Stairs");
        build.add(EBBlocks.ARIDITE_SLAB.get(), "Aridite Slab");
        build.add(EBBlocks.ARIDITE_WALL.get(), "Aridite Wall");
        build.add(EBBlocks.POLISHED_ARIDITE.get(), "Polished Aridite");
        build.add(EBBlocks.POLISHED_ARIDITE_STAIRS.get(), "Polished Aridite Stairs");
        build.add(EBBlocks.POLISHED_ARIDITE_SLAB.get(), "Polished Aridite Slab");
        build.add(EBBlocks.POLISHED_ARIDITE_WALL.get(), "Polished Aridite Wall");
        build.add(EBBlocks.ARIDITE_BRICKS.get(), "Aridite Bricks");
        build.add(EBBlocks.ARIDITE_BRICK_STAIRS.get(), "Aridite Brick Stairs");
        build.add(EBBlocks.ARIDITE_BRICK_SLAB.get(), "Aridite Brick Slab");
        build.add(EBBlocks.ARIDITE_BRICK_WALL.get(), "Aridite Brick Wall");
        build.add(EBBlocks.CHISELED_ARIDITE.get(), "Chiseled Aridite");

        build.add(EBBlocks.AMETHYST_BRICKS.get(), "Amethyst Bricks");
        build.add(EBBlocks.AMETHYST_BRICK_STAIRS.get(), "Amethyst Brick Stairs");
        build.add(EBBlocks.AMETHYST_BRICK_SLAB.get(), "Amethyst Brick Slab");
        build.add(EBBlocks.AMETHYST_BRICK_WALL.get(), "Amethyst Brick Wall");
        build.add(EBBlocks.AMETHYST_LANTERN.get(), "Amethyst Lantern");
        build.add(EBBlocks.AMETHYST_FRAMED_GLASS.get(), "Amethyst Framed Glass");
        build.add(EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get(), "Amethyst Framed Glass Pane");

        build.add(EBBlocks.FROSTED_GLASS.get(), "Frosted Glass");

        build.add(EBBlocks.RADIANCE_BLOCK.get(), "Block of Radiance");
        build.add(EBBlocks.RADIANCE_ORE.get(), "Radiance Ore");
        build.add(EBBlocks.DEEPSLATE_RADIANCE_ORE.get(), "Deepslate Radiance Ore");

        build.add(EBBlocks.CHLOROSLATE_PILLAR.get(), "Chloroslate Pillar");
        build.add(EBBlocks.ARIDITE_PILLAR.get(), "Aridite Pillar");
        build.add(EBBlocks.ELYERIUM_PILLAR.get(), "Elyerium Pillar");
        build.add(EBBlocks.HECTALITE_PILLAR.get(), "Hectalite Pillar");

        //ITEMS
        build.add(EBItems.RADIANCE_CRYSTAL.get(), "Radiance Crystal");
        build.add(EBItems.RADIANCE_INGOT.get(), "Radiance Ingot");
        build.add(EBItems.RADIANCE_POWERCELL.get(), "Radiance Powercell");
        build.add(EBItems.RADIANCE_GAUNTLET.get(), "Radiance Gauntlet");
    }
}
