package net.yirmiri.excessive_building.registry;

import net.minecraft.world.item.Item;
import net.yirmiri.excessive_building.platform.Services;
import net.yirmiri.excessive_building.util.EBProperties;

import java.util.function.Supplier;

public class EBItems {
    //MISC
    public static final Supplier<Item> TEST_ITEM = register("test_item", () -> new Item(EBProperties.ItemP.GENERIC));

    private static <T extends Item> Supplier<T> register(String id, Supplier<T> item) {
        return Services.REGISTRY.registerItem(id, item);
    }

    public static void loadItems() {
    }
}