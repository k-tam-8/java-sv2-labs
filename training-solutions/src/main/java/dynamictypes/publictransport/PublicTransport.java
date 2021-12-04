package dynamictypes.publictransport;

import java.util.ArrayList;
import java.util.List;

public class PublicTransport {
    private List<PublicVehicle> vehicleList = new ArrayList<>();

    public List<PublicVehicle> getVehicleList() {
        return vehicleList;
    }

    public void addVehicleList(PublicVehicle publicVehicle) {
        vehicleList.add(publicVehicle);
    }
}
