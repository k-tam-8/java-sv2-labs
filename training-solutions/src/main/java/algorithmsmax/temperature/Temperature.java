package algorithmsmax.temperature;

import java.util.List;

import static java.lang.Float.*;

public class Temperature {
    public int getMin(List<Integer> tempList) {
        int minTemp = tempList.get(0);
        for (int i : tempList) {
            if (minTemp > i) {
                minTemp = i;
            }
        }
        return minTemp;
    }
}
