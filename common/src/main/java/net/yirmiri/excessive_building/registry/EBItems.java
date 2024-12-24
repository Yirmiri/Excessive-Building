package net.yirmiri.excessive_building.registry;

import net.minecraft.core.Holder;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.yirmiri.excessive_building.item.HammerItem;
import net.yirmiri.excessive_building.item.WrenchItem;
import net.yirmiri.excessive_building.item.configurable.EBPotterySherdItem;
import net.yirmiri.excessive_building.item.configurable.ResourceBrickBlockItem;
import net.yirmiri.excessive_building.item.configurable.ResourceBrickVerticalStairsBlockItem;
import net.yirmiri.excessive_building.platform.Services;
import net.yirmiri.excessive_building.util.EBProperties;
import net.yirmiri.excessive_building.util.EBToolMaterials;

public class EBItems {
    //UTILITIES
    public static final Holder<Item> HAMMER = register("hammer", new HammerItem(EBToolMaterials.HAMMER, EBProperties.ItemP.HAMMER));
    public static final Holder<Item> WRENCH = register("wrench", new WrenchItem(EBProperties.ItemP.WRENCH));

    //BLOCK ITEMS
    public static final Holder<Item> NETHERITE_BRICKS = register("netherite_bricks", new ResourceBrickBlockItem(EBBlocks.NETHERITE_BRICKS.value(), EBProperties.ItemP.NETHERITE));
    public static final Holder<Item> NETHERITE_BRICK_STAIRS = register("netherite_brick_stairs", new ResourceBrickBlockItem(EBBlocks.NETHERITE_BRICK_STAIRS.value(), EBProperties.ItemP.NETHERITE));
    public static final Holder<Item> NETHERITE_BRICK_SLAB = register("netherite_brick_slab", new ResourceBrickBlockItem(EBBlocks.NETHERITE_BRICK_VERTICAL_STAIRS.value(), EBProperties.ItemP.NETHERITE));
    public static final Holder<Item> NETHERITE_BRICK_VERTICAL_STAIRS = register("netherite_brick_vertical_stairs", new ResourceBrickVerticalStairsBlockItem(EBBlocks.NETHERITE_BRICK_SLAB.value(), EBProperties.ItemP.NETHERITE));

    //SIGNS
    public static final Holder<Item> ANCIENT_SIGN = register("ancient_sign", new SignItem(new Item.Properties().stacksTo(16), EBBlocks.ANCIENT_SIGN.value(), EBBlocks.ANCIENT_WALL_SIGN.value()));
    public static final Holder<Item> ANCIENT_HANGING_SIGN = register("ancient_hanging_sign", new HangingSignItem(EBBlocks.ANCIENT_HANGING_SIGN.value(), EBBlocks.ANCIENT_WALL_HANGING_SIGN.value(), new Item.Properties().stacksTo(16)));

    public static final Holder<Item> GLOOM_SIGN = register("gloom_sign", new SignItem(new Item.Properties().stacksTo(16), EBBlocks.GLOOM_SIGN.value(), EBBlocks.GLOOM_WALL_SIGN.value()));
    public static final Holder<Item> GLOOM_HANGING_SIGN = register("gloom_hanging_sign", new HangingSignItem(EBBlocks.GLOOM_HANGING_SIGN.value(), EBBlocks.GLOOM_WALL_HANGING_SIGN.value(), new Item.Properties().stacksTo(16)));

    //FOOD
    public static final Holder<Item> ANCIENT_FRUIT = register("ancient_fruit", new Item(EBProperties.ItemP.ANCIENT_FRUIT));

    //SHERDS
    public static final Holder<Item> ROYALTY_POTTERY_SHERD = register("royalty_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> ANCIENT_POTTERY_SHERD = register("ancient_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> BITTER_POTTERY_SHERD = register("bitter_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> BOIN_POTTERY_SHERD = register("boin_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> BUSTLING_POTTERY_SHERD = register("bustling_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> CHECKERED_POTTERY_SHERD = register("checkered_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> DECAY_POTTERY_SHERD = register("decay_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> DESTRUCTION_POTTERY_SHERD = register("destruction_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> FORWARDS_POTTERY_SHERD = register("forwards_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> HEXXED_POTTERY_SHERD = register("hexxed_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> KITTEH_POTTERY_SHERD = register("kitteh_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> LIFE_POTTERY_SHERD = register("life_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> MESMERIZE_POTTERY_SHERD = register("mesmerize_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> PORTAL_POTTERY_SHERD = register("portal_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> POTTERY_POTTERY_SHERD = register("pottery_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> RING_POTTERY_SHERD = register("ring_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> SNOUT_POTTERY_SHERD = register("snout_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> SPRITE_POTTERY_SHERD = register("sprite_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> TWINS_POTTERY_SHERD = register("twins_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> WRATHFUL_POTTERY_SHERD = register("wrathful_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> IS_THAT_POTTERY_SHERD = register("is_that_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> KOKOS_BUG_POTTERY_SHERD = register("kokos_bug_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));
    public static final Holder<Item> THIEF_POTTERY_SHERD = register("thief_pottery_sherd", new EBPotterySherdItem(EBProperties.ItemP.GENERIC));

    private static Holder<Item> register(String id, Item item) {
        return Services.REGISTRY.registerItem(id, item);
    }

    public static void loadItems() {
    }
}
