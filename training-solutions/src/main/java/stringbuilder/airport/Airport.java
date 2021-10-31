package stringbuilder.airport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Airport {
    List<Flight> flightList = new ArrayList<>();

    public void addFlight(Flight flight){
        flightList.add(flight);

    }
    public void getDeletedFlights(){
        System.out.println("Törölt járatok: ");
        for (int i=0;i< flightList.size();i++){
            if (flightList.get(i).getStatus().toString().equals(Status.DELETED.toString())) {
                System.out.println(flightList.get(i).getFlightNumber().toString());
            }
        }

    }

    public static void main(String[] args) {
        Airport airport=new Airport();
        Flight flight=new Flight("N-4658",Status.ACTIVE);
        Flight flight2=new Flight("B-6548",Status.DELETED);
        airport.addFlight(flight);
        airport.addFlight(flight2);
        airport.getDeletedFlights();
    }
}
