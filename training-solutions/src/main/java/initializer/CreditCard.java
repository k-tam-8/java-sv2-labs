package initializer;

public class CreditCard {
    private long balance;

    public CreditCard(long balance, Currency currency){
        this.balance=balance;
    }
    public CreditCard(long balance){
        this.balance=balance;

    }

    public long getBalance() {
        return balance;
    }
   /* public boolean payment(long amount, Currency currency){
        this.balance-amount;
        boolean??
    }
    public boolean payment(long amount){

    }*/
}
