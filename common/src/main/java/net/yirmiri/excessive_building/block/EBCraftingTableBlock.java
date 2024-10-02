package net.yirmiri.excessive_building.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.util.EBCraftingScreenHandler;

public class EBCraftingTableBlock extends CraftingTableBlock {
    private static final Text TITLE = Text.translatable("container.crafting");

    public EBCraftingTableBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_CRAFTING_TABLE_VARIANTS.get();
    }

    @Override
    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory(
                (syncId, inventory, player) -> new EBCraftingScreenHandler(syncId, inventory, ScreenHandlerContext.create(world, pos), this), TITLE
        );
    }
}
