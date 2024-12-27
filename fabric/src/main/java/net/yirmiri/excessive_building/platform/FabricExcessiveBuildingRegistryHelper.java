package net.yirmiri.excessive_building.platform;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.platform.services.ExcessiveBuildingRegistryHelper;

import java.util.function.Supplier;

public class FabricExcessiveBuildingRegistryHelper implements ExcessiveBuildingRegistryHelper {
    @Override
    public Holder<Block> registerBlock(String id, Block block, boolean hasItem) {
        var blockRegister = Registry.registerForHolder(BuiltInRegistries.BLOCK, ExcessiveBuilding.modid(id), block);
        if (hasItem) {
            Registry.register(BuiltInRegistries.ITEM, ExcessiveBuilding.modid(id), new BlockItem(blockRegister.value(), new Item.Properties()));
        }
        return blockRegister;
    }

    @Override
    public Holder<Item> registerItem(String id, Item item) {
        return Registry.registerForHolder(BuiltInRegistries.ITEM, ExcessiveBuilding.modid(id), item);
    }

    @Override
    public <T extends BlockEntityType<?>> Supplier<T> registerBlockEntity(String id, Supplier<T> blockEntitySupplier) {
        return () -> Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, ExcessiveBuilding.modid(id), blockEntitySupplier.get());
    }

    @Override
    public Holder<EntityType<?>> registerEntityType(String id, EntityType<?> entityType) {
        return Registry.registerForHolder(BuiltInRegistries.ENTITY_TYPE, ExcessiveBuilding.modid(id), entityType);
    }

    @Override
    public Holder<SoundEvent> registerSoundEvent(String id) {
        return Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, ExcessiveBuilding.modid(id), SoundEvent.createVariableRangeEvent(ExcessiveBuilding.modid(id)));
    }

    @Override
    public Holder<MobEffect> registerEffect(String id, MobEffect mobEffect) {
        return Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, ExcessiveBuilding.modid(id), mobEffect);
    }

    @Override
    public Holder<CreativeModeTab> registerCreativeModeTab(String id, CreativeModeTab tab) {
        return Registry.registerForHolder(BuiltInRegistries.CREATIVE_MODE_TAB, ExcessiveBuilding.modid(id), tab);
    }

    @Override
    public Holder<SimpleParticleType> registerParticle(String id) {
        return null;//Registry.registerForHolder(BuiltInRegistries.PARTICLE_TYPE, ExcessiveBuilding.modid(id), FabricParticleTypes.simple();
    }
}