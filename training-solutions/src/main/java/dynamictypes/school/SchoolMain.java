package dynamictypes.school;

public class SchoolMain {
    public static void main(String[] args) {
        School schoolOne = new School("egyes", 3);
        School schoolTwo = new PrimarySchool("kettes", 3);
        School schoolThree = new SecondarySchool("hármas", 3);
        System.out.println(schoolOne);
        System.out.println(schoolTwo);
        System.out.println(schoolThree);
    }
}
