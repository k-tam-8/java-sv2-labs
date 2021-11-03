package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class DragonTest {
    @Test
    public void testName() {
        Dragon dragon = new Dragon("Süsü", 1, 4.3);
        assertEquals("Süsü", dragon.getName());
        assertNotEquals("Béla", dragon.getName());
    }

    @Test
    public void testNumberOfHeads() {
        Dragon dragon = new Dragon("Süsü", 1, 4.4);
        assertEquals(1, dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads() == 1);
        assertFalse(dragon.getNumberOfHeads() > 8);
    }

    @Test
    public void testHeight() {
        Dragon dragon = new Dragon("Süsü", 1, 4.4);
        assertEquals(4.4, 4.4, 0.005);
    }

    @Test
    public void testNull() {
        Dragon dragon = new Dragon("Süsü", 1, 4.4);
        Dragon dragonTwo = null;
        assertNotNull(dragon);
        assertNull(dragonTwo);
    }

    @Test
    public void testSameObjects() {
        Dragon dragon = new Dragon("Süsü", 1, 4.4);
        Dragon dragonTwo = dragon;
        assertSame(dragon,dragonTwo);
    }
    @Test
    public void testNotSameObjects(){
        Dragon dragon = new Dragon("Süsü", 1, 4.4);
        Dragon dragon2 = new Dragon("Süsü", 1, 4.4);
        //assertSame(dragon,dragon2);
        assertNotSame(dragon,dragon2);
    }
}
