package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.common.publicized.*;
import net.azurune.runiclib.core.platform.Services;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.block.*;
import net.yirmiri.excessive_building.common.util.EBProperties;
import net.yirmiri.excessive_building.common.util.blockfamilycreator.BlockFamilyCreator;
import net.yirmiri.excessive_building.common.worldgen.tree.AncientTreeGrower;

import java.util.*;
import java.util.function.Supplier;

public class EBBlocks {
    //VANILLA ADDITIONS
    public static final Supplier<Block> COBBLESTONE_BRICKS = register("cobblestone_bricks", () -> new Block(EBProperties.BlockP.COBBLESTONE), true);
    public static final Supplier<Block> COBBLESTONE_BRICK_STAIRS = register("cobblestone_brick_stairs", () -> new PublicStairBlock(COBBLESTONE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.COBBLESTONE), true);
    public static final Supplier<Block> COBBLESTONE_BRICK_SLAB = register("cobblestone_brick_slab", () -> new SlabBlock(EBProperties.BlockP.COBBLESTONE), true);
    public static final Supplier<Block> COBBLESTONE_BRICK_WALL = register("cobblestone_brick_wall", () -> new WallBlock(EBProperties.BlockP.COBBLESTONE), true);

    public static final Supplier<Block> CRACKED_COBBLESTONE_BRICKS = register("cracked_cobblestone_bricks", () -> new Block(EBProperties.BlockP.COBBLESTONE), true);

    public static final Supplier<Block> ANDESITE_BRICKS = register("andesite_bricks", () -> new Block(EBProperties.BlockP.POLISHED_ANDESITE), true);
    public static final Supplier<Block> ANDESITE_BRICK_STAIRS = register("andesite_brick_stairs", () -> new PublicStairBlock(ANDESITE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.POLISHED_ANDESITE), true);
    public static final Supplier<Block> ANDESITE_BRICK_SLAB = register("andesite_brick_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_ANDESITE), true);
    public static final Supplier<Block> ANDESITE_BRICK_WALL = register("andesite_brick_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_ANDESITE), true);

    public static final Supplier<Block> GRANITE_BRICKS = register("granite_bricks", () -> new Block(EBProperties.BlockP.POLISHED_GRANITE), true);
    public static final Supplier<Block> GRANITE_BRICK_STAIRS = register("granite_brick_stairs", () -> new PublicStairBlock(GRANITE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.POLISHED_GRANITE), true);
    public static final Supplier<Block> GRANITE_BRICK_SLAB = register("granite_brick_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_GRANITE), true);
    public static final Supplier<Block> GRANITE_BRICK_WALL = register("granite_brick_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_GRANITE), true);

    public static final Supplier<Block> DIORITE_BRICKS = register("diorite_bricks", () -> new Block(EBProperties.BlockP.POLISHED_DIORITE), true);
    public static final Supplier<Block> DIORITE_BRICK_STAIRS = register("diorite_brick_stairs", () -> new PublicStairBlock(DIORITE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.POLISHED_DIORITE), true);
    public static final Supplier<Block> DIORITE_BRICK_SLAB = register("diorite_brick_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_DIORITE), true);
    public static final Supplier<Block> DIORITE_BRICK_WALL = register("diorite_brick_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_DIORITE), true);

    //HECTALITE
    public static final Supplier<Block> HECTALITE = register("hectalite", () -> new Block(EBProperties.BlockP.HECTALITE), true);
    public static final Supplier<Block> HECTALITE_STAIRS = register("hectalite_stairs", () -> new PublicStairBlock(HECTALITE.get().defaultBlockState(), EBProperties.BlockP.HECTALITE), true);
    public static final Supplier<Block> HECTALITE_SLAB = register("hectalite_slab", () -> new SlabBlock(EBProperties.BlockP.HECTALITE), true);
    public static final Supplier<Block> HECTALITE_WALL = register("hectalite_wall", () -> new WallBlock(EBProperties.BlockP.HECTALITE), true);

    public static final Supplier<Block> POLISHED_HECTALITE = register("polished_hectalite", () -> new Block(EBProperties.BlockP.POLISHED_HECTALITE), true);
    public static final Supplier<Block> POLISHED_HECTALITE_STAIRS = register("polished_hectalite_stairs", () -> new PublicStairBlock(POLISHED_HECTALITE.get().defaultBlockState(), EBProperties.BlockP.POLISHED_HECTALITE), true);
    public static final Supplier<Block> POLISHED_HECTALITE_SLAB = register("polished_hectalite_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_HECTALITE), true);
    public static final Supplier<Block> POLISHED_HECTALITE_WALL = register("polished_hectalite_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_HECTALITE), true);

    public static final Supplier<Block> HECTALITE_BRICKS = register("hectalite_bricks", () -> new Block(EBProperties.BlockP.HECTALITE_BRICKS), true);
    public static final Supplier<Block> HECTALITE_BRICK_STAIRS = register("hectalite_brick_stairs", () -> new PublicStairBlock(HECTALITE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.HECTALITE_BRICKS), true);
    public static final Supplier<Block> HECTALITE_BRICK_SLAB = register("hectalite_brick_slab", () -> new SlabBlock(EBProperties.BlockP.HECTALITE_BRICKS), true);
    public static final Supplier<Block> HECTALITE_BRICK_WALL = register("hectalite_brick_wall", () -> new WallBlock(EBProperties.BlockP.HECTALITE_BRICKS), true);

    public static final Supplier<Block> CHISELED_HECTALITE = register("chiseled_hectalite", () -> new Block(EBProperties.BlockP.POLISHED_HECTALITE), true);
    public static final Supplier<Block> HECTALITE_PILLAR = register("hectalite_pillar", () -> new RotatedPillarBlock(EBProperties.BlockP.POLISHED_HECTALITE), true);

    //CHLOROSLATE
    public static final Supplier<Block> CHLOROSLATE = register("chloroslate", () -> new Block(EBProperties.BlockP.CHLOROSLATE), true);
    public static final Supplier<Block> CHLOROSLATE_STAIRS = register("chloroslate_stairs", () -> new PublicStairBlock(CHLOROSLATE.get().defaultBlockState(), EBProperties.BlockP.CHLOROSLATE), true);
    public static final Supplier<Block> CHLOROSLATE_SLAB = register("chloroslate_slab", () -> new SlabBlock(EBProperties.BlockP.CHLOROSLATE), true);
    public static final Supplier<Block> CHLOROSLATE_WALL = register("chloroslate_wall", () -> new WallBlock(EBProperties.BlockP.CHLOROSLATE), true);

    public static final Supplier<Block> POLISHED_CHLOROSLATE = register("polished_chloroslate", () -> new Block(EBProperties.BlockP.POLISHED_CHLOROSLATE), true);
    public static final Supplier<Block> POLISHED_CHLOROSLATE_STAIRS = register("polished_chloroslate_stairs", () -> new PublicStairBlock(POLISHED_CHLOROSLATE.get().defaultBlockState(), EBProperties.BlockP.POLISHED_CHLOROSLATE), true);
    public static final Supplier<Block> POLISHED_CHLOROSLATE_SLAB = register("polished_chloroslate_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_CHLOROSLATE), true);
    public static final Supplier<Block> POLISHED_CHLOROSLATE_WALL = register("polished_chloroslate_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_CHLOROSLATE), true);

    public static final Supplier<Block> CHLOROSLATE_BRICKS = register("chloroslate_bricks", () -> new Block(EBProperties.BlockP.CHLOROSLATE_BRICKS), true);
    public static final Supplier<Block> CHLOROSLATE_BRICK_STAIRS = register("chloroslate_brick_stairs", () -> new PublicStairBlock(CHLOROSLATE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.CHLOROSLATE_BRICKS), true);
    public static final Supplier<Block> CHLOROSLATE_BRICK_SLAB = register("chloroslate_brick_slab", () -> new SlabBlock(EBProperties.BlockP.CHLOROSLATE_BRICKS), true);
    public static final Supplier<Block> CHLOROSLATE_BRICK_WALL = register("chloroslate_brick_wall", () -> new WallBlock(EBProperties.BlockP.CHLOROSLATE_BRICKS), true);

    public static final Supplier<Block> CHISELED_CHLOROSLATE = register("chiseled_chloroslate", () -> new Block(EBProperties.BlockP.POLISHED_CHLOROSLATE), true);
    public static final Supplier<Block> CHLOROSLATE_PILLAR = register("chloroslate_pillar", () -> new RotatedPillarBlock(EBProperties.BlockP.POLISHED_CHLOROSLATE), true);

    //ARIDITE
    public static final Supplier<Block> ARIDITE = register("aridite", () -> new Block(EBProperties.BlockP.ARIDITE), true);
    public static final Supplier<Block> ARIDITE_STAIRS = register("aridite_stairs", () -> new PublicStairBlock(ARIDITE.get().defaultBlockState(), EBProperties.BlockP.ARIDITE), true);
    public static final Supplier<Block> ARIDITE_SLAB = register("aridite_slab", () -> new SlabBlock(EBProperties.BlockP.ARIDITE), true);
    public static final Supplier<Block> ARIDITE_WALL = register("aridite_wall", () -> new WallBlock(EBProperties.BlockP.ARIDITE), true);

    public static final Supplier<Block> POLISHED_ARIDITE = register("polished_aridite", () -> new Block(EBProperties.BlockP.POLISHED_ARIDITE), true);
    public static final Supplier<Block> POLISHED_ARIDITE_STAIRS = register("polished_aridite_stairs", () -> new PublicStairBlock(POLISHED_ARIDITE.get().defaultBlockState(), EBProperties.BlockP.POLISHED_ARIDITE), true);
    public static final Supplier<Block> POLISHED_ARIDITE_SLAB = register("polished_aridite_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_ARIDITE), true);
    public static final Supplier<Block> POLISHED_ARIDITE_WALL = register("polished_aridite_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_ARIDITE), true);

    public static final Supplier<Block> ARIDITE_BRICKS = register("aridite_bricks", () -> new Block(EBProperties.BlockP.ARIDITE_BRICKS), true);
    public static final Supplier<Block> ARIDITE_BRICK_STAIRS = register("aridite_brick_stairs", () -> new PublicStairBlock(ARIDITE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.ARIDITE_BRICKS), true);
    public static final Supplier<Block> ARIDITE_BRICK_SLAB = register("aridite_brick_slab", () -> new SlabBlock(EBProperties.BlockP.ARIDITE_BRICKS), true);
    public static final Supplier<Block> ARIDITE_BRICK_WALL = register("aridite_brick_wall", () -> new WallBlock(EBProperties.BlockP.ARIDITE_BRICKS), true);

    public static final Supplier<Block> CHISELED_ARIDITE = register("chiseled_aridite", () -> new Block(EBProperties.BlockP.POLISHED_ARIDITE), true);
    public static final Supplier<Block> ARIDITE_PILLAR = register("aridite_pillar", () -> new RotatedPillarBlock(EBProperties.BlockP.POLISHED_ARIDITE), true);

    //AMETHYST
    public static final Supplier<Block> AMETHYST_BRICKS = register("amethyst_bricks", () -> new AmethystBlock(EBProperties.BlockP.AMETHYST_BRICKS), true);
    public static final Supplier<Block> AMETHYST_BRICK_STAIRS = register("amethyst_brick_stairs", () -> new PublicStairBlock(AMETHYST_BRICKS.get().defaultBlockState(), EBProperties.BlockP.AMETHYST_BRICKS), true);
    public static final Supplier<Block> AMETHYST_BRICK_SLAB = register("amethyst_brick_slab", () -> new SlabBlock(EBProperties.BlockP.AMETHYST_BRICKS), true);
    public static final Supplier<Block> AMETHYST_BRICK_WALL = register("amethyst_brick_wall", () -> new WallBlock(EBProperties.BlockP.AMETHYST_BRICKS), true);

    public static final Supplier<Block> AMETHYST_FRAMED_GLASS = register("amethyst_framed_glass", () -> new AmethystGlassBlock(EBProperties.BlockP.CRYSTAL_GLASS), true);
    public static final Supplier<Block> AMETHYST_FRAMED_GLASS_PANE = register("amethyst_framed_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.MAGENTA, EBProperties.BlockP.CRYSTAL_GLASS), true);

    public static final Supplier<Block> AMETHYST_LANTERN = register("amethyst_lantern", () -> new Block(EBProperties.BlockP.CRYSTAL_LANTERN), true);

    //FROSTED GLASS
    public static final Supplier<Block> FROSTED_GLASS = register("frosted_glass", () -> new GlassBlock(EBProperties.BlockP.FROSTED_GLASS), true);
    public static final HashMap<DyeColor, Supplier<Block>> DYED_FROSTED_GLASS = new HashMap<>();

    static {
        for (DyeColor colors : DyeColor.values()) {
            DYED_FROSTED_GLASS.put(colors, register(colors + "_stained_frosted_glass", () -> new StainedGlassBlock(
                    colors, EBProperties.BlockP.FROSTED_GLASS.mapColor(colors)), true));
        }
    }

    public static Supplier<Block> getDyedFrostedGlass(int colors){
        return DYED_FROSTED_GLASS.get(DyeColor.byId(colors));
    }

    //SHELVES
    public static final Supplier<Block> ALCHEMY_SHELF = register("alchemy_shelf", () -> new Block(EBProperties.BlockP.BOOKSHELF), true);
    public static final Supplier<Block> ALCHEMY_SHELF_VARIANT1 = register("alchemy_shelf_variant1", () -> new CloneOtherBlock(ALCHEMY_SHELF.get(), EBProperties.BlockP.BOOKSHELF), false);
    public static final Supplier<Block> ALCHEMY_SHELF_VARIANT2 = register("alchemy_shelf_variant2", () -> new CloneOtherBlock(ALCHEMY_SHELF.get(), EBProperties.BlockP.BOOKSHELF), false);
    public static final Supplier<Block> ALCHEMY_SHELF_VARIANT3 = register("alchemy_shelf_variant3", () -> new CloneOtherBlock(ALCHEMY_SHELF.get(), EBProperties.BlockP.BOOKSHELF), false);
    public static final Supplier<Block> ALCHEMY_SHELF_VARIANT4 = register("alchemy_shelf_variant4", () -> new CloneOtherBlock(ALCHEMY_SHELF.get(), EBProperties.BlockP.BOOKSHELF), false);
    public static final Supplier<Block> ALCHEMY_SHELF_VARIANT5 = register("alchemy_shelf_variant5", () -> new CloneOtherBlock(ALCHEMY_SHELF.get(), EBProperties.BlockP.BOOKSHELF), false);

    public static final Supplier<Block> BOOKSHELF_VARIANT1 = register("bookshelf_variant1", () -> new CloneOtherBlock(Blocks.BOOKSHELF, EBProperties.BlockP.BOOKSHELF), false);
    public static final Supplier<Block> BOOKSHELF_VARIANT2 = register("bookshelf_variant2", () -> new CloneOtherBlock(Blocks.BOOKSHELF, EBProperties.BlockP.BOOKSHELF), false);
    public static final Supplier<Block> BOOKSHELF_VARIANT3 = register("bookshelf_variant3", () -> new CloneOtherBlock(Blocks.BOOKSHELF, EBProperties.BlockP.BOOKSHELF), false);
    public static final Supplier<Block> BOOKSHELF_VARIANT4 = register("bookshelf_variant4", () -> new CloneOtherBlock(Blocks.BOOKSHELF, EBProperties.BlockP.BOOKSHELF), false);
    public static final Supplier<Block> BOOKSHELF_VARIANT5 = register("bookshelf_variant5", () -> new CloneOtherBlock(Blocks.BOOKSHELF, EBProperties.BlockP.BOOKSHELF), false);

    //PRISMARINE
    public static final Supplier<Block> POLISHED_PRISMARINE = register("polished_prismarine", () -> new Block(EBProperties.BlockP.PRISMARINE), true);
    public static final Supplier<Block> POLISHED_PRISMARINE_STAIRS = register("polished_prismarine_stairs", () -> new PublicStairBlock(POLISHED_PRISMARINE.get().defaultBlockState(), EBProperties.BlockP.PRISMARINE), true);
    public static final Supplier<Block> POLISHED_PRISMARINE_SLAB = register("polished_prismarine_slab", () -> new SlabBlock(EBProperties.BlockP.PRISMARINE), true);

    public static final Supplier<Block> POLISHED_DARK_PRISMARINE = register("polished_dark_prismarine", () -> new Block(EBProperties.BlockP.DARK_PRISMARINE), true);
    public static final Supplier<Block> POLISHED_DARK_PRISMARINE_STAIRS = register("polished_dark_prismarine_stairs", () -> new PublicStairBlock(POLISHED_DARK_PRISMARINE.get().defaultBlockState(), EBProperties.BlockP.DARK_PRISMARINE), true);
    public static final Supplier<Block> POLISHED_DARK_PRISMARINE_SLAB = register("polished_dark_prismarine_slab", () -> new SlabBlock(EBProperties.BlockP.DARK_PRISMARINE), true);

    //ANCIENT WOOD
    public static final BlockFamilyCreator ANCIENT_WOODSET = new BlockFamilyCreator(ExcessiveBuilding.MOD_ID, "ancient", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(MapColor.SNOW))
            .planks()
            .stairs().slab(true)
            .logs(true, false)
            .door(true, EBRegistries.ANCIENT.setType()).trapdoor(true, EBRegistries.ANCIENT.setType())
            .fence(true).fenceGate(EBRegistries.ANCIENT)
            .button(EBRegistries.ANCIENT.setType(), true, false, 15, true)
            .pressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, true, false, EBRegistries.ANCIENT.setType())
            .glowLeaves(ParticleTypes.CRIMSON_SPORE, SoundType.CHERRY_LEAVES, false)
            ;

    public static final Supplier<Block> ANCIENT_SIGN = register("ancient_sign", () -> new StandingSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_SIGN).mapColor(MapColor.SNOW), EBRegistries.ANCIENT), false);
    public static final Supplier<Block> ANCIENT_WALL_SIGN = register("ancient_wall_sign", () -> new WallSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WALL_SIGN).mapColor(MapColor.SNOW), EBRegistries.ANCIENT), false);
    public static final Supplier<Block> ANCIENT_HANGING_SIGN = register("ancient_hanging_sign", () -> new CeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_HANGING_SIGN).mapColor(MapColor.SNOW), EBRegistries.ANCIENT), false);
    public static final Supplier<Block> ANCIENT_WALL_HANGING_SIGN = register("ancient_wall_hanging_sign", () -> new WallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WALL_HANGING_SIGN).mapColor(MapColor.SNOW), EBRegistries.ANCIENT), false);

    public static final Supplier<Block> ANCIENT_SAPLING = register("ancient_sapling", () -> new PublicSaplingBlock(new AncientTreeGrower(), EBProperties.BlockP.GLOW_SAPLING), true);
    public static final Supplier<Block> POTTED_ANCIENT_SAPLING = register("potted_ancient_sapling", () -> new FlowerPotBlock(ANCIENT_SAPLING.get(), EBProperties.BlockP.GLOW_SAPLING_POT), false);
    public static final Supplier<Block> ANCIENT_VINES = register("ancient_vines", () -> new AncientVinesBlock(EBProperties.BlockP.ANCIENT_VINES), true);
    public static final Supplier<Block> ANCIENT_VINES_PLANT = register("ancient_vines_plant", () -> new AncientVinesPlantBlock(EBProperties.BlockP.ANCIENT_VINES_PLANT), false);

    //CHAIRS
    public static final HashMap<DyeColor, Supplier<Block>> DYED_CHAIRS = new HashMap<>();

    static {
        for (DyeColor colors : DyeColor.values()) {
            DYED_CHAIRS.put(colors, register(colors + "_chair", () -> new ChairBlock(
                    BlockBehaviour.Properties.copy(Blocks.RED_BED).mapColor(colors)), true));
        }
    }

    public static Supplier<Block> getDyedChairs(int colors){
        return DYED_CHAIRS.get(DyeColor.byId(colors));
    }

    //MISC
    public static final Supplier<Block> KILN = register("kiln", () -> new KilnBlock(EBProperties.BlockP.KILN), true);
    public static final Supplier<Block> ZEUS_EPIC_BLOCK = register("zeus_epic_block", () -> new RotatedPillarBlock(EBProperties.BlockP.ZEUS), true);

    private static Supplier<Block> register(String id, Supplier<Block> block, boolean hasItem) {
        return Services.REGISTRY.registerBlock(ExcessiveBuilding.MOD_ID, id, block, hasItem);
    }

    //VERTICAL STAIRS
    public static final List<Supplier<Block>> VERTICAL_STAIRS = new ArrayList<>();

    public static void createVerticalStairs() {
        //This creates a VerticalStairBlock for every registered StairBlock
        Registry<Block> blockRegistry = BuiltInRegistries.BLOCK;
        Set<ResourceKey<Block>> keys = new HashSet<>(blockRegistry.registryKeySet());

        for (ResourceKey<Block> key : keys) {
            Block originalBlock = blockRegistry.get(key);
            String namespace = key.location().getNamespace();
            if (originalBlock instanceof StairBlock && (namespace.equals("minecraft") || namespace.equals(ExcessiveBuilding.MOD_ID))) {
                String originalPath = key.location().getPath();
                String blockId;

                //This cuts _stairs from the id and adds _vertical_stairs so we can have mod_id:block_vertical_stairs instead of mod_id:vertical_block_stairs
                if (originalPath.endsWith("_stairs")) {
                    blockId = originalPath.substring(0, originalPath.length() - "_stairs".length()) + "_vertical_stairs";
                } else {
                    blockId = "vertical_" + originalPath; //Fallback
                }

                registerVerticalStair(namespace, blockId, () ->
                        new VerticalStairBlock(BlockBehaviour.Properties.copy(originalBlock)), true);
            }
        }
    }

    private static Supplier<Block> registerVerticalStair(String modId, String id, Supplier<Block> block, boolean hasItem) {
        //VERTICAL_STAIRS.add(block); //Consider adding vertical stairs back in
        return Services.REGISTRY.registerBlock(modId, id, block, hasItem);
    }

    public static void loadBlocks() {
        //createVerticalStairs(); //Consider adding vertical stairs back in
    }
}
