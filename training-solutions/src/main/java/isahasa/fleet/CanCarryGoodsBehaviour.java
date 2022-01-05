package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods {
    private int cargoWeight;
    final int maxCargoWeight;

    public CanCarryGoodsBehaviour(int cargoWeight) {
        this.maxCargoWeight = cargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        return maxCargoWeight - (this.cargoWeight + cargoWeight);
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }
}
