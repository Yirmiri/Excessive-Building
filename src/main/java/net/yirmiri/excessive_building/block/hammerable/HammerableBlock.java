package net.yirmiri.excessive_building.block.hammerable;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.MagmaBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationPropertyHelper;
import net.minecraft.world.World;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.util.EBProperties;
import net.yirmiri.excessive_building.util.EBTags;
import net.yirmiri.excessive_building.util.EBUtils;
import org.jetbrains.annotations.Nullable;

public class HammerableBlock extends Block {
    private static final int MAX_ROTATIONS = EBProperties.MAX_ROTATIONS;
    public static final IntProperty ROTATION = EBProperties.ROTATION;
    protected final Block block;

    public HammerableBlock(Block block, Settings settings) {
        super(settings);
        this.block = block;
    }

    @Override
    public ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack stackHand = player.getStackInHand(hand);
        BlockState stateToReplaceWith = block.getStateWithProperties(world.getBlockState(pos));
        if (stackHand.isIn(EBTags.Items.EB_HAMMERS) && EBConfig.ENABLE_HAMMERS.get()) {
            world.setBlockState(pos, stateToReplaceWith.withIfExists(ROTATION, Integer.valueOf(RotationPropertyHelper.fromYaw(player.getYaw()))));
            EBUtils.hammerUsed(world, pos, state, hand, player);
            return ItemActionResult.SUCCESS;
        }
        return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(ROTATION, Integer.valueOf(RotationPropertyHelper.fromYaw(ctx.getPlayerYaw())));
    }

    @Override
    protected BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(ROTATION, Integer.valueOf(rotation.rotate(state.get(ROTATION), MAX_ROTATIONS)));
    }

    @Override
    protected BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.with(ROTATION, Integer.valueOf(mirror.mirror(state.get(ROTATION), MAX_ROTATIONS)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ROTATION);
    }
}
