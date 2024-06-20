package net.yirmiri.excessive_building.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.SmokerScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.yirmiri.excessive_building.recipe.EBRecipeRegistry;
import net.yirmiri.excessive_building.registry.EBBlockEntities;

public class KilnBlockEntity extends AbstractFurnaceBlockEntity {
    public KilnBlockEntity(BlockPos pos, BlockState state) {
        super(EBBlockEntities.KILN_BLOCK_ENTITY, pos, state, EBRecipeRegistry.KILN_RECIPE_TYPE);
    }

    @Override
    protected net.minecraft.text.Text getContainerName() {
        return Text.translatable("excessive_building.container.kiln");
    }

    @Override
    protected int getFuelTime(ItemStack fuel) {
        return super.getFuelTime(fuel) / 2;
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new SmokerScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}
