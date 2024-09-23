package net.yirmiri.excessive_building.block.hammerable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.util.EBTags;
import net.yirmiri.excessive_building.util.EBUtils;

public class HammerableSlabBlock extends SlabBlock {
    public static int maxVariants;
    public static final IntProperty VARIANT = IntProperty.of("variant", 0, maxVariants);

    public HammerableSlabBlock(int maxVariants, Settings settings) {
        super(settings);
        HammerableBlock.maxVariants = maxVariants;
    }

    @Override
    public ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack stackHand = player.getStackInHand(hand);
        if (stackHand.isIn(EBTags.Items.EB_HAMMERS) && EBConfig.ENABLE_HAMMERS.get()) {
            world.setBlockState(pos, state.cycle(VARIANT));
            EBUtils.hammerUsed(world, pos, state, hand, player);
            player.sendMessage(Text.translatable("hammer." + this.getTranslationKey() + ".variant_" + state.get(VARIANT)), true);
            return ItemActionResult.SUCCESS;
        }
        return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(VARIANT, WATERLOGGED, TYPE);
    }
}
