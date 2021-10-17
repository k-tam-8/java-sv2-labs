package statements;

public class Investment {
    private double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active;



    public Investment(int fund, int interestRate) {
        this.fund=fund;
        this.interestRate=interestRate;
        active=true;
    }

    public int getFund() {
        return fund;
    }
    public double getYield(int days) {
        return 1;
    }
    public double close(int days) {
        active=false;
        return 1;
    }
    /// NINCS KÉSZ, érthetetlen a fealadat
}
