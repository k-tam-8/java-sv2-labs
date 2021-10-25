package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Tanuló neve: ");
        String name = scan.nextLine();
        System.out.print("Tanuló születési éve: ");
        String birthYear = scan.nextLine();
        System.out.print("Tanuló születési hónapja: ");
        String birthMonth = scan.nextLine();
        System.out.print("Tanuló születési napja: ");
        String birthDay = scan.nextLine();
        System.out.print("Tanuló irányítószáma: ");
        String zipCode = scan.nextLine();
        System.out.print("Tanuló átlaga: ");
        String median = scan.nextLine();
        Person person = new Person(name,
                LocalDate.of(Integer.parseInt(birthYear),
                        Integer.parseInt(birthMonth), Integer.parseInt(birthDay)),
                Integer.parseInt(zipCode),Double.parseDouble(median));
        Exam exam = new Exam();
        exam.addPerson(person);
        System.out.println(exam.getPersonDataBase());
    }
}
