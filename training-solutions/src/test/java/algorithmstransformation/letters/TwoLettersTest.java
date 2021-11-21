package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {
    @Test
    void testList() {
        List<String> stringList = Arrays.asList("alma", "körte", "szilva");
        assertEquals("al",new TwoLetters().getFirstTwoLetters(stringList).get(0).toString());
        assertEquals("kö",new TwoLetters().getFirstTwoLetters(stringList).get(1).toString());
    }
}