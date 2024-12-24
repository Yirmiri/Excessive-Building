package net.yirmiri.excessive_building.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.block.entity.EBHangingSignBlockEntity;
import net.yirmiri.excessive_building.block.entity.EBSignBlockEntity;
import net.yirmiri.excessive_building.block.entity.ReachingLanternBlockEntity;

public class EBBlockEntities {

    public static final BlockEntityType<EBSignBlockEntity> EB_SIGN = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
            ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "eb_sign"), FabricBlockEntityTypeBuilder.create(EBSignBlockEntity::new,
                    EBBlocks.ANCIENT_SIGN, EBBlocks.ANCIENT_WALL_SIGN,
                    EBBlocks.GLOOM_SIGN, EBBlocks.GLOOM_WALL_SIGN
            ).build());

    public static final BlockEntityType<EBHangingSignBlockEntity> EB_HANGING_SIGN = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
            ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "eb_hanging_sign"), FabricBlockEntityTypeBuilder.create(EBHangingSignBlockEntity::new,
                    EBBlocks.ANCIENT_HANGING_SIGN, EBBlocks.ANCIENT_WALL_HANGING_SIGN,
                    EBBlocks.GLOOM_HANGING_SIGN, EBBlocks.GLOOM_WALL_HANGING_SIGN
            ).build());

    public static final BlockEntityType<ReachingLanternBlockEntity> REACHING_LANTERN = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
            ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "reaching_lantern"), FabricBlockEntityTypeBuilder.create(ReachingLanternBlockEntity::new,
                    EBBlocks.REACHING_LANTERN
            ).build());

    public static void loadBlockEntities() {
    }
}
