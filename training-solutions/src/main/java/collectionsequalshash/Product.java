package collectionsequalshash;

import java.util.Objects;

public class Product {
    private String name;
    private int registrationNumber;

    public Product(String name, int registrationNumber) {
        this.name = name;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return registrationNumber == product.registrationNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber);
    }
}
