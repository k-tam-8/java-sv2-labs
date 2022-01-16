package collectionsiterator;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class HomeSchoolingTest {
    @Test
    void testOne() {
        HomeSchooling hs = new HomeSchooling();
        hs.addNewLesson(new OnlineLesson("XXX", "Fizika", LocalDateTime.of(2022,1,2,15,30)));
        hs.addNewLesson(new OnlineLesson("YYY", "Kémia", LocalDateTime.of(2022,1,2,13,30)));
        hs.addNewLesson(new OnlineLesson("TTT", "Matematika", LocalDateTime.of(2022,1,2,10,30)));
        hs.addNewLesson(new OnlineLesson("RRR", "Nyelvtan", LocalDateTime.of(2022,1,2,14,30)));
        hs.addNewLesson(new OnlineLesson("RTZ", "Irodalom", LocalDateTime.of(2022,1,2,12,30)));
        hs.addNewLesson(new OnlineLesson("WER", "Irodalom", LocalDateTime.of(2022,1,2,9,30)));
        System.out.println(hs.getLessonList().toString());
        System.out.println(hs.getLessonsByTitle("Irodalom"));
        hs.removeLesson(LocalDateTime.of(2022,1,2,13,30));
        System.out.println(hs.getLessonList().toString());

    }
}