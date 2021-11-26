package methodpass.troopers;

public class Position {
    private double posX;
    private double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double distanceFrom(Position position) {
        double a = Math.pow(this.posX - position.posX, 2);
        double b = Math.pow(this.posY - position.posY, 2);
        double distance = Math.sqrt(a+b);
        return distance;
    }
}
