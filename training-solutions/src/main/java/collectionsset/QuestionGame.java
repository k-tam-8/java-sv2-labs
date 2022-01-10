package collectionsset;

import java.util.*;

public class QuestionGame {
    private List<RightAnswer> goodAnswers = new ArrayList<>();

    public Set<String> drawWinners() {
        checkValidation(5);
        Random rnd = new Random();
        Set<String> winners = new HashSet<>();
        while (winners.size() < 5) {
            int rndNum = rnd.nextInt(goodAnswers.size());
            winners.add(goodAnswers.get(rndNum).getName());
            goodAnswers.remove(rndNum);
            checkValidation(0);
        }
        return winners;
    }

    private void checkValidation(int listSize) {
        if (this.goodAnswers.size() <= listSize) {
            throw new IllegalArgumentException("A lista nem megfelelő!");
        }
    }

    public void addRightAnswer(RightAnswer rightAnswer) {
        goodAnswers.add(rightAnswer);
    }
}
