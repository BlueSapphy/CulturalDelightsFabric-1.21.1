package com.baisylia.culturaldelights.block;

import com.baisylia.culturaldelights.CulturalDelights;
import com.baisylia.culturaldelights.block.custom.*;
import com.baisylia.culturaldelights.world.tree.ModTreeGrowers;
import net.minecraft.client.resources.model.Material;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.lighting.BlockLightEngine;
import org.jetbrains.annotations.NotNull;
import vectorwing.farmersdelight.common.block.WildCropBlock;

import java.util.function.Supplier;

import static com.baisylia.culturaldelights.refabricated.CDRegUtils.regBlock;

public class ModBlocks {

    public static final Supplier<Block> WILD_CORN = regBlock("wild_corn",
            () -> new WildCropBlock(MobEffects.HUNGER, 6, BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)));

    public static final Supplier<Block> WILD_CUCUMBERS = regBlock("wild_cucumbers",
            () -> new WildCropBlock(MobEffects.DAMAGE_BOOST, 6, BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)));

    public static final Supplier<Block> WILD_EGGPLANTS = regBlock("wild_eggplants",
            () -> new WildCropBlock(MobEffects.DAMAGE_BOOST, 6, BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)));

    public static final Supplier<Block> AVOCADO_PIT = regBlock("avocado_pit",
            () -> new AvocadoPitBlock(ModTreeGrowers.AVOCADO, BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_SAPLING)));

    public static final Supplier<Block> AVOCADO_SAPLING = regBlock("avocado_sapling",
            () -> new SaplingBlock(ModTreeGrowers.AVOCADO, BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_SAPLING)));

    //public static final Supplier<Block> AVOCADO_BUNDLE = regBlock("avocado_bundle",
    //() -> new Block(Block.Properties.ofFullCopy(Blocks.PUMPKIN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Supplier<Block> AVOCADO_LOG = regBlock("avocado_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_LOG)));

    public static final Supplier<Block> AVOCADO_WOOD = regBlock("avocado_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_WOOD)));

    public static final Supplier<Block> AVOCADO_LEAVES = regBlock("avocado_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_LEAVES)));

    public static final Supplier<Block> FRUITING_AVOCADO_LEAVES  = regBlock("fruiting_avocado_leaves",
            () -> new FruitingLeaves(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_LEAVES)));

    public static final Supplier<Block> CUCUMBERS = regBlock("cucumbers",
            () -> new CucumbersBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noOcclusion()));

    public static final Supplier<Block> EGGPLANTS = regBlock("eggplants",
            () -> new EggplantsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noOcclusion()));

    public static final Supplier<Block> CORN = regBlock("corn",
            () -> new CornBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noOcclusion()));

    public static final Supplier<Block> CORN_UPPER =regBlock("corn_upper",
            () -> new CornUpperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noOcclusion()));

    public static final Supplier<Block> AVOCADO_CRATE = regBlock("avocado_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Supplier<Block> CUCUMBER_CRATE = regBlock("cucumber_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Supplier<Block> PICKLE_CRATE = regBlock("pickle_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Supplier<Block> EGGPLANT_CRATE = regBlock("eggplant_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Supplier<Block> WHITE_EGGPLANT_CRATE = regBlock("white_eggplant_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Supplier<Block> CORN_COB_CRATE = regBlock("corn_cob_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    @NotNull
    public static final Supplier<Block> EXOTIC_ROLL_MEDLEY = regBlock("exotic_roll_medley",
            () -> new ExoticRollMedleyBlock(Block.Properties.ofFullCopy(Blocks.CAKE)));




    public static void register() {}


}
