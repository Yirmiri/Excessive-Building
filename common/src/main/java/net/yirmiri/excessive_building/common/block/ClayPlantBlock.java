package net.yirmiri.excessive_building.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockState;

public class ClayPlantBlock extends FlowerBlock implements BonemealableBlock {
    public ClayPlantBlock(SuspiciousStewEffects suspiciousStewEffects, Properties properties) {
        super(suspiciousStewEffects, properties);
    }

    public ClayPlantBlock(Holder<MobEffect> effect, float seconds, Properties properties) {
        super(effect, seconds, properties);
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader levelReader, BlockPos blockPos, BlockState blockState) {
        for (Direction direction : Direction.Plane.HORIZONTAL) {
            BlockPos targetPos = blockPos.relative(direction);
            if (levelReader.isEmptyBlock(targetPos)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isBonemealSuccess(Level level, RandomSource randomSource, BlockPos blockPos, BlockState blockState) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel serverLevel, RandomSource randomSource, BlockPos blockPos, BlockState blockState) {
        Direction[] directions = {
                Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST
        };

        for (Direction direction : directions) {
            if (serverLevel.isEmptyBlock(blockPos.relative(direction))) {
                serverLevel.setBlock(blockPos.relative(direction), this.defaultBlockState(), 3);
                return;
            }
        }
    }
}
