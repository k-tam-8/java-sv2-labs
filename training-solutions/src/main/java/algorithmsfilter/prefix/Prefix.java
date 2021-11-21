package algorithmsfilter.prefix;

import java.util.ArrayList;
import java.util.List;

public class Prefix {
    public List<String> getWordsStartWith(List<String> words, String prefix){
        List<String> returnList = new ArrayList<>();
        for (String s : words){
            if (s.contains(prefix)){
                returnList.add(s);
            }
        }
        return returnList;
    }
}
