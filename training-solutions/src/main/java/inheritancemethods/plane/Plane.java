package inheritancemethods.plane;

public class Plane {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Béla", 100);
        PriorityPassenger priorityPassenger = new PriorityPassenger("Jóska", 250, 75);
        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("Pista", 250, 75);
        System.out.println(priorityPassenger.getPriceOfPlaneTicket());
        System.out.println(firstClassPassenger.getPriceOfPlaneTicket());
    }
}
