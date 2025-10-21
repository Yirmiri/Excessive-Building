package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.block.entity.EBHangingSignBlockEntity;
import net.yirmiri.excessive_building.common.block.entity.EBSignBlockEntity;
import net.yirmiri.excessive_building.common.block.entity.KilnBlockEntity;

import java.util.function.Supplier;

public class EBBlockEntities {
    public static final Supplier<BlockEntityType<KilnBlockEntity>> KILN = Services.REGISTRY.registerBlockEntityType(
            ExcessiveBuilding.MOD_ID, "kiln", () -> Services.REGISTRY.createBlockEntity(KilnBlockEntity::new,
                    EBBlocks.KILN.get()));

    public static final Supplier<BlockEntityType<EBSignBlockEntity>> EB_SIGN = Services.REGISTRY.registerBlockEntityType(
            ExcessiveBuilding.MOD_ID, "eb_sign", () -> Services.REGISTRY.createBlockEntity(EBSignBlockEntity::new,
                    EBBlocks.ANCIENT_SIGN.get(), EBBlocks.ANCIENT_WALL_SIGN.get()));

    public static final Supplier<BlockEntityType<EBHangingSignBlockEntity>> EB_HANGING_SIGN = Services.REGISTRY.registerBlockEntityType(
            ExcessiveBuilding.MOD_ID, "eb_hanging_sign", () -> Services.REGISTRY.createBlockEntity(EBHangingSignBlockEntity::new,
                    EBBlocks.ANCIENT_HANGING_SIGN.get(), EBBlocks.ANCIENT_WALL_HANGING_SIGN.get()));

    public static void loadBlockEntities() {
    }
}
