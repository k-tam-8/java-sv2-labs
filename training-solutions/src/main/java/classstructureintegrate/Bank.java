package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Bankszámla tulajdonosa: ");
        String BAOwner = scanIn.nextLine();
        System.out.print("Bankszámla száma: ");
        String BANumber = scanIn.nextLine();
        System.out.print("Bankszámla egyenlege: ");
        int BABalance = scanIn.nextInt();

        BankAccount bankAccount = new BankAccount(BANumber, BAOwner, BABalance);
        System.out.print("Befizetés: ");
        bankAccount.deposit(scanIn.nextInt());
        System.out.print("Kivétel: ");
        bankAccount.withdraw(scanIn.nextInt());
        System.out.println(bankAccount.getInfo());

    }
}
