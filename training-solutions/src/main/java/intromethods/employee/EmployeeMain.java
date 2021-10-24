package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Bécike", 2022, 52_600);
        System.out.println(employee.getName());
        System.out.println(employee.getHiringYear());
        System.out.println(employee.getSalary());
        employee.setName("Béla");
        employee.raiseSalary(11_900);
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println(employee.toString());
    }
}
