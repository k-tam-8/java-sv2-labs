package constructoroverloading.advertisement;

import java.util.ArrayList;
import java.util.List;

public class BikeAdvertisement {
    private String note;
    private int price;
    private List<String> extras = new ArrayList<>();
    private String brand;
    private String idNumber;

    public BikeAdvertisement(String note, int price) {
        this.note = note;
        this.price = price;
    }

    public BikeAdvertisement(String note, int price, String brand) {
        this.note = note;
        this.price = price;
        this.brand = brand;
    }

    public BikeAdvertisement(String note, int price, List<String> extras, String brand) {
        this.note = note;
        this.price = price;
        this.extras = extras;
        this.brand = brand;
    }

    public BikeAdvertisement(String note, int price, List<String> extras, String brand, String idNumber) {
        this.note = note;
        this.price = price;
        this.extras = extras;
        this.brand = brand;
        this.idNumber = idNumber;
    }
}
