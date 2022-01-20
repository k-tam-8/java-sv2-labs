package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {

        List<Integer> lotteryNumbers = new ArrayList<>();
        List<Integer> winningNumbers = new ArrayList<>();
        Random rnd = new Random();

        if (ballCount < lotteryType) {
            throw new IllegalArgumentException("Nem megfelelő számok!");
        }

        for (int i = 0; i < ballCount; i++) {
            lotteryNumbers.add(i, i+1);
        }

        Collections.shuffle(lotteryNumbers);

        winningNumbers.add(rnd.nextInt(lotteryNumbers.size())+1);

        for (int i = 1; i < lotteryType; i++) {
            int temp = -1;
            do {
                temp = rnd.nextInt(lotteryNumbers.size())+1;
            } while (winningNumbers.contains(temp));
            winningNumbers.add(temp);
        }
        Collections.sort(winningNumbers);

        return winningNumbers;
    }
}
