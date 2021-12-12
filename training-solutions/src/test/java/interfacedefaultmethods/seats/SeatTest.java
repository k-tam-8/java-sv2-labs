package interfacedefaultmethods.seats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {
    @Test
    void testSeats() {
        Seat family = new FamilyCar();
        Seat car = new Car("Ford", 7);
        Seat sportCar = new SportsCar();
        assertEquals(5,family.getNumberOfSeats());
        assertEquals(2,sportCar.getNumberOfSeats());
        assertEquals(7,car.getNumberOfSeats());
    }
}