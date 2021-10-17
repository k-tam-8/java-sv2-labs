package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Kérek egy számot: ");
        int number= scanIn.nextInt();
        System.out.println("Hárommal osztható: " + (number % 3 == 0));
    }
}
