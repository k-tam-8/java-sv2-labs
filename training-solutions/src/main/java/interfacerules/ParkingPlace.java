package interfacerules;

public class ParkingPlace implements Width, Length{

    @Override
    public double getLength() {
        return 5;
    }

    @Override
    public double getWidth() {
        return 2.2;
    }
}
