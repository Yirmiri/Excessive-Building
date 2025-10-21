package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.item.BoatItem;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
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
    public static final Supplier<Item> ANCIENT_FRUIT = register("ancient_fruit", () -> new Item(EBProperties.ItemP.ANCIENT));
    public static final Supplier<Item> ANCIENT_BOAT = register("ancient_boat", () -> new BoatItem(false, EBUtil.ANCIENT_BOAT, EBProperties.ItemP.GENERIC.stacksTo(1)));
    public static final Supplier<Item> ANCIENT_CHEST_BOAT = register("ancient_chest_boat", () -> new BoatItem(true, EBUtil.ANCIENT_BOAT, EBProperties.ItemP.GENERIC.stacksTo(1)));
    public static final Supplier<Item> ANCIENT_SIGN = register("ancient_sign", () -> new SignItem(new Item.Properties().stacksTo(16), EBBlocks.ANCIENT_SIGN.get(), EBBlocks.ANCIENT_WALL_SIGN.get()));
    public static final Supplier<Item> ANCIENT_HANGING_SIGN = register("ancient_hanging_sign", () -> new HangingSignItem(EBBlocks.ANCIENT_HANGING_SIGN.get(), EBBlocks.ANCIENT_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    private static Supplier<Item> register(String id, Supplier<Item> item) {
        return Services.REGISTRY.registerItem(ExcessiveBuilding.MOD_ID, id, item);
    }

    public static void loadItems() {
    }
}
