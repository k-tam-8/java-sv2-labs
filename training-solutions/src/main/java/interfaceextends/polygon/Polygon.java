package interfaceextends.polygon;

public class Polygon implements Geometric{
    private double lengthOfSide;
    private int numberOfVertices;

    public Polygon(double lengthOfSide, int numberOfVertices) {
        this.lengthOfSide = lengthOfSide;
        this.numberOfVertices = numberOfVertices;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public int getNumberOfDiagonalsFromOneVertex() {
        return 0;
    }

    @Override
    public int getNumberOfAllDiagonals() {
        return 0;
    }

    @Override
    public double getLengthOfSide() {
        return lengthOfSide;
    }

    @Override
    public int getNumberOfVertices() {
        return numberOfVertices;
    }
}
