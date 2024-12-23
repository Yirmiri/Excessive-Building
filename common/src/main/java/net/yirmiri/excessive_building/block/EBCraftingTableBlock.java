package net.yirmiri.excessive_building.block;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.util.EBCraftingScreenHandler;

public class EBCraftingTableBlock extends CraftingTableBlock {
    private static final Component TITLE = Component.translatable("container.crafting");

    public EBCraftingTableBlock(Properties settings) {
        super(settings);
    }

    @Override
    public boolean isEnabled(FeatureFlagSet enable) {
        return EBConfig.ENABLE_CRAFTING_TABLE_VARIANTS.get();
    }

    @Override
    protected MenuProvider getMenuProvider(BlockState state, Level world, BlockPos pos) {
        return new SimpleMenuProvider(
                (syncId, inventory, player) -> new EBCraftingScreenHandler(syncId, inventory, ContainerLevelAccess.create(world, pos), this), TITLE
        );
    }
}
