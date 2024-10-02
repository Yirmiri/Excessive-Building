package net.yirmiri.excessive_building.block.configurable;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.yirmiri.excessive_building.EBConfig;

public class ResourceBrickStairsBlock extends StairsBlock {
    public ResourceBrickStairsBlock(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_RESOURCE_BRICKS.get();
    }
}
