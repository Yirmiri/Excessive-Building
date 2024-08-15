package net.yirmiri.excessive_building.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.util.math.BlockPos;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.block.entity.EBChestBlockEntity;

import java.util.function.Supplier;

public class EBChestBlock extends ChestBlock {
    public static String type;

    public EBChestBlock(Settings settings, String type, Supplier<BlockEntityType<? extends ChestBlockEntity>> supplier) {
        super(settings, supplier);
        EBChestBlock.type = type;
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new EBChestBlockEntity(pos, state);
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_CHEST_VARIANTS.get();
    }

    public static String getType() {
        return EBChestBlock.type;
    }
}
