package stringbasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class University {
    private List<Student> studentList = new ArrayList<>();
    public void addStudent(Student student){
        studentList.add(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }
    public boolean areEqual(Student student, Student anotherStudent) {
        return (student.getSchoolId().equals(anotherStudent.getSchoolId()) &&
                student.getNeptune().equals(anotherStudent.getNeptune())) ;
    }
}
