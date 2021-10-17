package statements;

import java.util.Scanner;

public class Timemain {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Első időpont óra: ");
        int hours = scanIn.nextInt();
        System.out.print("Első időpont perc: ");
        int minutes = scanIn.nextInt();
        System.out.print("Első időpont másodperc: ");
        int seconds = scanIn.nextInt();
        Time time = new Time(hours,minutes,seconds);
        System.out.print("Második időpont óra: ");
        hours = scanIn.nextInt();
        System.out.print("Második időpont perc: ");
        minutes = scanIn.nextInt();
        System.out.print("Második időpont másodperc: ");
        seconds = scanIn.nextInt();
        Time time2 = new Time(hours,minutes,seconds);

        System.out.println("Az első időpont: " + time.toString() + " = " + time.getInMinutes() + " perc");
        System.out.println("A második időpont: " + time2.toString() + " = " + time2.getInSeconds() + " másodperc");
        System.out.println("Az első korábbi, mint a második fele: " + time.earlierThen(time2));


    }
}
