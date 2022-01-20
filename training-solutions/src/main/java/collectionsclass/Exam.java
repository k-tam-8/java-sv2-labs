package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exam {
    private List<ExamResult> examResultList = new ArrayList<>();

    public Exam(List<ExamResult> examResultList) {
        this.examResultList = examResultList;
    }

    public List<String> getNamesOfSucceededPeople(int places){
        if (examResultList.size()<places){
            throw new IllegalArgumentException("Nem megfelelő szám");
        }
        List<String> filteredList = new ArrayList<>();
        List<ExamResult> orderedList = new ArrayList<>(examResultList);
        Collections.sort(orderedList, new Comparator<ExamResult>() {
            @Override
            public int compare(ExamResult o1, ExamResult o2) {
                return o1.getPoints()-o2.getPoints();
            }
        });
        Collections.reverse(orderedList);
        for (int i = 0; i < places; i++) {
            filteredList.add(orderedList.get(i).getName());
        }
        return filteredList;
    }


}
