package introexceptionthrow;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Validation validation = new Validation();
        Scanner sc = new Scanner(System.in);
        boolean success = true;
        System.out.print("Üdvözöljük a regisztrációs folyamatban!\nKérjük adja meg a nevét: ");
        String name = sc.nextLine();
        try {
            validation.validateName(name);
        } catch (IllegalArgumentException nfe) {
            System.out.println(nfe);
            success = false;
        }
        System.out.print("Kérem adja meg az életkorát: ");
        String ageString = sc.nextLine();
        try {
            validation.validateAge(ageString);
        } catch (IllegalArgumentException nfe) {
            System.out.println(nfe);
            success = false;
        }
        System.out.println("Regisztrált név: " + name);
        System.out.println("Életkora: " + ageString);
        if (success) {
            System.out.println("Regisztráció sikeres!");
        } else {
            System.out.println("Regisztráció sikertelen!");
        }
    }
}
