package algorithmssum.school;

import java.util.List;

public class School {
    public int getNumberOfStudents(List<Integer> headcounts) {
        int countStudents = 0;
        for (int i : headcounts) {
            countStudents += i;
        }
        return countStudents;
    }
}
