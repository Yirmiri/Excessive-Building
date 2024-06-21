package net.yirmiri.excessive_building.screen;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.screen.AbstractFurnaceScreenHandler;
import net.minecraft.screen.PropertyDelegate;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class KilnScreenHandler extends AbstractFurnaceScreenHandler {
    public KilnScreenHandler(int syncId, PlayerInventory playerInventory) {
        super(ExcessiveBuilding.KILN_SCREEN_HANDLER, ExcessiveBuilding.KILN_RECIPE_TYPE, RecipeBookCategory.FURNACE, syncId, playerInventory);
    }

    public KilnScreenHandler(int syncId, PlayerInventory playerInv, Inventory inv, PropertyDelegate delegate) {
        super(ExcessiveBuilding.KILN_SCREEN_HANDLER, ExcessiveBuilding.KILN_RECIPE_TYPE, RecipeBookCategory.FURNACE, syncId, playerInv, inv, delegate);
    }
}
