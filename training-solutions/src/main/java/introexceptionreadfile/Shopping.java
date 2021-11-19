package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Shopping {
    public static void main(String[] args) {
        List<String> shoppinglist = new ArrayList<>();
        try {
            shoppinglist = Files.readAllLines(Paths.get("shoppinglist.txt"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        for (String s : shoppinglist) {
            System.out.println(s);
        }
    }
}
