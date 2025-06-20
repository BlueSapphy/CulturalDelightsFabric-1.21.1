package com.baisylia.culturaldelights;

import com.baisylia.culturaldelights.block.ModBlocks;
import com.baisylia.culturaldelights.item.ModItems;
//import com.baisylia.culturaldelights.refabricated.CDCompostableHelper;
import com.baisylia.culturaldelights.refabricated.CDLootTableHelper;
//import com.baisylia.culturaldelights.refabricated.CDVillagerTrade;
import com.baisylia.culturaldelights.refabricated.CDVillagerTrade;
import com.baisylia.culturaldelights.tab.ModCreativeModeTabs;
import com.baisylia.culturaldelights.world.ModPlacedFeatures;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CulturalDelights implements ModInitializer {
	public static final String MOD_ID = "culturaldelights";


	public static final Logger LOGGER = LogManager.getLogger();

	@Override
	public void onInitialize() {
		ModBlocks.register();
		ModItems.register();
		ModCreativeModeTabs.register();
		ModPlacedFeatures.register();
		CDLootTableHelper.init();
		Config.register();
		CDVillagerTrade.init();

		//fuel fabric is weird
		FuelRegistry.INSTANCE.add(ModBlocks.AVOCADO_SAPLING.get(), 50);
		FuelRegistry.INSTANCE.add(ModBlocks.AVOCADO_LOG.get(), 50);
		FuelRegistry.INSTANCE.add(ModBlocks.AVOCADO_WOOD.get(), 50);

		// composting is also weird af too
		CompostingChanceRegistry.INSTANCE.add(ModItems.CUCUMBER_SEEDS.get(), 0.25f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CORN_KERNELS.get(), 0.25f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.EGGPLANT_SEEDS.get(), 0.25f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.AVOCADO_PIT.get(), 0.25f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.AVOCADO_SAPLING.get(), 0.45f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.AVOCADO_TOAST.get(), 0.45f);

		CompostingChanceRegistry.INSTANCE.add(ModItems.CUT_CUCUMBER.get(), 0.35f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CUT_AVOCADO.get(), 0.35f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CUT_EGGPLANT.get(), 0.35f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CUT_PICKLE.get(), 0.35f);

		CompostingChanceRegistry.INSTANCE.add(ModItems.AVOCADO.get(), 0.45f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CORN_COB.get(), 0.45f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CUCUMBER.get(), 0.45f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.EGGPLANT.get(), 0.45f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.PICKLE.get(), 0.45f);

		CompostingChanceRegistry.INSTANCE.add(ModItems.WILD_CORN.get(), 0.65f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.WILD_CUCUMBERS.get(), 0.65f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.WILD_EGGPLANTS.get(), 0.65f);








	}
	public static ResourceLocation res(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}
}