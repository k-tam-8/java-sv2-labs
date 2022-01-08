package exceptionclass.course;

public class Course {
    private String name;
    private SimpleTime begin;

    public Course(String name, SimpleTime begin) {
        this.name = name;
        this.begin = begin;
    }

    public String getName() {
        return name;
    }

    public SimpleTime getBegin() {
        return begin;
    }

    @Override
    public String toString() {
        return begin + ": " + name;
    }

    public static void main(String[] args) {
        Course course = new Course("elso", new SimpleTime(1,1));
        System.out.println(course);
        Course course2 = new Course("elso", new SimpleTime("23:60"));
        System.out.println(course2);
    }
}
