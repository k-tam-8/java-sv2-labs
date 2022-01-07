package exceptions.measurement;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

    public List<String> readFromFile(Path path) {
        List<String> measurementdata;
        try {
            measurementdata = Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalStateException("Cant read file!");
        }
        return measurementdata;
    }

    public List<String> validate(List<String> list) {
        List<String> errorList = new ArrayList<>();
        for (String s : list) {
            boolean isValid = true;
            String[] listToArr = s.split(",");

            if (listToArr.length != 3) {
                isValid = false;
            } else if (!justNumbers(listToArr[0]) || !justNumbers(listToArr[1])) {
                isValid = false;
            } else if (!listToArr[2].trim().contains(" ")) {
                isValid = false;
            }

            if (!isValid) {
                errorList.add(s);
            }
        }
        return errorList;
    }

    private boolean justNumbers(String s) {
        boolean isValid = true;
        for (Character c : s.toCharArray()) {
            if (!Character.isDigit(c) && c!=46) {
                return false;
            }
        }
        return true;
    }
}
