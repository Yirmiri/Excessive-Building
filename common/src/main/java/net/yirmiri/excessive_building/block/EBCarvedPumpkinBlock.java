package net.yirmiri.excessive_building.block;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.*;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.animal.SnowGolem;
import net.minecraft.world.item.Equipable;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CarvedPumpkinBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.pattern.BlockInWorld;
import net.minecraft.world.level.block.state.pattern.BlockPattern;
import net.minecraft.world.level.block.state.pattern.BlockPatternBuilder;
import net.minecraft.world.level.block.state.predicate.BlockStatePredicate;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.yirmiri.excessive_building.util.EBTags;

import java.util.function.Predicate;

public class EBCarvedPumpkinBlock extends CarvedPumpkinBlock implements Equipable {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    private static final Predicate<BlockState> IS_GOLEM_HEAD_PREDICATE = (state) -> state != null && (state.is(EBTags.Blocks.CARVED_PUMPKINS));

    private BlockPattern snowGolemDispenserPattern;
    private BlockPattern snowGolemPattern;
    private BlockPattern ironGolemDispenserPattern;
    private BlockPattern ironGolemPattern;

    private final boolean wearable;

    public EBCarvedPumpkinBlock(Properties settings, boolean wearable) {
        super(settings);
        this.wearable = wearable;
    }

    @Override
    public EquipmentSlot getEquipmentSlot() {
        if (wearable) {
            return EquipmentSlot.HEAD;
        }
        else return EquipmentSlot.MAINHAND;
    }

    protected void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean notify) {
        if (!oldState.is(state.getBlock())) {
            this.trySpawnGolem(world, pos);
        }
    }

    public boolean canSpawnGolem(LevelReader world, BlockPos pos) {
        return this.getOrCreateSnowGolemBase().find(world, pos) != null || this.getOrCreateIronGolemBase().find(world, pos) != null;
    }

    private void trySpawnGolem(Level world, BlockPos pos) {
        BlockPattern.BlockPatternMatch result = this.getOrCreateSnowGolemFull().find(world, pos);
        if (result != null) {
            SnowGolem snowGolemEntity = EntityType.SNOW_GOLEM.create(world);
            if (snowGolemEntity != null) {
                spawnGolemInWorld(world, result, snowGolemEntity, result.getBlock(0, 2, 0).getPos());
            }
        } else {
            BlockPattern.BlockPatternMatch result2 = this.getOrCreateIronGolemFull().find(world, pos);
            if (result2 != null) {
                IronGolem ironGolemEntity = EntityType.IRON_GOLEM.create(world);
                if (ironGolemEntity != null) {
                    ironGolemEntity.setPlayerCreated(true);
                    spawnGolemInWorld(world, result2, ironGolemEntity, result2.getBlock(1, 2, 0).getPos());
                }
            }
        }

    }

    private static void spawnGolemInWorld(Level world, BlockPattern.BlockPatternMatch patternResult, Entity entity, BlockPos pos) {
        clearPatternBlocks(world, patternResult);
        entity.moveTo((double)pos.getX() + 0.5, (double)pos.getY() + 0.05, (double)pos.getZ() + 0.5, 0.0F, 0.0F);
        world.addFreshEntity(entity);

        for (ServerPlayer serverPlayerEntity : world.getEntitiesOfClass(ServerPlayer.class, entity.getBoundingBox().inflate(5.0))) {
            CriteriaTriggers.SUMMONED_ENTITY.trigger(serverPlayerEntity, entity);
        }

        updatePatternBlocks(world, patternResult);
    }

    public static void clearPatternBlocks(Level world, BlockPattern.BlockPatternMatch patternResult) {
        for(int i = 0; i < patternResult.getWidth(); ++i) {
            for(int j = 0; j < patternResult.getHeight(); ++j) {
                BlockInWorld cachedBlockPosition = patternResult.getBlock(i, j, 0);
                world.setBlock(cachedBlockPosition.getPos(), Blocks.AIR.defaultBlockState(), 2);
                world.levelEvent(2001, cachedBlockPosition.getPos(), Block.getId(cachedBlockPosition.getState()));
            }
        }

    }

    public static void updatePatternBlocks(Level world, BlockPattern.BlockPatternMatch patternResult) {
        for(int i = 0; i < patternResult.getWidth(); ++i) {
            for(int j = 0; j < patternResult.getHeight(); ++j) {
                BlockInWorld cachedBlockPosition = patternResult.getBlock(i, j, 0);
                world.blockUpdated(cachedBlockPosition.getPos(), Blocks.AIR);
            }
        }

    }

    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    private BlockPattern getOrCreateSnowGolemBase() {
        if (this.snowGolemDispenserPattern == null) {
            this.snowGolemDispenserPattern = BlockPatternBuilder.start().aisle(" ", "#", "#").where('#', BlockInWorld.hasState(BlockStatePredicate.forBlock(Blocks.SNOW_BLOCK))).build();
        }

        return this.snowGolemDispenserPattern;
    }

    private BlockPattern getOrCreateSnowGolemFull() {
        if (this.snowGolemPattern == null) {
            this.snowGolemPattern = BlockPatternBuilder.start().aisle("^", "#", "#").where('^', BlockInWorld.hasState(IS_GOLEM_HEAD_PREDICATE)).where('#', BlockInWorld.hasState(BlockStatePredicate.forBlock(Blocks.SNOW_BLOCK))).build();
        }

        return this.snowGolemPattern;
    }

    private BlockPattern getOrCreateIronGolemBase() {
        if (this.ironGolemDispenserPattern == null) {
            this.ironGolemDispenserPattern = BlockPatternBuilder.start().aisle("~ ~", "###", "~#~").where('#', BlockInWorld.hasState(BlockStatePredicate.forBlock(Blocks.IRON_BLOCK))).where('~', (pos) -> pos.getState().isAir()).build();
        }

        return this.ironGolemDispenserPattern;
    }

    private BlockPattern getOrCreateIronGolemFull() {
        if (this.ironGolemPattern == null) {
            this.ironGolemPattern = BlockPatternBuilder.start().aisle("~^~", "###", "~#~").where('^', BlockInWorld.hasState(IS_GOLEM_HEAD_PREDICATE)).where('#', BlockInWorld.hasState(BlockStatePredicate.forBlock(Blocks.IRON_BLOCK))).where('~', (pos) -> pos.getState().isAir()).build();
        }

        return this.ironGolemPattern;
    }
}
