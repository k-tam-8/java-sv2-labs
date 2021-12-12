package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine {
    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        List<Person> pregnantList = new ArrayList<>();
        List<Person> oldList = new ArrayList<>();
        List<Person> restList = new ArrayList<>();

        for (Person p : registrated) {
            if (p.getPregnancy() == Pregnancy.YES) {
                pregnantList.add(p);
            } else if (p.getAge() > 65) {
                oldList.add(p);
            } else if (!restList.contains(p)) {
                restList.add(p);
            }
        }

        vaccinationList.addAll(pregnantList);
        vaccinationList.addAll(oldList);
        vaccinationList.addAll(restList);
    }
}
