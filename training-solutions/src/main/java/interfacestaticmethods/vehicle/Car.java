package interfacestaticmethods.vehicle;

public class Car implements Vehicle{
    private int numberOfWheels;
    private String brand;

    public Car(int numberOfWheels, String brand) {
        this.numberOfWheels = numberOfWheels;
        this.brand = brand;
    }

    public Car(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
