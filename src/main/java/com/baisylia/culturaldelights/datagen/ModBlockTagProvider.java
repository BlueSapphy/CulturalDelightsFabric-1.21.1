package com.baisylia.culturaldelights.datagen;

import com.baisylia.culturaldelights.block.ModBlocks;
import com.baisylia.culturaldelights.tag.CDCommonTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import vectorwing.farmersdelight.common.tag.CompatibilityTags;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.registerMinecraftTags();
        this.registerCommonTags();
        this.registerCompatibilityTags();
    }

    protected void registerMinecraftTags() {
        getOrCreateTagBuilder(BlockTags.CROPS)
                .add(ModBlocks.EGGPLANTS.get())
                .add(ModBlocks.CUCUMBERS.get())
                .add(ModBlocks.CORN.get());
        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(ModBlocks.WILD_EGGPLANTS.get())
                .add(ModBlocks.WILD_CUCUMBERS.get())
                .add(ModBlocks.WILD_CORN.get());
        getOrCreateTagBuilder(BlockTags.MAINTAINS_FARMLAND)
                .add(ModBlocks.EGGPLANTS.get())
                .add(ModBlocks.CUCUMBERS.get())
                .add(ModBlocks.CORN.get());

    }
    protected void registerCommonTags() {
        getOrCreateTagBuilder(CDCommonTags.STORAGE_BLOCK)
                .add(ModBlocks.EGGPLANT_CRATE.get())
                .add(ModBlocks.WHITE_EGGPLANT_CRATE.get())
                .add(ModBlocks.CUCUMBER_CRATE.get())
                .add(ModBlocks.PICKLE_CRATE.get())
                .add(ModBlocks.AVOCADO_CRATE.get())
                .add(ModBlocks.CORN_COB_CRATE.get());
        getOrCreateTagBuilder(CDCommonTags.STORAGE_BLOCKS_EGGPLANT)
                .add(ModBlocks.EGGPLANT_CRATE.get());
        getOrCreateTagBuilder(CDCommonTags.STORAGE_BLOCKS_WHITE_EGGPLANT)
                .add(ModBlocks.WHITE_EGGPLANT_CRATE.get());
        getOrCreateTagBuilder(CDCommonTags.STORAGE_BLOCKS_CUCUMBERS)
                .add(ModBlocks.CUCUMBER_CRATE.get());
        getOrCreateTagBuilder(CDCommonTags.STORAGE_BLOCKS_PICKLE)
                .add(ModBlocks.PICKLE_CRATE.get());
        getOrCreateTagBuilder(CDCommonTags.STORAGE_BLOCKS_AVOCADO)
                .add(ModBlocks.AVOCADO_CRATE.get());
        getOrCreateTagBuilder(CDCommonTags.STORAGE_BLOCKS_CORN)
                .add(ModBlocks.CORN_COB_CRATE.get());



    }
    private void registerCompatibilityTags() {
        getOrCreateTagBuilder(CompatibilityTags.SERENE_SEASONS_AUTUMN_CROPS_BLOCK)
                .add(ModBlocks.CORN.get())
                .add(ModBlocks.CORN_UPPER.get())
                .add(ModBlocks.EGGPLANTS.get());
        getOrCreateTagBuilder(CompatibilityTags.SERENE_SEASONS_SPRING_CROPS_BLOCK)
                .add(ModBlocks.CUCUMBERS.get())
                .add(ModBlocks.AVOCADO_SAPLING.get());
        getOrCreateTagBuilder(CompatibilityTags.SERENE_SEASONS_SUMMER_CROPS_BLOCK)
                .add(ModBlocks.AVOCADO_SAPLING.get())
                .add(ModBlocks.EGGPLANTS.get());
        getOrCreateTagBuilder(ModTags.WILD_CROPS)
                .add(ModBlocks.WILD_CUCUMBERS.get())
                .add(ModBlocks.WILD_EGGPLANTS.get())
                .add(ModBlocks.WILD_CORN.get());
    }

}








