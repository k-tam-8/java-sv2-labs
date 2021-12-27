package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        this.className = className;
        this.random = random;
    }

    public boolean addStudent(Student student) {
        students.add(student);
        return true;
    }

    public boolean removeStudent(Student student) {
        if (students.contains(student)) {
            students.remove(student);
            return true;
        }
        return false;
    }

    public String getClassName() {
        return className;
    }

    public double calculateClassAverage() {
        return 0;
    }

    public double calculateClassAverageBySubject(Subject subject) {
        return 0;
    }

    public Student findStudentByName(String name) {
        return null;
    }

    public Student repetition() {
        return null;
    }

    public List<StudyResultByName> listStudyResults() {
        return null;
    }

    public String listStudentNames() {
        return null;
    }

}
