package numbers;

import java.util.Scanner;

public class Percent {
    public double getValue(int num, int percent) {
        return (double) num / 100 * percent;
    }

    public double getBase(int num, int perc) {
        return (num / (double) perc) * 100;
    }

    public double getPercent(int num, int num2) {
        return (double) num2 / (num / 100);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Első szám: ");
        int numberOne = scan.nextInt();
        System.out.print("Második szám: ");
        int numberTwo = scan.nextInt();
        Percent percent = new Percent();
        System.out.println(numberOne + "-nak/nek a " + numberTwo +
                " százaléka: " + percent.getValue(numberOne, numberTwo));
        System.out.println(numberTwo + " százaléka " + numberOne +
                " a következő számnak: " + percent.getBase(numberOne, numberTwo));
        System.out.println(numberOne + " nak/nek a(z) " + numberTwo +
                " a(z) " + percent.getPercent(numberOne, numberTwo) + " százaléka.");
    }
}
