package net.yirmiri.excessive_building.common.util;

import net.azurune.runiclib.core.library.misc.RLToolActions;
import net.azurune.runiclib.core.platform.services.RLRegistryHelper;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.yirmiri.excessive_building.core.registry.EBBlocks;

public class EBRegistries {
    //public static final WoodType ANCIENT = WoodType.register(new WoodType("excessive_building:ancient", BlockSetType.OAK));
    //public static final WoodType ANCIENT = RLRegistryHelper.registerWoodType(new WoodType("ancient", BlockSetType.OAK));
    //public static final ModelLayerLocation ANCIENT_SIGN = ModelLayers.createSignModelName(WoodType.CHERRY);
    //public static final ModelLayerLocation ANCIENT_HANGING_SIGN = ModelLayers.createHangingSignModelName(WoodType.CHERRY);

    public static void load() {
        registerStrippables();
    }

    private static void registerStrippables() {
        RLToolActions.addStrippable(EBBlocks.ANCIENT_LOG.get(), EBBlocks.STRIPPED_ANCIENT_LOG.get());
        RLToolActions.addStrippable(EBBlocks.ANCIENT_WOOD.get(), EBBlocks.STRIPPED_ANCIENT_WOOD.get());
    }
}