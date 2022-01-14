package nestedclasses.thermo;

public class Thermometer{
    private String roomName;
    private int temperature;
    private ThermometerObserver thermometerObserver;

    public Thermometer(String roomName, int temperature) {
        this.roomName = roomName;
        this.temperature = temperature;
        this.thermometerObserver = null;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getTemperature() {
        return temperature;
    }

    public ThermometerObserver getThermometerObserver() {
        return thermometerObserver;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        onTemperatureChanged();
    }

    public void onTemperatureChanged(){
            if (this.thermometerObserver!= null){
                thermometerObserver.handleTemperatureChange(temperature, roomName);
            }
    }

    public void setThermometerObserver(ThermometerObserver observer){
        this.thermometerObserver=observer;
    }

}
