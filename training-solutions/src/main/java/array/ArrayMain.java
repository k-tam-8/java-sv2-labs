package array;

import java.sql.Array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] days = {"hétfő", "kedd", "szerda",
                "csütörtök", "péntek", "szombat", "vasárnap"};
        System.out.println(days[2]);
        System.out.println(days.length);
        int[] nums = new int[5];
        int c = 0;
        for (int i = 1; i<17; i=i*2) {
            nums[c] = i;
            c++;
        }
        for (int i: nums) {
            System.out.print(i);
            if (i!=16)
            System.out.print(", ");
        }
        boolean[] arrB = {false, true, false,true,false,true};
        for (int i = 0; i<arrB.length; i++) {
            arrB[i]=true;
        }
    }
}
