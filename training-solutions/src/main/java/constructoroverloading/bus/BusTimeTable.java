package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {
    private List<SimpleTime> timeList = new ArrayList<>();

    public BusTimeTable(List<SimpleTime> timeTable){
        this.timeList=timeTable;
    }
  /*  public BusTimeTable(int firstHour, int lastHour, int everyMinute){
        this.timeList.add(new SimpleTime());
    }*/

    public List<SimpleTime> getTimeList() {
        return timeList;
    }
    
}
