package sorting.webshop;

import sorting.Car;
import sorting.CarConstructionComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WebShop {
    private List<Product> productList = new ArrayList<>();

    public List<Product> getProductsOrderedByName() {
        List<Product> orderedList = new ArrayList<>(productList);
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return orderedList;
    }

    public List<Product> getProductsOrderedByPrice() {
        List<Product> orderedList = new ArrayList<>(productList);
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice()-o2.getPrice();
            }
        });
        return orderedList;
    }

    public List<Product> getProductsOrderedByFrom() {
        List<Product> orderedList = new ArrayList<>(productList);
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getFrom().compareTo(o2.getFrom());
            }
        });
        return orderedList;
    }

}
