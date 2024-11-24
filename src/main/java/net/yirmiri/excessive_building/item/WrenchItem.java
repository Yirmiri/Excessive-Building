package net.yirmiri.excessive_building.item;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.yirmiri.excessive_building.EBClientConfig;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.util.EBTags;
import net.yirmiri.excessive_building.util.EBUtils;

import java.util.List;

public class WrenchItem extends Item {
    public WrenchItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext ctx) {
        World world = ctx.getWorld();
        BlockPos pos = ctx.getBlockPos();
        BlockState state = world.getBlockState(pos);
        PlayerEntity player = ctx.getPlayer();

        if (EBConfig.ENABLE_WRENCHES.get() &&
                !player.getOffHandStack().isIn(EBTags.Items.TAKES_PRIORITY_OVER_TOOLS) && !state.isIn(EBTags.Blocks.CANNOT_BE_WRENCHED)) {
//TODO: simplify
            if (state.contains(Properties.ROTATION)) {
                world.setBlockState(pos, state.cycle(Properties.ROTATION));
                useWrench(ctx);
            } else if (player.isSneaking() && state.contains(Properties.BLOCK_HALF)) {
                world.setBlockState(pos, state.cycle(Properties.BLOCK_HALF));
                useWrench(ctx);
            } else if (player.isSneaking() && state.contains(Properties.FACING)) {
                world.setBlockState(pos, state.cycle(Properties.FACING));
                useWrench(ctx);
            } else if (player.isSneaking() && state.contains(Properties.HORIZONTAL_AXIS)) {
                world.setBlockState(pos, state.cycle(Properties.HORIZONTAL_AXIS));
                useWrench(ctx);
            } else if (!player.isSneaking() && state.contains(Properties.HORIZONTAL_FACING)) {
                world.setBlockState(pos, state.cycle(Properties.HORIZONTAL_FACING));
                useWrench(ctx);
            }

            return ActionResult.SUCCESS;
        }

        return ActionResult.success(world.isClient);
    }

    public static void useWrench(ItemUsageContext ctx) {
        BlockPos pos = ctx.getBlockPos();
        PlayerEntity player = ctx.getPlayer();
        Hand hand = player.getActiveHand();
        ItemStack wrench = ctx.getStack();
        ItemStack stackHand = player.getStackInHand(hand);

        EBUtils.wrenchUsed(player);
        if (player instanceof ServerPlayerEntity) {
            Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, pos, stackHand);
            wrench.damage(1, player, LivingEntity.getSlotForHand(ctx.getHand()));
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext ctx, List<Text> tooltip, TooltipType options) {
        if (EBClientConfig.ENABLE_CUSTOM_TOOLTIPS.get() && EBConfig.ENABLE_HAMMERS.get()) {
            super.appendTooltip(stack, ctx, tooltip, options);
            tooltip.add(ScreenTexts.EMPTY);
            tooltip.add(Text.translatable("tooltip.block.interact").formatted(Formatting.GRAY));
            tooltip.add(ScreenTexts.space().append(Text.translatable("tooltip.item.wrench.desc").formatted(Formatting.BLUE)));
        }
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return ingredient.isIn(EBTags.Items.WRENCH_REPAIRABLE);
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_WRENCHES.get();
    }
}
