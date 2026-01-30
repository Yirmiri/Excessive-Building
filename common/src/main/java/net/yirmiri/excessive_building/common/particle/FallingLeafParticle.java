package net.yirmiri.excessive_building.common.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.core.particles.SimpleParticleType;

import static java.lang.Math.cos;
import static java.lang.Math.min;
import static java.lang.Math.sin;

public class FallingLeafParticle extends TextureSheetParticle {
    private float rotSpeed;
    private final float particleRandom;
    private final float spinAcceleration;

    protected FallingLeafParticle(ClientLevel level, double x, double y, double z, SpriteSet spriteSet) {
        super(level, x, y, z);
        this.setSprite(spriteSet.get(this.random.nextInt(12), 12));
        this.rotSpeed = (float) Math.toRadians(this.random.nextBoolean() ? -30.0 : 30.0);
        this.particleRandom = this.random.nextFloat();
        this.spinAcceleration = (float) Math.toRadians(this.random.nextBoolean() ? -5.0 : 5.0);
        this.lifetime = 300;
        this.gravity = 7.5E-4F;
        float f = this.random.nextBoolean() ? 0.075F : 0.095F;
        this.quadSize = f;
        this.setSize(f, f);
        this.friction = 1.0F;
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    @Override
    public void tick() {
        this.xo = this.x;
        this.yo = this.y;
        this.zo = this.z;

        if (this.lifetime-- <= 0) {
            this.remove();
        }

        if (!this.removed) {
            float f = (300 - this.lifetime);
            float f1 = (float) min((double) f / 300.0D, 1.0D);

            double d0 = cos(Math.toRadians(this.particleRandom * 60.0F)) * 2.0D * Math.pow(f1, 1.25D);
            double d1 = sin(Math.toRadians(this.particleRandom * 60.0F)) * 2.0D * Math.pow(f1, 1.25D);

            this.xd += d0 * 0.0024999999441206455D;
            this.zd += d1 * 0.0024999999441206455D;
            this.yd -= this.gravity;

            this.rotSpeed += this.spinAcceleration / 20.0F;
            this.oRoll = this.roll;
            this.roll += this.rotSpeed / 20.0F;

            this.move(this.xd, this.yd, this.zd);

            if (this.onGround || this.lifetime < 299 && (this.xd == 0.0D || this.zd == 0.0D)) {
                this.remove();
            }

            if (!this.removed) {
                this.xd *= this.friction;
                this.yd *= this.friction;
                this.zd *= this.friction;
            }
        }
    }

    public static final class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public Provider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }

        @Override
        public Particle createParticle(SimpleParticleType type, ClientLevel level, double px, double py, double pz, double xSpeed, double ySpeed, double zSpeed) {
            return new FallingLeafParticle(level, px, py, pz, this.spriteSet);
        }
    }
}
