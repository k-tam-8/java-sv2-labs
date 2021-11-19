package introexceptionreadfiletestjunit5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<String> ingredients = new ArrayList<>();

    public List<String> getIngredients() {
        return ingredients;
    }

    public void addIngredients(Path path) {
        List<String> wordList = readIn(path);
        for (String s : wordList) {
            boolean isWhitespace = false;
            int beginIndex = 0;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isWhitespace(s.charAt(i)) && isWhitespace) {
                    beginIndex = i;
                }
                if (Character.isWhitespace(s.charAt(i))) {
                    isWhitespace = true;
                }
            }
            if (beginIndex != 0) {
                ingredients.add(s.substring(beginIndex + 1));
            }
        }
    }

    public List<String> readIn(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
