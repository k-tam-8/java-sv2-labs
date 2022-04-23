package AAAOwnProjects;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Piramis magassága: ");
        int PyramidHeight = scanIn.nextInt();

        for (int i = 1; i <= PyramidHeight; i++) {

            for (int k = PyramidHeight - i; k > 0; k--) {
                System.out.print(" ");
            }

            for (int f = 1; f <= i + (i - 1); f++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}

