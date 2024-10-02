package net.yirmiri.excessive_building.block.sign;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.yirmiri.excessive_building.block.entity.EBHangingSignBlockEntity;

public class EBHangingSignBlock extends CeilingHangingSignBlock {
    public EBHangingSignBlock(WoodType woodType, Properties settings) {
        super(settings, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new EBHangingSignBlockEntity(pos, state);
    }
}
