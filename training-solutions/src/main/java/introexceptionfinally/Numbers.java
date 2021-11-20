package introexceptionfinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberIn = 1;
        while (numberIn % 2 == 1) {
            System.out.print("Adj meg egy számot: ");
            try {
                numberIn = sc.nextInt();
               // sc.nextLine();
            } catch (InputMismatchException nfe) {
                throw new IllegalArgumentException("Ez nem egy szám HEEE!!", nfe);
            } finally {
                System.out.println("End of round.");
            }
        }
    }
}
