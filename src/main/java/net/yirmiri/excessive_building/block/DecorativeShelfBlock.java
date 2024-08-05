package net.yirmiri.excessive_building.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.yirmiri.excessive_building.EBConfig;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DecorativeShelfBlock extends Block {
    public static final IntProperty VARIANT = IntProperty.of("variant", 0, 6);

    public DecorativeShelfBlock(Settings settings) {
        super(settings);
        setDefaultState(stateManager.getDefaultState().with(VARIANT, 0));
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_DECORATIVE_SHELVES.get();
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        if (EBConfig.ENABLE_CUSTOM_TOOLTIPS.get()) {
            super.appendTooltip(stack, context, tooltip, options);
            tooltip.add(ScreenTexts.EMPTY);
            tooltip.add(Text.translatable("tooltip.block.interact").formatted(Formatting.GRAY));
            tooltip.add(ScreenTexts.space().append(Text.translatable("tooltip.block.variant").formatted(Formatting.BLUE)));
        }
    }

    @Override @NotNull
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!world.isClient && !player.hasStackEquipped(EquipmentSlot.MAINHAND)) {
            world.setBlockState(pos, state.cycle(VARIANT));
            world.playSound(null, pos, SoundEvents.BLOCK_CHISELED_BOOKSHELF_PLACE, SoundCategory.BLOCKS, 1, 1);
        } else {
            return ActionResult.PASS;
        }
        return ActionResult.success(true);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(VARIANT);
    }
}
