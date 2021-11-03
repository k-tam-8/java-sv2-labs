package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    public void addWords(String word) {
        this.words.add(word);
    }

    public void getWordsStartWith(String prefix) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).startsWith(prefix)) {
                words.remove(i);
                i--;
            }
        }
    }

    public void getWordsWithLength(int length) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == length) {
                words.remove(i);
                i--;
            }
        }

    }
}
