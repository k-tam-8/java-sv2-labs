package virtualmethod.vehicle;

public class Vehicle {
    protected int vehicleWeight;
    static final int PERSON_AVERAGE_WEIGHT = 75;

    public Vehicle(int vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    public int getGrossLoad() {
        return vehicleWeight + PERSON_AVERAGE_WEIGHT;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "vehicleWeight=" + vehicleWeight + "}";
    }
}
