package arrayofarrays;

import java.util.Scanner;

public class Rectangle {
    public int[][] rectangularMatrix(int size) {
        int[][] rectArr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int f = 0; f < size; f++)
                rectArr[f][i] = f;
        }
        return rectArr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("oldalak: ");
        int sides = scan.nextInt();
        Rectangle rectangle = new Rectangle();
        int[][] rectArr= rectangle.rectangularMatrix(sides);
        for (int i = 0; i < rectArr.length; i++) {
            for (int f = 0; f < rectArr[i].length; f++) {
                System.out.print(rectArr[i][f]);
            }
            System.out.println();
        }
    }
}