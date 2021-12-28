package schoolrecords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
    }

    private void drawMenu() {
        System.out.println("1. Diákok nevének listázása\n2. Diák név alapján keresése\n3. Diák létrehozása\n" +
                "4. Diák név alapján törlése\n5. Diák feleltetése\n6. Osztályátlag kiszámolása\n" +
                "7. Tantárgyi átlag kiszámolása\n8. Diákok átlagának megjelenítése\n" +
                "9. Diák átlagának kiírása\n10. Diák tantárgyhoz tartozó átlagának kiírása\n11. Kilépés");
    }

    public static void main(String[] args) {
        SchoolRecordsController src = new SchoolRecordsController();
        src.initSchool();
        src.drawMenu();
        Scanner sc = new Scanner(System.in);


    }
}
