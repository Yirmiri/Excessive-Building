package net.yirmiri.excessive_building.block;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.yirmiri.excessive_building.platform.Services;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DecorativeShelfBlock extends Block {
    public static final IntegerProperty VARIANT = IntegerProperty.create("variant", 0, 6);

    public DecorativeShelfBlock(Properties settings) {
        super(settings);
        registerDefaultState(stateDefinition.any().setValue(VARIANT, 0));
    }

    @Override
    public boolean isEnabled(FeatureFlagSet enable) {
        return Services.CONFIG.enableDecorativeShelves();
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter context, List<Component> tooltip, TooltipFlag options) {
        if (Services.CONFIG.enableCustomTooltips()) {
            super.appendHoverText(stack, context, tooltip, options);
            tooltip.add(CommonComponents.EMPTY);
            tooltip.add(Component.translatable("tooltip.block.interact").withStyle(ChatFormatting.GRAY));
            tooltip.add(CommonComponents.space().append(Component.translatable("tooltip.block.variant").withStyle(ChatFormatting.BLUE)));
        }
    }

    @Override @NotNull
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (!world.isClientSide()) {
            if (hand == InteractionHand.MAIN_HAND && !player.hasItemInSlot(EquipmentSlot.MAINHAND)) {
                world.setBlockAndUpdate(pos, state.cycle(VARIANT));
                world.playSound(null, pos, SoundEvents.CHISELED_BOOKSHELF_PLACE, SoundSource.BLOCKS, 1, 1);
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.PASS;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(VARIANT);
    }
}
