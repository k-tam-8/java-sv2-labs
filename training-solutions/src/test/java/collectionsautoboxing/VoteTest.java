package collectionsautoboxing;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VoteTest {
    @Test
    void test() {
        Vote vote = new Vote();
        Map<String, VoteResult> datas = new HashMap<>();
        datas.put("John Doe", VoteResult.YES);
        datas.put("Jack Doe", VoteResult.NO);
        datas.put("Jill Doe", VoteResult.YES);
        datas.put("Jake Doe", VoteResult.ABSTAIN);
        Map<VoteResult, Integer> results = vote.getResult(datas);
        assertEquals(3, results.size());
        assertEquals(2, results.get(VoteResult.YES));
        assertEquals(1, results.get(VoteResult.ABSTAIN));
    }
}