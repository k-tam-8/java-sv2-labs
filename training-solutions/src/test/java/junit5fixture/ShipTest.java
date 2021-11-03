package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ShipTest {
    Ship ship;

    @BeforeEach
    void init() {
        ship = new Ship("Titanic", 1904, 50.6);
    }

    @Test
    public void testName() {
        assertEquals("Titanic", ship.getName());
        assertNotEquals("Britannic", ship.getName());
    }

    @Test
    public void testYearOfConstruction() {
        assertEquals(ship.getYearOfConstruction(), 1904);
        assertTrue(ship.getYearOfConstruction() == 1904);
        assertFalse(ship.getYearOfConstruction() == 1945);
    }

    @Test
    public void testLength() {
        assertEquals(50.6, 50.6, 0.001);
    }

    @Test
    public void testNull() {
        Ship shipTwo = null;
        assertNull(shipTwo);
        assertNotNull(ship);
    }

    @Test
    public void testSameObjects() {
        Ship shipTwo = ship;
        assertSame(ship, shipTwo);
    }

    @Test
    public void testNotSameObjects() {
        Ship shipTwo = new Ship("Titanic", 1904, 50.6);
        assertNotSame(ship, shipTwo);
    }

}
