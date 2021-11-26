package methodoverloading;

public enum Number {
    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5);
    private final int numberOfStudent;

    Number(int i) {
        this.numberOfStudent=i;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }
}
