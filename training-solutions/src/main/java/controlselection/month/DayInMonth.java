package controlselection.month;

public class DayInMonth {
    public int daysInMonth(int year, String month) {
        int i = 0;
        switch (month.toLowerCase()) {
            case "január":
                i = 31;
                break;
            case "február":
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                    i = 28;
                } else i = 29;
                break;
            case "március":
                i = 31;
                break;
            case "április":
                i = 30;
                break;
            case "május":
                i = 31;
                break;
            case "június":
                i = 30;
                break;
            case "július":
                i = 31;
                break;
            case "augusztus":
                i = 31;
                break;
            case "szeptember":
                i = 30;
                break;
            case "október":
                i = 31;
                break;
            case "november":
                i = 30;
                break;
            case "december":
                i = 31;
                break;
            default:
                i = 0;
        }
        return i;
    }

    public static void main(String[] args) {
        DayInMonth dayInMonth = new DayInMonth();
        System.out.println(dayInMonth.daysInMonth(1587,"FEBruáR"));
    }
}
