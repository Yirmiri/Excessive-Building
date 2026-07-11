package net.yirmiri.excessive_building.core.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.item.BlockItem;
import net.yirmiri.excessive_building.core.registry.EBAttributes;
import net.yirmiri.excessive_building.core.registry.EBEffects;
import net.yirmiri.excessive_building.core.registry.EBItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MinecraftMixin {
    @Shadow private int rightClickDelay;

    @Shadow public LocalPlayer player;

    @Inject(method = "startUseItem", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/InteractionHand;values()[Lnet/minecraft/world/InteractionHand;"))
    private void excessiveBuilding$startUseItem(CallbackInfo info) {
        if (player != null) {
            rightClickDelay = getClickDelay();
        }
    }

    @Unique
    private int getClickDelay() {
        int clickDelay = 4;
        boolean mainHandBlock = player.getMainHandItem().getItem() instanceof BlockItem;
        boolean offHandBlock = player.getOffhandItem().getItem() instanceof BlockItem;

        if (mainHandBlock || offHandBlock) {
            if (player.getAttribute(EBAttributes.PLACEMENT_DELAY) != null) {
                clickDelay += (int) player.getAttribute(EBAttributes.PLACEMENT_DELAY).getValue();
            }
        }
        return Math.max(clickDelay, 0);
    }
}