package net.yirmiri.excessive_building.other;


import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.register.EBBlocks;
import net.yirmiri.excessive_building.register.EBItems;

import java.util.List;

@Mod.EventBusSubscriber(modid = ExcessiveBuilding.MODID)
public class EBVillagers {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {

        //LEVEL 1 TRADES - STONE MASON
        if (event.getType() == VillagerProfession.MASON) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            int villagerLevel = 1; //villager level (out of 5)

            trades.get(villagerLevel).add((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1), //cost
                    new ItemStack(EBBlocks.COBBLESTONE_BRICKS.get(), 24), //offer
                    16, 2, 0.05F)); //stock, xp, price multiplier

            trades.get(villagerLevel).add((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1), 
                    new ItemStack(EBBlocks.COBBLED_DEEPSLATE_BRICKS.get(), 24), 
                    16, 2, 0.05F)); 
        }

        //LEVEL 2 TRADES - STONE MASON
        if (event.getType() == VillagerProfession.MASON) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            int villagerLevel = 2; //villager level (out of 5)

            trades.get(villagerLevel).add((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1), 
                    new ItemStack(Blocks.CALCITE, 16), 
                    16, 5, 0.05F)); 

            trades.get(villagerLevel).add((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1), 
                    new ItemStack(Blocks.TUFF, 16), 
                    16, 5, 0.05F)); 
        }

        //LEVEL 3 TRADES - STONE MASON
        if (event.getType() == VillagerProfession.MASON) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            int villagerLevel = 3; //villager level (out of 5)

            trades.get(villagerLevel).add((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1), 
                    new ItemStack(EBBlocks.POLISHED_ANDESITE_BRICKS.get(), 24), 
                    16, 10, 0.05F)); 

            trades.get(villagerLevel).add((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1), 
                    new ItemStack(EBBlocks.POLISHED_GRANITE_BRICKS.get(), 24), 
                    16, 10, 0.05F)); 

            trades.get(villagerLevel).add((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1), 
                    new ItemStack(EBBlocks.POLISHED_DIORITE_BRICKS.get(), 24), 
                    16, 10, 0.05F)); 
        }

        //LEVEL 5 TRADES - STONE MASON
        if (event.getType() == VillagerProfession.MASON) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            int villagerLevel = 5; //villager level (out of 5)

            trades.get(villagerLevel).add((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2), 
                    new ItemStack(EBBlocks.ASPHALT.get(), 24), 
                    16, 30, 0.05F)); 
        }

        //LEVEL 5 TRADES - SHEPHERD
        if (event.getType() == VillagerProfession.SHEPHERD) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            int villagerLevel = 5; //villager level (out of 5)

            trades.get(villagerLevel).add((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1), 
                    new ItemStack(EBBlocks.RAINBOW_WOOL.get(), 4), 
                    8, 30, 0.05F)); 
        }

        //LEVEL 2 TRADES - CLERIC
        if (event.getType() == VillagerProfession.CLERIC) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            int villagerLevel = 2; //villager level (out of 5)

            trades.get(villagerLevel).add((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1), 
                    new ItemStack(Items.AMETHYST_SHARD, 8), 
                    16, 5, 0.05F)); 
        }

        //LEVEL 3 TRADES - CLERIC
        if (event.getType() == VillagerProfession.CLERIC) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            int villagerLevel = 3; //villager level (out of 5)

            trades.get(villagerLevel).add((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2), 
                    new ItemStack(Items.PRISMARINE_CRYSTALS, 8), 
                    16, 5, 0.05F)); 

            trades.get(villagerLevel).add((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2), 
                    new ItemStack(EBItems.FIERY_SHARDS.get(), 8),
                    16, 10, 0.05F)); 

            trades.get(villagerLevel).add((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2), 
                    new ItemStack(EBItems.KYANITE_SHARDS.get(), 8), 
                    16, 10, 0.05F)); 

            trades.get(villagerLevel).add((trader, random) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2), 
                    new ItemStack(EBItems.MIRALEN_SHARDS.get(), 8), 
                    16, 10, 0.05F)); 
        }
    }

        //WANDERING TRADER TRADES
        public static void addCustomWanderingTrades(WandererTradesEvent event) {
            List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
            List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

            genericTrades.add((pTrader, prandomom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1), 
                    new ItemStack(EBBlocks.ROSE.get(), 1),
                    12, 5, 0.05f)); //max uses, xp, multiplier

            genericTrades.add((pTrader, prandomom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1), 
                    new ItemStack(EBBlocks.CYAN_ROSE.get(), 1),
                    12, 5, 0.05f)); //max uses, xp, multiplier

            genericTrades.add((pTrader, prandomom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2), 
                    new ItemStack(EBBlocks.WHITE_ROSE.get(), 1),
                    12, 5, 0.05f)); //max uses, xp, multiplier

            genericTrades.add((pTrader, prandomom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2), 
                    new ItemStack(EBBlocks.ROSE_BUNDLE.get(), 1),
                    12, 5, 0.05f)); //max uses, xp, multiplier

            genericTrades.add((pTrader, prandomom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1), 
                    new ItemStack(EBItems.ALGAE.get(), 12),
                    8, 5, 0.05f)); //max uses, xp, multiplier

            genericTrades.add((pTrader, prandomom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5), 
                    new ItemStack(EBBlocks.WILLOW_SAPLING.get(), 1),
                    8, 5, 0.05f)); //max uses, xp, multiplier

            genericTrades.add((pTrader, prandomom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5), 
                    new ItemStack(EBBlocks.RED_MAPLE_SAPLING.get(), 1),
                    8, 5, 0.05f)); //max uses, xp, multiplier

            genericTrades.add((pTrader, prandomom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5), 
                    new ItemStack(EBBlocks.ORANGE_MAPLE_SAPLING.get(), 1),
                    8, 5, 0.05f)); //max uses, xp, multiplier

            genericTrades.add((pTrader, prandomom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5), 
                    new ItemStack(EBBlocks.YELLOW_MAPLE_SAPLING.get(), 1),
                    8, 5, 0.05f)); //max uses, xp, multiplier

            genericTrades.add((pTrader, prandomom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5), 
                    new ItemStack(EBBlocks.ACORN.get(), 1),
                    16, 5, 0.05f)); //max uses, xp, multiplier

            genericTrades.add((pTrader, prandomom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5), 
                    new ItemStack(EBBlocks.GOLDEN_BIRCH_SAPLING.get(), 1),
                    8, 5, 0.05f)); //max uses, xp, multiplier
        }
}
