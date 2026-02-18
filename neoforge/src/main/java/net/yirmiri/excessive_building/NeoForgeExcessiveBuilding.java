package net.yirmiri.excessive_building;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.yirmiri.excessive_building.common.util.EBRegistries;
import net.yirmiri.excessive_building.core.mixin.BlockEntityAccessor;
import net.yirmiri.excessive_building.core.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBNeoForgeLootModifiers;

import java.util.HashSet;
import java.util.Set;

@Mod(ExcessiveBuilding.MOD_ID)
public class NeoForgeExcessiveBuilding {

    public NeoForgeExcessiveBuilding(IEventBus eventBus) {
        ExcessiveBuilding.init();
        EBNeoForgeLootModifiers.LOOT_MODIFIERS.register(eventBus);

        eventBus.addListener(this::commonSetup);
    }

    @SubscribeEvent
    public void commonSetup(final FMLCommonSetupEvent event) {
        Set<Block> signs = new HashSet<>(((BlockEntityAccessor) BlockEntityType.SIGN).getValidBlocks());
        signs.add(EBBlocks.ANCIENT_SIGN.get());
        signs.add(EBBlocks.ANCIENT_WALL_SIGN.get());
        ((BlockEntityAccessor) BlockEntityType.SIGN).setValidBlocks(signs);

        Set<Block> hangingSigns = new HashSet<>(((BlockEntityAccessor) BlockEntityType.HANGING_SIGN).getValidBlocks());
        signs.add(EBBlocks.ANCIENT_HANGING_SIGN.get());
        signs.add(EBBlocks.ANCIENT_WALL_HANGING_SIGN.get());
        ((BlockEntityAccessor) BlockEntityType.HANGING_SIGN).setValidBlocks(hangingSigns);

        event.enqueueWork(EBRegistries::load);
    }
}