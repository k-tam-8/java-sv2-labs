package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {
    public static void main(String[] args) {
        List<String> places = Arrays.asList("Szentes", "Nagytőke", "Csongrád");
        try {
            Files.write(Paths.get("roadmap.txt"), places);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
