package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarDealer {
    private List<Car> carList = new ArrayList<>();

    public List<Car> getCarsOrderedByPrice() {
        List<Car> orderedList = new ArrayList<>(carList);
        Collections.sort(carList, new CarPriceComparator());
        return orderedList;
    }

    public List<Car> getCarsOrderedByAge() {
        List<Car> orderedList = new ArrayList<>(carList);
        Collections.sort(carList, new CarConstructionComparator());
        return orderedList;
    }
}
