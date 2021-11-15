package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {


    @Test
    public void goodTest() {
        Student student = new Student();
        int testn = 3;
        student.addNote(testn);
        assertEquals("3", student.getNotes().get(0).toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void badTestOne() {
        Student student = new Student();
        int testn = 6;
        student.addNote(testn);
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void badTestTwo() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Note must be between 1 and 5!");
        Student student = new Student();
        student.addNote(6);
    }

    @Test
    public void badTestThree() {
        Student student = new Student();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> student.addNote(6));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }
}
