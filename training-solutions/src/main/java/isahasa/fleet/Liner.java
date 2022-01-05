package isahasa.fleet;

public class Liner implements Ship, CanCarryPassengers{
    private final CanCarryPassengers canCarryPassengers;

    public Liner(int maxPassengers) {
        this.canCarryPassengers=
    }

    @Override
    public int loadPassenger(int passenger) {
        return 0;
    }

    @Override
    public int getPassenger() {
        return 0;
    }
}
