package finalmodifier;

public class CylinderCalculator {
    //h=henger magasság, r=sugár
    public double calculateVolume(double r,double h) {
        //henger térfogata: PI*(r*r)*h
        return CircleCalculator.PI*(r*r)*h;
    }
    public double calculateSurfaceArea(double r,double h) {
        //henger felszíne: 2*PI*r*(r+h)
        return 2*CircleCalculator.PI*r*(r+h);
    }
}
