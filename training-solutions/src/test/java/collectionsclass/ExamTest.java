package collectionsclass;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {
    @Test
    void name() {
        List<ExamResult> examResultList = new ArrayList<>();
        examResultList.add(new ExamResult("hatvan", 60));
        examResultList.add(new ExamResult("húsz", 20));
        examResultList.add(new ExamResult("negyven", 40));
        examResultList.add(new ExamResult("hetven", 70));
        examResultList.add(new ExamResult("tíz", 10));
        examResultList.add(new ExamResult("harminc", 30));
        System.out.println(new Exam(examResultList).getNamesOfSucceededPeople(3));
    }
}