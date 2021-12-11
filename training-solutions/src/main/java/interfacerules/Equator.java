package interfacerules;

public class Equator implements Name, Length{
    private final static String NAME = "Equator";
    private final static double LENGTH= 156.3;

    @Override
    public double getLength() {
        return LENGTH;
    }

    @Override
    public String gatName() {
        return NAME;
    }
}
