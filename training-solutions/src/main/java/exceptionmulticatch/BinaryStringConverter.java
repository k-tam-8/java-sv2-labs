package exceptionmulticatch;

public class BinaryStringConverter {
    public boolean[] binaryStringToBooleanArray(String binaryString) {
        boolean[] boolArray = new boolean[binaryString.length()];
        if (binaryString == null) {
            throw new NullPointerException("Input is null!");
        }
        for (Character c : binaryString.toCharArray()) {
            if (c != '0' && c != '1') {
                throw new IllegalArgumentException("Wrong input");
            }
        }
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '0') {
                boolArray[i] = false;
            } else boolArray[i] = true;
        }
        return boolArray;
    }

    public String booleanArrayToBinaryString(boolean[] boolArr) {
        if (boolArr == null || boolArr.length == 0) {
            throw new NullPointerException("Input is null!");
        }
        String binaryString = "" ;
        for (boolean b : boolArr) {
            if (b) {
                binaryString += "1" ;
            } else binaryString += "0" ;
        }
        return binaryString;
    }
}
