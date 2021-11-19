package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {
    public List<String> readFile() throws IOException {
        return Files.readAllLines(Paths.get("underground.txt"));
    }

    public String getDailySchedule(List<String> l) {
        String s = LocalDate.now().toString();
        s += ",";
        for (String ls : l) {
            if (ls.charAt(0) == '2') {
                s += " ";
                s += ls;
            }
        }
        return s;
    }
}
