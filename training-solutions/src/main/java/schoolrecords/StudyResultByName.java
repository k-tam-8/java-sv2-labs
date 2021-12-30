package schoolrecords;

public class StudyResultByName {
    private String studentName;
    private double studyAverage;

    public StudyResultByName(String name, double avrg) {
        this.studentName = name;
        this.studyAverage = avrg;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return studyAverage;
    }

    @Override
    public String toString() {
        return studentName + " tanuló átlaga: " + studyAverage;
    }
}
