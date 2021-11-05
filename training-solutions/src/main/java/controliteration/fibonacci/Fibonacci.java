package controliteration.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public void fibonacciFor(int n) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(0);
        numberList.add(1);
        numberList.add(1);
        if (n > 3) {
            for (int i = 3; i < n; i++) {
                numberList.add(numberList.get(i - 1) + numberList.get(i - 2));
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(numberList.get(i).toString());
        }
    }

    public void fibonacciWhile(int n) {
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                numberList.add(0);
            } else if (i == 1) {
                numberList.add(1);
            } else if (i == 2) {
                numberList.add(1);
            } else numberList.add(numberList.get(i - 1) + numberList.get(i - 2));
        }
        for (int i : numberList) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacciFor(9);
        fibonacci.fibonacciWhile(19);
    }
}
