package stringbasic;

public class UniversityMain {
    public static void main(String[] args) {
        Person person = new Person("John","john@xy.com","145654789","6548487987","0587456587");
        Student student = new Student(person,"145687","1234","65489");
        Person anotherPerson = new Person("Jim","jim@xy.com","41432432","1352342","52532432");
        Student anotherStudent = new Student(person,"245687","1234","65489");
        University university = new University();
        university.addStudent(student);
        System.out.println(university.areEqual(student,anotherStudent));
    }
}
