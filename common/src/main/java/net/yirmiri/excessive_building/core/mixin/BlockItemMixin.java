package net.yirmiri.excessive_building.core.mixin;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.state.BlockState;
import net.yirmiri.excessive_building.core.registry.EBItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockItem.class)
public class BlockItemMixin {

    @Inject(method = "placeBlock", at = @At(value = "HEAD"))
    private void excessiveBuilding$placeBlock(BlockPlaceContext ctx, BlockState state, CallbackInfoReturnable<Boolean> cir) {
        Player player = ctx.getPlayer();
        if (player != null && !player.isCreative()) {
            if (player.getMainHandItem().is(EBItems.RADIANCE_GAUNTLET.get())) {
                player.getMainHandItem().setDamageValue(player.getMainHandItem().getDamageValue() + 1);
            } else if (player.getOffhandItem().is(EBItems.RADIANCE_GAUNTLET.get())) {
                player.getOffhandItem().setDamageValue(player.getOffhandItem().getDamageValue() + 1);
            }
        }
    }
}
