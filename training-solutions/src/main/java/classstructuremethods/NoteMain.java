package classstructuremethods;

import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        Note note = new Note();
        System.out.print("Jegyzet szerzője: ");
        note.setName(scanIn.nextLine());
        System.out.print("Jegyzet témája: ");
        note.setTopic(scanIn.nextLine());
        System.out.print("Jegyzet szövege: ");
        note.setText(scanIn.nextLine());
        System.out.println(note.getNoteText());



    }
}
