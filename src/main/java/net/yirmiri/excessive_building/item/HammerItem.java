package net.yirmiri.excessive_building.item;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
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
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.util.EBStats;
import net.yirmiri.excessive_building.util.EBTags;

import java.util.List;
import java.util.Optional;

public class HammerItem extends MiningToolItem {
    public static final Identifier BASE_ATTACK_DAMAGE_MODIFIER_ID = Identifier.ofVanilla("base_attack_damage");
    public static final Identifier BASE_ATTACK_SPEED_MODIFIER_ID = Identifier.ofVanilla("base_attack_speed");
    public static final Identifier BASE_ENTITY_INTERACTION_MODIFIER_ID = Identifier.ofVanilla("base_entity_interaction");
    public static final Identifier BASE_KNOCKBACK_MODIFIER_ID = Identifier.ofVanilla("base_knockback");

    public HammerItem(ToolMaterial material, Item.Settings settings) {
        super(material, EBTags.Blocks.HAMMER_MINEABLE, settings);
    }

    public static final Supplier<ImmutableBiMap<Object, Object>> BASE_TO_HAMMERED_VARIANT = Suppliers.memoize(() -> ImmutableBiMap.builder()
            .put(Blocks.BAMBOO_MOSAIC, EBBlocks.BAMBOO_BOARDS)
            .put(Blocks.BAMBOO_MOSAIC_STAIRS, EBBlocks.BAMBOO_BOARD_STAIRS)
            .put(Blocks.BAMBOO_MOSAIC_SLAB, EBBlocks.BAMBOO_BOARD_SLAB)
            .build());

    public static Optional<BlockState> getHammeredState(BlockState state) {
        return Optional.ofNullable((Block)((BiMap<Object, Object>) BASE_TO_HAMMERED_VARIANT.get()).get(state.getBlock()))
                .map((block) -> block.getStateWithProperties(state));
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext ctx) {
        PlayerEntity player = ctx.getPlayer();
        Hand hand = player.getActiveHand();
        ItemStack stackHand = player.getStackInHand(hand);
        World world = ctx.getWorld();
        BlockPos pos = ctx.getBlockPos();
        BlockState state = world.getBlockState(pos);
        if (stackHand.isIn(EBTags.Items.EB_HAMMERS) && EBConfig.ENABLE_HAMMERS.get() && player instanceof ServerPlayerEntity) {
            return getHammeredState(state).map((state2) -> {
                if (hand == Hand.MAIN_HAND) {
                    stackHand.damage(1, player, EquipmentSlot.MAINHAND);
                } else if (hand == Hand.OFF_HAND) {
                    stackHand.damage(1, player, EquipmentSlot.OFFHAND);
                }
                world.setBlockState(pos, state2, 11);
                world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, state2));
                world.syncWorldEvent(player, 3003, pos, 0);
                world.playSound(pos.getX(), pos.getY(), pos.getZ(), SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundCategory.BLOCKS, 0.5F, 1.0F, false);
                world.addBlockBreakParticles(pos, state);
                player.incrementStat(EBStats.BLOCKS_HAMMERED);
                return ActionResult.success(world.isClient);
            }
            ).orElse(ActionResult.PASS);
        }

        return super.useOnBlock(ctx);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        if (EBClientConfig.ENABLE_CUSTOM_TOOLTIPS.get() && EBConfig.ENABLE_HAMMERS.get()) {
            super.appendTooltip(stack, context, tooltip, options);
            tooltip.add(ScreenTexts.EMPTY);
            tooltip.add(Text.translatable("tooltip.block.interact").formatted(Formatting.GRAY));
            tooltip.add(ScreenTexts.space().append(Text.translatable("tooltip.item.hammer.desc").formatted(Formatting.BLUE)));
        }
    }

    public static AttributeModifiersComponent createAttributeModifiers() {
        float damage = 6.0F;
        float atk_speed = -3.4F;
        float atk_reach = -1.5F;
        float atk_kb = 1.5F;
        return AttributeModifiersComponent.builder().add(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(BASE_ATTACK_DAMAGE_MODIFIER_ID, damage, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(BASE_ATTACK_SPEED_MODIFIER_ID, atk_speed, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                .add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, new EntityAttributeModifier(BASE_KNOCKBACK_MODIFIER_ID, atk_kb, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                .add(EntityAttributes.PLAYER_ENTITY_INTERACTION_RANGE, new EntityAttributeModifier(BASE_ENTITY_INTERACTION_MODIFIER_ID, atk_reach, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build();

    }

    public int getEnchantability() {
        return 10;
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return ingredient.isIn(EBTags.Items.HAMMER_REPAIRABLE);
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_HAMMERS.get();
    }
}
