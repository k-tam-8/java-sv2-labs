package introexceptionreadfile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Holiday {
    public static void main(String[] args) {
        List<String> holiday = new ArrayList<>();
        try {
            holiday = Files.readAllLines(Paths.get("holiday.txt"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        for (String s : holiday) {
            System.out.println(s);
        }
    }
}
