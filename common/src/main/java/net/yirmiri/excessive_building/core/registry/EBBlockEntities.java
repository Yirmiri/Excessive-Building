package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.RLServices;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.block.entity.EBHangingSignBlockEntity;
import net.yirmiri.excessive_building.common.block.entity.EBSignBlockEntity;

import java.util.function.Supplier;

public class EBBlockEntities {
    public static final Supplier<BlockEntityType<EBSignBlockEntity>> EB_SIGN = RLServices.REGISTRY.registerBlockEntityType(
            ExcessiveBuilding.MOD_ID, "eb_sign", () -> RLServices.REGISTRY.createBlockEntity(EBSignBlockEntity::new,
                    EBBlocks.ANCIENT_SIGN.get(), EBBlocks.ANCIENT_WALL_SIGN.get()));

    public static final Supplier<BlockEntityType<EBHangingSignBlockEntity>> EB_HANGING_SIGN = RLServices.REGISTRY.registerBlockEntityType(
            ExcessiveBuilding.MOD_ID, "eb_hanging_sign", () -> RLServices.REGISTRY.createBlockEntity(EBHangingSignBlockEntity::new,
                    EBBlocks.ANCIENT_HANGING_SIGN.get(), EBBlocks.ANCIENT_WALL_HANGING_SIGN.get()));

    public static void load() {
    }
}