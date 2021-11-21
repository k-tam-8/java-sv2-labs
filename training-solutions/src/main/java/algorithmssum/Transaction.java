package algorithmssum;

public class Transaction {
    private int accountNumber;
    private TransactionOperation transactionOperation;
    private int amount;

    public Transaction(int accountNumber, TransactionOperation transactionOperation, int amount) {
        this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public TransactionOperation getTransactionOperation() {
        return transactionOperation;
    }
}
