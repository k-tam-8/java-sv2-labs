package collectionsiterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasShoppingTest {
    @Test
    void testOne() {
        List<ChristmasPresent> presents = new ArrayList<>();
        presents.add(new ChristmasPresent("masodik", "xyz", 2500));
        presents.add(new ChristmasPresent("harmadik", "xytz", 800));
        presents.add(new ChristmasPresent("negyedik", "xhyz", 50));
        ChristmasShopping cs = new ChristmasShopping(presents);

         cs.removeTooExpensivePresent(1000);

         assertEquals(2, cs.getPresentList().size());
    }
}