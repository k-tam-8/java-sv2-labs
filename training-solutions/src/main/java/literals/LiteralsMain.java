package literals;

import java.util.Locale;

public class LiteralsMain {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 2;
        String s= firstNumber +""+  secondNumber;
        System.out.println(s);
        double quotient = 3/4D;
        System.out.println(quotient);
        long big = 3_244_444_444L;
        System.out.println(big);
        String word ="title".toUpperCase(Locale.ROOT);
        System.out.println(word);
        System.out.println(Integer.toBinaryString(firstNumber)+" "+ Integer.toBinaryString(secondNumber));

    }
}

