package AAAOwnProjects;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class googleAlgorTest {

    @Test
    void testPairs() {
        googleAlgor ga = new googleAlgor();
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8);
        assertEquals(3, ga.findPairs(numbers, 9));
    }
}