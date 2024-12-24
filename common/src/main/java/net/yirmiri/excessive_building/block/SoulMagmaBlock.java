package net.yirmiri.excessive_building.block;

import net.minecraft.ChatFormatting;
import net.minecraft.block.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BubbleColumnBlock;
import net.minecraft.world.level.block.MagmaBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.yirmiri.excessive_building.EBClientConfig;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SoulMagmaBlock extends MagmaBlock {
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;

    public SoulMagmaBlock(Properties settings) {
        super(settings);
        this.registerDefaultState(this.defaultBlockState().setValue(POWERED, Boolean.valueOf(false)));
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltip, TooltipFlag options) {
        if (EBClientConfig.ENABLE_CUSTOM_TOOLTIPS.get()) {
            super.appendHoverText(stack, context, tooltip, options);
            tooltip.add(CommonComponents.EMPTY);
            tooltip.add(Component.translatable("tooltip.block.when_powered").withStyle(ChatFormatting.GRAY));
            tooltip.add(CommonComponents.space().append(Component.translatable("tooltip.block.soul_magma").withStyle(ChatFormatting.BLUE)));
        }
    }

    @Override
    public void stepOn(Level world, BlockPos pos, BlockState state, Entity entity) {
        if (!entity.isSteppingCarefully() && entity instanceof LivingEntity) {
            entity.hurt(world.damageSources().hotFloor(), 2.0F);
        }

        super.stepOn(world, pos, state, entity);
    }

    @Nullable @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(POWERED, Boolean.valueOf(ctx.getLevel().hasNeighborSignal(ctx.getClickedPos())));
    }

    @Override
    protected void neighborChanged(BlockState state, Level world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if (!world.isClientSide) {
            boolean powered = state.getValue(POWERED);
            if (powered != world.hasNeighborSignal(pos)) {
                if (powered) {
                    world.scheduleTick(pos, this, 4);
                } else {
                    world.setBlock(pos, state.cycle(POWERED), Block.UPDATE_CLIENTS);
                }
            }
        }
    }

    @Override
    protected void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (state.getValue(POWERED) && !world.hasNeighborSignal(pos)) {
            world.setBlock(pos, state.cycle(POWERED), Block.UPDATE_CLIENTS);
        }
        BubbleColumnBlock.updateColumn(world, pos.above(), state);
    }

    @Override
    protected BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor world, BlockPos pos, BlockPos neighborPos) {
        if (direction == Direction.UP && neighborState.is(Blocks.WATER)) {
            world.scheduleTick(pos, this, 20);
        }

        return super.updateShape(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    protected void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean notify) {
        world.scheduleTick(pos, this, 20);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(POWERED);
    }
}
