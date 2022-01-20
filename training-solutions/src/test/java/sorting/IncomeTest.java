package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTest {
    @Test
    void name() {
        Income income = new Income();
        assertEquals(12423, income.getHighestIncome());
    }
}