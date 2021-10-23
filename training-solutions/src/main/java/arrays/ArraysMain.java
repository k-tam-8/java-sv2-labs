package arrays;

import java.util.Arrays;

public class ArraysMain {
    public String numberOfDaysAsString() {
        int[] numberOfDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        return Arrays.toString(numberOfDays);
    }
    public void multiplicationTableAsString(int size) {
        int[][] multiArr = new int[size][size];
        for (int i = 0; i < multiArr.length; i++) {
            for (int f = 0; f < multiArr[i].length; f++) {
                multiArr[i][f] = (i+1) * (f+1);
            }
        }
        System.out.println(Arrays.deepToString(multiArr));
    }
    public void sameTempValues(double[] day, double[] anotherDay) {
        if ( Arrays.equals(day,anotherDay)) System.out.println("egyforma");
        else System.out.println("nem egyforma");
    }
    public void sameEmpValuesDaylight(double[] day, double[] anotherDay) {
        if ( Arrays.equals(day,anotherDay)) System.out.println("egyforma");
        else System.out.println("nem egyforma");
    }
    public int  min(int a, int b) {
        int temp; if (a<b) temp=a; else temp=b;
        return temp;
    }
    public boolean wonLottery(int[] nums1, int[] nums2) {
        int[] tmpArr1 = nums1;
        int[] tmpArr2 = nums2;
        Arrays.sort(tmpArr1);Arrays.sort(tmpArr2);
        //if (Arrays.equals(tmpArr2,tmpArr1)) return true; else return false;
        return Arrays.equals(tmpArr2,tmpArr1);
    }

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();
        System.out.println(arraysMain.numberOfDaysAsString());

        arraysMain.multiplicationTableAsString(5);

        double[] dayArr={22.4,25.2,30.7,13.0,21.6,13.4,23.7,12.1,42.3,12.2,15.2};
        double[] anotherDayArr={22.4,25.2,30.7,13.0,21.6,13.4,23.7,12.1,42.3,12.2};
        arraysMain.sameTempValues(dayArr, anotherDayArr);

        int tempLit = arraysMain.min(dayArr.length, anotherDayArr.length);
        arraysMain.sameEmpValuesDaylight(Arrays.copyOf(dayArr, tempLit),
                Arrays.copyOf(anotherDayArr, tempLit));

        int[] lotNums = {54,23,12,43,4};
        int[] lotNums2= {12,4,43,23,54};
        System.out.println(arraysMain.wonLottery(lotNums,lotNums2));
    }
}
