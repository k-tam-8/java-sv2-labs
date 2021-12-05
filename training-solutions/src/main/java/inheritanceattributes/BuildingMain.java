package inheritanceattributes;

public class BuildingMain {
    public static void main(String[] args) {
        Building building = new Building("XYZ",5.2,2);
        SchoolBuilding schoolBuilding = new SchoolBuilding(5);
        System.out.println(building.area + " " + building.name + " " + building.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}
