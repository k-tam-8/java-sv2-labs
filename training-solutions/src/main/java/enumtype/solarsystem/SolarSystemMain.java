package enumtype.solarsystem;

public class SolarSystemMain {
    public static void main(String[] args) {
        for (SolarSystem i:SolarSystem.values()){
            System.out.println(i + " " + i.getValue());
        }
    }
}
