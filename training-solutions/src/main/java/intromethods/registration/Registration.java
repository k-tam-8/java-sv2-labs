package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
    public String nameTgt(String firstName,String lastName){
        return firstName + " " + lastName;
    }
    public LocalDate birthTgt(int year, int month, int day){
        return LocalDate.of(year,month,day);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Registration registration = new Registration();
        System.out.print("Vezetéknév: ");
        String firstName= scan.nextLine();
        System.out.print("Keresztnév: ");
        String lastName= scan.nextLine();
        System.out.print("Születési év: ");
        int birthOfYear = scan.nextInt();
        System.out.print("Születési hónap: ");
        int birthOfMonth = scan.nextInt();
        System.out.print("Születési nap: ");
        int birthOfDay = scan.nextInt();
        scan.nextLine();
        System.out.print("Email cím: ");
        String emailAddress= scan.nextLine();
        Person person = new Person(registration.nameTgt(firstName,lastName),
                registration.birthTgt(birthOfYear,birthOfMonth,birthOfDay), emailAddress);
        System.out.println(person.toString());
    }
}
