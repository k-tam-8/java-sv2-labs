package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class WithoutAccentsTest {
    @Test
    void testOne(){
        WithouAccents withouAccents = new WithouAccents();
        char i='i';
        assertSame(i,withouAccents.accentsCheck('í'));
        i='p';
        assertSame(i,withouAccents.accentsCheck('p'));
    }
}
