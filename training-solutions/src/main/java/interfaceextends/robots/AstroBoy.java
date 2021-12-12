package interfaceextends.robots;

import java.nio.file.Path;
import java.util.List;

public class AstroBoy implements FlyableRobot {
    private Point position;
    private int angle;
    private List<Point> path;
    public final long ALTITUDE = 5;

    public AstroBoy(Point position) {
        this.position = position;
    }

    @Override
    public void liftTo(long altitude) {
    }

    @Override
    public void moveTo(Point position) {
        this.path.add(position);
        this.position = position;
    }

    @Override
    public void fastMove(Point position) {
        this.path.add(position);
        this.position = position;
    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;
    }

    @Override
    public List<Point> getPath() {
        return this.path;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public long getALTITUDE() {
        return ALTITUDE;
    }

    private void walkTo(Point position) {
        this.path.add(position);
        this.position = position;
    }

    public void flyTo(Point position) {
        this.path.add(position);
        this.position = position;
    }
}
