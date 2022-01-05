package virtualmethod.vehicle;

import java.util.ArrayList;
import java.util.List;

public class FerryBoat extends Vehicle {
    private Car car = null;
    static final int MAX_CARRY_WEIGHT = 650;

    public FerryBoat(int vehicleWeight) {
        super(vehicleWeight);
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + car.vehicleWeight;
    }

    public boolean canCarry() {
        return (car.getGrossLoad() < MAX_CARRY_WEIGHT);

    }

    public boolean load(Car car){
        if (canCarry()) {
            this.car=car;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "FerryBoat{" +
                "car=" + car +
                '}';
    }
}
