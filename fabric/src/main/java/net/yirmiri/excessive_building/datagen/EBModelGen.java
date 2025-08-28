package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.BlockStateGenerator;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TexturedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.yirmiri.excessive_building.core.registry.EBBlocks;
import net.yirmiri.excessive_building.core.registry.EBItems;

public class EBModelGen extends FabricModelProvider {
    public EBModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {
        BlockModelGenerators.BlockFamilyProvider elyerium = generator.family(EBBlocks.ELYERIUM.get());
        elyerium.stairs(EBBlocks.ELYERIUM_STAIRS.get());
        elyerium.slab(EBBlocks.ELYERIUM_SLAB.get());
        elyerium.wall(EBBlocks.ELYERIUM_WALL.get());

        BlockModelGenerators.BlockFamilyProvider polishedElyerium = generator.family(EBBlocks.POLISHED_ELYERIUM.get());
        polishedElyerium.stairs(EBBlocks.POLISHED_ELYERIUM_STAIRS.get());
        polishedElyerium.slab(EBBlocks.POLISHED_ELYERIUM_SLAB.get());
        polishedElyerium.wall(EBBlocks.POLISHED_ELYERIUM_WALL.get());

        BlockModelGenerators.BlockFamilyProvider elyeriumbricks = generator.family(EBBlocks.ELYERIUM_BRICKS.get());
        elyeriumbricks.stairs(EBBlocks.ELYERIUM_BRICK_STAIRS.get());
        elyeriumbricks.slab(EBBlocks.ELYERIUM_BRICK_SLAB.get());
        elyeriumbricks.wall(EBBlocks.ELYERIUM_BRICK_WALL.get());

        generator.createTrivialCube(EBBlocks.CHISELED_ELYERIUM.get());

        BlockModelGenerators.BlockFamilyProvider hectalite = generator.family(EBBlocks.HECTALITE.get());
        hectalite.stairs(EBBlocks.HECTALITE_STAIRS.get());
        hectalite.slab(EBBlocks.HECTALITE_SLAB.get());
        hectalite.wall(EBBlocks.HECTALITE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider polishedHectalite = generator.family(EBBlocks.POLISHED_HECTALITE.get());
        polishedHectalite.stairs(EBBlocks.POLISHED_HECTALITE_STAIRS.get());
        polishedHectalite.slab(EBBlocks.POLISHED_HECTALITE_SLAB.get());
        polishedHectalite.wall(EBBlocks.POLISHED_HECTALITE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider hectalitebricks = generator.family(EBBlocks.HECTALITE_BRICKS.get());
        hectalitebricks.stairs(EBBlocks.HECTALITE_BRICK_STAIRS.get());
        hectalitebricks.slab(EBBlocks.HECTALITE_BRICK_SLAB.get());
        hectalitebricks.wall(EBBlocks.HECTALITE_BRICK_WALL.get());

        generator.createTrivialCube(EBBlocks.CHISELED_HECTALITE.get());

        BlockModelGenerators.BlockFamilyProvider amethystbricks = generator.family(EBBlocks.AMETHYST_BRICKS.get());
        amethystbricks.stairs(EBBlocks.AMETHYST_BRICK_STAIRS.get());
        amethystbricks.slab(EBBlocks.AMETHYST_BRICK_SLAB.get());
        amethystbricks.wall(EBBlocks.AMETHYST_BRICK_WALL.get());

        generator.createTrivialCube(EBBlocks.FROSTED_GLASS.get());

        for (DyeColor colors : DyeColor.values()) {
            generator.family(EBBlocks.getDyedFrostedGlass(colors.getId()).get());
        }

        BlockModelGenerators.BlockFamilyProvider chloroslate = generator.family(EBBlocks.CHLOROSLATE.get());
        chloroslate.stairs(EBBlocks.CHLOROSLATE_STAIRS.get());
        chloroslate.slab(EBBlocks.CHLOROSLATE_SLAB.get());
        chloroslate.wall(EBBlocks.CHLOROSLATE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider polishedChloroslate = generator.family(EBBlocks.POLISHED_CHLOROSLATE.get());
        polishedChloroslate.stairs(EBBlocks.POLISHED_CHLOROSLATE_STAIRS.get());
        polishedChloroslate.slab(EBBlocks.POLISHED_CHLOROSLATE_SLAB.get());
        polishedChloroslate.wall(EBBlocks.POLISHED_CHLOROSLATE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider chloroslatebricks = generator.family(EBBlocks.CHLOROSLATE_BRICKS.get());
        chloroslatebricks.stairs(EBBlocks.CHLOROSLATE_BRICK_STAIRS.get());
        chloroslatebricks.slab(EBBlocks.CHLOROSLATE_BRICK_SLAB.get());
        chloroslatebricks.wall(EBBlocks.CHLOROSLATE_BRICK_WALL.get());

        generator.createTrivialCube(EBBlocks.CHISELED_CHLOROSLATE.get());

        generator.createTrivialCube(EBBlocks.RADIANCE_BLOCK.get());
        generator.createTrivialCube(EBBlocks.RADIANCE_ORE.get());
        generator.createTrivialCube(EBBlocks.DEEPSLATE_RADIANCE_ORE.get());

        BlockModelGenerators.BlockFamilyProvider carmatite = generator.family(EBBlocks.ARIDITE.get());
        carmatite.stairs(EBBlocks.ARIDITE_STAIRS.get());
        carmatite.slab(EBBlocks.ARIDITE_SLAB.get());
        carmatite.wall(EBBlocks.ARIDITE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider polishedCarmatite = generator.family(EBBlocks.POLISHED_ARIDITE.get());
        polishedCarmatite.stairs(EBBlocks.POLISHED_ARIDITE_STAIRS.get());
        polishedCarmatite.slab(EBBlocks.POLISHED_ARIDITE_SLAB.get());
        polishedCarmatite.wall(EBBlocks.POLISHED_ARIDITE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider carmatitebricks = generator.family(EBBlocks.ARIDITE_BRICKS.get());
        carmatitebricks.stairs(EBBlocks.ARIDITE_BRICK_STAIRS.get());
        carmatitebricks.slab(EBBlocks.ARIDITE_BRICK_SLAB.get());
        carmatitebricks.wall(EBBlocks.ARIDITE_BRICK_WALL.get());

        generator.createTrivialCube(EBBlocks.CHISELED_ARIDITE.get());

        generator.createRotatedPillarWithHorizontalVariant(EBBlocks.HECTALITE_PILLAR.get(), TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL_ALT);
        generator.createRotatedPillarWithHorizontalVariant(EBBlocks.ELYERIUM_PILLAR.get(), TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL_ALT);
        generator.createRotatedPillarWithHorizontalVariant(EBBlocks.CHLOROSLATE_PILLAR.get(), TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL_ALT);
        generator.createRotatedPillarWithHorizontalVariant(EBBlocks.ARIDITE_PILLAR.get(), TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL_ALT);

        BlockModelGenerators.BlockFamilyProvider cobblestoneBricks = generator.family(EBBlocks.COBBLESTONE_BRICKS.get());
        cobblestoneBricks.stairs(EBBlocks.COBBLESTONE_BRICK_STAIRS.get());
        cobblestoneBricks.slab(EBBlocks.COBBLESTONE_BRICK_SLAB.get());
        cobblestoneBricks.wall(EBBlocks.COBBLESTONE_BRICK_WALL.get());

        generator.createTrivialCube(EBBlocks.CRACKED_COBBLESTONE_BRICKS.get());

        BlockModelGenerators.BlockFamilyProvider andesiteBricks = generator.family(EBBlocks.ANDESITE_BRICKS.get());
        andesiteBricks.stairs(EBBlocks.ANDESITE_BRICK_STAIRS.get());
        andesiteBricks.slab(EBBlocks.ANDESITE_BRICK_SLAB.get());
        andesiteBricks.wall(EBBlocks.ANDESITE_BRICK_WALL.get());

        BlockModelGenerators.BlockFamilyProvider graniteBricks = generator.family(EBBlocks.GRANITE_BRICKS.get());
        graniteBricks.stairs(EBBlocks.GRANITE_BRICK_STAIRS.get());
        graniteBricks.slab(EBBlocks.GRANITE_BRICK_SLAB.get());
        graniteBricks.wall(EBBlocks.GRANITE_BRICK_WALL.get());

        BlockModelGenerators.BlockFamilyProvider dioriteBricks = generator.family(EBBlocks.DIORITE_BRICKS.get());
        dioriteBricks.stairs(EBBlocks.DIORITE_BRICK_STAIRS.get());
        dioriteBricks.slab(EBBlocks.DIORITE_BRICK_SLAB.get());
        dioriteBricks.wall(EBBlocks.DIORITE_BRICK_WALL.get());

        generator.createGlassBlocks(EBBlocks.AMETHYST_FRAMED_GLASS.get(), EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get());
        createCrystalLantern(generator, EBBlocks.AMETHYST_LANTERN.get());

        createCrystalLantern(generator, EBBlocks.RADIANCE_LANTERN.get());
        generator.createGlassBlocks(EBBlocks.RADIANCE_FRAMED_GLASS.get(), EBBlocks.RADIANCE_FRAMED_GLASS_PANE.get());

        generator.createFurnace(EBBlocks.KILN.get(), TexturedModel.ORIENTABLE);

        createBookshelf(generator, EBBlocks.BOOKSHELF_VARIANT1.get(), Blocks.OAK_PLANKS);
        createBookshelf(generator, EBBlocks.BOOKSHELF_VARIANT2.get(), Blocks.OAK_PLANKS);
        createBookshelf(generator, EBBlocks.BOOKSHELF_VARIANT3.get(), Blocks.OAK_PLANKS);
        createBookshelf(generator, EBBlocks.BOOKSHELF_VARIANT4.get(), Blocks.OAK_PLANKS);
        createBookshelf(generator, EBBlocks.BOOKSHELF_VARIANT5.get(), Blocks.OAK_PLANKS);

        createBookshelf(generator, EBBlocks.ALCHEMY_SHELF.get(), Blocks.OAK_PLANKS);
        createBookshelf(generator, EBBlocks.ALCHEMY_SHELF_VARIANT1.get(), Blocks.OAK_PLANKS);
        createBookshelf(generator, EBBlocks.ALCHEMY_SHELF_VARIANT2.get(), Blocks.OAK_PLANKS);
        createBookshelf(generator, EBBlocks.ALCHEMY_SHELF_VARIANT3.get(), Blocks.OAK_PLANKS);
        createBookshelf(generator, EBBlocks.ALCHEMY_SHELF_VARIANT4.get(), Blocks.OAK_PLANKS);
        createBookshelf(generator, EBBlocks.ALCHEMY_SHELF_VARIANT5.get(), Blocks.OAK_PLANKS);

        BlockModelGenerators.BlockFamilyProvider polishedPrismarine = generator.family(EBBlocks.POLISHED_PRISMARINE.get());
        polishedPrismarine.stairs(EBBlocks.POLISHED_PRISMARINE_STAIRS.get());
        polishedPrismarine.slab(EBBlocks.POLISHED_PRISMARINE_SLAB.get());

        BlockModelGenerators.BlockFamilyProvider prismarineTiles = generator.family(EBBlocks.PRISMARINE_TILES.get());
        prismarineTiles.stairs(EBBlocks.PRISMARINE_TILE_STAIRS.get());
        prismarineTiles.slab(EBBlocks.PRISMARINE_TILE_SLAB.get());

        BlockModelGenerators.BlockFamilyProvider polishedDarkPrismarine = generator.family(EBBlocks.POLISHED_DARK_PRISMARINE.get());
        polishedDarkPrismarine.stairs(EBBlocks.POLISHED_DARK_PRISMARINE_STAIRS.get());
        polishedDarkPrismarine.slab(EBBlocks.POLISHED_DARK_PRISMARINE_SLAB.get());

        BlockModelGenerators.BlockFamilyProvider darkPrismarineBricks = generator.family(EBBlocks.DARK_PRISMARINE_BRICKS.get());
        darkPrismarineBricks.stairs(EBBlocks.DARK_PRISMARINE_BRICK_STAIRS.get());
        darkPrismarineBricks.slab(EBBlocks.DARK_PRISMARINE_BRICK_SLAB.get());
        
        BlockModelGenerators.BlockFamilyProvider darkPrismarineTiles = generator.family(EBBlocks.DARK_PRISMARINE_TILES.get());
        darkPrismarineTiles.stairs(EBBlocks.DARK_PRISMARINE_TILE_STAIRS.get());
        darkPrismarineTiles.slab(EBBlocks.DARK_PRISMARINE_TILE_SLAB.get());

        generator.createAmethystCluster(EBBlocks.PRISMARINE_CLUSTER.get());
        generator.createAmethystCluster(EBBlocks.LARGE_PRISMARINE_BUD.get());
        generator.createAmethystCluster(EBBlocks.MEDIUM_PRISMARINE_BUD.get());
        generator.createAmethystCluster(EBBlocks.SMALL_PRISMARINE_BUD.get());

        createCrystalLantern(generator, EBBlocks.ICE_PILLAR.get());
        generator.createTrivialCube(EBBlocks.ZEUS_EPIC_BLOCK.get());
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator) {
        generator.generateFlatItem(EBItems.RADIANCE_CRYSTAL.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.RADIANCE_INGOT.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.RADIANCE_MALLET.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(EBItems.ANCIENT_BOAT.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.ANCIENT_CHEST_BOAT.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.BOOK_OF_FORMATION.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBBlocks.PRISMARINE_CLUSTER.get().asItem(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBBlocks.LARGE_PRISMARINE_BUD.get().asItem(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBBlocks.MEDIUM_PRISMARINE_BUD.get().asItem(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBBlocks.SMALL_PRISMARINE_BUD.get().asItem(), ModelTemplates.FLAT_ITEM);
    }

    //GENERATORS
    private void createBookshelf(BlockModelGenerators generator, Block block, Block wood) {
        TextureMapping textureMapping = TextureMapping.column(TextureMapping.getBlockTexture(block), TextureMapping.getBlockTexture(wood));
        ResourceLocation resourceLocation = ModelTemplates.CUBE_COLUMN.create(block, textureMapping, generator.modelOutput);
        generator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, resourceLocation));
    }

    public void createCrystalLantern(BlockModelGenerators generator, Block block) {
        TextureMapping textureMapping = TextureMapping.column(TextureMapping.getBlockTexture(block), TextureMapping.getBlockTexture(block, "_top"));
        ResourceLocation resourceLocation = ModelTemplates.CUBE_COLUMN.create(block, textureMapping, generator.modelOutput);
        generator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, resourceLocation));
    }
}
