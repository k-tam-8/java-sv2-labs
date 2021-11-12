package introexceptiontrace.randomoperations;

import java.util.Arrays;

public class NumbersMain {
    public static void main(String[] args) {
        Change change = new Change();
        System.out.println(Arrays.toString(change.changeNumbers()));
        //ArrayIndexOutOfBoundsException - a ciklus egyel tovább ment mint a tömb hossza
    }
}
