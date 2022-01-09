package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class WebShop {
    private List<Product> productList = new ArrayList<>();

    public int findHowMany(Product product) {
        int count = 0;
        for (Product p : productList) {
            if (p.equals(product)) {
                count++;
            }
        }
        return count;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public static void main(String[] args) {
        WebShop webShop = new WebShop();
        webShop.addProduct(new Product("vaj", 12345));
        webShop.addProduct(new Product("tej", 54321));
        webShop.addProduct(new Product("kenyér", 12354));
        System.out.println(webShop.findHowMany(new Product("vaj", 12345)));
    }
}
