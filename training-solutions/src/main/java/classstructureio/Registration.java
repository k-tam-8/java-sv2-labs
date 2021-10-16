package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.println("Regisztráció");
        System.out.print("Kérem a felhasználónevet: ");
        Scanner bekeres = new Scanner(System.in);
        String felhNev = bekeres.nextLine();
        System.out.print("Kérem a jelszót: ");
        String passW = bekeres.nextLine();
        System.out.println("A regisztrációs adatok:");
        System.out.println("Felhasználó név: "+ felhNev);
        System.out.println("Jelszó: " + passW);
    }
}
