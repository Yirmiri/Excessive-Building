package net.yirmiri.excessive_building.util;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EBUtils {
    public static void hammerUsed(World world, BlockPos pos, BlockState state, Hand hand, PlayerEntity player) {
        ItemStack stackHand = player.getStackInHand(hand);
        world.playSound(pos.getX(), pos.getY(), pos.getZ(), SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundCategory.BLOCKS, 0.5F, 1.0F, false);
        world.addBlockBreakParticles(pos, state);
        player.incrementStat(EBStats.BLOCKS_HAMMERED);
        if (hand == Hand.MAIN_HAND) {
            stackHand.damage(1, player, EquipmentSlot.MAINHAND);
        } else if (hand == Hand.OFF_HAND) {
            stackHand.damage(1, player, EquipmentSlot.OFFHAND);
        }
    }
}
