package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void testSquare() {
        Square  square = new TableCloth(5);
        assertEquals(7.07, square.getLengthOfDiagonal(),0.01);
        assertEquals(20, square.getPerimeter());
        assertEquals(25,square.getArea());
    }
}