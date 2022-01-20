package sorting;

public class Car {
    private String brand;
    private int dateOfProduct;
    private int price;

    public Car(String brand, int dateOfProduct, int price) {
        this.brand = brand;
        this.dateOfProduct = dateOfProduct;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getDateOfProduct() {
        return dateOfProduct;
    }

    public int getPrice() {
        return price;
    }
}
