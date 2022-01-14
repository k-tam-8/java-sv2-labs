package nestedclasses.thermo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Thermostat {
    List<Thermometer> thermometerList;
    List<String> heatedRooms;
    private int temperatureLimit;

    public Thermostat() {
        thermometerList = new ArrayList<>();
        heatedRooms = new ArrayList<>();
        this.temperatureLimit = 23;
    }

/*    public void addThermometer(Thermometer thermometer) {
        thermometer.setThermometerObserver(new Comparator<ThermometerObserver>() {
            public void handleTemperatureChange() {
                if thermometer.getTemperature()<
            }
        })
    }*/

    public List<String> getHeatedRooms() {
        return new ArrayList<>(heatedRooms);
    }
}
