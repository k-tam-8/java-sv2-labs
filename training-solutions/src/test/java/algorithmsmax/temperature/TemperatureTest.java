package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    @Test
    void testTemp() {
        List<Integer> testTemps = Arrays.asList(25, 12, 30, 26, 24, 8, 11);
        int i = new Temperature().getMin(testTemps);
        assertEquals(8,i);
    }
}