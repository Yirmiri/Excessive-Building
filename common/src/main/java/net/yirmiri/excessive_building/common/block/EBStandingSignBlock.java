package net.yirmiri.excessive_building.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.yirmiri.excessive_building.common.block.entity.EBSignBlockEntity;

public class EBStandingSignBlock extends StandingSignBlock {
    public EBStandingSignBlock(WoodType woodType, Properties settings) {
        super(woodType, settings);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new EBSignBlockEntity(pos, state);
    }
}