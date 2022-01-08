package exceptionclass.bank;

public class InvalidAccountNumberBankOperationException extends InvalidBankOperationException{
    private String accountNumber;

    public InvalidAccountNumberBankOperationException(String message, String accountNumber) {
        super(message);
        this.accountNumber = accountNumber;
    }
}
