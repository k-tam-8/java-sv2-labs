package interfacedefaultmethods.cloth;

public interface Square {
    default int getNumberOfSides() {
        return 4;
    }

    default double getLengthOfDiagonal() {
        return getSide() * Math.sqrt(2);
    }

    default double getPerimeter() {
        return getNumberOfSides() * getSide();
    }

    default double getArea() {
        return getSide() * getSide();
    }

    double getSide();

}
