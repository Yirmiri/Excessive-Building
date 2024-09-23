package net.yirmiri.excessive_building.item;

import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.yirmiri.excessive_building.EBClientConfig;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.util.EBTags;

import java.util.List;

public class HammerItem extends MiningToolItem {
    public HammerItem(ToolMaterial material, Item.Settings settings) {
        super(material, EBTags.Blocks.HAMMER_MINEABLE, settings);
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
