package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TrainingCompany {

    List<Course> courseList = new ArrayList<>();

    public Course getCheaperCourse(int maxPrice) {
        Optional<Course> optCourse = Optional.empty();
        for (Course c : courseList) {
            if (c.getPrice() <= maxPrice) {
                optCourse = Optional.of(c);
            }
        }
        Course foundCourse = optCourse.orElseThrow(() -> new IllegalArgumentException("Not found"));
        return foundCourse;
    }

    public int getPriceOfCourseWithGivenNameAndLevel(String name, Level level) {
        Optional<Course> optCourse = Optional.empty();
        for (Course c : courseList) {
            if (c.getName().equals(name) && c.getLevel() == level) {
                optCourse = Optional.of(c);
            }
        }
        Course foundCourse = optCourse.orElseThrow(() -> new IllegalArgumentException("Not found"));
        return foundCourse.getPrice();
    }

    public String getNameOfCourseWithGivenLevel(Level level) {
        Optional<Course> optCourse = Optional.empty();
        for (Course c : courseList) {
            if (c.getLevel() == level) {
                optCourse = Optional.of(c);
            }
        }
        Course foundCourse = optCourse.orElseThrow(() -> new IllegalArgumentException("Sorry, there is no course at this level."));
        return foundCourse.getName();
    }
}
