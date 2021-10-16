package training;

public class TrainerMain {
    public static void main(String[] args) {
        Trainer trainer = new Trainer ();
        trainer.name="Dzson Dó";
        trainer.yearOfBirth = 1980;
        System.out.println(trainer.name);
        System.out.println(trainer.yearOfBirth);

        Trainer anotherTrainer = new Trainer();
        anotherTrainer.name = "Dzsekk Dó";
        System.out.println(anotherTrainer.name);
    }
}


