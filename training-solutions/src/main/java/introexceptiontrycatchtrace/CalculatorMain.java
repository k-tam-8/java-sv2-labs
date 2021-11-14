package introexceptiontrycatchtrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.print("Calculator v1.0\nKérem az első számot: ");
        int elsoSzam = 0;
        try {
            elsoSzam = sc.nextInt();
        } catch (InputMismatchException nfe) {
            System.out.println("Nem szám! Alapértlemezett érték: 0");
            sc.nextLine();
        }
        System.out.print("Kérem a második számot: ");
        int masodikSzam = 0;
        try {
            masodikSzam = sc.nextInt();
        } catch (InputMismatchException nfe) {
            System.out.println("Nem szám! Alapértlemezett érték: 0");
            sc.nextLine();
        }
        System.out.print("Összeadás: 1\nKivonás: 2\nSzorzás: 3\nOsztás: 4\nVálassz műveletet: ");
        int muvelet = sc.nextInt();
        switch (muvelet) {
            case 1:
                System.out.println(calculator.sum(elsoSzam, masodikSzam));
                break;
            case 2:
                System.out.println(calculator.sub(elsoSzam, masodikSzam));
                break;
            case 3:
                System.out.println(calculator.mul(elsoSzam, masodikSzam));
                break;
            case 4:
                try {
                    System.out.println(calculator.div(elsoSzam, masodikSzam));
                } catch (ArithmeticException nfe) {
                    System.out.println("Nullával való osztás értelmetlen!");
                }
        }
    }
}
