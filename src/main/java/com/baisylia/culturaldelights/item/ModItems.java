package com.baisylia.culturaldelights.item;

import com.baisylia.culturaldelights.block.ModBlocks;
import net.minecraft.world.item.*;

import java.util.function.Supplier;

import static com.baisylia.culturaldelights.refabricated.CDRegUtils.regItem;



public class ModItems {

    public static Supplier<Item> register(final String name, final Supplier<Item> supplier) {
        Supplier<Item> block = regItem(name, supplier);
        return block;
    }

    public static Item.Properties basicItem() {
        return new Item.Properties();
    }

    //blocks to make the creative tab stop crashing

    public static final Supplier<Item> WILD_CORN = register("wild_corn", () ->
            new BlockItem(ModBlocks.WILD_CORN.get(), basicItem()));

    public static final Supplier<Item> WILD_CUCUMBERS = register("wild_cucumbers", () ->
            new BlockItem(ModBlocks.WILD_CUCUMBERS.get(), basicItem()));

    public static final Supplier<Item> WILD_EGGPLANTS = register("wild_eggplants", () ->
            new BlockItem(ModBlocks.WILD_EGGPLANTS.get(), basicItem()));

    public static final Supplier<Item> AVOCADO_PIT = register("avocado_pit", () ->
            new BlockItem(ModBlocks.AVOCADO_PIT.get(), basicItem()));

    public static final Supplier<Item> AVOCADO_SAPLING = register("avocado_sapling", () ->
            new BlockItem(ModBlocks.AVOCADO_SAPLING.get(), basicItem()));

    public static final Supplier<Item> AVOCADO_LOG = register("avocado_log", () ->
            new BlockItem(ModBlocks.AVOCADO_LOG.get(), basicItem()));

    public static final Supplier<Item> AVOCADO_WOOD = register("avocado_wood", () ->
            new BlockItem(ModBlocks.AVOCADO_WOOD.get(), basicItem()));

    public static final Supplier<Item> AVOCADO_LEAVES = register("avocado_leaves", () ->
            new BlockItem(ModBlocks.AVOCADO_LEAVES.get(), basicItem()));

    public static final Supplier<Item> FRUITING_AVOCADO_LEAVES = register("fruiting_avocado_leaves", () ->
            new BlockItem(ModBlocks.FRUITING_AVOCADO_LEAVES.get(), basicItem()));

    public static final Supplier<Item> AVOCADO_CRATE = register("avocado_crate", () ->
            new BlockItem(ModBlocks.AVOCADO_CRATE.get(), basicItem()));

    public static final Supplier<Item> CUCUMBER_CRATE = register("cucumber_crate", () ->
            new BlockItem(ModBlocks.CUCUMBER_CRATE.get(), basicItem()));

    public static final Supplier<Item> PICKLE_CRATE = register("pickle_crate", () ->
            new BlockItem(ModBlocks.PICKLE_CRATE.get(), basicItem()));

    public static final Supplier<Item> EGGPLANT_CRATE = register("eggplant_crate", () ->
            new BlockItem(ModBlocks.EGGPLANT_CRATE.get(), basicItem()));

    public static final Supplier<Item> WHITE_EGGPLANT_CRATE = register("white_eggplant_crate", () ->
            new BlockItem(ModBlocks.WHITE_EGGPLANT_CRATE.get(), basicItem()));

    public static final Supplier<Item> CORN_COB_CRATE = register("corn_cob_crate", () ->
            new BlockItem(ModBlocks.CORN_COB_CRATE.get(), basicItem()));

    public static final Supplier<Item> EXOTIC_ROLL_MEDLEY = register("exotic_roll_medley", () ->
            new BlockItem(ModBlocks.EXOTIC_ROLL_MEDLEY.get(), basicItem().stacksTo(1)));


    public static final Supplier<Item> CUCUMBER_SEEDS = register("cucumber_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CUCUMBERS.get(),
                    new Item.Properties()));

    public static final Supplier<Item> CORN_KERNELS = register("corn_kernels",
            () -> new ItemNameBlockItem(ModBlocks.CORN.get(),
                    new Item.Properties()));

    public static final Supplier<Item> EGGPLANT_SEEDS = register("eggplant_seeds",
            () -> new ItemNameBlockItem(ModBlocks.EGGPLANTS.get(),
                    new Item.Properties()));


    //Ingredients
    public static final Supplier<Item> AVOCADO = register("avocado",
            () -> new Item(new Item.Properties().food(ModFoods.AVOCADO)));

    public static final Supplier<Item> CUT_AVOCADO = register("cut_avocado",
            () -> new Item(new Item.Properties().food(ModFoods.CUT_AVOCADO)));

    public static final Supplier<Item> CUCUMBER = register("cucumber",
            () -> new Item(new Item.Properties().food(ModFoods.CUCUMBER)));

    public static final Supplier<Item> PICKLE = register("pickle",
            () -> new Item(new Item.Properties().food(ModFoods.PICKLE)));

    public static final Supplier<Item> CUT_CUCUMBER = register("cut_cucumber",
            () -> new Item(new Item.Properties().food(ModFoods.CUT_CUCUMBER)));

    public static final Supplier<Item> CUT_PICKLE = register("cut_pickle",
            () -> new Item(new Item.Properties().food(ModFoods.CUT_PICKLE)));

    public static final Supplier<Item> EGGPLANT = register("eggplant",
            () -> new Item(new Item.Properties().food(ModFoods.EGGPLANT)));

    public static final Supplier<Item> CUT_EGGPLANT = register("cut_eggplant",
            () -> new Item(new Item.Properties().food(ModFoods.CUT_EGGPLANT)));

    public static final Supplier<Item> SMOKED_EGGPLANT = register("smoked_eggplant",
            () -> new Item(new Item.Properties().food(ModFoods.SMOKED_EGGPLANT)));

    public static final Supplier<Item> SMOKED_TOMATO = register("smoked_tomato",
            () -> new Item(new Item.Properties().food(ModFoods.SMOKED_TOMATO)));

    public static final Supplier<Item> SMOKED_CUT_EGGPLANT = register("smoked_cut_eggplant",
            () -> new Item(new Item.Properties().food(ModFoods.SMOKED_CUT_EGGPLANT)));

    public static final Supplier<Item> SMOKED_WHITE_EGGPLANT = register("smoked_white_eggplant",
            () -> new Item(new Item.Properties().food(ModFoods.SMOKED_WHITE_EGGPLANT)));

    public static final Supplier<Item> SMOKED_CORN = register("smoked_corn",
            () -> new Item(new Item.Properties().food(ModFoods.SMOKED_CORN)));

    public static final Supplier<Item> WHITE_EGGPLANT = register("white_eggplant",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_EGGPLANT)));
    public static final Supplier<Item> CORN_COB = register("corn_cob",
            () -> new Item(new Item.Properties().food(ModFoods.CORN_COB)));
    //public static final DeferredItem<Item> GINGER = ITEMS.register("ginger",
    //        () -> new Item(new Item.Properties().food(ModFoods.GINGER)));

    public static final Supplier<Item> SQUID = register("squid",
            () -> new Item(new Item.Properties().food(ModFoods.SQUID)));

    public static final Supplier<Item> COOKED_SQUID = register("cooked_squid",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_SQUID)));

    public static final Supplier<Item> GLOW_SQUID = register("glow_squid",
            () -> new Item(new Item.Properties().food(ModFoods.GLOW_SQUID)));

    public static final Supplier<Item> RAW_CALAMARI = register("raw_calamari",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_CALAMARI)));

    public static final Supplier<Item> COOKED_CALAMARI = register("cooked_calamari",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_CALAMARI)));


    //Meals
    public static final Supplier<Item> POPCORN = register("popcorn",
            () -> new Item(new Item.Properties().food(ModFoods.POPCORN)));

    public static final Supplier<Item> CORN_DOUGH = register("corn_dough",
            () -> new Item(new Item.Properties().food(ModFoods.CORN_DOUGH)));

    public static final Supplier<Item> TORTILLA = register("tortilla",
            () -> new Item(new Item.Properties().food(ModFoods.TORTILLA)));

    public static final Supplier<Item> TORTILLA_CHIPS = register("tortilla_chips",
            () -> new Item(new Item.Properties().food(ModFoods.TORTILLA_CHIPS)));

    public static final Supplier<Item> ELOTE = register("elote",
            () -> new Item(new Item.Properties().food(ModFoods.ELOTE)));

    public static final Supplier<Item> EMPANADA = register("empanada",
            () -> new Item(new Item.Properties().food(ModFoods.EMPANADA)));

    public static final Supplier<Item> HEARTY_SALAD = register("hearty_salad",
            () -> new Item(new Item.Properties().stacksTo(16).food(ModFoods.HEARTY_SALAD)));

    public static final Supplier<Item> BEEF_BURRITO = register("beef_burrito",
            () -> new Item(new Item.Properties().food(ModFoods.BEEF_BURRITO)));

    public static final Supplier<Item> MUTTON_SANDWICH = register("mutton_sandwich",
            () -> new Item(new Item.Properties().food(ModFoods.MUTTON_SANDWICH)));

    //public static final Supplier<Item> EGGPLANT_PARMESAN = register("eggplant_parmesan",
    //() -> new Item(new Item.Properties().stacksTo(16).food(ModFoods.EGGPLANT_PARMESAN)));

    public static final Supplier<Item> POACHED_EGGPLANTS = register("poached_eggplants",
            () -> new Item(new Item.Properties().stacksTo(16).food(ModFoods.POACHED_EGGPLANTS)));

    public static final Supplier<Item> EGGPLANT_BURGER = register("eggplant_burger",
            () -> new Item(new Item.Properties().food(ModFoods.EGGPLANT_BURGER)));

    public static final Supplier<Item> AVOCADO_TOAST = register("avocado_toast",
            () -> new Item(new Item.Properties().food(ModFoods.AVOCADO_TOAST)));

    public static final Supplier<Item> CREAMED_CORN = register("creamed_corn",
            () -> new Item(new Item.Properties().stacksTo(16).food(ModFoods.CREAMED_CORN)));

    public static final Supplier<Item> CHICKEN_TACO = register("chicken_taco",
            () -> new Item(new Item.Properties().food(ModFoods.CHICKEN_TACO)));

    public static final Supplier<Item> SPICY_CURRY = register("spicy_curry",
            () -> new Item(new Item.Properties().stacksTo(16).food(ModFoods.SPICY_CURRY)));

    public static final Supplier<Item> PORK_WRAP = register("pork_wrap",
            () -> new Item(new Item.Properties().food(ModFoods.PORK_WRAP)));

    public static final Supplier<Item> FISH_TACO = register("fish_taco",
            () -> new Item(new Item.Properties().food(ModFoods.FISH_TACO)));

    public static final Supplier<Item> MIDORI_ROLL = register("midori_roll",
            () -> new Item(new Item.Properties().food(ModFoods.MIDORI_ROLL)));

    public static final Supplier<Item> MIDORI_ROLL_SLICE = register("midori_roll_slice",
            () -> new Item(new Item.Properties().food(ModFoods.MIDORI_ROLL_SLICE)));

    public static final Supplier<Item> EGG_ROLL = register("egg_roll",
            () -> new Item(new Item.Properties().food(ModFoods.EGG_ROLL)));

    public static final Supplier<Item> CHICKEN_ROLL = register("chicken_roll",
            () -> new Item(new Item.Properties().food(ModFoods.CHICKEN_ROLL)));

    public static final Supplier<Item> CHICKEN_ROLL_SLICE = register("chicken_roll_slice",
            () -> new Item(new Item.Properties().food(ModFoods.CHICKEN_ROLL_SLICE)));

    public static final Supplier<Item> PUFFERFISH_ROLL = register("pufferfish_roll",
            () -> new Item(new Item.Properties().food(ModFoods.PUFFERFISH_ROLL)));

    public static final Supplier<Item> TROPICAL_ROLL = register("tropical_roll",
            () -> new Item(new Item.Properties().food(ModFoods.TROPICAL_ROLL)));

    public static final Supplier<Item> RICE_BALL = register("rice_ball",
            () -> new Item(new Item.Properties().food(ModFoods.RICE_BALL)));

    public static final Supplier<Item> CALAMARI_ROLL = register("calamari_roll",
            () -> new Item(new Item.Properties().food(ModFoods.CALAMARI_ROLL)));




    public static void register() {}


}
