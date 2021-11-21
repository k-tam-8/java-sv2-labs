package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {
    @Test
    void test() {
        List<Integer> testList = Arrays.asList(150,200,500,400,350);
        assertTrue(new Town().containsFewerHabitants(testList,200));
    }
    @Test
    void testTwo() {
        List<Integer> testList = Arrays.asList(800,700,500,600,7000);
        assertTrue(new Town().containsFewerHabitants(testList,800));
    }
}