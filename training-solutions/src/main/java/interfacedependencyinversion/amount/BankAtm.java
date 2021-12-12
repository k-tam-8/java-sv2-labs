package interfacedependencyinversion.amount;

public class BankAtm implements Payable {
    @Override
    public int getPayableAmount(int amount) {
        if (amount % 1000 == 0) {
            return amount;
        }
        int minus = amount / 1000;
        minus++;
        return minus * 1000;
    }
}
