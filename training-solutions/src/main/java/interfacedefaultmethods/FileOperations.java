package interfacedefaultmethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public interface FileOperations {
    default List<String> readFromFile(Path path) throws IOException {
        List<String> readInList = Files.readAllLines(path);
        return readInList;
    }

     String getLongWord(List<String> wordMatrix);
}
