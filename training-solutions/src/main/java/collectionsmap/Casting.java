package collectionsmap;

import java.util.HashMap;
import java.util.Map;

public class Casting {

    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {
        int max = Integer.MAX_VALUE;
        for (Integer i : applicants.keySet()) {
            if (i > lastNumber && i < max) {
                max = i;
            }
        }
        return applicants.get(max);
    }
}
