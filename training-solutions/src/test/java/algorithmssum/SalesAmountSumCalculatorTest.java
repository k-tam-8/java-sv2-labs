package algorithmssum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesAmountSumCalculatorTest {
    @Test
    void testSum() {
        List<Salesperson> testList = Arrays.asList(new Salesperson("X", 12500), new Salesperson("Y", 25600));
        int i = new SalesAmountSumCalculator().SalesAmountSumCalculator(testList);
        assertEquals(38100, i);
    }
}