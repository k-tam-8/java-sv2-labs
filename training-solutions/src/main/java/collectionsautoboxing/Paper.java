package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Paper {

    private Map<String, Integer> results = new HashMap<>();

    public Map<String, Integer> getResults() {
        return new HashMap<>(results);
    }

    public void addToMap(String s, int i){
        results.put(s,i);
    }

    public void putFurtherPaper(String className, int kilogramms) {
        if (kilogramms > 0) {
            results.put(className, kilogramms);
        }
    }

    public String getWinnerClass() {
        int max = Integer.MIN_VALUE;
        String maxName = "";
        for (Map.Entry<String, Integer> i : results.entrySet()) {
            if (i.getValue() > max) {
                max = i.getValue();
                maxName = i.getKey();
            }
        }
        return maxName;
    }

    public int getTotalWeight() {
        int sum = 0;
        for (Map.Entry<String, Integer> i : results.entrySet()) {
            sum += i.getValue();
        }
        return sum;
    }
}
