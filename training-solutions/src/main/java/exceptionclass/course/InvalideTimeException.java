package exceptionclass.course;

public class InvalideTimeException extends RuntimeException{
    private int hour;
    private int minute;

    public InvalideTimeException(String message, int hour, int minute) {
        super(message);
        this.hour = hour;
        this.minute = minute;
    }

    public InvalideTimeException(String message) {
        super(message);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
