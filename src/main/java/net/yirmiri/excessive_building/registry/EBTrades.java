package net.yirmiri.excessive_building.registry;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;

public class EBTrades {
    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 5,
        factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new TradedItem(Items.EMERALD, 4), new ItemStack(EBBlocks.ASPHALT, 24), 16, 30, 0.05f));
        });
    }
}
