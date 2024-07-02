package net.yirmiri.excessive_building.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.particle.ParticleUtil;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.yirmiri.excessive_building.registry.EBParticles;
import net.yirmiri.excessive_building.util.EBTags;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AncientLeavesBlock extends LeavesBlock {
    public static final BooleanProperty GLOWING = BooleanProperty.of("glowing");

    public AncientLeavesBlock(Settings settings) {
        super(settings);
        setDefaultState(stateManager.getDefaultState().with(GLOWING, true));
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        super.appendTooltip(stack, context, tooltip, options);
        tooltip.add(ScreenTexts.EMPTY);
        tooltip.add(Text.translatable("tooltip.block.interact_glow_removals").formatted(Formatting.GRAY));
        tooltip.add(ScreenTexts.space().append(Text.translatable("tooltip.block.glow_removal").formatted(Formatting.BLUE)));
    }

    @Override @NotNull
    public ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemstack = player.getStackInHand(hand);
        if (state.get(GLOWING) && itemstack.isIn(EBTags.Items.GLOW_REMOVALS)) {
            removeGlow(state, world, pos);
            if (!player.isCreative()) {
                itemstack.decrement(1);
            }
        } else {
            return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        }
        return ItemActionResult.success(world.isClient);
    }

    private static void removeGlow(BlockState state, World world, BlockPos pos) {
        if (!world.isClient) {
            world.setBlockState(pos, state.with(GLOWING, false));
            world.playSound(null, pos, SoundEvents.ITEM_DYE_USE, SoundCategory.BLOCKS, 1, 1);
        }
    }

    public static boolean isGlowing(BlockState state) {
        return state.get(GLOWING);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(GLOWING, DISTANCE, PERSISTENT, WATERLOGGED);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        super.randomDisplayTick(state, world, pos, random);
        if (random.nextInt(10) == 0) {
            BlockPos blockPos = pos.down();
            BlockState blockState = world.getBlockState(blockPos);
            if (!isFaceFullSquare(blockState.getCollisionShape(world, blockPos), Direction.UP)) {
                ParticleUtil.spawnParticle(world, pos, random, EBParticles.ANCIENT_PARTICLE);
            }
        }
    }
}
