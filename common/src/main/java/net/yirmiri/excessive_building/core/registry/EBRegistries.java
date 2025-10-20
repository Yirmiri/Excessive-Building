package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.common.util.RLToolActions;
import net.azurune.runiclib.core.platform.services.RLRegistryHelper;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.yirmiri.excessive_building.core.mixin.PotionBrewingMixin;

public class EBRegistries {
    public static final WoodType ANCIENT = RLRegistryHelper.registerWoodType(new WoodType("ancient", BlockSetType.OAK));

    public static void loadRegistries() {
        registerStrippables();
        registerBrewingRecipes();
    }

    private static void registerBrewingRecipes() {
//        PotionBrewingMixin.excessiveBuilding$addMix(Potions.AWKWARD, EBItems.ICHOR_FRUIT.get(), EBPotions.REACHING.get());
//        PotionBrewingMixin.excessiveBuilding$addMix(EBPotions.REACHING.get(), Items.REDSTONE, EBPotions.LONG_REACHING.get());
//        PotionBrewingMixin.excessiveBuilding$addMix(EBPotions.REACHING.get(), Items.GLOWSTONE_DUST, EBPotions.STRONG_REACHING.get());

        PotionBrewingMixin.excessiveBuilding$addMix(Potions.AWKWARD, Items.AMETHYST_SHARD, EBPotions.RAPIDITY.get());
        PotionBrewingMixin.excessiveBuilding$addMix(EBPotions.RAPIDITY.get(), Items.REDSTONE, EBPotions.LONG_RAPIDITY.get());
        PotionBrewingMixin.excessiveBuilding$addMix(EBPotions.RAPIDITY.get(), Items.GLOWSTONE_DUST, EBPotions.STRONG_RAPIDITY.get());
    }

    private static void registerStrippables() {
        RLToolActions.addStrippable(EBBlocks.ANCIENT_WOODSET.getBlock("ancient_log").get(),
                EBBlocks.ANCIENT_WOODSET.getBlock("stripped_ancient_log").get());

        RLToolActions.addStrippable(EBBlocks.ANCIENT_WOODSET.getBlock("ancient_wood").get(),
                EBBlocks.ANCIENT_WOODSET.getBlock("stripped_ancient_wood").get());
    }
}
