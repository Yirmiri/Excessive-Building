package net.yirmiri.excessive_building.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.registry.EBBlockEntities;
import net.yirmiri.excessive_building.registry.EBStatusEffects;

import java.util.List;

public class ReachingLanternBlockEntity extends BlockEntity {
    public ReachingLanternBlockEntity(BlockPos pos, BlockState state) {
        super(EBBlockEntities.REACHING_LANTERN, pos, state);
    }

    public static void tick(Level world, BlockPos pos, BlockState state, ReachingLanternBlockEntity blockEntity) {
        if (EBConfig.ENABLE_REACHING_LANTERN_FUNCTIONALITY.get() && world.getGameTime() % 20L == 0L) {
            List<Player> nonSpectators = world.getEntitiesOfClass(Player.class, new AABB(pos).inflate(EBConfig.REACHING_LANTERN_RANGE.get()));
            if (!world.isClientSide() && !nonSpectators.isEmpty()) {
                for (Player playerEntity : nonSpectators) {
                    playerEntity.addEffect(new MobEffectInstance(EBStatusEffects.REACHING, 130, 0, true, false, true));
                }
            }
        }
    }
}
