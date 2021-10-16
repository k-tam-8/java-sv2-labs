package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner bekeres = new Scanner(System.in);
        System.out.println("Ügyfél nyilvántartás");

        System.out.print("Kliens neve: ");
        client.name = bekeres.nextLine();

        System.out.print("Kliens születési éve: ");
        client.year = bekeres.nextInt();
        bekeres.nextLine(); //sorvége jel beolvasása, ahogy a tananyagban is volt

        System.out.print("Kliens címe: ");
        client.address = bekeres.nextLine();

        System.out.println("Ügyfél adatai:");
        System.out.println("neve: " + client.name);
        System.out.println("születési éve: " + client.year);
        System.out.println("címe: " + client.address);


    }
}
