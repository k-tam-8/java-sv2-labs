package controlselection.week;

public class DayOfWeeks {
    public String getDay(String day) {
        String returnString;
        switch (day.toLowerCase()) {
            case "hétfő":
                returnString = "hét eleje";
                break;
            case "kedd", "szerda", "csütörtök":
                returnString = "hét közepe";
                break;
            case "péntek":
                returnString = "majdnem hétvége";
                break;
            case "szombat", "vasárnap":
                returnString = "hét vége";
                break;
            default:
                returnString = "ismeretlen nap";
        }
        return returnString;
    }

    public static void main(String[] args) {
        DayOfWeeks dayOfWeeks = new DayOfWeeks();
        System.out.println(dayOfWeeks.getDay("péntekk"));
    }
}
