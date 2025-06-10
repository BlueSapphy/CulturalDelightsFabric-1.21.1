package com.baisylia.culturaldelights.world.tree;

import com.baisylia.culturaldelights.CulturalDelights;
import com.baisylia.culturaldelights.world.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower AVOCADO = new TreeGrower(CulturalDelights.MOD_ID + ":avocado",
            Optional.empty(), Optional.of(ModConfiguredFeatures.AVOCADO_KEY), Optional.empty());

}
