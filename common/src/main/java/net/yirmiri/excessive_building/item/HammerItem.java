package net.yirmiri.excessive_building.item;

import com.google.common.collect.BiMap;
import net.minecraft.ChatFormatting;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.yirmiri.excessive_building.EBClientConfig;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.util.EBTags;
import net.yirmiri.excessive_building.util.EBUtils;

import java.util.List;
import java.util.Optional;

public class HammerItem extends DiggerItem {
    public static final ResourceLocation BASE_ATTACK_DAMAGE_MODIFIER_ID = ResourceLocation.withDefaultNamespace("base_attack_damage");
    public static final ResourceLocation BASE_ATTACK_SPEED_MODIFIER_ID = ResourceLocation.withDefaultNamespace("base_attack_speed");
    public static final ResourceLocation BASE_ENTITY_INTERACTION_MODIFIER_ID = ResourceLocation.withDefaultNamespace("base_entity_interaction");

    public HammerItem(Tier material, Item.Properties settings) {
        super(material, EBTags.Blocks.HAMMER_MINEABLE, settings);
    }

    public static Optional<BlockState> getHammeredState(BlockState state) {
        return Optional.ofNullable((Block)((BiMap<Object, Object>) EBUtils.BASE_TO_HAMMERED_VARIANT.get()).get(state.getBlock()))
                .map((block) -> block.withPropertiesOf(state));
    }

    @Override
    public InteractionResult useOn(UseOnContext ctx) {
        Level world = ctx.getLevel();
        BlockPos pos = ctx.getClickedPos();
        BlockState state = world.getBlockState(pos);
        Player player = ctx.getPlayer();
        InteractionHand hand = player.getUsedItemHand();
        ItemStack hammer = ctx.getItemInHand();
        ItemStack stackHand = player.getItemInHand(hand);

        if (EBConfig.ENABLE_HAMMERS.get() && getHammeredState(state).isPresent()
                && !player.isSecondaryUseActive() && !player.getOffhandItem().is(EBTags.Items.TAKES_PRIORITY_OVER_TOOLS)) {
            EBUtils.hammerUsed(world, pos, state, player);
            if (player instanceof ServerPlayer) {
                CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer) player, pos, stackHand);
                hammer.hurtAndBreak(1, player, LivingEntity.getSlotForHand(ctx.getHand()));
            }
            return getHammeredState(state).map((state2) -> {
                world.setBlock(pos, state2, 11);
                world.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(player, state2));
                return InteractionResult.SUCCESS;
            }
            ).orElse(InteractionResult.PASS);
        }

        return super.useOn(ctx);
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext ctx, List<Component> tooltip, TooltipFlag options) {
        if (EBClientConfig.ENABLE_CUSTOM_TOOLTIPS.get() && EBConfig.ENABLE_HAMMERS.get()) {
            super.appendHoverText(stack, ctx, tooltip, options);
            tooltip.add(CommonComponents.EMPTY);
            tooltip.add(Component.translatable("tooltip.block.interact").withStyle(ChatFormatting.GRAY));
            tooltip.add(CommonComponents.space().append(Component.translatable("tooltip.item.hammer.desc").withStyle(ChatFormatting.BLUE)));
        }
    }

    public static ItemAttributeModifiers createAttributeModifiers() {
        float damage = 5.0F;
        float atk_speed = -3.4F;
        float atk_reach = -1.5F;
        if (EBConfig.ENABLE_HAMMER_AS_WEAPON.get()) {
            return ItemAttributeModifiers.builder().add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, damage, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                    .add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, atk_speed, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                    .add(Attributes.ENTITY_INTERACTION_RANGE, new AttributeModifier(BASE_ENTITY_INTERACTION_MODIFIER_ID, atk_reach, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).build();
        } else {
            return ItemAttributeModifiers.builder().add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, atk_speed, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).build();
        }
    }

    @Override
    public void postHurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        int stack_damage = EBConfig.ENABLE_HAMMER_AS_WEAPON.get() ? 1 : 2;
        stack.hurtAndBreak(stack_damage, attacker, EquipmentSlot.MAINHAND);
        if (EBConfig.ENABLE_HAMMER_AS_WEAPON.get()) {
            target.knockback(0.5F + attacker.getSpeed(), attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
            if (attacker.getSpeed() > 0.5F) {
                attacker.playSound(SoundEvents.MACE_SMASH_GROUND, 1.0F, 1.0F);
            }
        }
    }

    @Override
    public boolean isEnabled(FeatureFlagSet enable) {
        return EBConfig.ENABLE_HAMMERS.get();
    }
}
