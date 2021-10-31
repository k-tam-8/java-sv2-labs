package stringseparate;

import java.util.Arrays;
import java.util.List;

public class IceCream {
    List<String> iceCreams = Arrays.asList("csoki", "vanília", "eper", "citrom");

    public static void main(String[] args) {
        IceCream iceCream = new IceCream();
        boolean tmpBool = true;
        System.out.print("Ma kapható: ");
        for (String i : iceCream.iceCreams) {
            if (tmpBool) {
                tmpBool = false;
                System.out.print(i);
            } else {
                System.out.print(", "+i);
            }
        }
        System.out.println(". Ma féláron kapható!");
    }
}
