package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Books {
    public List<String> readIn() {
        List<String> books = new ArrayList<>();
        try {
            books = Files.readAllLines(Paths.get("src/main/java/introexceptionwritefiletestjunit5/books.txt"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return books;
    }

    public List<String> cleanList(List<String> exampleList) {
        for (int f = 0; f < exampleList.size(); f++) {
            int beginInd = 0;
            int beginTwoInd = 0;
            for (int i = 0; i < exampleList.get(f).length(); i++) {
                if (exampleList.get(f).charAt(i) == ';') {
                    if (beginInd == 0) {
                        beginInd = i + 1;
                    } else {
                        beginTwoInd = i + 1;
                    }
                }
            }
            String tmpString = exampleList.get(f).substring(beginTwoInd);
            tmpString += ": " + exampleList.get(f).substring(beginInd, beginTwoInd - 1);
            exampleList.set(f, tmpString);
        }
        return exampleList;
    }

    public void writeFile(List<String> list, Path path) {
        try {
            Files.write(path, list);
        } catch (IOException ioe) {
            throw new IllegalStateException("Error writing file", ioe);
        }
    }
}
