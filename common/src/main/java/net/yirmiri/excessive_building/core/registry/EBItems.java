package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.item.BoatItem;
import net.minecraft.world.item.Item;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.item.RadianceMalletItem;
import net.yirmiri.excessive_building.common.util.EBMaterials;
import net.yirmiri.excessive_building.common.util.EBProperties;
import net.yirmiri.excessive_building.common.util.EBUtil;
import net.yirmiri.excessive_building.core.init.EBTags;
import net.yirmiri.excessive_building.common.item.RadianceGauntletItem;

import java.util.function.Supplier;

public class EBItems {
    //RADIANCE
    public static final Supplier<Item> RADIANCE_CRYSTAL = register("radiance_crystal", () -> new Item(EBProperties.ItemP.UNCOMMON));
    public static final Supplier<Item> RADIANCE_INGOT = register("radiance_ingot", () -> new Item(EBProperties.ItemP.UNCOMMON));
    public static final Supplier<Item> RADIANCE_MALLET = register("radiance_mallet", () -> new RadianceMalletItem(2, -3.0F, EBMaterials.RADIANCE_MALLET, EBTags.BlockT.MINEABLE_WITH_MALLET, EBProperties.ItemP.UNCOMMON));
    public static final Supplier<Item> RADIANCE_GAUNTLET = register("radiance_gauntlet", () -> new RadianceGauntletItem(1, -2.5F, EBMaterials.RADIANCE_GAUNTLET, EBTags.BlockT.MINEABLE_WITH_MALLET, EBProperties.ItemP.RADIANCE_GAUNTLET));

    //ANCIENT
    public static final Supplier<Item> ANCIENT_BOAT = register("ancient_boat", () -> new BoatItem(false, EBUtil.ANCIENT_BOAT, EBProperties.ItemP.GENERIC.stacksTo(1)));
    public static final Supplier<Item> ANCIENT_CHEST_BOAT = register("ancient_chest_boat", () -> new BoatItem(true, EBUtil.ANCIENT_BOAT, EBProperties.ItemP.GENERIC.stacksTo(1)));

    private static Supplier<Item> register(String id, Supplier<Item> item) {
        return Services.REGISTRY.registerItem(ExcessiveBuilding.MOD_ID, id, item);
    }

    public static void loadItems() {
    }
}
