package com.baisylia.culturaldelights.refabricated;


import com.baisylia.culturaldelights.Config;
import com.baisylia.culturaldelights.item.ModItems;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

public class CDVillagerTrade {

  public static void init() {
 //As the config cannot be loaded on init, we must do this.
  ServerLifecycleEvents.SERVER_STARTING.register(server -> {
   onVillagerTrades();
  onWandererTrades();
   });
}

public static void onVillagerTrades() {
if (!Config.FARMERS_BUY_CD_CROPS.get()) return;

 TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, (trades) -> {
   trades.add(emeraldForItemsTrade(ModItems.EGGPLANT.get(), 26, 16, 2));
   trades.add(emeraldForItemsTrade(ModItems.AVOCADO.get(), 26, 16, 2));
   trades.add(emeraldForItemsTrade(ModItems.CUCUMBER.get(), 26, 16, 2));
   trades.add(emeraldForItemsTrade(ModItems.CORN_COB.get(), 26, 16, 2));
  });

  TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2, (trades) -> {
  trades.add(emeraldForItemsTrade(ModItems.EGGPLANT.get(), 16, 16, 5));
  trades.add(emeraldForItemsTrade(ModItems.AVOCADO.get(), 20, 16, 5));
 trades.add(emeraldForItemsTrade(ModItems.CUCUMBER.get(), 20, 16, 5));
 trades.add(emeraldForItemsTrade(ModItems.CORN_COB.get(), 26, 16, 5));
});
}

 public static void onWandererTrades() {
 if (Config.WANDERING_TRADER_SELLS_CD_ITEMS.get()) {
  TradeOfferHelper.registerWanderingTraderOffers(1, (trades) -> {
 trades.add(itemForEmeraldTrade(ModItems.AVOCADO_SAPLING.get(), 1, 12));
 trades.add(itemForEmeraldTrade(ModItems.EGGPLANT_SEEDS.get(), 1, 12));
 trades.add(itemForEmeraldTrade(ModItems.CUCUMBER_SEEDS.get(), 1, 12));
 trades.add(itemForEmeraldTrade(ModItems.PICKLE.get(), 1, 12));
 trades.add(itemForEmeraldTrade(ModItems.CORN_KERNELS.get(), 1, 12));
});
  }
 }

 public static VillagerTrades.ItemListing emeraldForItemsTrade(ItemLike item, int count, int maxTrades, int xp) {
 return new VillagerTrades.EmeraldForItems(item, count, maxTrades, xp);
  }

 public static VillagerTrades.ItemListing itemForEmeraldTrade(ItemLike item, int maxTrades, int xp) {
     return new VillagerTrades.ItemsForEmeralds(new ItemStack(item), 1, 1, maxTrades, xp, 0.05F);
  }

}
