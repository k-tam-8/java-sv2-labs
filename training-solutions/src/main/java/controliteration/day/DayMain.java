package controliteration.day;

public class DayMain {
    public static void main(String[] args) {
        Day day = new Day();
        Hour hour = new Hour(5);
        Hour hourTwo = new Hour(12);
        Hour hourThree = new Hour(23);
        day.adHoursOfDay(hour);
        day.adHoursOfDay(hourTwo);
        day.adHoursOfDay(hourThree);
        day.setDayPeriod();
        System.out.println(day.getHoursOfDay().get(0).getPeriod());
        System.out.println(day.getHoursOfDay().get(1).getPeriod());
        System.out.println(day.getHoursOfDay().get(2).getPeriod());
    }
}
