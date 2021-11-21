package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {
    @Test
    void testWord() {
        List<String> testList = Arrays.asList("alma", "akta" , "körte", "szilva", "marharépa");
        assertTrue(new Words().containsLongerWord(testList,"asztal"));
    }
    @Test
    void testWordTwo() {
        List<String> testList = Arrays.asList("alma", "akta" , "körte", "szilva", "marharépa");
        assertFalse(new Words().containsLongerWord(testList,"numizmatika"));
    }
}