package net.yirmiri.excessive_building.block.configurable;

import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.level.block.LadderBlock;
import net.yirmiri.excessive_building.platform.Services;

public class EBLadderBlock extends LadderBlock {
    public EBLadderBlock(Properties settings) {
        super(settings);
    }

    @Override
    public boolean isEnabled(FeatureFlagSet enable) {
        return Services.CONFIG.enableLadderVariants();
    }
}
