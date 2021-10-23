package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {
        List<String> favouriteThings=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Mi a kedvenc filmed? ");
        favouriteThings.add(scan.nextLine());
        System.out.print("Ki a kedvenc színészed? ");
        favouriteThings.add(scan.nextLine());
        System.out.print("Mi a kedvenc állatod? ");
        favouriteThings.add(scan.nextLine());
        System.out.println("A lista mérete: " + favouriteThings.size());
        System.out.println("A lista tartalma: " + favouriteThings);

    }
}
