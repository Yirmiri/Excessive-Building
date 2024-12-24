package net.yirmiri.excessive_building.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.RotationSegment;
import net.minecraft.world.phys.BlockHitResult;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.registry.EBItems;
import net.yirmiri.excessive_building.util.EBProperties;
import net.yirmiri.excessive_building.util.EBUtils;

public class HammerableIntoRotatableBlock extends Block {
    protected final Block block;

    public HammerableIntoRotatableBlock(Block block, Properties settings) {
        super(settings);
        this.block = block;
    }

    @Override
    public ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack stackHand = player.getItemInHand(hand);
        BlockState stateToReplaceWith = block.withPropertiesOf(world.getBlockState(pos));
        if (stackHand.is(EBItems.HAMMER) && EBConfig.ENABLE_HAMMERS.get()) {
            world.setBlockAndUpdate(pos, stateToReplaceWith.trySetValue(EBProperties.ROTATION, Integer.valueOf(RotationSegment.convertToSegment(player.getYRot()))));
            EBUtils.hammerUsed(world, pos, state, player);
            return ItemInteractionResult.SUCCESS;
        }
        return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }
}
