package net.yirmiri.excessive_building.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.yirmiri.excessive_building.item.ConfigurableBlockItem;
import net.yirmiri.excessive_building.item.ConfigurableItem;
import net.yirmiri.excessive_building.platform.Services;
import net.yirmiri.excessive_building.util.EBProperties;

import java.util.Optional;
import java.util.function.Supplier;

public class EBItems {
    //BLOCK ITEMS
    public static final Supplier<Item> NETHERITE_BRICKS = register("netherite_bricks", () -> new ConfigurableBlockItem(Services.CONFIG.enableResourceBricks(), Optional.empty(), EBBlocks.NETHERITE_BRICKS.get(), EBProperties.ItemP.NETHERITE));
    public static final Supplier<Item> NETHERITE_BRICK_STAIRS = register("netherite_brick_stairs", () -> new ConfigurableBlockItem(Services.CONFIG.enableResourceBricks(), Optional.empty(), EBBlocks.NETHERITE_BRICK_STAIRS.get(), EBProperties.ItemP.NETHERITE));
    public static final Supplier<Item> NETHERITE_BRICK_SLAB = register("netherite_brick_slab", () -> new ConfigurableBlockItem(Services.CONFIG.enableResourceBricks(), Optional.empty(), EBBlocks.NETHERITE_BRICK_SLAB.get(), EBProperties.ItemP.NETHERITE));
    public static final Supplier<Item> NETHERITE_BRICK_VERTICAL_STAIRS = register("netherite_brick_vertical_stairs", () -> new ConfigurableBlockItem(Services.CONFIG.enableResourceBricks(), Optional.of(Services.CONFIG.enableVerticalStairs()), EBBlocks.NETHERITE_BRICK_VERTICAL_STAIRS.get(), EBProperties.ItemP.NETHERITE));

    //SIGNS
    public static final Supplier<Item> ANCIENT_SIGN = register("ancient_sign", () -> new SignItem(new Item.Properties().stacksTo(16), EBBlocks.ANCIENT_SIGN.get(), EBBlocks.ANCIENT_WALL_SIGN.get()));
    public static final Supplier<Item> ANCIENT_HANGING_SIGN = register("ancient_hanging_sign", () -> new HangingSignItem(EBBlocks.ANCIENT_HANGING_SIGN.get(), EBBlocks.ANCIENT_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final Supplier<Item> GLOOM_SIGN = register("gloom_sign", () -> new SignItem(new Item.Properties().stacksTo(16), EBBlocks.GLOOM_SIGN.get(), EBBlocks.GLOOM_WALL_SIGN.get()));
    public static final Supplier<Item> GLOOM_HANGING_SIGN = register("gloom_hanging_sign", () -> new HangingSignItem(EBBlocks.GLOOM_HANGING_SIGN.get(), EBBlocks.GLOOM_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    //FOOD
    public static final Supplier<Item> ANCIENT_FRUIT = register("ancient_fruit", () -> new Item(EBProperties.ItemP.ANCIENT_FRUIT));

    //SHERDS
    public static final Supplier<Item> ROYALTY_POTTERY_SHERD = register("royalty_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> ANCIENT_POTTERY_SHERD = register("ancient_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> BITTER_POTTERY_SHERD = register("bitter_pottery_sherd",  () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> BOIN_POTTERY_SHERD = register("boin_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> BUSTLING_POTTERY_SHERD = register("bustling_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> CHECKERED_POTTERY_SHERD = register("checkered_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> DECAY_POTTERY_SHERD = register("decay_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> DESTRUCTION_POTTERY_SHERD = register("destruction_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> FORWARDS_POTTERY_SHERD = register("forwards_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> HEXXED_POTTERY_SHERD = register("hexxed_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> KITTEH_POTTERY_SHERD = register("kitteh_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> LIFE_POTTERY_SHERD = register("life_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> MESMERIZE_POTTERY_SHERD = register("mesmerize_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> PORTAL_POTTERY_SHERD = register("portal_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> POTTERY_POTTERY_SHERD = register("pottery_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> RING_POTTERY_SHERD = register("ring_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> SNOUT_POTTERY_SHERD = register("snout_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> SPRITE_POTTERY_SHERD = register("sprite_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> TWINS_POTTERY_SHERD = register("twins_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> WRATHFUL_POTTERY_SHERD = register("wrathful_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> IS_THAT_POTTERY_SHERD = register("is_that_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> KOKOS_BUG_POTTERY_SHERD = register("kokos_bug_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> THIEF_POTTERY_SHERD = register("thief_pottery_sherd", () -> new ConfigurableItem(Services.CONFIG.enableExcessiveBuildingPotterySherds(), EBProperties.ItemP.GENERIC));

    private static <T extends Item> Supplier<T> register(String name, Supplier<T> itemSupplier) {
        return Services.REGISTRY.register(BuiltInRegistries.ITEM, name, itemSupplier);
    }

    public static void register() {
    }
}
