package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        List<String> bdays = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hány ember születésnapját szeretnéd rögzíteni?");
        int number= sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < number; i++) {
            System.out.print("Név: ");
            String addList = sc.nextLine();
            System.out.print("Születési év: ");
            int year= sc.nextInt();
            sc.nextLine();
            System.out.print("Születési hónap: ");
            int month= sc.nextInt();
            sc.nextLine();
            System.out.print("Születési nap: ");
            int day= sc.nextInt();
            sc.nextLine();
            bdays.add(addList + " " + year + " " + month + " " + day);
        }
        try {
            Files.write(Paths.get("birthdays.txt"), bdays);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
