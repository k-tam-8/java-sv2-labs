package numbers;

import java.util.Random;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int numberOne = rnd.nextInt(9) + 1;
        int numberTwo = rnd.nextInt(9) + 1;
        int numberThree = rnd.nextInt(9) + 1;
        System.out.println("Feladat: " + numberOne + " + (" + numberTwo + " x " + numberThree + ") / " + numberOne);
        double guess = scan.nextDouble();
        double result =  numberOne + (double)numberTwo * numberThree /  numberOne;
        System.out.println(Math.abs(guess-result) <0.0001 ? "helyes eredmény!" : "rossz eredmény, a helyes: " + result);
    }
}
