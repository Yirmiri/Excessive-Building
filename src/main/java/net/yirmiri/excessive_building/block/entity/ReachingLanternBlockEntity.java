package net.yirmiri.excessive_building.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.registry.EBBlockEntities;
import net.yirmiri.excessive_building.registry.EBStatusEffects;

import java.util.List;

public class ReachingLanternBlockEntity extends BlockEntity {
    public ReachingLanternBlockEntity(BlockPos pos, BlockState state) {
        super(EBBlockEntities.REACHING_LANTERN, pos, state);
    }

    public static void tick(World world, BlockPos pos, BlockState state, ReachingLanternBlockEntity blockEntity) {
        if (EBConfig.ENABLE_REACHING_LANTERN_FUNCTIONALITY.get() && world.getTime() % 20L == 0L) {
            List<PlayerEntity> nonSpectators = world.getNonSpectatingEntities(PlayerEntity.class, new Box(pos).expand(EBConfig.REACHING_LANTERN_RANGE.get()));
            if (!world.isClient() && !nonSpectators.isEmpty()) {
                for (PlayerEntity playerEntity : nonSpectators) {
                    playerEntity.addStatusEffect(new StatusEffectInstance(EBStatusEffects.REACHING, 130, 0, true, false, true));
                }
            }
        }
    }
}
