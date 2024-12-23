package net.yirmiri.excessive_building.mixin;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.resources.PlayerSkin;
import net.minecraft.resources.ResourceLocation;
import net.yirmiri.excessive_building.EBClientConfig;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.function.Supplier;

@Mixin(PlayerInfo.class)
public abstract class PlayerListEntryMixin {

    @Shadow public abstract GameProfile getProfile();
    @Shadow @Final private Supplier<PlayerSkin> texturesSupplier;

    @Inject(method = "getSkinTextures", at = @At("HEAD"), cancellable = true)
    public void excessiveBuilding_getSkinTextures(CallbackInfoReturnable<PlayerSkin> cir) {
        ResourceLocation texture = null;
        String playerUUID = getProfile().getId().toString();

        switch (playerUUID) {
            case "1cedf927-5c8f-4650-95e9-808fc8f94d00", "bd35c402-fa9c-4d00-afe6-b4ed9ebe90c4" -> texture = ExcessiveBuilding.modid("textures/capes/azurune.png");
            case "2913d971-a58d-4566-8706-b4fb5eacb954" -> texture = ExcessiveBuilding.modid("textures/capes/redeyevain.png");
            case "d1dac9fe-3ef0-4ea8-997b-b7cdd6a92131" -> texture = ExcessiveBuilding.modid("textures/capes/robor.png");
            case "9778ff53-d83d-4233-8fa6-8aab7b89c4c0" -> texture = ExcessiveBuilding.modid("textures/capes/beetroot.png");
            case "c12df14d-24ed-4247-84e8-e10c111237df" -> texture = ExcessiveBuilding.modid("textures/capes/demonheart.png");
            case "416fc916-69cc-4b3c-8c5e-a39a5acb6981" -> texture = ExcessiveBuilding.modid("textures/capes/accursed.png");
            case "3fd1d511-62d6-4e18-a28d-3e3d4fd93620" -> texture = ExcessiveBuilding.modid("textures/capes/dice.png");
            case "452ec9e4-a4f8-4edf-bd3c-ab3d7b751359" -> texture = ExcessiveBuilding.modid("textures/capes/hex.png");
            case "c1e0e811-8b55-4ff2-be32-443596a12ade" -> texture = ExcessiveBuilding.modid("textures/capes/pumpkin_queen.png");
            case "2ab2e589-b328-441d-bebb-1f129e330ec2" -> texture = ExcessiveBuilding.modid("textures/capes/sad_cloud.png");
            case "f73f8d0e-5c82-48d2-bad0-b7f1796aa2fc" -> texture = ExcessiveBuilding.modid("textures/capes/wrathful.png");
            case "eff789b6-ed9d-4787-8640-ab37e7daf81f" -> texture = ExcessiveBuilding.modid("textures/capes/bug.png");
            case "bc56b2c8-9ef8-4532-b045-00f44804bca4" -> texture = ExcessiveBuilding.modid("textures/capes/axolotl.png");
            case "27a729ac-0a2a-42fc-8e65-a37fcba6a6c7" -> texture = ExcessiveBuilding.modid("textures/capes/lightning.png");
            case "4bc0a7a9-497a-4aa1-a5af-cee312f94b01" -> texture = ExcessiveBuilding.modid("textures/capes/rebellious.png");
            case "7a6a8c68-8b73-47f6-b08f-0dde5f1848dd" -> texture = ExcessiveBuilding.modid("textures/capes/fudge_sundae.png");
            case "8429992e-eba7-4dc9-a0b9-f941a55a5fb4" -> texture = ExcessiveBuilding.modid("textures/capes/shiny_pearl.png");
        }

        if (texture != null) {
            PlayerSkin textures = texturesSupplier.get();
            cir.setReturnValue(new PlayerSkin(textures.texture(), textures.textureUrl(), texture, texture, textures.model(), textures.secure()));
        }
    }
}
