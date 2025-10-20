package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.item.BoatItem;
import net.minecraft.world.item.Item;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.item.MalletItem;
import net.yirmiri.excessive_building.common.util.EBMaterials;
import net.yirmiri.excessive_building.common.util.EBProperties;
import net.yirmiri.excessive_building.common.util.EBUtil;
import net.yirmiri.excessive_building.core.init.EBTags;
import net.yirmiri.excessive_building.common.item.GauntletItem;

import java.util.function.Supplier;

public class EBItems {
    //TOOLS
    public static final Supplier<Item> MALLET = register("mallet", () -> new MalletItem(2, -3.0F, EBMaterials.MALLET, EBTags.BlockT.MINEABLE_WITH_MALLET, EBProperties.ItemP.AMETHYST_TOOL));
    public static final Supplier<Item> GAUNTLET = register("gauntlet", () -> new GauntletItem(1, -2.5F, EBMaterials.GAUNTLET, EBTags.BlockT.MINEABLE_WITH_MALLET, EBProperties.ItemP.AMETHYST_TOOL));

    //ANCIENT
    public static final Supplier<Item> ICHOR_FRUIT = register("ichor_fruit", () -> new Item(EBProperties.ItemP.ICHOR_FRUIT));
    public static final Supplier<Item> ANCIENT_BOAT = register("ancient_boat", () -> new BoatItem(false, EBUtil.ANCIENT_BOAT, EBProperties.ItemP.GENERIC.stacksTo(1)));
    public static final Supplier<Item> ANCIENT_CHEST_BOAT = register("ancient_chest_boat", () -> new BoatItem(true, EBUtil.ANCIENT_BOAT, EBProperties.ItemP.GENERIC.stacksTo(1)));

    private static Supplier<Item> register(String id, Supplier<Item> item) {
        return Services.REGISTRY.registerItem(ExcessiveBuilding.MOD_ID, id, item);
    }

    public static void loadItems() {
    }
}
