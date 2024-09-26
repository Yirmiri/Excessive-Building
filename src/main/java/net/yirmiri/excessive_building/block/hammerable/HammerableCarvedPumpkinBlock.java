package net.yirmiri.excessive_building.block.hammerable;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationPropertyHelper;
import net.minecraft.world.World;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.block.EBCarvedPumpkinBlock;
import net.yirmiri.excessive_building.util.EBProperties;
import net.yirmiri.excessive_building.util.EBTags;
import net.yirmiri.excessive_building.util.EBUtils;

public class HammerableCarvedPumpkinBlock extends EBCarvedPumpkinBlock {
    protected final Block block;

    public HammerableCarvedPumpkinBlock(Block block, Settings settings, boolean wearable) {
        super(settings, wearable);
        this.block = block;
    }

    @Override
    public ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack stackHand = player.getStackInHand(hand);
        BlockState stateToReplaceWith = block.getStateWithProperties(world.getBlockState(pos));
        if (stackHand.isIn(EBTags.Items.EB_HAMMERS) && EBConfig.ENABLE_HAMMERS.get()) {
            world.setBlockState(pos, stateToReplaceWith.withIfExists(EBProperties.ROTATION, Integer.valueOf(RotationPropertyHelper.fromYaw(player.getYaw()))));
            EBUtils.hammerUsed(world, pos, state, hand, player);
            return ItemActionResult.SUCCESS;
        }
        return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }
}
