package exceptionclass.course;

public class SimpleTime {
    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        if (hour < 0 || hour > 23) {
            throw new InvalideTimeException("Hour is invalid (0-23)", hour, minute);
        }
        if (minute < 0 || minute > 59) {
            throw new InvalideTimeException("Minute is invalid (0-59)", hour, minute);
        }
        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String hourAndMinute) {
        if (hourAndMinute == null) {
            throw new InvalideTimeException("Time is null");
        }

        if (hourAndMinute.charAt(1) != ':' && hourAndMinute.charAt(2) != ':') {
            throw new InvalideTimeException("Time is not hh:mm");
        }

        String[] hourAndMinuteArray = hourAndMinute.split(":");

        for (int i = 0; i < 2; i++) {
            for (Character c : hourAndMinuteArray[i].toCharArray()) {
                if (!Character.isDigit(c)) {
                    throw new InvalideTimeException("Time is not hh:mm");
                }
            }
        }
        if (Integer.parseInt(hourAndMinuteArray[0]) < 0 || Integer.parseInt(hourAndMinuteArray[0]) > 23) {
            throw new InvalideTimeException("Hour is invalid (0-23)", hour, minute);
        }
        if (Integer.parseInt(hourAndMinuteArray[1]) < 0 || Integer.parseInt(hourAndMinuteArray[1]) > 59) {
            throw new InvalideTimeException("Minute is invalid (0-59)", hour, minute);
        }
        this.hour = Integer.parseInt(hourAndMinuteArray[0]);
        this.minute = Integer.parseInt(hourAndMinuteArray[1]);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");

        if (Integer.toString(hour).length() == 1) {
            sb.append("0").append(hour);
        } else sb.append(hour);
        sb.append(":");
        if (Integer.toString(minute).length() == 1) {
            sb.append("0").append(minute);
        } else sb.append(minute);

        return sb.toString();
    }
}
