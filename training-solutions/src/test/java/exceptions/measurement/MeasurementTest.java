package exceptions.measurement;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {
    @Test
    void testValidate() {
        Measurement measurement = new Measurement();
        List<String> measures = measurement.readFromFile(Paths.get("src/main/resources/measurementdata.csv"));
        List<String> errorList = measurement.validate(measures);
        for (String s : errorList){
            System.out.println(s);
        }
    }
}