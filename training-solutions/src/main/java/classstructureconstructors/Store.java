package classstructureconstructors;

public class Store {
    private String product;
    private int stock =0;

    public Store(String product) {
        this.product=product;
    }

    public void store(int stocks) {
        stock+=stocks;
    }

    public void dispatch(int stocks) {
        stock-=stocks;
    }

    public String getProductAndStock() {
        return product + ": " + stock + "db";
    }

}
