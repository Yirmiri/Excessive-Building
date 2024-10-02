package net.yirmiri.excessive_building.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.block.entity.EBChestBlockEntity;

import java.util.function.Supplier;

public class EBChestBlock extends ChestBlock {
    private final WoodType type;

    public EBChestBlock(Properties settings, WoodType type, Supplier<BlockEntityType<? extends ChestBlockEntity>> supplier) {
        super(settings, supplier);
        this.type = type;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new EBChestBlockEntity(pos, state);
    }

//    @Override
//    public boolean isEnabled(FeatureSet enable) {
//        return EBConfig.ENABLE_CHEST_VARIANTS.get();
//    }

    public WoodType getType() {
        return this.type;
    }

    public static WoodType getType(Block block) {
        WoodType type;
        if (block instanceof EBChestBlock) {
            type = ((EBChestBlock)block).getType();
        } else {
            type = WoodType.OAK;
        }
        return type;
    }
}
