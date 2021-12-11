package interfaces.animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }

    public int getNumberOfAllLegs() {
        int numberOflegs = 0;
        for (Animal a : animals) {
            numberOflegs += a.getNumberOfLegs();
        }
        return numberOflegs;
    }
}
