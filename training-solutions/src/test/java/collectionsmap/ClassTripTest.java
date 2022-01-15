package collectionsmap;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class ClassTripTest {
    @Test
    void testOne() {
        ClassTrip ct = new ClassTrip();
        ct.loadInpayments(Path.of("src/main/resources/inpayments.txt"));
        System.out.println(ct.getMoneyIn());
        assertEquals(5000, ct.getMoneyIn().get("Nagy Béla"));
        assertEquals(3,ct.getMoneyIn().size());
    }
}