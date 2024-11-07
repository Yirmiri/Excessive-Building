package net.yirmiri.excessive_building.block.configurable;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.yirmiri.excessive_building.block.VerticalStairsBlock;
import net.yirmiri.excessive_building.platform.Services;

public class AsphaltVerticalStairsBlock extends VerticalStairsBlock {
    public AsphaltVerticalStairsBlock(Properties settings) {
        super(settings);
    }

    @Override
    public boolean isEnabled(FeatureFlagSet enable) {
        return Services.CONFIG.enableAsphalt() && Services.CONFIG.enableVerticalStairs();
    }

    @Override
    public void stepOn(Level world, BlockPos pos, BlockState state, Entity entity) {
        double d = Math.abs(entity.getDeltaMovement().y);
        if (d < 1.1 && !entity.isSteppingCarefully()) {
            double e = 1.3 + d * 1.2;
            entity.setDeltaMovement(entity.getDeltaMovement().multiply(e, 1.0, e));
        }

        super.stepOn(world, pos, state, entity);
    }
}
