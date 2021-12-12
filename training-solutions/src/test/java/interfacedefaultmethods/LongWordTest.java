package interfacedefaultmethods;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {
    @Test
    void testLongWord() throws IOException {
        FileOperations lw = new LongWord();
        List<String> wordMatrix = lw.readFromFile(Path.of("src/main/resources/longword.txt"));
        assertEquals("LONGWORD", lw.getLongWord(wordMatrix));
    }
}