package methodparam.sums;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {
    @Test
    void testSum() throws IOException {
        SeparatedSum ss = new SeparatedSum();
        double[] sums = ss.sum(ss.readFileIn());
        assertEquals(110.6, sums[1]);
        assertEquals(-153.29, sums[0],0.01);
    }
}