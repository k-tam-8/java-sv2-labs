package collectionsclass;

import java.util.Comparator;

public class ExamResult  {
    private String name;
    private int points;

    public ExamResult(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

}
