package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.item.Item;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.util.EBMaterials;
import net.yirmiri.excessive_building.common.util.EBProperties;
import net.yirmiri.excessive_building.core.init.EBTags;
import net.yirmiri.excessive_building.common.item.RadianceGauntletItem;

import java.util.function.Supplier;

public class EBItems {
    //RADIANCE
    public static final Supplier<Item> RADIANCE_CRYSTAL = register("radiance_crystal", () -> new Item(EBProperties.ItemP.UNCOMMON));
    public static final Supplier<Item> RADIANCE_INGOT = register("radiance_ingot", () -> new Item(EBProperties.ItemP.UNCOMMON));
    public static final Supplier<Item> RADIANCE_POWERCELL = register("radiance_powercell", () -> new Item(EBProperties.ItemP.UNCOMMON));
    public static final Supplier<Item> RADIANCE_GAUNTLET = register("radiance_gauntlet", () -> new RadianceGauntletItem(1, -2.0F, EBMaterials.RADIANCE, EBTags.Blocks.MINEABLE_WITH_GAUNTLET, EBProperties.ItemP.RADIANCE_GAUNTLET));

    private static Supplier<Item> register(String id, Supplier<Item> item) {
        return Services.REGISTRY.registerItem(ExcessiveBuilding.MOD_ID, id, item);
    }

    public static void loadItems() {
    }
}
