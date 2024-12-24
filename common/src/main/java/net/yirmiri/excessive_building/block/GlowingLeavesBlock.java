package net.yirmiri.excessive_building.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.registry.EBItems;
import net.yirmiri.excessive_building.util.EBUtils;

public class GlowingLeavesBlock extends FloweringLeavesBlock {
    public static final BooleanProperty GLOWING = BooleanProperty.create("glowing");

    public GlowingLeavesBlock(ParticleOptions type, Properties settings) {
        super(type, settings);
        registerDefaultState(stateDefinition.any().setValue(GLOWING, true));
    }

    @Override
    public ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack stackHand = player.getItemInHand(hand);
        if (stackHand.is(EBItems.HAMMER) && EBConfig.ENABLE_HAMMERS.get()) {
            world.setBlockAndUpdate(pos, state.cycle(GLOWING));
            EBUtils.hammerUsed(world, pos, state, player);
            player.displayClientMessage(Component.translatable("hammer." + this.getDescriptionId() + ".variant_" + state.getValue(GLOWING)), true);
            return ItemInteractionResult.SUCCESS;
        }
        return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }

    public static boolean isGlowing(BlockState state) {
        return state.getValue(GLOWING);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(GLOWING, DISTANCE, PERSISTENT, WATERLOGGED);
    }
}
