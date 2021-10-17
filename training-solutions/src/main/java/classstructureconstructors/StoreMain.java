package classstructureconstructors;

import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Az első raktárban tárolt termék neve: ");
        String ProductStock = scanIn.nextLine();
        Store store = new Store(ProductStock);

        System.out.print("A második raktárban tárolt termék neve: ");
        ProductStock = scanIn.nextLine();
        Store store2 = new Store(ProductStock);

        store.store(10);
        store.dispatch(4);
        store2.store(43);
        store2.dispatch(19);

        System.out.println(store.getProductAndStock());
        System.out.println(store2.getProductAndStock());




    }
}
