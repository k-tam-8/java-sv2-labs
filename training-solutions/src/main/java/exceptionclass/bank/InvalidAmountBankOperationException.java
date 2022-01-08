package exceptionclass.bank;

public class InvalidAmountBankOperationException extends InvalidBankOperationException{
    private double amount;

    public InvalidAmountBankOperationException(String message, double amount) {
        super(message);
        this.amount = amount;
    }
}
