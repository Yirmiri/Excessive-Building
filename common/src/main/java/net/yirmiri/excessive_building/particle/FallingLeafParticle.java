package net.yirmiri.excessive_building.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;

@Environment(EnvType.CLIENT)
public class FallingLeafParticle extends SpriteBillboardParticle {
    private float aFloat;
    private final float aFloat1;
    private final float aFloat2;

    protected FallingLeafParticle(ClientWorld world, double x, double y, double z, SpriteProvider spriteProvider) {
        super(world, x, y, z);
        this.setSprite(spriteProvider.getSprite(this.random.nextInt(12), 12));
        this.aFloat = (float) Math.toRadians(this.random.nextBoolean() ? -30.0 : 30.0);
        this.aFloat1 = this.random.nextFloat();
        this.aFloat2 = (float) Math.toRadians(this.random.nextBoolean() ? -5.0 : 5.0);
        this.maxAge = 300;
        this.gravityStrength = 7.5E-4F;
        float f = this.random.nextBoolean() ? 0.05F : 0.075F;
        this.scale = f;
        this.setBoundingBoxSpacing(f, f);
        this.velocityMultiplier = 1.0F;
    }

    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_OPAQUE;
    }

    public void tick() {
        this.prevPosX = this.x;
        this.prevPosY = this.y;
        this.prevPosZ = this.z;
        if (this.maxAge-- <= 0) {
            this.markDead();
        }

        if (!this.dead) {
            float f = (float) (300 - this.maxAge);
            float g = Math.min(f / 300.0F, 1.0F);
            double d = Math.cos(Math.toRadians((this.aFloat1 * 60.0F))) * 2.0 * Math.pow(g, 1.25);
            double e = Math.sin(Math.toRadians((this.aFloat1 * 60.0F))) * 2.0 * Math.pow(g, 1.25);
            this.velocityX += d * 0.0024999999441206455;
            this.velocityZ += e * 0.0024999999441206455;
            this.velocityY -= this.gravityStrength;
            this.aFloat += this.aFloat2 / 20.0F;
            this.prevAngle = this.angle;
            this.angle += this.aFloat / 20.0F;
            this.move(this.velocityX, this.velocityY, this.velocityZ);
            if (this.onGround || this.maxAge < 299 && (this.velocityX == 0.0 || this.velocityZ == 0.0)) {
                this.markDead();
            }

            if (!this.dead) {
                this.velocityX *= this.velocityMultiplier;
                this.velocityY *= this.velocityMultiplier;
                this.velocityZ *= this.velocityMultiplier;
            }
        }
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider sprites;

        public Factory(SpriteProvider spriteSet) {
            this.sprites = spriteSet;
        }

        public Particle createParticle(DefaultParticleType particleType, ClientWorld level, double x, double y, double z, double dx, double dy, double dz) {
            return new FallingLeafParticle(level, x, y, z, this.sprites);
        }
    }
}
