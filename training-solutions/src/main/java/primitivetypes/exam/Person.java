package primitivetypes.exam;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthDate;
    private int zipCode;
    private double median;

    public Person(String name, LocalDate birthDate, int zipCode, double median) {
        this.name = name;
        this.birthDate = birthDate;
        this.zipCode = zipCode;
        this.median = median;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getZipCode() {
        return zipCode;
    }

    public double getMedian() {
        return median;
    }

    @Override
    public String toString() {
        return "Személy neve: " + name +
                ", született: " + birthDate +
                ", irányítószáma: " + zipCode +
                ", jegyeinek átlaga: " + median ;
    }
}
