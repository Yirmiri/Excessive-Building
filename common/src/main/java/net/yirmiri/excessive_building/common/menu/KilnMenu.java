package net.yirmiri.excessive_building.common.menu;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;

public class KilnMenu extends AbstractFurnaceMenu {
    public KilnMenu(int containerId, Inventory playerInventory) {
        super(EBMenus.KILN, EBRecipeTypes.BAKING, EBRecipeBookType.KILN, containerId, playerInventory);
    }

    public KilnMenu(int containerId, Inventory playerInventory, Container smokerContainer, ContainerData smokerData) {
        super(EBMenus.KILN, EBRecipeTypes.BAKING, EBRecipeBookType.KILN, containerId, playerInventory, smokerContainer, smokerData);
    }
}
