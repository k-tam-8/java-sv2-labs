package collectionsclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {
    @Test
    void name() {
        Lottery lottery = new Lottery();
        System.out.println(lottery.selectWinningNumbers(5,10));
    }
}