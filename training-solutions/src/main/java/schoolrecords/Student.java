package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        checkEmptyName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Mark> getMarks() {
        return new ArrayList<>(marks);
    }

    public void grading(Mark mark) {
        checkGradingIsNull(mark);
        marks.add(mark);
    }

    private void checkGradingIsNull(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
    }

    public double calculateAverage() {
        int sum = 0;
        for (Mark m : marks) {
            sum += m.getMarkType().getMark();
        }
        double avg = (double) sum / marks.size();
        avg = (double) Math.round(avg * 100) / 100;
        return avg;
    }

    public double calculateSubjectAverage(Subject subject) {
        int sum = 0;
        int count = 0;
        for (Mark m : marks) {
            if (m.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                sum += m.getMarkType().getMark();
                count++;
            }
        }
        if (sum == 0 || count == 0) {
            return 0.0;
        }
        return (double) sum / count;
    }

    private void checkEmptyName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Mark m : marks) {
            sb.append(" ");
            sb.append(m.getSubject()).append(": ").append(m.getMarkType().getMarkName()).append("(").append(m.getMarkType().getMark()).append(")");
        }
        return name + " marks:" + sb;
    }
}
