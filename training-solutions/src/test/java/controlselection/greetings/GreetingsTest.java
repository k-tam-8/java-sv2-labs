package controlselection.greetings;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class GreetingsTest {
    @Test
    void testOne() {
        Greetings greetings = new Greetings();
        assertEquals("Jó napot", greetings.greets(15, 7));
        assertEquals("Jó reggelt", greetings.greets(8, 7));
        assertEquals("Jó éjt", greetings.greets(2, 7));
    }
}
