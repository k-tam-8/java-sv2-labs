package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("pozitív egész szám: ");
        int i = sc.nextInt();
        for (int f = i; f < 20; f++) {
            if ((f % 7 != 0) && (Integer.toString(f).charAt(Integer.toString(f).length() - 1) == '7')) {
                break;
            }
            if (f % 7 == 0) {
                System.out.println("X");
            } else {
                System.out.println(f);
            }
        }
    }
}
