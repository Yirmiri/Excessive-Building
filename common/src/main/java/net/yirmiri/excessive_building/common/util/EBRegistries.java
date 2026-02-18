package net.yirmiri.excessive_building.common.util;

import net.azurune.runiclib.core.library.misc.RLToolActions;
import net.yirmiri.excessive_building.core.registry.EBBlocks;

public class EBRegistries {
    public static void load() {
        registerStrippables();
    }

    private static void registerStrippables() {
        RLToolActions.addStrippable(EBBlocks.ANCIENT_LOG.get(), EBBlocks.STRIPPED_ANCIENT_LOG.get());
        RLToolActions.addStrippable(EBBlocks.ANCIENT_WOOD.get(), EBBlocks.STRIPPED_ANCIENT_WOOD.get());
    }
}