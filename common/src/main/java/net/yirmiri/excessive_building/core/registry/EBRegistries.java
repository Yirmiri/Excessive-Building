package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.common.util.RLToolActions;
import net.azurune.runiclib.core.platform.services.RLRegistryHelper;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class EBRegistries {
    public static final WoodType ANCIENT = RLRegistryHelper.registerWoodType(new WoodType("ancient", BlockSetType.OAK));

    public static void loadRegistries() {
        registerStrippables();
    }

    private static void registerStrippables() {
        RLToolActions.addStrippable(EBBlocks.ANCIENT_WOODSET.getBlock("ancient_log").get(),
                EBBlocks.ANCIENT_WOODSET.getBlock("stripped_ancient_log").get());

        RLToolActions.addStrippable(EBBlocks.ANCIENT_WOODSET.getBlock("ancient_wood").get(),
                EBBlocks.ANCIENT_WOODSET.getBlock("stripped_ancient_wood").get());
    }
}
