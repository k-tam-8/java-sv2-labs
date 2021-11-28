package staticattrmeth;

public class BankTransaction {
    private static final long MIN_TRANSACTION_VALUE = 1;
    private static final long MAX_TRANSACTION_VALUE = 10_000_000;
    private static long countOfTransactions;
    private static long sumOfTransactions;
    private static long currentMinValue;
    private static long currentMaxValue;

    public BankTransaction(long transactionValue) {
        if ((transactionValue < MIN_TRANSACTION_VALUE) && (transactionValue > MAX_TRANSACTION_VALUE)) {
            throw new IllegalArgumentException("Nem megfelelő összeg!");
        }
        countOfTransactions++;
        sumOfTransactions += transactionValue;
        if (currentMinValue > transactionValue) {
            currentMinValue = transactionValue;
        }
        if (currentMaxValue < transactionValue) {
            currentMaxValue = transactionValue;
        }
    }


    public static long getAverageOfTransaction() {
        return sumOfTransactions != 0 ? sumOfTransactions / countOfTransactions : 0;
    }

    public static long getCurrentMinValue() {
        return sumOfTransactions != 0 ? currentMinValue : 0;
    }

    public static long getCurrentMaxValue() {
        return sumOfTransactions != 0 ? currentMaxValue : 0;
    }

    public static long getSumOfTransactions() {
        return sumOfTransactions;
    }


};
