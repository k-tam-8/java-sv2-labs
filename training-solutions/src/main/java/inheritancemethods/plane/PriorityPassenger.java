package inheritancemethods.plane;

public class PriorityPassenger extends Passenger{
    private final int percent;

    public PriorityPassenger(String name, int priceOfPlaneTicket, int percent) {
        super(name, priceOfPlaneTicket);
        this.percent = percent;
    }

    @Override
    public int getPriceOfPlaneTicket() {
        int plus = super.getPriceOfPlaneTicket()*this.percent/100;
        return super.getPriceOfPlaneTicket() + plus;
    }
}
