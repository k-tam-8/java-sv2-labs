package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {
    @Test
    void testHeight() {
        List<Integer> heightList = Arrays.asList(98,125,115,134,108,111);
        int i = new Height().countChildrenWithHeightGreaterThan(heightList,110);
        assertEquals(4, i);
    }
}