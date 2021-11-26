package methodoverloading;

public class Time {
    private Time time;

    public Time(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public boolean isEqual(Time time) {
        return (time.isEqual(this.time));
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        return (this.time.isEqual(hours, minutes, seconds));
    }

    public boolean isEarlier(Time time) {
        return (time.isEarlier(this.time));
    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        return (this.time.isEarlier(hours, minutes, seconds));
    }
}
