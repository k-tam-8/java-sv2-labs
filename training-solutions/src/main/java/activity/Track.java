package activity;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Track {
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint tp) {
        trackPoints.add(tp);
    }

    public List<TrackPoint> getTrackPoints() {
        return new ArrayList<>(trackPoints);
    }

    public void loadFromGpx(Path path) throws IOException {
        List<String> fromFile = Files.readAllLines(path);
        Coordinate coordToList = null;
        for (String s : fromFile) {
            TrackPoint tpToList;
            if (s.trim().startsWith("<trkpt")) {
                coordToList = new Coordinate(Double.parseDouble(s.trim().substring(12, 22)), Double.parseDouble(s.trim().substring(29, 39)));
            }
            if (s.trim().startsWith("<ele")) {
                trackPoints.add(new TrackPoint(coordToList, Double.parseDouble(s.trim().substring(5, 10))));
            }
        }
    }

    public Coordinate findMinimumCoordinate() {
        double minLat = Integer.MAX_VALUE;
        double minlong = Integer.MAX_VALUE;
        for (TrackPoint tp : trackPoints) {
            if (tp.getCoordinate().getLongitude() < minlong) {
                minlong = tp.getCoordinate().getLongitude();
            }
            if (tp.getCoordinate().getLatitude() < minLat) {
                minLat = tp.getCoordinate().getLatitude();
            }
        }
        return new Coordinate(minLat, minlong);
    }

    public Coordinate findMaximumCoordinate() {
        double maxLat = Integer.MIN_VALUE;
        double maxlong = Integer.MIN_VALUE;
        for (TrackPoint tp : trackPoints) {
            if (tp.getCoordinate().getLongitude() > maxlong) {
                maxlong = tp.getCoordinate().getLongitude();
            }
            if (tp.getCoordinate().getLatitude() > maxLat) {
                maxLat = tp.getCoordinate().getLatitude();
            }
        }
        return new Coordinate(maxLat, maxlong);
    }

    public double getDistance() {
        double fullDist = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            fullDist += trackPoints.get(i).getDistanceFrom(trackPoints.get(i + 1));
        }
        return fullDist;
    }

    public double getFullDecrease() {
        double fullDec = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            if (trackPoints.get(i).getElevation() > trackPoints.get(i + 1).getElevation()) {
                fullDec += trackPoints.get(i).getElevation() - trackPoints.get(i + 1).getElevation();
            }
        }
        return fullDec;
    }

    public double getFullElevation() {
        double fullEle = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            if (trackPoints.get(i).getElevation() < trackPoints.get(i + 1).getElevation()) {
                fullEle += trackPoints.get(i + 1).getElevation() - trackPoints.get(i).getElevation();
            }
        }
        return fullEle;
    }

    public double getRectangleArea() {
        double minWidth = Integer.MAX_VALUE;
        double minHeight = Integer.MAX_VALUE;
        double maxWidth = Integer.MIN_VALUE;
        double maxHeight = Integer.MIN_VALUE;
        for (TrackPoint tp : trackPoints) {
            if (tp.getCoordinate().getLongitude() < minWidth) {
                minWidth = tp.getCoordinate().getLongitude();
            }
            if (tp.getCoordinate().getLatitude() < minHeight) {
                minHeight = tp.getCoordinate().getLatitude();
            }
            if (tp.getCoordinate().getLongitude() > maxWidth) {
                maxWidth = tp.getCoordinate().getLongitude();
            }
            if (tp.getCoordinate().getLatitude() > maxHeight) {
                maxHeight = tp.getCoordinate().getLatitude();
            }
        }
        return (maxHeight - minHeight) * (maxWidth - minWidth);
    }
}
