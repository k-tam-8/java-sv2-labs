package algorithmsmax.hill;

import java.util.List;

public class Hill {
    public int getMax(List<Integer> list){
        int max = list.get(0);
        for (int i : list) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
