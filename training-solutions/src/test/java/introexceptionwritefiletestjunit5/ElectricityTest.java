package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {
    @TempDir
    File temporaryFolder;

    @Test
    void electricityTest() throws IOException {
        Path path = temporaryFolder.toPath().resolve("electricity.txt");
        List<String> electricityList = new Electricity().makeList();
        new Electricity().writeStreets(electricityList,path);
        List<String> testList = Files.readAllLines(path);
        assertEquals(electricityList,testList);

    }

}