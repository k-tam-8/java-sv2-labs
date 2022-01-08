package exceptionresource.hiddenword;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {
    @Test
    void testOne() throws IOException {
        HiddenWord hiddenWord = new HiddenWord();
        String s= hiddenWord.getHiddenWord(Path.of("src/main/resources/hiddenword.txt"));
        assertEquals("ALMA KÖRTE", s);
    }
}