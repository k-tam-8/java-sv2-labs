package collectionsset;

import java.util.*;

public class PhysicalEducation {
    public Set<Integer> getOrderInLessons(List<Student> list) {
        Set<Integer> setList = new TreeSet<>();
        for (Student s : list) {
            setList.add(s.getHeight());
        }
        return setList;
    }

    public static void main(String[] args) {
        PhysicalEducation pe = new PhysicalEducation();
        System.out.println(pe.getOrderInLessons(Arrays.asList(
                new Student("AAA", 150),
                new Student("BBB", 200),
                new Student("CCC", 100))));

    }
}
