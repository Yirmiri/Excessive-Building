package net.yirmiri.excessive_building.block;

import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.yirmiri.excessive_building.EBConfig;

public class AncientSaplingBlock extends SaplingBlock {
    public AncientSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_ANCIENT_SAPLINGS.get();
    }
}
