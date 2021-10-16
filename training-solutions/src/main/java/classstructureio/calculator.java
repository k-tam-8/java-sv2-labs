package classstructureio;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner bekeres = new Scanner(System.in);

        System.out.print("Kérem az első számot: ");
        int elsoSzam = bekeres.nextInt();
        System.out.print("Kérem a második számot: ");
        int masodikSzam = bekeres.nextInt();
        System.out.println("A művelet: " + elsoSzam + "+" +masodikSzam);
        System.out.println("Az eredmény: " +  (elsoSzam + masodikSzam));
    }
}
