package primitivetypes.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam {
    List<Person> personDataBase = new ArrayList<>();

    public List<Person> getPersonDataBase() {
        return personDataBase;
    }
    public void addPerson(Person person){
        personDataBase.add(person);
    }
}
