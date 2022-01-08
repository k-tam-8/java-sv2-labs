package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class HiddenWord {
    public String getHiddenWord(Path path) {
/*        List<String> codes = Files.readAllLines(path);
        StringBuilder sb = new StringBuilder();
        int found = 0;
        for (int i = 0; i < codes.size(); i++) {
            if (found < i) {
                found++;
                sb.append(" ");
            }
            for (Character c : codes.get(i).toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    sb.append(c);
                    found++;
                }
            }

        }
        return sb.toString();*/
        StringBuilder sb = new StringBuilder();
        try (Scanner sc = new Scanner(path)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                boolean found = false;
                for (int i = 0; i < line.length(); i++) {
                    if (Character.isAlphabetic(line.charAt(i))) {
                        sb.append(line.charAt(i));
                        found = true;
                    }
                }
                if (found == false) {
                    sb.append(" ");
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return sb.toString();
    }
}
