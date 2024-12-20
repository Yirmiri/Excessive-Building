package net.yirmiri.excessive_building.platform;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.platform.services.EBRegistryHelper;

import java.util.function.Supplier;

public class FabricEBRegistryHelper implements EBRegistryHelper {
    @Override
    public <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> block, boolean hasItem) {
        if (hasItem) {
            Registry.register(BuiltInRegistries.ITEM, ExcessiveBuilding.modIDPath(id), new BlockItem(Registry.register(BuiltInRegistries.BLOCK, ExcessiveBuilding.modIDPath(id), block.get()), new Item.Properties()));
        }
        return () -> Registry.register(BuiltInRegistries.BLOCK, ExcessiveBuilding.modIDPath(id), block.get());
    }

    @Override
    public <T extends Item> Supplier<T> registerItem(String id, Supplier<T> item) {
        return () -> Registry.register(BuiltInRegistries.ITEM, ExcessiveBuilding.modIDPath(id), item.get());
    }
}