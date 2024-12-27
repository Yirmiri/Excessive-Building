package net.yirmiri.excessive_building.platform;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.platform.services.ExcessiveBuildingRegistryHelper;

import java.util.function.Supplier;

public class NeoForgeExcessiveBuildingRegistryHelper implements ExcessiveBuildingRegistryHelper {
    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(Registries.BLOCK, ExcessiveBuilding.MOD_ID);
    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(Registries.ITEM, ExcessiveBuilding.MOD_ID);
    public static final DeferredRegister<MobEffect> MOB_EFFECT = DeferredRegister.create(Registries.MOB_EFFECT, ExcessiveBuilding.MOD_ID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPE = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, ExcessiveBuilding.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE = DeferredRegister.create(Registries.ENTITY_TYPE, ExcessiveBuilding.MOD_ID);
    public static final DeferredRegister<SoundEvent> SOUND_EVENT = DeferredRegister.create(Registries.SOUND_EVENT, ExcessiveBuilding.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExcessiveBuilding.MOD_ID);
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPE = DeferredRegister.create(Registries.PARTICLE_TYPE, ExcessiveBuilding.MOD_ID);

    @Override
    public Holder<Block> registerBlock(String id, Block block, boolean hasItem) {
        var blockRegister = BLOCK.register(id, () -> block);
        if (hasItem) {
            ITEM.register(id, () -> new BlockItem(blockRegister.get(), new Item.Properties()));
        }
        return blockRegister;
    }

    @Override
    public Holder<Item> registerItem(String id, Item item) {
        return ITEM.register(id, () -> item);
    }

    @Override
    public <T extends BlockEntityType<?>> Supplier<T> registerBlockEntity(String id, Supplier<T> blockEntitySupplier) {
        return BLOCK_ENTITY_TYPE.register(id, blockEntitySupplier);
    }

    @Override
    public Holder<EntityType<?>> registerEntityType(String id, EntityType<?> entityType) {
        return ENTITY_TYPE.register(id, () -> entityType);
    }

    @Override
    public Holder<SoundEvent> registerSoundEvent(String id) {
        return SOUND_EVENT.register(id, () -> SoundEvent.createVariableRangeEvent(ExcessiveBuilding.modid(id)));
    }

    @Override
    public Holder<MobEffect> registerEffect(String id, MobEffect mobEffect) {
        return MOB_EFFECT.register(id, () -> mobEffect);
    }

    @Override
    public Holder<CreativeModeTab> registerCreativeModeTab(String id, CreativeModeTab tab) {
        return CREATIVE_MODE_TAB.register(id, () -> tab);
    }

    @Override
    public Holder<SimpleParticleType> registerParticle(String id) {
        return null;//PARTICLE_TYPE.register(id, () -> new SimpleParticleType(false));
    }
}
