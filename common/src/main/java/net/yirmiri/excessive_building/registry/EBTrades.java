package net.yirmiri.excessive_building.registry;

import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.yirmiri.excessive_building.EBConfig;

public class EBTrades {
    public static final int DEFAULT_MAX_USES = 12;
    public static final int COMMON_MAX_USES = 16;
    public static final int RARE_MAX_USES = 3;
    public static final int NOVICE_SELL_XP = 1; //lv1
    public static final int NOVICE_BUY_XP = 2; //lv1
    public static final int APPRENTICE_SELL_XP = 5; //lv2
    public static final int APPRENTICE_BUY_XP = 10; //lv2
    public static final int JOURNEYMAN_SELL_XP = 10; //lv3
    public static final int JOURNEYMAN_BUY_XP = 20; //lv3
    public static final int EXPERT_SELL_XP = 15; //lv4
    public static final int EXPERT_BUY_XP = 30; //lv4
    public static final int MASTER_TRADE_XP = 30; //lv5
    public static final float LOW_PRICE_MULTIPLIER = 0.05F;
    public static final float HIGH_PRICE_MULTIPLIER = 0.2F;
//TODO
    public static void loadTrades() {
//        if (EBConfig.ENABLE_EB_VILLAGER_TRADES.get()) {
//            TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 5,
//                    factories -> {
//                        factories.add((entity, random) -> new MerchantOffer(
//                                new ItemCost(Items.EMERALD, 4), new ItemStack(EBBlocks.ASPHALT, 24),
//                                COMMON_MAX_USES, MASTER_TRADE_XP, LOW_PRICE_MULTIPLIER));
//                    });
//
//            TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 3,
//                    factories -> {
//                        factories.add((entity, random) -> new MerchantOffer(
//                                new ItemCost(Items.EMERALD, 2), new ItemStack(EBBlocks.ALMENTRA, 16),
//                                DEFAULT_MAX_USES, JOURNEYMAN_SELL_XP, LOW_PRICE_MULTIPLIER));
//                    });
//        }
    }
}
