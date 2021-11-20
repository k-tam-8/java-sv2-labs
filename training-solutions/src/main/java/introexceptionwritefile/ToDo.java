package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {
    public static void main(String[] args) {
        List<String> toDoList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String s = "";
        while (!s.toLowerCase().equals("x")) {
            System.out.println("Adj meg egy tennivalót! (Kilépés és mentés: X)");
            s = sc.nextLine();
            if (!s.toLowerCase().equals("x")) {
                toDoList.add(s);
            }
        }
        try {
            Files.write(Paths.get("todos.txt"), toDoList);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
