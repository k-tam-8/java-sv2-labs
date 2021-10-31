package formatlocaleprintf;

import javax.sound.sampled.DataLine;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Run {
    private String user;
    private List<Double> kmsList;

    public Run(String user) {
        this.user = user;
        this.kmsList = new ArrayList<>();
    }

    public void addRun(double km) {
        this.kmsList.add(km);
    }

    public String printFormattedRunText() {
        double i=0;
        for (double f:kmsList){
            i+=f;
        }
        String today= LocalDate.now().toString();
        return String.format("Kedves %s! A mai dátum: %s. " +
                "Ezen a héten ez a(z) %d. futásod. Most %4.1f km-t futottál. Csak így tovább!",user,today,kmsList.size(),i);
    }

    public static void main(String[] args) {
        Run run = new Run("Béla");
        run.addRun(13.2);
        run.addRun(9.5);
        run.addRun(4.7);
        run.addRun(23.9);
        System.out.println(run.printFormattedRunText());
    }
}
