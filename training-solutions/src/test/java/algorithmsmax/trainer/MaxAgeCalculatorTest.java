package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {
    @Test
    void testMaxAge() {
        List<Trainer> trainerList = new ArrayList<>();
        trainerList.add(new Trainer("X", 45));
        trainerList.add(new Trainer("Y", 35));
        Trainer trainerTest= new MaxAgeCalculator().getTrainerWithMaxAge(trainerList);
        assertEquals(trainerList.get(0), trainerTest);
    }
}