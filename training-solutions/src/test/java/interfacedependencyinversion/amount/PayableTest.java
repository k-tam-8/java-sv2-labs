package interfacedependencyinversion.amount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class PayableTest {

    Payable amount;
    Payable bankAtm;
    Payable cash;

    @BeforeEach
    void init() {
        amount = new Amount();
        bankAtm = new BankAtm();
        cash = new Cash();
    }

    @Test
    void testAmount() {
        assertEquals(5000, amount.getPayableAmount(5000));
    }
    @Test
    void testCash(){
        assertEquals(5000, cash.getPayableAmount(5000));
        assertEquals(5000, cash.getPayableAmount(5001));
        assertEquals(5000, cash.getPayableAmount(5002));
        assertEquals(5005, cash.getPayableAmount(5003));
        assertEquals(5005, cash.getPayableAmount(5004));
        assertEquals(5005, cash.getPayableAmount(5005));
        assertEquals(5005, cash.getPayableAmount(5006));
        assertEquals(5005, cash.getPayableAmount(5007));
        assertEquals(5010, cash.getPayableAmount(5008));
        assertEquals(5010, cash.getPayableAmount(5009));
        assertEquals(5010, cash.getPayableAmount(5010));
    }

    @Test
    void testBantAtm() {
        assertEquals(1000,bankAtm.getPayableAmount(250));
        assertEquals(2000,bankAtm.getPayableAmount(2000));
        assertEquals(3000,bankAtm.getPayableAmount(2001));
        assertEquals(3000,bankAtm.getPayableAmount(2999));
    }
}