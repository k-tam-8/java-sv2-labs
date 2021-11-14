package introexceptionthrow;

public class Adult {
    private String name;
    private int age;

    public Adult(String name, int age) {
        this.name = name;
        this.age = age;
        if (this.age < 18) {
            throw new IllegalArgumentException("18 év alatti nem lehet!");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
