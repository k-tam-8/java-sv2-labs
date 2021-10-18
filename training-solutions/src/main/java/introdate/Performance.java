package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Performance {
    private LocalDate date= LocalDate.of(1989,06,02);
    private String artist="Queen";
    private LocalTime startTime=LocalTime.of(18,00);
    private LocalTime endTime=LocalTime.of(20,00);

    public LocalDate getDate() {
        return date;
    }

    public String getArtist() {
        return artist;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getInfo() {
        return artist + ": " + date + " " + startTime + " - " + endTime;
    }
}
