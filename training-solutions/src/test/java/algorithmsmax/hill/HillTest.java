package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {
    @Test
    void testMax() {
        List<Integer> list = Arrays.asList(125,324,155,169,98,284);
        int i = new Hill().getMax(list);
        assertEquals(324,i);
    }
}