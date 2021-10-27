package enumtype.solarsystem;

public enum SolarSystem {
    MERKÚR(0), VÉNUSZ(0), FÖLD(1), MARS(2), JUPITER(79), SZATURNUSZ(82), URÁNUSZ(27), NEPTUNUSZ(14);

    private final int value;

    SolarSystem(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
