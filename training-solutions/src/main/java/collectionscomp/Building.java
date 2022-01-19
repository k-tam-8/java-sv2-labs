package collectionscomp;

import java.util.*;

public class Building implements Comparable<Building>{
    private String address;
    private double area;
    private int floors;

    public Building(String address, double area, int floors) {
        this.address = address;
        this.area = area;
        this.floors = floors;
    }

    public String getAddress() {
        return address;
    }

    public double getArea() {
        return area;
    }

    public int getFloors() {
        return floors;
    }

    @Override
    public int compareTo(Building o) {
        return this.floors-o.floors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return floors == building.floors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(floors);
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", area=" + area +
                ", floors=" + floors +
                '}';
    }

    public static void main(String[] args) {
        Building building = new Building("x utca 10", 152,5);
        Building building2 = new Building("x utca 20", 152,21);
        Building building3 = new Building("x utca 30", 152,2);
        Set<Building> buildingList = new TreeSet<>();
        buildingList.add(building);
        buildingList.add(building2);
        buildingList.add(building3);
        System.out.println(buildingList);
    }
}
