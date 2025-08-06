package net.yirmiri.excessive_building.common.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.yirmiri.excessive_building.common.menu.KilnMenu;
import net.yirmiri.excessive_building.core.registry.EBBlockEntities;

public class KilnBlockEntity extends AbstractFurnaceBlockEntity {
    public KilnBlockEntity(BlockPos pos, BlockState blockState) {
        super(EBBlockEntities.KILN.get(), pos, blockState, EBRecipeTypes.BAKING);
    }

    protected Component getDefaultName() {
        return Component.translatable("excessive_building.container.kiln");
    }

    protected int getBurnDuration(ItemStack fuel) {
        return super.getBurnDuration(fuel) / 2;
    }

    protected AbstractContainerMenu createMenu(int id, Inventory player) {
        return new KilnMenu(id, player, this, this.dataAccess);
    }
}

