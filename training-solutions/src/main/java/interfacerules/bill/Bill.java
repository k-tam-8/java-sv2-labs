package interfacerules.bill;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Bill {
    public List<String> readBillItemsFromFile(Path path) throws IOException {
        List<String> readInList = new ArrayList<>();
        readInList= Files.readAllLines(path);
        return readInList;
    }
}
