package algorithmstransformation.student;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {
    private List<Person> persons = new ArrayList<>();

    public PrimarySchool(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() >= 6 && person.getAge() <= 14) {
                Student student = new Student(person.getName(), person.getAddress());
                students.add(student);
            }
        }
        return students;
    }
}
