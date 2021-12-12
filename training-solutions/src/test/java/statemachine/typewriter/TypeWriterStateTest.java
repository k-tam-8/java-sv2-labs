package statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {
    @Test
    void testTW() {
        TypeWriterState tws = TypeWriterState.LOWERCASE;
        tws=tws.changeCaps();
        assertEquals(TypeWriterState.UPPERCASE.name(), tws.name());
    }
}