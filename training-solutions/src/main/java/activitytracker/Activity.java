package activitytracker;

import java.time.LocalDateTime;

public class Activity {
    private int id;
    private LocalDateTime startTime;
    private String description;
    private ActivityType activityType;

    public Activity(int id, LocalDateTime startTime, String description, ActivityType activityType) {
        this.id = id;
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
}
