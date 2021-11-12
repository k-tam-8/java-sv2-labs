package introexceptiontrycatch;

import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isGood = false;
        int elsoSzam = 0;
        while (!isGood) {
            System.out.print("Első szám: ");
            try {
                elsoSzam = sc.nextInt();
                isGood = true;
            } catch (InputMismatchException nfe) {
                System.out.println("Nem szám!");
                isGood = false;
            }
            sc.nextLine();
        }
        int masodikSzam = 0;
        isGood = false;
        while (!isGood) {
            System.out.print("Második szám: ");
            try {
                masodikSzam = sc.nextInt();
                isGood = true;
            } catch (InputMismatchException nfe) {
                System.out.println("Nem szám!");
                isGood = false;
            }
            sc.nextLine();
        }
        int muvelet = 0;
        isGood = false;
        while (!isGood) {
            System.out.print("Művelet: 1. összeadás 2. kivonás 3.szorzás 4. osztás ");
            try {
                muvelet = sc.nextInt();
                isGood = true;
            } catch (InputMismatchException nfe) {
                System.out.println("Nem megfelelő!");
                isGood = false;
            }
            sc.nextLine();
            if (muvelet!=1 || muvelet!=2 ||muvelet!=3 ||muvelet!=4){
                isGood=false;
            }
        }
        switch (muvelet) {
            case 1:
                System.out.println(elsoSzam + masodikSzam);
                break;
            case 2:
                System.out.println(elsoSzam - masodikSzam);
                break;
            case 3:
                System.out.println(elsoSzam * masodikSzam);
                break;
            case 4:
                System.out.println(elsoSzam / masodikSzam);
        }
    }
}
