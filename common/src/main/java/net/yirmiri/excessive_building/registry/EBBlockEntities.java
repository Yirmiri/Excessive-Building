package net.yirmiri.excessive_building.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.yirmiri.excessive_building.block.entity.EBHangingSignBlockEntity;
import net.yirmiri.excessive_building.block.entity.EBSignBlockEntity;
import net.yirmiri.excessive_building.block.entity.ReachingLanternBlockEntity;
import net.yirmiri.excessive_building.platform.Services;
import net.yirmiri.excessive_building.platform.services.IPlatformHelper;

import java.util.function.Supplier;

public class EBBlockEntities {

    public static final Supplier<BlockEntityType<EBSignBlockEntity>> EB_SIGN = Services.REGISTRY.registerBlockEntity(
            "eb_sign", () -> createBlockEntity(EBSignBlockEntity::new,
                    EBBlocks.ANCIENT_SIGN.value(), EBBlocks.ANCIENT_WALL_SIGN.value(),
                    EBBlocks.GLOOM_SIGN.value(), EBBlocks.GLOOM_WALL_SIGN.value()
            ));

    public static final Supplier<BlockEntityType<EBHangingSignBlockEntity>> EB_HANGING_SIGN = Services.REGISTRY.registerBlockEntity(
            "eb_hanging_sign", () -> createBlockEntity(EBHangingSignBlockEntity::new,
                    EBBlocks.ANCIENT_HANGING_SIGN.value(), EBBlocks.ANCIENT_WALL_HANGING_SIGN.value(),
                    EBBlocks.GLOOM_HANGING_SIGN.value(), EBBlocks.GLOOM_WALL_HANGING_SIGN.value()
            ));

    public static final Supplier<BlockEntityType<ReachingLanternBlockEntity>> REACHING_LANTERN = Services.REGISTRY.registerBlockEntity(
            "reaching_lantern", () -> createBlockEntity(ReachingLanternBlockEntity::new,
                    EBBlocks.REACHING_LANTERN.value()
            ));

    private static <T extends BlockEntity> BlockEntityType<T> createBlockEntity(IPlatformHelper.BlockEntitySupplier<T> blockEntity, Block... blocks) {
        return Services.PLATFORM.createBlockEntity(blockEntity, blocks);
    }

    public static void loadBlockEntities() {
    }
}
