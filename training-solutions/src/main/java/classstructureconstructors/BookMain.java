package classstructureconstructors;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("A könyv szerzője: ");
        String BookAuthor = scanIn.nextLine();
        System.out.print("A könyv címe: ");
        String BookTitle = scanIn.nextLine();
        Book book = new Book(BookAuthor, BookTitle);
        System.out.print("A könyv regisztrációs száma: ");
        book.register(scanIn.nextLine());
        System.out.println("A " + book.getTitle() + " című könyv " + book.getAuthor() + " szerzőtől a " + book.getRegNumber() + " regsztrációs számon található." );


    }
}
