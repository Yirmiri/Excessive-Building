package net.yirmiri.excessive_building.screen;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen;
import net.minecraft.client.gui.screen.recipebook.FurnaceRecipeBookScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.Identifier;
import net.minecraft.text.Text;
import net.yirmiri.excessive_building.ExcessiveBuilding;

@Environment(EnvType.CLIENT)
public class KilnScreen extends AbstractFurnaceScreen<KilnScreenHandler> {
    private static final Identifier KILN_GUI = Identifier.of(ExcessiveBuilding.MOD_ID,"textures/gui/container/kiln.png");
    private static final Identifier LIT_PROGRESS = Identifier.of(ExcessiveBuilding.MOD_ID, "container/kiln/lit_progress");
    private static final Identifier BURN_PROGRESS = Identifier.of(ExcessiveBuilding.MOD_ID,"container/kiln/burn_progress");

    public KilnScreen(KilnScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, new FurnaceRecipeBookScreen(), inventory, title, KILN_GUI, LIT_PROGRESS, BURN_PROGRESS);
    }
}
