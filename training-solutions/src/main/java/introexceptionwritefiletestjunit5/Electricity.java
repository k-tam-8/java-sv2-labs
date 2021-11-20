package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {
    public List<String> makeList(){
        List<String> electricityList = new ArrayList<>();
        electricityList.add(LocalDate.now().toString());
        electricityList.add("Béla utca");
        electricityList.add("József utca");
        electricityList.add("György utca");
        return electricityList;
    }

    public void  writeStreets(List<String> electricityList, Path path) {
        try {
            Files.write(path, electricityList);
        } catch (IOException ioe) {
            throw new IllegalStateException("Error writing file", ioe);
        }
    }
}
