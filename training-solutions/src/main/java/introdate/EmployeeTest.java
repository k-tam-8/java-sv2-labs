package introdate;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Kérem az alkalmazott nevét: ");
        String name = scanIn.nextLine();
        System.out.print("Kérem az alkalmazott születési évét: ");
        int year = scanIn.nextInt();
        System.out.print("Kérem az alkalmazott születési hónapját: ");
        int month = scanIn.nextInt();
        System.out.print("Kérem az alkalmazott születési napját: ");
        int day = scanIn.nextInt();

        Employee employee=new Employee(year, month, day, name);

        System.out.println(employee.getName() +" "+ employee.getDateOfBirth() +" "+ employee.getBeginEmployment());

    }
}
