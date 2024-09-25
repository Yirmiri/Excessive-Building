package net.yirmiri.excessive_building.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.yirmiri.excessive_building.EBClientConfig;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.util.EBTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Environment(EnvType.CLIENT)
@Mixin(Item.class)
public abstract class ItemMixin {
    @Inject(at = @At("HEAD"), method = "appendTooltip")
    private void appendTooltip(ItemStack stack, Item.TooltipContext ctx, List<Text> tooltip, TooltipType type, CallbackInfo ci) {
        if (stack.isIn(EBTags.Items.HAMMERABLE_TOOLTIP) && EBClientConfig.ENABLE_HAMMERABLE_TOOLTIPS.get()) {
            tooltip.add(Text.translatable("tooltip." + ExcessiveBuilding.MOD_ID + ".hammerable").formatted(Formatting.GRAY).formatted(Formatting.ITALIC));
        }
    }
}
