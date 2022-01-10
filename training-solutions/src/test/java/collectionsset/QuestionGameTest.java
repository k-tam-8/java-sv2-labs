package collectionsset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionGameTest {
    @Test
    void test() {
        QuestionGame wg = new QuestionGame();
        wg.addRightAnswer(new RightAnswer("AAA"));
        wg.addRightAnswer(new RightAnswer("BBB"));
        wg.addRightAnswer(new RightAnswer("CCC"));
        wg.addRightAnswer(new RightAnswer("DDD"));
        wg.addRightAnswer(new RightAnswer("EEE"));
        wg.addRightAnswer(new RightAnswer("FFF"));
        wg.addRightAnswer(new RightAnswer("GGG"));
        wg.addRightAnswer(new RightAnswer("HHH"));
        wg.addRightAnswer(new RightAnswer("III"));
        wg.addRightAnswer(new RightAnswer("TTT"));
        System.out.println(wg.drawWinners());
    }
}