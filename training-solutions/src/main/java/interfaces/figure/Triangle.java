package interfaces.figure;

public class Triangle implements Area{
    private double lengthOfSide;
    private double height;

    public Triangle(double lengthOfSide, double height) {
        this.lengthOfSide = lengthOfSide;
        this.height = height;
    }
    public double GetLengthOfSide(){
        return lengthOfSide;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(){
        return (lengthOfSide * height) / 2.0;
    }
}
