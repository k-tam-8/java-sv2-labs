package algorithmscount.bankaccount;

public class BankAccount {
    private String nameOfOwner;
    private int accountNumber;
    private double balance;

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(String nameOfOwner, int accountNumber, double balance) {
        this.nameOfOwner = nameOfOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
