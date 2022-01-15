package collectionsmap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CastingTest {
    @Test
    void testOne() {
        Casting casting = new Casting();
        Map<Integer, String> applicants = new LinkedHashMap<>();
        applicants.put(82, "XXX");
        applicants.put(77, "DDDD");
        applicants.put(105, "AAA");
        applicants.put(45, "TTT");
        applicants.put(19, "ZZZ");
        assertEquals("TTT", casting.callNextApplicant(40, applicants));
    }
}