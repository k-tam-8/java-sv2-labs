package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {
    @Test
    void testArrayList() {
        String s = new Words().getFirstWordWithA(Path.of("words.txt"));
        assertEquals("alma", s);
        assertNotEquals("körte", s);
    }
    @Test
    void testArrayListTwo() {
        String s = new Words().getFirstWordWithA(Path.of("wordsWithoutA.txt"));
        assertEquals("A", s);
        assertNotEquals("körte", s);
    }
}