package net.yirmiri.excessive_building.block.configurable;

import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.yirmiri.excessive_building.EBConfig;

public class GloomSaplingBlock extends SaplingBlock {
    public GloomSaplingBlock(TreeGrower generator, Properties settings) {
        super(generator, settings);
    }

    @Override
    public boolean isEnabled(FeatureFlagSet enable) {
        return EBConfig.ENABLE_GLOOM_SEEDS.get();
    }
}
