package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {
    private List<String> flowers = new LinkedList<>();

    public void addFlowerInTheMiddle(String flower) {
        if (isOdd()) {
            flowers.add((flowers.size() / 2) - 1, flower);
        } else {
            flowers.add(flowers.size() / 2, flower);
            flowers.add((flowers.size() / 2) + 2, flower);
        }
    }

    private boolean isOdd() {
        return flowers.size() % 2 == 0;
    }
}
