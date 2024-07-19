package net.yirmiri.excessive_building.mixin;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.util.SkinTextures;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.function.Supplier;

@Mixin(PlayerListEntry.class)
public abstract class PlayerListEntryMixin {

    @Shadow public abstract GameProfile getProfile();
    @Shadow @Final private Supplier<SkinTextures> texturesSupplier;

    @Inject(method = "getSkinTextures", at = @At("RETURN"), cancellable = true)
    public void capeTexture(CallbackInfoReturnable<SkinTextures> cir) {
        Identifier texture = null;
        String playerUUID = getProfile().getId().toString();

        switch (playerUUID) {
            case "1cedf927-5c8f-4650-95e9-808fc8f94d00", "bd35c402-fa9c-4d00-afe6-b4ed9ebe90c4" -> texture = Identifier.of(ExcessiveBuilding.MOD_ID, "textures/capes/azurune.png");
            case "9778ff53-d83d-4233-8fa6-8aab7b89c4c0" -> texture = Identifier.of(ExcessiveBuilding.MOD_ID, "textures/capes/redeyevain.png");
            case "c12df14d-24ed-4247-84e8-e10c111237df" -> texture = Identifier.of(ExcessiveBuilding.MOD_ID, "textures/capes/beetroot.png");
            case "416fc916-69cc-4b3c-8c5e-a39a5acb6981" -> texture = Identifier.of(ExcessiveBuilding.MOD_ID, "textures/capes/demonheart.png");
            case "3fd1d511-62d6-4e18-a28d-3e3d4fd93620" -> texture = Identifier.of(ExcessiveBuilding.MOD_ID, "textures/capes/accursed.png");
            case "452ec9e4-a4f8-4edf-bd3c-ab3d7b751359" -> texture = Identifier.of(ExcessiveBuilding.MOD_ID, "textures/capes/dice.png");
            case "c1e0e811-8b55-4ff2-be32-443596a12ade" -> texture = Identifier.of(ExcessiveBuilding.MOD_ID, "textures/capes/hex.png");
            case "2ab2e589-b328-441d-bebb-1f129e330ec2" -> texture = Identifier.of(ExcessiveBuilding.MOD_ID, "textures/capes/pumpkin_queen.png");
            case "f73f8d0e-5c82-48d2-bad0-b7f1796aa2fc" -> texture = Identifier.of(ExcessiveBuilding.MOD_ID, "textures/capes/sad_cloud.png");
            case "eff789b6-ed9d-4787-8640-ab37e7daf81f" -> texture = Identifier.of(ExcessiveBuilding.MOD_ID, "textures/capes/wrathful.png");
            case "bc56b2c8-9ef8-4532-b045-00f44804bca4" -> texture = Identifier.of(ExcessiveBuilding.MOD_ID, "textures/capes/bug.png");
            case "27a729ac-0a2a-42fc-8e65-a37fcba6a6c7" -> texture = Identifier.of(ExcessiveBuilding.MOD_ID, "textures/capes/axolotl.png");
            case "4bc0a7a9-497a-4aa1-a5af-cee312f94b01" -> texture = Identifier.of(ExcessiveBuilding.MOD_ID, "textures/capes/rebellious.png");
            case "7a6a8c68-8b73-47f6-b08f-0dde5f1848dd" -> texture = Identifier.of(ExcessiveBuilding.MOD_ID, "textures/capes/fudge_sundae.png");
            case "8429992e-eba7-4dc9-a0b9-f941a55a5fb4" -> texture = Identifier.of(ExcessiveBuilding.MOD_ID, "textures/capes/shiny_pearl.png");
        }

        if (texture != null) {
            SkinTextures textures = texturesSupplier.get();
            cir.setReturnValue(new SkinTextures(textures.texture(), textures.textureUrl(), texture, texture, textures.model(), textures.secure()));
        }
    }
}
