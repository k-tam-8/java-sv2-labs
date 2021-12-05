package abstractclass.gamecharacter;

public abstract class Archer extends Character{
    private int numberOfArrows;

    public Archer(Point point) {
        this.numberOfArrows = 100;
        this.position=point;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }
    private int getActualSecondaryDamage(){
        return random.nextInt(3)+1;
    }
    private void shootingAnArrow(Character enemy){
        numberOfArrows--;
        hit(enemy, getActualSecondaryDamage());
    }
    public void secondaryAttack(Character enemy){
        shootingAnArrow(enemy);
    }
}
