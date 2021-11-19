package introexceptioncause;

import java.util.List;

public class Tracking {
    public static void main(String[] args) {
        List<String> gps = new TrackPoints().readIn();
        new TrackPoints().showDifferences(gps);
    }
}
