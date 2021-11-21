package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {
    public int sumAmountOfCreditEntries(List<Transaction> transactions, int limit) {
        int sum = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getTransactionOperation().equals(TransactionOperation.CREDIT) && transaction.getAmount() < limit) {
                sum++;
            }
        }
            return sum;
    }
}

