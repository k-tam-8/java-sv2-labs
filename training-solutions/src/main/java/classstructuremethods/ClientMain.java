package classstructuremethods;

import java.util.Scanner;

public class ClientMain
{
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kliens adatok");

        System.out.print("Kliens neve: ");
        client.ChangeClientName(scanner.nextLine());

        System.out.print("Kliens születési éve: ");
        client.ChangeClientYear(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Kliens címe: ");
        client.ChangeClientAddress(scanner.nextLine());

        System.out.println(client.getAllData());

        System.out.println("Új cím megadása: ");
        client.migrate(scanner.nextLine());
        System.out.print("Sikeres változtatás! ");
        System.out.println(client.getAddress());


    }
}
