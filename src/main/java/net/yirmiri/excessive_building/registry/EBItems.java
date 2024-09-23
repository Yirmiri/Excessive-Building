package net.yirmiri.excessive_building.registry;

import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.item.HammerItem;
import net.yirmiri.excessive_building.item.configurable.EBPotterySherdItem;
import net.yirmiri.excessive_building.item.configurable.ResourceBrickBlockItem;
import net.yirmiri.excessive_building.item.configurable.ResourceBrickVerticalStairsBlockItem;
import net.yirmiri.excessive_building.util.EBProperties;

public class EBItems {
    //UTILITIES
    public static final Item HAMMER = register("hammer", new HammerItem(ToolMaterials.IRON, EBProperties.ItemP.HAMMER));

    //BLOCK ITEMS
    public static final Item NETHERITE_BRICKS = register("netherite_bricks", new ResourceBrickBlockItem(EBBlocks.NETHERITE_BRICKS, EBProperties.ItemP.NETHERITE));
    public static final Item NETHERITE_BRICK_STAIRS = register("netherite_brick_stairs", new ResourceBrickBlockItem(EBBlocks.NETHERITE_BRICK_STAIRS, EBProperties.ItemP.NETHERITE));
    public static final Item NETHERITE_BRICK_SLAB = register("netherite_brick_slab", new ResourceBrickBlockItem(EBBlocks.NETHERITE_BRICK_VERTICAL_STAIRS, EBProperties.ItemP.NETHERITE));
    public static final Item NETHERITE_BRICK_VERTICAL_STAIRS = register("netherite_brick_vertical_stairs", new ResourceBrickVerticalStairsBlockItem(EBBlocks.NETHERITE_BRICK_SLAB, EBProperties.ItemP.NETHERITE));

    //SIGNS
    public static final Item ANCIENT_SIGN = register("ancient_sign", new SignItem(new Item.Settings().maxCount(16), EBBlocks.ANCIENT_SIGN, EBBlocks.ANCIENT_WALL_SIGN));
    public static final Item ANCIENT_HANGING_SIGN = register("ancient_hanging_sign", new HangingSignItem(EBBlocks.ANCIENT_HANGING_SIGN, EBBlocks.ANCIENT_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));

    public static final Item GLOOM_SIGN = register("gloom_sign", new SignItem(new Item.Settings().maxCount(16), EBBlocks.GLOOM_SIGN, EBBlocks.GLOOM_WALL_SIGN));
    public static final Item GLOOM_HANGING_SIGN = register("gloom_hanging_sign", new HangingSignItem(EBBlocks.GLOOM_HANGING_SIGN, EBBlocks.GLOOM_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));

    //FOOD
    public static final Item ANCIENT_FRUIT = register("ancient_fruit", new Item(EBProperties.ItemP.ANCIENT_FRUIT));

    //SHERDS
    public static final Item ROYALTY_POTTERY_SHERD = register("royalty_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item ANCIENT_POTTERY_SHERD = register("ancient_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item BITTER_POTTERY_SHERD = register("bitter_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item BOIN_POTTERY_SHERD = register("boin_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item BUSTLING_POTTERY_SHERD = register("bustling_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item CHECKERED_POTTERY_SHERD = register("checkered_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item DECAY_POTTERY_SHERD = register("decay_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item DESTRUCTION_POTTERY_SHERD = register("destruction_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item FORWARDS_POTTERY_SHERD = register("forwards_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item HEXXED_POTTERY_SHERD = register("hexxed_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item KITTEH_POTTERY_SHERD = register("kitteh_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item LIFE_POTTERY_SHERD = register("life_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item MESMERIZE_POTTERY_SHERD = register("mesmerize_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item PORTAL_POTTERY_SHERD = register("portal_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item POTTERY_POTTERY_SHERD = register("pottery_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item RING_POTTERY_SHERD = register("ring_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item SNOUT_POTTERY_SHERD = register("snout_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item SPRITE_POTTERY_SHERD = register("sprite_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item TWINS_POTTERY_SHERD = register("twins_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item WRATHFUL_POTTERY_SHERD = register("wrathful_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item IS_THAT_POTTERY_SHERD = register("is_that_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item KOKOS_BUG_POTTERY_SHERD = register("kokos_bug_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Item THIEF_POTTERY_SHERD = register("thief_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));

    private static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ExcessiveBuilding.MOD_ID, id), item);
    }

    public static void loadItems() {
    }
}
