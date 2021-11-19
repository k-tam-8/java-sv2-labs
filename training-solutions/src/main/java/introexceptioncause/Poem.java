package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Poem {
    public static void main(String[] args) {
        List<String> poem = new Poem().readNames();
        for (String s:poem) {
            System.out.print(s.charAt(0));
        }
    }

    public List<String> readNames() {
        try {
            return Files.readAllLines(Paths.get("poem.txt"));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

}
