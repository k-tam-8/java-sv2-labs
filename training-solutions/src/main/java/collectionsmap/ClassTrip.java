package collectionsmap;

import formatlocaleprintf.Run;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class ClassTrip {
    private Map<String, Integer> moneyIn = new HashMap<>();

    public Map<String, Integer> getMoneyIn() {
        return new HashMap<>(moneyIn);
    }

    public void loadInpayments(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tmpArr = line.split(":");
                moneyIn.put(tmpArr[0].trim(), Integer.parseInt(tmpArr[1].trim()));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot reach file", e);
        }
    }
}
