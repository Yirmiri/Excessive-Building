package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.*;
import net.minecraft.data.models.model.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.util.blockfamilycreator.BlockFamilyCreator;
import net.yirmiri.excessive_building.core.registry.EBBlocks;
import net.yirmiri.excessive_building.core.registry.EBItems;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class EBModelGen extends FabricModelProvider {
    public EBModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {
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

        BlockModelGenerators.BlockFamilyProvider polishedDarkPrismarine = generator.family(EBBlocks.POLISHED_DARK_PRISMARINE.get());
        polishedDarkPrismarine.stairs(EBBlocks.POLISHED_DARK_PRISMARINE_STAIRS.get());
        polishedDarkPrismarine.slab(EBBlocks.POLISHED_DARK_PRISMARINE_SLAB.get());

        generator.createTrivialCube(EBBlocks.ZEUS_EPIC_BLOCK.get());

        generator.createPlant(EBBlocks.ANCIENT_SAPLING.get(), EBBlocks.POTTED_ANCIENT_SAPLING.get(), BlockModelGenerators.TintState.NOT_TINTED);
        generator.skipAutoItemBlock(EBBlocks.ANCIENT_VINES_PLANT.get());

        //AUTOGEN
        generateBlockFamilyModels(generator);
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator) {
        generator.generateFlatItem(EBItems.MALLET.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateFlatItem(EBItems.ANCIENT_BOAT.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.ANCIENT_CHEST_BOAT.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(EBItems.ICHOR_FRUIT.get(), ModelTemplates.FLAT_ITEM);
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

    public static final ModelTemplate VERTICAL_STAIRS = new ModelTemplate(
            Optional.of(new ResourceLocation(ExcessiveBuilding.MOD_ID, "block/template_vertical_stairs")),
            Optional.empty(), TextureSlot.TEXTURE, TextureSlot.PARTICLE
    );

    public static void registerVerticalStairs(BlockModelGenerators generator, Block verticalStairs, Block texture) {
        ResourceLocation model = VERTICAL_STAIRS.create(verticalStairs, TextureMapping.cube(texture), generator.modelOutput);

        generator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(verticalStairs).with(
                PropertyDispatch.property(BlockStateProperties.HORIZONTAL_FACING)
                        .select(Direction.NORTH, Variant.variant().with(VariantProperties.MODEL, model)
                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R0).with(VariantProperties.UV_LOCK, true))
                        .select(Direction.EAST, Variant.variant().with(VariantProperties.MODEL, model)
                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true))
                        .select(Direction.WEST, Variant.variant().with(VariantProperties.MODEL, model)
                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true))
                        .select(Direction.SOUTH, Variant.variant().with(VariantProperties.MODEL, model)
                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true))
                )
        );
    }

    public void generateBlockFamilyModels(BlockModelGenerators blockStateModelGenerator) {
        for (BlockFamilyCreator blockFamily : BlockFamilyCreator.BLOCK_FAMILIES.values()) {
            if (blockFamily.isOfMod(ExcessiveBuilding.MOD_ID)) {
                for (Supplier<Block> block : blockFamily.CUBE) {
                    blockStateModelGenerator.createTrivialCube(block.get());
                }
                for (Supplier<Block> block : blockFamily.STAIRS) {
                    if (blockFamily.STAIRS_MODEL.contains(block)) {
                        stairs(blockStateModelGenerator, block.get(), blockFamily.VARIANT_TO_BASE_BLOCK.get(block).get());
                    }
                }
                for (Supplier<Block> block : blockFamily.SLABS) {
                    if (blockFamily.SLAB_MODEL.contains(block)) {
                        slab(blockStateModelGenerator, block.get(), blockFamily.VARIANT_TO_BASE_BLOCK.get(block).get());
                    }
                }
                for (Supplier<Block> block : blockFamily.WOODEN_SLABS) {
                    if (blockFamily.SLAB_MODEL.contains(block)) {
                        slab(blockStateModelGenerator, block.get(), blockFamily.VARIANT_TO_BASE_BLOCK.get(block).get());
                    }
                }
                for (Supplier<Block> block : blockFamily.WALLS) {
                    if (blockFamily.WALL_MODEL.contains(block)) {
                        wall(blockStateModelGenerator, block.get(), blockFamily.VARIANT_TO_BASE_BLOCK.get(block).get());
                    }
                }
                for (Supplier<Block> block : Stream.concat(blockFamily.WOODEN_FENCES.stream(), blockFamily.FENCES.stream()).toList()) {
                    fence(blockStateModelGenerator, block.get(), blockFamily.VARIANT_TO_BASE_BLOCK.get(block).get());
                }
                for (Supplier<Block> block : blockFamily.FENCE_GATES) {
                    fenceGate(blockStateModelGenerator, block.get(), blockFamily.VARIANT_TO_BASE_BLOCK.get(block).get());
                }
                for (Supplier<Block> block : blockFamily.LOGS) {
                    blockStateModelGenerator.woodProvider(block.get()).log(block.get()).wood(blockFamily.getBlock(BuiltInRegistries.BLOCK.getKey(block.get()).getPath().replace("log", "wood")).get());
                    blockStateModelGenerator.woodProvider(blockFamily.STRIPPABLE.get(block).get()).log(blockFamily.STRIPPABLE.get(block).get()).wood(blockFamily.STRIPPABLE.get(blockFamily.getBlock(BuiltInRegistries.BLOCK.getKey(block.get()).getPath().replace("log", "wood"))).get());
                }
                for (Supplier<Block> block : Stream.concat(blockFamily.WOODEN_DOORS.stream(), blockFamily.DOORS.stream()).toList()) {
                    blockStateModelGenerator.createDoor(block.get());
                }
                for (Supplier<Block> block : Stream.concat(blockFamily.WOODEN_TRAPDOORS.stream(), blockFamily.TRAPDOORS.stream()).toList()) {
                    blockStateModelGenerator.createOrientableTrapdoor(block.get());
                }
                for (Supplier<Block> block : Stream.concat(Stream.concat(blockFamily.WOODEN_PRESSURE_PLATES.stream(), blockFamily.STONE_PRESSURE_PLATES.stream()), blockFamily.PRESSURE_PLATES.stream()).toList()) {
                    pressurePlate(blockStateModelGenerator, block.get(), blockFamily.VARIANT_TO_BASE_BLOCK.get(block).get());
                }
                for (Supplier<Block> block : Stream.concat(Stream.concat(blockFamily.WOODEN_BUTTONS.stream(), blockFamily.STONE_BUTTONS.stream()), blockFamily.BUTTONS.stream()).toList()) {
                    button(blockStateModelGenerator, block.get(), blockFamily.VARIANT_TO_BASE_BLOCK.get(block).get());
                }
                for (Supplier<Block> block : blockFamily.LEAVES) {
                    blockStateModelGenerator.createTrivialBlock(block.get(), TexturedModel.LEAVES);
                }
                for (Supplier<Block> block : blockFamily.FLOWER_POTS) {
                    blockStateModelGenerator.createPlant(((FlowerPotBlock) block.get()).getContent(), block.get(), BlockModelGenerators.TintState.NOT_TINTED);
                }
            }
        }
    }

    private void stairs(BlockModelGenerators blockStateModelGenerator, Block block, Block baseBlock) {
        TexturedModel texturedModel = TexturedModel.CUBE.get(baseBlock);
        TextureMapping textures = texturedModel.getMapping();
        ResourceLocation identifier = ModelTemplates.STAIRS_INNER.create(block, textures, blockStateModelGenerator.modelOutput);
        ResourceLocation identifier2 = ModelTemplates.STAIRS_STRAIGHT.create(block, textures, blockStateModelGenerator.modelOutput);
        ResourceLocation identifier3 = ModelTemplates.STAIRS_OUTER.create(block, textures, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createStairs(block, identifier, identifier2, identifier3));
        blockStateModelGenerator.delegateItemModel(block, identifier2);
    }

    private void slab(BlockModelGenerators blockStateModelGenerator, Block block, Block baseBlock) {
        TexturedModel texturedModel = TexturedModel.CUBE.get(baseBlock);
        TextureMapping textures = texturedModel.getMapping();
        ResourceLocation identifier = ModelTemplates.SLAB_BOTTOM.create(block, textures, blockStateModelGenerator.modelOutput);
        ResourceLocation identifier2 = ModelTemplates.SLAB_TOP.create(block, textures, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createSlab(block, identifier, identifier2, ResourceLocation.tryBuild(BuiltInRegistries.BLOCK.getKey(baseBlock).getNamespace(), "block/" + BuiltInRegistries.BLOCK.getKey(baseBlock).getPath())));
        blockStateModelGenerator.delegateItemModel(block, identifier);
    }

    private void wall(BlockModelGenerators blockStateModelGenerator, Block block, Block baseBlock) {
        TexturedModel texturedModel = TexturedModel.CUBE.get(baseBlock);
        TextureMapping textures = texturedModel.getMapping();
        ResourceLocation identifier = ModelTemplates.WALL_POST.create(block, textures, blockStateModelGenerator.modelOutput);
        ResourceLocation identifier2 = ModelTemplates.WALL_LOW_SIDE.create(block, textures, blockStateModelGenerator.modelOutput);
        ResourceLocation identifier3 = ModelTemplates.WALL_TALL_SIDE.create(block, textures, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createWall(block, identifier, identifier2, identifier3));
        ResourceLocation identifier4 = ModelTemplates.WALL_INVENTORY.create(block, textures, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.delegateItemModel(block, identifier4);
    }

    private void fence(BlockModelGenerators blockStateModelGenerator, Block fenceBlock, Block baseBlock) {
        TexturedModel texturedModel = TexturedModel.CUBE.get(baseBlock);
        TextureMapping textures = texturedModel.getMapping();
        ResourceLocation identifier = ModelTemplates.FENCE_POST.create(fenceBlock, textures, blockStateModelGenerator.modelOutput);
        ResourceLocation identifier2 = ModelTemplates.FENCE_SIDE.create(fenceBlock, textures, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createFence(fenceBlock, identifier, identifier2));
        ResourceLocation identifier3 = ModelTemplates.FENCE_INVENTORY.create(fenceBlock, textures, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.delegateItemModel(fenceBlock, identifier3);
    }

    private void fenceGate(BlockModelGenerators blockStateModelGenerator, Block fenceGateBlock, Block baseBlock) {
        TexturedModel texturedModel = TexturedModel.CUBE.get(baseBlock);
        TextureMapping textures = texturedModel.getMapping();
        ResourceLocation identifier = ModelTemplates.FENCE_GATE_OPEN.create(fenceGateBlock, textures, blockStateModelGenerator.modelOutput);
        ResourceLocation identifier2 = ModelTemplates.FENCE_GATE_CLOSED.create(fenceGateBlock, textures, blockStateModelGenerator.modelOutput);
        ResourceLocation identifier3 = ModelTemplates.FENCE_GATE_WALL_OPEN.create(fenceGateBlock, textures, blockStateModelGenerator.modelOutput);
        ResourceLocation identifier4 = ModelTemplates.FENCE_GATE_WALL_CLOSED.create(fenceGateBlock, textures, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createFenceGate(fenceGateBlock, identifier, identifier2, identifier3, identifier4, true));
    }

    private void pressurePlate(BlockModelGenerators blockStateModelGenerator, Block pressurePlateBlock, Block baseBlock) {
        TexturedModel texturedModel = TexturedModel.CUBE.get(baseBlock);
        TextureMapping textures = texturedModel.getMapping();
        ResourceLocation identifier = ModelTemplates.PRESSURE_PLATE_UP.create(pressurePlateBlock, textures, blockStateModelGenerator.modelOutput);
        ResourceLocation identifier2 = ModelTemplates.PRESSURE_PLATE_DOWN.create(pressurePlateBlock, textures, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createPressurePlate(pressurePlateBlock, identifier, identifier2));
    }

    private void button(BlockModelGenerators blockStateModelGenerator, Block buttonBlock, Block baseBlock) {
        TexturedModel texturedModel = TexturedModel.CUBE.get(baseBlock);
        TextureMapping textures = texturedModel.getMapping();
        ResourceLocation identifier = ModelTemplates.BUTTON.create(buttonBlock, textures, blockStateModelGenerator.modelOutput);
        ResourceLocation identifier2 = ModelTemplates.BUTTON_PRESSED.create(buttonBlock, textures, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createButton(buttonBlock, identifier, identifier2));
        ResourceLocation identifier3 = ModelTemplates.BUTTON_INVENTORY.create(buttonBlock, textures, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.delegateItemModel(buttonBlock, identifier3);
    }
}
