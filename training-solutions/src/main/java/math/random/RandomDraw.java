package math.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Béla", "Pista", "Jóska", "Tomi", "Norbi", "Lali", "Laci", "Miska", "Gabi", "Imi");
        Random rnd = new Random();
        int x= rnd.nextInt(5);
        int y= rnd.nextInt(5)+5;
        System.out.println(names.get(x));
        System.out.println(names.get(y));
    }
}
