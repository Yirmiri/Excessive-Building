package net.yirmiri.excessive_building.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.yirmiri.excessive_building.EBConfig;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EBPotterySherdItem extends Item {
    private String author;

    public EBPotterySherdItem(String author, Settings settings) {
        super(settings);
        this.author = author;
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_EB_POTTERY_SHERDS.get();
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext ctx) {
        if (EBConfig.ENABLE_MISC_TOOLTIPS.get() && author != null) {
            super.appendTooltip(stack, world, tooltip, ctx);
            tooltip.add(Text.literal(author).formatted(Formatting.GRAY));
        }
    }
}
