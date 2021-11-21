package algorithmscount.height;

import java.util.List;

public class Height {

    public int countChildrenWithHeightGreaterThan(List<Integer> list, int limit) {
        int count = 0;
        for (int i : list) {
            if (i > limit) {
                count++;
            }
        }
        return count;
    }
}
