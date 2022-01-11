package collectionsqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Vaccination {

    public Queue<Integer> getVaccinationOrder(List<Person> people) {
        Queue<Integer> filteredList = new LinkedList<>();
        for (Person p : people) {
            if (p.getAge() >= 18 && p.getAge() <= 65) {
                filteredList.add(p.getAge());
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination();
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("AAA", 19));
        personList.add(new Person("BBB", 10));
        personList.add(new Person("CCC", 70));
        personList.add(new Person("DDD", 61));
        personList.add(new Person("EEE", 45));
        Queue<Integer> list = vaccination.getVaccinationOrder(personList);
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list);
        System.out.println(list.remove());
        System.out.println(list);
    }

}
