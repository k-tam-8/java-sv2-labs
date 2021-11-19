package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Words {
    public List<String> readIn(Path path){
        List<String> wordList = new ArrayList<>();
        try {
            wordList = Files.readAllLines(path);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return wordList;
    }
    public String getFirstWordWithA(Path path) {
        List<String> wordList = readIn(path);
        for (String s : wordList) {
            if (s.toLowerCase().charAt(0) == 'a') {
                return s;
            }
        }
        return "A";
    }
}
