package training;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String message = "Hello World!";
        System.out.println(message);

        System.out.println("Mi a neved?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Születési éved?");
        int yearOfBirth = scanner.nextInt();
        System.out.println(yearOfBirth + "-ban/ben születtél!");
        System.out.println(2021-yearOfBirth + " éves vagy.");
    }
}
