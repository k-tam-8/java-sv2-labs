package staticattrmeth;

import java.util.ArrayList;
import java.util.List;

public class Vet {
    private List<Dog> dogList = new ArrayList<>();
    private static long code = 1;

    public List<Dog> getDogList() {
        return dogList;
    }

    public static long getCode() {
        return code;
    }

    public void addDog(Dog dog) {
        code++;
        dog.setCodeNumber(this.code);
        dogList.add(dog);
    }
}
