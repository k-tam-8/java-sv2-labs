package lambda;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemainderTest {
    @Test
    void name() {
        Remainder remainder = new Remainder();
        List<Integer> numbers = Arrays.asList(45, 13, 64, 51, 92, 33);
        remainder.changeNumbersToRemainders(numbers, 3);
        assertEquals(0, numbers.get(0));
        assertEquals(1, numbers.get(1));
        assertEquals(1, numbers.get(2));
        assertEquals(0, numbers.get(3));
        assertEquals(2, numbers.get(4));
        assertEquals(0, numbers.get(5));
    }
}