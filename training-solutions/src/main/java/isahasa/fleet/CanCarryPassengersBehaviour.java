package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers {
    private int passengers;
    final int maxPassengers;

    public CanCarryPassengersBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int loadPassenger(int passenger) {
        return maxPassengers - (this.passengers + passenger);
    }

    @Override
    public int getPassenger() {
        return passengers;
    }
}
