package stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Scanner sc2 = new Scanner(s);
        while (sc2.hasNext()){
            System.out.println(sc2.next());
        }
        s=sc.nextLine();
        Scanner sc3 = new Scanner(s).useDelimiter(",");
        while (sc3.hasNext()){
            System.out.println(sc3.next());
        }
    }
}