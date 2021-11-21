package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {
    public Trainer getTrainerWithMaxAge(List<Trainer> trainers){
        Trainer trainerMaxAge = null;
        for (Trainer trainer : trainers){
            if (trainerMaxAge ==null || trainer.getAge()> trainerMaxAge.getAge()){
                trainerMaxAge=trainer;
            }
        }
        return trainerMaxAge;
    }
}
