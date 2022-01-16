package collectionsiterator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeSchooling {

    private List<OnlineLesson> lessonList = new ArrayList<>();

    public List<OnlineLesson> getLessonList() {
        return lessonList;
    }

    public void addNewLesson(OnlineLesson lesson) {
        int tmp = 0;
        for (int i = 0; i < lessonList.size() - 1; i++) {
            if (lesson.getStartTime().isAfter(lessonList.get(i).getStartTime()) && lesson.getStartTime().isBefore(lessonList.get(i + 1).getStartTime())) {
                tmp = i + 1;
            }
        }
        lessonList.add(tmp, lesson);
    }

    public List<OnlineLesson> getLessonsByTitle(String title) {
        List<OnlineLesson> filteredLessons = new ArrayList<>();
        for (OnlineLesson ol : lessonList) {
            if (ol.getSubjectName().equals(title)) {
                filteredLessons.add(ol);
            }
        }
        return filteredLessons;
    }

    public void removeLesson(LocalDateTime startTime) {
        for (Iterator<OnlineLesson> ol = lessonList.iterator(); ol.hasNext();) {
            LocalDateTime tmpStartTime = ol.next().getStartTime();
            if (tmpStartTime.equals(startTime)) {
                ol.remove();
            }
        }
    }
}
