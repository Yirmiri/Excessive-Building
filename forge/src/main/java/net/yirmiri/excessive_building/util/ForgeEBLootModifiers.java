package net.yirmiri.excessive_building.util;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yirmiri.excessive_building.ExcessiveBuilding;

import java.util.function.Supplier;

public class ForgeEBLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIERS = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, ExcessiveBuilding.MOD_ID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> REPLACE_ITEM = LOOT_MODIFIERS.register("replace_item", ReplaceItemModifier.CODEC);
}
