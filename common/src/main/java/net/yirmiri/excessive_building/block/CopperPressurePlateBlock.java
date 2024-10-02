package net.yirmiri.excessive_building.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CopperPressurePlateBlock extends PressurePlateBlock {
    private final int ticks;

    public CopperPressurePlateBlock(PressurePlateBlock.Sensitivity rule, BlockBehaviour.Properties settings, BlockSetType type, int ticks) {
        super(rule, settings, type);
        this.ticks = ticks;
    }

    @Override
    protected int getPressedTime() {
        return ticks;
    }

    @Override
    protected int getSignalForState(BlockState state) {
        return state.getValue(POWERED) ? 15 : 0;
    }

    @Override
    protected int getSignalStrength(Level world, BlockPos pos) {
        Class<? extends Entity> class_ = switch (CopperPressurePlateBlock.ActivationRule.PLAYER) {
            case PLAYER -> Player.class;
        };
        return getEntityCount(world, TOUCH_AABB.move(pos), class_) > 0 ? 15 : 0;
    }

    public enum ActivationRule {
        PLAYER
    }
}
