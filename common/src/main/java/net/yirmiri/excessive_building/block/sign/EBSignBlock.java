package net.yirmiri.excessive_building.block.sign;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.yirmiri.excessive_building.block.entity.EBSignBlockEntity;

public class EBSignBlock extends StandingSignBlock {
    public EBSignBlock(WoodType woodType, Properties settings) {
        super(woodType, settings);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new EBSignBlockEntity(pos, state);
    }
}
