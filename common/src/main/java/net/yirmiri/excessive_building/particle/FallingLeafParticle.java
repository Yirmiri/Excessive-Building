package net.yirmiri.excessive_building.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;

public class FallingLeafParticle extends TextureSheetParticle {
    private float aFloat;
    private final float aFloat1;
    private final float aFloat2;

    protected FallingLeafParticle(ClientLevel world, double x, double y, double z, SpriteSet spriteProvider) {
        super(world, x, y, z);
        this.setSprite(spriteProvider.get(this.random.nextInt(12), 12));
        this.aFloat = (float) Math.toRadians(this.random.nextBoolean() ? -30.0 : 30.0);
        this.aFloat1 = this.random.nextFloat();
        this.aFloat2 = (float) Math.toRadians(this.random.nextBoolean() ? -5.0 : 5.0);
        this.lifetime = 300;
        this.gravity = 7.5E-4F;
        float f = this.random.nextBoolean() ? 0.05F : 0.075F;
        this.quadSize = f;
        this.setSize(f, f);
        this.friction = 1.0F;
    }

    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    public void tick() {
        this.xo = this.x;
        this.yo = this.y;
        this.zo = this.z;
        if (this.lifetime-- <= 0) {
            this.remove();
        }

        if (!this.removed) {
            float f = (float) (300 - this.lifetime);
            float g = Math.min(f / 300.0F, 1.0F);
            double d = Math.cos(Math.toRadians((this.aFloat1 * 60.0F))) * 2.0 * Math.pow(g, 1.25);
            double e = Math.sin(Math.toRadians((this.aFloat1 * 60.0F))) * 2.0 * Math.pow(g, 1.25);
            this.xd += d * 0.0024999999441206455;
            this.zd += e * 0.0024999999441206455;
            this.yd -= this.gravity;
            this.aFloat += this.aFloat2 / 20.0F;
            this.oRoll = this.roll;
            this.roll += this.aFloat / 20.0F;
            this.move(this.xd, this.yd, this.zd);
            if (this.onGround || this.lifetime < 299 && (this.xd == 0.0 || this.zd == 0.0)) {
                this.remove();
            }

            if (!this.removed) {
                this.xd *= this.friction;
                this.yd *= this.friction;
                this.zd *= this.friction;
            }
        }
    }

    public static class Factory implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprites;

        public Factory(SpriteSet spriteSet) {
            this.sprites = spriteSet;
        }

        public Particle createParticle(SimpleParticleType particleType, ClientLevel level, double x, double y, double z, double dx, double dy, double dz) {
            return new FallingLeafParticle(level, x, y, z, this.sprites);
        }
    }
}
