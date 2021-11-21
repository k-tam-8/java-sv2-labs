package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {
    @Test
    void testList() {
        List<String> list = Arrays.asList("John Doe", "Jack Doe", "Jim Smith");
        List<String> listAssert = new Prefix().getWordsStartWith(list, "Doe");
        assertEquals(2,listAssert.size());
        assertEquals("John Doe", listAssert.get(0).toString());
        assertNotEquals("Jim Smith",listAssert.get(0).toString());
        assertNotEquals("Jim Smith",listAssert.get(1).toString());
    }
}