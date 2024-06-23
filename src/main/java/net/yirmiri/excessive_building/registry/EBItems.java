package net.yirmiri.excessive_building.registry;

import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.util.EBProperties;

public class EBItems {

    //SIGNS
    public static final Item ANCIENT_SIGN = register("ancient_sign", new SignItem(EBProperties.ItemP.SIGN, EBBlocks.ANCIENT_SIGN, EBBlocks.ANCIENT_WALL_SIGN));
    public static final Item ANCIENT_HANGING_SIGN = register("ancient_hanging_sign", new HangingSignItem(EBBlocks.ANCIENT_HANGING_SIGN, EBBlocks.ANCIENT_WALL_HANGING_SIGN, EBProperties.ItemP.SIGN));

    //FOOD
    public static final Item ANCIENT_FRUIT = register("ancient_fruit", new Item(EBProperties.ItemP.ANCIENT_FRUIT));

    private static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ExcessiveBuilding.MOD_ID, id), item);
    }

    public static void registerEBItems() {
    }
}
