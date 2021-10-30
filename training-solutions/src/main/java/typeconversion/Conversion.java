package typeconversion;

import arrayofarrays.ArrayOfArrays;

import java.sql.Array;

public class Conversion {
    public double convertDoubleToDouble(double szam){
        return (double)((int)szam);
    }
    public byte[] convertIntArrayToByteArray(int nums[]){
        byte[] modifiedArray = new byte[nums.length];
        for (int i=0;i<nums.length;i++){
            if (nums[i]<0 || nums[i]>128) {
                nums[i]=-1;
                modifiedArray[i]= (byte) nums[i];
            }
            else modifiedArray[i]= (byte) nums[i];
        }
        return modifiedArray;
    }
    public byte getFirstDecimal(double num){
        int intNum= (int) num;
        double number = (num - intNum)*10;
        return (byte) number;

    }
}
