package inheritancemethods.employee;

public class Boss extends Employee {
    static final double LEADERSHIP_FACTOR = 10;
    private int numberOfEmployees;

    public Boss(String name, String address, double salary, int numberOfEmployees) {
        super(name, address, salary);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public double getSalary() {
        double salaryCalculate = super.getSalary() + (super.getSalary() * this.numberOfEmployees * LEADERSHIP_FACTOR);
        return salaryCalculate;
    }
}
