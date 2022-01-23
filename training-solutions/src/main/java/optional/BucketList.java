package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BucketList {

    private List<Destination> destinationList = new ArrayList<>();

    public Optional<Destination> getDestinationWithKeyword(String keyword) {
        Optional<Destination> newDestination = Optional.empty();
        for (Destination d : destinationList) {
            if (d.getDescription().contains(keyword)) {
                newDestination = Optional.of(d);
                return newDestination;
            }
            ;
        }
        return newDestination;
    }

    public Optional<Destination> getDestinationNearerThanGiven(int maxKm) {
        Optional<Destination> newDestination = Optional.empty();
        for (Destination d : destinationList) {
            if (d.getKmFromHome() < maxKm) {
                newDestination = Optional.of(d);
                return newDestination;
            }
            ;
        }
        return newDestination;
    }
}
