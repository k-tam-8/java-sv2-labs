package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private List<Activity> activities = new ArrayList<>();

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Report> distancesByTypes() {
        List<Report> reportList = new ArrayList<>();

/*        for (Activity a : activities) {
            reportList.add(new Report(a.getType(), a.getDistance()));
        }*/

        for (int i = 0; i < 4; i++) {
            int sum=0;
            for (int j = 0; j < activities.size(); j++) {
                if (activities.get(j).getType().ordinal()==i){
                    sum+=activities.get(j).getDistance();
                }
            }
            reportList.add(new Report(ActivityType.values()[i], sum));
        }


        return reportList;
    }

    public int numberOfTrackActivities() {
        int sum = 0;
        for (Activity a : activities) {
            if (a instanceof ActivityWithTrack) {
                sum++;
            }
        }
        return sum;
    }

    public int numberOfWithoutTrackActivities() {
        int sum = 0;
        for (Activity a : activities) {
            if (a instanceof ActivityWithoutTrack) {
                sum++;
            }
        }
        return sum;
    }
}
