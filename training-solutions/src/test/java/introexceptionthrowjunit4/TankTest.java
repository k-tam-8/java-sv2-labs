package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TankTest {

    @Test
    public void goodTest() {
        Tank tank = new Tank();
        int testn = 3;
        tank.modifyAngle(-60);
        assertEquals(20, tank.getAngle());
    }

    @Test(expected = IllegalArgumentException.class)
    public void badTestOne() {
        Tank tank = new Tank();
        tank.modifyAngle(-95);
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void badTestTwo() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Illegal movement!");
        Tank tank = new Tank();
        tank.modifyAngle(-100);
    }

    @Test
    public void badTestThree() {
        Tank tank = new Tank();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(95));
        assertEquals("Illegal movement!", exception.getMessage());
    }
}
