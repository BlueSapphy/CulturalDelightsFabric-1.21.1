package com.baisylia.culturaldelights.refabricated;

import com.baisylia.culturaldelights.CulturalDelights;
import com.baisylia.culturaldelights.item.ModItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import net.minecraft.advancements.critereon.EntityEquipmentPredicate;
import net.minecraft.advancements.critereon.EntityFlagsPredicate;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import vectorwing.farmersdelight.common.tag.ModTags;

public class CDLootTableHelper {

    private static final ResourceKey<LootTable> ENTITIES_SQUID = vanillaKey("entities/squid");
    private static final ResourceKey<LootTable> ENTITIES_GLOW_SQUID = vanillaKey("entities/glow_squid");

    public static void init() {
        LootTableEvents.MODIFY.register(CDLootTableHelper::modifyTable);
    }



    private static void modifyTable(ResourceKey<LootTable> key, LootTable.Builder tableBuilder, LootTableSource source, HolderLookup.Provider registries) {
        if (!source.isBuiltin()) // Will return if the loot table is modified via datapack.
            return;

        scavengingLoot(key, tableBuilder, source, registries);

    }

    private static void scavengingLoot(ResourceKey<LootTable> key, LootTable.Builder tableBuilder, LootTableSource source, HolderLookup.Provider registries) {
        HolderLookup<Enchantment> enchantments = registries.lookupOrThrow(Registries.ENCHANTMENT);

        if (key == ENTITIES_SQUID) {
            tableBuilder.withPool(LootPool.lootPool().add(LootItem.lootTableItem(ModItems.RAW_CALAMARI.get())
                            .when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.ATTACKER, EntityPredicate.Builder.entity().equipment(
                                    EntityEquipmentPredicate.Builder.equipment().mainhand(ItemPredicate.Builder.item().of(ModTags.KNIVES))
                            )).and(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, EntityPredicate.Builder.entity().flags(EntityFlagsPredicate.Builder.flags().setOnFire(false)))))))
                    .withPool(LootPool.lootPool().add(LootItem.lootTableItem(ModItems.COOKED_CALAMARI.get())
                            .when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.ATTACKER, EntityPredicate.Builder.entity().equipment(
                                    EntityEquipmentPredicate.Builder.equipment().mainhand(ItemPredicate.Builder.item().of(ModTags.KNIVES))
                            )).and(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, EntityPredicate.Builder.entity().flags(EntityFlagsPredicate.Builder.flags().setOnFire(true)))))));
        }

        if (key == ENTITIES_GLOW_SQUID) {
            tableBuilder.withPool(LootPool.lootPool().add(LootItem.lootTableItem(ModItems.RAW_CALAMARI.get())
                            .when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.ATTACKER, EntityPredicate.Builder.entity().equipment(
                                    EntityEquipmentPredicate.Builder.equipment().mainhand(ItemPredicate.Builder.item().of(ModTags.KNIVES))
                            )).and(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, EntityPredicate.Builder.entity().flags(EntityFlagsPredicate.Builder.flags().setOnFire(false)))))))
                    .withPool(LootPool.lootPool().add(LootItem.lootTableItem(ModItems.COOKED_CALAMARI.get())
                            .when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.ATTACKER, EntityPredicate.Builder.entity().equipment(
                                    EntityEquipmentPredicate.Builder.equipment().mainhand(ItemPredicate.Builder.item().of(ModTags.KNIVES))
                            )).and(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, EntityPredicate.Builder.entity().flags(EntityFlagsPredicate.Builder.flags().setOnFire(true)))))));
        }

    }



    private static ResourceKey<LootTable> vanillaKey(String path) {
        return ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.withDefaultNamespace(path));
    }

    private static ResourceKey<LootTable> key(String path) {
        return ResourceKey.create(Registries.LOOT_TABLE, CulturalDelights.res(path));
    }


}
