package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LabelTest {
    @Test
    void testOne() {
        Labels labels = new Labels();
        assertEquals(4, labels.getTableOfNumbers(10)[1][1]);
        assertEquals(10, labels.getTableOfNumbers(10)[4][4]);
    }
}
