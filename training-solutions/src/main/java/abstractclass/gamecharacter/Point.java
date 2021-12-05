package abstractclass.gamecharacter;

public class Point {
    private long x;
    private long y;

    public long distance(Point anotherPoint) {
        long distX = calculateDistancePoint(this.x, anotherPoint.getX());
        long distY = calculateDistancePoint(this.y, anotherPoint.getY());
        long dist = (long) Math.sqrt(distX * distY);
        return dist;
    }

    public long calculateDistancePoint(long x1, long x2) {
        long distX = 0;
        if (x1 >= x2) {
            distX = x1 - x2;
        } else {
            distX = x2 - x1;
        }
        return distX *= distX;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }
}
