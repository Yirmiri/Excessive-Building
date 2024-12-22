package net.yirmiri.excessive_building.platform.services;

import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.Optional;
import java.util.function.Supplier;

public interface ExcessiveBuildingRegistryHelper {
    Holder<Block> registerBlock(String id, Block block, boolean hasItem);

    //Holder<Block> registerConfigurableBlock(boolean configValue, Optional<Boolean> optionalConfigValue, String id, Block block, boolean hasItem);

    Holder<Item> registerItem(String id, Item item);

    //Holder<Item> registerConfigurableItem(boolean configValue, Optional<Boolean> optionalConfigValue, String id, Item item);

    Holder<BlockEntityType<?>> registerBlockEntity(String id, BlockEntityType<?> blockEntity);

    Holder<EntityType<?>> registerEntityType(String id, EntityType<?> entityType);

    Holder<SoundEvent> registerSoundEvent(String id);

    Holder<MobEffect> registerEffect(String id, MobEffect mobEffect);

    Holder<CreativeModeTab> registerCreativeModeTab(String id, CreativeModeTab tab);
}