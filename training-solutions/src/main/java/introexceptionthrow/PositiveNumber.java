package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérek egy pozitív egész számot: ");
        int number = sc.nextInt();
        if (number < 0) {
            throw new IllegalArgumentException("A szám nem egész pozitív!");
        }
    }
}
