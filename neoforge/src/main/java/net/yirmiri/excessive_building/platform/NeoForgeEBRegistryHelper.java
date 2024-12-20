package net.yirmiri.excessive_building.platform;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.platform.services.EBRegistryHelper;

import java.util.function.Supplier;

public class NeoForgeEBRegistryHelper implements EBRegistryHelper {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ExcessiveBuilding.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExcessiveBuilding.MOD_ID);

    @Override
    public <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> block, boolean hasItem) {
        var register = BLOCKS.register(id, block);
        if (hasItem) {
            ITEMS.register(id, () -> new BlockItem(register.get(), new Item.Properties()));
        }
        return register;
    }

    @Override
    public <T extends Item> Supplier<T> registerItem(String id, Supplier<T> item) {
        return ITEMS.register(id, item);
    }
}
