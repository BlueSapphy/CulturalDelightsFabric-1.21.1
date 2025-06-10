package com.baisylia.culturaldelights;

import com.baisylia.culturaldelights.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

import java.util.Set;

@Environment(EnvType.CLIENT)
public class CulturalDelightsClient  implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(
                RenderType.cutout(),
                ModBlocks.WILD_CUCUMBERS.get(),
                ModBlocks.WILD_EGGPLANTS.get(),
                ModBlocks.WILD_CORN.get(),
                ModBlocks.AVOCADO_LEAVES.get(),
                ModBlocks.AVOCADO_SAPLING.get(),
                ModBlocks.AVOCADO_PIT.get(),
                ModBlocks.CUCUMBERS.get(),
                ModBlocks.EGGPLANTS.get(),
                ModBlocks.CORN.get(),
                ModBlocks.CORN_UPPER.get()



        );



    }
}
