package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.util.EBUtil;
import net.yirmiri.excessive_building.core.registry.EBBlocks;
import net.yirmiri.excessive_building.core.registry.EBEffects;
import net.yirmiri.excessive_building.core.registry.EBItems;
import org.apache.commons.lang3.StringUtils;

import static net.yirmiri.excessive_building.common.util.EBUtil.toSentenceCase;

import java.util.HashSet;
import java.util.Set;

public class EBLangGen extends FabricLanguageProvider {
    Set<String> usedTranslationKeys = new HashSet<>();

    public EBLangGen(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    public static final String NA_DESC = "Blame Yirmiri for the lack of a Yapping Tooltip";

    private void generate(TranslationBuilder translationBuilder, String key, String translation) {
        if(usedTranslationKeys.contains(key)) {
            return;
        }
        translationBuilder.add(key, translation);
        usedTranslationKeys.add(key);
    }

    @Override
    public void generateTranslations(TranslationBuilder build) {
        for (DyeColor colors : DyeColor.values()) {
            String dyeString = StringUtils.capitalize(StringUtils.replace(StringUtils.replace(StringUtils.replace(colors.getName(),
                    "_", " "), "gray", "Gray"), "blue", "Blue"));

            build.add(EBBlocks.getDyedFrostedGlass(colors.getId()).get(), dyeString + " Stained Frosted Glass");
            build.add(EBBlocks.getDyedChairs(colors.getId()).get(), dyeString + " Chair");
        }

        //MISC
        generate(build, "itemgroup.excessive_building", "Excessive Building");
        generate(build, "itemgroup.excessive_building_vertical_stairs", "Excessive Building: Vertical Stairs");
        generate(build, "item.excessive_building.gauntlet.desc", "Reduces the delay of placing blocks");
        generate(build, "item.excessive_building.mallet.use", "When used on specific blocks:");
        generate(build, "item.excessive_building.mallet.desc", "Changes variant");
        generate(build, "tooltip.excessive_building.malleable", "Has mallet variants");
        generate(build, "message.item.radiance_gauntlet", "Gauntlet power level:");
        generate(build, "excessive_building.container.kiln", "Kiln");

        //BLOCKS
        generate(build, EBBlocks.ALCHEMY_SHELF.get(), "Alchemy Shelf");

        generate(build, EBBlocks.ELYERIUM.get(), "Elyerium");
        generate(build, EBBlocks.ELYERIUM_STAIRS.get(), "Elyerium Stairs");
        generate(build, EBBlocks.ELYERIUM_SLAB.get(), "Elyerium Slab");
        generate(build, EBBlocks.ELYERIUM_WALL.get(), "Elyerium Wall");
        generate(build, EBBlocks.POLISHED_ELYERIUM.get(), "Polished Elyerium");
        generate(build, EBBlocks.POLISHED_ELYERIUM_STAIRS.get(), "Polished Elyerium Stairs");
        generate(build, EBBlocks.POLISHED_ELYERIUM_SLAB.get(), "Polished Elyerium Slab");
        generate(build, EBBlocks.POLISHED_ELYERIUM_WALL.get(), "Polished Elyerium Wall");
        generate(build, EBBlocks.ELYERIUM_BRICKS.get(), "Elyerium Bricks");
        generate(build, EBBlocks.ELYERIUM_BRICK_STAIRS.get(), "Elyerium Brick Stairs");
        generate(build, EBBlocks.ELYERIUM_BRICK_SLAB.get(), "Elyerium Brick Slab");
        generate(build, EBBlocks.ELYERIUM_BRICK_WALL.get(), "Elyerium Brick Wall");
        generate(build, EBBlocks.CHISELED_ELYERIUM.get(), "Chiseled Elyerium");

        generate(build, EBBlocks.HECTALITE.get(), "Hectalite");
        generate(build, EBBlocks.HECTALITE_STAIRS.get(), "Hectalite Stairs");
        generate(build, EBBlocks.HECTALITE_SLAB.get(), "Hectalite Slab");
        generate(build, EBBlocks.HECTALITE_WALL.get(), "Hectalite Wall");
        generate(build, EBBlocks.POLISHED_HECTALITE.get(), "Polished Hectalite");
        generate(build, EBBlocks.POLISHED_HECTALITE_STAIRS.get(), "Polished Hectalite Stairs");
        generate(build, EBBlocks.POLISHED_HECTALITE_SLAB.get(), "Polished Hectalite Slab");
        generate(build, EBBlocks.POLISHED_HECTALITE_WALL.get(), "Polished Hectalite Wall");
        generate(build, EBBlocks.HECTALITE_BRICKS.get(), "Hectalite Bricks");
        generate(build, EBBlocks.HECTALITE_BRICK_STAIRS.get(), "Hectalite Brick Stairs");
        generate(build, EBBlocks.HECTALITE_BRICK_SLAB.get(), "Hectalite Brick Slab");
        generate(build, EBBlocks.HECTALITE_BRICK_WALL.get(), "Hectalite Brick Wall");
        generate(build, EBBlocks.CHISELED_HECTALITE.get(), "Chiseled Hectalite");

        generate(build, EBBlocks.CHLOROSLATE.get(), "Chloroslate");
        generate(build, EBBlocks.CHLOROSLATE_STAIRS.get(), "Chloroslate Stairs");
        generate(build, EBBlocks.CHLOROSLATE_SLAB.get(), "Chloroslate Slab");
        generate(build, EBBlocks.CHLOROSLATE_WALL.get(), "Chloroslate Wall");
        generate(build, EBBlocks.POLISHED_CHLOROSLATE.get(), "Polished Chloroslate");
        generate(build, EBBlocks.POLISHED_CHLOROSLATE_STAIRS.get(), "Polished Chloroslate Stairs");
        generate(build, EBBlocks.POLISHED_CHLOROSLATE_SLAB.get(), "Polished Chloroslate Slab");
        generate(build, EBBlocks.POLISHED_CHLOROSLATE_WALL.get(), "Polished Chloroslate Wall");
        generate(build, EBBlocks.CHLOROSLATE_BRICKS.get(), "Chloroslate Bricks");
        generate(build, EBBlocks.CHLOROSLATE_BRICK_STAIRS.get(), "Chloroslate Brick Stairs");
        generate(build, EBBlocks.CHLOROSLATE_BRICK_SLAB.get(), "Chloroslate Brick Slab");
        generate(build, EBBlocks.CHLOROSLATE_BRICK_WALL.get(), "Chloroslate Brick Wall");
        generate(build, EBBlocks.CHISELED_CHLOROSLATE.get(), "Chiseled Chloroslate");

        generate(build, EBBlocks.ARIDITE.get(), "Aridite");
        generate(build, EBBlocks.ARIDITE_STAIRS.get(), "Aridite Stairs");
        generate(build, EBBlocks.ARIDITE_SLAB.get(), "Aridite Slab");
        generate(build, EBBlocks.ARIDITE_WALL.get(), "Aridite Wall");
        generate(build, EBBlocks.POLISHED_ARIDITE.get(), "Polished Aridite");
        generate(build, EBBlocks.POLISHED_ARIDITE_STAIRS.get(), "Polished Aridite Stairs");
        generate(build, EBBlocks.POLISHED_ARIDITE_SLAB.get(), "Polished Aridite Slab");
        generate(build, EBBlocks.POLISHED_ARIDITE_WALL.get(), "Polished Aridite Wall");
        generate(build, EBBlocks.ARIDITE_BRICKS.get(), "Aridite Bricks");
        generate(build, EBBlocks.ARIDITE_BRICK_STAIRS.get(), "Aridite Brick Stairs");
        generate(build, EBBlocks.ARIDITE_BRICK_SLAB.get(), "Aridite Brick Slab");
        generate(build, EBBlocks.ARIDITE_BRICK_WALL.get(), "Aridite Brick Wall");
        generate(build, EBBlocks.CHISELED_ARIDITE.get(), "Chiseled Aridite");

        generate(build, EBBlocks.AMETHYST_BRICKS.get(), "Amethyst Bricks");
        generate(build, EBBlocks.AMETHYST_BRICK_STAIRS.get(), "Amethyst Brick Stairs");
        generate(build, EBBlocks.AMETHYST_BRICK_SLAB.get(), "Amethyst Brick Slab");
        generate(build, EBBlocks.AMETHYST_BRICK_WALL.get(), "Amethyst Brick Wall");
        generate(build, EBBlocks.AMETHYST_LANTERN.get(), "Amethyst Lantern");
        generate(build, EBBlocks.AMETHYST_FRAMED_GLASS.get(), "Amethyst Framed Glass");
        generate(build, EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get(), "Amethyst Framed Glass Pane");

        generate(build, EBBlocks.FROSTED_GLASS.get(), "Frosted Glass");

        generate(build, EBBlocks.RADIANCE_BLOCK.get(), "Block of Radiance");
        generate(build, EBBlocks.RADIANCE_ORE.get(), "Radiance Ore");
        generate(build, EBBlocks.DEEPSLATE_RADIANCE_ORE.get(), "Deepslate Radiance Ore");
        generate(build, EBBlocks.RADIANCE_LANTERN.get(), "Radiance Lantern");
        generate(build, EBBlocks.RADIANCE_FRAMED_GLASS.get(), "Radiance Framed Glass");
        generate(build, EBBlocks.RADIANCE_FRAMED_GLASS_PANE.get(), "Radiance Framed Glass Pane");

        generate(build, EBBlocks.CHLOROSLATE_PILLAR.get(), "Chloroslate Pillar");
        generate(build, EBBlocks.ARIDITE_PILLAR.get(), "Aridite Pillar");
        generate(build, EBBlocks.ELYERIUM_PILLAR.get(), "Elyerium Pillar");
        generate(build, EBBlocks.HECTALITE_PILLAR.get(), "Hectalite Pillar");

        generate(build, EBBlocks.COBBLESTONE_BRICKS.get(), "Cobblestone Bricks");
        generate(build, EBBlocks.CRACKED_COBBLESTONE_BRICKS.get(), "Cracked Cobblestone Bricks");
        generate(build, EBBlocks.COBBLESTONE_BRICK_STAIRS.get(), "Cobblestone Brick Stairs");
        generate(build, EBBlocks.COBBLESTONE_BRICK_SLAB.get(), "Cobblestone Brick Slab");
        generate(build, EBBlocks.COBBLESTONE_BRICK_WALL.get(), "Cobblestone Brick Wall");

        generate(build, EBBlocks.ANDESITE_BRICKS.get(), "Andesite Bricks");
        generate(build, EBBlocks.ANDESITE_BRICK_STAIRS.get(), "Andesite Brick Stairs");
        generate(build, EBBlocks.ANDESITE_BRICK_SLAB.get(), "Andesite Brick Slab");
        generate(build, EBBlocks.ANDESITE_BRICK_WALL.get(), "Andesite Brick Wall");

        generate(build, EBBlocks.GRANITE_BRICKS.get(), "Granite Bricks");
        generate(build, EBBlocks.GRANITE_BRICK_STAIRS.get(), "Granite Brick Stairs");
        generate(build, EBBlocks.GRANITE_BRICK_SLAB.get(), "Granite Brick Slab");
        generate(build, EBBlocks.GRANITE_BRICK_WALL.get(), "Granite Brick Wall");

        generate(build, EBBlocks.DIORITE_BRICKS.get(), "Diorite Bricks");
        generate(build, EBBlocks.DIORITE_BRICK_STAIRS.get(), "Diorite Brick Stairs");
        generate(build, EBBlocks.DIORITE_BRICK_SLAB.get(), "Diorite Brick Slab");
        generate(build, EBBlocks.DIORITE_BRICK_WALL.get(), "Diorite Brick Wall");

        generate(build, EBBlocks.POLISHED_PRISMARINE.get(), "Polished Prismarine");
        generate(build, EBBlocks.POLISHED_PRISMARINE_STAIRS.get(), "Polished Prismarine Stairs");
        generate(build, EBBlocks.POLISHED_PRISMARINE_SLAB.get(), "Polished Prismarine Slab");
        
        generate(build, EBBlocks.PRISMARINE_TILES.get(), "Prismarine Tiles");
        generate(build, EBBlocks.PRISMARINE_TILE_STAIRS.get(), "Prismarine Tile Stairs");
        generate(build, EBBlocks.PRISMARINE_TILE_SLAB.get(), "Prismarine Tile Slab");

        generate(build, EBBlocks.POLISHED_DARK_PRISMARINE.get(), "Polished Dark Prismarine");
        generate(build, EBBlocks.POLISHED_DARK_PRISMARINE_STAIRS.get(), "Polished Dark Prismarine Stairs");
        generate(build, EBBlocks.POLISHED_DARK_PRISMARINE_SLAB.get(), "Polished Dark Prismarine Slab");

        generate(build, EBBlocks.DARK_PRISMARINE_BRICKS.get(), "Dark Prismarine Bricks");
        generate(build, EBBlocks.DARK_PRISMARINE_BRICK_STAIRS.get(), "Dark Prismarine Brick Stairs");
        generate(build, EBBlocks.DARK_PRISMARINE_BRICK_SLAB.get(), "Dark Prismarine Brick Slab");
        
        generate(build, EBBlocks.DARK_PRISMARINE_TILES.get(), "Dark Prismarine Tiles");
        generate(build, EBBlocks.DARK_PRISMARINE_TILE_STAIRS.get(), "Dark Prismarine Tile Stairs");
        generate(build, EBBlocks.DARK_PRISMARINE_TILE_SLAB.get(), "Dark Prismarine Tile Slab");

        generate(build, EBBlocks.PRISMARINE_CLUSTER.get(), "Prismarine Cluster");
        generate(build, EBBlocks.LARGE_PRISMARINE_BUD.get(), "Large Prismarine Bud");
        generate(build, EBBlocks.MEDIUM_PRISMARINE_BUD.get(), "Medium Prismarine Bud");
        generate(build, EBBlocks.SMALL_PRISMARINE_BUD.get(), "Small Prismarine Bud");

        generate(build, EBBlocks.KILN.get(), "Kiln");
        generate(build, EBBlocks.ICE_PILLAR.get(), "Ice Pillar");
        generate(build, EBBlocks.ZEUS_EPIC_BLOCK.get(), "Zeus' Epic Block");

        generate(build, EBBlocks.ANCIENT_SAPLING.get(), "Ancient Sapling");
        generate(build, EBBlocks.ANCIENT_WOODSET.getBlock("ancient_log").get(), "Ancient Log");
        generate(build, EBBlocks.ANCIENT_WOODSET.getBlock("ancient_wood").get(), "Ancient Wood");
        generate(build, EBBlocks.ANCIENT_WOODSET.getBlock("stripped_ancient_log").get(), "Stripped Ancient Log");
        generate(build, EBBlocks.ANCIENT_WOODSET.getBlock("stripped_ancient_wood").get(), "Stripped Ancient Wood");
        generate(build, EBBlocks.ANCIENT_WOODSET.getBlock("ancient_planks").get(), "Ancient Planks");
        generate(build, EBBlocks.ANCIENT_WOODSET.getBlock("ancient_stairs").get(), "Ancient Stairs");
        generate(build, EBBlocks.ANCIENT_WOODSET.getBlock("ancient_slab").get(), "Ancient Slab");
        generate(build, EBBlocks.ANCIENT_WOODSET.getBlock("ancient_pressure_plate").get(), "Ancient Pressure Plate");
        generate(build, EBBlocks.ANCIENT_WOODSET.getBlock("ancient_button").get(), "Ancient Button");
        generate(build, EBBlocks.ANCIENT_WOODSET.getBlock("ancient_trapdoor").get(), "Ancient Trapdoor");
        generate(build, EBBlocks.ANCIENT_WOODSET.getBlock("ancient_door").get(), "Ancient Door");
        generate(build, EBBlocks.ANCIENT_WOODSET.getBlock("ancient_leaves").get(), "Ancient Leaves");
        generate(build, EBBlocks.ANCIENT_VINES.get(), "Ancient Vines");

        //ITEMS
        generate(build, EBItems.RADIANCE_CRYSTAL.get(), "Radiance Crystal");
        generate(build, EBItems.RADIANCE_INGOT.get(), "Radiance Ingot");
        generate(build, EBItems.RADIANCE_GAUNTLET.get(), "Radiance Gauntlet");
        generate(build, EBItems.RADIANCE_MALLET.get(), "Radiance Mallet");
        generate(build, EBItems.BOOK_OF_FORMATION.get(), "Book of Formation");

        generate(build, EBItems.ANCIENT_BOAT.get(), "Ancient Boat");
        generate(build, EBItems.ANCIENT_CHEST_BOAT.get(), "Ancient Chest Boat");
        generate(build, EBItems.ICHOR_FRUIT.get(), "Ichor Fruit");

        //EFFECT
        build.add(EBEffects.RAPIDITY.get(), "Rapidity");
        
        //POTION
        build.add("item.minecraft.potion.effect.reaching_potion", "Potion of Reaching");
        build.add("item.minecraft.splash_potion.effect.reaching_potion", "Splash Potion of Reaching");
        build.add("item.minecraft.lingering_potion.effect.reaching_potion", "Lingering Potion of Reaching");
        build.add("item.minecraft.tipped_arrow.effect.reaching_potion", "Arrow of Reaching");
        build.add("item.minecraft.potion.effect.long_reaching_potion", "Potion of Reaching");
        build.add("item.minecraft.splash_potion.effect.long_reaching_potion", "Splash Potion of Reaching");
        build.add("item.minecraft.lingering_potion.effect.long_reaching_potion", "Lingering Potion of Reaching");
        build.add("item.minecraft.tipped_arrow.effect.long_reaching_potion", "Arrow of Reaching");
        build.add("item.minecraft.potion.effect.strong_reaching_potion", "Potion of Reaching");
        build.add("item.minecraft.splash_potion.effect.strong_reaching_potion", "Splash Potion of Reaching");
        build.add("item.minecraft.lingering_potion.effect.strong_reaching_potion", "Lingering Potion of Reaching");
        build.add("item.minecraft.tipped_arrow.effect.strong_reaching_potion", "Arrow of Reaching");

        build.add("item.minecraft.potion.effect.rapidity_potion", "Potion of Rapidity");
        build.add("item.minecraft.splash_potion.effect.rapidity_potion", "Splash Potion of Rapidity");
        build.add("item.minecraft.lingering_potion.effect.rapidity_potion", "Lingering Potion of Rapidity");
        build.add("item.minecraft.tipped_arrow.effect.rapidity_potion", "Arrow of Rapidity");
        build.add("item.minecraft.potion.effect.long_rapidity_potion", "Potion of Rapidity");
        build.add("item.minecraft.splash_potion.effect.long_rapidity_potion", "Splash Potion of Rapidity");
        build.add("item.minecraft.lingering_potion.effect.long_rapidity_potion", "Lingering Potion of Rapidity");
        build.add("item.minecraft.tipped_arrow.effect.long_rapidity_potion", "Arrow of Rapidity");
        build.add("item.minecraft.potion.effect.strong_rapidity_potion", "Potion of Rapidity");
        build.add("item.minecraft.splash_potion.effect.strong_rapidity_potion", "Splash Potion of Rapidity");
        build.add("item.minecraft.lingering_potion.effect.strong_rapidity_potion", "Lingering Potion of Rapidity");
        build.add("item.minecraft.tipped_arrow.effect.strong_rapidity_potion", "Arrow of Rapidity");

        //YAPPING TOOLTIPS //TODO (not priority), chairs should reference wikipedia
        addYT(build, EBBlocks.ZEUS_EPIC_BLOCK.get(), "The most powerful block of them all... its the best block objectively.");
        addYT(build, EBBlocks.ARIDITE.get(), "A sedimentary rock that can be found generating in cluster under deserts.");

        //AUTOGEN
        for (ResourceLocation id : EBUtil.allBlockIdsInNamespace(ExcessiveBuilding.MOD_ID)) {
            String key = BuiltInRegistries.BLOCK.get(id).getDescriptionId();
            if(usedTranslationKeys.contains(key)) { continue; }
            usedTranslationKeys.add(key);
            generate(build, key, toSentenceCase(id.getPath()));
        }

        for (ResourceLocation id : EBUtil.allItemIdsInNamespace(ExcessiveBuilding.MOD_ID)) {
            String key = BuiltInRegistries.ITEM.get(id).getDescriptionId();
            if (usedTranslationKeys.contains(key)) {
                continue;
            }
            usedTranslationKeys.add(key);
            generate(build, key, toSentenceCase(id.getPath()));
        }
    }

    private void generate(TranslationBuilder translationBuilder, Block block, String translation) {
        generate(translationBuilder, block.getDescriptionId(), translation);
    }

    private void generate(TranslationBuilder translationBuilder, Item item, String translation) {
        generate(translationBuilder, item.getDescriptionId(), translation);
    }

    public static void addYT(FabricLanguageProvider.TranslationBuilder build, Block block, String tooltip) {
        build.add("yapping_tooltips." + block.getDescriptionId() + ".desc", tooltip);
    }

    public static void addYT(FabricLanguageProvider.TranslationBuilder builder, Item item, String tooltip) {
        builder.add("yapping_tooltips." + item.getDescriptionId() + ".desc", tooltip);
    }
}
