package isahasa.fleet;

public class CargoShip implements CanCarryGoods, Ship {
    final CanCarryGoods canCarryGoods;

    public CargoShip(int cargoWeight) {

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
