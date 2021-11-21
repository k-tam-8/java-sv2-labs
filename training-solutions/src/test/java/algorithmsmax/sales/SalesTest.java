package algorithmsmax.sales;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {
    List<Salesperson> testList = new ArrayList<>();

    @BeforeEach
    void beforeEach() {
        testList.add(new Salesperson("X", 9_000, 5000));
        testList.add(new Salesperson("Y", 20_000, 12_000));
        testList.add(new Salesperson("Z", 30_000, 21_000));
        testList.add(new Salesperson("ZS", 40_000, 35_000));
    }

    @Test
    void testFirstMethod() {
        assertEquals("ZS", new Sales().selectSalesPersonWithMaxSalesAmount(testList).getName());
    }

    @Test
    void testSecondMethod() {
        assertEquals("Z", new Sales().selectSalesPersonWithFurthestAboveTarget(testList).getName());
    }

    @Test
    void testThirdMethod() {
        assertEquals("X", new Sales().selectSalesPersonWithFurthestBelowTarget(testList).getName());
    }
}