package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Neptun {
    public static void main(String[] args) {
        try {
            List<String> names = new Neptun().readNames();
            for (int i = 0; i < names.size(); i++) {
                int beginindex = 0;
                for (int f = 0; f < names.get(i).length(); f++) {
                    if (names.get(i).charAt(f) == ',') {
                        beginindex = f + 1;
                    }
                }
                names.set(i, names.get(i).substring(beginindex).toString());
            }
            System.out.println(names);
        } catch (IOException ioe) {
            System.out.println("Nem megfelelő forrás!");
            ioe.printStackTrace();
        }
    }

    public List<String> readNames() throws IOException {
        return Files.readAllLines(Paths.get("neptun.csv"));
    }
}
