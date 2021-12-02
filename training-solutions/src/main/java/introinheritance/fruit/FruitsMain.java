package introinheritance.fruit;

public class FruitsMain {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("Banán");
        fruit.setWeight(3.4);
        Grape grape = new Grape();
        grape.setType("Lila");
        Apple apple = new Apple();
        apple.setPieces(8);
        GoldenDelicious goldenDelicious = new GoldenDelicious();
        Starking starking = new Starking();
        System.out.println(fruit.getName());
        System.out.println(fruit.getWeight());
        System.out.println(grape.getType());
        System.out.println(apple.getPieces());
        System.out.println(goldenDelicious.getColour());
        System.out.println(starking.getColour());
        System.out.println(goldenDelicious.getName());
        goldenDelicious.setName("szóló");
        System.out.println(goldenDelicious.getName());
        System.out.println(fruit.getName());
    }
}
