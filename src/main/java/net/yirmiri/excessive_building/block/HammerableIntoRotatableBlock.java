package net.yirmiri.excessive_building.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationPropertyHelper;
import net.minecraft.world.World;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.registry.EBItems;
import net.yirmiri.excessive_building.util.EBProperties;
import net.yirmiri.excessive_building.util.EBTags;
import net.yirmiri.excessive_building.util.EBUtils;

public class HammerableIntoRotatableBlock extends Block {
    protected final Block block;

    public HammerableIntoRotatableBlock(Block block, Settings settings) {
        super(settings);
        this.block = block;
    }

    @Override
    public ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack stackHand = player.getStackInHand(hand);
        BlockState stateToReplaceWith = block.getStateWithProperties(world.getBlockState(pos));
        if (stackHand.isOf(EBItems.HAMMER) && EBConfig.ENABLE_HAMMERS.get()) {
            world.setBlockState(pos, stateToReplaceWith.withIfExists(EBProperties.ROTATION, Integer.valueOf(RotationPropertyHelper.fromYaw(player.getYaw()))));
            EBUtils.hammerUsed(world, pos, state, player);
            return ItemActionResult.SUCCESS;
        }
        return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }
}
