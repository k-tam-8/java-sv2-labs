package exceptionclass.bank;

public class LowBalanceBankOperationException extends InvalidBankOperationException{
    private double amount;

    public LowBalanceBankOperationException(String message, double amount) {
        super(message);
        this.amount = amount;
    }
}
