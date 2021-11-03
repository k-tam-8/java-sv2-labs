package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class NumbersTest {
    @Test
    public void testGetEvenNumbers() {
        Numbers numbers = new Numbers();
        int[] numberArray = {2, 8, 5, 6, 2, 3, 9};
        int[] numberArrayExcept = {2, 8, 0, 6, 2, 0, 0};
        assertArrayEquals(numberArrayExcept,numbers.getEvenNumber(numberArray));
    }
}
