package net.yirmiri.excessive_building.block;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.BlockState;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CopperPressurePlateBlock extends PressurePlateBlock {
    private final int ticks;

    public CopperPressurePlateBlock(BlockSetType type, Settings settings, int ticks) {
        super(type, settings);
        this.ticks = ticks;
    }

    @Override
    protected int getTickRate() {
        return ticks;
    }

    @Override
    protected int getRedstoneOutput(BlockState state) {
        return state.get(POWERED) ? 15 : 0;
    }

    @Override
    protected int getRedstoneOutput(World world, BlockPos pos) {
        Class<? extends Entity> class_ = switch (OxidizablePressurePlateBlock.ActivationRule.PLAYER) {
            case OxidizablePressurePlateBlock.ActivationRule.PLAYER -> PlayerEntity.class;
        };
        return getEntityCount(world, BOX.offset(pos), class_) > 0 ? 15 : 0;
    }

    public enum ActivationRule {
        PLAYER
    }
}
