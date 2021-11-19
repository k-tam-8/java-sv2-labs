package introexceptioncheckedtrace;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Underground {
    public static void main(String[] args) {
        List<String> undergroundCars = new ArrayList<>();
        try {
           undergroundCars = new Operations().readFile();
        } catch (IOException ioe) {
            System.out.println("Nem megfelelő forrás");
            ioe.printStackTrace();
        }
        System.out.println(new Operations().getDailySchedule(undergroundCars));
    }
}
