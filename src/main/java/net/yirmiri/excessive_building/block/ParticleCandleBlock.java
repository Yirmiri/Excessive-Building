package net.yirmiri.excessive_building.block;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;
import net.minecraft.world.explosion.Explosion;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiConsumer;
import java.util.function.ToIntFunction;

public class ParticleCandleBlock extends Block implements Waterloggable {
    public static final BooleanProperty LIT = Properties.LIT;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public static final ToIntFunction<BlockState> STATE_TO_LUMINANCE = state -> state.get(LIT) ? 10 : 0;
    private static final VoxelShape SHAPE = Block.createCuboidShape(5, 0, 5, 11, 8, 11);
    public final ParticleEffect type;

    public ParticleCandleBlock(ParticleEffect type, Settings settings) {
        super(settings);
        this.type = type;
        setDefaultState(stateManager.getDefaultState().with(LIT, Boolean.valueOf(false)).with(WATERLOGGED, Boolean.valueOf(false)));
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        return SHAPE;
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (state.get(LIT)) {
            spawnParticles(world, new Vec3d(pos.getX() +0.5, pos.getY() +0.7, pos.getZ() +0.5), random);
            int i = pos.getX();
            int j = pos.getY();
            int k = pos.getZ();
            double d = i + random.nextDouble();
            double e = j + 0.7;
            double f = k + random.nextDouble();
            world.addParticle(type, d, e, f, 0.0, 0.0, 0.0);
            BlockPos.Mutable mutable = new BlockPos.Mutable();

            for (int l = 0; l < 14; l++) {
                mutable.set(i + MathHelper.nextInt(random, -10, 10), j - random.nextInt(10), k + MathHelper.nextInt(random, -10, 10));
                BlockState blockState = world.getBlockState(mutable);
                if (!blockState.isFullCube(world, mutable)) {
                    world.addParticle(type, mutable.getX() + random.nextDouble(), mutable.getY() + random.nextDouble(), mutable.getZ() + random.nextDouble(), 0.0, 0.0, 0.0);
                }
            }
        }
    }

    private static void spawnParticles(World world, Vec3d pos, Random random) {
        float rand = random.nextFloat();
        if (rand < 0.3f) {
            world.addParticle(ParticleTypes.SMOKE, pos.x, pos.y, pos.z, 0.0, 0.0, 0.0);
            if (rand < 0.17f) {
                world.playSound(pos.x + 0.5, pos.y + 0.5, pos.z + 0.5, SoundEvents.BLOCK_CANDLE_AMBIENT, SoundCategory.BLOCKS, 1.0f + random.nextFloat(), random.nextFloat() * 0.7f + 0.3f, false);
            }
        }
        world.addParticle(ParticleTypes.FLAME, pos.x, pos.y, pos.z, 0.0, 0.0, 0.0);
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (stack.isEmpty() && player.getAbilities().allowModifyWorld && state.get(LIT)) {
            extinguish(player, state, world, pos);
            return ItemActionResult.success(world.isClient);
        } else {
            return super.onUseWithItem(stack, state, world, pos, player, hand, hit);
        }
    }

    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT, WATERLOGGED);
    }

    @Override
    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        if (!state.get(WATERLOGGED) && fluidState.getFluid() == Fluids.WATER) {
            BlockState blockState = state.with(WATERLOGGED, Boolean.valueOf(true));
            if (state.get(LIT)) {
                extinguish(null, blockState, world, pos);
            } else {
                world.setBlockState(pos, blockState, Block.NOTIFY_ALL);
            }

            world.scheduleFluidTick(pos, fluidState.getFluid(), fluidState.getFluid().getTickRate(world));
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected void onProjectileHit(World world, BlockState state, BlockHitResult hit, ProjectileEntity projectile) {
        if (!world.isClient && projectile.isOnFire() && this.isNotLit(state)) {
            setLit(world, state, hit.getBlockPos(), true);
        }
    }

    protected boolean isNotLit(BlockState state) {
        return !state.get(WATERLOGGED) && !state.get(LIT);
    }

    @Override
    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return Block.sideCoversSmallSquare(world, pos.down(), Direction.UP);
    }

    public static void extinguish(@Nullable PlayerEntity player, BlockState state, WorldAccess world, BlockPos pos) {
        setLit(world, state, pos, false);
        world.playSound(null, pos, SoundEvents.BLOCK_CANDLE_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, 1.0F);
        world.addParticle(ParticleTypes.SMOKE, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 0.0, 0.1F, 0.0);
        world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
    }

    private static void setLit(WorldAccess world, BlockState state, BlockPos pos, boolean lit) {
        world.setBlockState(pos, state.with(LIT, Boolean.valueOf(lit)), Block.NOTIFY_ALL_AND_REDRAW);
    }

    @Override
    protected void onExploded(BlockState state, World world, BlockPos pos, Explosion explosion, BiConsumer<ItemStack, BlockPos> stackMerger) {
        if (explosion.canTriggerBlocks() && state.get(LIT)) {
            extinguish(null, state, world, pos);
        }

        super.onExploded(state, world, pos, explosion, stackMerger);
    }
}
