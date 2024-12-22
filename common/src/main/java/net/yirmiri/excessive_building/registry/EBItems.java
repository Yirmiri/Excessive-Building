package net.yirmiri.excessive_building.registry;

import net.minecraft.core.Holder;
import net.minecraft.world.item.Item;
import net.yirmiri.excessive_building.platform.Services;
import net.yirmiri.excessive_building.util.EBProperties;

import java.util.function.Supplier;

public class EBItems {
    //MISC
    public static final Holder<Item> TEST_ITEM = Services.REGISTRY.registerItem("test_item", new Item(EBProperties.ItemP.GENERIC));

    public static void loadItems() {
    }
}