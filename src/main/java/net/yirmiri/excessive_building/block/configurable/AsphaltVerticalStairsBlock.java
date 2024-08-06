package net.yirmiri.excessive_building.block.configurable;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.block.VerticalStairsBlock;

public class AsphaltVerticalStairsBlock extends VerticalStairsBlock {
    public AsphaltVerticalStairsBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_ASPHALT.get() && EBConfig.ENABLE_VERTICAL_STAIRS.get();
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        double d = Math.abs(entity.getVelocity().y);
        if (d < 1.1 && !entity.bypassesSteppingEffects()) {
            double e = 1.3 + d * 1.2;
            entity.setVelocity(entity.getVelocity().multiply(e, 1.0, e));
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
