package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.RLServices;
import net.minecraft.world.item.BoatItem;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.item.GauntletItem;
import net.yirmiri.excessive_building.common.item.MalletItem;
import net.yirmiri.excessive_building.common.util.EBProperties;
import net.yirmiri.excessive_building.common.util.EBUtil;
import net.yirmiri.excessive_building.core.init.EBTiers;
import net.yirmiri.excessive_building.core.init.EBTags;

import java.util.function.Supplier;

public class EBItems {
    //TOOLS
    public static final Supplier<Item> GAUNTLET = register("gauntlet", () -> new GauntletItem(EBTiers.GAUNTLET, EBProperties.ItemP.GAUNTLET));
    public static final Supplier<Item> MALLET = register("mallet", () -> new MalletItem(EBTiers.MALLET, EBTags.BlockT.MINEABLE_WITH_BLUNT_FORCE, EBProperties.ItemP.MALLET));

    //INGREDIENTS
    public static final Supplier<Item> CORALSOIL_CLAY_BALL = register("coralsoil_clay_ball", () -> new Item(EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> LAVENDER_CLAY_BALL = register("lavender_clay_ball", () -> new Item(EBProperties.ItemP.GENERIC));
    public static final Supplier<Item> SAGE_CLAY_BALL = register("sage_clay_ball", () -> new Item(EBProperties.ItemP.GENERIC));

    //ANCIENT
    public static final Supplier<Item> ANCIENT_FRUIT = register("ancient_fruit", () -> new Item(EBProperties.ItemP.ANCIENT_FRUIT));
    public static final Supplier<Item> ANCIENT_BOAT = register("ancient_boat", () -> new BoatItem(false, EBUtil.ANCIENT_BOAT, EBProperties.ItemP.GENERIC_1));
    public static final Supplier<Item> ANCIENT_CHEST_BOAT = register("ancient_chest_boat", () -> new BoatItem(true, EBUtil.ANCIENT_BOAT, EBProperties.ItemP.GENERIC_1));
    public static final Supplier<Item> ANCIENT_SIGN = register("ancient_sign", () -> new SignItem(new Item.Properties().stacksTo(16), EBBlocks.ANCIENT_SIGN.get(), EBBlocks.ANCIENT_WALL_SIGN.get()));
    public static final Supplier<Item> ANCIENT_HANGING_SIGN = register("ancient_hanging_sign", () -> new HangingSignItem(EBBlocks.ANCIENT_HANGING_SIGN.get(), EBBlocks.ANCIENT_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    //WINTERGREEN
    public static final Supplier<Item> WINTER_BERRIES = register("winter_berries", () -> new Item(EBProperties.ItemP.WINTER_BERRIES));
    public static final Supplier<Item> WINTERGREEN_BOAT = register("wintergreen_boat", () -> new BoatItem(false, EBUtil.WINTERGREEN_BOAT, EBProperties.ItemP.GENERIC_1));
    public static final Supplier<Item> WINTERGREEN_CHEST_BOAT = register("wintergreen_chest_boat", () -> new BoatItem(true, EBUtil.WINTERGREEN_BOAT, EBProperties.ItemP.GENERIC_1));
    public static final Supplier<Item> WINTERGREEN_SIGN = register("wintergreen_sign", () -> new SignItem(new Item.Properties().stacksTo(16), EBBlocks.WINTERGREEN_SIGN.get(), EBBlocks.WINTERGREEN_WALL_SIGN.get()));
    public static final Supplier<Item> WINTERGREEN_HANGING_SIGN = register("wintergreen_hanging_sign", () -> new HangingSignItem(EBBlocks.WINTERGREEN_HANGING_SIGN.get(), EBBlocks.WINTERGREEN_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    private static Supplier<Item> register(String id, Supplier<Item> item) {
        return RLServices.REGISTRY.registerItem(ExcessiveBuilding.MOD_ID, id, item);
    }

    public static void load() {
    }
}
