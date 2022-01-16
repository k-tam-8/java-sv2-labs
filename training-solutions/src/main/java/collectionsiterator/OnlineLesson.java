package collectionsiterator;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class OnlineLesson {
    private String teacherName;
    private String subjectName;
    private LocalDateTime startTime;

    public OnlineLesson(String teacherName, String subjectName, LocalDateTime startTime) {
        this.teacherName = teacherName;
        this.subjectName = subjectName;
        this.startTime = startTime;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return startTime.toString();
    }
}
