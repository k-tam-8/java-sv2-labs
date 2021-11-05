package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class DayOfWeekTest {
    @Test
    void testOne() {
        DayOfWeeks dayOfWeeks = new DayOfWeeks();
        assertEquals("hét vége", dayOfWeeks.getDay("szombat"));
    }
}
