package net.yirmiri.excessive_building.registry;

import com.mojang.serialization.MapCodec;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.loot.AddItemModifier;
import net.yirmiri.excessive_building.loot.ReplaceItemModifier;

import java.util.function.Supplier;

public class EBNeoForgeLootModifiers {
    public static final DeferredRegister<MapCodec<? extends IGlobalLootModifier>> LOOT_MODIFIERS = DeferredRegister.create(NeoForgeRegistries.GLOBAL_LOOT_MODIFIER_SERIALIZERS, ExcessiveBuilding.MOD_ID);

    public static final Supplier<MapCodec<? extends IGlobalLootModifier>> ADD_ITEM = LOOT_MODIFIERS.register("add_item", AddItemModifier.CODEC);
    public static final Supplier<MapCodec<? extends IGlobalLootModifier>> REPLACE_ITEM = LOOT_MODIFIERS.register("replace_item", ReplaceItemModifier.CODEC);
}
