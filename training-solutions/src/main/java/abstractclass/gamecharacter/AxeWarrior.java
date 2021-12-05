package abstractclass.gamecharacter;

public abstract class AxeWarrior extends Character {

    public AxeWarrior(Point point) {
        this.position = point;
    }

    private int getActualSecondaryDamage() {
        int damage = getActualPrimaryDamage();
        damage += random.nextInt(damage);
        return damage;
    }

    public void secondaryAttack(Character enemy) {
        if (position.distance(enemy.position) < 5) {
            hit(enemy, getActualSecondaryDamage());
        }
    }
}
