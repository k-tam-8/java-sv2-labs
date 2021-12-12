package interfacestaticmethods.vehicle;

public interface Vehicle {
    static Vehicle of(int numberOfWheels){
        if (numberOfWheels ==2){
            return new Bicycle(numberOfWheels);
        } else if (numberOfWheels==4){
            return new Car(4);
        } else throw new IllegalArgumentException("Nem megfelelő szám");
    }
}
