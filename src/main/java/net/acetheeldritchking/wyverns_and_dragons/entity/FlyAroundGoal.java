package net.acetheeldritchking.wyverns_and_dragons.entity;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.Goal;
import java.util.EnumSet;

public class FlyAroundGoal extends Goal {
    private final Mob dragon;

    public FlyAroundGoal(Mob dragon) {
        this.dragon = dragon;
        this.setFlags(EnumSet.of(Goal.Flag.MOVE));
    }

    @Override
    public boolean canUse() {
        return !this.dragon.getMoveControl().hasWanted() && this.dragon.getRandom().nextInt(7) == 0;
    }

    @Override
    public boolean canContinueToUse() {
        return false;
    }

    @Override
    public void start() {
        int i = this.dragon.getRandom().nextInt(1024);
        int j = this.dragon.getRandom().nextInt(32);
        double d0 = (this.dragon.blockPosition().getX()) + (double)((i - 512) * this.dragon.getRandom().nextInt(16));
        double d1 = (this.dragon.blockPosition().getY()) + (double)(j - 16);
        double d2 = (this.dragon.blockPosition().getZ()) + (double)((i - 512) * this.dragon.getRandom().nextInt(16));
        this.dragon.getMoveControl().setWantedPosition(d0, d1, d2, 1.0D);
    }
}
