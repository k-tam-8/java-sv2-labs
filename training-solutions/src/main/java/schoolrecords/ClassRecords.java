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
        if (!isStudentDuplicate(student)) {
            students.add(student);
            return true;
        } else return false;
    }

    private boolean isStudentDuplicate(Student student) {
        for (Student s : students) {
            if (s.getName().equals(student.getName())) {
                return true;
            }
        }
        return false;
    }

    public boolean removeStudent(Student student) {
        if (isStudentDuplicate(student)) {
            students.remove(student);
            return true;
        } else return false;
    }

    public String getClassName() {
        return className;
    }

    public double calculateClassAverage() {
        isClassEmpty();
        isMarksEmpty();
        double sum = 0;
        for (Student s : students) {
            sum += s.calculateAverage();
        }
        double avg = (double) sum / students.size();
        return avg;
    }

    private void isMarksEmpty() {
        for (Student s : students) {
            if (s.getMarks().isEmpty()) {
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
        }
    }

    private void isClassEmpty() {
        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
    }

    public double calculateClassAverageBySubject(Subject subject) {
        double sum = 0;
        int count = 0;
        for (Student s : students) {
            boolean isCalculated = false;
            for (Mark m : s.getMarks()) {
                if (!isCalculated && m.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                    sum += s.calculateSubjectAverage(subject);
                    count++;
                    isCalculated = true;
                }
            }
        }
        double avg = (double) sum / count;
        return avg;
    }

    public Student findStudentByName(String name) {
        isNameEmpty(name);
        isListEmpty();
        for (Student s : students) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }

    private void isNameEmpty(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
    }

    private void isListEmpty() {
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to search!");
        }
    }

    private void isListEmptyForRepetition() {
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to select for repetition!");
        }
    }

    public Student repetition() {
        isListEmptyForRepetition();
        int rnd = random.nextInt(students.size());
        return students.get(rnd);
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> returnList = new ArrayList<>();
        for (Student s : students) {
            returnList.add(new StudyResultByName(s.getName(), s.calculateAverage()));
        }
        return returnList;
    }

    public String listStudentNames() {
        StringBuilder sb = new StringBuilder();
        for (Student s : students){
            sb.append(s.getName()).append(", ");
        }
        sb.setLength(sb.length()-2);
        return sb.toString();
    }

}
