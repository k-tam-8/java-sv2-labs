package interfaceextends.robots;

import java.nio.file.Path;
import java.util.List;

public class C3PO implements MovableRobot{
    private Point position;
    private int angle;
    private List<Point> path;

    public C3PO(Point position) {
        this.position = position;
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
    private void walkTo(Point position){
        this.path.add(position);
        this.position = position;
    }
}
