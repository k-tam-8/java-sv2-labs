package finalmodifier;

public class CylinderCalculatorBasedOnCircle {
    CircleCalculator circleCalculator = new CircleCalculator();
    public double calculateVolume(double r,double h) {
        //henger térfogata: PI*(r*r)*h
        return circleCalculator.calculateArea(r)*h;
    }
    public double calculateSurfaceArea(double r,double h) {
        //henger felszíne: 2*PI*r*(r+h)
        return circleCalculator.calculatePerimeter(r)*(r+h);
    }
}
