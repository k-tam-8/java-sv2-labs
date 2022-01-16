package collectionsiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {
    private List<ChristmasPresent> presentList = new ArrayList<>();

    public ChristmasShopping(List<ChristmasPresent> presentList) {
        this.presentList = presentList;
    }

    public void addNewPresent(ChristmasPresent present) {
        presentList.add(present);
    }

    public List<ChristmasPresent> getPresentList() {
        return new ArrayList<>(presentList);
    }

    public void removeTooExpensivePresent(int maxPrice) {
        for (Iterator<ChristmasPresent> it = presentList.iterator(); it.hasNext(); ) {
            int value = it.next().getPrice();
            if (value > maxPrice) {
                it.remove();
            }
        }
    }

}
