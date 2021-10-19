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

        System.out.println("Tőke: " + investment.getFund());
        System.out.println("Hozam 50 napra: " + investment.getYield(50));
        System.out.println("Kivett összeg 80 nap után: " + investment.close(80));
        System.out.println("Kivett összeg 90 nap után: " + investment.close(90));


    }
}
