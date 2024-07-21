package net.yirmiri.excessive_building.util;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;

public class EBCraftingScreenHandler extends CraftingScreenHandler {
    private final Block block;
    private final ScreenHandlerContext context;

    public EBCraftingScreenHandler(int syncId, PlayerInventory playerInventory, Block block) {
        this(syncId, playerInventory, ScreenHandlerContext.EMPTY, block);
    }

    public EBCraftingScreenHandler(int syncId, PlayerInventory playerInventory, ScreenHandlerContext context, Block block) {
        super(syncId, playerInventory, context);
        this.block = block;
        this.context = context;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return canUse(this.context, player, block);
    }
}