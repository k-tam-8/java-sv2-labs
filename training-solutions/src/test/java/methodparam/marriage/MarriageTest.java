package methodparam.marriage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {
    @Test
    void testMarriage() {
        Man man = new Man("Béla");
        Woman woman = new Woman("Juci");
        Marriage marriage = new Marriage();
        marriage.getMarried(woman, man);
        assertEquals("Cenzné", woman.getName());
    }
}