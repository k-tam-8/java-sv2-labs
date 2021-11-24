package javabeans;

public class Dog {
    private String name;
    private int age;
    private boolean pedigree;
    private Double weight;

    public Dog(String name, int age, boolean pedigree, Double weight) {
        this.name = name;
        this.age = age;
        this.pedigree = pedigree;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isPedigree() {
        return pedigree;
    }

    public Double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
