package statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Befektetett összeg: ");
        int osszegBe = scanIn.nextInt();
        System.out.print("Kamatláb: ");
        int kamatLab = scanIn.nextInt();
        Investment investment = new Investment(osszegBe, kamatLab);

        System.out.println("Befektetés összege: ");
        System.out.println(osszegBe);
        System.out.println("Kamatláb: ");
        System.out.println(kamatLab);
/// NINCS KÉSZ, érthetetlen a fealadat


    }
}
