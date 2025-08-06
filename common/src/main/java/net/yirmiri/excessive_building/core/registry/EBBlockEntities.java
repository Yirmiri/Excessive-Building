package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.block.entity.KilnBlockEntity;

import java.util.function.Supplier;

public class EBBlockEntities {
    public static final Supplier<BlockEntityType<KilnBlockEntity>> KILN = Services.REGISTRY.registerBlockEntityType(
            ExcessiveBuilding.MOD_ID, "kiln", () -> Services.REGISTRY.createBlockEntity(KilnBlockEntity::new,
                    EBBlocks.KILN.get()));

    public static void loadBlockEntities() {
    }
}
