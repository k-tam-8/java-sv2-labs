package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
    public static void main(String[] args) {
        List<String> freezerItems=  new ArrayList<>();
        freezerItems.add("kacsacomb");
        freezerItems.add("libacomb");
        freezerItems.add("csirkecomb");
        freezerItems.add("disznócomb");
        freezerItems.add("pulykacomb");
        System.out.println("A lista mérete: " + freezerItems.size());
        for (String i : freezerItems)
        System.out.println(i);
        System.out.println();
        freezerItems.remove(2);
        freezerItems.remove(3);
        for (String i : freezerItems)
        System.out.println(i);
    }
}
