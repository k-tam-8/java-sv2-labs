package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.List;

public class Jackpot {
    public static void main(String[] args) {
        Winner winner = new Winner();
        try {
            String s= winner.getWinner();
            System.out.println(s);
        } catch (NullPointerException nfe){
            System.out.println("Nem megfelelő név!");
        }
        System.out.println("end.");
    }
}
