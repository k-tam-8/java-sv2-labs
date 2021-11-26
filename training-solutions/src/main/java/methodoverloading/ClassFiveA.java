package methodoverloading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassFiveA {
    private List<String> students = Arrays.asList("Béla", "Jóska", "Lala", "Pistike", "Laci");
    private Number numberEnum;

    public String getTodayReferringStudent(int number) {
        return students.get(number - 1).toString();
    }

    public String getTodayReferringStudent(Number number) {
        int i = 0;
        i = number.ordinal();
        return students.get(i - 1).toString();
    }

    public String getTodayReferringStudent(String numberName) {
        int i = 0;
        i = Number.valueOf(numberName.toUpperCase()).getNumberOfStudent();
        return students.get(i - 1).toString();
    }
}
