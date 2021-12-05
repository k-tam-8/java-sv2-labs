package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {
    Point position;
    private int hitPoint = 100;
    Random random;

    public boolean isAlive() {
        return this.hitPoint > 0;
    }

    protected int getActualPrimaryDamage() {
        return random.nextInt(8) + 2;
    }

    private int getActualDefence() {
        return random.nextInt(4) + 1;
    }

    protected void hit(Character enemy, int damage) {
        int actualDefence = getActualDefence();
        if (actualDefence < damage) {
            decreaseHitPoint(damage);
        }
    }

    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());
    }

    private void decreaseHitPoint(int diff) {
        hitPoint -= diff;
    }

    abstract public void secondaryAttack(Character enemy);

}
