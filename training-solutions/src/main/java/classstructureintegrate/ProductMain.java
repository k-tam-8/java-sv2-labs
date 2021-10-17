package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Product name: ");
        String ProductName= scanIn.nextLine();
        System.out.print("Product price: ");
        int ProductPrice = scanIn.nextInt();
        Product product = new Product(ProductName, ProductPrice);
        System.out.print("Ár növelése ennyivel: ");
        product.increasePrice(scanIn.nextInt());
        System.out.println("A(z) " +product.getName()+ " ára növeleve, jelenleg: " + product.getPrice());
        System.out.print("Ár csökkentése ennyivel: ");
        product.decreasePrice(scanIn.nextInt());
        System.out.println("A(z) " +product.getName()+ " ára csökkentve, jelenleg: " + product.getPrice());
    }
}
