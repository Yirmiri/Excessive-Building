package net.yirmiri.excessive_building.common.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.List;

public class MagnetItem extends Item {
    public MagnetItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext ctx, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, ctx, tooltip, flag);
        tooltip.add(CommonComponents.EMPTY);
        tooltip.add(Component.translatable("item.excessive_building.hand").withStyle(ChatFormatting.GRAY));
        //tooltip.add(CommonComponents.space().append(Component.translatable("item.excessive_building.magnet.desc").withStyle(ChatFormatting.BLUE)));
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
        if (!(entity instanceof Player player)) return;
        if (level.isClientSide) return;
        if (!player.isCrouching()) return;
        if (player.getMainHandItem() != stack && player.getOffhandItem() != stack) return;

        double radius = 12.0D;

        List<ItemEntity> items = level.getEntitiesOfClass(ItemEntity.class, player.getBoundingBox().inflate(radius));

        for (ItemEntity item : items) {
            Vec3 direction = player.position().subtract(item.position());
            double distance = direction.length();

            if (distance < 0.5D) continue;

            item.setNoPickUpDelay();
            item.setDeltaMovement(item.getDeltaMovement().add(direction.normalize().scale(0.25)));

            if (distance < 1.5D) {
                item.playerTouch(player);
            }
        }
    }
}
