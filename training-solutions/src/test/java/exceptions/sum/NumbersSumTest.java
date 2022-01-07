package exceptions.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {
    @Test
    void testSum() {
        NumbersSum numbersSum = new NumbersSum();
        int[] intArray = {10,15,20};
        int[] intArrayNull = null;
        int i = numbersSum.getSum(intArray);
        assertEquals(i,45);
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(intArrayNull));
        assertEquals("Null értékű tömb!", iae.getMessage());

    }

    @Test
    void testSumString() {
        NumbersSum numbersSum = new NumbersSum();
        String[] stringArray = {"10","15","20"};
        String[] stringArray2 = {"10","15","2c"};
        String[] stringArrayNull = null;
        int i = numbersSum.getSum(stringArray);
        assertEquals(i,45);
        IllegalArgumentException iae2 = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(stringArrayNull));
        assertEquals("Null értékű tömb!", iae2.getMessage());

        IllegalArgumentException iae3 = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(stringArray2));
        assertEquals("Nem alakítható számmá!", iae3.getMessage());
    }
}