package typeconversion;

public class ConversionMain {
    public static void main(String[] args) {
        Conversion conversion = new Conversion();
        System.out.println(conversion.convertDoubleToDouble(16.89));
        int[] nums = {5, -14, 6, 2, 125, 354, 9738, 3};
        byte[] byteArray= conversion.convertIntArrayToByteArray(nums);
        for (byte i:byteArray){
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println(conversion.getFirstDecimal(7.341));
    }
}
