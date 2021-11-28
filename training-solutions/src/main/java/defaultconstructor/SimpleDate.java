package defaultconstructor;

public class SimpleDate {
    private int month;
    private int year;
    private int day;

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public void setDate(int year, int month, int day){
        if (isCorrect(year,month,day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }
    private boolean isCorrect(int year, int month, int day){
        if (year>=1900 && month<13 && month >0){
            return true;
        } else throw new IllegalArgumentException("Nem megfelelő dátum!");
    }
}
