package net.yirmiri.excessive_building.block.sign;

import net.minecraft.block.BlockState;
import net.minecraft.block.WallSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.yirmiri.excessive_building.block.entity.EBSignBlockEntity;

public class EBWallSignBlock extends WallSignBlock {
    public EBWallSignBlock(WoodType woodType, Settings settings) {
        super(settings, woodType);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new EBSignBlockEntity(pos, state);
    }
}