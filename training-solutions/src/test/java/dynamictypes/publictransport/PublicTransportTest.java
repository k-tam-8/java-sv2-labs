package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {
    @Test
    void testOne() {
        PublicVehicle bus = new Bus(1,5.4,"KDF");
        PublicVehicle tram = new Tram(2,45.6,3);
        PublicVehicle metro = new Metro(3,45.8,6);
        PublicTransport publicTransport= new PublicTransport();
        publicTransport.addVehicleList(bus);
        publicTransport.addVehicleList(tram);
        publicTransport.addVehicleList(metro);
        assertEquals(3, publicTransport.getVehicleList().size());
    }
}