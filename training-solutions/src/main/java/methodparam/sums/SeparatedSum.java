package methodparam.sums;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SeparatedSum {
    public double[] sum(String floatingNumbers) throws IOException {
        String s = floatingNumbers.replace(",", ".");
        String[] doubles = s.split(";");
        double[] sums = new double[2];
        for (int i = 0; i < doubles.length; i++) {
            if (Double.parseDouble(doubles[i]) < 0) {
                sums[0] += Double.parseDouble(doubles[i]);
            } else sums[1] += Double.parseDouble(doubles[i]);
        }
        return sums;
    }

    public String readFileIn() throws IOException {
        String s = Files.readString(Path.of("src/main/resources/floatingnumbers.txt"));
        return s;
    }
}
