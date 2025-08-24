package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.common.publicized.PublicButtonBlock;
import net.azurune.runiclib.common.publicized.PublicPressurePlateBlock;
import net.azurune.runiclib.common.publicized.PublicSaplingBlock;
import net.azurune.runiclib.common.publicized.PublicStairBlock;
import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.OakTreeGrower;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.block.AmethystGlassBlock;
import net.yirmiri.excessive_building.common.block.CloneOtherBlock;
import net.yirmiri.excessive_building.common.block.KilnBlock;
import net.yirmiri.excessive_building.common.block.TemporaryBlock;
import net.yirmiri.excessive_building.common.util.EBProperties;

import java.util.*;
import java.util.function.Supplier;

public class EBBlocks {
    //VERTICAL STAIRS
    public static final List<Supplier<Block>> VERTICAL_STAIRS = new ArrayList<>();

//    public static void createVerticalStairs() {
//        //This creates a VerticalStairBlock for every registered StairBlock
//        Registry<Block> blockRegistry = BuiltInRegistries.BLOCK;
//        Set<ResourceKey<Block>> keys = new HashSet<>(blockRegistry.registryKeySet());
//
//        for (ResourceKey<Block> key : keys) {
//            Block originalBlock = blockRegistry.get(key);
//            if (originalBlock instanceof StairBlock) {
//                String originalPath = key.location().getPath();
//                String blockId;
//
//                //This cuts _stairs from the id and adds _vertical_stairs so we can have mod_id:block_vertical stairs instead of mod_id:vertical_block_stairs
//                if (originalPath.endsWith("_stairs")) {
//                    blockId = originalPath.substring(0, originalPath.length() - "_stairs".length()) + "_vertical_stairs";
//                } else {
//                    blockId = "vertical_" + originalPath; //Fallback
//                }
//
//                registerVerticalStair(key.location().getNamespace(), blockId, () ->
//                        new VerticalStairBlock(BlockBehaviour.Properties.copy(originalBlock)), true);
//            }
//        }
//    }

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

    //ELYERIUM
    public static final Supplier<Block> ELYERIUM = register("elyerium", () -> new Block(EBProperties.BlockP.ELYERIUM), true);
    public static final Supplier<Block> ELYERIUM_STAIRS = register("elyerium_stairs", () -> new PublicStairBlock(ELYERIUM.get().defaultBlockState(), EBProperties.BlockP.ELYERIUM), true);
    public static final Supplier<Block> ELYERIUM_SLAB = register("elyerium_slab", () -> new SlabBlock(EBProperties.BlockP.ELYERIUM), true);
    public static final Supplier<Block> ELYERIUM_WALL = register("elyerium_wall", () -> new WallBlock(EBProperties.BlockP.ELYERIUM), true);

    public static final Supplier<Block> POLISHED_ELYERIUM = register("polished_elyerium", () -> new Block(EBProperties.BlockP.POLISHED_ELYERIUM), true);
    public static final Supplier<Block> POLISHED_ELYERIUM_STAIRS = register("polished_elyerium_stairs", () -> new PublicStairBlock(POLISHED_ELYERIUM.get().defaultBlockState(), EBProperties.BlockP.POLISHED_ELYERIUM), true);
    public static final Supplier<Block> POLISHED_ELYERIUM_SLAB = register("polished_elyerium_slab", () -> new SlabBlock(EBProperties.BlockP.POLISHED_ELYERIUM), true);
    public static final Supplier<Block> POLISHED_ELYERIUM_WALL = register("polished_elyerium_wall", () -> new WallBlock(EBProperties.BlockP.POLISHED_ELYERIUM), true);

    public static final Supplier<Block> ELYERIUM_BRICKS = register("elyerium_bricks", () -> new Block(EBProperties.BlockP.ELYERIUM_BRICKS), true);
    public static final Supplier<Block> ELYERIUM_BRICK_STAIRS = register("elyerium_brick_stairs", () -> new PublicStairBlock(ELYERIUM_BRICKS.get().defaultBlockState(), EBProperties.BlockP.ELYERIUM_BRICKS), true);
    public static final Supplier<Block> ELYERIUM_BRICK_SLAB = register("elyerium_brick_slab", () -> new SlabBlock(EBProperties.BlockP.ELYERIUM_BRICKS), true);
    public static final Supplier<Block> ELYERIUM_BRICK_WALL = register("elyerium_brick_wall", () -> new WallBlock(EBProperties.BlockP.ELYERIUM_BRICKS), true);

    public static final Supplier<Block> CHISELED_ELYERIUM = register("chiseled_elyerium", () -> new Block(EBProperties.BlockP.POLISHED_ELYERIUM), true);
    public static final Supplier<Block> ELYERIUM_PILLAR = register("elyerium_pillar", () -> new RotatedPillarBlock(EBProperties.BlockP.POLISHED_ELYERIUM), true);

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

    //RADIANCE
    public static final Supplier<Block> RADIANCE_ORE = register("radiance_ore", () -> new Block(EBProperties.BlockP.RADIANCE), true);
    public static final Supplier<Block> DEEPSLATE_RADIANCE_ORE = register("deepslate_radiance_ore", () -> new Block(EBProperties.BlockP.DEEPSLATE_RADIANCE), true);
    public static final Supplier<Block> RADIANCE_BLOCK = register("radiance_block", () -> new Block(EBProperties.BlockP.RADIANCE_BLOCK), true);

    public static final Supplier<Block> RADIANCE_FRAMED_GLASS = register("radiance_framed_glass", () -> new GlassBlock(EBProperties.BlockP.CRYSTAL_GLASS), true);
    public static final Supplier<Block> RADIANCE_FRAMED_GLASS_PANE = register("radiance_framed_glass_pane", () -> new StainedGlassPaneBlock(DyeColor.BLUE, EBProperties.BlockP.CRYSTAL_GLASS), true);

    public static final Supplier<Block> RADIANCE_LANTERN = register("radiance_lantern", () -> new Block(EBProperties.BlockP.CRYSTAL_LANTERN), true);

    public static final Supplier<Block> ICE_PILLAR = register("ice_pillar", () -> new TemporaryBlock(EBProperties.BlockP.ICE), true);

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
    public static final Supplier<Block> PRISMARINE_CLUSTER = register("prismarine_cluster", () -> new AmethystClusterBlock(7, 3, EBProperties.BlockP.CRYSTAL_CLUSTER), true);
    public static final Supplier<Block> LARGE_PRISMARINE_BUD = register("large_prismarine_bud", () -> new AmethystClusterBlock(5, 3, EBProperties.BlockP.LARGE_BUD), true);
    public static final Supplier<Block> MEDIUM_PRISMARINE_BUD = register("medium_prismarine_bud", () -> new AmethystClusterBlock(4, 3, EBProperties.BlockP.MEDIUM_BUD), true);
    public static final Supplier<Block> SMALL_PRISMARINE_BUD = register("small_prismarine_bud", () -> new AmethystClusterBlock(3, 4, EBProperties.BlockP.SMALL_BUD), true);

    public static final Supplier<Block> PRISMARINE_TILES = register("prismarine_tiles", () -> new Block(EBProperties.BlockP.PRISMARINE), true);
    public static final Supplier<Block> PRISMARINE_TILE_STAIRS = register("prismarine_tile_stairs", () -> new PublicStairBlock(PRISMARINE_TILES.get().defaultBlockState(), EBProperties.BlockP.PRISMARINE), true);
    public static final Supplier<Block> PRISMARINE_TILE_SLAB = register("prismarine_tile_slab", () -> new SlabBlock(EBProperties.BlockP.PRISMARINE), true);

    public static final Supplier<Block> POLISHED_PRISMARINE = register("polished_prismarine", () -> new Block(EBProperties.BlockP.PRISMARINE), true);
    public static final Supplier<Block> POLISHED_PRISMARINE_STAIRS = register("polished_prismarine_stairs", () -> new PublicStairBlock(POLISHED_PRISMARINE.get().defaultBlockState(), EBProperties.BlockP.PRISMARINE), true);
    public static final Supplier<Block> POLISHED_PRISMARINE_SLAB = register("polished_prismarine_slab", () -> new SlabBlock(EBProperties.BlockP.PRISMARINE), true);

    //DARK PRISMARINE
    public static final Supplier<Block> DARK_PRISMARINE_BRICKS = register("dark_prismarine_bricks", () -> new Block(EBProperties.BlockP.DARK_PRISMARINE), true);
    public static final Supplier<Block> DARK_PRISMARINE_BRICK_STAIRS = register("dark_prismarine_brick_stairs", () -> new PublicStairBlock(DARK_PRISMARINE_BRICKS.get().defaultBlockState(), EBProperties.BlockP.DARK_PRISMARINE), true);
    public static final Supplier<Block> DARK_PRISMARINE_BRICK_SLAB = register("dark_prismarine_brick_slab", () -> new SlabBlock(EBProperties.BlockP.DARK_PRISMARINE), true);

    public static final Supplier<Block> DARK_PRISMARINE_TILES = register("dark_prismarine_tiles", () -> new Block(EBProperties.BlockP.DARK_PRISMARINE), true);
    public static final Supplier<Block> DARK_PRISMARINE_TILE_STAIRS = register("dark_prismarine_tile_stairs", () -> new PublicStairBlock(DARK_PRISMARINE_TILES.get().defaultBlockState(), EBProperties.BlockP.DARK_PRISMARINE), true);
    public static final Supplier<Block> DARK_PRISMARINE_TILE_SLAB = register("dark_prismarine_tile_slab", () -> new SlabBlock(EBProperties.BlockP.DARK_PRISMARINE), true);

    public static final Supplier<Block> POLISHED_DARK_PRISMARINE = register("polished_dark_prismarine", () -> new Block(EBProperties.BlockP.DARK_PRISMARINE), true);
    public static final Supplier<Block> POLISHED_DARK_PRISMARINE_STAIRS = register("polished_dark_prismarine_stairs", () -> new PublicStairBlock(POLISHED_DARK_PRISMARINE.get().defaultBlockState(), EBProperties.BlockP.DARK_PRISMARINE), true);
    public static final Supplier<Block> POLISHED_DARK_PRISMARINE_SLAB = register("polished_dark_prismarine_slab", () -> new SlabBlock(EBProperties.BlockP.DARK_PRISMARINE), true);

    //ANCIENT WOOD
    public static final Supplier<Block> ANCIENT_LOG = register("ancient_log", () -> new RotatedPillarBlock(EBProperties.BlockP.LOG), true);
    public static final Supplier<Block> STRIPPED_ANCIENT_LOG = register("stripped_ancient_log", () -> new RotatedPillarBlock(EBProperties.BlockP.LOG), true);
    public static final Supplier<Block> ANCIENT_WOOD = register("ancient_wood", () -> new RotatedPillarBlock(EBProperties.BlockP.LOG), true);
    public static final Supplier<Block> STRIPPED_ANCIENT_WOOD = register("stripped_ancient_wood", () -> new RotatedPillarBlock(EBProperties.BlockP.LOG), true);
    public static final Supplier<Block> ANCIENT_PLANKS = register("ancient_planks", () -> new Block(EBProperties.BlockP.PLANKS), true);
    public static final Supplier<Block> ANCIENT_STAIRS = register("ancient_stairs", () -> new PublicStairBlock(ANCIENT_PLANKS.get().defaultBlockState(), EBProperties.BlockP.PLANKS), true);
    public static final Supplier<Block> ANCIENT_SLAB = register("ancient_slab", () -> new SlabBlock(EBProperties.BlockP.PLANKS), true);
    public static final Supplier<Block> ANCIENT_FENCE = register("ancient_fence", () -> new FenceBlock(EBProperties.BlockP.FENCE), true);
    public static final Supplier<Block> ANCIENT_FENCE_GATE = register("ancient_fence_gate", () -> new FenceGateBlock(EBProperties.BlockP.GATE, EBRegistries.ANCIENT), true);
    public static final Supplier<Block> ANCIENT_PRESSURE_PLATE = register("ancient_pressure_plate", () -> new PublicPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, EBProperties.BlockP.PLANKS, BlockSetType.OAK), true);
    public static final Supplier<Block> ANCIENT_BUTTON = register("ancient_button", () -> new PublicButtonBlock(EBProperties.BlockP.PLANKS, BlockSetType.OAK, 30, true), true);
    public static final Supplier<Block> ANCIENT_LEAVES = register("ancient_leaves", () -> new LeavesBlock(EBProperties.BlockP.GLOW_LEAVES), true);
    public static final Supplier<Block> ANCIENT_SAPLING = register("ancient_sapling", () -> new PublicSaplingBlock(new OakTreeGrower(), EBProperties.BlockP.GLOW_LEAVES), true);
    public static final Supplier<Block> POTTED_ANCIENT_SAPLING = register("potted_ancient_sapling", () -> new FlowerPotBlock(ANCIENT_SAPLING.get(), EBProperties.BlockP.GLOW_LEAVES), true);

    //MISC
    public static final Supplier<Block> KILN = register("kiln", () -> new KilnBlock(EBProperties.BlockP.KILN), true);

    private static Supplier<Block> register(String id, Supplier<Block> block, boolean hasItem) {
        return Services.REGISTRY.registerBlock(ExcessiveBuilding.MOD_ID, id, block, hasItem);
    }

    private static Supplier<Block> registerVerticalStair(String modId, String id, Supplier<Block> block, boolean hasItem) {
        VERTICAL_STAIRS.add(block);
        return Services.REGISTRY.registerBlock(modId, id, block, hasItem);
    }

    public static void loadBlocks() {
        //createVerticalStairs();
    }
}
