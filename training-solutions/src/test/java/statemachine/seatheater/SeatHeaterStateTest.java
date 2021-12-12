package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatHeaterStateTest {
    @Test
    void testSHS() {
        SeatHeaterState shs = SeatHeaterState.THIRD_STATE;
        shs = shs.next();
        assertEquals(SeatHeaterState.SECOND_STATE.toString(), shs.name());
        shs = shs.next();
        assertEquals(SeatHeaterState.FIRST_STATE.toString(), shs.name());

    }
}