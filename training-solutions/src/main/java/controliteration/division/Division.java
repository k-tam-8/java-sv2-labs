package controliteration.division;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Division {

    public List<Integer> calculateWhile(int numberMax, int div) {
        List<Integer> numberList = new ArrayList<>();
        int i = 1;
        while (i < numberMax) {
            if (i % div == 0) {
                numberList.add(i);
            }
            i++;
        }
        return numberList;
    }

    public List<Integer> calculateFor(int numberMax, int div) {
        List<Integer> numberList = new ArrayList<>();
        for (int i = 1; i < numberMax; i++) {
            if (i % div == 0) {
                numberList.add(i);
            }
        }
        return numberList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Division division = new Division();
        System.out.println("Adjon meg egy pozitív egész számot! " +
                "A program ennél kisebb számokat fog kiíírni");
        int numberMax = sc.nextInt();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int div = sc.nextInt();
        System.out.println(division.calculateWhile(numberMax, div).toString());
        System.out.println(division.calculateFor(numberMax, div).toString());
    }
}
