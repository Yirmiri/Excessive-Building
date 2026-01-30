package net.yirmiri.excessive_building.common.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.yirmiri.excessive_building.core.registry.EBBlocks;

public class AncientVinesBlock extends GrowingPlantHeadBlock {
    public static final MapCodec<AncientVinesBlock> CODEC = simpleCodec(AncientVinesBlock::new);
    public static final VoxelShape SHAPE = Block.box(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

    public AncientVinesBlock(BlockBehaviour.Properties properties) {
        super(properties, Direction.DOWN, SHAPE, false, 0.1);
    }

    @Override
    protected MapCodec<? extends GrowingPlantHeadBlock> codec() {
        return CODEC;
    }

    @Override
    protected int getBlocksToGrowWhenBonemealed(RandomSource random) {
        return NetherVines.getBlocksToGrowWhenBonemealed(random);
    }

    @Override
    protected Block getBodyBlock() {
        return EBBlocks.ANCIENT_VINES_PLANT.get();
    }

    @Override
    protected boolean canGrowInto(BlockState state) {
        return NetherVines.isValidGrowthState(state);
    }
}