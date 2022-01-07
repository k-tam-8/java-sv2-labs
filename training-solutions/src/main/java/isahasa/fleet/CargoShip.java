package isahasa.fleet;

public class CargoShip implements CanCarryGoods, Ship {
    private final CanCarryGoods canCarryGoods;

    public CargoShip(int cargoWeight) {
        this.canCarryGoods=new CanCarryGoodsBehaviour(cargoWeight);
    }

    @Override
    public int loadCargo(int cargoWeight) {
        return 0;
    }

    @Override
    public int getCargoWeight() {
        return 0;
    }
}
