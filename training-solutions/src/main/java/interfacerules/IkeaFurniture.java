package interfacerules;

public class IkeaFurniture implements Name, Width, Length{
    private String name;
    private double length;
    private double width;

    public IkeaFurniture(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public String gatName() {
        return name;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
