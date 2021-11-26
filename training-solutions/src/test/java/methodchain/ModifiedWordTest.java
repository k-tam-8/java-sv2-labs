package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedWordTest {
    @Test
    void testWord() {
        ModifiedWord mw = new ModifiedWord();
        String modifiedWord = mw.modify("alma");
        assertEquals("AxMy",modifiedWord);
    }
}