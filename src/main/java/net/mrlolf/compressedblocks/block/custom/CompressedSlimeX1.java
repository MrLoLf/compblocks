package net.mrlolf.compressedblocks.block.custom;

import net.minecraft.block.SlimeBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;

public class CompressedSlimeX1 extends SlimeBlock implements BounceInterface {

    public CompressedSlimeX1(Settings settings) {
        super(settings);
    }

    @Override
    public void bounce(Entity entity) {
        Vec3d vec3d = entity.getVelocity();
        if (vec3d.y < 0.0) {
            double d = entity instanceof LivingEntity ? 1.0 : 0.8;
            entity.setVelocity(vec3d.x, -vec3d.y * d * 1.1, vec3d.z);
        }

    }
}
