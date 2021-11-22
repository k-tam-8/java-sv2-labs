package immutable;

import java.time.LocalDate;

public class Car {
    private String brand;
    private String type;
    private int yearOfProduct;

    public Car(String brand, String type, int yearOfProduct) {
        if (isBrandValid(brand) && isYearOfProductValid(yearOfProduct)) {
            this.brand = brand;
            this.type = type;
            this.yearOfProduct = yearOfProduct;
        }
    }

    public boolean isBrandValid(String brand) {
        if (brand != null && brand != "") {
            return true;
        } else throw new IllegalArgumentException("Brand name cannot be empty!");
    }

    public boolean isYearOfProductValid(int yearOfProduct) {
        if (yearOfProduct <= LocalDate.now().getYear()) {
            return true;
        } else throw new IllegalArgumentException("Year of production cannot be in the future!");
    }
}
