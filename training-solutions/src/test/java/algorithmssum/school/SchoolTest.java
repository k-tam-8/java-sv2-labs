package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    @Test
    void testCount() {
        List<Integer> classes = Arrays.asList(32,23,43,27,53);
        int i= new School().getNumberOfStudents(classes);
        assertEquals(178, i);
    }
}