package net.yirmiri.excessive_building.block;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.yirmiri.excessive_building.EBClientConfig;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.util.EBProperties;
import net.yirmiri.excessive_building.util.EBTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.stream.Stream;

public class TerracottaPotBlock extends Block implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    private static final VoxelShape SHAPE = Stream.of(
            Block.box(0, 13, 0, 16, 16, 16),
            Block.box(1, 11, 1, 15, 13, 15),
            Block.box(0, 2, 0, 16, 11, 16),
            Block.box(1, 0, 1, 15, 2, 15)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public TerracottaPotBlock(Properties settings) {
        super(settings);
        registerDefaultState(stateDefinition.any().setValue(EBProperties.FILLED, false));
    }

    @Override
    public VoxelShape getShape(BlockState state, net.minecraft.world.level.BlockGetter world, BlockPos pos, CollisionContext ctx) {
        return SHAPE;
    }

    @Override
    public boolean isEnabled(FeatureFlagSet enable) {
        return EBConfig.ENABLE_TERRACOTTA_POTS.get();
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltip, TooltipFlag options) {
        if (EBClientConfig.ENABLE_CUSTOM_TOOLTIPS.get()) {
            super.appendHoverText(stack, context, tooltip, options);
            tooltip.add(CommonComponents.EMPTY);
            tooltip.add(Component.translatable("tooltip.block.interact_soil").withStyle(ChatFormatting.GRAY));
            tooltip.add(CommonComponents.space().append(Component.translatable("tooltip.block.fill").withStyle(ChatFormatting.BLUE)));
        }
    }

    @Override @NotNull
    public ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack stackHand = player.getItemInHand(hand);
        if (!state.getValue(EBProperties.FILLED) && stackHand.is(EBTags.Items.SOILS)) {
            addSoil(state, world, pos);
            if (!player.isCreative()) {
                stackHand.shrink(1);
            }
        } else {
            return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        }
        return ItemInteractionResult.sidedSuccess(world.isClientSide);
    }

    @Override @NotNull
    public InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        InteractionHand hand = player.getUsedItemHand();
        ItemStack stackHand = player.getItemInHand(hand);
        if (state.getValue(EBProperties.FILLED) && stackHand.isEmpty()) {
            removeSoil(state, world, pos);
            if (!player.isCreative()) {
                player.addItem(new ItemStack(Items.DIRT));
            }
            return InteractionResult.sidedSuccess(true);
        }
        return InteractionResult.PASS;
    }

    private static void addSoil(BlockState state, Level world, BlockPos pos) {
        if (!world.isClientSide) {
            world.setBlockAndUpdate(pos, state.setValue(EBProperties.FILLED, true));
            world.playSound(null, pos, SoundEvents.ROOTED_DIRT_PLACE, SoundSource.BLOCKS, 1, 1);
        }
    }

    private static void removeSoil(BlockState state, Level world, BlockPos pos) {
        if (!world.isClientSide) {
            world.setBlockAndUpdate(pos, state.setValue(EBProperties.FILLED, false));
            world.playSound(null, pos, SoundEvents.ROOTED_DIRT_BREAK, SoundSource.BLOCKS, 1, 1);
        }
    }

    @Nullable @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(WATERLOGGED, ctx.getLevel().getFluidState(ctx.getClickedPos()).is(Fluids.WATER));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(EBProperties.FILLED, WATERLOGGED);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor world, BlockPos pos, BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            world.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }

        return super.updateShape(state, direction, neighborState, world, pos, neighborPos);
    }
}
