package arrayofarrays;

public class ArrayOfArrays {
    public void printArrayOfArrays(int[][] a) {
        for (int i=0;i<4;i++) {
            System.out.println();
            for (int f = 0; f < 3; f++) {
                System.out.print(a[i][f]+" ");
            }
        }
    }
    public static void main(String[] args) {
        //int[][] nums= new int[5][3];
        int[][] nums = {{0,1,2},{0,1,2},{0,1,2},{0,1,2}};
        ArrayOfArrays arrayOfArrays= new ArrayOfArrays();
        arrayOfArrays.printArrayOfArrays(nums);
    }
}
