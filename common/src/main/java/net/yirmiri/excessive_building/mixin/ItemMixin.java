package net.yirmiri.excessive_building.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
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
    private void excessiveBuilding_appendTooltip(ItemStack stack, Item.TooltipContext ctx, List<Component> tooltip, TooltipFlag type, CallbackInfo ci) {
        if (stack.is(EBTags.Items.HAMMERABLE_TOOLTIP) && EBClientConfig.ENABLE_HAMMERABLE_TOOLTIPS.get()) {
            tooltip.add(Component.translatable("tooltip." + ExcessiveBuilding.MOD_ID + ".hammerable").withStyle(ChatFormatting.GRAY).withStyle(ChatFormatting.ITALIC));
        }
    }
}
