package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrive neve: " + name + ", kapacitása: " + capacity + ", ára: " + price;
    }

    public void risePrice(int percent) {
        this.price *= (100 - percent) / 100;
    }

    public int comparePricePerCapacity(Pendrive other) {
        if (this.calculatePriceGb() < other.calculatePriceGb()) {
            return -1;
        } else if (this.calculatePriceGb() < other.calculatePriceGb()) {
            return 1;
        } else return 0;
    }

    public double calculatePriceGb() {
        return this.price / this.capacity;
    }

    public boolean isCheaperThan(Pendrive other) {
        return (this.price < other.getPrice());
    }
}
