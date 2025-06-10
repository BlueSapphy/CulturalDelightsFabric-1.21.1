package com.baisylia.culturaldelights.tag;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class CDCommonTags {

    public static final TagKey<Block> STORAGE_BLOCK = commonBlockTag("storage_block");
    public static final TagKey<Block> STORAGE_BLOCKS_EGGPLANT = commonBlockTag("storage_blocks/eggplant");
    public static final TagKey<Block> STORAGE_BLOCKS_WHITE_EGGPLANT = commonBlockTag("storage_blocks/white_eggplant");
    public static final TagKey<Block> STORAGE_BLOCKS_CUCUMBERS = commonBlockTag("storage_blocks/cucumbers");
    public static final TagKey<Block> STORAGE_BLOCKS_PICKLE = commonBlockTag("storage_blocks/pickle");
    public static final TagKey<Block> STORAGE_BLOCKS_AVOCADO = commonBlockTag("storage_blocks/avocado");
    public static final TagKey<Block> STORAGE_BLOCKS_CORN = commonBlockTag("storage_blocks/corn");

    public static final TagKey<Item> CROPS = commonItemTag("crops");
    public static final TagKey<Item> SEEDS = commonItemTag("seeds");
    public static final TagKey<Item> CROPS_EGGPLANT = commonItemTag("crops/eggplant");
    public static final TagKey<Item> CROPS_CUCUMBERS = commonItemTag("crops/cucumbers");
    public static final TagKey<Item> CROPS_CORN = commonItemTag("crops/corn");


    // Tags under the "foods" subgroup.
    public static final TagKey<Item> FOODS_EGGPLANT = commonItemTag("foods/eggplant");
    public static final TagKey<Item> FOODS_CUCUMBERS = commonItemTag("foods/cucumbers");
    public static final TagKey<Item> FOODS_AVOCADO = commonItemTag("foods/avocado");
    public static final TagKey<Item> FOODS_CORN = commonItemTag("foods/corn");
    public static final TagKey<Item> VEGETABLE = commonItemTag("foods/vegetable");
    public static final TagKey<Item> FOODS_RAW_FISH = commonItemTag("foods/raw_fish");
    public static final TagKey<Item> FOODS_RAW_SQUID = commonItemTag("foods/raw_squid");
    public static final TagKey<Item> FOODS_SOUP = commonItemTag("foods/soup");
    public static final TagKey<Item> FOODS_COOKED_FISH = commonItemTag("foods/cooked_fish");
    public static final TagKey<Item> FOODS_COOKED_SQUID = commonItemTag("foods/cooked_squid");
    public static final TagKey<Item> FOODS_COOKED_EGGPLANT = commonItemTag("foods/cooked_eggplant");
    public static final TagKey<Item> FOODS_PICKLE = commonItemTag("foods/pickle");


    public static final TagKey<Item> STORAGE_BLOCKS_ITEM_EGGPLANT = commonItemTag("storage_blocks/eggplant");
    public static final TagKey<Item> STORAGE_BLOCKS_ITEM_WHITE_EGGPLANT = commonItemTag("storage_blocks/white_eggplant");
    public static final TagKey<Item> STORAGE_BLOCKS_ITEM_CUCUMBERS = commonItemTag("storage_blocks/cucumbers");
    public static final TagKey<Item> STORAGE_BLOCKS_ITEM_PICKLE = commonItemTag("storage_blocks/pickle");
    public static final TagKey<Item> STORAGE_BLOCKS_ITEM_AVOCADO = commonItemTag("storage_blocks/avocado");
    public static final TagKey<Item> STORAGE_BLOCKS_ITEM_CORN = commonItemTag("storage_blocks/corn");





    private static TagKey<Block> commonBlockTag(String path) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", path));
    }

    private static TagKey<Item> commonItemTag(String path) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", path));
    }

}
