package algorithmscount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {
    @Test
    void testOne() {
        int i = new Digits().getCountOfNumbers();
        assertEquals(9, i);
    }
}