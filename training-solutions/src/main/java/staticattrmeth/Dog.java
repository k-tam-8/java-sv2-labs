package staticattrmeth;

public class Dog {
    private String name;
    private int age;
    private Species species;
    private long codeNumber;

    public Dog(String name, int age, Species species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void setCodeNumber(long codeNumber) {
        this.codeNumber = codeNumber;
    }
}
