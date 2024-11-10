package net.yirmiri.excessive_building.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.registry.EBItems;
import net.yirmiri.excessive_building.util.EBTags;
import net.yirmiri.excessive_building.util.EBUtils;

public class GlowingLeavesBlock extends FloweringLeavesBlock {
    public static final BooleanProperty GLOWING = BooleanProperty.of("glowing");

    public GlowingLeavesBlock(ParticleEffect type, Settings settings) {
        super(type, settings);
        setDefaultState(stateManager.getDefaultState().with(GLOWING, true));
    }

    @Override
    public ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack stackHand = player.getStackInHand(hand);
        if (stackHand.isOf(EBItems.HAMMER) && EBConfig.ENABLE_HAMMERS.get()) {
            world.setBlockState(pos, state.cycle(GLOWING));
            EBUtils.hammerUsed(world, pos, state, player);
            player.sendMessage(Text.translatable("hammer." + this.getTranslationKey() + ".variant_" + state.get(GLOWING)), true);
            return ItemActionResult.SUCCESS;
        }
        return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }

    public static boolean isGlowing(BlockState state) {
        return state.get(GLOWING);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(GLOWING, DISTANCE, PERSISTENT, WATERLOGGED);
    }
}
