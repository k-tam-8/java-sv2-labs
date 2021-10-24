package introconstructors;

import java.time.LocalDate;

public class CyclingTour {
    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public void registerPerson(int person) {
        this.numberOfPeople+=person;
    }
    public void ride(double km){
        this.kms+=km;
    }

    public static void main(String[] args) {
        CyclingTour cyclingTour=new CyclingTour("Tour de France",LocalDate.of(2020, 11, 2));
        System.out.println(cyclingTour.description);
        System.out.println(cyclingTour.startTime);
        System.out.println(cyclingTour.kms);
        System.out.println(cyclingTour.numberOfPeople);
        cyclingTour.registerPerson(3);
        cyclingTour.registerPerson(7);
        cyclingTour.ride(12.2);
        cyclingTour.ride(8.4);
        System.out.println(cyclingTour.description);
        System.out.println(cyclingTour.startTime);
        System.out.println(cyclingTour.kms);
        System.out.println(cyclingTour.numberOfPeople);
    }
}
