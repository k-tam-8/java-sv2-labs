package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class WordsTest {
    Words words;

    @BeforeEach
    void init() {
        words = new Words();
        words.addWords("alma");
        words.addWords("alak");
        words.addWords("kutya");
        words.addWords("ablak");
        words.addWords("abrak");
        words.addWords("alkat");
    }

    @Test
    void testGetWordsStartWith() {
        List<String> wordListExcept = Arrays.asList("kutya", "ablak", "abrak");
        words.getWordsStartWith("al");
        assertArrayEquals(wordListExcept.toArray(), words.getWords().toArray());
    }

    @Test
    void testGetWordsWithLength() {
        List<String> wordListExcept = Arrays.asList("alma", "alak");
        words.getWordsWithLength(5);
        assertArrayEquals(wordListExcept.toArray(), words.getWords().toArray());
    }
}
