package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        for (int i = 1; i<6; i++) {
            System.out.print("Összeadandó szám: ");
            num += sc.nextInt();
        }
        System.out.println(num);

    }
}
