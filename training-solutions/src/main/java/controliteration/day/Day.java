package controliteration.day;

import java.util.ArrayList;
import java.util.List;

public class Day {
    private List<Hour> hoursOfDay = new ArrayList<>();

    public List<Hour> getHoursOfDay() {
        return hoursOfDay;
    }

    public void adHoursOfDay(Hour hour) {
        hoursOfDay.add(hour);
    }

    public void setDayPeriod(){
        for (Hour h:hoursOfDay){
            if (h.getHourNumber()<22 && h.getHourNumber()>5) {
                h.setPeriod(DayPeriod.DAYTIME);
            } else h.setPeriod(DayPeriod.NIGHTTIME);
        }
    }
}
