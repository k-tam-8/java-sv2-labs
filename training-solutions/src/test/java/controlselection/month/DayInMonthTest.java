package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class DayInMonthTest {
    @Test
    void testOne(){
        DayInMonth dayInMonth = new DayInMonth();
        assertEquals(31,dayInMonth.daysInMonth(1988,"december"));
    }
}
