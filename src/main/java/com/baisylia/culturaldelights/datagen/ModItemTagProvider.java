package com.baisylia.culturaldelights.datagen;


import com.baisylia.culturaldelights.item.ModItems;
import com.baisylia.culturaldelights.tag.CDCommonTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.common.tag.CompatibilityTags;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }



    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.registerMinecraftTags();
        this.registerModTags();
        this.registerCommonTags();
        this.registerCompatibilityTags();

    }

    private void registerMinecraftTags() {
        getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS)
                .add(ModItems.WILD_EGGPLANTS.get())
                .add(ModItems.WILD_CUCUMBERS.get())
                .add(ModItems.WILD_CORN.get());
        getOrCreateTagBuilder(ItemTags.VILLAGER_PLANTABLE_SEEDS)
                .add(ModItems.EGGPLANT_SEEDS.get())
                .add(ModItems.CUCUMBER_SEEDS.get())
                .add(ModItems.CORN_KERNELS.get());
        getOrCreateTagBuilder(ItemTags.CHICKEN_FOOD)
                .add(ModItems.EGGPLANT_SEEDS.get())
                .add(ModItems.CUCUMBER_SEEDS.get())
                .add(ModItems.CORN_KERNELS.get());
        getOrCreateTagBuilder(ItemTags.PARROT_FOOD)
                .add(ModItems.EGGPLANT_SEEDS.get())
                .add(ModItems.CUCUMBER_SEEDS.get())
                .add(ModItems.CORN_KERNELS.get());


    }
    private void registerModTags() {
        getOrCreateTagBuilder(ModTags.WILD_CROPS_ITEM)
                .add(ModItems.WILD_EGGPLANTS.get())
                .add(ModItems.WILD_CUCUMBERS.get())
                .add(ModItems.WILD_CORN.get());


    }

    private void registerCommonTags() {
        getOrCreateTagBuilder(CDCommonTags.CROPS_CORN)
                .add(ModItems.CORN_COB.get());
        getOrCreateTagBuilder(CDCommonTags.CROPS_CUCUMBERS)
                .add(ModItems.CUCUMBER.get())
                .add(ModItems.CUT_CUCUMBER.get());
        getOrCreateTagBuilder(CDCommonTags.CROPS_EGGPLANT)
                .add(ModItems.EGGPLANT.get())
                .add(ModItems.WHITE_EGGPLANT.get())
                .add(ModItems.CUT_EGGPLANT.get());
        getOrCreateTagBuilder(CDCommonTags.SEEDS)
                .add(ModItems.EGGPLANT_SEEDS.get())
                .add(ModItems.CUCUMBER_SEEDS.get())
                .add(ModItems.CORN_KERNELS.get());
        getOrCreateTagBuilder(CDCommonTags.CROPS)
                .addTag(CDCommonTags.CROPS_CUCUMBERS)
                .addTag(CDCommonTags.CROPS_EGGPLANT)
                .addTag(CDCommonTags.CROPS_CORN);
        getOrCreateTagBuilder(CDCommonTags.FOODS_AVOCADO)
                .add(ModItems.AVOCADO.get())
                .add(ModItems.CUT_AVOCADO.get());
        getOrCreateTagBuilder(CDCommonTags.FOODS_CUCUMBERS)
                .add(ModItems.CUCUMBER.get())
                .add(ModItems.CUT_CUCUMBER.get());
        getOrCreateTagBuilder(CDCommonTags.FOODS_PICKLE)
                .add(ModItems.PICKLE.get())
                .add(ModItems.CUT_PICKLE.get());
        getOrCreateTagBuilder(CDCommonTags.FOODS_CORN)
                .add(ModItems.CORN_COB.get())
                .add(ModItems.SMOKED_CORN.get());
        getOrCreateTagBuilder(CDCommonTags.FOODS_EGGPLANT)
                .add(ModItems.EGGPLANT.get())
                .add(ModItems.SMOKED_EGGPLANT.get())
                .add(ModItems.WHITE_EGGPLANT.get())
                .add(ModItems.SMOKED_WHITE_EGGPLANT.get())
                .add(ModItems.SMOKED_CUT_EGGPLANT.get())
                .add(ModItems.CUT_EGGPLANT.get());
        getOrCreateTagBuilder(CommonTags.FOODS_TOMATO)
                .add(ModItems.SMOKED_TOMATO.get());
        getOrCreateTagBuilder(CommonTags.FOODS_DOUGH)
                .add(ModItems.CORN_DOUGH.get());
        getOrCreateTagBuilder(CDCommonTags.VEGETABLE)
                .add(ModItems.EGGPLANT.get())
                .add(ModItems.WHITE_EGGPLANT.get())
                .add(ModItems.CORN_COB.get());
        getOrCreateTagBuilder(CDCommonTags.FOODS_RAW_FISH)
                .add(ModItems.SQUID.get())
                .add(ModItems.GLOW_SQUID.get())
                .add(ModItems.RAW_CALAMARI.get());
        getOrCreateTagBuilder(CDCommonTags.FOODS_RAW_SQUID)
                .add(ModItems.SQUID.get())
                .add(ModItems.RAW_CALAMARI.get());
        getOrCreateTagBuilder(CDCommonTags.FOODS_COOKED_SQUID)
                .add(ModItems.COOKED_SQUID.get())
                .add(ModItems.COOKED_CALAMARI.get());
        getOrCreateTagBuilder(CDCommonTags.FOODS_COOKED_EGGPLANT)
                .add(ModItems.SMOKED_EGGPLANT.get())
                .add(ModItems.SMOKED_CUT_EGGPLANT.get());
        getOrCreateTagBuilder(CDCommonTags.FOODS_SOUP)
                .add(ModItems.CREAMED_CORN.get())
                .add(ModItems.SPICY_CURRY.get())
                .add(ModItems.POACHED_EGGPLANTS.get());
        getOrCreateTagBuilder(CDCommonTags.STORAGE_BLOCKS_ITEM_EGGPLANT)
                .add(ModItems.EGGPLANT_CRATE.get());
        getOrCreateTagBuilder(CDCommonTags.STORAGE_BLOCKS_ITEM_WHITE_EGGPLANT)
                .add(ModItems.WHITE_EGGPLANT_CRATE.get());
        getOrCreateTagBuilder(CDCommonTags.STORAGE_BLOCKS_ITEM_CUCUMBERS)
                .add(ModItems.CUCUMBER_CRATE.get());
        getOrCreateTagBuilder(CDCommonTags.STORAGE_BLOCKS_ITEM_PICKLE)
                .add(ModItems.PICKLE_CRATE.get());
        getOrCreateTagBuilder(CDCommonTags.STORAGE_BLOCKS_ITEM_AVOCADO)
                .add(ModItems.AVOCADO_CRATE.get());
        getOrCreateTagBuilder(CDCommonTags.STORAGE_BLOCKS_ITEM_CORN)
                .add(ModItems.CORN_COB_CRATE.get());


    }

    public void registerCompatibilityTags() {
        getOrCreateTagBuilder(CompatibilityTags.SERENE_SEASONS_AUTUMN_CROPS)
                .add(ModItems.CORN_KERNELS.get())
                .add(ModItems.EGGPLANT_SEEDS.get());
        getOrCreateTagBuilder(CompatibilityTags.SERENE_SEASONS_SPRING_CROPS)
                .add(ModItems.CUCUMBER_SEEDS.get())
                .add(ModItems.AVOCADO_SAPLING.get());
        getOrCreateTagBuilder(CompatibilityTags.SERENE_SEASONS_SUMMER_CROPS)
                .add(ModItems.AVOCADO_SAPLING.get())
                .add(ModItems.EGGPLANT_SEEDS.get());
    }


}
