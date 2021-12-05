package inheritancemethods.cars;

public class Car {
    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        this.fuel = fuel;
    }

    public void drive(int km) {
        if (this.fuel - (fuelRate * km) > 0) {
            fuel -= fuelRate * km;
        }
    }
    public double calculateRefillAmount(){
        return this.tankCapacity - this.fuel;
    }

}
