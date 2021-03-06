package interfacedependencyinversion.vaccine;

public class Person {
    private String name;
    private int age;
    private ChronicDisease chronic;
    private Pregnancy pregnancy;

    public Person(String name, int age, ChronicDisease chronic, Pregnancy pregnancy) {
        this.name = name;
        this.age = age;
        this.chronic = chronic;
        this.pregnancy = pregnancy;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ChronicDisease getChronic() {
        return chronic;
    }

    public Pregnancy getPregnancy() {
        return pregnancy;
    }
}
