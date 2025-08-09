package net.yirmiri.excessive_building.common.util;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class BlockTransmutation extends SimpleJsonResourceReloadListener {
    private static final Gson GSON = new Gson();

    public record TransmutationRule(Block resultBlock, @Nullable ResourceLocation soundEvent) {}

    private static final Map<Pair<Block, Item>, TransmutationRule> TRANSMUTATIONS = new HashMap<>();

    public BlockTransmutation() {
        super(GSON, "block_transmutation");
    }

    @Override
    protected void apply(Map<ResourceLocation, JsonElement> jsonMap, ResourceManager manager, ProfilerFiller profiler) {
        TRANSMUTATIONS.clear();
        for (JsonElement element : jsonMap.values()) {
            JsonObject obj = element.getAsJsonObject();
            JsonArray array = obj.getAsJsonArray("transmutations");
            for (JsonElement element1 : array) {
                JsonObject par = element1.getAsJsonObject();
                Block baseBlock = BuiltInRegistries.BLOCK.get(new ResourceLocation(par.get("base_block").getAsString()));
                Item heldItem = BuiltInRegistries.ITEM.get(new ResourceLocation(par.get("held_item").getAsString()));
                Block transmutedBlock = BuiltInRegistries.BLOCK.get(new ResourceLocation(par.get("transmuted_block").getAsString()));

                @Nullable ResourceLocation soundEvent = null;
                if (par.has("sound_event")) {
                    soundEvent = new ResourceLocation(par.get("sound_event").getAsString());
                }
                TRANSMUTATIONS.put(Pair.of(baseBlock, heldItem), new TransmutationRule(transmutedBlock, soundEvent));
            }
        }
    }

    @Nullable
    public static TransmutationRule getResult(Block inputBlock, Item heldItem) {
        return TRANSMUTATIONS.get(Pair.of(inputBlock, heldItem));
    }
}