package net.yirmiri.excessive_building.util;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.yirmiri.excessive_building.block.AncientLeavesBlock;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBSounds;
import net.yirmiri.excessive_building.registry.EBStatusEffects;

public class EBProperties {
    public static class BlockP {
        //WOOD
        public static final Block.Settings GENERIC_WOOD = FabricBlockSettings.copyOf(Blocks.OAK_PLANKS);
        public static final Block.Settings CHERRY_WOOD = FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS);
        public static final Block.Settings BAMBOO_WOOD = FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS);
        public static final Block.Settings CRIMSON_WOOD = FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS);
        public static final Block.Settings WARPED_WOOD = FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS);
        public static final Block.Settings ANCIENT_WOOD = FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).mapColor(MapColor.TERRACOTTA_WHITE);
        public static final Block.Settings GLOOM_WOOD = FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).mapColor(MapColor.RAW_IRON_PINK);

        //STONE
        public static final Block.Settings COBBLESTONE_BRICKS = FabricBlockSettings.copyOf(Blocks.COBBLESTONE).sounds(EBSounds.COBBLED_BRICKS);
        public static final Block.Settings COBBLED_DEEPSLATE_BRICKS = FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE).sounds(EBSounds.COBBLED_BRICKS);
        public static final Block.Settings BLACKSTONE_BRICKS = FabricBlockSettings.copyOf(Blocks.BLACKSTONE).sounds(EBSounds.COBBLED_BRICKS);

        //NATURE
        public static final Block.Settings ANCIENT_LEAVES = FabricBlockSettings.of().luminance(state -> AncientLeavesBlock.isGlowing(state) ? 8 : 0).mapColor(MapColor.RED).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.CHERRY_LEAVES).nonOpaque().allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never).blockVision(Blocks::never).burnable().pistonBehavior(PistonBehavior.DESTROY).solidBlock(Blocks::never);
        public static final Block.Settings ANCIENT_SAPLING = FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING).luminance(state -> 5);

        //SEA GLASS
        public static final Block.Settings SEA_GLASS = FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque();

        //RESOURCES
        public static final Block.Settings GOLD = FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK);
        public static final Block.Settings IRON = FabricBlockSettings.copyOf(Blocks.IRON_BLOCK);
        public static final Block.Settings EMERALD = FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK);
        public static final Block.Settings LAPIS = FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK);
        public static final Block.Settings DIAMOND = FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK);
        public static final Block.Settings NETHERITE = FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK);

        //COPPER
        public static final Block.Settings COPPER = FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK);
        public static final Block.Settings EXPOSED_COPPER = FabricBlockSettings.copyOf(Blocks.EXPOSED_COPPER);
        public static final Block.Settings WEATHERED_COPPER = FabricBlockSettings.copyOf(Blocks.WEATHERED_COPPER);
        public static final Block.Settings OXIDIZED_COPPER = FabricBlockSettings.copyOf(Blocks.OXIDIZED_COPPER);
        public static final Block.Settings COPPER_BUTTON = FabricBlockSettings.copyOf(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE);
        public static final Block.Settings COPPER_PRESSURE_PLATE = FabricBlockSettings.copyOf(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE);

        //POLISHED SANDSTONE
        public static final Block.Settings POLISHED_SANDSTONE = FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE);
        public static final Block.Settings POLISHED_RED_SANDSTONE = FabricBlockSettings.copyOf(Blocks.SMOOTH_RED_SANDSTONE);

        //SOUL
        public static final Block.Settings SOUL_MAGMA = FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK).mapColor(MapColor.BROWN);
        public static final Block.Settings SOUL_SANDSTONE = FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.BROWN);
        public static final Block.Settings CUT_SOUL_SANDSTONE = FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE).mapColor(MapColor.BROWN);
        public static final Block.Settings SMOOTH_SOUL_SANDSTONE = FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).mapColor(MapColor.BROWN);

        //MISC
        public static final Block.Settings BONE = FabricBlockSettings.copyOf(Blocks.BONE_BLOCK);
        public static final Block.Settings INDESTRUCTIBLE = FabricBlockSettings.copyOf(Blocks.BEDROCK);
    }

    public static class ItemP {
        //FOOD
        public static final Item.Settings ANCIENT_FRUIT = new Item.Settings().food(Food.ANCIENT_FRUIT);

        //MISC
        public static final Item.Settings GENERIC = new Item.Settings();
        public static final Item.Settings NETHERITE = new Item.Settings().fireproof();

        public static class Food {
            public static final FoodComponent ANCIENT_FRUIT = new FoodComponent.Builder().nutrition(4).saturationModifier(0.8F).statusEffect(new StatusEffectInstance(EBStatusEffects.REACHING, 600, 1), 1.0F).alwaysEdible().build();
        }
    }
}
