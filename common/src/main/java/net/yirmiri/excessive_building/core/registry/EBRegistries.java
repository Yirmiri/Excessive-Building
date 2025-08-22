package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.services.RLRegistryHelper;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class EBRegistries {
    public static final WoodType ANCIENT = RLRegistryHelper.registerWoodType(new WoodType("ancient", BlockSetType.OAK));

    public static void loadRegistries() {

    }
}
