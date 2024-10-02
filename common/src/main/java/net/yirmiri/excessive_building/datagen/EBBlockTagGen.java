package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.DyeColor;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.util.EBTags;

import java.util.concurrent.CompletableFuture;

public class EBBlockTagGen extends FabricTagProvider.BlockTagProvider {
    public EBBlockTagGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> future) {
        super(output, future);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapper) {
        appendAxeMineable();
        appendPickaxeMineable();
        appendHoeMineable();
        appendWalls();
        appendFences();
        appendFenceGates();
        appendFlowerPots();
        appendSaplings();
        appendLogs();
        appendLeaves();
        appendAncientLogs();
        appendGloomLogs();
        appendSigns();
        appendWallSigns();
        appendHangingSigns();
        appendWallHangingSigns();
        appendWoodenButtons();
        appendWoodenPressurePlates();
        appendNeedsIronTool();
        appendNeedsDiamondTool();
        appendNeedsStoneTool();
        appendBeaconBaseBlocks();
        appendDampensVibrations();
        appendWoolCarpets();
        appendWool();
        appendSoulFireBaseBlocks();
        appendSoulSpeedBlocks();
        appendClimbable();
        appendDecoratives();
        appendWoodenFences();
        appendWoodenDoors();
        appendWoodenTrapdoors();
        appendWoodenSlabs();
        appendWoodenStairs();
        appendEnchantmentPowerProvider();
        appendSmallFlowers();
        appendGuardedByPiglins();
        appendCandles();
        appendReplaceable();
    }

    public void appendReplaceable() {
        tag(BlockTags.REPLACEABLE)
                .add(EBBlocks.MOSS_PASTE)
        ;
    }

    public void appendCandles() {
        tag(BlockTags.CANDLES)
                .add(EBBlocks.WEEPING_CANDLE)
                .add(EBBlocks.TWISTING_CANDLE)
        ;
    }

    public void appendDecoratives() {
        tag(EBTags.Blocks.DECORATIVES)
                .add(EBBlocks.WOODEN_MUG)
                .add(EBBlocks.GLASS_JAR)
                .add(EBBlocks.GLASS_JAR_OF_FIRE)
                .add(EBBlocks.GLASS_JAR_OF_SOUL_FIRE)
        ;
    }

    public void appendEnchantmentPowerProvider() {
        tag(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                .add(EBBlocks.SPRUCE_BOOKSHELF)
                .add(EBBlocks.BIRCH_BOOKSHELF)
                .add(EBBlocks.JUNGLE_BOOKSHELF)
                .add(EBBlocks.ACACIA_BOOKSHELF)
                .add(EBBlocks.DARK_OAK_BOOKSHELF)
                .add(EBBlocks.MANGROVE_BOOKSHELF)
                .add(EBBlocks.CHERRY_BOOKSHELF)
                .add(EBBlocks.BAMBOO_BOOKSHELF)
                .add(EBBlocks.CRIMSON_BOOKSHELF)
                .add(EBBlocks.WARPED_BOOKSHELF)
                .add(EBBlocks.GLOOM_BOOKSHELF)
                .add(EBBlocks.ANCIENT_BOOKSHELF)
                .add(EBBlocks.OAK_DECORATIVE_SHELF)
                .add(EBBlocks.SPRUCE_DECORATIVE_SHELF)
                .add(EBBlocks.BIRCH_DECORATIVE_SHELF)
                .add(EBBlocks.JUNGLE_DECORATIVE_SHELF)
                .add(EBBlocks.ACACIA_DECORATIVE_SHELF)
                .add(EBBlocks.DARK_OAK_DECORATIVE_SHELF)
                .add(EBBlocks.MANGROVE_DECORATIVE_SHELF)
                .add(EBBlocks.BAMBOO_DECORATIVE_SHELF)
                .add(EBBlocks.CRIMSON_DECORATIVE_SHELF)
                .add(EBBlocks.WARPED_DECORATIVE_SHELF)
                .add(EBBlocks.GLOOM_DECORATIVE_SHELF)
                .add(EBBlocks.ANCIENT_DECORATIVE_SHELF)
        ;
    }

    public void appendClimbable() {
        tag(BlockTags.CLIMBABLE)
                .add(EBBlocks.SPRUCE_LADDER)
                .add(EBBlocks.BIRCH_LADDER)
                .add(EBBlocks.JUNGLE_LADDER)
                .add(EBBlocks.ACACIA_LADDER)
                .add(EBBlocks.DARK_OAK_LADDER)
                .add(EBBlocks.MANGROVE_LADDER)
                .add(EBBlocks.CHERRY_LADDER)
                .add(EBBlocks.BAMBOO_LADDER)
                .add(EBBlocks.CRIMSON_LADDER)
                .add(EBBlocks.WARPED_LADDER)
                .add(EBBlocks.ANCIENT_LADDER)
                .add(EBBlocks.GLOOM_LADDER)
        ;
    }

    public void appendWoodenDoors() {
        tag(BlockTags.WOODEN_DOORS)
                .add(EBBlocks.ANCIENT_DOOR)
                .add(EBBlocks.GLOOM_DOOR)
        ;
    }

    public void appendWoodenFences() {
        tag(BlockTags.WOODEN_FENCES)
                .add(EBBlocks.ANCIENT_FENCE)
                .add(EBBlocks.GLOOM_FENCE)
        ;
    }

    public void appendWoodenStairs() {
        tag(BlockTags.WOODEN_STAIRS)
                .add(EBBlocks.ANCIENT_STAIRS)
                .add(EBBlocks.GLOOM_STAIRS)
        ;
    }

    public void appendWoodenSlabs() {
        tag(BlockTags.WOODEN_SLABS)
                .add(EBBlocks.ANCIENT_SLAB)
                .add(EBBlocks.GLOOM_SLAB)
        ;
    }

    public void appendWoodenTrapdoors() {
        tag(BlockTags.WOODEN_TRAPDOORS)
                .add(EBBlocks.ANCIENT_TRAPDOOR)
                .add(EBBlocks.GLOOM_TRAPDOOR)
        ;
    }

    public void appendSoulSpeedBlocks() {
        tag(BlockTags.SOUL_SPEED_BLOCKS)
                .add(EBBlocks.POLISHED_SOUL_SANDSTONE)
                .add(EBBlocks.POLISHED_SOUL_SANDSTONE_STAIRS)
                .add(EBBlocks.POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS)
                .add(EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB)
                .add(EBBlocks.POLISHED_SOUL_SANDSTONE_WALL)
                .add(EBBlocks.SOUL_SANDSTONE_BRICKS)
                .add(EBBlocks.SOUL_SANDSTONE_BRICK_STAIRS)
                .add(EBBlocks.SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB)
                .add(EBBlocks.SOUL_SANDSTONE_BRICK_WALL)
                .add(EBBlocks.SOUL_SANDSTONE_TILES)
                .add(EBBlocks.SOUL_SANDSTONE_TILE_STAIRS)
                .add(EBBlocks.SOUL_SANDSTONE_TILE_VERTICAL_STAIRS)
                .add(EBBlocks.SOUL_SANDSTONE_TILE_SLAB)
                .add(EBBlocks.SOUL_SANDSTONE_TILE_WALL)
                .add(EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS)
                .add(EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS)
                .add(EBBlocks.ENGRAVED_SOUL_SANDSTONE_BRICKS)
                .add(EBBlocks.SOUL_SANDSTONE_PILLAR)
                .add(EBBlocks.SOUL_MAGMA_BLOCK)
                .add(EBBlocks.SOUL_SANDSTONE)
                .add(EBBlocks.SOUL_SANDSTONE_STAIRS)
                .add(EBBlocks.SOUL_SANDSTONE_VERTICAL_STAIRS)
                .add(EBBlocks.SOUL_SANDSTONE_SLAB)
                .add(EBBlocks.SOUL_SANDSTONE_WALL)
                .add(EBBlocks.CUT_SOUL_SANDSTONE_SLAB)
                .add(EBBlocks.CUT_SOUL_SANDSTONE)
                .add(EBBlocks.CHISELED_SOUL_SANDSTONE)
                .add(EBBlocks.SMOOTH_SOUL_SANDSTONE)
                .add(EBBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS)
                .add(EBBlocks.SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS)
                .add(EBBlocks.SMOOTH_SOUL_SANDSTONE_SLAB)
        ;
    }

    public void appendSoulFireBaseBlocks() {
        tag(BlockTags.SOUL_FIRE_BASE_BLOCKS)
                .add(EBBlocks.POLISHED_SOUL_SANDSTONE)
                .add(EBBlocks.POLISHED_SOUL_SANDSTONE_STAIRS)
                .add(EBBlocks.POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS)
                .add(EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB)
                .add(EBBlocks.POLISHED_SOUL_SANDSTONE_WALL)
                .add(EBBlocks.SOUL_SANDSTONE_BRICKS)
                .add(EBBlocks.SOUL_SANDSTONE_BRICK_STAIRS)
                .add(EBBlocks.SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB)
                .add(EBBlocks.SOUL_SANDSTONE_BRICK_WALL)
                .add(EBBlocks.SOUL_SANDSTONE_TILES)
                .add(EBBlocks.SOUL_SANDSTONE_TILE_STAIRS)
                .add(EBBlocks.SOUL_SANDSTONE_TILE_VERTICAL_STAIRS)
                .add(EBBlocks.SOUL_SANDSTONE_TILE_SLAB)
                .add(EBBlocks.SOUL_SANDSTONE_TILE_WALL)
                .add(EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS)
                .add(EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS)
                .add(EBBlocks.ENGRAVED_SOUL_SANDSTONE_BRICKS)
                .add(EBBlocks.SOUL_SANDSTONE_PILLAR)
                .add(EBBlocks.SOUL_MAGMA_BLOCK)
                .add(EBBlocks.SOUL_SANDSTONE)
                .add(EBBlocks.SOUL_SANDSTONE_STAIRS)
                .add(EBBlocks.SOUL_SANDSTONE_VERTICAL_STAIRS)
                .add(EBBlocks.SOUL_SANDSTONE_SLAB)
                .add(EBBlocks.SOUL_SANDSTONE_WALL)
                .add(EBBlocks.CUT_SOUL_SANDSTONE_SLAB)
                .add(EBBlocks.CUT_SOUL_SANDSTONE)
                .add(EBBlocks.CHISELED_SOUL_SANDSTONE)
                .add(EBBlocks.SMOOTH_SOUL_SANDSTONE)
                .add(EBBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS)
                .add(EBBlocks.SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS)
                .add(EBBlocks.SMOOTH_SOUL_SANDSTONE_SLAB)
        ;
    }

    public void appendDampensVibrations() {
        tag(BlockTags.DAMPENS_VIBRATIONS)

        ;

        for (DyeColor colors : DyeColor.values()) {
            tag(BlockTags.DAMPENS_VIBRATIONS).add(EBBlocks.getDyedKnittedWools(colors.getId()));
        }
    }

    public void appendWool() {
        tag(BlockTags.WOOL)

        ;

        for (DyeColor colors : DyeColor.values()) {
            tag(BlockTags.WOOL).add(EBBlocks.getDyedKnittedWools(colors.getId()));
        }
    }

    public void appendWoolCarpets() {
        tag(BlockTags.WOOL_CARPETS)

        ;

        for (DyeColor colors : DyeColor.values()) {
            tag(BlockTags.WOOL_CARPETS).add(EBBlocks.getDyedKnittedCarpets(colors.getId()));
        }
    }

    public void appendBeaconBaseBlocks() {
        tag(BlockTags.BEACON_BASE_BLOCKS)
                .add(EBBlocks.IRON_BRICKS)
                .add(EBBlocks.IRON_BRICK_STAIRS)
                .add(EBBlocks.IRON_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.GOLD_BRICKS)
                .add(EBBlocks.GOLD_BRICK_STAIRS)
                .add(EBBlocks.GOLD_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.LAPIS_BRICKS)
                .add(EBBlocks.LAPIS_BRICK_STAIRS)
                .add(EBBlocks.LAPIS_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.EMERALD_BRICKS)
                .add(EBBlocks.EMERALD_BRICK_STAIRS)
                .add(EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.DIAMOND_BRICKS)
                .add(EBBlocks.DIAMOND_BRICK_STAIRS)
                .add(EBBlocks.DIAMOND_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.NETHERITE_BRICKS)
                .add(EBBlocks.NETHERITE_BRICK_STAIRS)
                .add(EBBlocks.NETHERITE_BRICK_VERTICAL_STAIRS)
        ;
    }

    public void appendGuardedByPiglins() {
        tag(BlockTags.GUARDED_BY_PIGLINS)
                .add(EBBlocks.GOLD_BRICKS)
                .add(EBBlocks.GOLD_BRICK_STAIRS)
                .add(EBBlocks.GOLD_BRICK_SLAB)
                .add(EBBlocks.GOLD_BRICK_VERTICAL_STAIRS)
        ;
    }

    public void appendNeedsDiamondTool() {
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(EBBlocks.NETHERITE_BRICKS)
                .add(EBBlocks.NETHERITE_BRICK_STAIRS)
                .add(EBBlocks.NETHERITE_BRICK_SLAB)
                .add(EBBlocks.NETHERITE_BRICK_VERTICAL_STAIRS)
        ;
    }

    public void appendNeedsIronTool() {
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(EBBlocks.GOLD_BRICKS)
                .add(EBBlocks.GOLD_BRICK_STAIRS)
                .add(EBBlocks.GOLD_BRICK_SLAB)
                .add(EBBlocks.GOLD_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.DIAMOND_BRICKS)
                .add(EBBlocks.DIAMOND_BRICK_STAIRS)
                .add(EBBlocks.DIAMOND_BRICK_SLAB)
                .add(EBBlocks.DIAMOND_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.EMERALD_BRICKS)
                .add(EBBlocks.EMERALD_BRICK_STAIRS)
                .add(EBBlocks.EMERALD_BRICK_SLAB)
                .add(EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.REDSTONE_BRICKS)
                .add(EBBlocks.REDSTONE_BRICK_STAIRS)
                .add(EBBlocks.REDSTONE_BRICK_SLAB)
                .add(EBBlocks.REDSTONE_BRICK_VERTICAL_STAIRS)
        ;
    }

    public void appendNeedsStoneTool() {
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(EBBlocks.CUT_COPPER_VERTICAL_STAIRS)
                .add(EBBlocks.EXPOSED_CUT_COPPER_VERTICAL_STAIRS)
                .add(EBBlocks.WEATHERED_CUT_COPPER_VERTICAL_STAIRS)
                .add(EBBlocks.OXIDIZED_CUT_COPPER_VERTICAL_STAIRS)
                .add(EBBlocks.WAXED_CUT_COPPER_VERTICAL_STAIRS)
                .add(EBBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_STAIRS)
                .add(EBBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_STAIRS)
                .add(EBBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_STAIRS)
                .add(EBBlocks.LAPIS_BRICKS)
                .add(EBBlocks.LAPIS_BRICK_STAIRS)
                .add(EBBlocks.LAPIS_BRICK_SLAB)
                .add(EBBlocks.LAPIS_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.IRON_BRICKS)
                .add(EBBlocks.IRON_BRICK_STAIRS)
                .add(EBBlocks.IRON_BRICK_SLAB)
                .add(EBBlocks.IRON_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.COPPER_BRICKS)
                .add(EBBlocks.COPPER_BRICK_STAIRS)
                .add(EBBlocks.COPPER_BRICK_SLAB)
                .add(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.EXPOSED_COPPER_BRICKS)
                .add(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS)
                .add(EBBlocks.EXPOSED_COPPER_BRICK_SLAB)
                .add(EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.WEATHERED_COPPER_BRICKS)
                .add(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS)
                .add(EBBlocks.WEATHERED_COPPER_BRICK_SLAB)
                .add(EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.EXPOSED_COPPER_BRICKS)
                .add(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS)
                .add(EBBlocks.EXPOSED_COPPER_BRICK_SLAB)
                .add(EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.WAXED_COPPER_BRICKS)
                .add(EBBlocks.WAXED_COPPER_BRICK_STAIRS)
                .add(EBBlocks.WAXED_COPPER_BRICK_SLAB)
                .add(EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS)
                .add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS)
                .add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB)
                .add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS)
                .add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS)
                .add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB)
                .add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS)
                .add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS)
                .add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB)
                .add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS)
        ;
    }

    public void appendWoodenPressurePlates() {
        tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(EBBlocks.ANCIENT_PRESSURE_PLATE)
                .add(EBBlocks.GLOOM_PRESSURE_PLATE)
        ;
    }

    public void appendWoodenButtons() {
        tag(BlockTags.WOODEN_BUTTONS)
                .add(EBBlocks.ANCIENT_BUTTON)
                .add(EBBlocks.GLOOM_BUTTON)
        ;
    }

    public void appendSigns() {
        tag(BlockTags.SIGNS)
                .add(EBBlocks.ANCIENT_SIGN)
                .add(EBBlocks.GLOOM_SIGN)
        ;
    }

    public void appendWallSigns() {
        tag(BlockTags.WALL_SIGNS)
                .add(EBBlocks.ANCIENT_WALL_SIGN)
                .add(EBBlocks.GLOOM_WALL_SIGN)
        ;
    }

    public void appendHangingSigns() {
        tag(BlockTags.CEILING_HANGING_SIGNS)
                .add(EBBlocks.ANCIENT_HANGING_SIGN)
                .add(EBBlocks.GLOOM_HANGING_SIGN)
        ;
    }

    public void appendWallHangingSigns() {
        tag(BlockTags.WALL_HANGING_SIGNS)
                .add(EBBlocks.ANCIENT_WALL_HANGING_SIGN)
                .add(EBBlocks.GLOOM_WALL_HANGING_SIGN)
        ;
    }

    public void appendLogs() {
        tag(BlockTags.LOGS_THAT_BURN)
                .addTag(EBTags.Blocks.ANCIENT_LOGS)
                .addTag(EBTags.Blocks.GLOOM_LOGS)
        ;
    }

    public void appendLeaves() {
        tag(BlockTags.LEAVES)
                .add(EBBlocks.ANCIENT_LEAVES)
                .add(EBBlocks.GLOOM_LEAVES)
        ;
    }

    public void appendGloomLogs() {
        tag(EBTags.Blocks.GLOOM_LOGS)
                .add(EBBlocks.GLOOM_LOG)
                .add(EBBlocks.STRIPPED_GLOOM_LOG)
                .add(EBBlocks.GLOOM_WOOD)
                .add(EBBlocks.STRIPPED_GLOOM_WOOD)
        ;
    }

    public void appendAncientLogs() {
        tag(EBTags.Blocks.ANCIENT_LOGS)
                .add(EBBlocks.ANCIENT_LOG)
                .add(EBBlocks.STRIPPED_ANCIENT_LOG)
                .add(EBBlocks.ANCIENT_WOOD)
                .add(EBBlocks.STRIPPED_ANCIENT_WOOD)
        ;
    }

    public void appendSaplings() {
        tag(BlockTags.SAPLINGS)
                .add(EBBlocks.ANCIENT_SAPLING)
                .add(EBBlocks.GLOOM_SEEDS)
                .add(EBBlocks.GLOOM_SAPLING)
        ;
    }

        public void appendFlowerPots() {
            tag(BlockTags.FLOWER_POTS)
                    .add(EBBlocks.POTTED_ANCIENT_SAPLING)
                    .add(EBBlocks.POTTED_ROSE)
                    .add(EBBlocks.POTTED_CYAN_ROSE)
                    .add(EBBlocks.POTTED_WHITE_ROSE)
                    .add(EBBlocks.POTTED_GLOOM_SAPLING)
            ;
        }

    public void appendSmallFlowers() {
        tag(BlockTags.SMALL_FLOWERS)
                .add(EBBlocks.ROSE)
                .add(EBBlocks.CYAN_ROSE)
                .add(EBBlocks.WHITE_ROSE)
        ;
    }

        public void appendFences() {
            tag(BlockTags.FENCES)
                    .add(EBBlocks.ANCIENT_FENCE)
                    .add(EBBlocks.GLOOM_FENCE)
            ;
        }

        public void appendFenceGates() {
            tag(BlockTags.FENCE_GATES)
                    .add(EBBlocks.ANCIENT_FENCE_GATE)
                    .add(EBBlocks.GLOOM_FENCE_GATE)
            ;
        }

        public void appendWalls() {
            tag(BlockTags.WALLS)
                    .add(EBBlocks.COBBLESTONE_BRICK_WALL)
                    .add(EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL)
                    .add(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL)
                    .add(EBBlocks.BLACKSTONE_BRICK_WALL)
                    .add(EBBlocks.BONE_BRICK_WALL)
                    .add(EBBlocks.SOUL_SANDSTONE_WALL)
                    .add(EBBlocks.QUARTZ_BRICK_WALL)
                    .add(EBBlocks.DIORITE_BRICK_WALL)
                    .add(EBBlocks.ANDESITE_BRICK_WALL)
                    .add(EBBlocks.GRANITE_BRICK_WALL)
                    .add(EBBlocks.SMOOTH_BRICK_WALL)
                    .add(EBBlocks.BRIMSTONE_WALL)
            ;
        }

        public void appendPickaxeMineable() {
            tag(BlockTags.MINEABLE_WITH_PICKAXE)
                    .add(EBBlocks.ALMENTRA_STATUE)
                    .add(EBBlocks.ALMENTRA)
                    .add(EBBlocks.ALMENTRA_STAIRS)
                    .add(EBBlocks.ALMENTRA_VERTICAL_STAIRS)
                    .add(EBBlocks.ALMENTRA_SLAB)
                    .add(EBBlocks.ALMENTRA_BRICKS)
                    .add(EBBlocks.ALMENTRA_BRICK_STAIRS)
                    .add(EBBlocks.ALMENTRA_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.ALMENTRA_BRICK_SLAB)
                    .add(EBBlocks.POLISHED_ALMENTRA)
                    .add(EBBlocks.POLISHED_ALMENTRA_STAIRS)
                    .add(EBBlocks.POLISHED_ALMENTRA_VERTICAL_STAIRS)
                    .add(EBBlocks.POLISHED_ALMENTRA_SLAB)
                    .add(EBBlocks.CRACKED_SMOOTH_STONE_BRICKS)
                    .add(EBBlocks.CRACKED_SMOOTH_STONE_TILES)
                    .add(EBBlocks.SMOOTH_STONE_BRICKS)
                    .add(EBBlocks.SMOOTH_STONE_BRICK_STAIRS)
                    .add(EBBlocks.SMOOTH_STONE_BRICK_SLAB)
                    .add(EBBlocks.SMOOTH_STONE_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.SMOOTH_STONE_TILES)
                    .add(EBBlocks.SMOOTH_STONE_TILE_STAIRS)
                    .add(EBBlocks.SMOOTH_STONE_TILE_SLAB)
                    .add(EBBlocks.SMOOTH_STONE_TILE_VERTICAL_STAIRS)
                    .add(EBBlocks.POLISHED_STONE)
                    .add(EBBlocks.POLISHED_STONE_STAIRS)
                    .add(EBBlocks.POLISHED_STONE_SLAB)
                    .add(EBBlocks.POLISHED_STONE_VERTICAL_STAIRS)
                    .add(EBBlocks.SMOOTH_STONE_PILLAR)
                    .add(EBBlocks.CHISELED_SMOOTH_STONE_BRICKS)
                    .add(EBBlocks.CRACKED_ANDESITE_BRICKS)
                    .add(EBBlocks.CRACKED_BRIMSTONE_BRICKS)
                    .add(EBBlocks.CRACKED_GRANITE_BRICKS)
                    .add(EBBlocks.CRACKED_DIORITE_BRICKS)
                    .add(EBBlocks.CRACKED_MUD_BRICKS)
                    .add(EBBlocks.ASPHALT)
                    .add(EBBlocks.ASPHALT_STAIRS)
                    .add(EBBlocks.ASPHALT_SLAB)
                    .add(EBBlocks.ASPHALT_VERTICAL_STAIRS)
                    .add(EBBlocks.BRIMSTONE_PILLAR)
                    .add(EBBlocks.POLISHED_BRIMSTONE)
                    .add(EBBlocks.POLISHED_BRIMSTONE_STAIRS)
                    .add(EBBlocks.POLISHED_BRIMSTONE_SLAB)
                    .add(EBBlocks.POLISHED_BRIMSTONE_VERTICAL_STAIRS)
                    .add(EBBlocks.BRIMSTONE_BRICKS)
                    .add(EBBlocks.BRIMSTONE_BRICK_STAIRS)
                    .add(EBBlocks.BRIMSTONE_BRICK_SLAB)
                    .add(EBBlocks.BRIMSTONE_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.BRIMSTONE_TILES)
                    .add(EBBlocks.BRIMSTONE_TILE_STAIRS)
                    .add(EBBlocks.BRIMSTONE_TILE_SLAB)
                    .add(EBBlocks.BRIMSTONE_TILE_VERTICAL_STAIRS)
                    .add(EBBlocks.BRIMSTONE)
                    .add(EBBlocks.BRIMSTONE_STAIRS)
                    .add(EBBlocks.BRIMSTONE_SLAB)
                    .add(EBBlocks.BRIMSTONE_VERTICAL_STAIRS)
                    .add(EBBlocks.BRIMSTONE_WALL)
                    .add(EBBlocks.REACHING_LANTERN)
                    .add(EBBlocks.SMOOTH_BRICKS)
                    .add(EBBlocks.SMOOTH_BRICK_STAIRS)
                    .add(EBBlocks.SMOOTH_BRICK_SLAB)
                    .add(EBBlocks.SMOOTH_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.SMOOTH_BRICK_WALL)
                    .add(EBBlocks.HERRINGBONE_BRICKS)
                    .add(EBBlocks.SMOOTH_HERRINGBONE_BRICKS)
                    .add(EBBlocks.CRACKED_BRICKS)
                    .add(EBBlocks.CRACKED_SMOOTH_BRICKS)
                    .add(EBBlocks.GRANITE_BRICKS)
                    .add(EBBlocks.GRANITE_BRICK_STAIRS)
                    .add(EBBlocks.GRANITE_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.GRANITE_BRICK_SLAB)
                    .add(EBBlocks.GRANITE_BRICK_WALL)
                    .add(EBBlocks.ANDESITE_BRICKS)
                    .add(EBBlocks.ANDESITE_BRICK_STAIRS)
                    .add(EBBlocks.ANDESITE_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.ANDESITE_BRICK_SLAB)
                    .add(EBBlocks.ANDESITE_BRICK_WALL)
                    .add(EBBlocks.DIORITE_BRICKS)
                    .add(EBBlocks.DIORITE_BRICK_STAIRS)
                    .add(EBBlocks.DIORITE_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.DIORITE_BRICK_SLAB)
                    .add(EBBlocks.DIORITE_BRICK_WALL)
                    .add(EBBlocks.QUARTZ_BRICK_STAIRS)
                    .add(EBBlocks.QUARTZ_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.QUARTZ_BRICK_SLAB)
                    .add(EBBlocks.QUARTZ_BRICK_WALL)
                    .add(EBBlocks.POLISHED_SANDSTONE)
                    .add(EBBlocks.POLISHED_SANDSTONE_STAIRS)
                    .add(EBBlocks.POLISHED_SANDSTONE_VERTICAL_STAIRS)
                    .add(EBBlocks.POLISHED_SANDSTONE_SLAB)
                    .add(EBBlocks.POLISHED_SANDSTONE_WALL)
                    .add(EBBlocks.SANDSTONE_BRICKS)
                    .add(EBBlocks.SANDSTONE_BRICK_STAIRS)
                    .add(EBBlocks.SANDSTONE_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.SANDSTONE_BRICK_SLAB)
                    .add(EBBlocks.SANDSTONE_BRICK_WALL)
                    .add(EBBlocks.SANDSTONE_TILES)
                    .add(EBBlocks.SANDSTONE_TILE_STAIRS)
                    .add(EBBlocks.SANDSTONE_TILE_VERTICAL_STAIRS)
                    .add(EBBlocks.SANDSTONE_TILE_SLAB)
                    .add(EBBlocks.SANDSTONE_TILE_WALL)
                    .add(EBBlocks.CHISELED_SANDSTONE_BRICKS)
                    .add(EBBlocks.DECORATED_SANDSTONE_BRICKS)
                    .add(EBBlocks.ENGRAVED_SANDSTONE_BRICKS)
                    .add(EBBlocks.SANDSTONE_PILLAR)
                    .add(EBBlocks.SOUL_SANDSTONE)
                    .add(EBBlocks.SOUL_SANDSTONE_STAIRS)
                    .add(EBBlocks.SOUL_SANDSTONE_VERTICAL_STAIRS)
                    .add(EBBlocks.SOUL_SANDSTONE_SLAB)
                    .add(EBBlocks.SOUL_SANDSTONE_WALL)
                    .add(EBBlocks.CUT_SOUL_SANDSTONE_SLAB)
                    .add(EBBlocks.CUT_SOUL_SANDSTONE)
                    .add(EBBlocks.CHISELED_SOUL_SANDSTONE)
                    .add(EBBlocks.SOUL_MAGMA_BLOCK)
                    .add(EBBlocks.BONE_BRICKS)
                    .add(EBBlocks.BONE_BRICK_STAIRS)
                    .add(EBBlocks.BONE_BRICK_SLAB)
                    .add(EBBlocks.BONE_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.BONE_BRICK_WALL)
                    .add(EBBlocks.COBBLESTONE_BRICKS)
                    .add(EBBlocks.COBBLESTONE_BRICK_STAIRS)
                    .add(EBBlocks.COBBLESTONE_BRICK_SLAB)
                    .add(EBBlocks.COBBLESTONE_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.COBBLESTONE_BRICK_WALL)
                    .add(EBBlocks.CRACKED_COBBLESTONE_BRICKS)
                    .add(EBBlocks.MOSSY_COBBLESTONE_BRICKS)
                    .add(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS)
                    .add(EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB)
                    .add(EBBlocks.MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL)
                    .add(EBBlocks.COBBLED_DEEPSLATE_BRICKS)
                    .add(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS)
                    .add(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB)
                    .add(EBBlocks.COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL)
                    .add(EBBlocks.CRACKED_COBBLED_DEEPSLATE_BRICKS)
                    .add(EBBlocks.BLACKSTONE_BRICKS)
                    .add(EBBlocks.BLACKSTONE_BRICK_STAIRS)
                    .add(EBBlocks.BLACKSTONE_BRICK_SLAB)
                    .add(EBBlocks.BLACKSTONE_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.BLACKSTONE_BRICK_WALL)
                    .add(EBBlocks.CRACKED_BLACKSTONE_BRICKS)
                    .add(EBBlocks.COPPER_BRICKS)
                    .add(EBBlocks.COPPER_BRICK_STAIRS)
                    .add(EBBlocks.COPPER_BRICK_SLAB)
                    .add(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.EXPOSED_COPPER_BRICKS)
                    .add(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS)
                    .add(EBBlocks.EXPOSED_COPPER_BRICK_SLAB)
                    .add(EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.WEATHERED_COPPER_BRICKS)
                    .add(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS)
                    .add(EBBlocks.WEATHERED_COPPER_BRICK_SLAB)
                    .add(EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.OXIDIZED_COPPER_BRICKS)
                    .add(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS)
                    .add(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB)
                    .add(EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.WAXED_COPPER_BRICKS)
                    .add(EBBlocks.WAXED_COPPER_BRICK_STAIRS)
                    .add(EBBlocks.WAXED_COPPER_BRICK_SLAB)
                    .add(EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS)
                    .add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS)
                    .add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB)
                    .add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS)
                    .add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS)
                    .add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB)
                    .add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS)
                    .add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS)
                    .add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB)
                    .add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.REDSTONE_BRICKS)
                    .add(EBBlocks.REDSTONE_BRICK_STAIRS)
                    .add(EBBlocks.REDSTONE_BRICK_SLAB)
                    .add(EBBlocks.REDSTONE_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.GOLD_BRICKS)
                    .add(EBBlocks.GOLD_BRICK_STAIRS)
                    .add(EBBlocks.GOLD_BRICK_SLAB)
                    .add(EBBlocks.GOLD_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.DIAMOND_BRICKS)
                    .add(EBBlocks.DIAMOND_BRICK_STAIRS)
                    .add(EBBlocks.DIAMOND_BRICK_SLAB)
                    .add(EBBlocks.DIAMOND_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.EMERALD_BRICKS)
                    .add(EBBlocks.EMERALD_BRICK_STAIRS)
                    .add(EBBlocks.EMERALD_BRICK_SLAB)
                    .add(EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.NETHERITE_BRICKS)
                    .add(EBBlocks.NETHERITE_BRICK_STAIRS)
                    .add(EBBlocks.NETHERITE_BRICK_SLAB)
                    .add(EBBlocks.NETHERITE_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.LAPIS_BRICKS)
                    .add(EBBlocks.LAPIS_BRICK_STAIRS)
                    .add(EBBlocks.LAPIS_BRICK_SLAB)
                    .add(EBBlocks.LAPIS_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.IRON_BRICKS)
                    .add(EBBlocks.IRON_BRICK_STAIRS)
                    .add(EBBlocks.IRON_BRICK_SLAB)
                    .add(EBBlocks.IRON_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.SMOOTH_SOUL_SANDSTONE)
                    .add(EBBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS)
                    .add(EBBlocks.SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS)
                    .add(EBBlocks.SMOOTH_SOUL_SANDSTONE_SLAB)
                    .add(EBBlocks.TERRACOTTA_TILES)
                    .add(EBBlocks.TERRACOTTA_TILE_STAIRS)
                    .add(EBBlocks.TERRACOTTA_TILE_VERTICAL_STAIRS)
                    .add(EBBlocks.TERRACOTTA_TILE_SLAB)
                    .add(EBBlocks.STONE_VERTICAL_STAIRS)
                    .add(EBBlocks.COBBLESTONE_VERTICAL_STAIRS)
                    .add(EBBlocks.STONE_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.COBBLED_DEEPSLATE_VERTICAL_STAIRS)
                    .add(EBBlocks.DEEPSLATE_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.DEEPSLATE_TILE_VERTICAL_STAIRS)
                    .add(EBBlocks.POLISHED_DEEPSLATE_VERTICAL_STAIRS)
                    .add(EBBlocks.QUARTZ_VERTICAL_STAIRS)
                    .add(EBBlocks.SMOOTH_QUARTZ_VERTICAL_STAIRS)
                    .add(EBBlocks.SANDSTONE_VERTICAL_STAIRS)
                    .add(EBBlocks.SMOOTH_SANDSTONE_VERTICAL_STAIRS)
                    .add(EBBlocks.BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.RED_SANDSTONE_VERTICAL_STAIRS)
                    .add(EBBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS)
                    .add(EBBlocks.BLACKSTONE_VERTICAL_STAIRS)
                    .add(EBBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.POLISHED_BLACKSTONE_VERTICAL_STAIRS)
                    .add(EBBlocks.PRISMARINE_VERTICAL_STAIRS)
                    .add(EBBlocks.PRISMARINE_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.DARK_PRISMARINE_VERTICAL_STAIRS)
                    .add(EBBlocks.NETHER_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.RED_NETHER_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.ANDESITE_VERTICAL_STAIRS)
                    .add(EBBlocks.POLISHED_ANDESITE_VERTICAL_STAIRS)
                    .add(EBBlocks.GRANITE_VERTICAL_STAIRS)
                    .add(EBBlocks.POLISHED_GRANITE_VERTICAL_STAIRS)
                    .add(EBBlocks.DIORITE_VERTICAL_STAIRS)
                    .add(EBBlocks.POLISHED_DIORITE_VERTICAL_STAIRS)
                    .add(EBBlocks.END_STONE_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.PURPUR_VERTICAL_STAIRS)
                    .add(EBBlocks.MOSSY_STONE_BRICK_VERTICAL_STAIRS)
                    .add(EBBlocks.MOSSY_COBBLESTONE_VERTICAL_STAIRS)
                    .add(EBBlocks.CUT_COPPER_VERTICAL_STAIRS)
                    .add(EBBlocks.EXPOSED_CUT_COPPER_VERTICAL_STAIRS)
                    .add(EBBlocks.WEATHERED_CUT_COPPER_VERTICAL_STAIRS)
                    .add(EBBlocks.OXIDIZED_CUT_COPPER_VERTICAL_STAIRS)
                    .add(EBBlocks.WAXED_CUT_COPPER_VERTICAL_STAIRS)
                    .add(EBBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_STAIRS)
                    .add(EBBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_STAIRS)
                    .add(EBBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_STAIRS)
                    .add(EBBlocks.MUD_BRICK_VERTICAL_STAIRS)
            ;

            for (DyeColor colors : DyeColor.values()) {
                tag(BlockTags.MINEABLE_WITH_PICKAXE).add(EBBlocks.getDyedTerracottaTiles(colors.getId()));
                tag(BlockTags.MINEABLE_WITH_PICKAXE).add(EBBlocks.getDyedTerracottaTileStairs(colors.getId()));
                tag(BlockTags.MINEABLE_WITH_PICKAXE).add(EBBlocks.getDyedTerracottaTileVerticalStairs(colors.getId()));
                tag(BlockTags.MINEABLE_WITH_PICKAXE).add(EBBlocks.getDyedTerracottaTileSlab(colors.getId()));
                tag(BlockTags.MINEABLE_WITH_PICKAXE).add(EBBlocks.getDyedAlmentraStatues(colors.getId()));
                tag(BlockTags.MINEABLE_WITH_PICKAXE).add(EBBlocks.getDyedAlmentra(colors.getId()));
                tag(BlockTags.MINEABLE_WITH_PICKAXE).add(EBBlocks.getDyedPolishedAlmentra(colors.getId()));
                tag(BlockTags.MINEABLE_WITH_PICKAXE).add(EBBlocks.getDyedAlmentraBricks(colors.getId()));
            }
        }

        public void appendHoeMineable() {
            tag(BlockTags.MINEABLE_WITH_HOE)
                    .add(EBBlocks.ANCIENT_LEAVES)
                    .add(EBBlocks.GLOOM_LEAVES)
            ;
        }

        public void appendAxeMineable() {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(EBBlocks.PAPER_BLOCK)
                .add(EBBlocks.THIN_PAPER_BLOCK)
                .add(EBBlocks.THIN_DIVIDED_PAPER_BLOCK)
                .add(EBBlocks.THIN_DIAGONAL_PAPER_BLOCK)
                .add(EBBlocks.THIN_PAPER_STAIRS)
                .add(EBBlocks.THIN_PAPER_VERTICAL_STAIRS)
                .add(EBBlocks.THIN_PAPER_SLAB)
                .add(EBBlocks.THICK_PAPER_BLOCK)
                .add(EBBlocks.THICK_DIVIDED_PAPER_BLOCK)
                .add(EBBlocks.THICK_DIAGONAL_PAPER_BLOCK)
                .add(EBBlocks.THICK_PAPER_STAIRS)
                .add(EBBlocks.THICK_PAPER_VERTICAL_STAIRS)
                .add(EBBlocks.THICK_PAPER_SLAB)
//                .add(EBBlocks.SPRUCE_CHEST)
//                .add(EBBlocks.BIRCH_CHEST)
//                .add(EBBlocks.JUNGLE_CHEST)
//                .add(EBBlocks.ACACIA_CHEST)
//                .add(EBBlocks.DARK_OAK_CHEST)
//                .add(EBBlocks.MANGROVE_CHEST)
//                .add(EBBlocks.CHERRY_CHEST)
//                .add(EBBlocks.BAMBOO_CHEST)
//                .add(EBBlocks.CRIMSON_CHEST)
//                .add(EBBlocks.WARPED_CHEST)
//                .add(EBBlocks.TRAPPED_SPRUCE_CHEST)
//                .add(EBBlocks.TRAPPED_BIRCH_CHEST)
//                .add(EBBlocks.TRAPPED_JUNGLE_CHEST)
//                .add(EBBlocks.TRAPPED_ACACIA_CHEST)
//                .add(EBBlocks.TRAPPED_DARK_OAK_CHEST)
//                .add(EBBlocks.TRAPPED_MANGROVE_CHEST)
//                .add(EBBlocks.TRAPPED_CHERRY_CHEST)
//                .add(EBBlocks.TRAPPED_BAMBOO_CHEST)
//                .add(EBBlocks.TRAPPED_CRIMSON_CHEST)
//                .add(EBBlocks.TRAPPED_WARPED_CHEST)
                .add(EBBlocks.OAK_VERTICAL_STAIRS)
                .add(EBBlocks.SPRUCE_VERTICAL_STAIRS)
                .add(EBBlocks.BIRCH_VERTICAL_STAIRS)
                .add(EBBlocks.JUNGLE_VERTICAL_STAIRS)
                .add(EBBlocks.ACACIA_VERTICAL_STAIRS)
                .add(EBBlocks.DARK_OAK_VERTICAL_STAIRS)
                .add(EBBlocks.MANGROVE_VERTICAL_STAIRS)
                .add(EBBlocks.CHERRY_VERTICAL_STAIRS)
                .add(EBBlocks.BAMBOO_VERTICAL_STAIRS)
                .add(EBBlocks.CRIMSON_VERTICAL_STAIRS)
                .add(EBBlocks.WARPED_VERTICAL_STAIRS)
                .add(EBBlocks.WOODEN_MUG)
                .add(EBBlocks.SPRUCE_CRAFTING_TABLE)
                .add(EBBlocks.BIRCH_CRAFTING_TABLE)
                .add(EBBlocks.JUNGLE_CRAFTING_TABLE)
                .add(EBBlocks.ACACIA_CRAFTING_TABLE)
                .add(EBBlocks.DARK_OAK_CRAFTING_TABLE)
                .add(EBBlocks.MANGROVE_CRAFTING_TABLE)
                .add(EBBlocks.CHERRY_CRAFTING_TABLE)
                .add(EBBlocks.BAMBOO_CRAFTING_TABLE)
                .add(EBBlocks.CRIMSON_CRAFTING_TABLE)
                .add(EBBlocks.WARPED_CRAFTING_TABLE)
                .add(EBBlocks.ANCIENT_CRAFTING_TABLE)
                .add(EBBlocks.GLOOM_CRAFTING_TABLE)
                .add(EBBlocks.SPRUCE_LADDER)
                .add(EBBlocks.BIRCH_LADDER)
                .add(EBBlocks.JUNGLE_LADDER)
                .add(EBBlocks.ACACIA_LADDER)
                .add(EBBlocks.DARK_OAK_LADDER)
                .add(EBBlocks.MANGROVE_LADDER)
                .add(EBBlocks.CHERRY_LADDER)
                .add(EBBlocks.BAMBOO_LADDER)
                .add(EBBlocks.CRIMSON_LADDER)
                .add(EBBlocks.WARPED_LADDER)
                .add(EBBlocks.ANCIENT_LADDER)
                .add(EBBlocks.GLOOM_LADDER)
                .add(EBBlocks.OAK_MOSAIC)
                .add(EBBlocks.OAK_MOSAIC_STAIRS)
                .add(EBBlocks.OAK_MOSAIC_SLAB)
                .add(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.SPRUCE_MOSAIC)
                .add(EBBlocks.SPRUCE_MOSAIC_STAIRS)
                .add(EBBlocks.SPRUCE_MOSAIC_SLAB)
                .add(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.BIRCH_MOSAIC)
                .add(EBBlocks.BIRCH_MOSAIC_STAIRS)
                .add(EBBlocks.BIRCH_MOSAIC_SLAB)
                .add(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.JUNGLE_MOSAIC)
                .add(EBBlocks.JUNGLE_MOSAIC_STAIRS)
                .add(EBBlocks.JUNGLE_MOSAIC_SLAB)
                .add(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.ACACIA_MOSAIC)
                .add(EBBlocks.ACACIA_MOSAIC_STAIRS)
                .add(EBBlocks.ACACIA_MOSAIC_SLAB)
                .add(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.DARK_OAK_MOSAIC)
                .add(EBBlocks.DARK_OAK_MOSAIC_STAIRS)
                .add(EBBlocks.DARK_OAK_MOSAIC_SLAB)
                .add(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.MANGROVE_MOSAIC)
                .add(EBBlocks.MANGROVE_MOSAIC_STAIRS)
                .add(EBBlocks.MANGROVE_MOSAIC_SLAB)
                .add(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.CHERRY_MOSAIC)
                .add(EBBlocks.CHERRY_MOSAIC_STAIRS)
                .add(EBBlocks.CHERRY_MOSAIC_SLAB)
                .add(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.CRIMSON_MOSAIC)
                .add(EBBlocks.CRIMSON_MOSAIC_STAIRS)
                .add(EBBlocks.CRIMSON_MOSAIC_SLAB)
                .add(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.WARPED_MOSAIC)
                .add(EBBlocks.WARPED_MOSAIC_STAIRS)
                .add(EBBlocks.WARPED_MOSAIC_SLAB)
                .add(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.ANCIENT_PLANKS)
                .add(EBBlocks.ANCIENT_STAIRS)
                .add(EBBlocks.ANCIENT_SLAB)
                .add(EBBlocks.ANCIENT_VERTICAL_STAIRS)
                .add(EBBlocks.ANCIENT_MOSAIC)
                .add(EBBlocks.ANCIENT_MOSAIC_STAIRS)
                .add(EBBlocks.ANCIENT_MOSAIC_SLAB)
                .add(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.ANCIENT_LOG)
                .add(EBBlocks.ANCIENT_WOOD)
                .add(EBBlocks.STRIPPED_ANCIENT_LOG)
                .add(EBBlocks.STRIPPED_ANCIENT_WOOD)
                .add(EBBlocks.ANCIENT_DOOR)
                .add(EBBlocks.ANCIENT_TRAPDOOR)
                .add(EBBlocks.ANCIENT_BUTTON)
                .add(EBBlocks.ANCIENT_PRESSURE_PLATE)
                .add(EBBlocks.ANCIENT_SIGN)
                .add(EBBlocks.ANCIENT_WALL_SIGN)
                .add(EBBlocks.ANCIENT_HANGING_SIGN)
                .add(EBBlocks.ANCIENT_WALL_HANGING_SIGN)
                .add(EBBlocks.CHISELED_ANCIENT_PLANKS)
                .add(EBBlocks.CHISELED_OAK_PLANKS)
                .add(EBBlocks.CHISELED_SPRUCE_PLANKS)
                .add(EBBlocks.CHISELED_BIRCH_PLANKS)
                .add(EBBlocks.CHISELED_JUNGLE_PLANKS)
                .add(EBBlocks.CHISELED_ACACIA_PLANKS)
                .add(EBBlocks.CHISELED_DARK_OAK_PLANKS)
                .add(EBBlocks.CHISELED_MANGROVE_PLANKS)
                .add(EBBlocks.CHISELED_BAMBOO_PLANKS)
                .add(EBBlocks.CHISELED_CRIMSON_PLANKS)
                .add(EBBlocks.CHISELED_WARPED_PLANKS)
                .add(EBBlocks.GLOOM_PLANKS)
                .add(EBBlocks.GLOOM_STAIRS)
                .add(EBBlocks.GLOOM_SLAB)
                .add(EBBlocks.GLOOM_VERTICAL_STAIRS)
                .add(EBBlocks.GLOOM_MOSAIC)
                .add(EBBlocks.GLOOM_MOSAIC_STAIRS)
                .add(EBBlocks.GLOOM_MOSAIC_SLAB)
                .add(EBBlocks.GLOOM_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.GLOOM_LOG)
                .add(EBBlocks.GLOOM_WOOD)
                .add(EBBlocks.STRIPPED_GLOOM_LOG)
                .add(EBBlocks.STRIPPED_GLOOM_WOOD)
                .add(EBBlocks.GLOOM_DOOR)
                .add(EBBlocks.GLOOM_TRAPDOOR)
                .add(EBBlocks.GLOOM_BUTTON)
                .add(EBBlocks.GLOOM_PRESSURE_PLATE)
                .add(EBBlocks.GLOOM_SIGN)
                .add(EBBlocks.GLOOM_WALL_SIGN)
                .add(EBBlocks.GLOOM_HANGING_SIGN)
                .add(EBBlocks.GLOOM_WALL_HANGING_SIGN)
                .add(EBBlocks.CHISELED_GLOOM_PLANKS)
                .add(EBBlocks.OAK_DECORATIVE_SHELF)
                .add(EBBlocks.SPRUCE_DECORATIVE_SHELF)
                .add(EBBlocks.BIRCH_DECORATIVE_SHELF)
                .add(EBBlocks.JUNGLE_DECORATIVE_SHELF)
                .add(EBBlocks.ACACIA_DECORATIVE_SHELF)
                .add(EBBlocks.DARK_OAK_DECORATIVE_SHELF)
                .add(EBBlocks.MANGROVE_DECORATIVE_SHELF)
                .add(EBBlocks.BAMBOO_DECORATIVE_SHELF)
                .add(EBBlocks.CRIMSON_DECORATIVE_SHELF)
                .add(EBBlocks.WARPED_DECORATIVE_SHELF)
                .add(EBBlocks.GLOOM_DECORATIVE_SHELF)
                .add(EBBlocks.ANCIENT_DECORATIVE_SHELF)
                .add(EBBlocks.SPRUCE_BOOKSHELF)
                .add(EBBlocks.BIRCH_BOOKSHELF)
                .add(EBBlocks.JUNGLE_BOOKSHELF)
                .add(EBBlocks.ACACIA_BOOKSHELF)
                .add(EBBlocks.DARK_OAK_BOOKSHELF)
                .add(EBBlocks.MANGROVE_BOOKSHELF)
                .add(EBBlocks.BAMBOO_BOOKSHELF)
                .add(EBBlocks.CRIMSON_BOOKSHELF)
                .add(EBBlocks.WARPED_BOOKSHELF)
                .add(EBBlocks.GLOOM_BOOKSHELF)
                .add(EBBlocks.ANCIENT_BOOKSHELF)
        ;
    }
}
