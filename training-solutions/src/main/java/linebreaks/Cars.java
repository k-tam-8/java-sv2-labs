package linebreaks;

public class Cars {

    public String getBrandAndTypeInSeparateLines(String brand, String type) {
        return brand + "\n" + type;
    }

    public static void main(String[] args) {
        String brand = "Ford";
        String type = "Focus";
        Cars cars = new Cars();

        System.out.print(cars.getBrandAndTypeInSeparateLines(brand, type));
    }
}
