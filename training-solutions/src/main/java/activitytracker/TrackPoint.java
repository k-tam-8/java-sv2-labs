package activitytracker;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public class TrackPoint {
    private int id;
    private LocalDate time;
    private int lat;
    private int lon;

    public TrackPoint(int id, LocalDate time, int lat, int lon) {
        this.id = id;
        this.time = time;
        this.lat = lat;
        this.lon = lon;
    }

    public TrackPoint(LocalDate time, int lat, int lon) {
        this.time = time;
        this.lat = lat;
        this.lon = lon;
    }

    public int getId() {
        return id;
    }

    public LocalDate getTime() {
        return time;
    }

    public int getLat() {
        return lat;
    }

    public int getLon() {
        return lon;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TrackPoint{" +
                "id=" + id +
                ", time=" + time +
                ", lat=" + lat +
                ", lon=" + lon +
                '}';
    }
}
