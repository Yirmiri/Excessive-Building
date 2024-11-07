package net.yirmiri.excessive_building.block;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.yirmiri.excessive_building.platform.Services;
import net.yirmiri.excessive_building.util.EBTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GlowingLeavesBlock extends FloweringLeavesBlock {
    public static final BooleanProperty GLOWING = BooleanProperty.create("glowing");

    public GlowingLeavesBlock(ParticleOptions type, Properties settings) {
        super(type, settings);
        registerDefaultState(stateDefinition.any().setValue(GLOWING, true));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter context, List<Component> tooltip, TooltipFlag options) {
        if (Services.CONFIG.enableCustomTooltips()) {
            super.appendHoverText(stack, context, tooltip, options);
            tooltip.add(CommonComponents.EMPTY);
            tooltip.add(Component.translatable("tooltip.block.interact_glow_removals").withStyle(ChatFormatting.GRAY));
            tooltip.add(CommonComponents.space().append(Component.translatable("tooltip.block.glow_removal").withStyle(ChatFormatting.BLUE)));
        }
    }

    @Override @NotNull
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (state.getValue(GLOWING) && itemstack.is(EBTags.Items.GLOW_REMOVALS)) {
            removeGlow(state, world, pos);
            player.swing(hand);
            if (!player.isCreative()) {
                itemstack.shrink(1);
            }
        } else {
            return InteractionResult.PASS;
        }
        return InteractionResult.sidedSuccess(world.isClientSide);
    }

    private static void removeGlow(BlockState state, Level world, BlockPos pos) {
        if (!world.isClientSide) {
            world.setBlockAndUpdate(pos, state.setValue(GLOWING, false));
            world.playSound(null, pos, SoundEvents.DYE_USE, SoundSource.BLOCKS, 1, 1);
        }
    }

    public static boolean isGlowing(BlockState state) {
        return state.getValue(GLOWING);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(GLOWING, DISTANCE, PERSISTENT, WATERLOGGED);
    }
}
