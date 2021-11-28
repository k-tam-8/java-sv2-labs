package constructoroverloading.bus;


import statements.Time;

public class SimpleTime {
    private Time time;

    public SimpleTime(int hours, int minutes) {
        Time timeTemp = new Time(hours, minutes, 0);
        this.time = timeTemp;
    }

    public SimpleTime(int hours) {
        Time timeTemp = new Time(hours, 0, 0);
        this.time = timeTemp;
    }

    public SimpleTime(SimpleTime time) {
        this.time = (time.time);
    }

    public int getDifference(SimpleTime time) {
        return Math.abs(this.time.getInMinutes() - time.time.getInMinutes());
    }

    public String toString() {
        return this.time.toString();
    }

}
