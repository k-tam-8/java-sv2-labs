package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine {
    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        List<Person> youngList = new ArrayList<>();
        List<Person> oldList = new ArrayList<>();

        for (Person p : registrated) {
            if (p.getPregnancy() == Pregnancy.NO && p.getChronic() == ChronicDisease.NO) {
                if (p.getAge() < 66) {
                    youngList.add(p);
                } else {
                    oldList.add(p);
                }
            }
        }

            vaccinationList.addAll(youngList);
            System.out.println(youngList.size());
            vaccinationList.addAll(oldList);
            System.out.println(oldList.size());
    }
}
