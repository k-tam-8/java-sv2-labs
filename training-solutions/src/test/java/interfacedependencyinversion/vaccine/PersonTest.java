package interfacedependencyinversion.vaccine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Vaccine firstVaccine;
    Vaccine secondVaccine;


    @BeforeEach
    void init() {
        firstVaccine = new FirstVaccine();
        secondVaccine = new SecondVaccine();
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("AAA", 50, ChronicDisease.NO, Pregnancy.NO));
        personList.add(new Person("BBB", 70, ChronicDisease.NO, Pregnancy.NO));
        personList.add(new Person("CCC", 50, ChronicDisease.YES, Pregnancy.YES));
        personList.add(new Person("DDD", 70, ChronicDisease.YES, Pregnancy.YES));
        firstVaccine.generateVaccinationList(personList);
        secondVaccine.generateVaccinationList(personList);
    }

    @Test
    void testFirstVaccine() {
        assertEquals(4, firstVaccine.getVaccinationList().size());
        assertEquals("CCC", firstVaccine.getVaccinationList().get(0).getName());
        assertEquals("DDD", firstVaccine.getVaccinationList().get(1).getName());
        assertEquals("BBB", firstVaccine.getVaccinationList().get(2).getName());
        assertEquals("AAA", firstVaccine.getVaccinationList().get(3).getName());
    }

    @Test
    void testSecondVaccine() {
        assertEquals(2, secondVaccine.getVaccinationList().size());
        assertEquals("AAA", secondVaccine.getVaccinationList().get(0).getName());
        assertEquals("BBB", secondVaccine.getVaccinationList().get(1).getName());

    }
}