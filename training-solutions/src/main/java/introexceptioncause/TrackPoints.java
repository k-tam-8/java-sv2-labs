package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {
    public List<String> readIn() {
        try {
            return Files.readAllLines(Paths.get("tracking.csv"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public void showDifferences(List<String> list) {
        int beginIndex = 0;
        List<Integer> numList = new ArrayList<>();
        for (String s : list) {
            boolean yon = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ';' && yon) {
                    beginIndex = i+1;
                }
                if (s.charAt(i) == ';') {
                    yon = true;
                }
            }
            numList.add(Integer.parseInt(s.substring(beginIndex)));
        }
        for (int i = 1; i < numList.size(); i++) {
            System.out.println(numList.get(i)-numList.get(i-1));
        }
    }
}
