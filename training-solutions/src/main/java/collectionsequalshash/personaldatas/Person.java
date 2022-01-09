package collectionsequalshash.personaldatas;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private int id;

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        Person person = new Person("xyz", 20,12345);
        Person person2 =new Person("xyt", 21,12345);
        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person.equals(person2));

    }
}


