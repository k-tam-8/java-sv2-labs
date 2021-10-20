package array;

public class ArrayHandler {
    public void addIndexToNumber(int[] source) {
        for (int i=0;i<source.length; i++)
        {
            source[i] = i + source[i];
        }
    }
    public void concatenateIndexToWord(String[] source) {
        for (int i=0;i<source.length; i++)
        {
            source[i] = i +" " + source[i];
        }
    }

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();
        int[] Nums = {3,5,6,3,34,8,9,23};
        String[] Strs = {"Sony", "Lg", "Apple", "Meizu", "Nokia", "Honor"};
        arrayHandler.addIndexToNumber(Nums);
        for (int numbs: Nums) {
            System.out.println(numbs);
        }
        for (int i=0;i<Nums.length; i++) {
            System.out.print(Nums[i]);
            if (i< Nums.length-1) System.out.print(", ");
        }
        System.out.println();
        arrayHandler.concatenateIndexToWord(Strs);
        for (String strings: Strs) {
            System.out.println(strings);
        }
        for (int i=0;i<Strs.length; i++) {
            System.out.print(Strs[i]);
            if (i< Strs.length-1) System.out.print(", ");
        }
    }
}
