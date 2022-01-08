package exceptionresource.siblings;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {
    @Test
    void testOne() {
        Siblings siblings = new Siblings();
        List<String> list = siblings.getFullNames("Szabó", Path.of("src/main/resources/siblings.txt"));
        assertEquals("Szabó Emese", list.get(0));
        assertEquals("Szabó Ferenc", list.get(1));
    }
}