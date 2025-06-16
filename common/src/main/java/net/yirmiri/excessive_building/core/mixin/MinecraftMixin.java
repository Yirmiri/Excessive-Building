package net.yirmiri.excessive_building.core.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.item.BlockItem;
import net.yirmiri.excessive_building.core.registry.EBItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import javax.annotation.Nullable;

@Mixin(Minecraft.class)
public class MinecraftMixin {
    @Shadow private int rightClickDelay;

    @Shadow @Nullable public LocalPlayer player;

    @Inject(method = "startUseItem", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/InteractionHand;values()[Lnet/minecraft/world/InteractionHand;"))
    private void excessiveBuilding$startUseItem(CallbackInfo info) {
        if (player != null) {
            boolean mainHandGauntlet = player.getMainHandItem().is(EBItems.RADIANCE_GAUNTLET.get());
            boolean offHandGauntlet = player.getOffhandItem().is(EBItems.RADIANCE_GAUNTLET.get());
            boolean mainHandBlock = player.getMainHandItem().getItem() instanceof BlockItem;
            boolean offHandBlock =  player.getOffhandItem().getItem() instanceof BlockItem;

            if ((mainHandGauntlet || offHandGauntlet) && (mainHandBlock || offHandBlock)) {
                rightClickDelay = 3;
            }
        }
    }
}
