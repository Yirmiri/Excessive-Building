package net.yirmiri.excessive_building.item;

import net.minecraft.ChatFormatting;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.yirmiri.excessive_building.EBClientConfig;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.util.EBTags;
import net.yirmiri.excessive_building.util.EBUtils;

import java.util.List;

public class WrenchItem extends Item {
    public WrenchItem(Properties settings) {
        super(settings);
    }

    @Override
    public InteractionResult useOn(UseOnContext ctx) {
        Level world = ctx.getLevel();
        BlockPos pos = ctx.getClickedPos();
        BlockState state = world.getBlockState(pos);
        Player player = ctx.getPlayer();

        if (EBConfig.ENABLE_WRENCHES.get() &&
                !player.getOffhandItem().is(EBTags.Items.TAKES_PRIORITY_OVER_TOOLS) && !state.is(EBTags.Blocks.CANNOT_BE_WRENCHED)) {
//TODO: simplify
            if (state.hasProperty(BlockStateProperties.ROTATION_16)) {
                world.setBlockAndUpdate(pos, state.cycle(BlockStateProperties.ROTATION_16));
                useWrench(ctx);
            } else if (player.isShiftKeyDown() && state.hasProperty(BlockStateProperties.HALF)) {
                world.setBlockAndUpdate(pos, state.cycle(BlockStateProperties.HALF));
                useWrench(ctx);
            } else if (player.isShiftKeyDown() && state.hasProperty(BlockStateProperties.FACING)) {
                world.setBlockAndUpdate(pos, state.cycle(BlockStateProperties.FACING));
                useWrench(ctx);
            } else if (player.isShiftKeyDown() && state.hasProperty(BlockStateProperties.HORIZONTAL_AXIS)) {
                world.setBlockAndUpdate(pos, state.cycle(BlockStateProperties.HORIZONTAL_AXIS));
                useWrench(ctx);
            } else if (!player.isShiftKeyDown() && state.hasProperty(BlockStateProperties.HORIZONTAL_FACING)) {
                world.setBlockAndUpdate(pos, state.cycle(BlockStateProperties.HORIZONTAL_FACING));
                useWrench(ctx);
            }

            return InteractionResult.SUCCESS;
        }

        return InteractionResult.sidedSuccess(world.isClientSide);
    }

    public static void useWrench(UseOnContext ctx) {
        BlockPos pos = ctx.getClickedPos();
        Player player = ctx.getPlayer();
        InteractionHand hand = player.getUsedItemHand();
        ItemStack wrench = ctx.getItemInHand();
        ItemStack stackHand = player.getItemInHand(hand);

        EBUtils.wrenchUsed(player);
        if (player instanceof ServerPlayer) {
            CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer) player, pos, stackHand);
            wrench.hurtAndBreak(1, player, LivingEntity.getSlotForHand(ctx.getHand()));
        }
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext ctx, List<Component> tooltip, TooltipFlag options) {
        if (EBClientConfig.ENABLE_CUSTOM_TOOLTIPS.get() && EBConfig.ENABLE_HAMMERS.get()) {
            super.appendHoverText(stack, ctx, tooltip, options);
            tooltip.add(CommonComponents.EMPTY);
            tooltip.add(Component.translatable("tooltip.block.interact").withStyle(ChatFormatting.GRAY));
            tooltip.add(CommonComponents.space().append(Component.translatable("tooltip.item.wrench.desc").withStyle(ChatFormatting.BLUE)));
        }
    }

    @Override
    public boolean isValidRepairItem(ItemStack stack, ItemStack ingredient) {
        return ingredient.is(EBTags.Items.WRENCH_REPAIRABLE);
    }

    @Override
    public boolean isEnabled(FeatureFlagSet enable) {
        return EBConfig.ENABLE_WRENCHES.get();
    }
}
