package net.yirmiri.excessive_building.block;

import net.minecraft.block.LadderBlock;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.yirmiri.excessive_building.EBConfig;

public class EBLadderBlock extends LadderBlock {
    public EBLadderBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_LADDER_VARIANTS.get();
    }
}
