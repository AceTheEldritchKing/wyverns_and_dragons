package net.acetheeldritchking.wyverns_and_dragons.entity.goals;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.Goal;
import java.util.EnumSet;

public class FlyAroundGoal extends Goal {
    private final Mob dragon;
    private boolean isFlying;
    private float flySpeed;
    private int maxFlyHeight;

    public FlyAroundGoal(Mob dragon) {
        this.dragon = dragon;
        this.isFlying = false;
        this.flySpeed = 0.5f;
        this.maxFlyHeight = 128;
        this.setFlags(EnumSet.of(Goal.Flag.MOVE));
    }

    @Override
    public boolean canUse() {
        return !this.dragon.getMoveControl().hasWanted() && this.dragon.getRandom().nextInt(7) == 0 && !this.isFlying;
    }

    @Override
    public boolean canContinueToUse() {
        return this.isFlying;
    }

    @Override
    public void start() {
        int i = this.dragon.getRandom().nextInt(1024);
        int j = this.dragon.getRandom().nextInt(32);
        double d0 = (this.dragon.blockPosition().getX()) + (double)((i - 512) * this.dragon.getRandom().nextInt(16));
        double d1 = (this.dragon.blockPosition().getY()) + (double)(j - 16);
        double d2 = (this.dragon.blockPosition().getZ()) + (double)((i - 512) * this.dragon.getRandom().nextInt(16));
        this.dragon.getMoveControl().setWantedPosition(d0, d1, d2, this.flySpeed);
        this.isFlying = true;
    }

    @Override
    public void stop() {
        this.isFlying = false;
    }
}
