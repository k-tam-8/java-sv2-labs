package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {
    Continent c1 = Continent.ARCTIC;
        System.out.println(c1);
        c1 = Continent.AFRIKA;
        System.out.println(c1);
        c1 = Continent.EUROPE;
        System.out.println(c1);
        c1 = Continent.AMERICA;
        System.out.println(c1);
        c1 = Continent.ASIA;
        System.out.println(c1);
        for (Continent i:Continent.values()){
            System.out.println(i);
        }
        System.out.println(Arrays.toString(Ocean.values()));
        System.out.println(Ocean.valueOf("ATLANTIC_OCEAN"));
        System.out.println(Ocean.valueOf("INDIAN_OCEAN"));
        System.out.println(Ocean.valueOf("SOUTHERN_OCEAN"));
        System.out.println(Ocean.valueOf("PACIFIC_OCEAN"));
        System.out.println(Ocean.valueOf("ARCTIC_OCEAN"));

        System.out.println(Football.SONY.name());
        System.out.println(Football.LG.name());
        System.out.println(Football.APPLE.name());
        System.out.println(Football.HONOR.name());

    }

}
