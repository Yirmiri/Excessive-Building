package net.yirmiri.excessive_building.platform.services;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public interface EBRegistryHelper {
    <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> block, boolean hasItem);
    <T extends Item> Supplier<T> registerItem(String id, Supplier<T> item);
}