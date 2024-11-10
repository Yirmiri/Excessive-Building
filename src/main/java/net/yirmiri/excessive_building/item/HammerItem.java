package net.yirmiri.excessive_building.item;

import com.google.common.collect.BiMap;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.yirmiri.excessive_building.EBClientConfig;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.util.EBTags;
import net.yirmiri.excessive_building.util.EBUtils;

import java.util.List;
import java.util.Optional;

public class HammerItem extends MiningToolItem {
    public static final Identifier BASE_ATTACK_DAMAGE_MODIFIER_ID = Identifier.ofVanilla("base_attack_damage");
    public static final Identifier BASE_ATTACK_SPEED_MODIFIER_ID = Identifier.ofVanilla("base_attack_speed");
    public static final Identifier BASE_ENTITY_INTERACTION_MODIFIER_ID = Identifier.ofVanilla("base_entity_interaction");

    public HammerItem(ToolMaterial material, Item.Settings settings) {
        super(material, EBTags.Blocks.HAMMER_MINEABLE, settings);
    }

    public static Optional<BlockState> getHammeredState(BlockState state) {
        return Optional.ofNullable((Block)((BiMap<Object, Object>) EBUtils.BASE_TO_HAMMERED_VARIANT.get()).get(state.getBlock()))
                .map((block) -> block.getStateWithProperties(state));
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext ctx) {
        World world = ctx.getWorld();
        BlockPos pos = ctx.getBlockPos();
        BlockState state = world.getBlockState(pos);
        PlayerEntity player = ctx.getPlayer();
        Hand hand = player.getActiveHand();
        ItemStack hammer = ctx.getStack();
        ItemStack stackHand = player.getStackInHand(hand);

        if (EBConfig.ENABLE_HAMMERS.get() && getHammeredState(state).isPresent()
                && !player.shouldCancelInteraction() && !player.getOffHandStack().isIn(EBTags.Items.TAKES_PRIORITY_OVER_TOOLS)) {
            EBUtils.hammerUsed(world, pos, state, player);
            if (player instanceof ServerPlayerEntity) {
                Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) player, pos, stackHand);
                hammer.damage(1, player, LivingEntity.getSlotForHand(ctx.getHand()));
            }
            return getHammeredState(state).map((state2) -> {
                world.setBlockState(pos, state2, 11);
                world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, state2));
                return ActionResult.SUCCESS;
            }
            ).orElse(ActionResult.PASS);
        }

        return super.useOnBlock(ctx);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext ctx, List<Text> tooltip, TooltipType options) {
        if (EBClientConfig.ENABLE_CUSTOM_TOOLTIPS.get() && EBConfig.ENABLE_HAMMERS.get()) {
            super.appendTooltip(stack, ctx, tooltip, options);
            tooltip.add(ScreenTexts.EMPTY);
            tooltip.add(Text.translatable("tooltip.block.interact").formatted(Formatting.GRAY));
            tooltip.add(ScreenTexts.space().append(Text.translatable("tooltip.item.hammer.desc").formatted(Formatting.BLUE)));
        }
    }

    public static AttributeModifiersComponent createAttributeModifiers() {
        float damage = 5.0F;
        float atk_speed = -3.4F;
        float atk_reach = -1.5F;
        if (EBConfig.ENABLE_HAMMER_AS_WEAPON.get()) {
            return AttributeModifiersComponent.builder().add(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(BASE_ATTACK_DAMAGE_MODIFIER_ID, damage, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                    .add(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(BASE_ATTACK_SPEED_MODIFIER_ID, atk_speed, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                    .add(EntityAttributes.PLAYER_ENTITY_INTERACTION_RANGE, new EntityAttributeModifier(BASE_ENTITY_INTERACTION_MODIFIER_ID, atk_reach, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build();
        } else {
            return AttributeModifiersComponent.builder().add(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(BASE_ATTACK_SPEED_MODIFIER_ID, atk_speed, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build();
        }
    }

    @Override
    public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        int stack_damage = EBConfig.ENABLE_HAMMER_AS_WEAPON.get() ? 1 : 2;
        stack.damage(stack_damage, attacker, EquipmentSlot.MAINHAND);
        if (EBConfig.ENABLE_HAMMER_AS_WEAPON.get()) {
            target.takeKnockback(0.5F + attacker.getMovementSpeed(), attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
            if (attacker.getMovementSpeed() > 0.5F) {
                attacker.playSound(SoundEvents.ITEM_MACE_SMASH_GROUND, 1.0F, 1.0F);
            }
        }
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_HAMMERS.get();
    }
}
