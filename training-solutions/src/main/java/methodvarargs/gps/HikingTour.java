package methodvarargs.gps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HikingTour {
    private List<FieldPoint> fieldPointList = new ArrayList<>();

    public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog) {
        if (timeOfLogging == null) {
            throw new IllegalArgumentException("Nincs adat");
        }
        for (FieldPoint fieldPoint : fieldPointsToLog) {
            fieldPoint.setTimeOfLogging(timeOfLogging);
            fieldPointList.add(fieldPoint);
        }
    }


}
