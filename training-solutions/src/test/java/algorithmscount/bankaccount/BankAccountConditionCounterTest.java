package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountConditionCounterTest {
    @Test
    void testCount() {
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(new BankAccount("adsasd", 12354, 20500));
        bankAccounts.add(new BankAccount("erwre", 42344, 18500));
        bankAccounts.add(new BankAccount("rweerw", 423423, 500));
        bankAccounts.add(new BankAccount("rwer", 54355, 14222));
        int i = new BankAccountConditionCounter().countWithBalanceGreaterThan(bankAccounts, 20000);
        assertEquals(1, i);
    }
}