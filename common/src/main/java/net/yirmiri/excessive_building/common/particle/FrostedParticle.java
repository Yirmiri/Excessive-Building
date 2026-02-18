package net.yirmiri.excessive_building.common.particle;

import net.azurune.runiclib.core.platform.RLServices;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.Mth;
import net.minecraft.world.item.DyeColor;

public class FrostedParticle extends TextureSheetParticle {
    private final float rotation;
    private final boolean direction;

    public FrostedParticle(ClientLevel client, double x, double y, double z, DyeColor dyeColor, SpriteSet set, boolean direction) {
        super(client, x, y, z);
        this.lifetime = 80 + client.random.nextIntBetweenInclusive(0, 80);
        this.xd = 0;
        this.yd = 0.04F * (direction ? 1 : -1);
        this.zd = 0;
        this.setSize(0.1425F, 0.1425F);
        this.quadSize = 0.151F;
        this.alpha = 0F;
        this.hasPhysics = false;
        this.rotation = ((this.random.nextFloat() / 8) - 0.06F) * 0.5F;
        this.setSprite(set.get(level.random));
        this.direction = direction;

        this.rCol = (dyeColor.getTextureDiffuseColor() >> 16 & 255) / 255.0F;
        this.gCol = (dyeColor.getTextureDiffuseColor() >> 8 & 255) / 255.0F;
        this.bCol = (dyeColor.getTextureDiffuseColor() & 255) / 255.0F;
    }

    @Override
    public void tick() {
        this.xo = this.x;
        this.yo = this.y;
        this.zo = this.z;
        this.oRoll = this.roll;

        if (this.age++ >= this.lifetime) {
            this.remove();
        }

        this.rCol = Math.clamp(this.rCol * 1.002F, 0, 1);
        this.gCol = Math.clamp(this.gCol * 1.002F, 0, 1);
        this.bCol = Math.clamp(this.bCol * 1.002F, 0, 1);

        double progress = (double) this.age / this.lifetime;
        double bob = 0.002 * progress;
        double directionOffset = this.direction ? 0 : Math.PI;

        this.yd = 0.04F * (this.direction ? 1F : -1F);

        this.x += bob * Math.cos(progress * Math.PI * 8 + directionOffset);
        this.y += this.yd;
        this.z += bob * Math.sin(progress * Math.PI * 8 + directionOffset);

        this.setPos(this.x, this.y, this.z);

        this.roll += this.rotation;

        double fadeIn = Mth.clamp(progress / 0.15D, 0.0D, 1.0D);
        double fadeOut = Mth.clamp((1.0D - progress) / 0.15D, 0.0D, 1.0D);
        this.alpha = (float) (fadeIn * fadeOut);
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    public record Provider(SpriteSet spriteSet) implements ParticleProvider<SimpleParticleType> {

        @Override
        public Particle createParticle(SimpleParticleType type, ClientLevel client, double x, double y, double z, double dx, double dy, double dz) {
            int dyeValues = 15;

            if (RLServices.PLATFORM.isModLoaded("delicate_dyes")) {
                dyeValues += 10;
            }
            return new FrostedParticle(client, x, y, z, DyeColor.byId(Mth.clamp((int) dx, 0, dyeValues)), this.spriteSet, dy > 0);
        }
    }
}