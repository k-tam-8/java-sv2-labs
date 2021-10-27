package enumtype.position;

public enum Position {
    TAKAÍRÍTÓ(10_000,"Juttatás1"), CÉGVEZETŐ(45_000, "Juttatás2"), HR(120_000, "Juttatás3");
    private final int salary;
    private final String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
