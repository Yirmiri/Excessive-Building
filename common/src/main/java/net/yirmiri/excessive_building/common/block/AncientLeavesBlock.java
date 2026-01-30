package net.yirmiri.excessive_building.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.ParticleUtils;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.yirmiri.excessive_building.core.registry.EBBlocks;
import net.yirmiri.excessive_building.core.registry.EBParticles;

public class AncientLeavesBlock extends LeavesBlock implements BonemealableBlock {
    public AncientLeavesBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource source) {
        super.animateTick(state, level, pos, source);
        if (source.nextInt(10) == 0) {
            BlockPos blockpos = pos.below();
            BlockState blockstate = level.getBlockState(blockpos);
            if (!isFaceFull(blockstate.getCollisionShape(level, blockpos), Direction.UP)) {
                ParticleUtils.spawnParticleBelow(level, pos, source, EBParticles.ANCIENT.get());
            }
        }
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader reader, BlockPos pos, BlockState state) {
        return reader.getBlockState(pos.below()).isAir();
    }

    @Override
    public boolean isBonemealSuccess(Level level, RandomSource source, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource source, BlockPos pos, BlockState state) {
        if (level.getBlockState(pos.below()).isAir()) {
            level.setBlockAndUpdate(pos.below(), EBBlocks.ANCIENT_VINES.get().defaultBlockState());
        }
    }
}