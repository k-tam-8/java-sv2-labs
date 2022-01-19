package collectionscomp;

import java.text.Collator;
import java.util.*;

public class School {

    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new StudentComparator());
        students.add(new Student("béla", 110));
        students.add(new Student("béla2", 85));
        students.add(new Student("béla3", 130));
        students.add(new Student("béla4", 100));
        students.add(new Student("béla5", 89));
        System.out.println(students);
        Map<String, Integer> mapList = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));
        mapList.put("béla", 110);
        mapList.put("géla2", 85);
        mapList.put("zéla3", 130);
        mapList.put("aéla4", 100);
        mapList.put("áéla5", 89);
        System.out.println(mapList);
    }
}
