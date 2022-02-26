package activitytracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Activity {
    private int id;
    private LocalDateTime startTime;
    private String description;
    private ActivityType activityType;
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public Activity(int id, LocalDateTime startTime, String description, ActivityType activityType) {
        this.id=id;
        this.startTime = startTime;
        this.description = description;
        this.activityType = activityType;
    }

    public Activity(LocalDateTime startTime, String description, ActivityType activityType) {
        this.startTime = startTime;
        this.description = description;
        this.activityType = activityType;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDescription() {
        return description;
    }

    public ActivityType getActivityType() {
        return activityType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<TrackPoint> getTrackPoints() {
        return new ArrayList<>(trackPoints);
    }

    public void addTrackPoint(TrackPoint tp) {
        trackPoints.add(tp);
    }


    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", description='" + description + '\'' +
                ", activityType=" + activityType +
                ", trackPoints=" + trackPoints +
                '}';
    }
}
