package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PaulStreetBoys {
    public static void main(String[] args) {
        List<String> palutcaifiuk = new PaulStreetBoys().readNames();
        new PaulStreetBoys().writeOnConsole(palutcaifiuk);
    }

    public void writeOnConsole(List<String> list) {
        for (String s : list) {
            if (s.toLowerCase().contains("nemecsek")) {
                System.out.print(s.toLowerCase() + ", ");
            } else System.out.print(s + ", ");
        }
    }

    public List<String> readNames() {
        try {
            return Files.readAllLines(Paths.get("palutcaifiuk.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
