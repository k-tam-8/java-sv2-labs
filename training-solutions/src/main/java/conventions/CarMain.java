package conventions;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Ford", "2.0 L", 4, 5);
        System.out.println(car.getCarType());
        System.out.println(car.getEngineType());
        System.out.println(car.getDoors());
        System.out.println(car.getPersons());
        car.setCarType("Fiat");
        car.setEngineType("1.6 L");
        car.setDoors(5);
        car.setPersons(6);
        car.addModelName("Multipla");
        System.out.println(car.getCarType());
        System.out.println(car.getEngineType());
        System.out.println(car.getDoors());
        System.out.println(car.getPersons());

    }
}
