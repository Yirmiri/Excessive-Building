package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.common.publicized.PublicStairBlock;
import net.azurune.runiclib.core.platform.Services;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.block.AmethystGlassBlock;
import net.yirmiri.excessive_building.common.block.VerticalStairBlock;
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
