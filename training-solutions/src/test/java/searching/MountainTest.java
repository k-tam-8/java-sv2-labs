package searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainTest {
    @Test
    void name() {
        Peak peak = new Peak("csúcs", 989);
        Peak peak2 = new Peak("csúcs", 987);
        assertEquals(true, new Mountain().searchPeak(peak));
        assertEquals(false, new Mountain().searchPeak(peak2));
    }
}