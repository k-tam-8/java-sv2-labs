package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.List;

public class TwoLetters {
    public List<String> getFirstTwoLetters(List<String> list) {
        List<String> returnList = new ArrayList<>();
        for (String s : list) {
            returnList.add(s.substring(0, 2));
        }
        return returnList;
    }
}
