package streamsalgorithms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private String name;
    private int dateOfBirth;

    public Employee(String name, int dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("AAA", 1950);
        Employee emp2 = new Employee("BBB", 1960);
        Employee emp3 = new Employee("CCC", 1970);
        Employee emp4 = new Employee("DDD", 1980);
        Employee emp5 = new Employee("EEE", 1990);
        List<Employee> employees = new ArrayList<>(Arrays.asList(emp1, emp2, emp3, emp4, emp5));

        System.out.println(employees.stream().mapToInt(Employee::getDateOfBirth).sum());
        System.out.println(employees.stream().mapToInt(e -> LocalDate.now().getYear() - e.getDateOfBirth()).sum());
        System.out.println((long) employees.size());
        System.out.println(employees.stream().filter(employee -> 1990 > employee.getDateOfBirth()).count());
        System.out.println(employees.stream().min(Comparator.comparingInt(Employee::getDateOfBirth)).get().getDateOfBirth());
        System.out.println(employees.stream().min(Comparator.comparingInt(Employee::getDateOfBirth)).get().getName());
        System.out.println(employees.stream().anyMatch(e -> e.getDateOfBirth() > 1980));
        System.out.println(employees.stream().filter(employee -> employee.getDateOfBirth() < 1990).toList());
        System.out.println(employees.stream().map(e -> e.getName()).toList());
        System.out.println(employees.stream().filter(employee -> employee.getDateOfBirth() < 1990).map(Employee::getName).toList());

    }
}
