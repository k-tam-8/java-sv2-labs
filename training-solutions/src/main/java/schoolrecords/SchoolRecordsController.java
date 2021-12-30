package schoolrecords;

import java.util.*;

public class SchoolRecordsController {

    private ClassRecords cr;
    private List<Subject> subjects = new ArrayList<>();
    private List<Tutor> tutors = new ArrayList<>();

    private void initSchool() {
        tutors.add(new Tutor("Nagy Csilla",
                Arrays.asList(new Subject("földrajz"),
                        new Subject("matematika"),
                        new Subject("biológia"),
                        new Subject("zene"),
                        new Subject("fizika"),
                        new Subject("kémia"))));
        subjects.add(new Subject("földrajz"));
        subjects.add(new Subject("matematika"));
        subjects.add(new Subject("biológia"));
        subjects.add(new Subject("zene"));
        subjects.add(new Subject("fizika"));
        subjects.add(new Subject("kémia"));

        cr = new ClassRecords("Fourth Grade A", new Random(5));
        Student firstStudent = new Student("Kovács Rita");
        Student secondStudent = new Student("Nagy Béla");
        Student thirdStudent = new Student("Varga Márton");
        firstStudent.grading(new Mark(MarkType.A, new Subject("földrajz"), tutors.get(0)));
        firstStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutors.get(0)));
        firstStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutors.get(0)));
        secondStudent.grading(new Mark(MarkType.A, new Subject("biológia"), tutors.get(0)));
        secondStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutors.get(0)));
        secondStudent.grading(new Mark(MarkType.D, new Subject("zene"), tutors.get(0)));
        thirdStudent.grading(new Mark(MarkType.A, new Subject("fizika"), tutors.get(0)));
        thirdStudent.grading(new Mark(MarkType.C, new Subject("kémia"), tutors.get(0)));
        thirdStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutors.get(0)));
        cr.addStudent(firstStudent);
        cr.addStudent(secondStudent);
        cr.addStudent(thirdStudent);
    }

    private void drawMenu() {
        System.out.println("1. Diákok nevének listázása\n2. Diák név alapján keresése\n3. Diák létrehozása\n" +
                "4. Diák név alapján törlése\n5. Diák feleltetése\n6. Osztályátlag kiszámolása\n" +
                "7. Tantárgyi átlag kiszámolása\n8. Diákok átlagának megjelenítése\n" +
                "9. Diák átlagának kiírása\n10. Diák tantárgyhoz tartozó átlagának kiírása\n11. Kilépés");
    }

    public boolean runMenu(int i, ClassRecords cr) {
        Scanner scanIn = new Scanner(System.in);
        switch (i) {
            case 1:
                System.out.println(cr.listStudentNames());
                break;
            case 2:
                System.out.print("Tanuló neve: ");
                String nameToFind = scanIn.nextLine();
                System.out.println(cr.findStudentByName(nameToFind));
                break;
            case 3:
                System.out.print("Tanuló neve: ");
                String nameIn = scanIn.nextLine();
                Student newStudent = new Student(nameIn);
                cr.addStudent(newStudent);
                System.out.println("Tanuló hozzáadva!");
                break;
            case 4:
                System.out.print("Törlendő tanuló neve: ");
                String nameToDelete = scanIn.nextLine();
                cr.removeStudent(cr.findStudentByName(nameToDelete));
                System.out.println("Tanuló törölve!");
                break;
            case 5:
                Student studentRep = cr.repetition();
                System.out.println("Kisorsolt diák: " + studentRep.getName());
                studentRep.grading(calculateNewMark());
                System.out.println();
                break;
            case 6:
                System.out.println(cr.calculateClassAverage());
                break;
            case 7:
                System.out.println(cr.calculateClassAverageBySubject(subjects.get(findSubject())));
                break;
            case 8:
                System.out.println(cr.listStudyResults().toString());
                break;
            case 9:
                System.out.print("Tanuló neve: ");
                String nameAvg = scanIn.nextLine();
                Student getStudentAvg = cr.findStudentByName(nameAvg);
                System.out.println(getStudentAvg.calculateAverage());
                break;
            case 10:
                System.out.print("Tanuló neve: ");
                String nameAvgSub = scanIn.nextLine();
                System.out.print("Tantárgy neve: ");
                String subjectAvg = scanIn.nextLine();
                studentAvgSubOut(nameAvgSub, subjectAvg);
                break;
            case 11:
                return true;
        }
        return false;
    }

    private void studentAvgSubOut(String nameAvgSub, String subjectAvg) {
        Student getStudentAvgSub = cr.findStudentByName(nameAvgSub);
        int getSubjectIndex = 0;
        for (int j = 0; j < subjects.size(); j++) {
            if (subjects.get(j).getSubjectName().equals(subjectAvg)) {
                getSubjectIndex = j;
            }
        }
        System.out.println(getStudentAvgSub.calculateSubjectAverage(subjects.get(getSubjectIndex)));
    }

    private int findSubject() {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Tantárgy neve: ");
        String subjectIn = scanIn.nextLine();
        int returnIndex = 0;
        for (int j = 0; j < subjects.size(); j++) {
            if (subjects.get(j).getSubjectName().equals(subjectIn)) {
                returnIndex = j;
            }
        }
        return returnIndex;
    }

    private Mark calculateNewMark() {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Kapott jegy: ");
        String newMarkType = scanIn.nextLine();
        System.out.print("Tantárgy neve: ");
        String newSubject = scanIn.nextLine();
        Subject newSubjectAdd = null;
        for (Subject s : subjects) {
            if (s.getSubjectName().equals(newSubject)) {
                newSubjectAdd = s;
            }
        }
        System.out.print("Tanár neve: ");
        String newTutor = scanIn.nextLine();
        Tutor newTutorAdd = null;
        for (Tutor t : tutors) {
            if (t.getName().equals(newTutor)) {
                newTutorAdd = t;
            }
        }
        return new Mark(newMarkType, newSubjectAdd, newTutorAdd);
    }


    public static void main(String[] args) {
        SchoolRecordsController src = new SchoolRecordsController();
        Scanner sc = new Scanner(System.in);
        boolean quitSwitch = false;
        src.initSchool();
        while (!quitSwitch) {
            src.drawMenu();
            int i = sc.nextInt();
            sc.nextLine();
            quitSwitch = src.runMenu(i, src.cr);
        }
    }
}
