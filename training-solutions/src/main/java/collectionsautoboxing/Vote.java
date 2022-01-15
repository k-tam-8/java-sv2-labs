package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> datas) {
        Map<VoteResult, Integer> results = new HashMap<>();
        int yesSum = 0;
        int noSum = 0;
        int abstainSum = 0;
        for (Map.Entry<String, VoteResult> entries : datas.entrySet()) {
            if (entries.getValue().equals(VoteResult.NO)) {
                noSum++;
            } else if (entries.getValue().equals(VoteResult.ABSTAIN)) {
                abstainSum++;
            } else yesSum++;
        }
        results.put(VoteResult.YES, yesSum);
        results.put(VoteResult.NO, noSum);
        results.put(VoteResult.ABSTAIN, abstainSum);
        return results;
    }

}
