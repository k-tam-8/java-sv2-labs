package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {
    @Test
    void testGrasshopperHopOnce() {
        Grasshopper gh = new Grasshopper();
        gh.hopOnce(Direction.POSITIVE);
        assertEquals(1,gh.getPosition());
    }

    @Test
    void testGrasshopperMove() {
        Grasshopper gh = new Grasshopper();
        gh.moveFromZeroToThreeWithFiveHops();
        assertEquals(3,gh.getPosition());
    }
}