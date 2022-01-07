package isahasa.fleet;

public class FerryBoat implements CanCarryGoods, CanCarryPassengers, Ship {
    private final CanCarryGoods canCarryGoods;
    private final CanCarryPassengers canCarryPassengers;

    public FerryBoat(int maxCargoWeight, int maxPassengers) {
        this.canCarryGoods = new CanCarryGoodsBehaviour(maxCargoWeight);
        this.canCarryPassengers = new CanCarryPassengersBehaviour(maxPassengers);
    }

    @Override
    public int loadCargo(int cargoWeight) {
        return canCarryGoods.loadCargo(cargoWeight);
    }

    @Override
    public int getCargoWeight() {
        return canCarryGoods.getCargoWeight();
    }

    @Override
    public int loadPassenger(int passenger) {
        return canCarryPassengers.loadPassenger(passenger);
    }

    @Override
    public int getPassenger() {
        return canCarryPassengers.getPassenger();
    }
}
