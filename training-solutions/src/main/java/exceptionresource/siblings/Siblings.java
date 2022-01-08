package exceptionresource.siblings;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Siblings {

    public List<String> getFullNames(String lastName, Path path){
        List<String> fullNameList = new ArrayList<>();
        try (Scanner sc = new Scanner(path)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                fullNameList.add(lastName + " " + line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return fullNameList;
    }
}
