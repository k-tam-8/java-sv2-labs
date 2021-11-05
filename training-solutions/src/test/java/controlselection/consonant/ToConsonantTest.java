package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertSame;

public class ToConsonantTest {
    @Test
    void testOne(){
        ToConsonant toConsonant = new ToConsonant();
        assertSame('b',toConsonant.toConso('a'));
        assertSame('r',toConsonant.toConso('r'));
    }
}
