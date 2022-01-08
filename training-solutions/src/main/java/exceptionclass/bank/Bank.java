package exceptionclass.bank;

import java.util.List;

public class Bank {
    private List<Account> accountList;

    public Bank(List<Account> accountList) {
        if (accountList == null) {
            throw new IllegalArgumentException("Account list is null!");
        }
        this.accountList = accountList;
    }

    public void accountSubtract(String accountNumber, double amount) {
        boolean isValid = false;
        for (Character c :accountNumber.toCharArray()){
            if (!Character.isDigit(c)){
                throw new InvalidAmountBankOperationException("Account number is not valid!", amount);
            }
        }

        for (Account a : accountList) {
            if (a.getAccountNumber().equals(accountNumber)) {
                if (amount <a.getBalance()){
                    throw new LowBalanceBankOperationException("Amount os higher than balance!", amount);
                }
                a.subtract(amount);
                isValid = true;
            }
        }

        if (!isValid) {
            throw new InvalidAccountNumberBankOperationException("Account number not found!", accountNumber);
        }

    }

    public void accountDeposit(String accountNumber, double amount) {
        boolean isValid = false;

        for (Account a : accountList) {
            if (a.getAccountNumber().equals(accountNumber)) {
                a.deposit(amount);
                isValid = true;
            }
        }

        if (!isValid) {
            throw new InvalidAccountNumberBankOperationException("Account number not found!", accountNumber);
        }
    }

}
