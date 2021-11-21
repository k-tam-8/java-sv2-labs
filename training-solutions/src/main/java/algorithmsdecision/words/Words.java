package algorithmsdecision.words;

import java.util.List;

public class Words {
    public boolean containsLongerWord(List<String> wordList, String newWord) {
        for (String s : wordList) {
            if (s.length() > newWord.length()) {
                return true;
            }
        }
        return false;
    }

}
