package optional;

public class Destination {
    private String name;
    private String description;
    private int kmFromHome;

    public Destination(String name, String destination, int kmFromHome) {
        this.name = name;
        this.description = destination;
        this.kmFromHome = kmFromHome;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getKmFromHome() {
        return kmFromHome;
    }
}
