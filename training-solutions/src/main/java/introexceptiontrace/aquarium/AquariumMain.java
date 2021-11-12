package introexceptiontrace.aquarium;

public class AquariumMain {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.addFish(new Fish("Vitorláshal", "szürke"));
        aquarium.addFish(new Fish("Nagy Fehér Cápa", "kék"));
        aquarium.addFish(new Fish("Ördögrája", "fekete"));
        System.out.println(aquarium.getNumberOfFish());
        //NullPointerException -  a lista nem inicializálódott
    }
}
