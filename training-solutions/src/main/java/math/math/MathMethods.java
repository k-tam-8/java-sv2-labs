package math.math;

import java.util.Random;

public class MathMethods {
    public static void main(String[] args) {
        System.out.println(Math.max(12,32));
        System.out.println(Math.min(12,32));
        System.out.println(Math.PI);
        System.out.println(Math.round(Math.PI));
        System.out.println(Math.round(45.76));
        System.out.println(Math.abs(-45.6));
        System.out.println(Math.negateExact(1));
        System.out.println(Math.addExact(32,12));
        System.out.println(Math.subtractExact(54,32));
        System.out.println(Math.multiplyExact(3,5));
        System.out.println(Math.pow(2,6));
        System.out.println(Math.incrementExact(4));
        System.out.println(Math.decrementExact(4));
        Random rnd = new Random();
        System.out.println(rnd.nextDouble());


    }
}
