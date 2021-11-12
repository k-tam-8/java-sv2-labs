package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vásárló neve: ");
        String customerName = sc.nextLine();
        System.out.print("Film címe: ");
        String movieName = sc.nextLine();
        System.out.print("Jegyek száma: ");
        int tickets = sc.nextInt();
        System.out.print("Sorszám: ");
        int place = sc.nextInt();
        System.out.println("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők: ");
        System.out.println("Vásárló neve: " + customerName);
        System.out.println("Film címe: " + movieName);
        System.out.print("Lefoglalt helyek: ");
        for (int i = 1; i <= tickets; i++) {
            System.out.print(place + ". sor " + i + ". szék");
            if (i!= tickets) {
                System.out.print(", ");
            }
        }
    }
}
