package polymorphism.river;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Danube extends River{
    private List<String> capitals = new ArrayList<>();

    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }

    public List<String> getCapitals() {
        return capitals;
    }

    public static void main(String[] args) {
        Water water = new Danube("DanubeWater",21, Arrays.asList("Stockholm"));
        River river = new Danube("DanubeRiver",22, Arrays.asList("Stockholm"));
        Danube danube = new Danube("Danube",23, Arrays.asList("Stockholm"));
        System.out.println(river.getName() + " " + river.getLength());
        System.out.println(danube.getName() + " " + danube.getLength() + " " + danube.getCapitals());
    }
}
