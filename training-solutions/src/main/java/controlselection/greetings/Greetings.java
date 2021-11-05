package controlselection.greetings;

import java.time.LocalTime;

public class Greetings {
    public String greets(int hour, int min) {
        LocalTime hourMin = LocalTime.of(hour, min);
        if (hourMin.isBefore(LocalTime.of(5, 0))) {
            return "Jó éjt";
        } else if (hourMin.isBefore(LocalTime.of(9, 0))) {
            return "Jó reggelt";
        } else if (hourMin.isBefore(LocalTime.of(18, 30))) {
            return "Jó napot";
        } else if (hourMin.isBefore(LocalTime.of(20, 00))) {
            return "Jó estét";
        } else return "Jó éjt";
    }

    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        System.out.println(greetings.greets(4, 12));
        System.out.println(greetings.greets(6, 12));
        System.out.println(greetings.greets(18, 12));
        System.out.println(greetings.greets(19, 12));
        System.out.println(greetings.greets(21, 12));
    }
}
