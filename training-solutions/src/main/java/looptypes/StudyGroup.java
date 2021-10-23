package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {
    public void printStudyGroups(List<String> students) {
        List<String> firstClass = new ArrayList<>();
        List<String> secondClass = new ArrayList<>();
        for (String temp: students){
            if (temp.length()<11) firstClass.add(temp); else secondClass.add(temp);
        }
        System.out.print("Első csoport: ");
        for (String temp:firstClass)
            System.out.print(temp + " ");
        System.out.println();
        System.out.print("Második csoport: ");
        for (String temp:secondClass)
            System.out.print(temp + " ");

    }

    public static void main(String[] args) {
        List<String> students = Arrays.asList("Béla", "Gáborrrrrrr", "József", "Tamássssssss","Pityu", "Vikkkkkktor");
        StudyGroup studyGroup = new StudyGroup();
        studyGroup.printStudyGroups(students);
    }
}
