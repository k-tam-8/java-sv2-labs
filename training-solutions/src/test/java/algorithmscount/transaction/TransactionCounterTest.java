package algorithmscount.transaction;

import algorithmscount.transaction.Transaction;
import algorithmscount.transaction.TransactionOperation;
import algorithmscount.transaction.TransactionCounter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionCounterTest {
    @Test
    void testCount() {
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(new Transaction(16516565, TransactionOperation.CREDIT, 15200));
        transactionList.add(new Transaction(4325654, TransactionOperation.DEBIT, 9870));
        transactionList.add(new Transaction(65464, TransactionOperation.CREDIT, 26580));
        transactionList.add(new Transaction(36454, TransactionOperation.DEBIT, 7950));
        int sum = new TransactionCounter().sumAmountOfCreditEntries(transactionList,20000);
        assertEquals(1, sum);
    }
}