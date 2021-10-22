package arrayofarrays;

import java.util.Scanner;

public class Triangular {
    public int[][] triangularMatrix(int size) {
        int[][] arr = new int[size+1][];
        for (int i = 0; i < size+1; i++) {
            arr[i] = new int[i];
            for (int step=0; step<arr[i].length;step++) arr[i][step]=i-1;
        }
        return arr;
    }

    public static void main(String[] args) {
        //int[][] arr=new int[][];
        Triangular triangular = new Triangular();
        Scanner scanIn = new Scanner(System.in);
        System.out.print("magasság: ");
        int x=scanIn.nextInt();
        int [][] ass= triangular.triangularMatrix(x);
        for (int i=0;i<ass.length;i++) {
            for (int f = 0; f < ass[i].length; f++) {
                System.out.print(ass[i][f]+" ");
            }
            System.out.println();
        }
    }
}
