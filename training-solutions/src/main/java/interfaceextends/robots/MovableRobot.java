package interfaceextends.robots;

import java.nio.file.Path;
import java.util.List;

public interface MovableRobot {
    void moveTo(Point position);
    void fastMove(Point position);
    void rotate(int angle);
    List<Point> getPath();
}
